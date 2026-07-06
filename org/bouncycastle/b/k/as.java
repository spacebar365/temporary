package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class as implements org.bouncycastle.b.i {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public as(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigInteger3;
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

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return asVar.a.equals(this.a) && asVar.b.equals(this.b) && asVar.c.equals(this.c);
    }
}
