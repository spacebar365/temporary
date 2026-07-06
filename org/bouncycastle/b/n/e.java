package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.ab;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class e implements org.bouncycastle.b.n, org.bouncycastle.d.a.c {
    private final b a;
    private ab b;
    private SecureRandom i;

    public e() {
        this.a = new q();
    }

    public e(b bVar) {
        this.a = bVar;
    }

    private static BigInteger a(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    @Override // org.bouncycastle.b.n
    public final BigInteger a() {
        return this.b.b().c();
    }

    @Override // org.bouncycastle.b.m
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        SecureRandom secureRandomA;
        if (!z) {
            this.b = (ae) iVar;
            secureRandomA = null;
        } else if (iVar instanceof bf) {
            bf bfVar = (bf) iVar;
            this.b = (ad) bfVar.b();
            secureRandomA = bfVar.a();
        } else {
            this.b = (ad) iVar;
            secureRandomA = null;
        }
        if (!(z && !this.a.a())) {
            secureRandomA = null;
        } else if (secureRandomA == null) {
            secureRandomA = org.bouncycastle.b.l.a();
        }
        this.i = secureRandomA;
    }

    @Override // org.bouncycastle.b.m
    public final BigInteger[] a(byte[] bArr) {
        y yVarB = this.b.b();
        BigInteger bigIntegerC = yVarB.c();
        BigInteger bigIntegerA = a(bigIntegerC, bArr);
        BigInteger bigIntegerC2 = ((ad) this.b).c();
        if (this.a.a()) {
            this.a.a(bigIntegerC, bigIntegerC2, bArr);
        } else {
            this.a.a(bigIntegerC, this.i);
        }
        org.bouncycastle.d.a.m mVar = new org.bouncycastle.d.a.m();
        while (true) {
            BigInteger bigIntegerB = this.a.b();
            BigInteger bigIntegerMod = mVar.a(yVarB.b(), bigIntegerB).o().g().a().mod(bigIntegerC);
            if (!bigIntegerMod.equals(c)) {
                BigInteger bigIntegerMod2 = bigIntegerB.modInverse(bigIntegerC).multiply(bigIntegerA.add(bigIntegerC2.multiply(bigIntegerMod))).mod(bigIntegerC);
                if (!bigIntegerMod2.equals(c)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    @Override // org.bouncycastle.b.m
    public final boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerJ;
        org.bouncycastle.d.a.g gVarE;
        y yVarB = this.b.b();
        BigInteger bigIntegerC = yVarB.c();
        BigInteger bigIntegerA = a(bigIntegerC, bArr);
        if (bigInteger.compareTo(d) < 0 || bigInteger.compareTo(bigIntegerC) >= 0) {
            return false;
        }
        if (bigInteger2.compareTo(d) < 0 || bigInteger2.compareTo(bigIntegerC) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(bigIntegerC);
        org.bouncycastle.d.a.j jVarA = org.bouncycastle.d.a.b.a(yVarB.b(), bigIntegerA.multiply(bigIntegerModInverse).mod(bigIntegerC), ((ae) this.b).c(), bigInteger.multiply(bigIntegerModInverse).mod(bigIntegerC));
        if (jVarA.p()) {
            return false;
        }
        org.bouncycastle.d.a.d dVarD = jVarA.d();
        if (dVarD != null && (bigIntegerJ = dVarD.j()) != null && bigIntegerJ.compareTo(h) <= 0) {
            switch (dVarD.k()) {
                case 1:
                case 6:
                case 7:
                    gVarE = jVarA.a(0);
                    break;
                case 2:
                case 3:
                case 4:
                    gVarE = jVarA.a(0).e();
                    break;
                case 5:
                default:
                    gVarE = null;
                    break;
            }
            if (gVarE != null && !gVarE.j()) {
                org.bouncycastle.d.a.g gVarI = jVarA.i();
                while (dVarD.b(bigInteger)) {
                    if (dVarD.a(bigInteger).c(gVarE).equals(gVarI)) {
                        return true;
                    }
                    bigInteger = bigInteger.add(bigIntegerC);
                }
                return false;
            }
        }
        return jVarA.o().g().a().mod(bigIntegerC).equals(bigInteger);
    }
}
