package org.bouncycastle.p118e.p140d.p141a;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1528e {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f5464a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b */
    private static final BigInteger f5465b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f5466c = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: d */
    private static final BigInteger f5467d = BigInteger.valueOf(4);

    /* JADX INFO: renamed from: e */
    private static final int[] f5468e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* JADX INFO: renamed from: f */
    private static SecureRandom f5469f = null;

    /* JADX INFO: renamed from: g */
    private static final int[] f5470g = {0, 1, 0, -1, 0, -1, 0, 1};

    /* JADX INFO: renamed from: a */
    public static int m4035a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
