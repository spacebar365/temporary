package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class f extends ae {
    f() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        d$d d_d = new d$d(163, 1, 2, 8, new BigInteger("07A526C63D3E25A256A007699F5447E32AE456B50E", 16), new BigInteger("03F7061798EB99E238FD6F1BF95B48FEEB4854252B", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
