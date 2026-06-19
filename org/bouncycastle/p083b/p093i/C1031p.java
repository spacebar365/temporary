package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1031p extends AbstractC0814an {

    /* JADX INFO: renamed from: a */
    private byte[] f4299a;

    /* JADX INFO: renamed from: b */
    private byte[] f4300b;

    /* JADX INFO: renamed from: c */
    private byte[] f4301c;

    /* JADX INFO: renamed from: d */
    private int f4302d;

    /* JADX INFO: renamed from: e */
    private boolean f4303e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0890e f4304f;

    public C1031p(InterfaceC0890e interfaceC0890e) {
        super(interfaceC0890e);
        this.f4304f = interfaceC0890e;
        this.f4299a = new byte[interfaceC0890e.mo2125b()];
        this.f4300b = new byte[interfaceC0890e.mo2125b()];
        this.f4301c = new byte[interfaceC0890e.mo2125b()];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length - i < mo2125b()) {
            throw new C1163o("input buffer too short");
        }
        if (bArr2.length - i2 < mo2125b()) {
            throw new C0803ac("output buffer too short");
        }
        mo1909a(bArr, i, mo2125b(), bArr2, i2);
        return mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return this.f4304f.mo2123a() + "/KCTR";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4303e = true;
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException("invalid parameter passed");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        int length = this.f4299a.length - bArrM2611a.length;
        C1535a.m4071a(this.f4299a, (byte) 0);
        System.arraycopy(bArrM2611a, 0, this.f4299a, length, bArrM2611a.length);
        InterfaceC1003i interfaceC1003iM2612b = c1080be.m2612b();
        if (interfaceC1003iM2612b != null) {
            this.f4304f.mo2124a(true, interfaceC1003iM2612b);
        }
        mo1913c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4304f.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        if (this.f4303e) {
            this.f4304f.mo2122a(this.f4299a, 0, this.f4300b, 0);
        }
        this.f4304f.mo2126c();
        this.f4302d = 0;
    }

    @Override // org.bouncycastle.p083b.AbstractC0814an
    /* JADX INFO: renamed from: a */
    protected final byte mo1908a(byte b) {
        if (this.f4302d != 0) {
            byte[] bArr = this.f4301c;
            int i = this.f4302d;
            this.f4302d = i + 1;
            byte b2 = (byte) (bArr[i] ^ b);
            if (this.f4302d != this.f4300b.length) {
                return b2;
            }
            this.f4302d = 0;
            return b2;
        }
        int i2 = 0;
        while (i2 < this.f4300b.length) {
            byte[] bArr2 = this.f4300b;
            int i3 = i2 + 1;
            byte b3 = (byte) (bArr2[i2] + 1);
            bArr2[i2] = b3;
            if (b3 != 0) {
                break;
            }
            i2 = i3;
        }
        this.f4304f.mo2122a(this.f4300b, 0, this.f4301c, 0);
        byte[] bArr3 = this.f4301c;
        int i4 = this.f4302d;
        this.f4302d = i4 + 1;
        return (byte) (bArr3[i4] ^ b);
    }
}
