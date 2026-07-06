package org.bouncycastle.c.c;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class i implements AlgorithmParameterSpec {
    private BigInteger a;
    private BigInteger b;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }
}
