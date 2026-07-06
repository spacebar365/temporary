package org.bouncycastle.c.c;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes.dex */
public class o implements KeySpec {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;

    public o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigInteger3;
        this.d = bigInteger4;
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.c;
    }

    public final BigInteger d() {
        return this.d;
    }
}
