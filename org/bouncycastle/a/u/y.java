package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class y extends org.bouncycastle.a.aa.ae {
    y() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        BigInteger bigIntegerC2 = b.c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC");
        BigInteger bigIntegerC3 = b.c("E87579C11079F43DD824993C2CEE5ED3");
        byte[] bArrA = org.bouncycastle.f.a.f.a("000E0D4D696E6768756151750CC03A4473D03679");
        BigInteger bigIntegerC4 = b.c("FFFFFFFE0000000075A30D1B9038A115");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83")), bigIntegerC4, bigIntegerValueOf, bArrA);
    }
}
