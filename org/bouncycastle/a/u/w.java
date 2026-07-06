package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class w extends org.bouncycastle.a.aa.ae {
    w() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigInteger = org.bouncycastle.d.a.c.c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerC = b.c("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(4L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(283, 5, 7, 12, bigInteger, bigIntegerValueOf, bigIntegerC, bigIntegerValueOf2));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259")), bigIntegerC, bigIntegerValueOf2, (byte[]) null);
    }
}
