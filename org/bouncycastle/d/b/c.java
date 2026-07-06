package org.bouncycastle.d.b;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    static final b a = new h(BigInteger.valueOf(2));
    static final b b = new h(BigInteger.valueOf(3));

    public static b a(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            switch (bigInteger.intValue()) {
                case 2:
                    return a;
                case 3:
                    return b;
            }
        }
        return new h(bigInteger);
    }

    public static g a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new e(a, new d(iArr));
    }
}
