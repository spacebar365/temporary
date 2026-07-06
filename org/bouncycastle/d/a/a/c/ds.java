package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ds {
    private static final long[] a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void a(long[] jArr, int i) {
        long j = jArr[i + 8];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i + 8] = j & 576460752303423487L;
    }

    private static void a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static int b(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void c(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (j2 >>> 49) ^ (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54));
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10)) ^ (j3 << 15);
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = j7 & 576460752303423487L;
    }

    private static void g(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            org.bouncycastle.d.c.a.a(jArr[i], jArr2, i << 1);
        }
    }

    private static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    private static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        i(jArr, a(jArr2), jArr3);
    }

    private static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                a(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            org.bouncycastle.d.c.c.a(16, jArr3, 0L);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                a(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5);
            }
            if (i4 > 0) {
                org.bouncycastle.d.c.c.a(18, jArr3, 0L);
            }
        }
    }

    public static long[] a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[9];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        a(jArr, 0);
        return jArr;
    }

    public static void b(long[] jArr, long[] jArr2) {
        if (org.bouncycastle.d.c.m.a(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        e(jArr, jArr5);
        e(jArr5, jArr3);
        e(jArr3, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr3, 2, jArr4);
        c(jArr3, jArr4, jArr3);
        c(jArr3, jArr5, jArr3);
        a(jArr3, 5, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr4, 5, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr3, 15, jArr4);
        c(jArr3, jArr4, jArr5);
        a(jArr5, 30, jArr3);
        a(jArr3, 30, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr3, 60, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr4, 60, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr3, 180, jArr4);
        c(jArr3, jArr4, jArr3);
        a(jArr4, 180, jArr4);
        c(jArr3, jArr4, jArr3);
        c(jArr3, jArr5, jArr2);
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        h(jArr, jArr2, jArr4);
        c(jArr4, jArr3);
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        h(jArr, jArr2, jArr4);
        g(jArr3, jArr4, jArr3);
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        i(jArr, jArr2, jArr4);
        c(jArr4, jArr3);
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        i(jArr, jArr2, jArr4);
        g(jArr3, jArr4, jArr3);
    }

    public static long[] a(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 0;
        int i2 = 7;
        while (i2 > 0) {
            int i3 = i + 18;
            int i4 = i3 >>> 1;
            long j = 0;
            int i5 = 0;
            while (i5 < 9) {
                long j2 = jArr2[i4 + i5];
                jArr2[i3 + i5] = (j >>> 63) | (j2 << 1);
                i5++;
                j = j2;
            }
            a(jArr2, i3);
            int i6 = i3 + 9;
            for (int i7 = 0; i7 < 9; i7++) {
                jArr2[i6 + i7] = jArr2[i7 + 9] ^ jArr2[i3 + i7];
            }
            i2--;
            i = i3;
        }
        long j3 = 0;
        int i8 = 0;
        while (i8 < 144) {
            long j4 = jArr2[i8 + 0];
            jArr2[i8 + 144] = (j3 >>> (-4)) | (j4 << 4);
            i8++;
            j3 = j4;
        }
        return jArr2;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jA = org.bouncycastle.d.c.a.a(jArr[i]);
            i = i3 + 1;
            long jA2 = org.bouncycastle.d.c.a.a(jArr[i3]);
            jArr3[i2] = (4294967295L & jA) | (jA2 << 32);
            jArr4[i2] = (jA2 & (-4294967296L)) | (jA >>> 32);
        }
        long jA3 = org.bouncycastle.d.c.a.a(jArr[8]);
        jArr3[4] = 4294967295L & jA3;
        jArr4[4] = jA3 >>> 32;
        c(jArr4, a, jArr2);
        a(jArr2, jArr3, jArr2);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        g(jArr, jArr3);
        c(jArr3, jArr2);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        g(jArr, jArr3);
        g(jArr2, jArr3, jArr2);
    }

    public static void a(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[18];
        g(jArr, jArr3);
        c(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            g(jArr2, jArr3);
            c(jArr3, jArr2);
        }
    }
}
