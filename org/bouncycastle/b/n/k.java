package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.ar;
import org.bouncycastle.b.k.as;
import org.bouncycastle.b.k.at;
import org.bouncycastle.b.k.au;
import org.bouncycastle.b.k.bf;

/* JADX INFO: loaded from: classes.dex */
public final class k implements org.bouncycastle.b.n {
    ar a;
    SecureRandom b;

    @Override // org.bouncycastle.b.n
    public final BigInteger a() {
        return this.a.b().b();
    }

    @Override // org.bouncycastle.b.m
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!z) {
            this.a = (au) iVar;
            return;
        }
        if (!(iVar instanceof bf)) {
            this.b = org.bouncycastle.b.l.a();
            this.a = (at) iVar;
        } else {
            bf bfVar = (bf) iVar;
            this.b = bfVar.a();
            this.a = (at) bfVar.b();
        }
    }

    @Override // org.bouncycastle.b.m
    public final boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        as asVarB = this.a.b();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || asVarB.b().compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || asVarB.b().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModPow = bigInteger3.modPow(asVarB.b().subtract(new BigInteger("2")), asVarB.b());
        return asVarB.c().modPow(bigInteger2.multiply(bigIntegerModPow).mod(asVarB.b()), asVarB.a()).multiply(((au) this.a).c().modPow(asVarB.b().subtract(bigInteger).multiply(bigIntegerModPow).mod(asVarB.b()), asVarB.a())).mod(asVarB.a()).mod(asVarB.b()).equals(bigInteger);
    }

    @Override // org.bouncycastle.b.m
    public final BigInteger[] a(byte[] bArr) {
        BigInteger bigIntegerA;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        as asVarB = this.a.b();
        do {
            bigIntegerA = org.bouncycastle.f.b.a(asVarB.b().bitLength(), this.b);
        } while (bigIntegerA.compareTo(asVarB.b()) >= 0);
        BigInteger bigIntegerMod = asVarB.c().modPow(bigIntegerA, asVarB.a()).mod(asVarB.b());
        return new BigInteger[]{bigIntegerMod, bigIntegerA.multiply(bigInteger).add(((at) this.a).c().multiply(bigIntegerMod)).mod(asVarB.b())};
    }
}
