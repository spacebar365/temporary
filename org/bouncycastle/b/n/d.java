package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.ab;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements org.bouncycastle.b.n {
    private static final BigInteger a = BigInteger.valueOf(1);
    private ab b;
    private SecureRandom c;

    private static BigInteger a(BigInteger bigInteger, int i) {
        return bigInteger.bitLength() > i ? bigInteger.mod(a.shiftLeft(i)) : bigInteger;
    }

    private static BigInteger a(BigInteger bigInteger, org.bouncycastle.d.a.g gVar) {
        return a(gVar.a(), bigInteger.bitLength() - 1);
    }

    private static org.bouncycastle.d.a.g a(org.bouncycastle.d.a.d dVar, byte[] bArr) {
        return dVar.a(a(new BigInteger(1, org.bouncycastle.f.a.c(bArr)), dVar.a()));
    }

    @Override // org.bouncycastle.b.n
    public final BigInteger a() {
        return this.b.b().c();
    }

    @Override // org.bouncycastle.b.m
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        if (!z) {
            this.b = (ae) iVar;
            return;
        }
        if (iVar instanceof bf) {
            bf bfVar = (bf) iVar;
            this.c = bfVar.a();
            iVarB = bfVar.b();
        } else {
            this.c = org.bouncycastle.b.l.a();
            iVarB = iVar;
        }
        this.b = (ad) iVarB;
    }

    @Override // org.bouncycastle.b.m
    public final boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        y yVarB = this.b.b();
        BigInteger bigIntegerC = yVarB.c();
        if (bigInteger.compareTo(bigIntegerC) >= 0 || bigInteger2.compareTo(bigIntegerC) >= 0) {
            return false;
        }
        org.bouncycastle.d.a.d dVarA = yVarB.a();
        org.bouncycastle.d.a.g gVarA = a(dVarA, bArr);
        org.bouncycastle.d.a.g gVarA2 = gVarA.j() ? dVarA.a(a) : gVarA;
        org.bouncycastle.d.a.j jVarO = org.bouncycastle.d.a.b.a(yVarB.b(), bigInteger2, ((ae) this.b).c(), bigInteger).o();
        return !jVarO.p() && a(bigIntegerC, gVarA2.c(jVarO.g())).compareTo(bigInteger) == 0;
    }

    @Override // org.bouncycastle.b.m
    public final BigInteger[] a(byte[] bArr) {
        y yVarB = this.b.b();
        org.bouncycastle.d.a.d dVarA = yVarB.a();
        org.bouncycastle.d.a.g gVarA = a(dVarA, bArr);
        org.bouncycastle.d.a.g gVarA2 = gVarA.j() ? dVarA.a(a) : gVarA;
        BigInteger bigIntegerC = yVarB.c();
        BigInteger bigIntegerC2 = ((ad) this.b).c();
        org.bouncycastle.d.a.m mVar = new org.bouncycastle.d.a.m();
        while (true) {
            BigInteger bigIntegerA = org.bouncycastle.f.b.a(bigIntegerC.bitLength() - 1, this.c);
            org.bouncycastle.d.a.g gVarG = mVar.a(yVarB.b(), bigIntegerA).o().g();
            if (!gVarG.j()) {
                BigInteger bigIntegerA2 = a(bigIntegerC, gVarA2.c(gVarG));
                if (bigIntegerA2.signum() != 0) {
                    BigInteger bigIntegerMod = bigIntegerA2.multiply(bigIntegerC2).add(bigIntegerA).mod(bigIntegerC);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigIntegerA2, bigIntegerMod};
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
