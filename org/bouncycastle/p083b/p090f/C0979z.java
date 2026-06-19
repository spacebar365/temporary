package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1087bl;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p107d.AbstractC1222a;
import org.bouncycastle.p107d.p108a.AbstractC1364aa;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.f.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0979z implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4050a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b */
    private C1087bl f4051b;

    /* JADX INFO: renamed from: a */
    private static int m2442a(int i, int i2) {
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

    /* JADX INFO: renamed from: a */
    private BigInteger m2443a(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger bigIntegerM4113a = C1544b.m4113a(i, 1, this.f4051b.m2824a());
            if (!bigIntegerM4113a.mod(bigInteger).equals(f4050a) && bigIntegerM4113a.multiply(bigIntegerM4113a).compareTo(bigInteger2) >= 0 && m2444a(bigIntegerM4113a) && bigInteger.gcd(bigIntegerM4113a.subtract(f4050a)).equals(f4050a)) {
                return bigIntegerM4113a;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    /* JADX INFO: renamed from: a */
    private boolean m2444a(BigInteger bigInteger) {
        return !AbstractC1222a.m2900a(bigInteger) && AbstractC1222a.m2902a(bigInteger, this.f4051b.m2824a(), m2442a(bigInteger.bitLength(), this.f4051b.m2624d()));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        BigInteger bigIntegerM2443a;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int iB = this.f4051b.m2825b();
        int i = (iB + 1) / 2;
        int i2 = iB - i;
        int i3 = (iB / 2) - 100;
        int i4 = i3 < iB / 3 ? iB / 3 : i3;
        int i5 = iB >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(iB / 2);
        BigInteger bigIntegerShiftLeft = f4050a.shiftLeft(iB - 1);
        BigInteger bigIntegerShiftLeft2 = f4050a.shiftLeft(i4);
        boolean z = false;
        C0818b c0818b = null;
        while (!z) {
            BigInteger bigIntegerM2623c = this.f4051b.m2623c();
            BigInteger bigIntegerM2443a2 = m2443a(i, bigIntegerM2623c, bigIntegerShiftLeft);
            while (true) {
                bigIntegerM2443a = m2443a(i2, bigIntegerM2623c, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerM2443a.subtract(bigIntegerM2443a2).abs();
                if (bigIntegerAbs.bitLength() >= i4 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerM2443a2.multiply(bigIntegerM2443a);
                    if (bigIntegerMultiply.bitLength() == iB) {
                        if (AbstractC1364aa.m3257a(bigIntegerMultiply) >= i5) {
                            break;
                        }
                        bigIntegerM2443a2 = m2443a(i, bigIntegerM2623c, bigIntegerShiftLeft);
                    } else {
                        bigIntegerM2443a2 = bigIntegerM2443a2.max(bigIntegerM2443a);
                    }
                }
            }
            if (bigIntegerM2443a2.compareTo(bigIntegerM2443a) < 0) {
                bigInteger = bigIntegerM2443a2;
                bigInteger2 = bigIntegerM2443a;
            } else {
                bigInteger = bigIntegerM2443a;
                bigInteger2 = bigIntegerM2443a2;
            }
            BigInteger bigIntegerSubtract = bigInteger2.subtract(f4050a);
            BigInteger bigIntegerSubtract2 = bigInteger.subtract(f4050a);
            BigInteger bigIntegerModInverse = bigIntegerM2623c.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                z = true;
                c0818b = new C0818b(new C1088bm(false, bigIntegerMultiply, bigIntegerM2623c), new C1089bn(bigIntegerMultiply, bigIntegerM2623c, bigIntegerModInverse, bigInteger2, bigInteger, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigInteger.modInverse(bigInteger2)));
            }
        }
        return c0818b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f4051b = (C1087bl) c1181x;
    }
}
