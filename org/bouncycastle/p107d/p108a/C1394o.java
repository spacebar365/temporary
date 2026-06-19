package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1394o {
    /* JADX INFO: renamed from: a */
    public static int m3485a(AbstractC1381d abstractC1381d) {
        BigInteger bigIntegerM3368i = abstractC1381d.m3368i();
        return bigIntegerM3368i == null ? abstractC1381d.mo2905a() + 1 : bigIntegerM3368i.bitLength();
    }
}
