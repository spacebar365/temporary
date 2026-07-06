package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cp {
    private static void a(long j, long j2, long[] jArr, int i) {
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        int i2 = (int) j;
        long j3 = 0;
        long j4 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j4 ^= j5 << i3;
            j3 ^= j5 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j4);
        int i5 = i + 1;
        jArr[i5] = ((j4 >>> 59) ^ (j3 << 5)) ^ jArr[i5];
    }

    private static void a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = j8 >>> 35;
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
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13 ^ (j15 << 10);
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    private static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
    }

    private static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        e(jArr, jArr4);
        e(jArr2, jArr5);
        a(jArr4[0], jArr5[0], jArr3, 0);
        a(jArr4[1], jArr5[1], jArr3, 1);
        a(jArr4[2], jArr5[2], jArr3, 2);
        a(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        a(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        a(j, j3, jArr6, 0);
        a(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = (j6 ^ j7) ^ jArr3[4];
        jArr3[5] = jArr3[5] ^ j7;
        a(jArr3);
    }

    private static void e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = 576460752303423487L & j;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    private static void f(long[] jArr, long[] jArr2) {
        org.bouncycastle.d.c.a.a(jArr[0], jArr2, 0);
        org.bouncycastle.d.c.a.a(jArr[1], jArr2, 2);
        org.bouncycastle.d.c.a.a(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = org.bouncycastle.d.c.a.c((int) j);
        jArr2[7] = ((long) org.bouncycastle.d.c.a.b((int) (j >>> 32))) & 4294967295L;
    }

    public static long[] a(BigInteger bigInteger) {
        long[] jArrB = org.bouncycastle.d.c.h.b(bigInteger);
        long j = jArrB[3];
        long j2 = j >>> 41;
        jArrB[0] = jArrB[0] ^ j2;
        jArrB[1] = (j2 << 10) ^ jArrB[1];
        jArrB[3] = j & 2199023255551L;
        return jArrB;
    }

    public static void a(long[] jArr, long[] jArr2) {
        if (org.bouncycastle.d.c.h.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        c(jArr, jArr3);
        a(jArr3, jArr, jArr3);
        c(jArr3, jArr3);
        a(jArr3, jArr, jArr3);
        a(jArr3, 3, jArr4);
        a(jArr4, jArr3, jArr4);
        c(jArr4, jArr4);
        a(jArr4, jArr, jArr4);
        a(jArr4, 7, jArr3);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 14, jArr4);
        a(jArr4, jArr3, jArr4);
        c(jArr4, jArr4);
        a(jArr4, jArr, jArr4);
        a(jArr4, 29, jArr3);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 58, jArr4);
        a(jArr4, jArr3, jArr4);
        a(jArr4, 116, jArr3);
        a(jArr3, jArr4, jArr3);
        c(jArr3, jArr2);
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        d(jArr, jArr2, jArr4);
        b(jArr4, jArr3);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        d(jArr, jArr2, jArr4);
        c(jArr3, jArr4, jArr3);
    }

    public static void c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        f(jArr, jArr3);
        b(jArr3, jArr2);
    }

    public static void d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        f(jArr, jArr3);
        c(jArr2, jArr3, jArr2);
    }

    public static void a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
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
