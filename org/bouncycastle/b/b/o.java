package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class o extends h {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e;
    private int f;

    public o() {
        this.e = new int[16];
        c();
    }

    public o(o oVar) {
        super(oVar);
        this.e = new int[16];
        a(oVar);
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

    private void a(o oVar) {
        super.a((h) oVar);
        this.a = oVar.a;
        this.b = oVar.b;
        this.c = oVar.c;
        this.d = oVar.d;
        System.arraycopy(oVar.e, 0, this.e, 0, oVar.e.length);
        this.f = oVar.f;
    }

    private static int b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    private static int b(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(a(i2, i3, i4) + i + i5 + 1518500249, i6);
    }

    private static int d(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(((b(i2, i3, i4) + i) + i5) - 1894007588, i6);
    }

    private static int f(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(a(i2, i3, i4) + i + i5 + 1836072691, i6);
    }

    private static int h(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(b(i2, i3, i4) + i + i5 + 1352829926, i6);
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
        return "RIPEMD128";
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
        a((o) eVar);
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
        return new o(this);
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int iA = a(i, i2, i3, i4, this.e[0], 11);
        int iA2 = a(i4, iA, i2, i3, this.e[1], 14);
        int iA3 = a(i3, iA2, iA, i2, this.e[2], 15);
        int iA4 = a(i2, iA3, iA2, iA, this.e[3], 12);
        int iA5 = a(iA, iA4, iA3, iA2, this.e[4], 5);
        int iA6 = a(iA2, iA5, iA4, iA3, this.e[5], 8);
        int iA7 = a(iA3, iA6, iA5, iA4, this.e[6], 7);
        int iA8 = a(iA4, iA7, iA6, iA5, this.e[7], 9);
        int iA9 = a(iA5, iA8, iA7, iA6, this.e[8], 11);
        int iA10 = a(iA6, iA9, iA8, iA7, this.e[9], 13);
        int iA11 = a(iA7, iA10, iA9, iA8, this.e[10], 14);
        int iA12 = a(iA8, iA11, iA10, iA9, this.e[11], 15);
        int iA13 = a(iA9, iA12, iA11, iA10, this.e[12], 6);
        int iA14 = a(iA10, iA13, iA12, iA11, this.e[13], 7);
        int iA15 = a(iA11, iA14, iA13, iA12, this.e[14], 9);
        int iA16 = a(iA12, iA15, iA14, iA13, this.e[15], 8);
        int iB = b(iA13, iA16, iA15, iA14, this.e[7], 7);
        int iB2 = b(iA14, iB, iA16, iA15, this.e[4], 6);
        int iB3 = b(iA15, iB2, iB, iA16, this.e[13], 8);
        int iB4 = b(iA16, iB3, iB2, iB, this.e[1], 13);
        int iB5 = b(iB, iB4, iB3, iB2, this.e[10], 11);
        int iB6 = b(iB2, iB5, iB4, iB3, this.e[6], 9);
        int iB7 = b(iB3, iB6, iB5, iB4, this.e[15], 7);
        int iB8 = b(iB4, iB7, iB6, iB5, this.e[3], 15);
        int iB9 = b(iB5, iB8, iB7, iB6, this.e[12], 7);
        int iB10 = b(iB6, iB9, iB8, iB7, this.e[0], 12);
        int iB11 = b(iB7, iB10, iB9, iB8, this.e[9], 15);
        int iB12 = b(iB8, iB11, iB10, iB9, this.e[5], 9);
        int iB13 = b(iB9, iB12, iB11, iB10, this.e[2], 11);
        int iB14 = b(iB10, iB13, iB12, iB11, this.e[14], 7);
        int iB15 = b(iB11, iB14, iB13, iB12, this.e[11], 13);
        int iB16 = b(iB12, iB15, iB14, iB13, this.e[8], 12);
        int iC = c(iB13, iB16, iB15, iB14, this.e[3], 11);
        int iC2 = c(iB14, iC, iB16, iB15, this.e[10], 13);
        int iC3 = c(iB15, iC2, iC, iB16, this.e[14], 6);
        int iC4 = c(iB16, iC3, iC2, iC, this.e[4], 7);
        int iC5 = c(iC, iC4, iC3, iC2, this.e[9], 14);
        int iC6 = c(iC2, iC5, iC4, iC3, this.e[15], 9);
        int iC7 = c(iC3, iC6, iC5, iC4, this.e[8], 13);
        int iC8 = c(iC4, iC7, iC6, iC5, this.e[1], 15);
        int iC9 = c(iC5, iC8, iC7, iC6, this.e[2], 14);
        int iC10 = c(iC6, iC9, iC8, iC7, this.e[7], 8);
        int iC11 = c(iC7, iC10, iC9, iC8, this.e[0], 13);
        int iC12 = c(iC8, iC11, iC10, iC9, this.e[6], 6);
        int iC13 = c(iC9, iC12, iC11, iC10, this.e[13], 5);
        int iC14 = c(iC10, iC13, iC12, iC11, this.e[11], 12);
        int iC15 = c(iC11, iC14, iC13, iC12, this.e[5], 7);
        int iC16 = c(iC12, iC15, iC14, iC13, this.e[12], 5);
        int iD = d(iC13, iC16, iC15, iC14, this.e[1], 11);
        int iD2 = d(iC14, iD, iC16, iC15, this.e[9], 12);
        int iD3 = d(iC15, iD2, iD, iC16, this.e[11], 14);
        int iD4 = d(iC16, iD3, iD2, iD, this.e[10], 15);
        int iD5 = d(iD, iD4, iD3, iD2, this.e[0], 14);
        int iD6 = d(iD2, iD5, iD4, iD3, this.e[8], 15);
        int iD7 = d(iD3, iD6, iD5, iD4, this.e[12], 9);
        int iD8 = d(iD4, iD7, iD6, iD5, this.e[4], 8);
        int iD9 = d(iD5, iD8, iD7, iD6, this.e[13], 9);
        int iD10 = d(iD6, iD9, iD8, iD7, this.e[3], 14);
        int iD11 = d(iD7, iD10, iD9, iD8, this.e[7], 5);
        int iD12 = d(iD8, iD11, iD10, iD9, this.e[15], 6);
        int iD13 = d(iD9, iD12, iD11, iD10, this.e[14], 8);
        int iD14 = d(iD10, iD13, iD12, iD11, this.e[5], 6);
        int iD15 = d(iD11, iD14, iD13, iD12, this.e[6], 5);
        int iD16 = d(iD12, iD15, iD14, iD13, this.e[2], 12);
        int iH = h(i, i2, i3, i4, this.e[5], 8);
        int iH2 = h(i4, iH, i2, i3, this.e[14], 9);
        int iH3 = h(i3, iH2, iH, i2, this.e[7], 9);
        int iH4 = h(i2, iH3, iH2, iH, this.e[0], 11);
        int iH5 = h(iH, iH4, iH3, iH2, this.e[9], 13);
        int iH6 = h(iH2, iH5, iH4, iH3, this.e[2], 15);
        int iH7 = h(iH3, iH6, iH5, iH4, this.e[11], 15);
        int iH8 = h(iH4, iH7, iH6, iH5, this.e[4], 5);
        int iH9 = h(iH5, iH8, iH7, iH6, this.e[13], 7);
        int iH10 = h(iH6, iH9, iH8, iH7, this.e[6], 7);
        int iH11 = h(iH7, iH10, iH9, iH8, this.e[15], 8);
        int iH12 = h(iH8, iH11, iH10, iH9, this.e[8], 11);
        int iH13 = h(iH9, iH12, iH11, iH10, this.e[1], 14);
        int iH14 = h(iH10, iH13, iH12, iH11, this.e[10], 14);
        int iH15 = h(iH11, iH14, iH13, iH12, this.e[3], 12);
        int iH16 = h(iH12, iH15, iH14, iH13, this.e[12], 6);
        int iG = g(iH13, iH16, iH15, iH14, this.e[6], 9);
        int iG2 = g(iH14, iG, iH16, iH15, this.e[11], 13);
        int iG3 = g(iH15, iG2, iG, iH16, this.e[3], 15);
        int iG4 = g(iH16, iG3, iG2, iG, this.e[7], 7);
        int iG5 = g(iG, iG4, iG3, iG2, this.e[0], 12);
        int iG6 = g(iG2, iG5, iG4, iG3, this.e[13], 8);
        int iG7 = g(iG3, iG6, iG5, iG4, this.e[5], 9);
        int iG8 = g(iG4, iG7, iG6, iG5, this.e[10], 11);
        int iG9 = g(iG5, iG8, iG7, iG6, this.e[14], 7);
        int iG10 = g(iG6, iG9, iG8, iG7, this.e[15], 7);
        int iG11 = g(iG7, iG10, iG9, iG8, this.e[8], 12);
        int iG12 = g(iG8, iG11, iG10, iG9, this.e[12], 7);
        int iG13 = g(iG9, iG12, iG11, iG10, this.e[4], 6);
        int iG14 = g(iG10, iG13, iG12, iG11, this.e[9], 15);
        int iG15 = g(iG11, iG14, iG13, iG12, this.e[1], 13);
        int iG16 = g(iG12, iG15, iG14, iG13, this.e[2], 11);
        int iF = f(iG13, iG16, iG15, iG14, this.e[15], 9);
        int iF2 = f(iG14, iF, iG16, iG15, this.e[5], 7);
        int iF3 = f(iG15, iF2, iF, iG16, this.e[1], 15);
        int iF4 = f(iG16, iF3, iF2, iF, this.e[3], 11);
        int iF5 = f(iF, iF4, iF3, iF2, this.e[7], 8);
        int iF6 = f(iF2, iF5, iF4, iF3, this.e[14], 6);
        int iF7 = f(iF3, iF6, iF5, iF4, this.e[6], 6);
        int iF8 = f(iF4, iF7, iF6, iF5, this.e[9], 14);
        int iF9 = f(iF5, iF8, iF7, iF6, this.e[11], 12);
        int iF10 = f(iF6, iF9, iF8, iF7, this.e[8], 13);
        int iF11 = f(iF7, iF10, iF9, iF8, this.e[12], 5);
        int iF12 = f(iF8, iF11, iF10, iF9, this.e[2], 14);
        int iF13 = f(iF9, iF12, iF11, iF10, this.e[10], 13);
        int iF14 = f(iF10, iF13, iF12, iF11, this.e[0], 13);
        int iF15 = f(iF11, iF14, iF13, iF12, this.e[4], 7);
        int iF16 = f(iF12, iF15, iF14, iF13, this.e[13], 5);
        int iE = e(iF13, iF16, iF15, iF14, this.e[8], 15);
        int iE2 = e(iF14, iE, iF16, iF15, this.e[6], 5);
        int iE3 = e(iF15, iE2, iE, iF16, this.e[4], 8);
        int iE4 = e(iF16, iE3, iE2, iE, this.e[1], 11);
        int iE5 = e(iE, iE4, iE3, iE2, this.e[3], 14);
        int iE6 = e(iE2, iE5, iE4, iE3, this.e[11], 14);
        int iE7 = e(iE3, iE6, iE5, iE4, this.e[15], 6);
        int iE8 = e(iE4, iE7, iE6, iE5, this.e[0], 14);
        int iE9 = e(iE5, iE8, iE7, iE6, this.e[5], 6);
        int iE10 = e(iE6, iE9, iE8, iE7, this.e[12], 9);
        int iE11 = e(iE7, iE10, iE9, iE8, this.e[2], 12);
        int iE12 = e(iE8, iE11, iE10, iE9, this.e[13], 9);
        int iE13 = e(iE9, iE12, iE11, iE10, this.e[9], 12);
        int iE14 = e(iE10, iE13, iE12, iE11, this.e[7], 5);
        int iE15 = e(iE11, iE14, iE13, iE12, this.e[10], 15);
        int iE16 = e(iE12, iE15, iE14, iE13, this.e[14], 8);
        int i5 = this.b + iD15 + iE14;
        this.b = this.c + iD14 + iE13;
        this.c = iE16 + this.d + iD13;
        this.d = this.a + iD16 + iE15;
        this.a = i5;
        this.f = 0;
        for (int i6 = 0; i6 != this.e.length; i6++) {
            this.e[i6] = 0;
        }
    }

    private static int a(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(((i2 ^ i3) ^ i4) + i + i5, i6);
    }

    private static int c(int i, int i2, int i3, int i4, int i5, int i6) {
        return a((((i3 ^ (-1)) | i2) ^ i4) + i + i5 + 1859775393, i6);
    }

    private static int e(int i, int i2, int i3, int i4, int i5, int i6) {
        return a(((i2 ^ i3) ^ i4) + i + i5, i6);
    }

    private static int g(int i, int i2, int i3, int i4, int i5, int i6) {
        return a((((i3 ^ (-1)) | i2) ^ i4) + i + i5 + 1548603684, i6);
    }
}
