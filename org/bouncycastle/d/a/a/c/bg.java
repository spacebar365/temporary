package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bg {
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

    public static void b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = j7 & 562949953421311L;
    }

    private static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
    }

    private static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = 144115188075855871L & ((jArr2[1] << 7) ^ (j4 >>> 57));
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        a(j3, j6, jArr4, 0);
        a(j2, j5, jArr4, 2);
        a(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    private static void e(long[] jArr, long[] jArr2) {
        org.bouncycastle.d.c.a.a(jArr[0], jArr2, 0);
        org.bouncycastle.d.c.a.a(jArr[1], jArr2, 2);
    }

    public static long[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[2];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[1];
        long j2 = j >>> 49;
        jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
        jArr[1] = 562949953421311L & j;
        return jArr;
    }

    public static void a(long[] jArr, long[] jArr2) {
        if (org.bouncycastle.d.c.d.a(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[2];
        long[] jArr4 = new long[2];
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
        a(jArr4, 28, jArr3);
        a(jArr3, jArr4, jArr3);
        a(jArr3, 56, jArr4);
        a(jArr4, jArr3, jArr4);
        c(jArr4, jArr2);
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        d(jArr, jArr2, jArr4);
        b(jArr4, jArr3);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        d(jArr, jArr2, jArr4);
        c(jArr3, jArr4, jArr3);
    }

    public static void c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        e(jArr, jArr3);
        b(jArr3, jArr2);
    }

    public static void d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        e(jArr, jArr3);
        c(jArr2, jArr3, jArr2);
    }

    public static void a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
        e(jArr, jArr3);
        b(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            e(jArr2, jArr3);
            b(jArr3, jArr2);
        }
    }
}
