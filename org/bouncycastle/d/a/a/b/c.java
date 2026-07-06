package org.bouncycastle.d.a.a.b;

import java.math.BigInteger;
import org.bouncycastle.d.c.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    static final int[] a = {-1, -1, 0, -1, -1, -1, -1, -2};
    static final int[] b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

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
            long j6 = j4 + ((((long) iArr[2]) & 4294967295L) - j2);
            iArr[2] = (int) j6;
            long j7 = (j6 >> 32) + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = j8 + j2 + (((long) iArr[7]) & 4294967295L);
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && h.d(iArr, a))) {
            a(iArr);
        }
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
        long j4 = j2 + ((((long) iArr[2]) & 4294967295L) - 1);
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + (((long) iArr[7]) & 4294967295L) + 1);
    }

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.d(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.a(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && h.d(iArr3, a))) {
            a(iArr3);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = h.a(bigInteger);
        if ((iArrA[7] >>> 1) >= Integer.MAX_VALUE && h.d(iArrA, a)) {
            h.h(a, iArrA);
        }
        return iArrA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (h.b(iArr)) {
            h.d(iArr2);
        } else {
            h.g(a, iArr, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = (j8 << 1) + j10;
        long j12 = j + j2 + j10;
        long j13 = j5 + j8 + j9 + j12;
        long j14 = 0 + (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8;
        iArr2[0] = (int) j14;
        long j15 = (j14 >> 32) + (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8;
        iArr2[1] = (int) j15;
        long j16 = ((((long) iArr[2]) & 4294967295L) - j12) + (j15 >> 32);
        iArr2[2] = (int) j16;
        long j17 = ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6 + (j16 >> 32);
        iArr2[3] = (int) j17;
        long j18 = ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7 + (j17 >> 32);
        iArr2[4] = (int) j18;
        long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L) + j11 + j3;
        iArr2[5] = (int) j19;
        long j20 = (j19 >> 32) + (((long) iArr[6]) & 4294967295L) + j4 + j7 + j8;
        iArr2[6] = (int) j20;
        long j21 = (j20 >> 32) + (((long) iArr[7]) & 4294967295L) + j13 + j11 + j5;
        iArr2[7] = (int) j21;
        a((int) (j21 >> 32), iArr2);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.e(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.d.c.c.c(16, iArr3, b))) {
            org.bouncycastle.d.c.c.e(16, b, iArr3);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.d(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        h.d(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        h.f(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        h.f(iArr, iArr3);
        c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h.f(iArr2, iArr3);
            c(iArr3, iArr2);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.g(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = j2 + (((long) iArr3[2]) & 4294967295L) + 1;
            iArr3[2] = (int) j4;
            long j5 = (j4 >> 32) + ((((long) iArr3[3]) & 4294967295L) - 1);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr3[6]) & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (j6 + ((((long) iArr3[7]) & 4294967295L) - 1));
        }
    }
}
