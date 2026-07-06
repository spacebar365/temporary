package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class ai extends org.bouncycastle.a.aa.ae {
    ai() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF");
        BigInteger bigIntegerC2 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC");
        BigInteger bigIntegerC3 = b.c("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1");
        byte[] bArrA = org.bouncycastle.f.a.f.a("3045AE6FC8422F64ED579528D38120EAE12196D5");
        BigInteger bigIntegerC4 = b.c("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
