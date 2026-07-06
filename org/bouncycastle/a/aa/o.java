package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class o extends ae {
    o() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("0100FAF51354E0E39E4892DF6E319C72C8161603FA45AA7B998A167B8F1E629521", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(65286L);
        d$d d_d = new d$d(272, 1, 3, 56, new BigInteger("0091A091F03B5FBA4AB2CCF49C4EDD220FB028712D42BE752B2C40094DBACDB586FB20", 16), new BigInteger("7167EFC92BB2E3CE7C8AAAFF34E12A9C557003D7C73A6FAF003F99F6CC8482E540F7", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("026108BABB2CEEBCF787058A056CBE0CFE622D7723A289E08A07AE13EF0D10D171DD8D")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
