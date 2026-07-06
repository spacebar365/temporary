package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k extends f {
    private static final BigInteger b = BigInteger.valueOf(1);
    private static final BigInteger c = BigInteger.valueOf(2);
    private BigInteger d;

    public final BigInteger c() {
        return this.d;
    }

    @Override // org.bouncycastle.b.k.f
    public final int hashCode() {
        return this.d.hashCode() ^ super.hashCode();
    }

    public k(BigInteger bigInteger, i iVar) {
        super(false, iVar);
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        if (bigInteger.compareTo(c) < 0 || bigInteger.compareTo(iVar.a().subtract(c)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (iVar.c() != null && !b.equals(bigInteger.modPow(iVar.c(), iVar.a()))) {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        this.d = bigInteger;
    }

    @Override // org.bouncycastle.b.k.f
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).d.equals(this.d) && super.equals(obj);
        }
        return false;
    }
}
