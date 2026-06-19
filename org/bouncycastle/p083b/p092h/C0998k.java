package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.h.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0998k implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f4119a;

    /* JADX INFO: renamed from: b */
    private int f4120b;

    /* JADX INFO: renamed from: c */
    private byte[] f4121c = new byte[64];

    /* JADX INFO: renamed from: d */
    private byte[] f4122d = new byte[64];

    public C0998k(InterfaceC1175r interfaceC1175r) {
        this.f4119a = interfaceC1175r;
        this.f4120b = interfaceC1175r.mo1930b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.f4120b];
        this.f4119a.mo1926a(bArr2, 0);
        this.f4119a.mo1929a(this.f4122d, 0, this.f4122d.length);
        this.f4119a.mo1929a(bArr2, 0, bArr2.length);
        int iMo1926a = this.f4119a.mo1926a(bArr, i);
        mo2452c();
        return iMo1926a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4119a.mo1927a() + "/HMAC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4119a.mo1928a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        this.f4119a.mo1931c();
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (bArrM2603a.length > 64) {
            this.f4119a.mo1929a(bArrM2603a, 0, bArrM2603a.length);
            this.f4119a.mo1926a(this.f4121c, 0);
            for (int i = this.f4120b; i < this.f4121c.length; i++) {
                this.f4121c[i] = 0;
            }
        } else {
            System.arraycopy(bArrM2603a, 0, this.f4121c, 0, bArrM2603a.length);
            for (int length = bArrM2603a.length; length < this.f4121c.length; length++) {
                this.f4121c[length] = 0;
            }
        }
        this.f4122d = new byte[this.f4121c.length];
        System.arraycopy(this.f4121c, 0, this.f4122d, 0, this.f4121c.length);
        for (int i2 = 0; i2 < this.f4121c.length; i2++) {
            byte[] bArr = this.f4121c;
            bArr[i2] = (byte) (bArr[i2] ^ 54);
        }
        for (int i3 = 0; i3 < this.f4122d.length; i3++) {
            byte[] bArr2 = this.f4122d;
            bArr2[i3] = (byte) (bArr2[i3] ^ 92);
        }
        this.f4119a.mo1929a(this.f4121c, 0, this.f4121c.length);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        this.f4119a.mo1929a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4120b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4119a.mo1931c();
        this.f4119a.mo1929a(this.f4121c, 0, this.f4121c.length);
    }
}
