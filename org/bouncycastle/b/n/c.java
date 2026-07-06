package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.bf;

/* JADX INFO: loaded from: classes.dex */
public final class c implements org.bouncycastle.b.n {
    private final b a;
    private org.bouncycastle.b.k.p b;
    private SecureRandom c;

    public c() {
        this.a = new q();
    }

    public c(b bVar) {
        this.a = bVar;
    }

    private static BigInteger a(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        byte[] bArr2 = new byte[bigInteger.bitLength() / 8];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return new BigInteger(1, bArr2);
    }

    @Override // org.bouncycastle.b.n
    public final BigInteger a() {
        return this.b.b().b();
    }

    @Override // org.bouncycastle.b.m
    public final boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        org.bouncycastle.b.k.r rVarB = this.b.b();
        BigInteger bigIntegerB = rVarB.b();
        BigInteger bigIntegerA = a(bigIntegerB, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || bigIntegerB.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || bigIntegerB.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(bigIntegerB);
        BigInteger bigIntegerMod = bigIntegerA.multiply(bigIntegerModInverse).mod(bigIntegerB);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModInverse).mod(bigIntegerB);
        BigInteger bigIntegerA2 = rVarB.a();
        return rVarB.c().modPow(bigIntegerMod, bigIntegerA2).multiply(((org.bouncycastle.b.k.t) this.b).c().modPow(bigIntegerMod2, bigIntegerA2)).mod(bigIntegerA2).mod(bigIntegerB).equals(bigInteger);
    }

    @Override // org.bouncycastle.b.m
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        SecureRandom secureRandomA;
        if (!z) {
            this.b = (org.bouncycastle.b.k.t) iVar;
            secureRandomA = null;
        } else if (iVar instanceof bf) {
            bf bfVar = (bf) iVar;
            this.b = (org.bouncycastle.b.k.s) bfVar.b();
            secureRandomA = bfVar.a();
        } else {
            this.b = (org.bouncycastle.b.k.s) iVar;
            secureRandomA = null;
        }
        if (!(z && !this.a.a())) {
            secureRandomA = null;
        } else if (secureRandomA == null) {
            secureRandomA = org.bouncycastle.b.l.a();
        }
        this.c = secureRandomA;
    }

    @Override // org.bouncycastle.b.m
    public final BigInteger[] a(byte[] bArr) {
        org.bouncycastle.b.k.r rVarB = this.b.b();
        BigInteger bigIntegerB = rVarB.b();
        BigInteger bigIntegerA = a(bigIntegerB, bArr);
        BigInteger bigIntegerC = ((org.bouncycastle.b.k.s) this.b).c();
        if (this.a.a()) {
            this.a.a(bigIntegerB, bigIntegerC, bArr);
        } else {
            this.a.a(bigIntegerB, this.c);
        }
        BigInteger bigIntegerB2 = this.a.b();
        BigInteger bigIntegerC2 = rVarB.c();
        SecureRandom secureRandomA = this.c;
        if (secureRandomA == null) {
            secureRandomA = org.bouncycastle.b.l.a();
        }
        BigInteger bigIntegerMod = bigIntegerC2.modPow(bigIntegerB2.add(org.bouncycastle.f.b.a(7, secureRandomA).add(BigInteger.valueOf(128L)).multiply(bigIntegerB)), rVarB.a()).mod(bigIntegerB);
        return new BigInteger[]{bigIntegerMod, bigIntegerB2.modInverse(bigIntegerB).multiply(bigIntegerA.add(bigIntegerC.multiply(bigIntegerMod))).mod(bigIntegerB)};
    }
}
