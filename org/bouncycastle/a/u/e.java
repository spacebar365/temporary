package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class e extends org.bouncycastle.a.aa.ae {
    e() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
        BigInteger bigIntegerC2 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
        BigInteger bigIntegerC3 = b.c("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
        byte[] bArrA = org.bouncycastle.f.a.f.a("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
        BigInteger bigIntegerC4 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
