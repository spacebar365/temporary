package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final BigInteger d = BigInteger.valueOf(2);
    private int a;
    private int b;
    private SecureRandom c;

    public final org.bouncycastle.b.k.i a() {
        BigInteger[] bigIntegerArrA = h.a(this.a, this.b, this.c);
        BigInteger bigInteger = bigIntegerArrA[0];
        return new org.bouncycastle.b.k.i(bigInteger, h.a(bigInteger, this.c), bigIntegerArrA[1], d, null);
    }

    public final void a(int i, int i2, SecureRandom secureRandom) {
        this.a = i;
        this.b = i2;
        this.c = secureRandom;
    }
}
