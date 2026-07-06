package org.bouncycastle.d.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int a(long j, int[] iArr) {
        long j2 = 4294967295L & j;
        long j3 = 0 + (6803 * j2) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = j2 + (6803 * j4) + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[2]) & 4294967295L) + j4;
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[3]) & 4294967295L);
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return c.c(7, iArr, 4);
    }

    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void a(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static void a(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
    }

    public static boolean a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static boolean b(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger c(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                org.bouncycastle.f.g.a(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L & ((long) iArr2[0]);
        long j2 = 4294967295L & ((long) iArr2[1]);
        long j3 = 4294967295L & ((long) iArr2[2]);
        long j4 = 4294967295L & ((long) iArr2[3]);
        long j5 = 4294967295L & ((long) iArr2[4]);
        long j6 = 4294967295L & ((long) iArr2[5]);
        long j7 = 4294967295L & ((long) iArr2[6]);
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = 0 + (j8 * j);
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        for (int i = 1; i < 7; i++) {
            long j16 = ((long) iArr[i]) & 4294967295L;
            long j17 = 0 + (j16 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j17;
            long j18 = (j17 >>> 32) + (j16 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j18;
            long j19 = (j18 >>> 32) + (j16 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j19;
            long j20 = (j19 >>> 32) + (j16 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j20;
            long j21 = (j20 >>> 32) + (j16 * j5) + (((long) iArr3[i + 4]) & 4294967295L);
            iArr3[i + 4] = (int) j21;
            long j22 = (j21 >>> 32) + (j16 * j6) + (((long) iArr3[i + 5]) & 4294967295L);
            iArr3[i + 5] = (int) j22;
            long j23 = (j16 * j7) + (((long) iArr3[i + 6]) & 4294967295L) + (j22 >>> 32);
            iArr3[i + 6] = (int) j23;
            iArr3[i + 7] = (int) (j23 >>> 32);
        }
    }

    public static boolean c(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    public static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        for (int i = 0; i < 7; i++) {
            long j9 = ((long) iArr[i]) & 4294967295L;
            long j10 = 0 + (j9 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j10;
            long j11 = (j10 >>> 32) + (j9 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j11;
            long j12 = (j11 >>> 32) + (j9 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j12;
            long j13 = (j12 >>> 32) + (j9 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j13;
            long j14 = (j13 >>> 32) + (j9 * j5) + (((long) iArr3[i + 4]) & 4294967295L);
            iArr3[i + 4] = (int) j14;
            long j15 = (j14 >>> 32) + (j9 * j6) + (((long) iArr3[i + 5]) & 4294967295L);
            iArr3[i + 5] = (int) j15;
            long j16 = (j9 * j7) + (((long) iArr3[i + 6]) & 4294967295L) + (j15 >>> 32);
            iArr3[i + 6] = (int) j16;
            long j17 = j8 + (((long) iArr3[i + 7]) & 4294967295L) + (j16 >>> 32);
            iArr3[i + 7] = (int) j17;
            j8 = j17 >>> 32;
        }
        return (int) j8;
    }

    public static void d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static void d(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 6;
        int i2 = 14;
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
                long j25 = (j19 & 4294967295L) + (j22 * j);
                int i12 = (int) j25;
                iArr2[4] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j26 = (j25 >>> 32) + (j22 * j5) + (j20 & 4294967295L);
                long j27 = (j26 >>> 32) + (j22 * j9) + (j21 & 4294967295L);
                long j28 = (j27 >>> 32) + (j22 * j15) + (j23 & 4294967295L);
                long j29 = (j28 >>> 32) + j24;
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (((long) iArr2[9]) & 4294967295L) + (j29 >>> 32);
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j33 = (j26 & 4294967295L) + (j30 * j);
                int i14 = (int) j33;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long j34 = (j33 >>> 32) + (j30 * j5) + (j27 & 4294967295L);
                long j35 = (j34 >>> 32) + (j30 * j9) + (j28 & 4294967295L);
                long j36 = (j35 >>> 32) + (j30 * j15) + (j29 & 4294967295L);
                long j37 = (j36 >>> 32) + (j30 * j22) + (j31 & 4294967295L);
                long j38 = (j37 >>> 32) + j32;
                long j39 = ((long) iArr[6]) & 4294967295L;
                long j40 = (((long) iArr2[11]) & 4294967295L) + (j38 >>> 32);
                long j41 = (((long) iArr2[12]) & 4294967295L) + (j40 >>> 32);
                long j42 = (j34 & 4294967295L) + (j * j39);
                int i16 = (int) j42;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long j43 = (j42 >>> 32) + (j39 * j5) + (j35 & 4294967295L);
                long j44 = (j43 >>> 32) + (j39 * j9) + (j36 & 4294967295L);
                long j45 = (j44 >>> 32) + (j39 * j15) + (j37 & 4294967295L);
                long j46 = (j45 >>> 32) + (j39 * j22) + (j38 & 4294967295L);
                long j47 = (j46 >>> 32) + (j39 * j30) + (j40 & 4294967295L);
                long j48 = (j47 >>> 32) + j41;
                int i18 = (int) j43;
                iArr2[7] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j44;
                iArr2[8] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j45;
                iArr2[9] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j46;
                iArr2[10] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j47;
                iArr2[11] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j48;
                iArr2[12] = i27 | (i28 << 1);
                iArr2[13] = (i28 >>> 31) | ((iArr2[13] + ((int) (j48 >>> 32))) << 1);
                return;
            }
            i = i4;
        }
    }

    public static long e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = 0 + (6803 * j) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = j + (6803 * j3) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j4;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (j4 >>> 32) + j3 + (6803 * j5) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = ((long) iArr[10]) & 4294967295L;
        long j8 = (j6 >>> 32) + j5 + (6803 * j7) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j8;
        long j9 = ((long) iArr[11]) & 4294967295L;
        long j10 = (j8 >>> 32) + j7 + (6803 * j9) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j10;
        long j11 = ((long) iArr[12]) & 4294967295L;
        long j12 = (j10 >>> 32) + j9 + (6803 * j11) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j12;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = (j12 >>> 32) + j11 + (6803 * j13) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    public static int f(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }
}
