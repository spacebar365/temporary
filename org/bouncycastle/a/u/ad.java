package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class ad extends org.bouncycastle.a.aa.ae {
    ad() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        BigInteger bigIntegerC2 = b.c("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
        BigInteger bigIntegerC3 = b.c("5EEEFCA380D02919DC2C6558BB6D8A5D");
        byte[] bArrA = org.bouncycastle.f.a.f.a("004D696E67687561517512D8F03431FCE63B88F4");
        BigInteger bigIntegerC4 = b.c("3FFFFFFF7FFFFFFFBE0024720613B5A3");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
