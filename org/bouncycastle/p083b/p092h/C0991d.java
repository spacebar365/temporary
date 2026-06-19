package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p086b.C0826c;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.h.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0991d implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private C0826c f4080a;

    /* JADX INFO: renamed from: b */
    private int f4081b;

    /* JADX INFO: renamed from: c */
    private byte[] f4082c = null;

    /* JADX INFO: renamed from: d */
    private byte[] f4083d = null;

    /* JADX INFO: renamed from: e */
    private long f4084e;

    public C0991d(int i) {
        this.f4080a = new C0826c(i);
        this.f4081b = i / 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return "DSTU7564Mac";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4080a.mo1928a(b);
        this.f4084e++;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        if (bArr.length - i < i2) {
            throw new C1163o("Input buffer too short");
        }
        if (this.f4082c == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
        this.f4080a.mo1929a(bArr, i, i2);
        this.f4084e += (long) i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4081b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4084e = 0L;
        this.f4080a.mo1931c();
        if (this.f4082c != null) {
            this.f4080a.mo1929a(this.f4082c, 0, this.f4082c.length);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("Bad parameter passed");
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        this.f4083d = new byte[bArrM2603a.length];
        int length = (((bArrM2603a.length + this.f4080a.mo1932d()) - 1) / this.f4080a.mo1932d()) * this.f4080a.mo1932d();
        if (this.f4080a.mo1932d() - (bArrM2603a.length % this.f4080a.mo1932d()) < 13) {
            length += this.f4080a.mo1932d();
        }
        byte[] bArr = new byte[length];
        System.arraycopy(bArrM2603a, 0, bArr, 0, bArrM2603a.length);
        bArr[bArrM2603a.length] = -128;
        AbstractC1556g.m4147b(bArrM2603a.length * 8, bArr, bArr.length - 12);
        this.f4082c = bArr;
        for (int i = 0; i < this.f4083d.length; i++) {
            this.f4083d[i] = (byte) (bArrM2603a[i] ^ (-1));
        }
        this.f4080a.mo1929a(this.f4082c, 0, this.f4082c.length);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        if (this.f4082c == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
        if (bArr.length - i < this.f4081b) {
            throw new C0803ac("Output buffer too short");
        }
        int iMo1932d = this.f4080a.mo1932d() - ((int) (this.f4084e % ((long) this.f4080a.mo1932d())));
        if (iMo1932d < 13) {
            iMo1932d += this.f4080a.mo1932d();
        }
        byte[] bArr2 = new byte[iMo1932d];
        bArr2[0] = -128;
        AbstractC1556g.m4148b(this.f4084e * 8, bArr2, bArr2.length - 12);
        this.f4080a.mo1929a(bArr2, 0, bArr2.length);
        this.f4080a.mo1929a(this.f4083d, 0, this.f4083d.length);
        this.f4084e = 0L;
        return this.f4080a.mo1926a(bArr, i);
    }
}
