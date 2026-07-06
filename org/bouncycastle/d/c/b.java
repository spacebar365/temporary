package org.bouncycastle.d.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static void a(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            c.a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = 0;
        int length = iArr.length;
        if (c.c(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        if (c.b(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrA = c.a(length, iArr2);
        int[] iArr4 = new int[length];
        iArr4[0] = 1;
        int iA2 = (iArrA[0] & 1) == 0 ? a(iArr, iArrA, length, iArr4, 0) : 0;
        if (c.b(length, iArrA)) {
            a(iArr, iA2, iArr4, iArr3);
            return;
        }
        int[] iArrA2 = c.a(length, iArr);
        int[] iArr5 = new int[length];
        int i = length;
        int i2 = iA2;
        while (true) {
            if (iArrA[i - 1] == 0 && iArrA2[i - 1] == 0) {
                i--;
            } else if (c.c(i, iArrA, iArrA2)) {
                c.e(i, iArrA2, iArrA);
                int iA3 = a(iArr, iArrA, i, iArr4, (c.e(length, iArr5, iArr4) - iA) + i2);
                if (c.b(i, iArrA)) {
                    a(iArr, iA3, iArr4, iArr3);
                    return;
                }
                i2 = iA3;
            } else {
                c.e(i, iArrA, iArrA2);
                iA = a(iArr, iArrA2, i, iArr5, (c.e(length, iArr4, iArr5) - i2) + iA);
                if (c.b(i, iArrA2)) {
                    a(iArr, iA, iArr5, iArr3);
                    return;
                }
            }
        }
    }

    private static int a(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int length = iArr.length;
        int i3 = 0;
        while (iArr2[0] == 0) {
            int i4 = i;
            int i5 = 0;
            while (true) {
                i4--;
                if (i4 >= 0) {
                    int i6 = iArr2[i4];
                    iArr2[i4] = i5;
                    i5 = i6;
                }
            }
            i3 += 32;
        }
        int i7 = 0;
        int i8 = iArr2[0];
        while ((i8 & 1) == 0) {
            i8 >>>= 1;
            i7++;
        }
        if (i7 > 0) {
            int i9 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i10 = iArr2[i];
                iArr2[i] = (i9 << (-i7)) | (i10 >>> i7);
                i9 = i10;
            }
            i3 += i7;
        }
        int iA = i2;
        for (int i11 = 0; i11 < i3; i11++) {
            if ((iArr3[0] & 1) != 0) {
                iA = iA < 0 ? iA + c.a(length, iArr, iArr3) : iA + c.e(length, iArr, iArr3);
            }
            c.d(length, iArr3, iA);
        }
        return iA;
    }
}
