package org.bouncycastle.d.b;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class h implements b {
    protected final BigInteger a;

    h(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // org.bouncycastle.d.b.b
    public final BigInteger a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.b.b
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.a.equals(((h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
