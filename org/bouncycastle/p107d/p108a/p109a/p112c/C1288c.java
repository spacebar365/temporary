package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1417d;
import org.bouncycastle.p107d.p117c.AbstractC1421h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1288c {

    /* JADX INFO: renamed from: a */
    static final int[] f4856a = {-1, -1, -1, -3};

    /* JADX INFO: renamed from: b */
    static final int[] f4857b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* JADX INFO: renamed from: c */
    private static final int[] f4858c = {-1, -1, -1, -5, 1, 0, -4, 3};

    /* JADX INFO: renamed from: a */
    public static void m3098a(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (j << 1) + (((long) iArr[3]) & 4294967295L);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3099a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (((long) iArr[3]) & 4294967295L) + 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3101a(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3598d(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && AbstractC1417d.m3611b(iArr2, f4856a))) {
            m3099a(iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3106c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j7 + (j8 << 1);
        long j10 = j6 + (j9 << 1);
        long j11 = j5 + (j10 << 1);
        long j12 = j + j11;
        iArr2[0] = (int) j12;
        long j13 = (j12 >>> 32) + j2 + j10;
        iArr2[1] = (int) j13;
        long j14 = (j13 >>> 32) + j3 + j9;
        iArr2[2] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = j15 + j4 + j8 + (j11 << 1);
        iArr2[3] = (int) j16;
        m3098a((int) (j16 >>> 32), iArr2);
    }

    /* JADX INFO: renamed from: e */
    public static void m3110e(int[] iArr, int[] iArr2) {
        if (AbstractC1416c.m3573a(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && AbstractC1417d.m3611b(iArr2, f4856a))) {
            m3099a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3102a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        if (((int) (j4 >>> 32)) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && AbstractC1417d.m3611b(iArr3, f4856a))) {
            m3099a(iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3103a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        if ((iArr[3] >>> 1) >= 2147483646 && AbstractC1417d.m3611b(iArr, f4856a)) {
            int[] iArr2 = f4856a;
            long j = 0 + ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L));
            iArr[0] = (int) j;
            long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
            iArr[1] = (int) j2;
            long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
            iArr[2] = (int) j3;
            iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32));
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m3105b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        AbstractC1417d.m3609b(iArr, iArr2, iArr4);
        m3106c(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3107c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = 0;
        for (int i = 0; i < 4; i++) {
            long j6 = ((long) iArr[i]) & 4294967295L;
            long j7 = 0 + (j6 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j7;
            long j8 = (j7 >>> 32) + (j6 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j8;
            long j9 = (j8 >>> 32) + (j6 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j9;
            long j10 = (j6 * j4) + (((long) iArr3[i + 3]) & 4294967295L) + (j9 >>> 32);
            iArr3[i + 3] = (int) j10;
            long j11 = j5 + (((long) iArr3[i + 4]) & 4294967295L) + (j10 >>> 32);
            iArr3[i + 4] = (int) j11;
            j5 = j11 >>> 32;
        }
        if (((int) j5) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && AbstractC1421h.m3700d(iArr3, f4857b))) {
            AbstractC1416c.m3574a(f4858c.length, f4858c, iArr3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3104b(int[] iArr, int[] iArr2) {
        if (!AbstractC1417d.m3610b(iArr)) {
            AbstractC1417d.m3612c(f4856a, iArr, iArr2);
            return;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m3108d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        AbstractC1417d.m3613c(iArr, iArr3);
        m3106c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3100a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        AbstractC1417d.m3613c(iArr, iArr3);
        m3106c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1417d.m3613c(iArr2, iArr3);
            m3106c(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3109d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1417d.m3612c(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (j2 + ((((long) iArr3[3]) & 4294967295L) - 2));
        }
    }
}
