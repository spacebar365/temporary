package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p107d.p117c.C1414a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bo */
/* JADX INFO: loaded from: classes.dex */
public final class C1276bo {

    /* JADX INFO: renamed from: a */
    private static final long[] f4840a = {2791191049453778211L, 2791191049453778402L, 6};

    /* JADX INFO: renamed from: a */
    public static int m3063a(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m3064a(long j, long j2, long[] jArr, int i) {
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
        long j4 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        int i3 = 33;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 9) & 7] << 9) ^ ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6));
            j4 ^= j5 << i3;
            j3 ^= j5 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j4;
        jArr[i + 1] = (j4 >>> 44) ^ (j3 << 20);
    }

    /* JADX INFO: renamed from: a */
    public static void m3066a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* JADX INFO: renamed from: a */
    public static void m3067a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
    }

    /* JADX INFO: renamed from: b */
    private static void m3069b(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 44);
        jArr[1] = (j2 >>> 20) ^ (j3 << 24);
        jArr[2] = ((j3 >>> 40) ^ (j4 << 4)) ^ (j5 << 48);
        jArr[3] = ((j4 >>> 60) ^ (j6 << 28)) ^ (j5 >>> 16);
        jArr[4] = j6 >>> 36;
        jArr[5] = 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m3072c(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = j8 ^ (j10 >>> 56);
        jArr2[2] = 7 & j9;
    }

    /* JADX INFO: renamed from: d */
    private static void m3075d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
    }

    /* JADX INFO: renamed from: e */
    private static void m3077e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = 17592186044415L & ((jArr[2] << 40) ^ (j2 >>> 24));
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((jArr2[2] << 40) ^ (j7 >>> 24)) & 17592186044415L;
        long j9 = ((j7 << 20) ^ (j6 >>> 44)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        m3064a(j5, j10, jArr4, 0);
        m3064a(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        m3064a(j11, j12, jArr4, 4);
        long j13 = (j3 << 2) ^ (j4 << 1);
        long j14 = (j8 << 2) ^ (j9 << 1);
        m3064a(j5 ^ j13, j10 ^ j14, jArr4, 6);
        m3064a(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6] ^ jArr4[8];
        long j16 = jArr4[7] ^ jArr4[9];
        long j17 = (j15 << 1) ^ jArr4[6];
        long j18 = (j15 ^ (j16 << 1)) ^ jArr4[7];
        long j19 = jArr4[0];
        long j20 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j21 = jArr4[1] ^ jArr4[5];
        long j22 = ((j17 ^ j19) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j23 = (((j18 ^ j20) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j22 >>> 44);
        long j24 = (j16 ^ j21) ^ (j23 >>> 44);
        long j25 = j23 & 17592186044415L;
        long j26 = ((j22 & 17592186044415L) >>> 1) ^ ((1 & j25) << 43);
        long j27 = j26 ^ (j26 << 1);
        long j28 = j27 ^ (j27 << 2);
        long j29 = j28 ^ (j28 << 4);
        long j30 = j29 ^ (j29 << 8);
        long j31 = j30 ^ (j30 << 16);
        long j32 = (j31 ^ (j31 << 32)) & 17592186044415L;
        long j33 = ((j25 >>> 1) ^ ((1 & j24) << 43)) ^ (j32 >>> 43);
        long j34 = j33 ^ (j33 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (j38 ^ (j38 << 32)) & 17592186044415L;
        long j40 = (j24 >>> 1) ^ (j39 >>> 43);
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
        m3069b(jArr3);
    }

    /* JADX INFO: renamed from: g */
    private static void m3079g(long[] jArr, long[] jArr2) {
        C1414a.m3561a(jArr[0], jArr2, 0);
        C1414a.m3561a(jArr[1], jArr2, 2);
        jArr2[4] = ((long) C1414a.m3559a((int) jArr[2])) & 4294967295L;
    }

    /* JADX INFO: renamed from: a */
    public static long[] m3068a(BigInteger bigInteger) {
        long[] jArrM3648b = AbstractC1419f.m3648b(bigInteger);
        long j = jArrM3648b[2];
        long j2 = j >>> 3;
        jArrM3648b[0] = jArrM3648b[0] ^ ((((j2 << 2) ^ j2) ^ (j2 << 3)) ^ (j2 << 8));
        jArrM3648b[1] = (j2 >>> 56) ^ jArrM3648b[1];
        jArrM3648b[2] = j & 7;
        return jArrM3648b;
    }

    /* JADX INFO: renamed from: b */
    public static void m3070b(long[] jArr, long[] jArr2) {
        if (AbstractC1419f.m3647b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        m3076e(jArr, jArr3);
        m3071b(jArr3, jArr, jArr3);
        m3065a(jArr3, 2, jArr4);
        m3071b(jArr4, jArr3, jArr4);
        m3065a(jArr4, 4, jArr3);
        m3071b(jArr3, jArr4, jArr3);
        m3065a(jArr3, 8, jArr4);
        m3071b(jArr4, jArr3, jArr4);
        m3065a(jArr4, 16, jArr3);
        m3071b(jArr3, jArr4, jArr3);
        m3065a(jArr3, 32, jArr4);
        m3071b(jArr4, jArr3, jArr4);
        m3076e(jArr4, jArr4);
        m3071b(jArr4, jArr, jArr4);
        m3065a(jArr4, 65, jArr3);
        m3071b(jArr3, jArr4, jArr3);
        m3076e(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: b */
    public static void m3071b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        m3077e(jArr, jArr2, jArr4);
        m3072c(jArr4, jArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3073c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        m3077e(jArr, jArr2, jArr4);
        m3075d(jArr3, jArr4, jArr3);
    }

    /* JADX INFO: renamed from: d */
    public static void m3074d(long[] jArr, long[] jArr2) {
        long jM3560a = C1414a.m3560a(jArr[0]);
        long jM3560a2 = C1414a.m3560a(jArr[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long jM3560a3 = C1414a.m3560a(jArr[2]);
        m3071b(new long[]{(jM3560a >>> 32) | (jM3560a2 & (-4294967296L)), jM3560a3 >>> 32, 0}, f4840a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ (4294967295L & jM3560a3);
    }

    /* JADX INFO: renamed from: e */
    public static void m3076e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        m3079g(jArr, jArr3);
        m3072c(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: f */
    public static void m3078f(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        m3079g(jArr, jArr3);
        m3075d(jArr2, jArr3, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3065a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[5];
        m3079g(jArr, jArr3);
        m3072c(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            m3079g(jArr2, jArr3);
            m3072c(jArr3, jArr2);
        }
    }
}
