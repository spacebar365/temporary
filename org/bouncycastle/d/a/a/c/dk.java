package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class dk {
    private static void a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = (j8 >>> 35) ^ (j9 << 24);
        jArr[8] = (j9 >>> 40) ^ (j10 << 19);
        jArr[9] = (j10 >>> 45) ^ (j11 << 14);
        jArr[10] = (j11 >>> 50) ^ (j12 << 9);
        jArr[11] = ((j12 >>> 55) ^ (j13 << 4)) ^ (j14 << 63);
        jArr[12] = (j13 >>> 60) ^ (j14 >>> 1);
        jArr[13] = 0;
    }

    private static void a(long[] jArr, long j, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        jArr3[1] = j;
        jArr3[2] = jArr3[1] << 1;
        jArr3[3] = jArr3[2] ^ j;
        jArr3[4] = jArr3[2] << 1;
        jArr3[5] = jArr3[4] ^ j;
        jArr3[6] = jArr3[3] << 1;
        jArr3[7] = jArr3[6] ^ j;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 7) {
                return;
            }
            long j2 = jArr[i3];
            int i4 = (int) j2;
            long j3 = 0;
            long j4 = (jArr3[(i4 >>> 3) & 7] << 3) ^ jArr3[i4 & 7];
            int i5 = 54;
            do {
                int i6 = (int) (j2 >>> i5);
                long j5 = jArr3[i6 & 7] ^ (jArr3[(i6 >>> 3) & 7] << 3);
                j4 ^= j5 << i5;
                j3 ^= j5 >>> (-i5);
                i5 -= 6;
            } while (i5 > 0);
            int i7 = i + i3;
            jArr2[i7] = jArr2[i7] ^ (576460752303423487L & j4);
            int i8 = i + i3 + 1;
            jArr2[i8] = ((j4 >>> 59) ^ (j3 << 5)) ^ jArr2[i8];
            i2 = i3 + 1;
        }
    }

    public static void b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = j27 ^ (j29 << 23);
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = 33554431 & j16;
    }

    private static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    private static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        e(jArr, jArr4);
        e(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            a(jArr4, jArr5[i], jArr3, i);
        }
        a(jArr3);
    }

    private static void e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = 576460752303423487L & j;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    private static void f(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            org.bouncycastle.d.c.a.a(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = org.bouncycastle.d.c.a.c((int) jArr[6]);
    }

    public static long[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[6];
        long j2 = j >>> 25;
        jArr[0] = jArr[0] ^ j2;
        jArr[1] = (j2 << 23) ^ jArr[1];
        jArr[6] = 33554431 & j;
        return jArr;
    }

    public static void a(long[] jArr, long[] jArr2) {
        if (org.bouncycastle.d.c.k.a(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[7];
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        c(jArr, jArr3);
        a(jArr3, 1, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr4, 1, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 3, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 6, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 12, jArr4);
        a(jArr3, jArr4, jArr5);
        a(jArr5, 24, jArr3);
        a(jArr3, 24, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 48, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 96, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 192, jArr4);
        a(jArr3, jArr4, jArr3);
        a(jArr3, jArr5, jArr2);
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        d(jArr, jArr2, jArr4);
        b(jArr4, jArr3);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        d(jArr, jArr2, jArr4);
        c(jArr3, jArr4, jArr3);
    }

    public static void c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        f(jArr, jArr3);
        b(jArr3, jArr2);
    }

    public static void d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        f(jArr, jArr3);
        c(jArr2, jArr3, jArr2);
    }

    public static void a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[13];
        f(jArr, jArr3);
        b(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            f(jArr2, jArr3);
            b(jArr3, jArr2);
        }
    }
}
