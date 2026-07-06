package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.aq;
import org.bouncycastle.b.k.as;
import org.bouncycastle.b.k.at;
import org.bouncycastle.b.k.au;

/* JADX INFO: loaded from: classes.dex */
public final class r implements org.bouncycastle.b.c {
    private aq a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        as asVarC = this.a.c();
        SecureRandom secureRandomA = this.a.a();
        BigInteger bigIntegerB = asVarC.b();
        BigInteger bigIntegerA = asVarC.a();
        BigInteger bigIntegerC = asVarC.c();
        while (true) {
            BigInteger bigIntegerA2 = org.bouncycastle.f.b.a(256, secureRandomA);
            if (bigIntegerA2.signum() > 0 && bigIntegerA2.compareTo(bigIntegerB) < 0 && org.bouncycastle.d.a.aa.a(bigIntegerA2) >= 64) {
                return new org.bouncycastle.b.b(new au(bigIntegerC.modPow(bigIntegerA2, bigIntegerA), asVarC), new at(bigIntegerA2, asVarC));
            }
        }
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = (aq) xVar;
    }
}
