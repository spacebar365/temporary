package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    static final int[] a = {-21389, -2, -1, -1, -1};
    static final int[] b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    private static final int[] c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.d.c.e.b(iArr2, a))) {
            org.bouncycastle.d.c.c.a(5, 21389, iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && org.bouncycastle.d.c.e.b(iArr3, a))) {
            org.bouncycastle.d.c.c.a(5, 21389, iArr3);
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
        if (org.bouncycastle.d.c.e.a(org.bouncycastle.d.c.e.e(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.d.c.e.b(iArr2, a))) {
            org.bouncycastle.d.c.c.a(5, 21389, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((org.bouncycastle.d.c.e.d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && org.bouncycastle.d.c.c.c(10, iArr3, b))) && org.bouncycastle.d.c.c.a(c.length, c, iArr3) != 0) {
            org.bouncycastle.d.c.c.b(10, iArr3, c.length);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.e.f(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.d.c.c.c(5, 21389, iArr3);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.d.c.e.b(iArr2, a))) {
            org.bouncycastle.d.c.c.a(5, 21389, iArr2);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        org.bouncycastle.d.c.e.c(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r10, int[] r11) {
        /*
            if (r10 == 0) goto L4f
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 0
            r4 = 21389(0x538d, double:1.05676E-319)
            long r4 = r4 * r0
            r6 = 0
            r6 = r11[r6]
            long r6 = (long) r6
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            long r4 = r4 + r6
            long r2 = r2 + r4
            r4 = 0
            int r5 = (int) r2
            r11[r4] = r5
            r4 = 32
            long r2 = r2 >>> r4
            r4 = 1
            r4 = r11[r4]
            long r4 = (long) r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r0 = r0 + r4
            long r0 = r0 + r2
            r2 = 1
            int r3 = (int) r0
            r11[r2] = r3
            r2 = 32
            long r0 = r0 >>> r2
            r2 = 2
            r2 = r11[r2]
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 + r2
            r2 = 2
            int r3 = (int) r0
            r11[r2] = r3
            r2 = 32
            long r0 = r0 >>> r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L64
            r0 = 0
        L4d:
            if (r0 != 0) goto L5d
        L4f:
            r0 = 4
            r0 = r11[r0]
            r1 = -1
            if (r0 != r1) goto L63
            int[] r0 = org.bouncycastle.d.a.a.c.p.a
            boolean r0 = org.bouncycastle.d.c.e.b(r11, r0)
            if (r0 == 0) goto L63
        L5d:
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            org.bouncycastle.d.c.c.a(r0, r1, r11)
        L63:
            return
        L64:
            r0 = 5
            r1 = 3
            int r0 = org.bouncycastle.d.c.c.c(r0, r11, r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.d.a.a.c.p.a(int, int[]):void");
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
}
