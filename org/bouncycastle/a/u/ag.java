package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class ag extends org.bouncycastle.a.aa.ae {
    ag() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
        BigInteger bigIntegerC2 = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70");
        BigInteger bigIntegerC3 = b.c("B4E134D3FB59EB8BAB57274904664D5AF50388BA");
        byte[] bArrA = org.bouncycastle.f.a.f.a("B99B99B099B323E02709A4D696E6768756151751");
        BigInteger bigIntegerC4 = b.c("0100000000000000000000351EE786A818F3A1A16B");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
