package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.aa;
import org.bouncycastle.b.k.ab;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bf;

/* JADX INFO: loaded from: classes.dex */
public final class h implements org.bouncycastle.b.n {
    private boolean a;
    private ab b;
    private SecureRandom c;

    @Override // org.bouncycastle.b.n
    public final BigInteger a() {
        return this.b.b().c();
    }

    @Override // org.bouncycastle.b.m
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.a = z;
        if (!z) {
            this.b = (ae) iVar;
            return;
        }
        if (!(iVar instanceof bf)) {
            this.c = org.bouncycastle.b.l.a();
            this.b = (ad) iVar;
        } else {
            bf bfVar = (bf) iVar;
            this.c = bfVar.a();
            this.b = (ad) bfVar.b();
        }
    }

    @Override // org.bouncycastle.b.m
    public final boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.a) {
            throw new IllegalStateException("not initialised for verifying");
        }
        ae aeVar = (ae) this.b;
        BigInteger bigIntegerC = aeVar.b().c();
        int iBitLength = bigIntegerC.bitLength();
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.bitLength() > iBitLength) {
            throw new org.bouncycastle.b.o("input too large for ECNR key.");
        }
        if (bigInteger.compareTo(org.bouncycastle.d.a.c.d) < 0 || bigInteger.compareTo(bigIntegerC) >= 0) {
            return false;
        }
        if (bigInteger2.compareTo(org.bouncycastle.d.a.c.c) < 0 || bigInteger2.compareTo(bigIntegerC) >= 0) {
            return false;
        }
        org.bouncycastle.d.a.j jVarO = org.bouncycastle.d.a.b.a(aeVar.b().b(), bigInteger2, aeVar.c(), bigInteger).o();
        if (jVarO.p()) {
            return false;
        }
        return bigInteger.subtract(jVarO.g().a()).mod(bigIntegerC).equals(bigInteger3);
    }

    @Override // org.bouncycastle.b.m
    public final BigInteger[] a(byte[] bArr) {
        org.bouncycastle.b.b bVarA;
        BigInteger bigIntegerMod;
        if (!this.a) {
            throw new IllegalStateException("not initialised for signing");
        }
        BigInteger bigIntegerA = a();
        int iBitLength = bigIntegerA.bitLength();
        BigInteger bigInteger = new BigInteger(1, bArr);
        int iBitLength2 = bigInteger.bitLength();
        ad adVar = (ad) this.b;
        if (iBitLength2 > iBitLength) {
            throw new org.bouncycastle.b.o("input too large for ECNR key.");
        }
        do {
            org.bouncycastle.b.f.l lVar = new org.bouncycastle.b.f.l();
            lVar.a(new aa(adVar.b(), this.c));
            bVarA = lVar.a();
            bigIntegerMod = ((ae) bVarA.a()).c().g().a().add(bigInteger).mod(bigIntegerA);
        } while (bigIntegerMod.equals(org.bouncycastle.d.a.c.c));
        return new BigInteger[]{bigIntegerMod, ((ad) bVarA.b()).c().subtract(bigIntegerMod.multiply(adVar.c())).mod(bigIntegerA)};
    }
}
