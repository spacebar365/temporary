package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class w extends ae {
    w() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff800000cfa7e8594377d414c03821bc582063", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        d$e d_e = new d$e(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("617fab6832576cbbfed50d99f0249c3fee58b94ba0038c7ae84c8c832f2c", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_e, new af(d_e, org.bouncycastle.f.a.f.a("0238af09d98727705120c921bb5e9e26296a3cdcf2f35757a0eafd87b830e7")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("e8b4011604095303ca3b8099982be09fcb9ae616"));
    }
}
