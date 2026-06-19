package org.bouncycastle.p107d.p117c;

/* JADX INFO: renamed from: org.bouncycastle.d.c.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1415b {
    /* JADX INFO: renamed from: a */
    private static void m3566a(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            AbstractC1416c.m3576a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3567a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iM3565a = 0;
        int length = iArr.length;
        if (AbstractC1416c.m3595c(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        if (AbstractC1416c.m3589b(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrM3582a = AbstractC1416c.m3582a(length, iArr2);
        int[] iArr4 = new int[length];
        iArr4[0] = 1;
        int iM3565a2 = (iArrM3582a[0] & 1) == 0 ? m3565a(iArr, iArrM3582a, length, iArr4, 0) : 0;
        if (AbstractC1416c.m3589b(length, iArrM3582a)) {
            m3566a(iArr, iM3565a2, iArr4, iArr3);
            return;
        }
        int[] iArrM3582a2 = AbstractC1416c.m3582a(length, iArr);
        int[] iArr5 = new int[length];
        int i = length;
        int i2 = iM3565a2;
        while (true) {
            if (iArrM3582a[i - 1] == 0 && iArrM3582a2[i - 1] == 0) {
                i--;
            } else if (AbstractC1416c.m3596c(i, iArrM3582a, iArrM3582a2)) {
                AbstractC1416c.m3601e(i, iArrM3582a2, iArrM3582a);
                int iM3565a3 = m3565a(iArr, iArrM3582a, i, iArr4, (AbstractC1416c.m3601e(length, iArr5, iArr4) - iM3565a) + i2);
                if (AbstractC1416c.m3589b(i, iArrM3582a)) {
                    m3566a(iArr, iM3565a3, iArr4, iArr3);
                    return;
                }
                i2 = iM3565a3;
            } else {
                AbstractC1416c.m3601e(i, iArrM3582a, iArrM3582a2);
                iM3565a = m3565a(iArr, iArrM3582a2, i, iArr5, (AbstractC1416c.m3601e(length, iArr4, iArr5) - i2) + iM3565a);
                if (AbstractC1416c.m3589b(i, iArrM3582a2)) {
                    m3566a(iArr, iM3565a, iArr5, iArr3);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m3565a(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
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
        int iM3574a = i2;
        for (int i11 = 0; i11 < i3; i11++) {
            if ((iArr3[0] & 1) != 0) {
                iM3574a = iM3574a < 0 ? iM3574a + AbstractC1416c.m3574a(length, iArr, iArr3) : iM3574a + AbstractC1416c.m3601e(length, iArr, iArr3);
            }
            AbstractC1416c.m3597d(length, iArr3, iM3574a);
        }
        return iM3574a;
    }
}
