package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
final class h {
    private static final BigInteger a = BigInteger.valueOf(1);
    private static final BigInteger b = BigInteger.valueOf(2);

    static BigInteger a(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerSubtract = bigInteger.subtract(b);
        do {
            bigIntegerModPow = org.bouncycastle.f.b.a(b, bigIntegerSubtract, secureRandom).modPow(b, bigInteger);
        } while (bigIntegerModPow.equals(a));
        return bigIntegerModPow;
    }

    static BigInteger[] a(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger bigIntegerA = org.bouncycastle.f.b.a(i3, 2, secureRandom);
            BigInteger bigIntegerAdd = bigIntegerA.shiftLeft(1).add(a);
            if (bigIntegerAdd.isProbablePrime(i2) && (i2 <= 2 || bigIntegerA.isProbablePrime(i2 - 2))) {
                if (org.bouncycastle.d.a.aa.a(bigIntegerAdd) >= i4) {
                    return new BigInteger[]{bigIntegerAdd, bigIntegerA};
                }
            }
        }
    }
}
