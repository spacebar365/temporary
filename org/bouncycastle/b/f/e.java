package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
final class e {
    static final e a = new e();
    private static final BigInteger b = BigInteger.valueOf(1);
    private static final BigInteger c = BigInteger.valueOf(2);

    private e() {
    }

    static BigInteger a(org.bouncycastle.b.k.i iVar, BigInteger bigInteger) {
        return iVar.b().modPow(bigInteger, iVar.a());
    }

    static BigInteger a(org.bouncycastle.b.k.i iVar, SecureRandom secureRandom) {
        BigInteger bigIntegerA;
        BigInteger bit;
        int iF = iVar.f();
        if (iF != 0) {
            int i = iF >>> 2;
            do {
                bit = org.bouncycastle.f.b.a(iF, secureRandom).setBit(iF - 1);
            } while (org.bouncycastle.d.a.aa.a(bit) < i);
            return bit;
        }
        BigInteger bigIntegerShiftLeft = c;
        int iE = iVar.e();
        if (iE != 0) {
            bigIntegerShiftLeft = b.shiftLeft(iE - 1);
        }
        BigInteger bigIntegerC = iVar.c();
        if (bigIntegerC == null) {
            bigIntegerC = iVar.a();
        }
        BigInteger bigIntegerSubtract = bigIntegerC.subtract(c);
        int iBitLength = bigIntegerSubtract.bitLength() >>> 2;
        do {
            bigIntegerA = org.bouncycastle.f.b.a(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
        } while (org.bouncycastle.d.a.aa.a(bigIntegerA) < iBitLength);
        return bigIntegerA;
    }
}
