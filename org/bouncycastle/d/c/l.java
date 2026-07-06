package org.bouncycastle.d.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(int[] iArr, int[] iArr2) {
        h.f(iArr, iArr2);
        h.g(iArr, iArr2);
        int iB = h.b(iArr2, iArr2);
        int iA = iB + h.a(iArr2, 24, iArr2, 16, h.a(iArr2, 0, iArr2, 8, 0) + iB);
        int[] iArr3 = new int[8];
        h.c(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        h.f(iArr3, iArr4);
        c.a(32, iA + c.c(16, iArr4, iArr2, 8), iArr2, 24);
    }
}
