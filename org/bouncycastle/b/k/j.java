package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {
    private BigInteger b;

    public j(BigInteger bigInteger, i iVar) {
        super(true, iVar);
        this.b = bigInteger;
    }

    public final BigInteger c() {
        return this.b;
    }

    @Override // org.bouncycastle.b.k.f
    public final int hashCode() {
        return this.b.hashCode() ^ super.hashCode();
    }

    @Override // org.bouncycastle.b.k.f
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).b.equals(this.b) && super.equals(obj);
        }
        return false;
    }
}
