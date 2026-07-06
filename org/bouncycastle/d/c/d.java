package org.bouncycastle.d.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static void a(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
    }

    public static void a(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
    }

    public static boolean a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L & ((long) iArr2[0]);
        long j2 = 4294967295L & ((long) iArr2[1]);
        long j3 = 4294967295L & ((long) iArr2[2]);
        long j4 = 4294967295L & ((long) iArr2[3]);
        long j5 = ((long) iArr[0]) & 4294967295L;
        long j6 = 0 + (j5 * j);
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j5 * j4) + (j8 >>> 32);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i = 1; i < 4; i++) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = 0 + (j10 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j11;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j12;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j13;
            long j14 = (j10 * j4) + (((long) iArr3[i + 3]) & 4294967295L) + (j13 >>> 32);
            iArr3[i + 3] = (int) j14;
            iArr3[i + 4] = (int) (j14 >>> 32);
        }
    }

    public static boolean b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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

    public static int c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L));
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 3;
        int i2 = 8;
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
                long j18 = (j13 & 4294967295L) + (j * j15);
                int i10 = (int) j18;
                iArr2[3] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long j19 = (j18 >>> 32) + (j15 * j5) + (j14 & 4294967295L);
                long j20 = (j19 >>> 32) + (j15 * j9) + (j16 & 4294967295L);
                long j21 = (j20 >>> 32) + j17;
                int i12 = (int) j19;
                iArr2[4] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) (j20 & 4294967295L);
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j21;
                iArr2[6] = i15 | (i16 << 1);
                iArr2[7] = (i16 >>> 31) | ((iArr2[7] + ((int) (j21 >>> 32))) << 1);
                return;
            }
            i = i4;
        }
    }
}
