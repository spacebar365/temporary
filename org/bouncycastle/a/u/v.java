package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class v extends org.bouncycastle.a.aa.ae {
    v() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigInteger = org.bouncycastle.d.a.c.c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerC = b.c("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(4L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(239, 158, bigInteger, bigIntegerValueOf, bigIntegerC, bigIntegerValueOf2));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA")), bigIntegerC, bigIntegerValueOf2, (byte[]) null);
    }
}
