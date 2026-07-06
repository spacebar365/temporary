package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class m extends org.bouncycastle.a.aa.ae {
    m() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("03E5A88919D7CAFCBF415F07C2176573B2");
        BigInteger bigIntegerC2 = b.c("04B8266A46C55657AC734CE38F018F2192");
        byte[] bArrA = org.bouncycastle.f.a.f.a("985BD3ADBAD4D696E676875615175A21B43A97E3");
        BigInteger bigIntegerC3 = b.c("0400000000000000016954A233049BA98F");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(131, 2, 3, 8, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
