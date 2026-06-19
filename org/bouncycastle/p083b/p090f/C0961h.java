package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p107d.p108a.AbstractC1364aa;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.f.h */
/* JADX INFO: loaded from: classes.dex */
final class C0961h {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4007a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4008b = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a */
    static BigInteger m2421a(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerSubtract = bigInteger.subtract(f4008b);
        do {
            bigIntegerModPow = C1544b.m4115a(f4008b, bigIntegerSubtract, secureRandom).modPow(f4008b, bigInteger);
        } while (bigIntegerModPow.equals(f4007a));
        return bigIntegerModPow;
    }

    /* JADX INFO: renamed from: a */
    static BigInteger[] m2422a(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger bigIntegerM4113a = C1544b.m4113a(i3, 2, secureRandom);
            BigInteger bigIntegerAdd = bigIntegerM4113a.shiftLeft(1).add(f4007a);
            if (bigIntegerAdd.isProbablePrime(i2) && (i2 <= 2 || bigIntegerM4113a.isProbablePrime(i2 - 2))) {
                if (AbstractC1364aa.m3257a(bigIntegerAdd) >= i4) {
                    return new BigInteger[]{bigIntegerAdd, bigIntegerM4113a};
                }
            }
        }
    }
}
