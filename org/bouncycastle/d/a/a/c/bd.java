package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bd {
    static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr) {
        int i = iArr[16];
        int iB = (i & 511) + org.bouncycastle.d.c.c.b(16, i >>> 9, iArr);
        if (iB > 511 || (iB == 511 && org.bouncycastle.d.c.c.b(16, iArr, a))) {
            iB = (iB + org.bouncycastle.d.c.c.a(iArr)) & 511;
        }
        iArr[16] = iB;
    }

    public static void a(int[] iArr, int[] iArr2) {
        int iD = org.bouncycastle.d.c.c.d(16, iArr, iArr2) + iArr[16];
        if (iD > 511 || (iD == 511 && org.bouncycastle.d.c.c.b(16, iArr2, a))) {
            iD = (iD + org.bouncycastle.d.c.c.a(iArr2)) & 511;
        }
        iArr2[16] = iD;
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = org.bouncycastle.d.c.c.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iA > 511 || (iA == 511 && org.bouncycastle.d.c.c.b(16, iArr3, a))) {
            iA = (iA + org.bouncycastle.d.c.c.a(iArr3)) & 511;
        }
        iArr3[16] = iA;
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = org.bouncycastle.d.c.c.a(521, bigInteger);
        if (org.bouncycastle.d.c.c.b(17, iArrA, a)) {
            org.bouncycastle.d.c.c.e(17, iArrA);
        }
        return iArrA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.c(17, iArr)) {
            org.bouncycastle.d.c.c.e(17, iArr2);
        } else {
            org.bouncycastle.d.c.c.c(17, a, iArr, iArr2);
        }
    }

    public static void d(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = ((i << 1) | org.bouncycastle.d.c.c.a(16, iArr, i << 23, iArr2)) & 511;
    }

    private static void e(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int iA = (i >>> 9) + (org.bouncycastle.d.c.c.a(iArr, i, iArr2) >>> 23) + org.bouncycastle.d.c.c.a(16, iArr, iArr2);
        if (iA > 511 || (iA == 511 && org.bouncycastle.d.c.c.b(16, iArr2, a))) {
            iA = (iA + org.bouncycastle.d.c.c.a(iArr2)) & 511;
        }
        iArr2[16] = iA;
    }

    private static void f(int[] iArr, int[] iArr2) {
        org.bouncycastle.d.c.l.a(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = (i * i) + org.bouncycastle.d.c.c.a(16, i << 1, iArr, iArr2, 16);
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[33];
        org.bouncycastle.d.c.h.d(iArr, iArr2, iArr4);
        int i = 16;
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = 0 + (j9 * j);
        iArr4[16] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr4[17] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr4[18] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr4[19] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr4[20] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr4[21] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr4[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr4[23] = (int) j17;
        iArr4[24] = (int) (j17 >>> 32);
        for (int i2 = 1; i2 < 8; i2++) {
            i++;
            long j18 = ((long) iArr[i2 + 8]) & 4294967295L;
            long j19 = 0 + (j18 * j) + (((long) iArr4[i + 0]) & 4294967295L);
            iArr4[i + 0] = (int) j19;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr4[i + 1]) & 4294967295L);
            iArr4[i + 1] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr4[i + 2]) & 4294967295L);
            iArr4[i + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr4[i + 3]) & 4294967295L);
            iArr4[i + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr4[i + 4]) & 4294967295L);
            iArr4[i + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr4[i + 5]) & 4294967295L);
            iArr4[i + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr4[i + 6]) & 4294967295L);
            iArr4[i + 6] = (int) j25;
            long j26 = (j18 * j8) + (((long) iArr4[i + 7]) & 4294967295L) + (j25 >>> 32);
            iArr4[i + 7] = (int) j26;
            iArr4[i + 8] = (int) (j26 >>> 32);
        }
        int iB = org.bouncycastle.d.c.h.b(iArr4, iArr4);
        int iA = org.bouncycastle.d.c.h.a(iArr4, 24, iArr4, 16, org.bouncycastle.d.c.h.a(iArr4, 0, iArr4, 8, 0) + iB) + iB;
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        boolean z = org.bouncycastle.d.c.h.c(iArr, iArr, iArr5) != org.bouncycastle.d.c.h.c(iArr2, iArr2, iArr6);
        int[] iArr7 = new int[16];
        org.bouncycastle.d.c.h.d(iArr5, iArr6, iArr7);
        org.bouncycastle.d.c.c.a(32, (z ? org.bouncycastle.d.c.c.a(16, iArr7, iArr4, 8) : org.bouncycastle.d.c.c.c(16, iArr7, iArr4, 8)) + iA, iArr4, 24);
        int i3 = iArr[16];
        int i4 = iArr2[16];
        long j27 = 0;
        long j28 = ((long) i3) & 4294967295L;
        long j29 = ((long) i4) & 4294967295L;
        int i5 = 0;
        do {
            long j30 = j27 + ((((long) iArr2[i5]) & 4294967295L) * j28) + ((((long) iArr[i5]) & 4294967295L) * j29) + (((long) iArr4[i5 + 16]) & 4294967295L);
            iArr4[i5 + 16] = (int) j30;
            j27 = j30 >>> 32;
            i5++;
        } while (i5 < 16);
        iArr4[32] = ((int) j27) + (i3 * i4);
        e(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        f(iArr, iArr3);
        e(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[33];
        f(iArr, iArr3);
        e(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            f(iArr2, iArr3);
            e(iArr3, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2 = 0;
        int iC = (org.bouncycastle.d.c.c.c(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iC < 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= 16) {
                    i2 = -1;
                    break;
                }
                int i4 = iArr3[i3] - 1;
                iArr3[i3] = i4;
                if (i4 != -1) {
                    break;
                } else {
                    i3++;
                }
            }
            i = (i2 + iC) & 511;
        } else {
            i = iC;
        }
        iArr3[16] = i;
    }
}
