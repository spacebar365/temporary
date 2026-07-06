package org.bouncycastle.b.k;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class bl extends org.bouncycastle.b.x {
    private BigInteger a;
    private int b;

    public bl(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.a = bigInteger;
        this.b = i2;
    }

    public final BigInteger c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }
}
