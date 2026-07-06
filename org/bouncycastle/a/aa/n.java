package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class n extends ae {
    n() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(10L);
        d$d d_d = new d$d(239, 36, new BigInteger("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F", 16), new BigInteger("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
