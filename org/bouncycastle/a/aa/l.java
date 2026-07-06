package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class l extends ae {
    l() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("2000000000000000000000000000000F4D42FFE1492A4993F1CAD666E447", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        d$d d_d = new d$d(239, 36, new BigInteger("32010857077C5431123A46B808906756F543423E8D27877578125778AC76", 16), new BigInteger("790408F2EEDAF392B012EDEFB3392F30F4327C0CA3F31FC383C422AA8C16", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0257927098FA932E7C0A96D3FD5B706EF7E5F5C156E16B7E7C86038552E91D")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
