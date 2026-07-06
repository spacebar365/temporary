package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class u extends ae {
    u() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("ffffffffffffffffffffffff7a62d031c83f4294f640ec13", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        d$e d_e = new d$e(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF", 16), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("22123dc2395a05caa7423daeccc94760a7d462256bd56916", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_e, new af(d_e, org.bouncycastle.f.a.f.a("027d29778100c65a1da1783716588dce2b8b4aee8e228f1896")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("c469684435deb378c4b65ca9591e2a5763059a2e"));
    }
}
