package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class i implements org.bouncycastle.b.i {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private int e;
    private int f;
    private n g;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, n nVar) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength()) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
        this.e = i;
        this.f = i2;
        this.d = bigInteger4;
        this.g = nVar;
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, n nVar) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, nVar);
    }

    public final BigInteger a() {
        return this.b;
    }

    public final BigInteger b() {
        return this.a;
    }

    public final BigInteger c() {
        return this.c;
    }

    public final BigInteger d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final n g() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        int i2 = 160;
        if (i != 0 && i < 160) {
            i2 = i;
        }
        this(bigInteger, bigInteger2, null, i2, i, null, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.c != null) {
            if (!this.c.equals(iVar.c)) {
                return false;
            }
        } else if (iVar.c != null) {
            return false;
        }
        return iVar.b.equals(this.b) && iVar.a.equals(this.a);
    }

    public int hashCode() {
        return (this.c != null ? this.c.hashCode() : 0) ^ (this.a.hashCode() ^ this.b.hashCode());
    }
}
