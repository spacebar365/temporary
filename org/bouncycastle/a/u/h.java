package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class h extends org.bouncycastle.a.aa.ae {
    h() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF");
        BigInteger bigIntegerC2 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC");
        BigInteger bigIntegerC3 = b.c("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF");
        byte[] bArrA = org.bouncycastle.f.a.f.a("A335926AA319A27A1D00896A6773A4827ACDAC73");
        BigInteger bigIntegerC4 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
