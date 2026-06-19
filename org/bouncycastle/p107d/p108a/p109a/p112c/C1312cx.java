package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p107d.p117c.C1414a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.cx */
/* JADX INFO: loaded from: classes.dex */
public final class C1312cx {
    /* JADX INFO: renamed from: a */
    private static void m3139a(long j, long j2, long[] jArr, int i) {
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
        long j4 = jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3);
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j4 ^= j5 << i3;
            j3 ^= j5 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        long j6 = (((585610922974906400L & j) & ((j2 << 4) >> 63)) >>> 5) ^ j3;
        jArr[i] = jArr[i] ^ (1152921504606846975L & j4);
        int i5 = i + 1;
        jArr[i5] = ((j6 << 4) ^ (j4 >>> 60)) ^ jArr[i5];
    }

    /* JADX INFO: renamed from: a */
    private static void m3140a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 60);
        jArr[1] = (j2 >>> 4) ^ (j3 << 56);
        jArr[2] = (j3 >>> 8) ^ (j4 << 52);
        jArr[3] = (j4 >>> 12) ^ (j5 << 48);
        jArr[4] = (j5 >>> 16) ^ (j6 << 44);
        jArr[5] = (j6 >>> 20) ^ (j7 << 40);
        jArr[6] = (j7 >>> 24) ^ (j8 << 36);
        jArr[7] = j8 >>> 28;
    }

    /* JADX INFO: renamed from: b */
    public static void m3145b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    /* JADX INFO: renamed from: c */
    private static void m3148c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
    }

    /* JADX INFO: renamed from: d */
    private static void m3150d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m3151e(jArr, jArr4);
        m3151e(jArr2, jArr5);
        m3139a(jArr4[0], jArr5[0], jArr3, 0);
        m3139a(jArr4[1], jArr5[1], jArr3, 1);
        m3139a(jArr4[2], jArr5[2], jArr3, 2);
        m3139a(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m3139a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m3139a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m3139a(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        m3139a(j, j3, jArr6, 0);
        m3139a(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = (j6 ^ j7) ^ jArr3[4];
        jArr3[5] = jArr3[5] ^ j7;
        m3140a(jArr3);
    }

    /* JADX INFO: renamed from: e */
    private static void m3151e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = 1152921504606846975L & j;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    /* JADX INFO: renamed from: f */
    private static void m3152f(long[] jArr, long[] jArr2) {
        C1414a.m3561a(jArr[0], jArr2, 0);
        C1414a.m3561a(jArr[1], jArr2, 2);
        C1414a.m3561a(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = C1414a.m3564c((int) j);
        jArr2[7] = ((long) C1414a.m3562b((int) (j >>> 32))) & 4294967295L;
    }

    /* JADX INFO: renamed from: a */
    public static long[] m3144a(BigInteger bigInteger) {
        long[] jArrM3693b = AbstractC1421h.m3693b(bigInteger);
        long j = jArrM3693b[3];
        long j2 = j >>> 47;
        jArrM3693b[0] = jArrM3693b[0] ^ j2;
        jArrM3693b[2] = (j2 << 30) ^ jArrM3693b[2];
        jArrM3693b[3] = j & 140737488355327L;
        return jArrM3693b;
    }

    /* JADX INFO: renamed from: a */
    public static void m3142a(long[] jArr, long[] jArr2) {
        if (AbstractC1421h.m3692b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        m3147c(jArr, jArr3);
        m3143a(jArr3, jArr, jArr3);
        m3147c(jArr3, jArr3);
        m3143a(jArr3, jArr, jArr3);
        m3141a(jArr3, 3, jArr4);
        m3143a(jArr4, jArr3, jArr4);
        m3147c(jArr4, jArr4);
        m3143a(jArr4, jArr, jArr4);
        m3141a(jArr4, 7, jArr3);
        m3143a(jArr3, jArr4, jArr3);
        m3141a(jArr3, 14, jArr4);
        m3143a(jArr4, jArr3, jArr4);
        m3147c(jArr4, jArr4);
        m3143a(jArr4, jArr, jArr4);
        m3141a(jArr4, 29, jArr3);
        m3143a(jArr3, jArr4, jArr3);
        m3147c(jArr3, jArr3);
        m3143a(jArr3, jArr, jArr3);
        m3141a(jArr3, 59, jArr4);
        m3143a(jArr4, jArr3, jArr4);
        m3147c(jArr4, jArr4);
        m3143a(jArr4, jArr, jArr4);
        m3141a(jArr4, 119, jArr3);
        m3143a(jArr3, jArr4, jArr3);
        m3147c(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3143a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m3150d(jArr, jArr2, jArr4);
        m3145b(jArr4, jArr3);
    }

    /* JADX INFO: renamed from: b */
    public static void m3146b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m3150d(jArr, jArr2, jArr4);
        m3148c(jArr3, jArr4, jArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3147c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        m3152f(jArr, jArr3);
        m3145b(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: d */
    public static void m3149d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        m3152f(jArr, jArr3);
        m3148c(jArr2, jArr3, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3141a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        m3152f(jArr, jArr3);
        m3145b(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            m3152f(jArr2, jArr3);
            m3145b(jArr3, jArr2);
        }
    }
}
