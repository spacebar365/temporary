package org.bouncycastle.p083b;

/* JADX INFO: renamed from: org.bouncycastle.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C0950f {

    /* JADX INFO: renamed from: a */
    protected byte[] f3986a;

    /* JADX INFO: renamed from: b */
    protected int f3987b;

    /* JADX INFO: renamed from: c */
    protected boolean f3988c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC0890e f3989d;

    /* JADX INFO: renamed from: e */
    protected boolean f3990e;

    /* JADX INFO: renamed from: f */
    protected boolean f3991f;

    protected C0950f() {
    }

    public C0950f(InterfaceC0890e interfaceC0890e) {
        boolean z = true;
        this.f3989d = interfaceC0890e;
        this.f3986a = new byte[interfaceC0890e.mo2125b()];
        this.f3987b = 0;
        String strMo2123a = interfaceC0890e.mo2123a();
        int iIndexOf = strMo2123a.indexOf(47) + 1;
        this.f3991f = iIndexOf > 0 && strMo2123a.startsWith("PGP", iIndexOf);
        if (!this.f3991f && !(interfaceC0890e instanceof InterfaceC0815ao) && (iIndexOf <= 0 || !strMo2123a.startsWith("OpenPGP", iIndexOf))) {
            z = false;
        }
        this.f3990e = z;
    }

    /* JADX INFO: renamed from: a */
    public int mo2399a(int i) {
        int i2 = i + this.f3987b;
        int length = (this.f3991f && this.f3988c) ? (i2 % this.f3986a.length) - (this.f3989d.mo2125b() + 2) : i2 % this.f3986a.length;
        return i2 - length;
    }

    /* JADX INFO: renamed from: a */
    public int mo2400a(byte[] bArr, int i) {
        int i2 = 0;
        try {
            if (this.f3987b + i > bArr.length) {
                throw new C0803ac("output buffer too short for doFinal()");
            }
            if (this.f3987b != 0) {
                if (!this.f3990e) {
                    throw new C1163o("data not block size aligned");
                }
                this.f3989d.mo2122a(this.f3986a, 0, this.f3986a, 0);
                i2 = this.f3987b;
                this.f3987b = 0;
                System.arraycopy(this.f3986a, 0, bArr, i, i2);
            }
            return i2;
        } finally {
            m2406c();
        }
    }

    /* JADX INFO: renamed from: a */
    public int mo2401a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iMo2122a;
        int i4;
        int i5;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iM2404b = m2404b();
        int iMo2399a = mo2399a(i2);
        if (iMo2399a > 0 && iMo2399a + i3 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        int length = this.f3986a.length - this.f3987b;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.f3986a, this.f3987b, length);
            iMo2122a = this.f3989d.mo2122a(this.f3986a, 0, bArr2, i3) + 0;
            this.f3987b = 0;
            i4 = i2 - length;
            i5 = length + i;
            while (i4 > this.f3986a.length) {
                iMo2122a += this.f3989d.mo2122a(bArr, i5, bArr2, i3 + iMo2122a);
                i4 -= iM2404b;
                i5 += iM2404b;
            }
        } else {
            iMo2122a = 0;
            i4 = i2;
            i5 = i;
        }
        System.arraycopy(bArr, i5, this.f3986a, this.f3987b, i4);
        this.f3987b = i4 + this.f3987b;
        if (this.f3987b != this.f3986a.length) {
            return iMo2122a;
        }
        int iMo2122a2 = iMo2122a + this.f3989d.mo2122a(this.f3986a, 0, bArr2, i3 + iMo2122a);
        this.f3987b = 0;
        return iMo2122a2;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e m2402a() {
        return this.f3989d;
    }

    /* JADX INFO: renamed from: a */
    public void mo2403a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3988c = z;
        m2406c();
        this.f3989d.mo2124a(z, interfaceC1003i);
    }

    /* JADX INFO: renamed from: b */
    public final int m2404b() {
        return this.f3989d.mo2125b();
    }

    /* JADX INFO: renamed from: b */
    public int mo2405b(int i) {
        return this.f3987b + i;
    }

    /* JADX INFO: renamed from: c */
    public final void m2406c() {
        for (int i = 0; i < this.f3986a.length; i++) {
            this.f3986a[i] = 0;
        }
        this.f3987b = 0;
        this.f3989d.mo2126c();
    }
}
