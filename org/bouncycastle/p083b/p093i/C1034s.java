package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.i.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1034s extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private int f4340a;

    /* JADX INFO: renamed from: b */
    private byte[] f4341b;

    /* JADX INFO: renamed from: c */
    private byte[] f4342c;

    /* JADX INFO: renamed from: d */
    private byte[] f4343d;

    /* JADX INFO: renamed from: e */
    private final int f4344e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0890e f4345f;

    public C1034s(InterfaceC0890e interfaceC0890e, int i) {
        super(interfaceC0890e);
        this.f4345f = interfaceC0890e;
        this.f4344e = i / 8;
        this.f4341b = new byte[interfaceC0890e.mo2125b()];
        this.f4342c = new byte[interfaceC0890e.mo2125b()];
        this.f4343d = new byte[interfaceC0890e.mo2125b()];
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4340a == 0) {
            this.f4345f.mo2122a(this.f4342c, 0, this.f4343d, 0);
        }
        byte[] bArr = this.f4343d;
        int i = this.f4340a;
        this.f4340a = i + 1;
        byte b2 = (byte) (bArr[i] ^ b);
        if (this.f4340a == this.f4344e) {
            this.f4340a = 0;
            System.arraycopy(this.f4342c, this.f4344e, this.f4342c, 0, this.f4342c.length - this.f4344e);
            System.arraycopy(this.f4343d, 0, this.f4342c, this.f4342c.length - this.f4344e, this.f4344e);
        }
        return b2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        mo1909a(bArr, i, this.f4344e, bArr2, i2);
        return this.f4344e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4345f.mo2123a() + "/OFB" + (this.f4344e * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            mo1913c();
            if (interfaceC1003i != null) {
                this.f4345f.mo2124a(true, interfaceC1003i);
                return;
            }
            return;
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a.length < this.f4341b.length) {
            System.arraycopy(bArrM2611a, 0, this.f4341b, this.f4341b.length - bArrM2611a.length, bArrM2611a.length);
            for (int i = 0; i < this.f4341b.length - bArrM2611a.length; i++) {
                this.f4341b[i] = 0;
            }
        } else {
            System.arraycopy(bArrM2611a, 0, this.f4341b, 0, this.f4341b.length);
        }
        mo1913c();
        if (c1080be.m2612b() != null) {
            this.f4345f.mo2124a(true, c1080be.m2612b());
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4344e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        System.arraycopy(this.f4341b, 0, this.f4342c, 0, this.f4341b.length);
        this.f4340a = 0;
        this.f4345f.mo2126c();
    }
}
