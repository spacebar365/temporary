package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bb;
import org.bouncycastle.b.k.bc;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class f implements org.bouncycastle.b.d {
    bb a;

    @Override // org.bouncycastle.b.d
    public final int a() {
        return (this.a.a().b().a().a() + 7) / 8;
    }

    @Override // org.bouncycastle.b.d
    public final void a(org.bouncycastle.b.i iVar) {
        this.a = (bb) iVar;
    }

    @Override // org.bouncycastle.b.d
    public final BigInteger b(org.bouncycastle.b.i iVar) {
        if (org.bouncycastle.f.h.a("org.bouncycastle.ec.disable_mqv")) {
            throw new IllegalStateException("ECMQV explicitly disabled");
        }
        bc bcVar = (bc) iVar;
        ad adVarA = this.a.a();
        y yVarB = adVarA.b();
        if (!yVarB.equals(bcVar.a().b())) {
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        ad adVarB = this.a.b();
        ae aeVarC = this.a.c();
        ae aeVarA = bcVar.a();
        ae aeVarB = bcVar.b();
        BigInteger bigIntegerC = yVarB.c();
        int iBitLength = (bigIntegerC.bitLength() + 1) / 2;
        BigInteger bigIntegerShiftLeft = org.bouncycastle.d.a.c.d.shiftLeft(iBitLength);
        org.bouncycastle.d.a.d dVarA = yVarB.a();
        org.bouncycastle.d.a.j jVarB = org.bouncycastle.d.a.b.b(dVarA, aeVarC.c());
        org.bouncycastle.d.a.j jVarB2 = org.bouncycastle.d.a.b.b(dVarA, aeVarA.c());
        org.bouncycastle.d.a.j jVarB3 = org.bouncycastle.d.a.b.b(dVarA, aeVarB.c());
        BigInteger bigIntegerMod = adVarA.c().multiply(jVarB.g().a().mod(bigIntegerShiftLeft).setBit(iBitLength)).add(adVarB.c()).mod(bigIntegerC);
        BigInteger bit = jVarB3.g().a().mod(bigIntegerShiftLeft).setBit(iBitLength);
        BigInteger bigIntegerMod2 = yVarB.d().multiply(bigIntegerMod).mod(bigIntegerC);
        org.bouncycastle.d.a.j jVarO = org.bouncycastle.d.a.b.a(jVarB2, bit.multiply(bigIntegerMod2).mod(bigIntegerC), jVarB3, bigIntegerMod2).o();
        if (jVarO.p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        }
        return jVarO.g().a();
    }
}
