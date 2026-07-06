package org.bouncycastle.b.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h implements org.bouncycastle.b.d {
    private static final BigInteger b = BigInteger.valueOf(1);
    org.bouncycastle.b.k.g a;

    @Override // org.bouncycastle.b.d
    public final int a() {
        return (this.a.a().b().a().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.b.d
    public final void a(org.bouncycastle.b.i iVar) {
        this.a = (org.bouncycastle.b.k.g) iVar;
    }

    @Override // org.bouncycastle.b.d
    public final BigInteger b(org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.k.h hVar = (org.bouncycastle.b.k.h) iVar;
        org.bouncycastle.b.k.j jVarA = this.a.a();
        if (!this.a.a().b().equals(hVar.a().b())) {
            throw new IllegalStateException("MQV public key components have wrong domain parameters");
        }
        if (this.a.a().b().c() == null) {
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
        org.bouncycastle.b.k.i iVarB = jVarA.b();
        org.bouncycastle.b.k.k kVarA = hVar.a();
        org.bouncycastle.b.k.j jVarB = this.a.b();
        org.bouncycastle.b.k.k kVarC = this.a.c();
        org.bouncycastle.b.k.k kVarB = hVar.b();
        BigInteger bigIntegerC = iVarB.c();
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow((bigIntegerC.bitLength() + 1) / 2);
        BigInteger bigIntegerModPow = kVarB.c().multiply(kVarA.c().modPow(kVarB.c().mod(bigIntegerPow).add(bigIntegerPow), iVarB.a())).modPow(jVarB.c().add(kVarC.c().mod(bigIntegerPow).add(bigIntegerPow).multiply(jVarA.c())).mod(bigIntegerC), iVarB.a());
        if (bigIntegerModPow.equals(b)) {
            throw new IllegalStateException("1 is not a valid agreement value for MQV");
        }
        return bigIntegerModPow;
    }
}
