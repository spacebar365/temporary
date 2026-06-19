package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1420g;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C1239ae {

    /* JADX INFO: renamed from: a */
    static final int[] f4775a = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4776b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4777c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* JADX INFO: renamed from: a */
    public static void m2967a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && AbstractC1420g.m3672c(iArr2, f4775a))) {
            AbstractC1416c.m3568a(7, 6803, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2968a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1420g.m3662a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && AbstractC1420g.m3672c(iArr3, f4775a))) {
            AbstractC1416c.m3568a(7, 6803, iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m2969a(BigInteger bigInteger) {
        int[] iArrM3666a = AbstractC1420g.m3666a(bigInteger);
        if (iArrM3666a[6] == -1 && AbstractC1420g.m3672c(iArrM3666a, f4775a)) {
            AbstractC1416c.m3568a(7, 6803, iArrM3666a);
        }
        return iArrM3666a;
    }

    /* JADX INFO: renamed from: b */
    public static void m2970b(int[] iArr, int[] iArr2) {
        if (AbstractC1420g.m3668b(iArr)) {
            AbstractC1420g.m3674d(iArr2);
        } else {
            AbstractC1420g.m3677f(f4775a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2972c(int[] iArr, int[] iArr2) {
        if (AbstractC1420g.m3661a(AbstractC1420g.m3676e(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[6] == -1 && AbstractC1420g.m3672c(iArr2, f4775a))) {
            AbstractC1416c.m3568a(7, 6803, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2973c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1420g.m3673d(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && AbstractC1416c.m3596c(14, iArr3, f4776b))) && AbstractC1416c.m3574a(f4777c.length, f4777c, iArr3) != 0) {
            AbstractC1416c.m3584b(14, iArr3, f4777c.length);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2975d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1420g.m3677f(iArr, iArr2, iArr3) != 0) {
            AbstractC1416c.m3591c(7, 6803, iArr3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2976e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && AbstractC1420g.m3672c(iArr2, f4775a))) {
            AbstractC1416c.m3568a(7, 6803, iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2971b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        AbstractC1420g.m3671c(iArr, iArr2, iArr4);
        m2972c(iArr4, iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2965a(int r10, int[] r11) {
        /*
            if (r10 == 0) goto L4f
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 0
            r4 = 6803(0x1a93, double:3.361E-320)
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
            r0 = 6
            r0 = r11[r0]
            r1 = -1
            if (r0 != r1) goto L63
            int[] r0 = org.bouncycastle.p107d.p108a.p109a.p112c.C1239ae.f4775a
            boolean r0 = org.bouncycastle.p107d.p117c.AbstractC1420g.m3672c(r11, r0)
            if (r0 == 0) goto L63
        L5d:
            r0 = 7
            r1 = 6803(0x1a93, float:9.533E-42)
            org.bouncycastle.p107d.p117c.AbstractC1416c.m3568a(r0, r1, r11)
        L63:
            return
        L64:
            r0 = 7
            r1 = 3
            int r0 = org.bouncycastle.p107d.p117c.AbstractC1416c.m3592c(r0, r11, r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p107d.p108a.p109a.p112c.C1239ae.m2965a(int, int[]):void");
    }

    /* JADX INFO: renamed from: d */
    public static void m2974d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC1420g.m3675d(iArr, iArr3);
        m2972c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m2966a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC1420g.m3675d(iArr, iArr3);
        m2972c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1420g.m3675d(iArr2, iArr3);
            m2972c(iArr3, iArr2);
        }
    }
}
