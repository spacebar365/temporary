package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.b.k.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1117t extends C1113p {

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4494b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f4495c = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: d */
    private BigInteger f4496d;

    /* JADX INFO: renamed from: c */
    public final BigInteger m2691c() {
        return this.f4496d;
    }

    public C1117t(BigInteger bigInteger, C1115r c1115r) {
        super(false, c1115r);
        if (c1115r != null && (f4495c.compareTo(bigInteger) > 0 || c1115r.m2686a().subtract(f4495c).compareTo(bigInteger) < 0 || !f4494b.equals(bigInteger.modPow(c1115r.m2687b(), c1115r.m2686a())))) {
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        this.f4496d = bigInteger;
    }
}
