package org.bouncycastle.a.i;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.d.a.d$e;
import org.bouncycastle.f.a.f;

/* JADX INFO: loaded from: classes.dex */
final class b extends ae {
    b() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigIntegerC = a.c("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
        BigInteger bigIntegerC2 = a.c("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
        BigInteger bigIntegerC3 = a.c("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
        BigInteger bigIntegerC4 = a.c("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = a.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new ad(dVarA, new af(dVarA, f.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), bigIntegerC4, bigIntegerValueOf, (byte[]) null);
    }
}
