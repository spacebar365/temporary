package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1419f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1363z {

    /* JADX INFO: renamed from: a */
    static final int[] f4963a = {-1, -1, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4964b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4965c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    /* JADX INFO: renamed from: a */
    public static void m3243a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + j2 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC1416c.m3584b(6, iArr, 3) == 0) && !(iArr[5] == -1 && AbstractC1419f.m3651c(iArr, f4963a))) {
            return;
        }
        m3244a(iArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m3244a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (((long) iArr[2]) & 4294967295L) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            AbstractC1416c.m3584b(6, iArr, 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3246a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && AbstractC1419f.m3651c(iArr2, f4963a))) {
            m3244a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3247a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1419f.m3636a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && AbstractC1419f.m3651c(iArr3, f4963a))) {
            m3244a(iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3248a(BigInteger bigInteger) {
        int[] iArrM3643a = AbstractC1419f.m3643a(bigInteger);
        if (iArrM3643a[5] == -1 && AbstractC1419f.m3651c(iArrM3643a, f4963a)) {
            AbstractC1419f.m3658f(f4963a, iArrM3643a);
        }
        return iArrM3643a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3249b(int[] iArr, int[] iArr2) {
        if (AbstractC1419f.m3645b(iArr)) {
            AbstractC1419f.m3653d(iArr2);
        } else {
            AbstractC1419f.m3660g(f4963a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3251c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = 0 + (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (j7 >> 32) + (((long) iArr[1]) & 4294967295L) + j6;
        iArr2[1] = (int) j8;
        long j9 = j3 + j5;
        long j10 = j4 + j6;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = 4294967295L & j11;
        long j13 = (j11 >> 32) + (((long) iArr[3]) & 4294967295L) + j10;
        iArr2[3] = (int) j13;
        long j14 = (j9 - j) + (((long) iArr[4]) & 4294967295L) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + (j10 - j2) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j15;
        long j16 = j15 >> 32;
        long j17 = j12 + j16;
        long j18 = j16 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) iArr2[1]) & 4294967295L);
            iArr2[1] = (int) j20;
            j17 += j20 >> 32;
        }
        iArr2[2] = (int) j17;
        if (((j17 >> 32) == 0 || AbstractC1416c.m3584b(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && AbstractC1419f.m3651c(iArr2, f4963a))) {
            return;
        }
        m3244a(iArr2);
    }

    /* JADX INFO: renamed from: c */
    public static void m3252c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1419f.m3656e(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && AbstractC1416c.m3596c(12, iArr3, f4964b))) && AbstractC1416c.m3574a(f4965c.length, f4965c, iArr3) != 0) {
            AbstractC1416c.m3584b(12, iArr3, f4965c.length);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3255e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && AbstractC1419f.m3651c(iArr2, f4963a))) {
            m3244a(iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3250b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        AbstractC1419f.m3655d(iArr, iArr2, iArr4);
        m3251c(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: d */
    public static void m3253d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC1419f.m3654d(iArr, iArr3);
        m3251c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3245a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC1419f.m3654d(iArr, iArr3);
        m3251c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1419f.m3654d(iArr2, iArr3);
            m3251c(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3254d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1419f.m3660g(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = j2 + ((((long) iArr3[2]) & 4294967295L) - 1);
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                AbstractC1416c.m3572a(6, iArr3, 3);
            }
        }
    }
}
