package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1418e;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1353p {

    /* JADX INFO: renamed from: a */
    static final int[] f4943a = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4944b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4945c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    /* JADX INFO: renamed from: a */
    public static void m3221a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && AbstractC1418e.m3623b(iArr2, f4943a))) {
            AbstractC1416c.m3568a(5, 21389, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3222a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1418e.m3616a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && AbstractC1418e.m3623b(iArr3, f4943a))) {
            AbstractC1416c.m3568a(5, 21389, iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3223a(BigInteger bigInteger) {
        int[] iArrM3620a = AbstractC1418e.m3620a(bigInteger);
        if (iArrM3620a[4] == -1 && AbstractC1418e.m3623b(iArrM3620a, f4943a)) {
            AbstractC1418e.m3627d(f4943a, iArrM3620a);
        }
        return iArrM3620a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3224b(int[] iArr, int[] iArr2) {
        if (AbstractC1418e.m3622b(iArr)) {
            AbstractC1418e.m3629d(iArr2);
        } else {
            AbstractC1418e.m3631f(f4943a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3226c(int[] iArr, int[] iArr2) {
        if (AbstractC1418e.m3615a(AbstractC1418e.m3630e(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[4] == -1 && AbstractC1418e.m3623b(iArr2, f4943a))) {
            AbstractC1416c.m3568a(5, 21389, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3227c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1418e.m3628d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && AbstractC1416c.m3596c(10, iArr3, f4944b))) && AbstractC1416c.m3574a(f4945c.length, f4945c, iArr3) != 0) {
            AbstractC1416c.m3584b(10, iArr3, f4945c.length);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3229d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1418e.m3631f(iArr, iArr2, iArr3) != 0) {
            AbstractC1416c.m3591c(5, 21389, iArr3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3230e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && AbstractC1418e.m3623b(iArr2, f4943a))) {
            AbstractC1416c.m3568a(5, 21389, iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3225b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        AbstractC1418e.m3626c(iArr, iArr2, iArr4);
        m3226c(iArr4, iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3219a(int r10, int[] r11) {
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
            int[] r0 = org.bouncycastle.p107d.p108a.p109a.p112c.C1353p.f4943a
            boolean r0 = org.bouncycastle.p107d.p117c.AbstractC1418e.m3623b(r11, r0)
            if (r0 == 0) goto L63
        L5d:
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            org.bouncycastle.p107d.p117c.AbstractC1416c.m3568a(r0, r1, r11)
        L63:
            return
        L64:
            r0 = 5
            r1 = 3
            int r0 = org.bouncycastle.p107d.p117c.AbstractC1416c.m3592c(r0, r11, r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p107d.p108a.p109a.p112c.C1353p.m3219a(int, int[]):void");
    }

    /* JADX INFO: renamed from: d */
    public static void m3228d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        AbstractC1418e.m3625c(iArr, iArr3);
        m3226c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3220a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        AbstractC1418e.m3625c(iArr, iArr3);
        m3226c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1418e.m3625c(iArr2, iArr3);
            m3226c(iArr3, iArr2);
        }
    }
}
