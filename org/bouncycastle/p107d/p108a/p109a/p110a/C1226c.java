package org.bouncycastle.p107d.p108a.p109a.p110a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1421h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1226c {

    /* JADX INFO: renamed from: a */
    static final int[] f4752a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b */
    private static final int[] f4753b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    /* JADX INFO: renamed from: a */
    private static int m2915a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long jM3584b = j >> 32;
        if (jM3584b != 0) {
            jM3584b = AbstractC1416c.m3584b(7, iArr, 1);
        }
        long j2 = jM3584b + ((((long) iArr[7]) & 4294967295L) - 2147483648L);
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: a */
    public static void m2916a(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + AbstractC1416c.m3583b(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (AbstractC1421h.m3700d(iArr, f4752a)) {
            m2915a(iArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2918a(int[] iArr, int[] iArr2) {
        AbstractC1416c.m3598d(8, iArr, iArr2);
        if (AbstractC1421h.m3700d(iArr2, f4752a)) {
            m2915a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2919a(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC1421h.m3682a(iArr, iArr2, iArr3);
        if (AbstractC1421h.m3700d(iArr3, f4752a)) {
            m2915a(iArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m2920a(BigInteger bigInteger) {
        int[] iArrM3688a = AbstractC1421h.m3688a(bigInteger);
        while (AbstractC1421h.m3700d(iArrM3688a, f4752a)) {
            AbstractC1421h.m3707h(f4752a, iArrM3688a);
        }
        return iArrM3688a;
    }

    /* JADX INFO: renamed from: b */
    public static void m2921b(int[] iArr, int[] iArr2) {
        if (AbstractC1421h.m3691b(iArr)) {
            AbstractC1421h.m3698d(iArr2);
        } else {
            AbstractC1421h.m3705g(f4752a, iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2923c(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        AbstractC1416c.m3587b(iArr, i, iArr2);
        int iM3701e = AbstractC1421h.m3701e(iArr, iArr2) << 1;
        int i2 = iArr2[7];
        iArr2[7] = AbstractC1416c.m3583b(7, (((i2 >>> 31) - (i >>> 31)) + iM3701e) * 19, iArr2) + (Integer.MAX_VALUE & i2);
        if (AbstractC1421h.m3700d(iArr2, f4752a)) {
            m2915a(iArr2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2927e(int[] iArr, int[] iArr2) {
        AbstractC1416c.m3573a(8, iArr, 0, iArr2);
        if (AbstractC1421h.m3700d(iArr2, f4752a)) {
            m2915a(iArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2922b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        AbstractC1421h.m3699d(iArr, iArr2, iArr4);
        m2923c(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: c */
    public static void m2924c(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC1421h.m3702e(iArr, iArr2, iArr3);
        if (AbstractC1416c.m3596c(16, iArr3, f4753b)) {
            long j = (((long) iArr3[0]) & 4294967295L) - (((long) f4753b[0]) & 4294967295L);
            iArr3[0] = (int) j;
            long jM3572a = j >> 32;
            if (jM3572a != 0) {
                jM3572a = AbstractC1416c.m3572a(8, iArr3, 1);
            }
            long j2 = jM3572a + (((long) iArr3[8]) & 4294967295L) + 19;
            iArr3[8] = (int) j2;
            long jM3584b = j2 >> 32;
            if (jM3584b != 0) {
                jM3584b = AbstractC1416c.m3584b(15, iArr3, 9);
            }
            iArr3[15] = (int) (jM3584b + ((((long) iArr3[15]) & 4294967295L) - (((long) (f4753b[15] + 1)) & 4294967295L)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2925d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC1421h.m3704f(iArr, iArr3);
        m2923c(iArr3, iArr2);
    }

    /* JADX INFO: renamed from: a */
    public static void m2917a(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC1421h.m3704f(iArr, iArr3);
        m2923c(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            AbstractC1421h.m3704f(iArr2, iArr3);
            m2923c(iArr3, iArr2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2926d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC1421h.m3705g(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long jM3572a = j >> 32;
            if (jM3572a != 0) {
                jM3572a = AbstractC1416c.m3572a(7, iArr3, 1);
            }
            iArr3[7] = (int) (jM3572a + (((long) iArr3[7]) & 4294967295L) + 2147483648L);
        }
    }
}
