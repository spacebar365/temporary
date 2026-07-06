package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class x extends ae {
    x() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        d$e d_e = new d$e(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_e, new af(d_e, org.bouncycastle.f.a.f.a("036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("7d7374168ffe3471b60a857686a19475d3bfa2ff"));
    }
}
