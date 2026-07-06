package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class j extends ae {
    j() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("155555555555555555555555610C0B196812BFB6288A3EA3", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(6L);
        d$d d_d = new d$d(191, 9, new BigInteger("6C01074756099122221056911C77D77E77A777E7E7E77FCB", 16), new BigInteger("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("03375D4CE24FDE434489DE8746E71786015009E66E38A926DD")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
