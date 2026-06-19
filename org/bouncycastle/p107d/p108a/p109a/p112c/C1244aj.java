package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1420g;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C1244aj {

    /* JADX INFO: renamed from: a */
    static final int[] f4786a = {1, 0, 0, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4787b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4788c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    /* JADX INFO: renamed from: a */
    public static void m2977a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + j2 + (((long) iArr[3]) & 4294967295L);
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC1416c.m3584b(7, iArr, 4) == 0) && !(iArr[6] == -1 && AbstractC1420g.m3672c(iArr, f4786a))) {
            return;
        }
        m2978a(iArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m2978a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            AbstractC1416c.m3584b(7, iArr, 4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2980a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && AbstractC1420g.m3672c(iArr2, f4786a))) {
            m2978a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2981a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1420g.m3662a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && AbstractC1420g.m3672c(iArr3, f4786a))) {
            m2978a(iArr3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2983b(int[] iArr, int[] iArr2) {
        if (AbstractC1420g.m3668b(iArr)) {
            AbstractC1420g.m3674d(iArr2);
        } else {
            AbstractC1420g.m3677f(f4786a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2985c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = 0 + ((((long) iArr[0]) & 4294967295L) - j5);
        long j9 = 4294967295L & j8;
        long j10 = (j8 >> 32) + ((((long) iArr[1]) & 4294967295L) - j6);
        iArr2[1] = (int) j10;
        long j11 = (j10 >> 32) + ((((long) iArr[2]) & 4294967295L) - j7);
        iArr2[2] = (int) j11;
        long j12 = ((j5 + (((long) iArr[3]) & 4294967295L)) - j) + (j11 >> 32);
        long j13 = ((j6 + (((long) iArr[4]) & 4294967295L)) - j2) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = (j13 >> 32) + (((((long) iArr[5]) & 4294967295L) + j7) - j3);
        iArr2[5] = (int) j14;
        long j15 = ((j + (((long) iArr[6]) & 4294967295L)) - j4) + (j14 >> 32);
        iArr2[6] = (int) j15;
        long j16 = 1 + (j15 >> 32);
        long j17 = (4294967295L & j12) + j16;
        long j18 = j9 - j16;
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) iArr2[1]) & 4294967295L);
            iArr2[1] = (int) j20;
            long j21 = (j20 >> 32) + (((long) iArr2[2]) & 4294967295L);
            iArr2[2] = (int) j21;
            j17 += j21 >> 32;
        }
        iArr2[3] = (int) j17;
        if (((j17 >> 32) == 0 || AbstractC1416c.m3584b(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && AbstractC1420g.m3672c(iArr2, f4786a))) {
            return;
        }
        m2978a(iArr2);
    }

    /* JADX INFO: renamed from: c */
    public static void m2986c(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1420g.m3673d(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && AbstractC1416c.m3596c(14, iArr3, f4787b))) && AbstractC1416c.m3574a(f4788c.length, f4788c, iArr3) != 0) {
            AbstractC1416c.m3584b(14, iArr3, f4788c.length);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2989e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && AbstractC1420g.m3672c(iArr2, f4786a))) {
            m2978a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m2982a(BigInteger bigInteger) {
        int[] iArrM3666a = AbstractC1420g.m3666a(bigInteger);
        if (iArrM3666a[6] == -1 && AbstractC1420g.m3672c(iArrM3666a, f4786a)) {
            int[] iArr = f4786a;
            long j = 0 + ((((long) iArrM3666a[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L));
            iArrM3666a[0] = (int) j;
            long j2 = (j >> 32) + ((((long) iArrM3666a[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
            iArrM3666a[1] = (int) j2;
            long j3 = (j2 >> 32) + ((((long) iArrM3666a[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
            iArrM3666a[2] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArrM3666a[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
            iArrM3666a[3] = (int) j4;
            long j5 = (j4 >> 32) + ((((long) iArrM3666a[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
            iArrM3666a[4] = (int) j5;
            long j6 = (j5 >> 32) + ((((long) iArrM3666a[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
            iArrM3666a[5] = (int) j6;
            iArrM3666a[6] = (int) ((j6 >> 32) + ((((long) iArrM3666a[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)));
        }
        return iArrM3666a;
    }

    /* JADX INFO: renamed from: b */
    public static void m2984b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        AbstractC1420g.m3671c(iArr, iArr2, iArr4);
        m2985c(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: d */
    public static void m2987d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC1420g.m3675d(iArr, iArr3);
        m2985c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m2979a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC1420g.m3675d(iArr, iArr3);
        m2985c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1420g.m3675d(iArr2, iArr3);
            m2985c(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2988d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1420g.m3677f(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = j2 + ((((long) iArr3[3]) & 4294967295L) - 1);
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                AbstractC1416c.m3572a(7, iArr3, 4);
            }
        }
    }
}
