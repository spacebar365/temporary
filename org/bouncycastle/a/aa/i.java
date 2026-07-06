package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class i extends ae {
    i() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("20000000000000000000000050508CB89F652824E06B8173", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        d$d d_d = new d$d(191, 9, new BigInteger("401028774D7777C7B7666D1366EA432071274F89FF01E718", 16), new BigInteger("0620048D28BCBD03B6249C99182B7C8CD19700C362C46A01", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("023809B2B7CC1B28CC5A87926AAD83FD28789E81E2C9E3BF10")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
