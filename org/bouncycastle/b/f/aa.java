package org.bouncycastle.b.f;

import org.bouncycastle.b.e.au;
import org.bouncycastle.b.k.ba;

/* JADX INFO: loaded from: classes.dex */
public final class aa {
    private static void a(byte[] bArr) {
        if (bArr != null) {
            org.bouncycastle.f.a.a(bArr, (byte) 0);
        }
    }

    private static void a(int[] iArr) {
        if (iArr != null) {
            org.bouncycastle.f.a.a(iArr);
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    private static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            a(iArr2, iArr, i3, iArr3);
            au.b(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i2, 16);
            i2 = (length + i3) - i2;
            i3 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
    }

    private static void a(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            a(iArr2);
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, int i) {
        x xVar = new x(new org.bouncycastle.b.b.u());
        xVar.a(bArr, bArr2, 1);
        return ((ba) xVar.b(i * 8)).a();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
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
                return b(bArr, bArr2, i, i2, i3, i4);
            }
        }
        throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] bArrA = a(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = bArrA.length >>> 2;
            iArr = new int[length];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = org.bouncycastle.f.g.c(bArrA, i6);
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
                        iArr6[i11] = org.bouncycastle.f.a.c(iArr5);
                        a(iArr5, iArr2, iArr3, iArr4, i2);
                    }
                    int i12 = i - 1;
                    for (int i13 = 0; i13 < i; i13++) {
                        a(iArr5, iArr6[iArr5[i10 - 16] & i12], 0, iArr5);
                        a(iArr5, iArr2, iArr3, iArr4, i2);
                    }
                    System.arraycopy(iArr5, 0, iArr, i9, i10);
                    a(iArr6);
                    a(new int[][]{iArr5, iArr2, iArr3, iArr4});
                } catch (Throwable th) {
                    a(iArr6);
                    a(new int[][]{iArr5, iArr2, iArr3, iArr4});
                    throw th;
                }
            }
            org.bouncycastle.f.g.a(iArr, bArrA, 0);
            return a(bArr, bArrA, i4);
        } finally {
            a(bArrA);
            a(iArr);
        }
    }
}
