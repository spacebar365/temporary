package org.bouncycastle.a.v;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class l extends ae {
    l() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        org.bouncycastle.d.a.d dVarA = a.a(new d$e(new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF", 16), new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FC", 16), new BigInteger("4B337D934104CD7BEF271BF60CED1ED20DA14C08B3BB64F18A60888D", 16), bigInteger, bigInteger2));
        return new ad(dVarA, new af(dVarA, org.bouncycastle.f.a.f.a("046AB1E344CE25FF3896424E7FFE14762ECB49F8928AC0C76029B4D5800374E9F5143E568CD23F3F4D7C0D4B1E41C8CC0D1C6ABD5F1A46DB4C")), bigInteger, bigInteger2);
    }
}
