package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class dc {
    private static final long[] a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static int a(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }

    private static void a(long j, long j2, long[] jArr, int i) {
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        long j3 = 0;
        long j4 = jArr2[((int) j) & 7];
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j5 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j4 ^= j5 << i2;
            j3 ^= j5 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j4;
        jArr[i + 1] = (((((72198606942111744L & j) & ((j2 << 7) >> 63)) >>> 8) ^ j3) << 7) ^ (j4 >>> 57);
    }

    public static void a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
    }

    private static void b(long[] jArr) {
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
        jArr[0] = j ^ (j2 << 57);
        jArr[1] = (j2 >>> 7) ^ (j3 << 50);
        jArr[2] = (j3 >>> 14) ^ (j4 << 43);
        jArr[3] = (j4 >>> 21) ^ (j5 << 36);
        jArr[4] = (j5 >>> 28) ^ (j6 << 29);
        jArr[5] = (j6 >>> 35) ^ (j7 << 22);
        jArr[6] = (j7 >>> 42) ^ (j8 << 15);
        jArr[7] = (j8 >>> 49) ^ (j9 << 8);
        jArr[8] = (j9 >>> 56) ^ (j10 << 1);
        jArr[9] = j10 >>> 63;
    }

    public static void c(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((j9 >>> 15) ^ (((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)));
        long j11 = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((j8 >>> 15) ^ (((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)));
        long j12 = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((j7 >>> 15) ^ (((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)));
        long j13 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j14 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((j6 >>> 15) ^ (((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)));
        long j15 = j10 >>> 27;
        jArr2[0] = (((j13 ^ j15) ^ (j15 << 5)) ^ (j15 << 7)) ^ (j15 << 12);
        jArr2[1] = j14;
        jArr2[2] = j12;
        jArr2[3] = j11;
        jArr2[4] = 134217727 & j10;
    }

    private static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr[8] ^ jArr2[8];
    }

    private static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        g(jArr, jArr4);
        g(jArr2, jArr5);
        long[] jArr6 = new long[26];
        a(jArr4[0], jArr5[0], jArr6, 0);
        a(jArr4[1], jArr5[1], jArr6, 2);
        a(jArr4[2], jArr5[2], jArr6, 4);
        a(jArr4[3], jArr5[3], jArr6, 6);
        a(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0] ^ jArr4[1];
        long j2 = jArr5[0] ^ jArr5[1];
        long j3 = jArr4[0] ^ jArr4[2];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr4[2] ^ jArr4[4];
        long j6 = jArr5[2] ^ jArr5[4];
        long j7 = jArr4[3] ^ jArr4[4];
        long j8 = jArr5[3] ^ jArr5[4];
        a(jArr4[3] ^ j3, jArr5[3] ^ j4, jArr6, 18);
        a(jArr4[1] ^ j5, jArr5[1] ^ j6, jArr6, 20);
        long j9 = j ^ j7;
        long j10 = j2 ^ j8;
        long j11 = jArr4[2] ^ j9;
        long j12 = jArr5[2] ^ j10;
        a(j9, j10, jArr6, 22);
        a(j11, j12, jArr6, 24);
        a(j, j2, jArr6, 10);
        a(j3, j4, jArr6, 12);
        a(j5, j6, jArr6, 14);
        a(j7, j8, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j13 = jArr6[0] ^ jArr6[1];
        long j14 = jArr6[2] ^ j13;
        long j15 = jArr6[10] ^ j14;
        jArr3[1] = j15;
        long j16 = jArr6[3] ^ jArr6[4];
        long j17 = j14 ^ ((jArr6[11] ^ jArr6[12]) ^ j16);
        jArr3[2] = j17;
        long j18 = j13 ^ j16;
        long j19 = jArr6[5] ^ jArr6[6];
        long j20 = (j18 ^ j19) ^ jArr6[8];
        long j21 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j20 ^ j21) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j22 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j23 = jArr6[17] ^ j22;
        jArr3[8] = j23;
        long j24 = (j19 ^ j22) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j24;
        long j25 = j15 ^ j24;
        long j26 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = j25 ^ (j26 ^ (jArr6[18] ^ jArr6[23]));
        jArr3[5] = ((j17 ^ j23) ^ j26) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = (((((j20 ^ jArr6[0]) ^ jArr6[9]) ^ j21) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
        b(jArr3);
    }

    private static void g(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = 144115188075855871L & j;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    private static void h(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            org.bouncycastle.d.c.a.a(jArr[i], jArr2, i << 1);
        }
        jArr2[8] = org.bouncycastle.d.c.a.c((int) jArr[4]);
    }

    public static long[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[4];
        long j2 = j >>> 27;
        jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
        jArr[4] = 134217727 & j;
        return jArr;
    }

    public static void b(long[] jArr, long[] jArr2) {
        if (org.bouncycastle.d.c.i.a(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        e(jArr, jArr3);
        b(jArr3, jArr, jArr3);
        a(jArr3, 2, jArr4);
        b(jArr4, jArr3, jArr4);
        a(jArr4, 4, jArr3);
        b(jArr3, jArr4, jArr3);
        a(jArr3, 8, jArr4);
        b(jArr4, jArr3, jArr4);
        e(jArr4, jArr4);
        b(jArr4, jArr, jArr4);
        a(jArr4, 17, jArr3);
        b(jArr3, jArr4, jArr3);
        e(jArr3, jArr3);
        b(jArr3, jArr, jArr3);
        a(jArr3, 35, jArr4);
        b(jArr4, jArr3, jArr4);
        a(jArr4, 70, jArr3);
        b(jArr3, jArr4, jArr3);
        e(jArr3, jArr3);
        b(jArr3, jArr, jArr3);
        a(jArr3, 141, jArr4);
        b(jArr4, jArr3, jArr4);
        e(jArr4, jArr2);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        e(jArr, jArr2, jArr4);
        c(jArr4, jArr3);
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        e(jArr, jArr2, jArr4);
        d(jArr3, jArr4, jArr3);
    }

    public static void d(long[] jArr, long[] jArr2) {
        long jA = org.bouncycastle.d.c.a.a(jArr[0]);
        long jA2 = org.bouncycastle.d.c.a.a(jArr[1]);
        long j = (4294967295L & jA) | (jA2 << 32);
        long jA3 = org.bouncycastle.d.c.a.a(jArr[2]);
        long jA4 = org.bouncycastle.d.c.a.a(jArr[3]);
        long j2 = (4294967295L & jA3) | (jA4 << 32);
        long jA5 = org.bouncycastle.d.c.a.a(jArr[4]);
        b(new long[]{(jA >>> 32) | (jA2 & (-4294967296L)), (jA3 >>> 32) | (jA4 & (-4294967296L)), jA5 >>> 32, 0, 0}, a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j2;
        jArr2[2] = jArr2[2] ^ (4294967295L & jA5);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        h(jArr, jArr3);
        c(jArr3, jArr2);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        h(jArr, jArr3);
        d(jArr2, jArr3, jArr2);
    }

    public static void a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[9];
        h(jArr, jArr3);
        c(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h(jArr2, jArr3);
            c(jArr3, jArr2);
        }
    }
}
