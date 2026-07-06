package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class h extends ae {
    h() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("40000000000000000000000004A20E90C39067C893BBB9A5", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        d$d d_d = new d$d(191, 9, new BigInteger("2866537B676752636A68F56554E12640276B649EF7526267", 16), new BigInteger("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D")), bigInteger, bigIntegerValueOf, org.bouncycastle.f.a.f.a("4E13CA542744D696E67687561517552F279A8C84"));
    }
}
