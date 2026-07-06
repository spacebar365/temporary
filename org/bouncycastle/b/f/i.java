package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class i implements org.bouncycastle.b.c {
    private static final BigInteger a = BigInteger.valueOf(1);
    private org.bouncycastle.b.k.o b;

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.b = (org.bouncycastle.b.k.o) xVar;
    }

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        BigInteger bigIntegerA;
        org.bouncycastle.b.k.r rVarC = this.b.c();
        BigInteger bigIntegerB = rVarC.b();
        SecureRandom secureRandomA = this.b.a();
        int iBitLength = bigIntegerB.bitLength() >>> 2;
        do {
            bigIntegerA = org.bouncycastle.f.b.a(a, bigIntegerB.subtract(a), secureRandomA);
        } while (org.bouncycastle.d.a.aa.a(bigIntegerA) < iBitLength);
        return new org.bouncycastle.b.b(new org.bouncycastle.b.k.t(rVarC.c().modPow(bigIntegerA, rVarC.a()), rVarC), new org.bouncycastle.b.k.s(bigIntegerA, rVarC));
    }
}
