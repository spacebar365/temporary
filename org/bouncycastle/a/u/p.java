package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class p extends org.bouncycastle.a.aa.ae {
    p() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
        BigInteger bigIntegerC2 = b.c("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
        byte[] bArrA = org.bouncycastle.f.a.f.a("24B7B137C8A14D696E6768756151756FD0DA2E5C");
        BigInteger bigIntegerC3 = b.c("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(163, 3, 6, 7, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
