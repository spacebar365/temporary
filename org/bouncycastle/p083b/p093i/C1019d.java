package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1019d extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private byte[] f4191a;

    /* JADX INFO: renamed from: b */
    private byte[] f4192b;

    /* JADX INFO: renamed from: c */
    private byte[] f4193c;

    /* JADX INFO: renamed from: d */
    private byte[] f4194d;

    /* JADX INFO: renamed from: e */
    private int f4195e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0890e f4196f;

    /* JADX INFO: renamed from: g */
    private boolean f4197g;

    /* JADX INFO: renamed from: h */
    private int f4198h;

    public C1019d(InterfaceC0890e interfaceC0890e, int i) {
        super(interfaceC0890e);
        this.f4196f = null;
        this.f4196f = interfaceC0890e;
        this.f4195e = i / 8;
        this.f4191a = new byte[interfaceC0890e.mo2125b()];
        this.f4192b = new byte[interfaceC0890e.mo2125b()];
        this.f4193c = new byte[interfaceC0890e.mo2125b()];
        this.f4194d = new byte[this.f4195e];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4195e, bArr2, i2);
        return this.f4195e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4196f.mo2123a() + "/CFB" + (this.f4195e * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4197g = z;
        if (!(interfaceC1003i instanceof C1080be)) {
            mo1913c();
            if (interfaceC1003i != null) {
                this.f4196f.mo2124a(true, interfaceC1003i);
                return;
            }
            return;
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a.length < this.f4191a.length) {
            System.arraycopy(bArrM2611a, 0, this.f4191a, this.f4191a.length - bArrM2611a.length, bArrM2611a.length);
            for (int i = 0; i < this.f4191a.length - bArrM2611a.length; i++) {
                this.f4191a[i] = 0;
            }
        } else {
            System.arraycopy(bArrM2611a, 0, this.f4191a, 0, this.f4191a.length);
        }
        mo1913c();
        if (c1080be.m2612b() != null) {
            this.f4196f.mo2124a(true, c1080be.m2612b());
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4195e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        System.arraycopy(this.f4191a, 0, this.f4192b, 0, this.f4191a.length);
        C1535a.m4071a(this.f4194d, (byte) 0);
        this.f4198h = 0;
        this.f4196f.mo2126c();
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m2507e() {
        return C1535a.m4086b(this.f4192b);
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        byte b2;
        if (this.f4197g) {
            if (this.f4198h == 0) {
                this.f4196f.mo2122a(this.f4192b, 0, this.f4193c, 0);
            }
            b2 = (byte) (this.f4193c[this.f4198h] ^ b);
            byte[] bArr = this.f4194d;
            int i = this.f4198h;
            this.f4198h = i + 1;
            bArr[i] = b2;
            if (this.f4198h == this.f4195e) {
                this.f4198h = 0;
                System.arraycopy(this.f4192b, this.f4195e, this.f4192b, 0, this.f4192b.length - this.f4195e);
                System.arraycopy(this.f4194d, 0, this.f4192b, this.f4192b.length - this.f4195e, this.f4195e);
            }
        } else {
            if (this.f4198h == 0) {
                this.f4196f.mo2122a(this.f4192b, 0, this.f4193c, 0);
            }
            this.f4194d[this.f4198h] = b;
            byte[] bArr2 = this.f4193c;
            int i2 = this.f4198h;
            this.f4198h = i2 + 1;
            b2 = (byte) (bArr2[i2] ^ b);
            if (this.f4198h == this.f4195e) {
                this.f4198h = 0;
                System.arraycopy(this.f4192b, this.f4195e, this.f4192b, 0, this.f4192b.length - this.f4195e);
                System.arraycopy(this.f4194d, 0, this.f4192b, this.f4192b.length - this.f4195e, this.f4195e);
            }
        }
        return b2;
    }
}
