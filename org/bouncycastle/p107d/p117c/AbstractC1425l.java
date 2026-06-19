package org.bouncycastle.p107d.p117c;

/* JADX INFO: renamed from: org.bouncycastle.d.c.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1425l {
    /* JADX INFO: renamed from: a */
    public static void m3714a(int[] iArr, int[] iArr2) {
        AbstractC1421h.m3704f(iArr, iArr2);
        AbstractC1421h.m3706g(iArr, iArr2);
        int iM3689b = AbstractC1421h.m3689b(iArr2, iArr2);
        int iM3679a = iM3689b + AbstractC1421h.m3679a(iArr2, 24, iArr2, 16, AbstractC1421h.m3679a(iArr2, 0, iArr2, 8, 0) + iM3689b);
        int[] iArr3 = new int[8];
        AbstractC1421h.m3697c(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        AbstractC1421h.m3704f(iArr3, iArr4);
        AbstractC1416c.m3569a(32, iM3679a + AbstractC1416c.m3593c(16, iArr4, iArr2, 8), iArr2, 24);
    }
}
