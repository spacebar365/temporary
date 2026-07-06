package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class s extends h {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int[] f;
    private int g;

    public s() {
        this.f = new int[80];
        c();
    }

    public s(s sVar) {
        super(sVar);
        this.f = new int[80];
        a(sVar);
    }

    private static int a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    private void a(s sVar) {
        this.a = sVar.a;
        this.b = sVar.b;
        this.c = sVar.c;
        this.d = sVar.d;
        this.e = sVar.e;
        System.arraycopy(sVar.f, 0, this.f, 0, sVar.f.length);
        this.g = sVar.g;
    }

    private static int b(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        org.bouncycastle.f.g.a(this.a, bArr, i);
        org.bouncycastle.f.g.a(this.b, bArr, i + 4);
        org.bouncycastle.f.g.a(this.c, bArr, i + 8);
        org.bouncycastle.f.g.a(this.d, bArr, i + 12);
        org.bouncycastle.f.g.a(this.e, bArr, i + 16);
        c();
        return 20;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.b.b.h
    protected final void a(long j) {
        if (this.g > 14) {
            g();
        }
        this.f[14] = (int) (j >>> 32);
        this.f[15] = (int) j;
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        s sVar = (s) eVar;
        super.a((h) sVar);
        a(sVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 20;
    }

    @Override // org.bouncycastle.b.b.h
    protected final void b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.f[this.g] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        int i5 = this.g + 1;
        this.g = i5;
        if (i5 == 16) {
            g();
        }
    }

    @Override // org.bouncycastle.b.b.h, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.a = 1732584193;
        this.b = -271733879;
        this.c = -1732584194;
        this.d = 271733878;
        this.e = -1009589776;
        this.g = 0;
        for (int i = 0; i != this.f.length; i++) {
            this.f[i] = 0;
        }
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new s(this);
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        for (int i = 16; i < 80; i++) {
            int i2 = ((this.f[i - 3] ^ this.f[i - 8]) ^ this.f[i - 14]) ^ this.f[i - 16];
            this.f[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iA = this.a;
        int iB = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = i6 + 1;
            int iA2 = this.f[i6] + ((iA << 5) | (iA >>> 27)) + a(iB, i3, i4) + 1518500249 + i5;
            int i9 = (iB >>> 2) | (iB << 30);
            int i10 = i8 + 1;
            int iA3 = i4 + ((iA2 << 5) | (iA2 >>> 27)) + a(iA, i9, i3) + this.f[i8] + 1518500249;
            int i11 = (iA >>> 2) | (iA << 30);
            int i12 = i10 + 1;
            int iA4 = i3 + ((iA3 << 5) | (iA3 >>> 27)) + a(iA2, i11, i9) + this.f[i10] + 1518500249;
            i5 = (iA2 << 30) | (iA2 >>> 2);
            int i13 = i12 + 1;
            iB = i9 + ((iA4 << 5) | (iA4 >>> 27)) + a(iA3, i5, i11) + this.f[i12] + 1518500249;
            i4 = (iA3 >>> 2) | (iA3 << 30);
            i6 = i13 + 1;
            iA = i11 + a(iA4, i4, i5) + ((iB << 5) | (iB >>> 27)) + this.f[i13] + 1518500249;
            i3 = (iA4 >>> 2) | (iA4 << 30);
        }
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i6 + 1;
            int i16 = this.f[i6] + ((iA << 5) | (iA >>> 27)) + ((iB ^ i3) ^ i4) + 1859775393 + i5;
            int i17 = (iB >>> 2) | (iB << 30);
            int i18 = i15 + 1;
            int i19 = i4 + ((i16 << 5) | (i16 >>> 27)) + ((iA ^ i17) ^ i3) + this.f[i15] + 1859775393;
            int i20 = (iA >>> 2) | (iA << 30);
            int i21 = i18 + 1;
            int i22 = i3 + ((i19 << 5) | (i19 >>> 27)) + ((i16 ^ i20) ^ i17) + this.f[i18] + 1859775393;
            i5 = (i16 << 30) | (i16 >>> 2);
            int i23 = i21 + 1;
            iB = i17 + ((i22 << 5) | (i22 >>> 27)) + ((i19 ^ i5) ^ i20) + this.f[i21] + 1859775393;
            i4 = (i19 >>> 2) | (i19 << 30);
            i6 = i23 + 1;
            iA = i20 + ((i22 ^ i4) ^ i5) + ((iB << 5) | (iB >>> 27)) + this.f[i23] + 1859775393;
            i3 = (i22 >>> 2) | (i22 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int i25 = i6 + 1;
            int iB2 = ((this.f[i6] + (((iA << 5) | (iA >>> 27)) + b(iB, i3, i4))) - 1894007588) + i5;
            int iB3 = i4 + (((((iB2 << 5) | (iB2 >>> 27)) + b(iA, r6, i3)) + this.f[i25]) - 1894007588);
            int iB4 = i3 + (((((iB3 << 5) | (iB3 >>> 27)) + b(iB2, r7, r6)) + this.f[r9]) - 1894007588);
            i5 = (iB2 << 30) | (iB2 >>> 2);
            iB = ((iB >>> 2) | (iB << 30)) + (((((iB4 << 5) | (iB4 >>> 27)) + b(iB3, i5, r7)) + this.f[r10]) - 1894007588);
            i4 = (iB3 >>> 2) | (iB3 << 30);
            int iB5 = b(iB4, i4, i5) + ((iB << 5) | (iB >>> 27));
            i6 = i25 + 1 + 1 + 1 + 1;
            iA = ((iA >>> 2) | (iA << 30)) + ((iB5 + this.f[r9]) - 1894007588);
            i3 = (iB4 >>> 2) | (iB4 << 30);
        }
        for (int i26 = 0; i26 <= 3; i26++) {
            int i27 = i6 + 1;
            int i28 = ((this.f[i6] + (((iA << 5) | (iA >>> 27)) + ((iB ^ i3) ^ i4))) - 899497514) + i5;
            int i29 = i4 + (((((i28 << 5) | (i28 >>> 27)) + ((iA ^ r6) ^ i3)) + this.f[i27]) - 899497514);
            int i30 = i3 + (((((i29 << 5) | (i29 >>> 27)) + ((i28 ^ r7) ^ r6)) + this.f[r9]) - 899497514);
            i5 = (i28 << 30) | (i28 >>> 2);
            iB = ((iB >>> 2) | (iB << 30)) + (((((i30 << 5) | (i30 >>> 27)) + ((i29 ^ i5) ^ r7)) + this.f[r10]) - 899497514);
            i4 = (i29 >>> 2) | (i29 << 30);
            int i31 = ((i30 ^ i4) ^ i5) + ((iB << 5) | (iB >>> 27));
            i6 = i27 + 1 + 1 + 1 + 1;
            iA = ((iA >>> 2) | (iA << 30)) + ((i31 + this.f[r9]) - 899497514);
            i3 = (i30 >>> 2) | (i30 << 30);
        }
        this.a += iA;
        this.b += iB;
        this.c += i3;
        this.d += i4;
        this.e += i5;
        this.g = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.f[i32] = 0;
        }
    }
}
