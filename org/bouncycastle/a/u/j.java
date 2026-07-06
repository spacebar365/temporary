package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class j extends org.bouncycastle.a.aa.ae {
    j() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("003088250CA6E7C7FE649CE85820F7");
        BigInteger bigIntegerC2 = b.c("00E8BEE4D3E2260744188BE0E9C723");
        byte[] bArrA = org.bouncycastle.f.a.f.a("10E723AB14D696E6768756151756FEBF8FCB49A9");
        BigInteger bigIntegerC3 = b.c("0100000000000000D9CCEC8A39E56F");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(113, 9, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
