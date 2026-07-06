package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e;
    private int f;

    public l() {
        this.e = new int[16];
        c();
    }

    public l(l lVar) {
        super(lVar);
        this.e = new int[16];
        a(lVar);
    }

    private static int a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private static int a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void a(l lVar) {
        super.a((h) lVar);
        this.a = lVar.a;
        this.b = lVar.b;
        this.c = lVar.c;
        this.d = lVar.d;
        System.arraycopy(lVar.e, 0, this.e, 0, lVar.e.length);
        this.f = lVar.f;
    }

    private static int b(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        a(this.a, bArr, i);
        a(this.b, bArr, i + 4);
        a(this.c, bArr, i + 8);
        a(this.d, bArr, i + 12);
        c();
        return 16;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "MD4";
    }

    @Override // org.bouncycastle.b.b.h
    protected final void a(long j) {
        if (this.f > 14) {
            g();
        }
        this.e[14] = (int) ((-1) & j);
        this.e[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        a((l) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.b.h
    protected final void b(byte[] bArr, int i) {
        int[] iArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f == 16) {
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
        this.f = 0;
        for (int i = 0; i != this.e.length; i++) {
            this.e[i] = 0;
        }
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new l(this);
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int iA = a(i + a(i2, i3, i4) + this.e[0], 3);
        int iA2 = a(i4 + a(iA, i2, i3) + this.e[1], 7);
        int iA3 = a(i3 + a(iA2, iA, i2) + this.e[2], 11);
        int iA4 = a(i2 + a(iA3, iA2, iA) + this.e[3], 19);
        int iA5 = a(iA + a(iA4, iA3, iA2) + this.e[4], 3);
        int iA6 = a(iA2 + a(iA5, iA4, iA3) + this.e[5], 7);
        int iA7 = a(iA3 + a(iA6, iA5, iA4) + this.e[6], 11);
        int iA8 = a(iA4 + a(iA7, iA6, iA5) + this.e[7], 19);
        int iA9 = a(iA5 + a(iA8, iA7, iA6) + this.e[8], 3);
        int iA10 = a(iA6 + a(iA9, iA8, iA7) + this.e[9], 7);
        int iA11 = a(iA7 + a(iA10, iA9, iA8) + this.e[10], 11);
        int iA12 = a(iA8 + a(iA11, iA10, iA9) + this.e[11], 19);
        int iA13 = a(iA9 + a(iA12, iA11, iA10) + this.e[12], 3);
        int iA14 = a(iA10 + a(iA13, iA12, iA11) + this.e[13], 7);
        int iA15 = a(iA11 + a(iA14, iA13, iA12) + this.e[14], 11);
        int iA16 = a(iA12 + a(iA15, iA14, iA13) + this.e[15], 19);
        int iA17 = a(iA13 + b(iA16, iA15, iA14) + this.e[0] + 1518500249, 3);
        int iA18 = a(iA14 + b(iA17, iA16, iA15) + this.e[4] + 1518500249, 5);
        int iA19 = a(iA15 + b(iA18, iA17, iA16) + this.e[8] + 1518500249, 9);
        int iA20 = a(iA16 + b(iA19, iA18, iA17) + this.e[12] + 1518500249, 13);
        int iA21 = a(iA17 + b(iA20, iA19, iA18) + this.e[1] + 1518500249, 3);
        int iA22 = a(iA18 + b(iA21, iA20, iA19) + this.e[5] + 1518500249, 5);
        int iA23 = a(iA19 + b(iA22, iA21, iA20) + this.e[9] + 1518500249, 9);
        int iA24 = a(iA20 + b(iA23, iA22, iA21) + this.e[13] + 1518500249, 13);
        int iA25 = a(iA21 + b(iA24, iA23, iA22) + this.e[2] + 1518500249, 3);
        int iA26 = a(iA22 + b(iA25, iA24, iA23) + this.e[6] + 1518500249, 5);
        int iA27 = a(iA23 + b(iA26, iA25, iA24) + this.e[10] + 1518500249, 9);
        int iA28 = a(iA24 + b(iA27, iA26, iA25) + this.e[14] + 1518500249, 13);
        int iA29 = a(iA25 + b(iA28, iA27, iA26) + this.e[3] + 1518500249, 3);
        int iA30 = a(iA26 + b(iA29, iA28, iA27) + this.e[7] + 1518500249, 5);
        int iA31 = a(iA27 + b(iA30, iA29, iA28) + this.e[11] + 1518500249, 9);
        int iA32 = a(iA28 + b(iA31, iA30, iA29) + this.e[15] + 1518500249, 13);
        int iA33 = a(iA29 + ((iA32 ^ iA31) ^ iA30) + this.e[0] + 1859775393, 3);
        int iA34 = a(iA30 + ((iA33 ^ iA32) ^ iA31) + this.e[8] + 1859775393, 9);
        int iA35 = a(iA31 + ((iA34 ^ iA33) ^ iA32) + this.e[4] + 1859775393, 11);
        int iA36 = a(iA32 + ((iA35 ^ iA34) ^ iA33) + this.e[12] + 1859775393, 15);
        int iA37 = a(iA33 + ((iA36 ^ iA35) ^ iA34) + this.e[2] + 1859775393, 3);
        int iA38 = a(iA34 + ((iA37 ^ iA36) ^ iA35) + this.e[10] + 1859775393, 9);
        int iA39 = a(iA35 + ((iA38 ^ iA37) ^ iA36) + this.e[6] + 1859775393, 11);
        int iA40 = a(iA36 + ((iA39 ^ iA38) ^ iA37) + this.e[14] + 1859775393, 15);
        int iA41 = a(iA37 + ((iA40 ^ iA39) ^ iA38) + this.e[1] + 1859775393, 3);
        int iA42 = a(iA38 + ((iA41 ^ iA40) ^ iA39) + this.e[9] + 1859775393, 9);
        int iA43 = a(iA39 + ((iA42 ^ iA41) ^ iA40) + this.e[5] + 1859775393, 11);
        int iA44 = a(iA40 + ((iA43 ^ iA42) ^ iA41) + this.e[13] + 1859775393, 15);
        int iA45 = a(iA41 + ((iA44 ^ iA43) ^ iA42) + this.e[3] + 1859775393, 3);
        int iA46 = a(iA42 + ((iA45 ^ iA44) ^ iA43) + this.e[11] + 1859775393, 9);
        int iA47 = a(iA43 + ((iA46 ^ iA45) ^ iA44) + this.e[7] + 1859775393, 11);
        int iA48 = a(iA44 + ((iA47 ^ iA46) ^ iA45) + this.e[15] + 1859775393, 15);
        this.a = iA45 + this.a;
        this.b += iA48;
        this.c += iA47;
        this.d += iA46;
        this.f = 0;
        for (int i5 = 0; i5 != this.e.length; i5++) {
            this.e[i5] = 0;
        }
    }
}
