package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1417d;
import org.bouncycastle.p107d.p117c.C1414a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bg */
/* JADX INFO: loaded from: classes.dex */
public final class C1268bg {
    /* JADX INFO: renamed from: a */
    private static void m3043a(long j, long j2, long[] jArr, int i) {
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

    /* JADX INFO: renamed from: b */
    public static void m3048b(long[] jArr, long[] jArr2) {
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

    /* JADX INFO: renamed from: c */
    private static void m3051c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
    }

    /* JADX INFO: renamed from: d */
    private static void m3053d(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = 144115188075855871L & ((jArr2[1] << 7) ^ (j4 >>> 57));
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        m3043a(j3, j6, jArr4, 0);
        m3043a(j2, j5, jArr4, 2);
        m3043a(j3 ^ j2, j6 ^ j5, jArr4, 4);
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

    /* JADX INFO: renamed from: e */
    private static void m3054e(long[] jArr, long[] jArr2) {
        C1414a.m3561a(jArr[0], jArr2, 0);
        C1414a.m3561a(jArr[1], jArr2, 2);
    }

    /* JADX INFO: renamed from: a */
    public static long[] m3047a(BigInteger bigInteger) {
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

    /* JADX INFO: renamed from: a */
    public static void m3045a(long[] jArr, long[] jArr2) {
        if (AbstractC1417d.m3608a(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[2];
        long[] jArr4 = new long[2];
        m3050c(jArr, jArr3);
        m3046a(jArr3, jArr, jArr3);
        m3050c(jArr3, jArr3);
        m3046a(jArr3, jArr, jArr3);
        m3044a(jArr3, 3, jArr4);
        m3046a(jArr4, jArr3, jArr4);
        m3050c(jArr4, jArr4);
        m3046a(jArr4, jArr, jArr4);
        m3044a(jArr4, 7, jArr3);
        m3046a(jArr3, jArr4, jArr3);
        m3044a(jArr3, 14, jArr4);
        m3046a(jArr4, jArr3, jArr4);
        m3044a(jArr4, 28, jArr3);
        m3046a(jArr3, jArr4, jArr3);
        m3044a(jArr3, 56, jArr4);
        m3046a(jArr4, jArr3, jArr4);
        m3050c(jArr4, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3046a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        m3053d(jArr, jArr2, jArr4);
        m3048b(jArr4, jArr3);
    }

    /* JADX INFO: renamed from: b */
    public static void m3049b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        m3053d(jArr, jArr2, jArr4);
        m3051c(jArr3, jArr4, jArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3050c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        m3054e(jArr, jArr3);
        m3048b(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: d */
    public static void m3052d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        m3054e(jArr, jArr3);
        m3051c(jArr2, jArr3, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3044a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
        m3054e(jArr, jArr3);
        m3048b(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            m3054e(jArr2, jArr3);
            m3048b(jArr3, jArr2);
        }
    }
}
