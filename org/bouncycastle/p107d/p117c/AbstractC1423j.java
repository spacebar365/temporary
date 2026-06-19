package org.bouncycastle.p107d.p117c;

/* JADX INFO: renamed from: org.bouncycastle.d.c.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1423j {
    /* JADX INFO: renamed from: a */
    public static void m3711a(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC1419f.m3655d(iArr, iArr2, iArr3);
        AbstractC1419f.m3638a(iArr, iArr2, iArr3, 12);
        int iM3635a = AbstractC1419f.m3635a(iArr3, iArr3);
        int iM3633a = iM3635a + AbstractC1419f.m3633a(iArr3, 18, iArr3, 12, AbstractC1419f.m3633a(iArr3, 0, iArr3, 6, 0) + iM3635a);
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = AbstractC1419f.m3652c(iArr, iArr, iArr4) != AbstractC1419f.m3652c(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        AbstractC1419f.m3655d(iArr4, iArr5, iArr6);
        AbstractC1416c.m3569a(24, (z ? AbstractC1416c.m3575a(12, iArr6, iArr3, 6) : AbstractC1416c.m3593c(12, iArr6, iArr3, 6)) + iM3633a, iArr3, 18);
    }

    /* JADX INFO: renamed from: a */
    public static void m3710a(int[] iArr, int[] iArr2) {
        AbstractC1419f.m3654d(iArr, iArr2);
        AbstractC1419f.m3657e(iArr, iArr2);
        int iM3635a = AbstractC1419f.m3635a(iArr2, iArr2);
        int iM3633a = iM3635a + AbstractC1419f.m3633a(iArr2, 18, iArr2, 12, AbstractC1419f.m3633a(iArr2, 0, iArr2, 6, 0) + iM3635a);
        int[] iArr3 = new int[6];
        AbstractC1419f.m3652c(iArr, iArr, iArr3);
        int[] iArr4 = new int[12];
        AbstractC1419f.m3654d(iArr3, iArr4);
        AbstractC1416c.m3569a(24, iM3633a + AbstractC1416c.m3593c(12, iArr4, iArr2, 6), iArr2, 18);
    }
}
