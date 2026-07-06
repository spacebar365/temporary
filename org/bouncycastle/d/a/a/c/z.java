package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    static final int[] a = {-1, -1, -2, -1, -1, -1};
    static final int[] b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + j2 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || org.bouncycastle.d.c.c.b(6, iArr, 3) == 0) && !(iArr[5] == -1 && org.bouncycastle.d.c.f.c(iArr, a))) {
            return;
        }
        a(iArr);
    }

    private static void a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (((long) iArr[2]) & 4294967295L) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            org.bouncycastle.d.c.c.b(6, iArr, 3);
        }
    }

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && org.bouncycastle.d.c.f.c(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && org.bouncycastle.d.c.f.c(iArr3, a))) {
            a(iArr3);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = org.bouncycastle.d.c.f.a(bigInteger);
        if (iArrA[5] == -1 && org.bouncycastle.d.c.f.c(iArrA, a)) {
            org.bouncycastle.d.c.f.f(a, iArrA);
        }
        return iArrA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.f.b(iArr)) {
            org.bouncycastle.d.c.f.d(iArr2);
        } else {
            org.bouncycastle.d.c.f.g(a, iArr, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = 0 + (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (j7 >> 32) + (((long) iArr[1]) & 4294967295L) + j6;
        iArr2[1] = (int) j8;
        long j9 = j3 + j5;
        long j10 = j4 + j6;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = 4294967295L & j11;
        long j13 = (j11 >> 32) + (((long) iArr[3]) & 4294967295L) + j10;
        iArr2[3] = (int) j13;
        long j14 = (j9 - j) + (((long) iArr[4]) & 4294967295L) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + (j10 - j2) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j15;
        long j16 = j15 >> 32;
        long j17 = j12 + j16;
        long j18 = j16 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) iArr2[1]) & 4294967295L);
            iArr2[1] = (int) j20;
            j17 += j20 >> 32;
        }
        iArr2[2] = (int) j17;
        if (((j17 >> 32) == 0 || org.bouncycastle.d.c.c.b(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && org.bouncycastle.d.c.f.c(iArr2, a))) {
            return;
        }
        a(iArr2);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((org.bouncycastle.d.c.f.e(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && org.bouncycastle.d.c.c.c(12, iArr3, b))) && org.bouncycastle.d.c.c.a(c.length, c, iArr3) != 0) {
            org.bouncycastle.d.c.c.b(12, iArr3, c.length);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && org.bouncycastle.d.c.f.c(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        org.bouncycastle.d.c.f.d(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        org.bouncycastle.d.c.f.d(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        org.bouncycastle.d.c.f.d(iArr, iArr3);
        c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            org.bouncycastle.d.c.f.d(iArr2, iArr3);
            c(iArr3, iArr2);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.f.g(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = j2 + ((((long) iArr3[2]) & 4294967295L) - 1);
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                org.bouncycastle.d.c.c.a(6, iArr3, 3);
            }
        }
    }
}
