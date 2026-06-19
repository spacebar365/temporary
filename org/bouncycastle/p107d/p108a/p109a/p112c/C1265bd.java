package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p107d.p117c.AbstractC1425l;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C1265bd {

    /* JADX INFO: renamed from: a */
    static final int[] f4828a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    /* JADX INFO: renamed from: a */
    public static void m3031a(int[] iArr) {
        int i = iArr[16];
        int iM3583b = (i & 511) + AbstractC1416c.m3583b(16, i >>> 9, iArr);
        if (iM3583b > 511 || (iM3583b == 511 && AbstractC1416c.m3590b(16, iArr, f4828a))) {
            iM3583b = (iM3583b + AbstractC1416c.m3577a(iArr)) & 511;
        }
        iArr[16] = iM3583b;
    }

    /* JADX INFO: renamed from: a */
    public static void m3033a(int[] iArr, int[] iArr2) {
        int iM3598d = AbstractC1416c.m3598d(16, iArr, iArr2) + iArr[16];
        if (iM3598d > 511 || (iM3598d == 511 && AbstractC1416c.m3590b(16, iArr2, f4828a))) {
            iM3598d = (iM3598d + AbstractC1416c.m3577a(iArr2)) & 511;
        }
        iArr2[16] = iM3598d;
    }

    /* JADX INFO: renamed from: a */
    public static void m3034a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iM3576a = AbstractC1416c.m3576a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iM3576a > 511 || (iM3576a == 511 && AbstractC1416c.m3590b(16, iArr3, f4828a))) {
            iM3576a = (iM3576a + AbstractC1416c.m3577a(iArr3)) & 511;
        }
        iArr3[16] = iM3576a;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3035a(BigInteger bigInteger) {
        int[] iArrM3581a = AbstractC1416c.m3581a(521, bigInteger);
        if (AbstractC1416c.m3590b(17, iArrM3581a, f4828a)) {
            AbstractC1416c.m3602e(17, iArrM3581a);
        }
        return iArrM3581a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3036b(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3595c(17, iArr)) {
            AbstractC1416c.m3602e(17, iArr2);
        } else {
            AbstractC1416c.m3594c(17, f4828a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3040d(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = ((i << 1) | AbstractC1416c.m3573a(16, iArr, i << 23, iArr2)) & 511;
    }

    /* JADX INFO: renamed from: e */
    private static void m3041e(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int iM3578a = (i >>> 9) + (AbstractC1416c.m3578a(iArr, i, iArr2) >>> 23) + AbstractC1416c.m3574a(16, iArr, iArr2);
        if (iM3578a > 511 || (iM3578a == 511 && AbstractC1416c.m3590b(16, iArr2, f4828a))) {
            iM3578a = (iM3578a + AbstractC1416c.m3577a(iArr2)) & 511;
        }
        iArr2[16] = iM3578a;
    }

    /* JADX INFO: renamed from: f */
    private static void m3042f(int[] iArr, int[] iArr2) {
        AbstractC1425l.m3714a(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = (i * i) + AbstractC1416c.m3570a(16, i << 1, iArr, iArr2, 16);
    }

    /* JADX INFO: renamed from: b */
    public static void m3037b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[33];
        AbstractC1421h.m3699d(iArr, iArr2, iArr4);
        int i = 16;
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = 0 + (j9 * j);
        iArr4[16] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr4[17] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr4[18] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr4[19] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr4[20] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr4[21] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr4[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr4[23] = (int) j17;
        iArr4[24] = (int) (j17 >>> 32);
        for (int i2 = 1; i2 < 8; i2++) {
            i++;
            long j18 = ((long) iArr[i2 + 8]) & 4294967295L;
            long j19 = 0 + (j18 * j) + (((long) iArr4[i + 0]) & 4294967295L);
            iArr4[i + 0] = (int) j19;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr4[i + 1]) & 4294967295L);
            iArr4[i + 1] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr4[i + 2]) & 4294967295L);
            iArr4[i + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr4[i + 3]) & 4294967295L);
            iArr4[i + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr4[i + 4]) & 4294967295L);
            iArr4[i + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr4[i + 5]) & 4294967295L);
            iArr4[i + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr4[i + 6]) & 4294967295L);
            iArr4[i + 6] = (int) j25;
            long j26 = (j18 * j8) + (((long) iArr4[i + 7]) & 4294967295L) + (j25 >>> 32);
            iArr4[i + 7] = (int) j26;
            iArr4[i + 8] = (int) (j26 >>> 32);
        }
        int iM3689b = AbstractC1421h.m3689b(iArr4, iArr4);
        int iM3679a = AbstractC1421h.m3679a(iArr4, 24, iArr4, 16, AbstractC1421h.m3679a(iArr4, 0, iArr4, 8, 0) + iM3689b) + iM3689b;
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        boolean z = AbstractC1421h.m3697c(iArr, iArr, iArr5) != AbstractC1421h.m3697c(iArr2, iArr2, iArr6);
        int[] iArr7 = new int[16];
        AbstractC1421h.m3699d(iArr5, iArr6, iArr7);
        AbstractC1416c.m3569a(32, (z ? AbstractC1416c.m3575a(16, iArr7, iArr4, 8) : AbstractC1416c.m3593c(16, iArr7, iArr4, 8)) + iM3679a, iArr4, 24);
        int i3 = iArr[16];
        int i4 = iArr2[16];
        long j27 = 0;
        long j28 = ((long) i3) & 4294967295L;
        long j29 = ((long) i4) & 4294967295L;
        int i5 = 0;
        do {
            long j30 = j27 + ((((long) iArr2[i5]) & 4294967295L) * j28) + ((((long) iArr[i5]) & 4294967295L) * j29) + (((long) iArr4[i5 + 16]) & 4294967295L);
            iArr4[i5 + 16] = (int) j30;
            j27 = j30 >>> 32;
            i5++;
        } while (i5 < 16);
        iArr4[32] = ((int) j27) + (i3 * i4);
        m3041e(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3038c(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        m3042f(iArr, iArr3);
        m3041e(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3032a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[33];
        m3042f(iArr, iArr3);
        m3041e(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            m3042f(iArr2, iArr3);
            m3041e(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3039c(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2 = 0;
        int iM3594c = (AbstractC1416c.m3594c(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iM3594c < 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= 16) {
                    i2 = -1;
                    break;
                }
                int i4 = iArr3[i3] - 1;
                iArr3[i3] = i4;
                if (i4 != -1) {
                    break;
                } else {
                    i3++;
                }
            }
            i = (i2 + iM3594c) & 511;
        } else {
            i = iM3594c;
        }
        iArr3[16] = i;
    }
}
