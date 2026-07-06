package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    static final int[] a = {-1, -1, -1, -3};
    static final int[] b = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (j << 1) + (((long) iArr[3]) & 4294967295L);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    private static void a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (((long) iArr[3]) & 4294967295L) + 2);
    }

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && org.bouncycastle.d.c.d.b(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j7 + (j8 << 1);
        long j10 = j6 + (j9 << 1);
        long j11 = j5 + (j10 << 1);
        long j12 = j + j11;
        iArr2[0] = (int) j12;
        long j13 = (j12 >>> 32) + j2 + j10;
        iArr2[1] = (int) j13;
        long j14 = (j13 >>> 32) + j3 + j9;
        iArr2[2] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = j15 + j4 + j8 + (j11 << 1);
        iArr2[3] = (int) j16;
        a((int) (j16 >>> 32), iArr2);
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && org.bouncycastle.d.c.d.b(iArr2, a))) {
            a(iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        if (((int) (j4 >>> 32)) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && org.bouncycastle.d.c.d.b(iArr3, a))) {
            a(iArr3);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        if ((iArr[3] >>> 1) >= 2147483646 && org.bouncycastle.d.c.d.b(iArr, a)) {
            int[] iArr2 = a;
            long j = 0 + ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L));
            iArr[0] = (int) j;
            long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
            iArr[1] = (int) j2;
            long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
            iArr[2] = (int) j3;
            iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32));
        }
        return iArr;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        org.bouncycastle.d.c.d.b(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = 0;
        for (int i = 0; i < 4; i++) {
            long j6 = ((long) iArr[i]) & 4294967295L;
            long j7 = 0 + (j6 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j7;
            long j8 = (j7 >>> 32) + (j6 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j8;
            long j9 = (j8 >>> 32) + (j6 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j9;
            long j10 = (j6 * j4) + (((long) iArr3[i + 3]) & 4294967295L) + (j9 >>> 32);
            iArr3[i + 3] = (int) j10;
            long j11 = j5 + (((long) iArr3[i + 4]) & 4294967295L) + (j10 >>> 32);
            iArr3[i + 4] = (int) j11;
            j5 = j11 >>> 32;
        }
        if (((int) j5) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && org.bouncycastle.d.c.h.d(iArr3, b))) {
            org.bouncycastle.d.c.c.a(c.length, c, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (!org.bouncycastle.d.c.d.b(iArr)) {
            org.bouncycastle.d.c.d.c(a, iArr, iArr2);
            return;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        org.bouncycastle.d.c.d.c(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        org.bouncycastle.d.c.d.c(iArr, iArr3);
        c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            org.bouncycastle.d.c.d.c(iArr2, iArr3);
            c(iArr3, iArr2);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.d.c(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (j2 + ((((long) iArr3[3]) & 4294967295L) - 2));
        }
    }
}
