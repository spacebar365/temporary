package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p089e.C0912au;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.f.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0952aa {
    /* JADX INFO: renamed from: a */
    private static void m2407a(byte[] bArr) {
        if (bArr != null) {
            C1535a.m4071a(bArr, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2408a(int[] iArr) {
        if (iArr != null) {
            C1535a.m4072a(iArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2409a(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2410a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            m2409a(iArr2, iArr, i3, iArr3);
            C0912au.m2225b(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i2, 16);
            i2 = (length + i3) - i2;
            i3 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
    }

    /* JADX INFO: renamed from: a */
    private static void m2411a(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            m2408a(iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m2412a(byte[] bArr, byte[] bArr2, int i) {
        C0977x c0977x = new C0977x(new C0844u());
        c0977x.m1899a(bArr, bArr2, 1);
        return ((C1076ba) c0977x.mo1900b(i * 8)).m2603a();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2413a(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i > 1) {
            if (((i + (-1)) & i) == 0) {
                if (i2 == 1 && i >= 65536) {
                    throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
                }
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Block size r must be >= 1.");
                }
                int i5 = Integer.MAX_VALUE / ((i2 * 128) * 8);
                if (i3 <= 0 || i3 > i5) {
                    throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i5 + " (based on block size r of " + i2 + ")");
                }
                if (i4 <= 0) {
                    throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                }
                return m2414b(bArr, bArr2, i, i2, i3, i4);
            }
        }
        throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m2414b(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] bArrM2412a = m2412a(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = bArrM2412a.length >>> 2;
            iArr = new int[length];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = AbstractC1556g.m4152c(bArrM2412a, i6);
                i6 += 4;
            }
            int i8 = i5 >>> 2;
            for (int i9 = 0; i9 < length; i9 += i8) {
                int i10 = i2 * 32;
                int[] iArr2 = new int[16];
                int[] iArr3 = new int[16];
                int[] iArr4 = new int[i10];
                int[] iArr5 = new int[i10];
                int[][] iArr6 = new int[i][];
                try {
                    System.arraycopy(iArr, i9, iArr5, 0, i10);
                    for (int i11 = 0; i11 < i; i11++) {
                        iArr6[i11] = C1535a.m4092c(iArr5);
                        m2410a(iArr5, iArr2, iArr3, iArr4, i2);
                    }
                    int i12 = i - 1;
                    for (int i13 = 0; i13 < i; i13++) {
                        m2409a(iArr5, iArr6[iArr5[i10 - 16] & i12], 0, iArr5);
                        m2410a(iArr5, iArr2, iArr3, iArr4, i2);
                    }
                    System.arraycopy(iArr5, 0, iArr, i9, i10);
                    m2411a(iArr6);
                    m2411a(new int[][]{iArr5, iArr2, iArr3, iArr4});
                } catch (Throwable th) {
                    m2411a(iArr6);
                    m2411a(new int[][]{iArr5, iArr2, iArr3, iArr4});
                    throw th;
                }
            }
            AbstractC1556g.m4140a(iArr, bArrM2412a, 0);
            return m2412a(bArr, bArrM2412a, i4);
        } finally {
            m2407a(bArrM2412a);
            m2408a(iArr);
        }
    }
}
