package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class t extends p {
    private static final BigInteger b = BigInteger.valueOf(1);
    private static final BigInteger c = BigInteger.valueOf(2);
    private BigInteger d;

    public final BigInteger c() {
        return this.d;
    }

    public t(BigInteger bigInteger, r rVar) {
        super(false, rVar);
        if (rVar != null && (c.compareTo(bigInteger) > 0 || rVar.a().subtract(c).compareTo(bigInteger) < 0 || !b.equals(bigInteger.modPow(rVar.b(), rVar.a())))) {
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        this.d = bigInteger;
    }
}
