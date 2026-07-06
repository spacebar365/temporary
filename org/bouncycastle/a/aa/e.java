package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class e extends ae {
    e() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("ffffffffffffffffffffffff99def836146bc9b1b4d22831", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        d$e d_e = new d$e(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF", 16), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_e, new af(d_e, org.bouncycastle.f.a.f.a("03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("3045AE6FC8422f64ED579528D38120EAE12196D5"));
    }
}
