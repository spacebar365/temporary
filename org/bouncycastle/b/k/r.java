package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class r implements org.bouncycastle.b.i {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private u d;

    public r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
    }

    public r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, u uVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = uVar;
    }

    public final BigInteger a() {
        return this.c;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.a;
    }

    public final u d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.c.equals(this.c) && rVar.b.equals(this.b) && rVar.a.equals(this.a);
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
