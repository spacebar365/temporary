package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    static final int[] a = {Integer.MAX_VALUE, -1, -1, -1, -1};
    static final int[] b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int i, int[] iArr) {
        if ((i == 0 || org.bouncycastle.d.c.e.a(i, iArr) == 0) && !(iArr[4] == -1 && org.bouncycastle.d.c.e.b(iArr, a))) {
            return;
        }
        org.bouncycastle.d.c.c.b(5, -2147483647, iArr);
    }

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.d.c.e.b(iArr2, a))) {
            org.bouncycastle.d.c.c.b(5, -2147483647, iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && org.bouncycastle.d.c.e.b(iArr3, a))) {
            org.bouncycastle.d.c.c.b(5, -2147483647, iArr3);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = org.bouncycastle.d.c.e.a(bigInteger);
        if (iArrA[4] == -1 && org.bouncycastle.d.c.e.b(iArrA, a)) {
            org.bouncycastle.d.c.e.d(a, iArrA);
        }
        return iArrA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.e.b(iArr)) {
            org.bouncycastle.d.c.e.d(iArr2);
        } else {
            org.bouncycastle.d.c.e.f(a, iArr, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (j << 31) + (((long) iArr[0]) & 4294967295L) + j + 0;
        iArr2[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j2 << 31) + (((long) iArr[1]) & 4294967295L) + j2;
        iArr2[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31);
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31);
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (((long) iArr[4]) & 4294967295L) + j5 + (j5 << 31);
        iArr2[4] = (int) j10;
        a((int) (j10 >>> 32), iArr2);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((org.bouncycastle.d.c.e.d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && org.bouncycastle.d.c.c.c(10, iArr3, b))) && org.bouncycastle.d.c.c.a(c.length, c, iArr3) != 0) {
            org.bouncycastle.d.c.c.b(10, iArr3, c.length);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.d.c.e.b(iArr2, a))) {
            org.bouncycastle.d.c.c.b(5, -2147483647, iArr2);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        org.bouncycastle.d.c.e.c(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        org.bouncycastle.d.c.e.c(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        org.bouncycastle.d.c.e.c(iArr, iArr3);
        c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            org.bouncycastle.d.c.e.c(iArr2, iArr3);
            c(iArr3, iArr2);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.e.f(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j;
            if ((j >> 32) != 0) {
                org.bouncycastle.d.c.c.a(5, iArr3, 1);
            }
        }
    }
}
