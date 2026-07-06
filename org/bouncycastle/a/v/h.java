package org.bouncycastle.a.v;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class h extends ae {
    h() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("E95E4A5F737059DC60DF5991D45029409E60FC09", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        org.bouncycastle.d.a.d dVarA = a.a(new d$e(new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620F", 16), new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620C", 16), new BigInteger("7A556B6DAE535B7B51ED2C4D7DAA7A0B5C55F380", 16), bigInteger, bigInteger2));
        return new ad(dVarA, new af(dVarA, org.bouncycastle.f.a.f.a("04B199B13B9B34EFC1397E64BAEB05ACC265FF2378ADD6718B7C7C1961F0991B842443772152C9E0AD")), bigInteger, bigInteger2);
    }
}
