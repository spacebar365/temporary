package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class z extends ae {
    z() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("0400000000000000000001E60FC8821CC74DAEAFC1", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        d$d d_d = new d$d(163, 1, 2, 8, new BigInteger("072546B5435234A422E0789675F432C89435DE5242", 16), new BigInteger("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0307AF69989546103D79329FCC3D74880F33BBE803CB")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("D2C0FB15760860DEF1EEF4D696E6768756151754"));
    }
}
