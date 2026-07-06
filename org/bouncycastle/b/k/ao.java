package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ao extends am {
    private BigInteger b;

    public ao(BigInteger bigInteger, an anVar) {
        super(true, anVar);
        this.b = bigInteger;
    }

    public final BigInteger c() {
        return this.b;
    }

    @Override // org.bouncycastle.b.k.am
    public final boolean equals(Object obj) {
        if ((obj instanceof ao) && ((ao) obj).b.equals(this.b)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // org.bouncycastle.b.k.am
    public final int hashCode() {
        return this.b.hashCode();
    }
}
