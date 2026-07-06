package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class q extends org.bouncycastle.a.aa.ae {
    q() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerC = b.c("020A601907B8C953CA1481EB10512F78744A3205FD");
        byte[] bArrA = org.bouncycastle.f.a.f.a("85E25BFE5C86226CDB12016F7553F9D0E693A268");
        BigInteger bigIntegerC2 = b.c("040000000000000000000292FE77E70C12A4234C33");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(163, 3, 6, 7, bigIntegerValueOf, bigIntegerC, bigIntegerC2, bigIntegerValueOf2));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1")), bigIntegerC2, bigIntegerValueOf2, bArrA);
    }
}
