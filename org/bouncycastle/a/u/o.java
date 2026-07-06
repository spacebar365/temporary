package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class o extends org.bouncycastle.a.aa.ae {
    o() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
        BigInteger bigIntegerC = b.c("04000000000000000000020108A2E0CC0D99F8A5EF");
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(163, 3, 6, 7, bigIntegerValueOf, bigIntegerValueOf2, bigIntegerC, bigIntegerValueOf3));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9")), bigIntegerC, bigIntegerValueOf3, (byte[]) null);
    }
}
