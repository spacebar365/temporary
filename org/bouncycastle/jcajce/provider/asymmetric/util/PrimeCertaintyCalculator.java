package org.bouncycastle.jcajce.provider.asymmetric.util;

/* JADX INFO: loaded from: classes.dex */
public class PrimeCertaintyCalculator {
    private PrimeCertaintyCalculator() {
    }

    /* JADX INFO: renamed from: a */
    public static int m4342a(int i) {
        if (i <= 1024) {
            return 80;
        }
        return (((i - 1) / 1024) * 16) + 96;
    }
}
