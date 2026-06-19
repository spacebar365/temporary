package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p107d.p117c.C1414a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ch */
/* JADX INFO: loaded from: classes.dex */
public final class C1296ch {
    /* JADX INFO: renamed from: a */
    private static void m3111a(long j, long j2, long[] jArr, int i) {
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
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 12) & 7] << 12) ^ (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9));
            j4 ^= j5 << i3;
            j3 ^= j5 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j4);
        int i5 = i + 1;
        jArr[i5] = ((j4 >>> 49) ^ (j3 << 15)) ^ jArr[i5];
    }

    /* JADX INFO: renamed from: a */
    private static void m3112a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m3117b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = j11 ^ (j13 >>> 49);
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    /* JADX INFO: renamed from: c */
    private static void m3120c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
    }

    /* JADX INFO: renamed from: d */
    private static void m3122d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m3123e(jArr, jArr4);
        m3123e(jArr2, jArr5);
        m3111a(jArr4[0], jArr5[0], jArr3, 0);
        m3111a(jArr4[1], jArr5[1], jArr3, 1);
        m3111a(jArr4[2], jArr5[2], jArr3, 2);
        m3111a(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m3111a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m3111a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m3111a(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        m3111a(j, j3, jArr6, 0);
        m3111a(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = (j6 ^ j7) ^ jArr3[4];
        jArr3[5] = jArr3[5] ^ j7;
        m3112a(jArr3);
    }

    /* JADX INFO: renamed from: e */
    private static void m3123e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = 562949953421311L & j;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    /* JADX INFO: renamed from: f */
    private static void m3124f(long[] jArr, long[] jArr2) {
        C1414a.m3561a(jArr[0], jArr2, 0);
        C1414a.m3561a(jArr[1], jArr2, 2);
        C1414a.m3561a(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    /* JADX INFO: renamed from: a */
    public static long[] m3116a(BigInteger bigInteger) {
        long[] jArrM3693b = AbstractC1421h.m3693b(bigInteger);
        long j = jArrM3693b[3];
        long j2 = j >>> 1;
        jArrM3693b[0] = jArrM3693b[0] ^ ((j2 << 15) ^ j2);
        jArrM3693b[1] = (j2 >>> 49) ^ jArrM3693b[1];
        jArrM3693b[3] = j & 1;
        return jArrM3693b;
    }

    /* JADX INFO: renamed from: a */
    public static void m3114a(long[] jArr, long[] jArr2) {
        if (AbstractC1421h.m3692b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        m3119c(jArr, jArr3);
        m3113a(jArr3, 1, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr4, 1, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr3, 3, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr3, 6, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr3, 12, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr3, 24, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr3, 48, jArr4);
        m3115a(jArr3, jArr4, jArr3);
        m3113a(jArr3, 96, jArr4);
        m3115a(jArr3, jArr4, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3115a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m3122d(jArr, jArr2, jArr4);
        m3117b(jArr4, jArr3);
    }

    /* JADX INFO: renamed from: b */
    public static void m3118b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m3122d(jArr, jArr2, jArr4);
        m3120c(jArr3, jArr4, jArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3119c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        m3124f(jArr, jArr3);
        m3117b(jArr3, jArr2);
    }

    /* JADX INFO: renamed from: d */
    public static void m3121d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        m3124f(jArr, jArr3);
        m3120c(jArr2, jArr3, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3113a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        m3124f(jArr, jArr3);
        m3117b(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            m3124f(jArr2, jArr3);
            m3117b(jArr3, jArr2);
        }
    }
}
