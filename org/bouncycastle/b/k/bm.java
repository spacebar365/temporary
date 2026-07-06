package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class bm extends b {
    private static final BigInteger b = BigInteger.valueOf(1);
    private BigInteger c;
    private BigInteger d;

    public final BigInteger b() {
        return this.c;
    }

    public final BigInteger c() {
        return this.d;
    }

    public bm(boolean z, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z);
        if (!z && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        }
        if (!bigInteger.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(b)) {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
        this.c = bigInteger;
        this.d = bigInteger2;
    }
}
