package org.bouncycastle.p107d.p117c;

import java.math.BigInteger;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.d.c.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1418e {
    /* JADX INFO: renamed from: a */
    public static int m3614a(int i, int[] iArr) {
        long j = ((((long) i) & 4294967295L) * 2147483649L) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return AbstractC1416c.m3592c(5, iArr, 2);
    }

    /* JADX INFO: renamed from: a */
    public static int m3615a(long j, int[] iArr) {
        long j2 = 4294967295L & j;
        long j3 = 0 + (21389 * j2) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = j2 + (21389 * j4) + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[2]) & 4294967295L) + j4;
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[3]) & 4294967295L);
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return AbstractC1416c.m3592c(5, iArr, 4);
    }

    /* JADX INFO: renamed from: a */
    public static int m3616a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    /* JADX INFO: renamed from: a */
    public static void m3617a(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3618a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3619a(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m3621b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3622b(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3623b(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = iArr2[i] ^ Integer.MIN_VALUE;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m3624c(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC1556g.m4136a(i2, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static void m3625c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 4;
        int i2 = 10;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j2 = ((long) iArr[i]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i2 - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i5 - 1;
            iArr2[i2] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & 4294967295L;
                long j6 = ((long) iArr2[2]) & 4294967295L;
                long j7 = ((((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i6 = (int) j7;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                int i7 = i6 >>> 31;
                long j8 = (j7 >>> 32) + j6;
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = j8 + (j9 * j);
                int i8 = (int) j12;
                iArr2[2] = i7 | (i8 << 1);
                int i9 = i8 >>> 31;
                long j13 = (j12 >>> 32) + (j9 * j5) + j10;
                long j14 = (j13 >>> 32) + j11;
                long j15 = ((long) iArr[3]) & 4294967295L;
                long j16 = (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j16 >>> 32);
                long j18 = (j13 & 4294967295L) + (j15 * j);
                int i10 = (int) j18;
                iArr2[3] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long j19 = (j18 >>> 32) + (j15 * j5) + (j14 & 4294967295L);
                long j20 = (j19 >>> 32) + (j15 * j9) + (j16 & 4294967295L);
                long j21 = (j20 >>> 32) + j17;
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j25 = (j19 & 4294967295L) + (j * j22);
                int i12 = (int) j25;
                iArr2[4] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j26 = (j25 >>> 32) + (j22 * j5) + (j20 & 4294967295L);
                long j27 = (j26 >>> 32) + (j22 * j9) + (j21 & 4294967295L);
                long j28 = (j27 >>> 32) + (j22 * j15) + (j23 & 4294967295L);
                long j29 = (j28 >>> 32) + j24;
                int i14 = (int) j26;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j27;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j28;
                iArr2[7] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j29;
                iArr2[8] = i19 | (i20 << 1);
                iArr2[9] = (i20 >>> 31) | ((iArr2[9] + ((int) (j29 >>> 32))) << 1);
                return;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3626c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L & ((long) iArr2[0]);
        long j2 = 4294967295L & ((long) iArr2[1]);
        long j3 = 4294967295L & ((long) iArr2[2]);
        long j4 = 4294967295L & ((long) iArr2[3]);
        long j5 = 4294967295L & ((long) iArr2[4]);
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = 0 + (j6 * j);
        iArr3[0] = (int) j7;
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        for (int i = 1; i < 5; i++) {
            long j12 = ((long) iArr[i]) & 4294967295L;
            long j13 = 0 + (j12 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j13;
            long j14 = (j13 >>> 32) + (j12 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j14;
            long j15 = (j14 >>> 32) + (j12 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j15;
            long j16 = (j15 >>> 32) + (j12 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j16;
            long j17 = (j12 * j5) + (((long) iArr3[i + 4]) & 4294967295L) + (j16 >>> 32);
            iArr3[i + 4] = (int) j17;
            iArr3[i + 5] = (int) (j17 >>> 32);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m3627d(int[] iArr, int[] iArr2) {
        long j = 0 + ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L));
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    /* JADX INFO: renamed from: d */
    public static int m3628d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = 0;
        for (int i = 0; i < 5; i++) {
            long j7 = ((long) iArr[i]) & 4294967295L;
            long j8 = 0 + (j7 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j8;
            long j9 = (j8 >>> 32) + (j7 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j9;
            long j10 = (j9 >>> 32) + (j7 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j10;
            long j11 = (j10 >>> 32) + (j7 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j11;
            long j12 = (j7 * j5) + (((long) iArr3[i + 4]) & 4294967295L) + (j11 >>> 32);
            iArr3[i + 4] = (int) j12;
            long j13 = j6 + (((long) iArr3[i + 5]) & 4294967295L) + (j12 >>> 32);
            iArr3[i + 5] = (int) j13;
            j6 = j13 >>> 32;
        }
        return (int) j6;
    }

    /* JADX INFO: renamed from: d */
    public static void m3629d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }

    /* JADX INFO: renamed from: e */
    public static long m3630e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = 0 + (21389 * j) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[6]) & 4294967295L;
        long j4 = j + (21389 * j3) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j4;
        long j5 = ((long) iArr[7]) & 4294967295L;
        long j6 = (j4 >>> 32) + j3 + (21389 * j5) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = ((long) iArr[8]) & 4294967295L;
        long j8 = (j6 >>> 32) + j5 + (21389 * j7) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j8;
        long j9 = ((long) iArr[9]) & 4294967295L;
        long j10 = (j8 >>> 32) + j7 + (21389 * j9) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j10;
        return (j10 >>> 32) + j9;
    }

    /* JADX INFO: renamed from: f */
    public static int m3631f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L));
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3620a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }
}
