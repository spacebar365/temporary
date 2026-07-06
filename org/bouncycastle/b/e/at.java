package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class at implements org.bouncycastle.b.e {
    private static final byte[] a = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};
    private static final int[] b = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] c = {-1548633402, 1453994832, 1736282519, -1301273892};
    private final int[] d = new int[4];
    private int[] e;

    private static int a(int i) {
        return ((a[(i >> 24) & 255] & 255) << 24) | ((a[(i >> 16) & 255] & 255) << 16) | ((a[(i >> 8) & 255] & 255) << 8) | (a[i & 255] & 255);
    }

    private static int a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private static int[] a(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {org.bouncycastle.f.g.a(bArr, 0), org.bouncycastle.f.g.a(bArr, 4), org.bouncycastle.f.g.a(bArr, 8), org.bouncycastle.f.g.a(bArr, 12)};
        int[] iArr3 = {iArr2[0] ^ c[0], iArr2[1] ^ c[1], iArr2[2] ^ c[2], iArr2[3] ^ c[3]};
        if (z) {
            iArr[0] = iArr3[0] ^ b(((iArr3[1] ^ iArr3[2]) ^ iArr3[3]) ^ b[0]);
            iArr[1] = iArr3[1] ^ b(((iArr3[2] ^ iArr3[3]) ^ iArr[0]) ^ b[1]);
            iArr[2] = iArr3[2] ^ b(((iArr3[3] ^ iArr[0]) ^ iArr[1]) ^ b[2]);
            iArr[3] = iArr3[3] ^ b(((iArr[0] ^ iArr[1]) ^ iArr[2]) ^ b[3]);
            for (int i = 4; i < 32; i++) {
                iArr[i] = iArr[i - 4] ^ b(((iArr[i - 3] ^ iArr[i - 2]) ^ iArr[i - 1]) ^ b[i]);
            }
        } else {
            iArr[31] = iArr3[0] ^ b(((iArr3[1] ^ iArr3[2]) ^ iArr3[3]) ^ b[0]);
            iArr[30] = iArr3[1] ^ b(((iArr3[2] ^ iArr3[3]) ^ iArr[31]) ^ b[1]);
            iArr[29] = iArr3[2] ^ b(((iArr3[3] ^ iArr[31]) ^ iArr[30]) ^ b[2]);
            iArr[28] = iArr3[3] ^ b(((iArr[31] ^ iArr[30]) ^ iArr[29]) ^ b[3]);
            for (int i2 = 27; i2 >= 0; i2--) {
                iArr[i2] = iArr[i2 + 4] ^ b(((iArr[i2 + 3] ^ iArr[i2 + 2]) ^ iArr[i2 + 1]) ^ b[31 - i2]);
            }
        }
        return iArr;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "SM4";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + iVar.getClass().getName());
        }
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        if (bArrA.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.e = a(z, bArrA);
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    private static int b(int i) {
        int iA = a(i);
        return a(iA, 23) ^ (a(iA, 13) ^ iA);
    }

    private static int c(int i) {
        int iA = a(i);
        return a(iA, 24) ^ (((a(iA, 2) ^ iA) ^ a(iA, 10)) ^ a(iA, 18));
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.e == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        this.d[0] = org.bouncycastle.f.g.a(bArr, i);
        this.d[1] = org.bouncycastle.f.g.a(bArr, i + 4);
        this.d[2] = org.bouncycastle.f.g.a(bArr, i + 8);
        this.d[3] = org.bouncycastle.f.g.a(bArr, i + 12);
        for (int i3 = 0; i3 < 32; i3 += 4) {
            int[] iArr = this.d;
            int[] iArr2 = this.d;
            iArr[0] = c((iArr2[3] ^ (iArr2[1] ^ iArr2[2])) ^ this.e[i3]) ^ iArr2[0];
            int[] iArr3 = this.d;
            int[] iArr4 = this.d;
            iArr3[1] = c((iArr4[0] ^ (iArr4[2] ^ iArr4[3])) ^ this.e[i3 + 1]) ^ iArr4[1];
            int[] iArr5 = this.d;
            int[] iArr6 = this.d;
            iArr5[2] = c((iArr6[1] ^ (iArr6[3] ^ iArr6[0])) ^ this.e[i3 + 2]) ^ iArr6[2];
            int[] iArr7 = this.d;
            int[] iArr8 = this.d;
            iArr7[3] = c((iArr8[2] ^ (iArr8[0] ^ iArr8[1])) ^ this.e[i3 + 3]) ^ iArr8[3];
        }
        org.bouncycastle.f.g.a(this.d[3], bArr2, i2);
        org.bouncycastle.f.g.a(this.d[2], bArr2, i2 + 4);
        org.bouncycastle.f.g.a(this.d[1], bArr2, i2 + 8);
        org.bouncycastle.f.g.a(this.d[0], bArr2, i2 + 12);
        return 16;
    }
}
