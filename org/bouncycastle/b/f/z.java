package org.bouncycastle.b.f;

import java.math.BigInteger;
import org.bouncycastle.b.k.bl;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;

/* JADX INFO: loaded from: classes.dex */
public final class z implements org.bouncycastle.b.c {
    private static final BigInteger a = BigInteger.valueOf(1);
    private bl b;

    private static int a(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 > 128) {
                return (((i2 - 128) + 1) / 2) + 4;
            }
            return 4;
        }
        if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return (((i2 - 112) + 1) / 2) + 5;
        }
        if (i < 512) {
            if (i2 <= 80) {
                return 40;
            }
            return (((i2 - 80) + 1) / 2) + 40;
        }
        if (i2 <= 80) {
            return 5;
        }
        if (i2 <= 100) {
            return 7;
        }
        return (((i2 - 100) + 1) / 2) + 7;
    }

    private BigInteger a(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger bigIntegerA = org.bouncycastle.f.b.a(i, 1, this.b.a());
            if (!bigIntegerA.mod(bigInteger).equals(a) && bigIntegerA.multiply(bigIntegerA).compareTo(bigInteger2) >= 0 && a(bigIntegerA) && bigInteger.gcd(bigIntegerA.subtract(a)).equals(a)) {
                return bigIntegerA;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    private boolean a(BigInteger bigInteger) {
        return !org.bouncycastle.d.a.a(bigInteger) && org.bouncycastle.d.a.a(bigInteger, this.b.a(), a(bigInteger.bitLength(), this.b.d()));
    }

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        BigInteger bigIntegerA;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int iB = this.b.b();
        int i = (iB + 1) / 2;
        int i2 = iB - i;
        int i3 = (iB / 2) - 100;
        int i4 = i3 < iB / 3 ? iB / 3 : i3;
        int i5 = iB >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(iB / 2);
        BigInteger bigIntegerShiftLeft = a.shiftLeft(iB - 1);
        BigInteger bigIntegerShiftLeft2 = a.shiftLeft(i4);
        boolean z = false;
        org.bouncycastle.b.b bVar = null;
        while (!z) {
            BigInteger bigIntegerC = this.b.c();
            BigInteger bigIntegerA2 = a(i, bigIntegerC, bigIntegerShiftLeft);
            while (true) {
                bigIntegerA = a(i2, bigIntegerC, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerA.subtract(bigIntegerA2).abs();
                if (bigIntegerAbs.bitLength() >= i4 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerA2.multiply(bigIntegerA);
                    if (bigIntegerMultiply.bitLength() == iB) {
                        if (org.bouncycastle.d.a.aa.a(bigIntegerMultiply) >= i5) {
                            break;
                        }
                        bigIntegerA2 = a(i, bigIntegerC, bigIntegerShiftLeft);
                    } else {
                        bigIntegerA2 = bigIntegerA2.max(bigIntegerA);
                    }
                }
            }
            if (bigIntegerA2.compareTo(bigIntegerA) < 0) {
                bigInteger = bigIntegerA2;
                bigInteger2 = bigIntegerA;
            } else {
                bigInteger = bigIntegerA;
                bigInteger2 = bigIntegerA2;
            }
            BigInteger bigIntegerSubtract = bigInteger2.subtract(a);
            BigInteger bigIntegerSubtract2 = bigInteger.subtract(a);
            BigInteger bigIntegerModInverse = bigIntegerC.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                z = true;
                bVar = new org.bouncycastle.b.b(new bm(false, bigIntegerMultiply, bigIntegerC), new bn(bigIntegerMultiply, bigIntegerC, bigIntegerModInverse, bigInteger2, bigInteger, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigInteger.modInverse(bigInteger2)));
            }
        }
        return bVar;
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.b = (bl) xVar;
    }
}
