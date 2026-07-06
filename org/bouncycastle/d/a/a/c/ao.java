package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ao {
    static final int[] a = {-977, -2, -1, -1, -1, -1, -1, -1};
    static final int[] b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    private static final int[] c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.d(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.d.c.h.d(iArr2, a))) {
            org.bouncycastle.d.c.c.a(8, 977, iArr2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.h.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && org.bouncycastle.d.c.h.d(iArr3, a))) {
            org.bouncycastle.d.c.c.a(8, 977, iArr3);
        }
    }

    public static int[] a(BigInteger bigInteger) {
        int[] iArrA = org.bouncycastle.d.c.h.a(bigInteger);
        if (iArrA[7] == -1 && org.bouncycastle.d.c.h.d(iArrA, a)) {
            org.bouncycastle.d.c.h.h(a, iArrA);
        }
        return iArrA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.h.b(iArr)) {
            org.bouncycastle.d.c.h.d(iArr2);
        } else {
            org.bouncycastle.d.c.h.g(a, iArr, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.h.a(org.bouncycastle.d.c.h.f(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.d.c.h.d(iArr2, a))) {
            org.bouncycastle.d.c.c.a(8, 977, iArr2);
        }
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((org.bouncycastle.d.c.h.e(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && org.bouncycastle.d.c.c.c(16, iArr3, b))) && org.bouncycastle.d.c.c.a(c.length, c, iArr3) != 0) {
            org.bouncycastle.d.c.c.b(16, iArr3, c.length);
        }
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.d.c.h.g(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.d.c.c.c(8, 977, iArr3);
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.d.c.c.a(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.d.c.h.d(iArr2, a))) {
            org.bouncycastle.d.c.c.a(8, 977, iArr2);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        org.bouncycastle.d.c.h.d(iArr, iArr2, iArr4);
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
            r4 = 977(0x3d1, double:4.827E-321)
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
            if (r0 != 0) goto L65
            r0 = 0
        L4d:
            if (r0 != 0) goto L5d
        L4f:
            r0 = 7
            r0 = r11[r0]
            r1 = -1
            if (r0 != r1) goto L64
            int[] r0 = org.bouncycastle.d.a.a.c.ao.a
            boolean r0 = org.bouncycastle.d.c.h.d(r11, r0)
            if (r0 == 0) goto L64
        L5d:
            r0 = 8
            r1 = 977(0x3d1, float:1.369E-42)
            org.bouncycastle.d.c.c.a(r0, r1, r11)
        L64:
            return
        L65:
            r0 = 8
            r1 = 3
            int r0 = org.bouncycastle.d.c.c.c(r0, r11, r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.d.a.a.c.ao.a(int, int[]):void");
    }

    public static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        org.bouncycastle.d.c.h.f(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        org.bouncycastle.d.c.h.f(iArr, iArr3);
        c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            org.bouncycastle.d.c.h.f(iArr2, iArr3);
            c(iArr3, iArr2);
        }
    }
}
