package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class r extends org.bouncycastle.a.aa.ae {
    r() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
        BigInteger bigIntegerC2 = b.c("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
        byte[] bArrA = org.bouncycastle.f.a.f.a("103FAEC74D696E676875615175777FC5B191EF30");
        BigInteger bigIntegerC3 = b.c("01000000000000000000000000C7F34A778F443ACC920EBA49");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(193, 15, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
