package org.bouncycastle.b.e;

import android.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements org.bouncycastle.b.e {
    private static final byte[][] a = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, -128, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, 127, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, -128, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, 127, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private int[] g;
    private int[] h;
    private boolean b = false;
    private int[] c = new int[256];
    private int[] d = new int[256];
    private int[] e = new int[256];
    private int[] f = new int[256];
    private int i = 0;
    private byte[] j = null;

    private static int a(int i) {
        int i2 = (i >>> 24) & 255;
        int i3 = (((i2 & 128) != 0 ? 333 : 0) ^ (i2 << 1)) & 255;
        int i4 = (((i2 & 1) != 0 ? 166 : 0) ^ (i2 >>> 1)) ^ i3;
        return ((i4 << 8) ^ ((i3 << 16) ^ ((i << 8) ^ (i4 << 24)))) ^ i2;
    }

    private static int a(int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = a(i2);
        }
        int iA = i2 ^ i;
        for (int i4 = 0; i4 < 4; i4++) {
            iA = a(iA);
        }
        return iA;
    }

    private static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private static int b(int i) {
        return ((i & 1) != 0 ? 180 : 0) ^ (i >> 1);
    }

    private void b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i) ^ this.g[0];
        int iA2 = this.g[1] ^ a(bArr, i + 4);
        int iA3 = a(bArr, i + 8) ^ this.g[2];
        int iA4 = this.g[3] ^ a(bArr, i + 12);
        int i3 = 8;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int iH = h(iA);
            int i5 = i(iA2);
            int i6 = i3 + 1;
            int i7 = iA3 ^ (this.g[i3] + (iH + i5));
            iA3 = (i7 << 31) | (i7 >>> 1);
            int i8 = (iA4 << 1) | (iA4 >>> 31);
            int i9 = (i5 * 2) + iH;
            int i10 = i6 + 1;
            iA4 = (i9 + this.g[i6]) ^ i8;
            int iH2 = h(iA3);
            int i11 = i(iA4);
            int i12 = i10 + 1;
            int i13 = iA ^ (this.g[i10] + (iH2 + i11));
            iA = (i13 << 31) | (i13 >>> 1);
            int i14 = (i11 * 2) + iH2;
            i3 = i12 + 1;
            iA2 = ((iA2 >>> 31) | (iA2 << 1)) ^ (i14 + this.g[i12]);
        }
        a(this.g[4] ^ iA3, bArr2, i2);
        a(this.g[5] ^ iA4, bArr2, i2 + 4);
        a(this.g[6] ^ iA, bArr2, i2 + 8);
        a(this.g[7] ^ iA2, bArr2, i2 + 12);
    }

    private static int c(int i) {
        return ((i & 1) != 0 ? 90 : 0) ^ (((i & 2) != 0 ? 180 : 0) ^ (i >> 2));
    }

    private void c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i) ^ this.g[4];
        int iA2 = a(bArr, i + 4) ^ this.g[5];
        int iA3 = this.g[6] ^ a(bArr, i + 8);
        int iA4 = a(bArr, i + 12) ^ this.g[7];
        int i3 = 39;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int iH = h(iA);
            int i5 = i(iA2);
            int i6 = i3 - 1;
            int i7 = (this.g[i3] + ((i5 * 2) + iH)) ^ iA4;
            int i8 = iH + i5;
            int i9 = i6 - 1;
            iA3 = ((iA3 >>> 31) | (iA3 << 1)) ^ (i8 + this.g[i6]);
            iA4 = (i7 >>> 1) | (i7 << 31);
            int iH2 = h(iA3);
            int i10 = i(iA4);
            int i11 = i9 - 1;
            int i12 = iA2 ^ (this.g[i9] + ((i10 * 2) + iH2));
            int i13 = i10 + iH2;
            i3 = i11 - 1;
            iA = ((iA >>> 31) | (iA << 1)) ^ (i13 + this.g[i11]);
            iA2 = (i12 << 31) | (i12 >>> 1);
        }
        a(this.g[0] ^ iA3, bArr2, i2);
        a(this.g[1] ^ iA4, bArr2, i2 + 4);
        a(this.g[2] ^ iA, bArr2, i2 + 8);
        a(this.g[3] ^ iA2, bArr2, i2 + 12);
    }

    private static int d(int i) {
        return (b(i) ^ i) ^ c(i);
    }

    private static int e(int i) {
        return (i >>> 8) & 255;
    }

    private static int f(int i) {
        return (i >>> 16) & 255;
    }

    private static int g(int i) {
        return (i >>> 24) & 255;
    }

    private int h(int i) {
        return ((this.h[((i & 255) * 2) + 0] ^ this.h[(((i >>> 8) & 255) * 2) + 1]) ^ this.h[(((i >>> 16) & 255) * 2) + 512]) ^ this.h[(((i >>> 24) & 255) * 2) + 513];
    }

    private int i(int i) {
        return ((this.h[(((i >>> 24) & 255) * 2) + 0] ^ this.h[((i & 255) * 2) + 1]) ^ this.h[(((i >>> 8) & 255) * 2) + 512]) ^ this.h[(((i >>> 16) & 255) * 2) + 513];
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.j == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        if (this.b) {
            b(bArr, i, bArr2, i2);
            return 16;
        }
        c(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "Twofish";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + iVar.getClass().getName());
        }
        this.b = z;
        this.j = ((org.bouncycastle.b.k.ba) iVar).a();
        this.i = this.j.length / 8;
        a(this.j);
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
        if (this.j != null) {
            a(this.j);
        }
    }

    public bc() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i = 0; i < 256; i++) {
            int i2 = a[0][i] & 255;
            iArr[0] = i2;
            iArr2[0] = (c(i2) ^ i2) & 255;
            iArr3[0] = d(i2) & 255;
            int i3 = a[1][i] & 255;
            iArr[1] = i3;
            iArr2[1] = (c(i3) ^ i3) & 255;
            iArr3[1] = d(i3) & 255;
            this.c[i] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.d[i] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.e[i] = iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16) | (iArr3[1] << 24);
            this.f[i] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }

    private void a(byte[] bArr) {
        int iG;
        int iF;
        int iE;
        int i;
        int iG2;
        int iF2;
        int iE2;
        int i2;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.g = new int[40];
        if (this.i <= 0) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (this.i > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int i3 = 0; i3 < this.i; i3++) {
            int i4 = i3 * 8;
            iArr[i3] = a(bArr, i4);
            iArr2[i3] = a(bArr, i4 + 4);
            iArr3[(this.i - 1) - i3] = a(iArr[i3], iArr2[i3]);
        }
        for (int i5 = 0; i5 < 20; i5++) {
            int i6 = 33686018 * i5;
            int iA = a(i6, iArr);
            int iA2 = a(i6 + R$attr.cacheColorHint, iArr2);
            int i7 = (iA2 >>> 24) | (iA2 << 8);
            int i8 = iA + i7;
            this.g[i5 * 2] = i8;
            int i9 = i7 + i8;
            this.g[(i5 * 2) + 1] = (i9 >>> 23) | (i9 << 9);
        }
        int i10 = iArr3[0];
        int i11 = iArr3[1];
        int i12 = iArr3[2];
        int i13 = iArr3[3];
        this.h = new int[1024];
        for (int i14 = 0; i14 < 256; i14++) {
            switch (this.i & 3) {
                case 0:
                    i2 = (a[1][i14] & 255) ^ (i13 & 255);
                    iE2 = (a[0][i14] & 255) ^ e(i13);
                    iF2 = f(i13) ^ (a[0][i14] & 255);
                    iG2 = (a[1][i14] & 255) ^ g(i13);
                    i = (a[1][i2] & 255) ^ (i12 & 255);
                    iE = (a[1][iE2] & 255) ^ e(i12);
                    iF = (a[0][iF2] & 255) ^ f(i12);
                    iG = (a[0][iG2] & 255) ^ g(i12);
                    this.h[i14 * 2] = this.c[(a[0][(a[0][i] & 255) ^ (i11 & 255)] & 255) ^ (i10 & 255)];
                    this.h[(i14 * 2) + 1] = this.d[(a[0][(a[1][iE] & 255) ^ e(i11)] & 255) ^ e(i10)];
                    this.h[(i14 * 2) + 512] = this.e[(a[1][(a[0][iF] & 255) ^ f(i11)] & 255) ^ f(i10)];
                    this.h[(i14 * 2) + 513] = this.f[(a[1][(a[1][iG] & 255) ^ g(i11)] & 255) ^ g(i10)];
                    break;
                case 1:
                    this.h[i14 * 2] = this.c[(a[0][i14] & 255) ^ (i10 & 255)];
                    this.h[(i14 * 2) + 1] = this.d[(a[0][i14] & 255) ^ e(i10)];
                    this.h[(i14 * 2) + 512] = this.e[(a[1][i14] & 255) ^ f(i10)];
                    this.h[(i14 * 2) + 513] = this.f[(a[1][i14] & 255) ^ g(i10)];
                    break;
                case 2:
                    iG = i14;
                    iF = i14;
                    iE = i14;
                    i = i14;
                    this.h[i14 * 2] = this.c[(a[0][(a[0][i] & 255) ^ (i11 & 255)] & 255) ^ (i10 & 255)];
                    this.h[(i14 * 2) + 1] = this.d[(a[0][(a[1][iE] & 255) ^ e(i11)] & 255) ^ e(i10)];
                    this.h[(i14 * 2) + 512] = this.e[(a[1][(a[0][iF] & 255) ^ f(i11)] & 255) ^ f(i10)];
                    this.h[(i14 * 2) + 513] = this.f[(a[1][(a[1][iG] & 255) ^ g(i11)] & 255) ^ g(i10)];
                    break;
                case 3:
                    iG2 = i14;
                    iF2 = i14;
                    iE2 = i14;
                    i2 = i14;
                    i = (a[1][i2] & 255) ^ (i12 & 255);
                    iE = (a[1][iE2] & 255) ^ e(i12);
                    iF = (a[0][iF2] & 255) ^ f(i12);
                    iG = (a[0][iG2] & 255) ^ g(i12);
                    this.h[i14 * 2] = this.c[(a[0][(a[0][i] & 255) ^ (i11 & 255)] & 255) ^ (i10 & 255)];
                    this.h[(i14 * 2) + 1] = this.d[(a[0][(a[1][iE] & 255) ^ e(i11)] & 255) ^ e(i10)];
                    this.h[(i14 * 2) + 512] = this.e[(a[1][(a[0][iF] & 255) ^ f(i11)] & 255) ^ f(i10)];
                    this.h[(i14 * 2) + 513] = this.f[(a[1][(a[1][iG] & 255) ^ g(i11)] & 255) ^ g(i10)];
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int a(int i, int[] iArr) {
        int i2 = i & 255;
        int iE = e(i);
        int iF = f(i);
        int iG = g(i);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        switch (this.i & 3) {
            case 0:
                i2 = (a[1][i2] & 255) ^ (i6 & 255);
                iE = (a[0][iE] & 255) ^ e(i6);
                iF = (a[0][iF] & 255) ^ f(i6);
                iG = (a[1][iG] & 255) ^ g(i6);
                i2 = (a[1][i2] & 255) ^ (i5 & 255);
                iE = (a[1][iE] & 255) ^ e(i5);
                iF = (a[0][iF] & 255) ^ f(i5);
                iG = (a[0][iG] & 255) ^ g(i5);
                return (this.e[(a[1][(a[0][iF] & 255) ^ f(i4)] & 255) ^ f(i3)] ^ (this.d[(a[0][(a[1][iE] & 255) ^ e(i4)] & 255) ^ e(i3)] ^ this.c[(a[0][(a[0][i2] & 255) ^ (i4 & 255)] & 255) ^ (i3 & 255)])) ^ this.f[(a[1][(a[1][iG] & 255) ^ g(i4)] & 255) ^ g(i3)];
            case 1:
                return (this.e[(a[1][iF] & 255) ^ f(i3)] ^ (this.d[(a[0][iE] & 255) ^ e(i3)] ^ this.c[(a[0][i2] & 255) ^ (i3 & 255)])) ^ this.f[(a[1][iG] & 255) ^ g(i3)];
            case 2:
                return (this.e[(a[1][(a[0][iF] & 255) ^ f(i4)] & 255) ^ f(i3)] ^ (this.d[(a[0][(a[1][iE] & 255) ^ e(i4)] & 255) ^ e(i3)] ^ this.c[(a[0][(a[0][i2] & 255) ^ (i4 & 255)] & 255) ^ (i3 & 255)])) ^ this.f[(a[1][(a[1][iG] & 255) ^ g(i4)] & 255) ^ g(i3)];
            case 3:
                i2 = (a[1][i2] & 255) ^ (i5 & 255);
                iE = (a[1][iE] & 255) ^ e(i5);
                iF = (a[0][iF] & 255) ^ f(i5);
                iG = (a[0][iG] & 255) ^ g(i5);
                return (this.e[(a[1][(a[0][iF] & 255) ^ f(i4)] & 255) ^ f(i3)] ^ (this.d[(a[0][(a[1][iE] & 255) ^ e(i4)] & 255) ^ e(i3)] ^ this.c[(a[0][(a[0][i2] & 255) ^ (i4 & 255)] & 255) ^ (i3 & 255)])) ^ this.f[(a[1][(a[1][iG] & 255) ^ g(i4)] & 255) ^ g(i3)];
            default:
                return 0;
        }
    }
}
