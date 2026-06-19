package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bm */
/* JADX INFO: loaded from: classes.dex */
public class C1088bm extends C1075b {

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4434b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private BigInteger f4435c;

    /* JADX INFO: renamed from: d */
    private BigInteger f4436d;

    /* JADX INFO: renamed from: b */
    public final BigInteger m2625b() {
        return this.f4435c;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2626c() {
        return this.f4436d;
    }

    public C1088bm(boolean z, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z);
        if (!z && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        }
        if (!bigInteger.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(f4434b)) {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
        this.f4435c = bigInteger;
        this.f4436d = bigInteger2;
    }
}
