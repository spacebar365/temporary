package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d$b extends d {
    protected d$b(BigInteger bigInteger) {
        super(org.bouncycastle.d.b.c.a(bigInteger));
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(int i, BigInteger bigInteger) {
        g gVarA = a(bigInteger);
        g gVarG = gVarA.e().a(this.b).c(gVarA).a(this.c).g();
        if (gVarG == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        if (gVarG.k() != (i == 1)) {
            gVarG = gVarG.d();
        }
        return a(gVarA, gVarG, true);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean b(BigInteger bigInteger) {
        return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(f().a()) < 0;
    }
}
