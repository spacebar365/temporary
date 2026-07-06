package org.bouncycastle.c.c;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public n(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
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

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.c.equals(nVar.c) && this.a.equals(nVar.a) && this.b.equals(nVar.b);
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.a.hashCode()) ^ this.b.hashCode();
    }
}
