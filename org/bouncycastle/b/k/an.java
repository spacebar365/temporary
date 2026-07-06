package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class an implements org.bouncycastle.b.i {
    private BigInteger a;
    private BigInteger b;
    private int c;

    public an(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public an(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = i;
    }

    public final BigInteger a() {
        return this.b;
    }

    public final BigInteger b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return anVar.b.equals(this.b) && anVar.a.equals(this.a) && anVar.c == this.c;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.a.hashCode()) + this.c;
    }
}
