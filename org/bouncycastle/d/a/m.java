package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {
    @Override // org.bouncycastle.d.a.a
    protected final j b(j jVar, BigInteger bigInteger) {
        d dVarD = jVar.d();
        if (bigInteger.bitLength() > o.a(dVarD)) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        d dVarD2 = jVar.d();
        n nVar = (n) dVarD2.a(jVar, "bc_fixed_point", new p(dVarD2, jVar));
        h hVarA = nVar.a();
        int iC = nVar.c();
        int i = ((r2 + iC) - 1) / iC;
        j jVarE = dVarD.e();
        int i2 = i * iC;
        int[] iArrA = org.bouncycastle.d.c.c.a(i2, bigInteger);
        int i3 = i2 - 1;
        int i4 = 0;
        j jVarD = jVarE;
        while (i4 < i) {
            int i5 = 0;
            for (int i6 = i3 - i4; i6 >= 0; i6 -= i) {
                int i7 = iArrA[i6 >>> 5] >>> (i6 & 31);
                i5 = ((i5 ^ (i7 >>> 1)) << 1) ^ i7;
            }
            i4++;
            jVarD = jVarD.d(hVarA.a(i5));
        }
        return jVarD.b(nVar.b());
    }
}
