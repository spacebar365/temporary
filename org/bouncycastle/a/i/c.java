package org.bouncycastle.a.i;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.d.a.d$e;
import org.bouncycastle.f.a.f;

/* JADX INFO: loaded from: classes.dex */
final class c extends ae {
    c() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigIntegerC = a.c("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
        BigInteger bigIntegerC2 = a.c("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
        BigInteger bigIntegerC3 = a.c("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
        BigInteger bigIntegerC4 = a.c("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = a.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new ad(dVarA, new af(dVarA, f.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), bigIntegerC4, bigIntegerValueOf, (byte[]) null);
    }
}
