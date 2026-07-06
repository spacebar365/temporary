package org.bouncycastle.b.e;

import org.bouncycastle.b.k.bi;

/* JADX INFO: loaded from: classes.dex */
public final class ae implements org.bouncycastle.b.e {
    private static byte[] a = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, -128, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, 127, -63, -83};
    private int[] b;
    private boolean c;

    private static int a(int i, int i2) {
        int i3 = 65535 & i;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    private static int[] a(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = 0;
            int i4 = length;
            int i5 = iArr[length - 1];
            while (true) {
                int i6 = i3 + 1;
                i5 = a[(iArr[i3] + i5) & 255] & 255;
                int i7 = i4 + 1;
                iArr[i4] = i5;
                if (i7 >= 128) {
                    break;
                }
                i3 = i6;
                i4 = i7;
            }
        }
        int i8 = (i + 7) >> 3;
        int i9 = a[iArr[128 - i8] & (255 >> ((-i) & 7))] & 255;
        iArr[128 - i8] = i9;
        for (int i10 = (128 - i8) - 1; i10 >= 0; i10--) {
            i9 = a[i9 ^ iArr[i10 + i8]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            iArr2[i11] = iArr[i11 * 2] + (iArr[(i11 * 2) + 1] << 8);
        }
        return iArr2;
    }

    private void b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iA2 = (bArr[i + 4] & 255) + ((bArr[i + 5] & 255) << 8);
        int iA3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iA4 = (bArr[i + 0] & 255) + ((bArr[i + 1] & 255) << 8);
        for (int i3 = 0; i3 <= 16; i3 += 4) {
            iA4 = a(iA4 + ((iA ^ (-1)) & iA3) + (iA2 & iA) + this.b[i3], 1);
            iA3 = a(iA3 + ((iA4 ^ (-1)) & iA2) + (iA & iA4) + this.b[i3 + 1], 2);
            iA2 = a(iA2 + ((iA3 ^ (-1)) & iA) + (iA4 & iA3) + this.b[i3 + 2], 3);
            iA = a(iA + ((iA2 ^ (-1)) & iA4) + (iA3 & iA2) + this.b[i3 + 3], 5);
        }
        int iA5 = iA4 + this.b[iA & 63];
        int iA6 = iA3 + this.b[iA5 & 63];
        int iA7 = iA2 + this.b[iA6 & 63];
        int iA8 = iA + this.b[iA7 & 63];
        for (int i4 = 20; i4 <= 40; i4 += 4) {
            iA5 = a(iA5 + ((iA8 ^ (-1)) & iA6) + (iA7 & iA8) + this.b[i4], 1);
            iA6 = a(iA6 + ((iA5 ^ (-1)) & iA7) + (iA8 & iA5) + this.b[i4 + 1], 2);
            iA7 = a(iA7 + ((iA6 ^ (-1)) & iA8) + (iA5 & iA6) + this.b[i4 + 2], 3);
            iA8 = a(iA8 + ((iA7 ^ (-1)) & iA5) + (iA6 & iA7) + this.b[i4 + 3], 5);
        }
        int iA9 = iA5 + this.b[iA8 & 63];
        int iA10 = iA6 + this.b[iA9 & 63];
        int iA11 = iA7 + this.b[iA10 & 63];
        int iA12 = iA8 + this.b[iA11 & 63];
        for (int i5 = 44; i5 < 64; i5 += 4) {
            iA9 = a(iA9 + ((iA12 ^ (-1)) & iA10) + (iA11 & iA12) + this.b[i5], 1);
            iA10 = a(iA10 + ((iA9 ^ (-1)) & iA11) + (iA12 & iA9) + this.b[i5 + 1], 2);
            iA11 = a(iA11 + ((iA10 ^ (-1)) & iA12) + (iA9 & iA10) + this.b[i5 + 2], 3);
            iA12 = a(iA12 + ((iA11 ^ (-1)) & iA9) + (iA10 & iA11) + this.b[i5 + 3], 5);
        }
        bArr2[i2 + 0] = (byte) iA9;
        bArr2[i2 + 1] = (byte) (iA9 >> 8);
        bArr2[i2 + 2] = (byte) iA10;
        bArr2[i2 + 3] = (byte) (iA10 >> 8);
        bArr2[i2 + 4] = (byte) iA11;
        bArr2[i2 + 5] = (byte) (iA11 >> 8);
        bArr2[i2 + 6] = (byte) iA12;
        bArr2[i2 + 7] = (byte) (iA12 >> 8);
    }

    private void c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iA2 = (bArr[i + 4] & 255) + ((bArr[i + 5] & 255) << 8);
        int iA3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iA4 = (bArr[i + 0] & 255) + ((bArr[i + 1] & 255) << 8);
        for (int i3 = 60; i3 >= 44; i3 -= 4) {
            iA = a(iA, 11) - ((((iA2 ^ (-1)) & iA4) + (iA3 & iA2)) + this.b[i3 + 3]);
            iA2 = a(iA2, 13) - ((((iA3 ^ (-1)) & iA) + (iA4 & iA3)) + this.b[i3 + 2]);
            iA3 = a(iA3, 14) - ((((iA4 ^ (-1)) & iA2) + (iA & iA4)) + this.b[i3 + 1]);
            iA4 = a(iA4, 15) - ((((iA ^ (-1)) & iA3) + (iA2 & iA)) + this.b[i3]);
        }
        int iA5 = iA - this.b[iA2 & 63];
        int iA6 = iA2 - this.b[iA3 & 63];
        int iA7 = iA3 - this.b[iA4 & 63];
        int iA8 = iA4 - this.b[iA5 & 63];
        for (int i4 = 40; i4 >= 20; i4 -= 4) {
            iA5 = a(iA5, 11) - ((((iA6 ^ (-1)) & iA8) + (iA7 & iA6)) + this.b[i4 + 3]);
            iA6 = a(iA6, 13) - ((((iA7 ^ (-1)) & iA5) + (iA8 & iA7)) + this.b[i4 + 2]);
            iA7 = a(iA7, 14) - ((((iA8 ^ (-1)) & iA6) + (iA5 & iA8)) + this.b[i4 + 1]);
            iA8 = a(iA8, 15) - ((((iA5 ^ (-1)) & iA7) + (iA6 & iA5)) + this.b[i4]);
        }
        int iA9 = iA5 - this.b[iA6 & 63];
        int iA10 = iA6 - this.b[iA7 & 63];
        int iA11 = iA7 - this.b[iA8 & 63];
        int iA12 = iA8 - this.b[iA9 & 63];
        for (int i5 = 16; i5 >= 0; i5 -= 4) {
            iA9 = a(iA9, 11) - ((((iA10 ^ (-1)) & iA12) + (iA11 & iA10)) + this.b[i5 + 3]);
            iA10 = a(iA10, 13) - ((((iA11 ^ (-1)) & iA9) + (iA12 & iA11)) + this.b[i5 + 2]);
            iA11 = a(iA11, 14) - ((((iA12 ^ (-1)) & iA10) + (iA9 & iA12)) + this.b[i5 + 1]);
            iA12 = a(iA12, 15) - ((((iA9 ^ (-1)) & iA11) + (iA10 & iA9)) + this.b[i5]);
        }
        bArr2[i2 + 0] = (byte) iA12;
        bArr2[i2 + 1] = (byte) (iA12 >> 8);
        bArr2[i2 + 2] = (byte) iA11;
        bArr2[i2 + 3] = (byte) (iA11 >> 8);
        bArr2[i2 + 4] = (byte) iA10;
        bArr2[i2 + 5] = (byte) (iA10 >> 8);
        bArr2[i2 + 6] = (byte) iA9;
        bArr2[i2 + 7] = (byte) (iA9 >> 8);
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.b == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        if (this.c) {
            b(bArr, i, bArr2, i2);
            return 8;
        }
        c(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "RC2";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.c = z;
        if (iVar instanceof bi) {
            bi biVar = (bi) iVar;
            this.b = a(biVar.a(), biVar.b());
        } else {
            if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
                throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + iVar.getClass().getName());
            }
            byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
            this.b = a(bArrA, bArrA.length * 8);
        }
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }
}
