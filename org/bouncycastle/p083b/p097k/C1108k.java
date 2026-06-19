package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.b.k.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1108k extends C1103f {

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4472b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f4473c = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: d */
    private BigInteger f4474d;

    /* JADX INFO: renamed from: c */
    public final BigInteger m2672c() {
        return this.f4474d;
    }

    @Override // org.bouncycastle.p083b.p097k.C1103f
    public final int hashCode() {
        return this.f4474d.hashCode() ^ super.hashCode();
    }

    public C1108k(BigInteger bigInteger, C1106i c1106i) {
        super(false, c1106i);
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        if (bigInteger.compareTo(f4473c) < 0 || bigInteger.compareTo(c1106i.m2664a().subtract(f4473c)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (c1106i.m2666c() != null && !f4472b.equals(bigInteger.modPow(c1106i.m2666c(), c1106i.m2664a()))) {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        this.f4474d = bigInteger;
    }

    @Override // org.bouncycastle.p083b.p097k.C1103f
    public final boolean equals(Object obj) {
        if (obj instanceof C1108k) {
            return ((C1108k) obj).f4474d.equals(this.f4474d) && super.equals(obj);
        }
        return false;
    }
}
