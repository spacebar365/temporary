package org.bouncycastle.d.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        f.d(iArr, iArr2, iArr3);
        f.a(iArr, iArr2, iArr3, 12);
        int iA = f.a(iArr3, iArr3);
        int iA2 = iA + f.a(iArr3, 18, iArr3, 12, f.a(iArr3, 0, iArr3, 6, 0) + iA);
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = f.c(iArr, iArr, iArr4) != f.c(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        f.d(iArr4, iArr5, iArr6);
        c.a(24, (z ? c.a(12, iArr6, iArr3, 6) : c.c(12, iArr6, iArr3, 6)) + iA2, iArr3, 18);
    }

    public static void a(int[] iArr, int[] iArr2) {
        f.d(iArr, iArr2);
        f.e(iArr, iArr2);
        int iA = f.a(iArr2, iArr2);
        int iA2 = iA + f.a(iArr2, 18, iArr2, 12, f.a(iArr2, 0, iArr2, 6, 0) + iA);
        int[] iArr3 = new int[6];
        f.c(iArr, iArr, iArr3);
        int[] iArr4 = new int[12];
        f.d(iArr3, iArr4);
        c.a(24, iA2 + c.c(12, iArr4, iArr2, 6), iArr2, 18);
    }
}
