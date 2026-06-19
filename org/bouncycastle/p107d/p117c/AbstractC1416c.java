package org.bouncycastle.p107d.p117c;

import java.math.BigInteger;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.d.c.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1416c {
    /* JADX INFO: renamed from: a */
    public static int m3568a(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + 1;
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return m3584b(i, iArr, 2);
    }

    /* JADX INFO: renamed from: a */
    public static int m3569a(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & 4294967295L) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return m3584b(i, iArr, i3 + 1);
    }

    /* JADX INFO: renamed from: a */
    public static int m3570a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = 0;
        long j2 = 4294967295L & ((long) i2);
        int i4 = 0;
        do {
            long j3 = j + ((((long) iArr[i4 + 0]) & 4294967295L) * j2) + (((long) iArr2[i3 + i4]) & 4294967295L);
            iArr2[i3 + i4] = (int) j3;
            j = j3 >>> 32;
            i4++;
        } while (i4 < i);
        return (int) j;
    }

    /* JADX INFO: renamed from: a */
    public static int m3571a(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) (-(i2 & 1))) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = j2 + (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & j);
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: a */
    public static int m3572a(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m3573a(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i4 << 1) | (i2 >>> 31);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    /* JADX INFO: renamed from: a */
    public static int m3574a(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: a */
    public static int m3575a(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = j + (((long) iArr[i3 + 0]) & 4294967295L) + (((long) iArr2[i2 + i3]) & 4294967295L);
            iArr2[i2 + i3] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: a */
    public static int m3576a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: a */
    public static int m3577a(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public static int m3578a(int[] iArr, int i, int[] iArr2) {
        int i2 = 16;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i << (-9);
            }
            int i3 = iArr[i2 + 16];
            iArr2[i2 + 0] = (i3 >>> 9) | (i << (-9));
            i = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m3579a(int i, long[] jArr, long j) {
        int i2 = 0;
        while (i2 < i) {
            long j2 = jArr[i2 + 0];
            jArr[i2 + 0] = (j2 << 8) | (j >>> (-8));
            i2++;
            j = j2;
        }
        return j >>> (-8);
    }

    /* JADX INFO: renamed from: a */
    public static void m3580a(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        int i4 = -(i2 & 1);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr2[i5 + 0];
            iArr2[i5 + 0] = i6 ^ ((iArr[i3 + i5] ^ i6) & i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3582a(int i, int[] iArr) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    public static int m3583b(int i, int i2, int[] iArr) {
        long j = (((long) i2) & 4294967295L) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return m3584b(i, iArr, 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m3584b(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m3585b(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i4 << 3) | (i2 >>> (-3));
            i3++;
            i2 = i4;
        }
        return i2 >>> (-3);
    }

    /* JADX INFO: renamed from: b */
    public static int m3586b(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: b */
    public static int m3587b(int[] iArr, int i, int[] iArr2) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = iArr[i2 + 8];
            iArr2[i2 + 0] = (i3 << 1) | (i >>> 31);
            i2++;
            i = i3;
        }
        return i >>> 31;
    }

    /* JADX INFO: renamed from: b */
    public static void m3588b(int i, int[] iArr, int[] iArr2, int i2) {
        System.arraycopy(iArr, 0, iArr2, i2, i);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3589b(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3590b(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m3591c(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return m3572a(i, iArr, 2);
    }

    /* JADX INFO: renamed from: c */
    public static int m3592c(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = i2 + 0;
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m3593c(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = j + ((((long) iArr2[i2 + i3]) & 4294967295L) - (((long) iArr[i3 + 0]) & 4294967295L));
            iArr2[i2 + i3] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: c */
    public static int m3594c(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((((long) iArr[i2]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L));
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3595c(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3596c(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = iArr2[i2] ^ Integer.MIN_VALUE;
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m3597d(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr[i] = (i3 >>> 1) | (i2 << 31);
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m3598d(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static BigInteger m3599d(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                AbstractC1556g.m4136a(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: e */
    public static int m3600e(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr[i3] = (i4 << 2) | (i2 >>> (-2));
            i3++;
            i2 = i4;
        }
        return i2 >>> (-2);
    }

    /* JADX INFO: renamed from: e */
    public static int m3601e(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((((long) iArr2[i2]) & 4294967295L) - (((long) iArr[i2]) & 4294967295L));
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: e */
    public static void m3602e(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3581a(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[(i + 31) >> 5];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }
}
