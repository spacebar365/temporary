package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {
    protected abstract j b(j jVar, BigInteger bigInteger);

    @Override // org.bouncycastle.d.a.i
    public final j a(j jVar, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || jVar.p()) {
            return jVar.d().e();
        }
        j jVarB = b(jVar, bigInteger.abs());
        if (iSignum <= 0) {
            jVarB = jVarB.s();
        }
        return b.a(jVarB);
    }
}
