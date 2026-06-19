package org.bouncycastle.p118e.p140d.p141a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1527d {
    /* JADX INFO: renamed from: a */
    public static boolean m4033a(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m4034a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }
}
