package org.bouncycastle.p107d.p116b;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.b.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1408c {

    /* JADX INFO: renamed from: a */
    static final InterfaceC1407b f5116a = new C1413h(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: b */
    static final InterfaceC1407b f5117b = new C1413h(BigInteger.valueOf(3));

    /* JADX INFO: renamed from: a */
    public static InterfaceC1407b m3554a(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            switch (bigInteger.intValue()) {
                case 2:
                    return f5116a;
                case 3:
                    return f5117b;
            }
        }
        return new C1413h(bigInteger);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1412g m3555a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new C1410e(f5116a, new C1409d(iArr));
    }
}
