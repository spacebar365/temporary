package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.ab;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements org.bouncycastle.b.n {
    ab a;
    SecureRandom b;

    @Override // org.bouncycastle.b.n
    public final BigInteger a() {
        return this.a.b().c();
    }

    @Override // org.bouncycastle.b.m
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!z) {
            this.a = (ae) iVar;
            return;
        }
        if (!(iVar instanceof bf)) {
            this.b = org.bouncycastle.b.l.a();
            this.a = (ad) iVar;
        } else {
            bf bfVar = (bf) iVar;
            this.b = bfVar.a();
            this.a = (ad) bfVar.b();
        }
    }

    @Override // org.bouncycastle.b.m
    public final boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        BigInteger bigIntegerC = this.a.b().c();
        if (bigInteger.compareTo(org.bouncycastle.d.a.c.d) < 0 || bigInteger.compareTo(bigIntegerC) >= 0 || bigInteger2.compareTo(org.bouncycastle.d.a.c.d) < 0 || bigInteger2.compareTo(bigIntegerC) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(bigIntegerC);
        org.bouncycastle.d.a.j jVarO = org.bouncycastle.d.a.b.a(this.a.b().b(), bigInteger2.multiply(bigIntegerModInverse).mod(bigIntegerC), ((ae) this.a).c(), bigIntegerC.subtract(bigInteger).multiply(bigIntegerModInverse).mod(bigIntegerC)).o();
        if (jVarO.p()) {
            return false;
        }
        return jVarO.g().a().mod(bigIntegerC).equals(bigInteger);
    }

    @Override // org.bouncycastle.b.m
    public final BigInteger[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        y yVarB = this.a.b();
        BigInteger bigIntegerC = yVarB.c();
        BigInteger bigIntegerC2 = ((ad) this.a).c();
        org.bouncycastle.d.a.m mVar = new org.bouncycastle.d.a.m();
        while (true) {
            BigInteger bigIntegerA = org.bouncycastle.f.b.a(bigIntegerC.bitLength(), this.b);
            if (!bigIntegerA.equals(org.bouncycastle.d.a.c.c)) {
                BigInteger bigIntegerMod = mVar.a(yVarB.b(), bigIntegerA).o().g().a().mod(bigIntegerC);
                if (bigIntegerMod.equals(org.bouncycastle.d.a.c.c)) {
                    continue;
                } else {
                    BigInteger bigIntegerMod2 = bigIntegerA.multiply(bigInteger).add(bigIntegerC2.multiply(bigIntegerMod)).mod(bigIntegerC);
                    if (!bigIntegerMod2.equals(org.bouncycastle.d.a.c.c)) {
                        return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                    }
                }
            }
        }
    }
}
