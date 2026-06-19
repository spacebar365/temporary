package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1418e;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1348k {

    /* JADX INFO: renamed from: a */
    static final int[] f4933a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4934b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4935c = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* JADX INFO: renamed from: a */
    public static void m3207a(int i, int[] iArr) {
        if ((i == 0 || AbstractC1418e.m3614a(i, iArr) == 0) && !(iArr[4] == -1 && AbstractC1418e.m3623b(iArr, f4933a))) {
            return;
        }
        AbstractC1416c.m3583b(5, -2147483647, iArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m3209a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && AbstractC1418e.m3623b(iArr2, f4933a))) {
            AbstractC1416c.m3583b(5, -2147483647, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3210a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1418e.m3616a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && AbstractC1418e.m3623b(iArr3, f4933a))) {
            AbstractC1416c.m3583b(5, -2147483647, iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3211a(BigInteger bigInteger) {
        int[] iArrM3620a = AbstractC1418e.m3620a(bigInteger);
        if (iArrM3620a[4] == -1 && AbstractC1418e.m3623b(iArrM3620a, f4933a)) {
            AbstractC1418e.m3627d(f4933a, iArrM3620a);
        }
        return iArrM3620a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3212b(int[] iArr, int[] iArr2) {
        if (AbstractC1418e.m3622b(iArr)) {
            AbstractC1418e.m3629d(iArr2);
        } else {
            AbstractC1418e.m3631f(f4933a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3214c(int[] iArr, int[] iArr2) {
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
        m3207a((int) (j10 >>> 32), iArr2);
    }

    /* JADX INFO: renamed from: c */
    public static void m3215c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1418e.m3628d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && AbstractC1416c.m3596c(10, iArr3, f4934b))) && AbstractC1416c.m3574a(f4935c.length, f4935c, iArr3) != 0) {
            AbstractC1416c.m3584b(10, iArr3, f4935c.length);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3218e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && AbstractC1418e.m3623b(iArr2, f4933a))) {
            AbstractC1416c.m3583b(5, -2147483647, iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3213b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        AbstractC1418e.m3626c(iArr, iArr2, iArr4);
        m3214c(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: d */
    public static void m3216d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        AbstractC1418e.m3625c(iArr, iArr3);
        m3214c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3208a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        AbstractC1418e.m3625c(iArr, iArr3);
        m3214c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1418e.m3625c(iArr2, iArr3);
            m3214c(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3217d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1418e.m3631f(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j;
            if ((j >> 32) != 0) {
                AbstractC1416c.m3572a(5, iArr3, 1);
            }
        }
    }
}
