package org.bouncycastle.p107d.p117c;

import java.math.BigInteger;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.d.c.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1421h {
    /* JADX INFO: renamed from: a */
    public static int m3678a(long j, int[] iArr) {
        long j2 = 4294967295L & j;
        long j3 = 0 + (977 * j2) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = j2 + (977 * j4) + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[2]) & 4294967295L) + j4;
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[3]) & 4294967295L);
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return AbstractC1416c.m3592c(8, iArr, 4);
    }

    /* JADX INFO: renamed from: a */
    public static int m3679a(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L);
        iArr2[i2 + 0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L);
        iArr2[i2 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L);
        iArr2[i2 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L);
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* JADX INFO: renamed from: a */
    private static int m3680a(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = 0 + ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L));
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* JADX INFO: renamed from: a */
    public static int m3681a(int[] iArr, int[] iArr2) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* JADX INFO: renamed from: a */
    public static int m3682a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* JADX INFO: renamed from: a */
    public static void m3683a(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    /* JADX INFO: renamed from: a */
    public static void m3684a(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3685a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3686a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3687a(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m3689b(int[] iArr, int[] iArr2) {
        long j = 0 + (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L);
        iArr[8] = (int) j;
        iArr2[16] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L);
        iArr[9] = (int) j2;
        iArr2[17] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L);
        iArr[10] = (int) j3;
        iArr2[18] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L);
        iArr[11] = (int) j4;
        iArr2[19] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L);
        iArr[12] = (int) j5;
        iArr2[20] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L);
        iArr[13] = (int) j6;
        iArr2[21] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L);
        iArr[14] = (int) j7;
        iArr2[22] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[15]) & 4294967295L) + (((long) iArr2[23]) & 4294967295L);
        iArr[15] = (int) j8;
        iArr2[23] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* JADX INFO: renamed from: b */
    public static int m3690b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3691b(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3692b(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m3694c(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC1556g.m4136a(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m3695c(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC1556g.m4137a(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3696c(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m3698d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m3699d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L & ((long) iArr2[0]);
        long j2 = 4294967295L & ((long) iArr2[1]);
        long j3 = 4294967295L & ((long) iArr2[2]);
        long j4 = 4294967295L & ((long) iArr2[3]);
        long j5 = 4294967295L & ((long) iArr2[4]);
        long j6 = 4294967295L & ((long) iArr2[5]);
        long j7 = 4294967295L & ((long) iArr2[6]);
        long j8 = 4294967295L & ((long) iArr2[7]);
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = 0 + (j9 * j);
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        for (int i = 1; i < 8; i++) {
            long j18 = ((long) iArr[i]) & 4294967295L;
            long j19 = 0 + (j18 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j19;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr3[i + 4]) & 4294967295L);
            iArr3[i + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr3[i + 5]) & 4294967295L);
            iArr3[i + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr3[i + 6]) & 4294967295L);
            iArr3[i + 6] = (int) j25;
            long j26 = (j18 * j8) + (((long) iArr3[i + 7]) & 4294967295L) + (j25 >>> 32);
            iArr3[i + 7] = (int) j26;
            iArr3[i + 8] = (int) (j26 >>> 32);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3700d(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = iArr2[i] ^ Integer.MIN_VALUE;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static int m3701e(int[] iArr, int[] iArr2) {
        long j = 0 + ((((long) iArr2[0]) & 4294967295L) * 19) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + ((((long) iArr2[1]) & 4294967295L) * 19) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * 19) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * 19) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * 19) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * 19) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * 19) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[7]) & 4294967295L) * 19) + (((long) iArr[7]) & 4294967295L);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* JADX INFO: renamed from: e */
    public static int m3702e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        for (int i = 0; i < 8; i++) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = 0 + (j10 * j) + (((long) iArr3[i + 0]) & 4294967295L);
            iArr3[i + 0] = (int) j11;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i + 1]) & 4294967295L);
            iArr3[i + 1] = (int) j12;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i + 2]) & 4294967295L);
            iArr3[i + 2] = (int) j13;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i + 3]) & 4294967295L);
            iArr3[i + 3] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i + 4]) & 4294967295L);
            iArr3[i + 4] = (int) j15;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i + 5]) & 4294967295L);
            iArr3[i + 5] = (int) j16;
            long j17 = (j16 >>> 32) + (j10 * j7) + (((long) iArr3[i + 6]) & 4294967295L);
            iArr3[i + 6] = (int) j17;
            long j18 = (j10 * j8) + (((long) iArr3[i + 7]) & 4294967295L) + (j17 >>> 32);
            iArr3[i + 7] = (int) j18;
            long j19 = j9 + (((long) iArr3[i + 8]) & 4294967295L) + (j18 >>> 32);
            iArr3[i + 8] = (int) j19;
            j9 = j19 >>> 32;
        }
        return (int) j9;
    }

    /* JADX INFO: renamed from: f */
    public static long m3703f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = 0 + (977 * j) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = j + (977 * j3) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j4;
        long j5 = ((long) iArr[10]) & 4294967295L;
        long j6 = (j4 >>> 32) + j3 + (977 * j5) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = ((long) iArr[11]) & 4294967295L;
        long j8 = (j6 >>> 32) + j5 + (977 * j7) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j8;
        long j9 = ((long) iArr[12]) & 4294967295L;
        long j10 = (j8 >>> 32) + j7 + (977 * j9) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j10;
        long j11 = ((long) iArr[13]) & 4294967295L;
        long j12 = (j10 >>> 32) + j9 + (977 * j11) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j12;
        long j13 = ((long) iArr[14]) & 4294967295L;
        long j14 = (j12 >>> 32) + j11 + (977 * j13) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j14;
        long j15 = ((long) iArr[15]) & 4294967295L;
        long j16 = (j14 >>> 32) + j13 + (977 * j15) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    /* JADX INFO: renamed from: f */
    public static void m3704f(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j2 = ((long) iArr[i]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i2 - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i5 - 1;
            iArr2[i2] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & 4294967295L;
                long j6 = ((long) iArr2[2]) & 4294967295L;
                long j7 = ((((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i6 = (int) j7;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                int i7 = i6 >>> 31;
                long j8 = (j7 >>> 32) + j6;
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = j8 + (j9 * j);
                int i8 = (int) j12;
                iArr2[2] = i7 | (i8 << 1);
                int i9 = i8 >>> 31;
                long j13 = (j12 >>> 32) + (j9 * j5) + j10;
                long j14 = (j13 >>> 32) + j11;
                long j15 = ((long) iArr[3]) & 4294967295L;
                long j16 = (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j16 >>> 32);
                long j18 = (j13 & 4294967295L) + (j15 * j);
                int i10 = (int) j18;
                iArr2[3] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long j19 = (j18 >>> 32) + (j15 * j5) + (j14 & 4294967295L);
                long j20 = (j19 >>> 32) + (j15 * j9) + (j16 & 4294967295L);
                long j21 = (j20 >>> 32) + j17;
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j25 = (j19 & 4294967295L) + (j22 * j);
                int i12 = (int) j25;
                iArr2[4] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j26 = (j25 >>> 32) + (j22 * j5) + (j20 & 4294967295L);
                long j27 = (j26 >>> 32) + (j22 * j9) + (j21 & 4294967295L);
                long j28 = (j27 >>> 32) + (j22 * j15) + (j23 & 4294967295L);
                long j29 = (j28 >>> 32) + j24;
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (((long) iArr2[9]) & 4294967295L) + (j29 >>> 32);
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j33 = (j26 & 4294967295L) + (j30 * j);
                int i14 = (int) j33;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long j34 = (j33 >>> 32) + (j30 * j5) + (j27 & 4294967295L);
                long j35 = (j34 >>> 32) + (j30 * j9) + (j28 & 4294967295L);
                long j36 = (j35 >>> 32) + (j30 * j15) + (j29 & 4294967295L);
                long j37 = (j36 >>> 32) + (j30 * j22) + (j31 & 4294967295L);
                long j38 = (j37 >>> 32) + j32;
                long j39 = ((long) iArr[6]) & 4294967295L;
                long j40 = (((long) iArr2[11]) & 4294967295L) + (j38 >>> 32);
                long j41 = (((long) iArr2[12]) & 4294967295L) + (j40 >>> 32);
                long j42 = (j34 & 4294967295L) + (j39 * j);
                int i16 = (int) j42;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long j43 = (j42 >>> 32) + (j39 * j5) + (j35 & 4294967295L);
                long j44 = (j43 >>> 32) + (j39 * j9) + (j36 & 4294967295L);
                long j45 = (j44 >>> 32) + (j39 * j15) + (j37 & 4294967295L);
                long j46 = (j45 >>> 32) + (j39 * j22) + (j38 & 4294967295L);
                long j47 = (j46 >>> 32) + (j39 * j30) + (j40 & 4294967295L);
                long j48 = (j47 >>> 32) + j41;
                long j49 = ((long) iArr[7]) & 4294967295L;
                long j50 = (((long) iArr2[13]) & 4294967295L) + (j48 >>> 32);
                long j51 = (((long) iArr2[14]) & 4294967295L) + (j50 >>> 32);
                long j52 = (j43 & 4294967295L) + (j * j49);
                int i18 = (int) j52;
                iArr2[7] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                long j53 = (j52 >>> 32) + (j49 * j5) + (j44 & 4294967295L);
                long j54 = (j53 >>> 32) + (j49 * j9) + (j45 & 4294967295L);
                long j55 = (j54 >>> 32) + (j49 * j15) + (j46 & 4294967295L);
                long j56 = (j55 >>> 32) + (j49 * j22) + (j47 & 4294967295L);
                long j57 = (j56 >>> 32) + (j49 * j30) + (j48 & 4294967295L);
                long j58 = (j57 >>> 32) + (j49 * j39) + (j50 & 4294967295L);
                long j59 = (j58 >>> 32) + j51;
                int i20 = (int) j53;
                iArr2[8] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j54;
                iArr2[9] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j55;
                iArr2[10] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j56;
                iArr2[11] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j57;
                iArr2[12] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j58;
                iArr2[13] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j59;
                iArr2[14] = i31 | (i32 << 1);
                iArr2[15] = (i32 >>> 31) | ((iArr2[15] + ((int) (j59 >>> 32))) << 1);
                return;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m3705g(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0 + ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L));
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* JADX INFO: renamed from: g */
    public static void m3706g(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j2 = ((long) iArr[i + 8]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i2 - 1;
            iArr2[i5 + 16] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i5 - 1;
            iArr2[i2 + 16] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[16] = (int) j4;
                long j5 = ((long) iArr[9]) & 4294967295L;
                long j6 = ((long) iArr2[18]) & 4294967295L;
                long j7 = ((((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i6 = (int) j7;
                iArr2[17] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                int i7 = i6 >>> 31;
                long j8 = (j7 >>> 32) + j6;
                long j9 = ((long) iArr[10]) & 4294967295L;
                long j10 = ((long) iArr2[19]) & 4294967295L;
                long j11 = ((long) iArr2[20]) & 4294967295L;
                long j12 = j8 + (j9 * j);
                int i8 = (int) j12;
                iArr2[18] = i7 | (i8 << 1);
                int i9 = i8 >>> 31;
                long j13 = (j12 >>> 32) + (j9 * j5) + j10;
                long j14 = (j13 >>> 32) + j11;
                long j15 = ((long) iArr[11]) & 4294967295L;
                long j16 = (((long) iArr2[21]) & 4294967295L) + (j14 >>> 32);
                long j17 = (((long) iArr2[22]) & 4294967295L) + (j16 >>> 32);
                long j18 = (j13 & 4294967295L) + (j15 * j);
                int i10 = (int) j18;
                iArr2[19] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long j19 = (j18 >>> 32) + (j15 * j5) + (j14 & 4294967295L);
                long j20 = (j19 >>> 32) + (j15 * j9) + (j16 & 4294967295L);
                long j21 = (j20 >>> 32) + j17;
                long j22 = ((long) iArr[12]) & 4294967295L;
                long j23 = (((long) iArr2[23]) & 4294967295L) + (j21 >>> 32);
                long j24 = (((long) iArr2[24]) & 4294967295L) + (j23 >>> 32);
                long j25 = (j19 & 4294967295L) + (j22 * j);
                int i12 = (int) j25;
                iArr2[20] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j26 = (j25 >>> 32) + (j22 * j5) + (j20 & 4294967295L);
                long j27 = (j26 >>> 32) + (j22 * j9) + (j21 & 4294967295L);
                long j28 = (j27 >>> 32) + (j22 * j15) + (j23 & 4294967295L);
                long j29 = (j28 >>> 32) + j24;
                long j30 = ((long) iArr[13]) & 4294967295L;
                long j31 = (((long) iArr2[25]) & 4294967295L) + (j29 >>> 32);
                long j32 = (((long) iArr2[26]) & 4294967295L) + (j31 >>> 32);
                long j33 = (j26 & 4294967295L) + (j30 * j);
                int i14 = (int) j33;
                iArr2[21] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long j34 = (j33 >>> 32) + (j30 * j5) + (j27 & 4294967295L);
                long j35 = (j34 >>> 32) + (j30 * j9) + (j28 & 4294967295L);
                long j36 = (j35 >>> 32) + (j30 * j15) + (j29 & 4294967295L);
                long j37 = (j36 >>> 32) + (j30 * j22) + (j31 & 4294967295L);
                long j38 = (j37 >>> 32) + j32;
                long j39 = ((long) iArr[14]) & 4294967295L;
                long j40 = (((long) iArr2[27]) & 4294967295L) + (j38 >>> 32);
                long j41 = (((long) iArr2[28]) & 4294967295L) + (j40 >>> 32);
                long j42 = (j34 & 4294967295L) + (j39 * j);
                int i16 = (int) j42;
                iArr2[22] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long j43 = (j42 >>> 32) + (j39 * j5) + (j35 & 4294967295L);
                long j44 = (j43 >>> 32) + (j39 * j9) + (j36 & 4294967295L);
                long j45 = (j44 >>> 32) + (j39 * j15) + (j37 & 4294967295L);
                long j46 = (j45 >>> 32) + (j39 * j22) + (j38 & 4294967295L);
                long j47 = (j46 >>> 32) + (j39 * j30) + (j40 & 4294967295L);
                long j48 = (j47 >>> 32) + j41;
                long j49 = ((long) iArr[15]) & 4294967295L;
                long j50 = (((long) iArr2[29]) & 4294967295L) + (j48 >>> 32);
                long j51 = (((long) iArr2[30]) & 4294967295L) + (j50 >>> 32);
                long j52 = (j43 & 4294967295L) + (j * j49);
                int i18 = (int) j52;
                iArr2[23] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                long j53 = (j52 >>> 32) + (j49 * j5) + (j44 & 4294967295L);
                long j54 = (j53 >>> 32) + (j49 * j9) + (j45 & 4294967295L);
                long j55 = (j54 >>> 32) + (j49 * j15) + (j46 & 4294967295L);
                long j56 = (j55 >>> 32) + (j49 * j22) + (j47 & 4294967295L);
                long j57 = (j56 >>> 32) + (j49 * j30) + (j48 & 4294967295L);
                long j58 = (j57 >>> 32) + (j49 * j39) + (j50 & 4294967295L);
                long j59 = (j58 >>> 32) + j51;
                int i20 = (int) j53;
                iArr2[24] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j54;
                iArr2[25] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j55;
                iArr2[26] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j56;
                iArr2[27] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j57;
                iArr2[28] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j58;
                iArr2[29] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j59;
                iArr2[30] = i31 | (i32 << 1);
                iArr2[31] = (i32 >>> 31) | ((iArr2[31] + ((int) (j59 >>> 32))) << 1);
                return;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m3707h(int[] iArr, int[] iArr2) {
        long j = 0 + ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L));
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3697c(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i + 8] ^ Integer.MIN_VALUE;
            int i3 = iArr2[i + 0] ^ Integer.MIN_VALUE;
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
        }
        z = true;
        if (z) {
            m3680a(iArr, 8, iArr2, 0, iArr3);
        } else {
            m3680a(iArr2, 0, iArr, 8, iArr3);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3688a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static long[] m3693b(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }
}
