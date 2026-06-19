package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1419f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1358u {

    /* JADX INFO: renamed from: a */
    static final int[] f4953a = {-4553, -2, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4954b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4955c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    /* JADX INFO: renamed from: a */
    public static void m3233a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && AbstractC1419f.m3651c(iArr2, f4953a))) {
            AbstractC1416c.m3568a(6, 4553, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3234a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1419f.m3636a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && AbstractC1419f.m3651c(iArr3, f4953a))) {
            AbstractC1416c.m3568a(6, 4553, iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3235a(BigInteger bigInteger) {
        int[] iArrM3643a = AbstractC1419f.m3643a(bigInteger);
        if (iArrM3643a[5] == -1 && AbstractC1419f.m3651c(iArrM3643a, f4953a)) {
            AbstractC1419f.m3658f(f4953a, iArrM3643a);
        }
        return iArrM3643a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3236b(int[] iArr, int[] iArr2) {
        if (AbstractC1419f.m3645b(iArr)) {
            AbstractC1419f.m3653d(iArr2);
        } else {
            AbstractC1419f.m3660g(f4953a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3238c(int[] iArr, int[] iArr2) {
        if (AbstractC1419f.m3632a(AbstractC1419f.m3659f(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[5] == -1 && AbstractC1419f.m3651c(iArr2, f4953a))) {
            AbstractC1416c.m3568a(6, 4553, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3239c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1419f.m3656e(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && AbstractC1416c.m3596c(12, iArr3, f4954b))) && AbstractC1416c.m3574a(f4955c.length, f4955c, iArr3) != 0) {
            AbstractC1416c.m3584b(12, iArr3, f4955c.length);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3241d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1419f.m3660g(iArr, iArr2, iArr3) != 0) {
            AbstractC1416c.m3591c(6, 4553, iArr3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3242e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && AbstractC1419f.m3651c(iArr2, f4953a))) {
            AbstractC1416c.m3568a(6, 4553, iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3237b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        AbstractC1419f.m3655d(iArr, iArr2, iArr4);
        m3238c(iArr4, iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3231a(int r10, int[] r11) {
        /*
            if (r10 == 0) goto L4f
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 0
            r4 = 4553(0x11c9, double:2.2495E-320)
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
            r0 = 5
            r0 = r11[r0]
            r1 = -1
            if (r0 != r1) goto L63
            int[] r0 = org.bouncycastle.p107d.p108a.p109a.p112c.C1358u.f4953a
            boolean r0 = org.bouncycastle.p107d.p117c.AbstractC1419f.m3651c(r11, r0)
            if (r0 == 0) goto L63
        L5d:
            r0 = 6
            r1 = 4553(0x11c9, float:6.38E-42)
            org.bouncycastle.p107d.p117c.AbstractC1416c.m3568a(r0, r1, r11)
        L63:
            return
        L64:
            r0 = 6
            r1 = 3
            int r0 = org.bouncycastle.p107d.p117c.AbstractC1416c.m3592c(r0, r11, r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p107d.p108a.p109a.p112c.C1358u.m3231a(int, int[]):void");
    }

    /* JADX INFO: renamed from: d */
    public static void m3240d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC1419f.m3654d(iArr, iArr3);
        m3238c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3232a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC1419f.m3654d(iArr, iArr3);
        m3238c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1419f.m3654d(iArr2, iArr3);
            m3238c(iArr3, iArr2);
        }
    }
}
