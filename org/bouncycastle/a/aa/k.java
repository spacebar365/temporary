package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class k extends ae {
    k() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("0101BAF95C9723C57B6C21DA2EFF2D5ED588BDD5717E212F9D", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(65096L);
        d$d d_d = new d$d(208, 1, 2, 83, new BigInteger("0", 16), new BigInteger("00C8619ED45A62E6212E1160349E2BFA844439FAFC2A3FD1638F9E", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0289FDFBE4ABE193DF9559ECF07AC0CE78554E2784EB8C1ED1A57A")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
