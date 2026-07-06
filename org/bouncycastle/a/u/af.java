package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class af extends org.bouncycastle.a.aa.ae {
    af() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
        BigInteger bigIntegerC2 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
        BigInteger bigIntegerC3 = b.c("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
        byte[] bArrA = org.bouncycastle.f.a.f.a("1053CDE42C14D696E67687561517533BF3F83345");
        BigInteger bigIntegerC4 = b.c("0100000000000000000001F4C8F927AED3CA752257");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
