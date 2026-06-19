package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1421h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1249ao {

    /* JADX INFO: renamed from: a */
    static final int[] f4796a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4797b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4798c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    /* JADX INFO: renamed from: a */
    public static void m2995a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && AbstractC1421h.m3700d(iArr2, f4796a))) {
            AbstractC1416c.m3568a(8, 977, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2996a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1421h.m3682a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && AbstractC1421h.m3700d(iArr3, f4796a))) {
            AbstractC1416c.m3568a(8, 977, iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m2997a(BigInteger bigInteger) {
        int[] iArrM3688a = AbstractC1421h.m3688a(bigInteger);
        if (iArrM3688a[7] == -1 && AbstractC1421h.m3700d(iArrM3688a, f4796a)) {
            AbstractC1421h.m3707h(f4796a, iArrM3688a);
        }
        return iArrM3688a;
    }

    /* JADX INFO: renamed from: b */
    public static void m2998b(int[] iArr, int[] iArr2) {
        if (AbstractC1421h.m3691b(iArr)) {
            AbstractC1421h.m3698d(iArr2);
        } else {
            AbstractC1421h.m3705g(f4796a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3000c(int[] iArr, int[] iArr2) {
        if (AbstractC1421h.m3678a(AbstractC1421h.m3703f(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[7] == -1 && AbstractC1421h.m3700d(iArr2, f4796a))) {
            AbstractC1416c.m3568a(8, 977, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3001c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1421h.m3702e(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && AbstractC1416c.m3596c(16, iArr3, f4797b))) && AbstractC1416c.m3574a(f4798c.length, f4798c, iArr3) != 0) {
            AbstractC1416c.m3584b(16, iArr3, f4798c.length);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3003d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1421h.m3705g(iArr, iArr2, iArr3) != 0) {
            AbstractC1416c.m3591c(8, 977, iArr3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3004e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && AbstractC1421h.m3700d(iArr2, f4796a))) {
            AbstractC1416c.m3568a(8, 977, iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2999b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        AbstractC1421h.m3699d(iArr, iArr2, iArr4);
        m3000c(iArr4, iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2993a(int r10, int[] r11) {
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
            int[] r0 = org.bouncycastle.p107d.p108a.p109a.p112c.C1249ao.f4796a
            boolean r0 = org.bouncycastle.p107d.p117c.AbstractC1421h.m3700d(r11, r0)
            if (r0 == 0) goto L64
        L5d:
            r0 = 8
            r1 = 977(0x3d1, float:1.369E-42)
            org.bouncycastle.p107d.p117c.AbstractC1416c.m3568a(r0, r1, r11)
        L64:
            return
        L65:
            r0 = 8
            r1 = 3
            int r0 = org.bouncycastle.p107d.p117c.AbstractC1416c.m3592c(r0, r11, r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p107d.p108a.p109a.p112c.C1249ao.m2993a(int, int[]):void");
    }

    /* JADX INFO: renamed from: d */
    public static void m3002d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC1421h.m3704f(iArr, iArr3);
        m3000c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m2994a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC1421h.m3704f(iArr, iArr3);
        m3000c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1421h.m3704f(iArr2, iArr3);
            m3000c(iArr3, iArr2);
        }
    }
}
