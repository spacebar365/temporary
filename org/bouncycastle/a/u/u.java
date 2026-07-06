package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class u extends org.bouncycastle.a.aa.ae {
    u() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerC = b.c("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
        byte[] bArrA = org.bouncycastle.f.a.f.a("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
        BigInteger bigIntegerC2 = b.c("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(233, 74, bigIntegerValueOf, bigIntegerC, bigIntegerC2, bigIntegerValueOf2));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052")), bigIntegerC2, bigIntegerValueOf2, bArrA);
    }
}
