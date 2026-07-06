package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ap extends am {
    private BigInteger b;

    public ap(BigInteger bigInteger, an anVar) {
        super(false, anVar);
        this.b = bigInteger;
    }

    public final BigInteger c() {
        return this.b;
    }

    @Override // org.bouncycastle.b.k.am
    public final int hashCode() {
        return this.b.hashCode() ^ super.hashCode();
    }

    @Override // org.bouncycastle.b.k.am
    public final boolean equals(Object obj) {
        if (obj instanceof ap) {
            return ((ap) obj).b.equals(this.b) && super.equals(obj);
        }
        return false;
    }
}
