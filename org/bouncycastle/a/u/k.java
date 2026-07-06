package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class k extends org.bouncycastle.a.aa.ae {
    k() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("00689918DBEC7E5A0DD6DFC0AA55C7");
        BigInteger bigIntegerC2 = b.c("0095E9A9EC9B297BD4BF36E059184F");
        byte[] bArrA = org.bouncycastle.f.a.f.a("10C0FB15760860DEF1EEF4D696E676875615175D");
        BigInteger bigIntegerC3 = b.c("010000000000000108789B2496AF93");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(113, 9, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
