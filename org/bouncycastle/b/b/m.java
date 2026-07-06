package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class m extends h {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e;
    private int f;

    public m() {
        this.e = new int[16];
        c();
    }

    public m(m mVar) {
        super(mVar);
        this.e = new int[16];
        a(mVar);
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

    private void a(m mVar) {
        super.a((h) mVar);
        this.a = mVar.a;
        this.b = mVar.b;
        this.c = mVar.c;
        this.d = mVar.d;
        System.arraycopy(mVar.e, 0, this.e, 0, mVar.e.length);
        this.f = mVar.f;
    }

    private static int b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
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
        return "MD5";
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
        a((m) eVar);
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
        return new m(this);
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int iA = a(((i + a(i2, i3, i4)) + this.e[0]) - 680876936, 7) + i2;
        int iA2 = a(((i4 + a(iA, i2, i3)) + this.e[1]) - 389564586, 12) + iA;
        int iA3 = a(i3 + a(iA2, iA, i2) + this.e[2] + 606105819, 17) + iA2;
        int iA4 = a(((i2 + a(iA3, iA2, iA)) + this.e[3]) - 1044525330, 22) + iA3;
        int iA5 = a(((iA + a(iA4, iA3, iA2)) + this.e[4]) - 176418897, 7) + iA4;
        int iA6 = a(iA2 + a(iA5, iA4, iA3) + this.e[5] + 1200080426, 12) + iA5;
        int iA7 = a(((iA3 + a(iA6, iA5, iA4)) + this.e[6]) - 1473231341, 17) + iA6;
        int iA8 = a(((iA4 + a(iA7, iA6, iA5)) + this.e[7]) - 45705983, 22) + iA7;
        int iA9 = a(iA5 + a(iA8, iA7, iA6) + this.e[8] + 1770035416, 7) + iA8;
        int iA10 = a(((iA6 + a(iA9, iA8, iA7)) + this.e[9]) - 1958414417, 12) + iA9;
        int iA11 = a(((iA7 + a(iA10, iA9, iA8)) + this.e[10]) - 42063, 17) + iA10;
        int iA12 = a(((iA8 + a(iA11, iA10, iA9)) + this.e[11]) - 1990404162, 22) + iA11;
        int iA13 = a(iA9 + a(iA12, iA11, iA10) + this.e[12] + 1804603682, 7) + iA12;
        int iA14 = a(((iA10 + a(iA13, iA12, iA11)) + this.e[13]) - 40341101, 12) + iA13;
        int iA15 = a(((iA11 + a(iA14, iA13, iA12)) + this.e[14]) - 1502002290, 17) + iA14;
        int iA16 = a(iA12 + a(iA15, iA14, iA13) + this.e[15] + 1236535329, 22) + iA15;
        int iA17 = a(((iA13 + b(iA16, iA15, iA14)) + this.e[1]) - 165796510, 5) + iA16;
        int iA18 = a(((iA14 + b(iA17, iA16, iA15)) + this.e[6]) - 1069501632, 9) + iA17;
        int iA19 = a(iA15 + b(iA18, iA17, iA16) + this.e[11] + 643717713, 14) + iA18;
        int iA20 = a(((iA16 + b(iA19, iA18, iA17)) + this.e[0]) - 373897302, 20) + iA19;
        int iA21 = a(((iA17 + b(iA20, iA19, iA18)) + this.e[5]) - 701558691, 5) + iA20;
        int iA22 = a(iA18 + b(iA21, iA20, iA19) + this.e[10] + 38016083, 9) + iA21;
        int iA23 = a(((iA19 + b(iA22, iA21, iA20)) + this.e[15]) - 660478335, 14) + iA22;
        int iA24 = a(((iA20 + b(iA23, iA22, iA21)) + this.e[4]) - 405537848, 20) + iA23;
        int iA25 = a(iA21 + b(iA24, iA23, iA22) + this.e[9] + 568446438, 5) + iA24;
        int iA26 = a(((iA22 + b(iA25, iA24, iA23)) + this.e[14]) - 1019803690, 9) + iA25;
        int iA27 = a(((iA23 + b(iA26, iA25, iA24)) + this.e[3]) - 187363961, 14) + iA26;
        int iA28 = a(iA24 + b(iA27, iA26, iA25) + this.e[8] + 1163531501, 20) + iA27;
        int iA29 = a(((iA25 + b(iA28, iA27, iA26)) + this.e[13]) - 1444681467, 5) + iA28;
        int iA30 = a(((iA26 + b(iA29, iA28, iA27)) + this.e[2]) - 51403784, 9) + iA29;
        int iA31 = a(iA27 + b(iA30, iA29, iA28) + this.e[7] + 1735328473, 14) + iA30;
        int iA32 = a(((iA28 + b(iA31, iA30, iA29)) + this.e[12]) - 1926607734, 20) + iA31;
        int iA33 = a(((iA29 + ((iA32 ^ iA31) ^ iA30)) + this.e[5]) - 378558, 4) + iA32;
        int iA34 = a(((iA30 + ((iA33 ^ iA32) ^ iA31)) + this.e[8]) - 2022574463, 11) + iA33;
        int iA35 = a(iA31 + ((iA34 ^ iA33) ^ iA32) + this.e[11] + 1839030562, 16) + iA34;
        int iA36 = a(((iA32 + ((iA35 ^ iA34) ^ iA33)) + this.e[14]) - 35309556, 23) + iA35;
        int iA37 = a(((iA33 + ((iA36 ^ iA35) ^ iA34)) + this.e[1]) - 1530992060, 4) + iA36;
        int iA38 = a(iA34 + ((iA37 ^ iA36) ^ iA35) + this.e[4] + 1272893353, 11) + iA37;
        int iA39 = a(((iA35 + ((iA38 ^ iA37) ^ iA36)) + this.e[7]) - 155497632, 16) + iA38;
        int iA40 = a(((iA36 + ((iA39 ^ iA38) ^ iA37)) + this.e[10]) - 1094730640, 23) + iA39;
        int iA41 = a(iA37 + ((iA40 ^ iA39) ^ iA38) + this.e[13] + 681279174, 4) + iA40;
        int iA42 = a(((iA38 + ((iA41 ^ iA40) ^ iA39)) + this.e[0]) - 358537222, 11) + iA41;
        int iA43 = a(((iA39 + ((iA42 ^ iA41) ^ iA40)) + this.e[3]) - 722521979, 16) + iA42;
        int iA44 = a(iA40 + ((iA43 ^ iA42) ^ iA41) + this.e[6] + 76029189, 23) + iA43;
        int iA45 = a(((iA41 + ((iA44 ^ iA43) ^ iA42)) + this.e[9]) - 640364487, 4) + iA44;
        int iA46 = a(((iA42 + ((iA45 ^ iA44) ^ iA43)) + this.e[12]) - 421815835, 11) + iA45;
        int iA47 = a(iA43 + ((iA46 ^ iA45) ^ iA44) + this.e[15] + 530742520, 16) + iA46;
        int iA48 = a(((iA44 + ((iA47 ^ iA46) ^ iA45)) + this.e[2]) - 995338651, 23) + iA47;
        int iA49 = a(((iA45 + (((iA46 ^ (-1)) | iA48) ^ iA47)) + this.e[0]) - 198630844, 6) + iA48;
        int iA50 = a(iA46 + (((iA47 ^ (-1)) | iA49) ^ iA48) + this.e[7] + 1126891415, 10) + iA49;
        int iA51 = a(((iA47 + (((iA48 ^ (-1)) | iA50) ^ iA49)) + this.e[14]) - 1416354905, 15) + iA50;
        int iA52 = a(((iA48 + (((iA49 ^ (-1)) | iA51) ^ iA50)) + this.e[5]) - 57434055, 21) + iA51;
        int iA53 = a(iA49 + (((iA50 ^ (-1)) | iA52) ^ iA51) + this.e[12] + 1700485571, 6) + iA52;
        int iA54 = a(((iA50 + (((iA51 ^ (-1)) | iA53) ^ iA52)) + this.e[3]) - 1894986606, 10) + iA53;
        int iA55 = a(((iA51 + (((iA52 ^ (-1)) | iA54) ^ iA53)) + this.e[10]) - 1051523, 15) + iA54;
        int iA56 = a(((iA52 + (((iA53 ^ (-1)) | iA55) ^ iA54)) + this.e[1]) - 2054922799, 21) + iA55;
        int iA57 = a(iA53 + (((iA54 ^ (-1)) | iA56) ^ iA55) + this.e[8] + 1873313359, 6) + iA56;
        int iA58 = a(((iA54 + (((iA55 ^ (-1)) | iA57) ^ iA56)) + this.e[15]) - 30611744, 10) + iA57;
        int iA59 = a(((iA55 + (((iA56 ^ (-1)) | iA58) ^ iA57)) + this.e[6]) - 1560198380, 15) + iA58;
        int iA60 = a(iA56 + (((iA57 ^ (-1)) | iA59) ^ iA58) + this.e[13] + 1309151649, 21) + iA59;
        int iA61 = a(((iA57 + (((iA58 ^ (-1)) | iA60) ^ iA59)) + this.e[4]) - 145523070, 6) + iA60;
        int iA62 = a(((iA58 + (((iA59 ^ (-1)) | iA61) ^ iA60)) + this.e[11]) - 1120210379, 10) + iA61;
        int iA63 = a(iA59 + (((iA60 ^ (-1)) | iA62) ^ iA61) + this.e[2] + 718787259, 15) + iA62;
        int iA64 = a(((iA60 + (((iA61 ^ (-1)) | iA63) ^ iA62)) + this.e[9]) - 343485551, 21) + iA63;
        this.a = iA61 + this.a;
        this.b += iA64;
        this.c += iA63;
        this.d += iA62;
        this.f = 0;
        for (int i5 = 0; i5 != this.e.length; i5++) {
            this.e[i5] = 0;
        }
    }
}
