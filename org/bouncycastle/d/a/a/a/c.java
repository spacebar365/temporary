package org.bouncycastle.d.a.a.a;

import java.math.BigInteger;
import org.bouncycastle.d.c.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    private static int a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long jB = j >> 32;
        if (jB != 0) {
            jB = org.bouncycastle.d.c.c.b(7, iArr, 1);
        }
        long j2 = jB + ((((long) iArr[7]) & 4294967295L) - 2147483648L);
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    public static void a(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + org.bouncycastle.d.c.c.b(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (h.d(iArr, a)) {
            a(iArr);
        }
    }

    public static void a(int[] iArr, int[] iArr2) {
        org.bouncycastle.d.c.c.d(8, iArr, iArr2);
        if (h.d(iArr2, a)) {
            a(iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        h.a(iArr, iArr2, iArr3);
        if (h.d(iArr3, a)) {
            a(iArr3);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = h.a(bigInteger);
        while (h.d(iArrA, a)) {
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
        int i = iArr[7];
        org.bouncycastle.d.c.c.b(iArr, i, iArr2);
        int iE = h.e(iArr, iArr2) << 1;
        int i2 = iArr2[7];
        iArr2[7] = org.bouncycastle.d.c.c.b(7, (((i2 >>> 31) - (i >>> 31)) + iE) * 19, iArr2) + (Integer.MAX_VALUE & i2);
        if (h.d(iArr2, a)) {
            a(iArr2);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        org.bouncycastle.d.c.c.a(8, iArr, 0, iArr2);
        if (h.d(iArr2, a)) {
            a(iArr2);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        h.d(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        h.e(iArr, iArr2, iArr3);
        if (org.bouncycastle.d.c.c.c(16, iArr3, b)) {
            long j = (((long) iArr3[0]) & 4294967295L) - (((long) b[0]) & 4294967295L);
            iArr3[0] = (int) j;
            long jA = j >> 32;
            if (jA != 0) {
                jA = org.bouncycastle.d.c.c.a(8, iArr3, 1);
            }
            long j2 = jA + (((long) iArr3[8]) & 4294967295L) + 19;
            iArr3[8] = (int) j2;
            long jB = j2 >> 32;
            if (jB != 0) {
                jB = org.bouncycastle.d.c.c.b(15, iArr3, 9);
            }
            iArr3[15] = (int) (jB + ((((long) iArr3[15]) & 4294967295L) - (((long) (b[15] + 1)) & 4294967295L)));
        }
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
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long jA = j >> 32;
            if (jA != 0) {
                jA = org.bouncycastle.d.c.c.a(7, iArr3, 1);
            }
            iArr3[7] = (int) (jA + (((long) iArr3[7]) & 4294967295L) + 2147483648L);
        }
    }
}
