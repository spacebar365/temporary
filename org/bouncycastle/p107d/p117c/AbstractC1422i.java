package org.bouncycastle.p107d.p117c;

/* JADX INFO: renamed from: org.bouncycastle.d.c.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1422i {
    /* JADX INFO: renamed from: a */
    public static void m3708a(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3709a(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
