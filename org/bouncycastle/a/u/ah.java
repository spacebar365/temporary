package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class ah extends org.bouncycastle.a.aa.ae {
    ah() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37");
        BigInteger bigInteger = org.bouncycastle.d.a.c.c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(3L);
        BigInteger bigIntegerC2 = b.c("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigInteger, bigIntegerValueOf, bigIntegerC2, bigIntegerValueOf2), new org.bouncycastle.d.a.b.d(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), 208));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D")), bigIntegerC2, bigIntegerValueOf2, (byte[]) null);
    }
}
