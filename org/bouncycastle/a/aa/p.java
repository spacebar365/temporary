package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class p extends ae {
    p() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("fffffffffffffffffffffffe5fb1a724dc80418648d8dd31", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        d$e d_e = new d$e(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF", 16), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_e, new af(d_e, org.bouncycastle.f.a.f.a("03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("31a92ee2029fd10d901b113e990710f0d21ac6b6"));
    }
}
