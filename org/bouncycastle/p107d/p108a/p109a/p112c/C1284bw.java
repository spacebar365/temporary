package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p107d.p117c.C1414a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bw */
/* JADX INFO: loaded from: classes.dex */
public final class C1284bw {

    /* JADX INFO: renamed from: a */
    private static final long[] f4850a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    /* JADX INFO: renamed from: a */
    public static int m3080a(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m3081a(long j, long j2, long[] jArr, int i) {
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        long j3 = 0;
        long j4 = jArr2[((int) j) & 3];
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j5 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j4 ^= j5 << i2;
            j3 ^= j5 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j4;
        jArr[i + 1] = (j4 >>> 55) ^ (j3 << 9);
    }

    /* JADX INFO: renamed from: a */
    public static void m3083a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* JADX INFO: renamed from: a */
    public static void m3084a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
    }

    /* JADX INFO: renamed from: b */
    private static void m3086b(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    /* JADX INFO: renamed from: c */
    public static void m3089c(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((j6 >>> 28) ^ (((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    /* JADX INFO: renamed from: d */
    private static void m3092d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
    }

    /* JADX INFO: renamed from: e */
    private static void m3094e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (jArr2[2] << 18) ^ (j7 >>> 46);
        long j9 = ((j7 << 9) ^ (j6 >>> 55)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        m3081a(j5, j10, jArr4, 0);
        m3081a(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        m3081a(j11, j12, jArr4, 4);
        long j13 = (j3 << 2) ^ (j4 << 1);
        long j14 = (j8 << 2) ^ (j9 << 1);
        m3081a(j5 ^ j13, j10 ^ j14, jArr4, 6);
        m3081a(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6] ^ jArr4[8];
        long j16 = jArr4[7] ^ jArr4[9];
        long j17 = (j15 << 1) ^ jArr4[6];
        long j18 = (j15 ^ (j16 << 1)) ^ jArr4[7];
        long j19 = jArr4[0];
        long j20 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j21 = jArr4[1] ^ jArr4[5];
        long j22 = ((j17 ^ j19) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j23 = (((j18 ^ j20) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j22 >>> 55);
        long j24 = (j16 ^ j21) ^ (j23 >>> 55);
        long j25 = j23 & 36028797018963967L;
        long j26 = ((j22 & 36028797018963967L) >>> 1) ^ ((1 & j25) << 54);
        long j27 = j26 ^ (j26 << 1);
        long j28 = j27 ^ (j27 << 2);
        long j29 = j28 ^ (j28 << 4);
        long j30 = j29 ^ (j29 << 8);
        long j31 = j30 ^ (j30 << 16);
        long j32 = (j31 ^ (j31 << 32)) & 36028797018963967L;
        long j33 = ((j25 >>> 1) ^ ((1 & j24) << 54)) ^ (j32 >>> 54);
        long j34 = j33 ^ (j33 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (j38 ^ (j38 << 32)) & 36028797018963967L;
        long j40 = (j24 >>> 1) ^ (j39 >>> 54);
        long j41 = j40 ^ (j40 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = j45 ^ (j45 << 32);
        jArr3[0] = j19;
        jArr3[1] = (j20 ^ j32) ^ jArr4[2];
        jArr3[2] = (j32 ^ (j21 ^ j39)) ^ jArr4[3];
        jArr3[3] = j39 ^ j46;
        jArr3[4] = j46 ^ jArr4[2];
        jArr3[5] = jArr4[3];
        m3086b(jArr3);
    }

    /* JADX INFO: renamed from: g */
    private static void m3096g(long[] jArr, long[] jArr2) {
        C1414a.m3561a(jArr[0], jArr2, 0);
        C1414a.m3561a(jArr[1], jArr2, 2);
        long j = jArr[2];
        jArr2[4] = C1414a.m3564c((int) j);
        jArr2[5] = ((long) C1414a.m3559a((int) (j >>> 32))) & 4294967295L;
    }

    /* JADX INFO: renamed from: a */
    public static long[] m3085a(BigInteger bigInteger) {
        long[] jArrM3648b = AbstractC1419f.m3648b(bigInteger);
        long j = jArrM3648b[2];
        long j2 = j >>> 35;
        jArrM3648b[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArrM3648b[0];
        jArrM3648b[2] = j & 34359738367L;
        return jArrM3648b;
    }

    /* JADX INFO: renamed from: b */
    public static void m3087b(long[] jArr, long[] jArr2) {
        if (AbstractC1419f.m3647b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        m3093e(jArr, jArr3);
        m3082a(jArr3, 1, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr4, 1, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr3, 3, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr4, 3, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr3, 9, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr4, 9, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr3, 27, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr4, 27, jArr4);
        m3088b(jArr3, jArr4, jArr3);
        m3082a(jArr3, 81, jArr4);
        m3088b(jArr3, jArr4, jArr2);
    }

    /* JADX INFO: renamed from: b */
    public static void m3088b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        m3094e(jArr, jArr2, jArr4);
        m3089c(jArr4, jArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3090c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        m3094e(jArr, jArr2, jArr4);
        m3092d(jArr3, jArr4, jArr3);
    }

    /* JADX INFO: renamed from: d */
    public static void m3091d(long[] jArr, long[] jArr2) {
        long jM3560a = C1414a.m3560a(jArr[0]);
        long jM3560a2 = C1414a.m3560a(jArr[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long jM3560a3 = C1414a.m3560a(jArr[2]);
        m3088b(new long[]{(jM3560a >>> 32) | (jM3560a2 & (-4294967296L)), jM3560a3 >>> 32, 0}, f4850a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ (4294967295L & jM3560a3);
    }

    /* JADX INFO: renamed from: e */
    public static void m3093e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        m3096g(jArr, jArr3);
        m3089c(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: f */
    public static void m3095f(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        m3096g(jArr, jArr3);
        m3092d(jArr2, jArr3, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3082a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[6];
        m3096g(jArr, jArr3);
        m3089c(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            m3096g(jArr2, jArr3);
            m3089c(jArr3, jArr2);
        }
    }
}
