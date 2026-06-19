package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1423j;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ay */
/* JADX INFO: loaded from: classes.dex */
public final class C1259ay {

    /* JADX INFO: renamed from: a */
    static final int[] f4815a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    static final int[] f4816b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f4817c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    /* JADX INFO: renamed from: a */
    public static void m3018a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArr[1]) & 4294967295L) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + j2 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC1416c.m3584b(12, iArr, 5) == 0) && !(iArr[11] == -1 && AbstractC1416c.m3596c(12, iArr, f4815a))) {
            return;
        }
        m3019a(iArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m3019a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (((long) iArr[4]) & 4294967295L) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            AbstractC1416c.m3584b(12, iArr, 5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3021a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && AbstractC1416c.m3596c(12, iArr2, f4815a))) {
            m3019a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3022a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1416c.m3576a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && AbstractC1416c.m3596c(12, iArr3, f4815a))) {
            m3019a(iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3023a(BigInteger bigInteger) {
        int[] iArrM3581a = AbstractC1416c.m3581a(384, bigInteger);
        if (iArrM3581a[11] == -1 && AbstractC1416c.m3596c(12, iArrM3581a, f4815a)) {
            AbstractC1416c.m3601e(12, f4815a, iArrM3581a);
        }
        return iArrM3581a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3024b(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3595c(12, iArr)) {
            AbstractC1416c.m3602e(12, iArr2);
        } else {
            AbstractC1416c.m3594c(12, f4815a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3025b(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((AbstractC1416c.m3576a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && AbstractC1416c.m3596c(24, iArr3, f4816b))) && AbstractC1416c.m3574a(f4817c.length, f4817c, iArr3) != 0) {
            AbstractC1416c.m3584b(24, iArr3, f4817c.length);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3026c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[16]) & 4294967295L;
        long j2 = ((long) iArr[17]) & 4294967295L;
        long j3 = ((long) iArr[18]) & 4294967295L;
        long j4 = ((long) iArr[19]) & 4294967295L;
        long j5 = ((long) iArr[20]) & 4294967295L;
        long j6 = ((long) iArr[21]) & 4294967295L;
        long j7 = ((long) iArr[22]) & 4294967295L;
        long j8 = ((long) iArr[23]) & 4294967295L;
        long j9 = ((((long) iArr[12]) & 4294967295L) + j5) - 1;
        long j10 = (((long) iArr[13]) & 4294967295L) + j7;
        long j11 = (((long) iArr[14]) & 4294967295L) + j7 + j8;
        long j12 = (((long) iArr[15]) & 4294967295L) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = j9 + j14;
        long j17 = 0 + (((long) iArr[0]) & 4294967295L) + j16;
        iArr2[0] = (int) j17;
        long j18 = ((j8 + (((long) iArr[1]) & 4294967295L)) - j9) + j10 + (j17 >> 32);
        iArr2[1] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[2]) & 4294967295L) - j6) - j10) + j11;
        iArr2[2] = (int) j19;
        long j20 = (j19 >> 32) + ((((long) iArr[3]) & 4294967295L) - j11) + j12 + j16;
        iArr2[3] = (int) j20;
        long j21 = (((j6 + ((((long) iArr[4]) & 4294967295L) + j)) + j10) - j12) + j16 + (j20 >> 32);
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + ((((long) iArr[5]) & 4294967295L) - j) + j10 + j11 + j13;
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + (((((long) iArr[6]) & 4294967295L) + j3) - j2) + j11 + j12;
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j) + j4) - j3) + j12;
        iArr2[7] = (int) j24;
        long j25 = ((((j + (((long) iArr[8]) & 4294967295L)) + j2) + j5) - j4) + (j24 >> 32);
        iArr2[8] = (int) j25;
        long j26 = (j25 >> 32) + (((((long) iArr[9]) & 4294967295L) + j3) - j5) + j13;
        iArr2[9] = (int) j26;
        long j27 = (j26 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j3) + j4) - j14) + j15;
        iArr2[10] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j4) + j5) - j15);
        iArr2[11] = (int) j28;
        m3018a((int) ((j28 >> 32) + 1), iArr2);
    }

    /* JADX INFO: renamed from: e */
    public static void m3030e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && AbstractC1416c.m3596c(12, iArr2, f4815a))) {
            m3019a(iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3027c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        AbstractC1423j.m3711a(iArr, iArr2, iArr4);
        m3026c(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: d */
    public static void m3028d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        AbstractC1423j.m3710a(iArr, iArr3);
        m3026c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3020a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[24];
        AbstractC1423j.m3710a(iArr, iArr3);
        m3026c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1423j.m3710a(iArr2, iArr3);
            m3026c(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3029d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1416c.m3594c(12, iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = (j >> 32) + (((long) iArr3[1]) & 4294967295L) + 1;
            iArr3[1] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = j3 + ((((long) iArr3[3]) & 4294967295L) - 1);
            iArr3[3] = (int) j5;
            long j6 = (j5 >> 32) + ((((long) iArr3[4]) & 4294967295L) - 1);
            iArr3[4] = (int) j6;
            if ((j6 >> 32) != 0) {
                AbstractC1416c.m3572a(12, iArr3, 5);
            }
        }
    }
}
