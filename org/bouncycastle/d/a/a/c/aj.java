package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class aj {
    static final int[] a = {1, 0, 0, -1, -1, -1, -1};
    static final int[] b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + j2 + (((long) iArr[3]) & 4294967295L);
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || org.bouncycastle.d.c.c.b(7, iArr, 4) == 0) && !(iArr[6] == -1 && org.bouncycastle.d.c.g.c(iArr, a))) {
            return;
        }
        a(iArr);
    }

    private static void a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            org.bouncycastle.d.c.c.b(7, iArr, 4);
        }
    }

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && org.bouncycastle.d.c.g.c(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && org.bouncycastle.d.c.g.c(iArr3, a))) {
            a(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.g.b(iArr)) {
            org.bouncycastle.d.c.g.d(iArr2);
        } else {
            org.bouncycastle.d.c.g.f(a, iArr, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = 0 + ((((long) iArr[0]) & 4294967295L) - j5);
        long j9 = 4294967295L & j8;
        long j10 = (j8 >> 32) + ((((long) iArr[1]) & 4294967295L) - j6);
        iArr2[1] = (int) j10;
        long j11 = (j10 >> 32) + ((((long) iArr[2]) & 4294967295L) - j7);
        iArr2[2] = (int) j11;
        long j12 = ((j5 + (((long) iArr[3]) & 4294967295L)) - j) + (j11 >> 32);
        long j13 = ((j6 + (((long) iArr[4]) & 4294967295L)) - j2) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = (j13 >> 32) + (((((long) iArr[5]) & 4294967295L) + j7) - j3);
        iArr2[5] = (int) j14;
        long j15 = ((j + (((long) iArr[6]) & 4294967295L)) - j4) + (j14 >> 32);
        iArr2[6] = (int) j15;
        long j16 = 1 + (j15 >> 32);
        long j17 = (4294967295L & j12) + j16;
        long j18 = j9 - j16;
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) iArr2[1]) & 4294967295L);
            iArr2[1] = (int) j20;
            long j21 = (j20 >> 32) + (((long) iArr2[2]) & 4294967295L);
            iArr2[2] = (int) j21;
            j17 += j21 >> 32;
        }
        iArr2[3] = (int) j17;
        if (((j17 >> 32) == 0 || org.bouncycastle.d.c.c.b(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && org.bouncycastle.d.c.g.c(iArr2, a))) {
            return;
        }
        a(iArr2);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((org.bouncycastle.d.c.g.d(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && org.bouncycastle.d.c.c.c(14, iArr3, b))) && org.bouncycastle.d.c.c.a(c.length, c, iArr3) != 0) {
            org.bouncycastle.d.c.c.b(14, iArr3, c.length);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && org.bouncycastle.d.c.g.c(iArr2, a))) {
            a(iArr2);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = org.bouncycastle.d.c.g.a(bigInteger);
        if (iArrA[6] == -1 && org.bouncycastle.d.c.g.c(iArrA, a)) {
            int[] iArr = a;
            long j = 0 + ((((long) iArrA[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L));
            iArrA[0] = (int) j;
            long j2 = (j >> 32) + ((((long) iArrA[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
            iArrA[1] = (int) j2;
            long j3 = (j2 >> 32) + ((((long) iArrA[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
            iArrA[2] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArrA[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
            iArrA[3] = (int) j4;
            long j5 = (j4 >> 32) + ((((long) iArrA[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
            iArrA[4] = (int) j5;
            long j6 = (j5 >> 32) + ((((long) iArrA[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
            iArrA[5] = (int) j6;
            iArrA[6] = (int) ((j6 >> 32) + ((((long) iArrA[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)));
        }
        return iArrA;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        org.bouncycastle.d.c.g.c(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        org.bouncycastle.d.c.g.d(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        org.bouncycastle.d.c.g.d(iArr, iArr3);
        c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            org.bouncycastle.d.c.g.d(iArr2, iArr3);
            c(iArr3, iArr2);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.g.f(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = j2 + ((((long) iArr3[3]) & 4294967295L) - 1);
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                org.bouncycastle.d.c.c.a(7, iArr3, 4);
            }
        }
    }
}
