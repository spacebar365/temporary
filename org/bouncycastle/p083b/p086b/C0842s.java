package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0842s extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3547a;

    /* JADX INFO: renamed from: b */
    private int f3548b;

    /* JADX INFO: renamed from: c */
    private int f3549c;

    /* JADX INFO: renamed from: d */
    private int f3550d;

    /* JADX INFO: renamed from: e */
    private int f3551e;

    /* JADX INFO: renamed from: f */
    private int[] f3552f;

    /* JADX INFO: renamed from: g */
    private int f3553g;

    public C0842s() {
        this.f3552f = new int[80];
        mo1931c();
    }

    public C0842s(C0842s c0842s) {
        super(c0842s);
        this.f3552f = new int[80];
        m2089a(c0842s);
    }

    /* JADX INFO: renamed from: a */
    private static int m2088a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private void m2089a(C0842s c0842s) {
        this.f3547a = c0842s.f3547a;
        this.f3548b = c0842s.f3548b;
        this.f3549c = c0842s.f3549c;
        this.f3550d = c0842s.f3550d;
        this.f3551e = c0842s.f3551e;
        System.arraycopy(c0842s.f3552f, 0, this.f3552f, 0, c0842s.f3552f.length);
        this.f3553g = c0842s.f3553g;
    }

    /* JADX INFO: renamed from: b */
    private static int m2090b(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        AbstractC1556g.m4136a(this.f3547a, bArr, i);
        AbstractC1556g.m4136a(this.f3548b, bArr, i + 4);
        AbstractC1556g.m4136a(this.f3549c, bArr, i + 8);
        AbstractC1556g.m4136a(this.f3550d, bArr, i + 12);
        AbstractC1556g.m4136a(this.f3551e, bArr, i + 16);
        mo1931c();
        return 20;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3553g > 14) {
            mo1942g();
        }
        this.f3552f[14] = (int) (j >>> 32);
        this.f3552f[15] = (int) j;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        C0842s c0842s = (C0842s) interfaceC1554e;
        super.m2016a((AbstractC0831h) c0842s);
        m2089a(c0842s);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 20;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.f3552f[this.f3553g] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        int i5 = this.f3553g + 1;
        this.f3553g = i5;
        if (i5 == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3547a = 1732584193;
        this.f3548b = -271733879;
        this.f3549c = -1732584194;
        this.f3550d = 271733878;
        this.f3551e = -1009589776;
        this.f3553g = 0;
        for (int i = 0; i != this.f3552f.length; i++) {
            this.f3552f[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0842s(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        for (int i = 16; i < 80; i++) {
            int i2 = ((this.f3552f[i - 3] ^ this.f3552f[i - 8]) ^ this.f3552f[i - 14]) ^ this.f3552f[i - 16];
            this.f3552f[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iM2088a = this.f3547a;
        int iM2090b = this.f3548b;
        int i3 = this.f3549c;
        int i4 = this.f3550d;
        int i5 = this.f3551e;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = i6 + 1;
            int iM2088a2 = this.f3552f[i6] + ((iM2088a << 5) | (iM2088a >>> 27)) + m2088a(iM2090b, i3, i4) + 1518500249 + i5;
            int i9 = (iM2090b >>> 2) | (iM2090b << 30);
            int i10 = i8 + 1;
            int iM2088a3 = i4 + ((iM2088a2 << 5) | (iM2088a2 >>> 27)) + m2088a(iM2088a, i9, i3) + this.f3552f[i8] + 1518500249;
            int i11 = (iM2088a >>> 2) | (iM2088a << 30);
            int i12 = i10 + 1;
            int iM2088a4 = i3 + ((iM2088a3 << 5) | (iM2088a3 >>> 27)) + m2088a(iM2088a2, i11, i9) + this.f3552f[i10] + 1518500249;
            i5 = (iM2088a2 << 30) | (iM2088a2 >>> 2);
            int i13 = i12 + 1;
            iM2090b = i9 + ((iM2088a4 << 5) | (iM2088a4 >>> 27)) + m2088a(iM2088a3, i5, i11) + this.f3552f[i12] + 1518500249;
            i4 = (iM2088a3 >>> 2) | (iM2088a3 << 30);
            i6 = i13 + 1;
            iM2088a = i11 + m2088a(iM2088a4, i4, i5) + ((iM2090b << 5) | (iM2090b >>> 27)) + this.f3552f[i13] + 1518500249;
            i3 = (iM2088a4 >>> 2) | (iM2088a4 << 30);
        }
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i6 + 1;
            int i16 = this.f3552f[i6] + ((iM2088a << 5) | (iM2088a >>> 27)) + ((iM2090b ^ i3) ^ i4) + 1859775393 + i5;
            int i17 = (iM2090b >>> 2) | (iM2090b << 30);
            int i18 = i15 + 1;
            int i19 = i4 + ((i16 << 5) | (i16 >>> 27)) + ((iM2088a ^ i17) ^ i3) + this.f3552f[i15] + 1859775393;
            int i20 = (iM2088a >>> 2) | (iM2088a << 30);
            int i21 = i18 + 1;
            int i22 = i3 + ((i19 << 5) | (i19 >>> 27)) + ((i16 ^ i20) ^ i17) + this.f3552f[i18] + 1859775393;
            i5 = (i16 << 30) | (i16 >>> 2);
            int i23 = i21 + 1;
            iM2090b = i17 + ((i22 << 5) | (i22 >>> 27)) + ((i19 ^ i5) ^ i20) + this.f3552f[i21] + 1859775393;
            i4 = (i19 >>> 2) | (i19 << 30);
            i6 = i23 + 1;
            iM2088a = i20 + ((i22 ^ i4) ^ i5) + ((iM2090b << 5) | (iM2090b >>> 27)) + this.f3552f[i23] + 1859775393;
            i3 = (i22 >>> 2) | (i22 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int i25 = i6 + 1;
            int iM2090b2 = ((this.f3552f[i6] + (((iM2088a << 5) | (iM2088a >>> 27)) + m2090b(iM2090b, i3, i4))) - 1894007588) + i5;
            int iM2090b3 = i4 + (((((iM2090b2 << 5) | (iM2090b2 >>> 27)) + m2090b(iM2088a, r6, i3)) + this.f3552f[i25]) - 1894007588);
            int iM2090b4 = i3 + (((((iM2090b3 << 5) | (iM2090b3 >>> 27)) + m2090b(iM2090b2, r7, r6)) + this.f3552f[r9]) - 1894007588);
            i5 = (iM2090b2 << 30) | (iM2090b2 >>> 2);
            iM2090b = ((iM2090b >>> 2) | (iM2090b << 30)) + (((((iM2090b4 << 5) | (iM2090b4 >>> 27)) + m2090b(iM2090b3, i5, r7)) + this.f3552f[r10]) - 1894007588);
            i4 = (iM2090b3 >>> 2) | (iM2090b3 << 30);
            int iM2090b5 = m2090b(iM2090b4, i4, i5) + ((iM2090b << 5) | (iM2090b >>> 27));
            i6 = i25 + 1 + 1 + 1 + 1;
            iM2088a = ((iM2088a >>> 2) | (iM2088a << 30)) + ((iM2090b5 + this.f3552f[r9]) - 1894007588);
            i3 = (iM2090b4 >>> 2) | (iM2090b4 << 30);
        }
        for (int i26 = 0; i26 <= 3; i26++) {
            int i27 = i6 + 1;
            int i28 = ((this.f3552f[i6] + (((iM2088a << 5) | (iM2088a >>> 27)) + ((iM2090b ^ i3) ^ i4))) - 899497514) + i5;
            int i29 = i4 + (((((i28 << 5) | (i28 >>> 27)) + ((iM2088a ^ r6) ^ i3)) + this.f3552f[i27]) - 899497514);
            int i30 = i3 + (((((i29 << 5) | (i29 >>> 27)) + ((i28 ^ r7) ^ r6)) + this.f3552f[r9]) - 899497514);
            i5 = (i28 << 30) | (i28 >>> 2);
            iM2090b = ((iM2090b >>> 2) | (iM2090b << 30)) + (((((i30 << 5) | (i30 >>> 27)) + ((i29 ^ i5) ^ r7)) + this.f3552f[r10]) - 899497514);
            i4 = (i29 >>> 2) | (i29 << 30);
            int i31 = ((i30 ^ i4) ^ i5) + ((iM2090b << 5) | (iM2090b >>> 27));
            i6 = i27 + 1 + 1 + 1 + 1;
            iM2088a = ((iM2088a >>> 2) | (iM2088a << 30)) + ((i31 + this.f3552f[r9]) - 899497514);
            i3 = (i30 >>> 2) | (i30 << 30);
        }
        this.f3547a += iM2088a;
        this.f3548b += iM2090b;
        this.f3549c += i3;
        this.f3550d += i4;
        this.f3551e += i5;
        this.f3553g = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.f3552f[i32] = 0;
        }
    }
}
