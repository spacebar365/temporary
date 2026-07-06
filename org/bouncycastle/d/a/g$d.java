package org.bouncycastle.d.a;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class g$d extends g$b {
    BigInteger a;
    BigInteger b;
    BigInteger i;

    g$d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("x value invalid in Fp field element");
        }
        this.a = bigInteger;
        this.b = bigInteger2;
        this.i = bigInteger3;
    }

    static BigInteger a(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
            return null;
        }
        return d.shiftLeft(iBitLength).subtract(bigInteger);
    }

    private BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
        return d(bigInteger.multiply(bigInteger2));
    }

    private BigInteger[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigIntegerD;
        int iBitLength = bigInteger3.bitLength();
        int lowestSetBit = bigInteger3.getLowestSetBit();
        BigInteger bigIntegerD2 = c.d;
        BigInteger bigIntegerD3 = c.e;
        BigInteger bigIntegerA = c.d;
        BigInteger bigIntegerA2 = c.d;
        BigInteger bigInteger4 = bigInteger;
        int i = iBitLength - 1;
        while (i >= lowestSetBit + 1) {
            bigIntegerA = a(bigIntegerA, bigIntegerA2);
            if (bigInteger3.testBit(i)) {
                bigIntegerA2 = a(bigIntegerA, bigInteger2);
                bigIntegerD2 = a(bigIntegerD2, bigInteger4);
                bigIntegerD3 = d(bigInteger4.multiply(bigIntegerD3).subtract(bigInteger.multiply(bigIntegerA)));
                bigIntegerD = d(bigInteger4.multiply(bigInteger4).subtract(bigIntegerA2.shiftLeft(1)));
            } else {
                bigIntegerD2 = d(bigIntegerD2.multiply(bigIntegerD3).subtract(bigIntegerA));
                bigIntegerD = d(bigInteger4.multiply(bigIntegerD3).subtract(bigInteger.multiply(bigIntegerA)));
                bigIntegerD3 = d(bigIntegerD3.multiply(bigIntegerD3).subtract(bigIntegerA.shiftLeft(1)));
                bigIntegerA2 = bigIntegerA;
            }
            i--;
            bigInteger4 = bigIntegerD;
        }
        BigInteger bigIntegerA3 = a(bigIntegerA, bigIntegerA2);
        BigInteger bigIntegerA4 = a(bigIntegerA3, bigInteger2);
        BigInteger bigIntegerD4 = d(bigIntegerD2.multiply(bigIntegerD3).subtract(bigIntegerA3));
        BigInteger bigIntegerD5 = d(bigInteger4.multiply(bigIntegerD3).subtract(bigInteger.multiply(bigIntegerA3)));
        BigInteger bigIntegerA5 = a(bigIntegerA3, bigIntegerA4);
        for (int i2 = 1; i2 <= lowestSetBit; i2++) {
            bigIntegerD4 = a(bigIntegerD4, bigIntegerD5);
            bigIntegerD5 = d(bigIntegerD5.multiply(bigIntegerD5).subtract(bigIntegerA5.shiftLeft(1)));
            bigIntegerA5 = a(bigIntegerA5, bigIntegerA5);
        }
        return new BigInteger[]{bigIntegerD4, bigIntegerD5};
    }

    private BigInteger b(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
        return bigIntegerShiftLeft.compareTo(this.a) >= 0 ? bigIntegerShiftLeft.subtract(this.a) : bigIntegerShiftLeft;
    }

    private BigInteger d(BigInteger bigInteger) {
        if (this.b == null) {
            return bigInteger.mod(this.a);
        }
        boolean z = bigInteger.signum() < 0;
        if (z) {
            bigInteger = bigInteger.abs();
        }
        int iBitLength = this.a.bitLength();
        boolean zEquals = this.b.equals(c.d);
        while (bigInteger.bitLength() > iBitLength + 1) {
            BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
            if (!zEquals) {
                bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.b);
            }
            bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
        }
        while (bigInteger.compareTo(this.a) >= 0) {
            bigInteger = bigInteger.subtract(this.a);
        }
        return (!z || bigInteger.signum() == 0) ? bigInteger : this.a.subtract(bigInteger);
    }

    private g e(g gVar) {
        if (gVar.e().equals(this)) {
            return gVar;
        }
        return null;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return this.i;
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar, g gVar2) {
        BigInteger bigInteger = this.i;
        BigInteger bigIntegerA = gVar.a();
        BigInteger bigIntegerA2 = gVar2.a();
        return new g$d(this.a, this.b, d(bigInteger.multiply(bigInteger).add(bigIntegerA.multiply(bigIntegerA2))));
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar, g gVar2, g gVar3) {
        BigInteger bigInteger = this.i;
        BigInteger bigIntegerA = gVar.a();
        BigInteger bigIntegerA2 = gVar2.a();
        BigInteger bigIntegerA3 = gVar3.a();
        return new g$d(this.a, this.b, d(bigInteger.multiply(bigIntegerA).subtract(bigIntegerA2.multiply(bigIntegerA3))));
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return this.a.bitLength();
    }

    @Override // org.bouncycastle.d.a.g
    public final g b(g gVar, g gVar2, g gVar3) {
        BigInteger bigInteger = this.i;
        BigInteger bigIntegerA = gVar.a();
        BigInteger bigIntegerA2 = gVar2.a();
        BigInteger bigIntegerA3 = gVar3.a();
        return new g$d(this.a, this.b, d(bigInteger.multiply(bigIntegerA).add(bigIntegerA2.multiply(bigIntegerA3))));
    }

    @Override // org.bouncycastle.d.a.g
    public final g c() {
        BigInteger bigIntegerAdd = this.i.add(c.d);
        if (bigIntegerAdd.compareTo(this.a) == 0) {
            bigIntegerAdd = c.c;
        }
        return new g$d(this.a, this.b, bigIntegerAdd);
    }

    @Override // org.bouncycastle.d.a.g
    public final g c(g gVar) {
        return new g$d(this.a, this.b, a(this.i, gVar.a()));
    }

    @Override // org.bouncycastle.d.a.g
    public final g d() {
        return this.i.signum() == 0 ? this : new g$d(this.a, this.b, this.a.subtract(this.i));
    }

    @Override // org.bouncycastle.d.a.g
    public final g d(g gVar) {
        return new g$d(this.a, this.b, a(this.i, c(gVar.a())));
    }

    @Override // org.bouncycastle.d.a.g
    public final g e() {
        return new g$d(this.a, this.b, a(this.i, this.i));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g$d)) {
            return false;
        }
        g$d g_d = (g$d) obj;
        return this.a.equals(g_d.a) && this.i.equals(g_d.i);
    }

    @Override // org.bouncycastle.d.a.g
    public final g f() {
        return new g$d(this.a, this.b, c(this.i));
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.i.hashCode();
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar) {
        BigInteger bigInteger = this.a;
        BigInteger bigInteger2 = this.b;
        BigInteger bigIntegerAdd = this.i.add(gVar.a());
        if (bigIntegerAdd.compareTo(this.a) >= 0) {
            bigIntegerAdd = bigIntegerAdd.subtract(this.a);
        }
        return new g$d(bigInteger, bigInteger2, bigIntegerAdd);
    }

    @Override // org.bouncycastle.d.a.g
    public final g b(g gVar) {
        BigInteger bigInteger = this.a;
        BigInteger bigInteger2 = this.b;
        BigInteger bigIntegerSubtract = this.i.subtract(gVar.a());
        if (bigIntegerSubtract.signum() < 0) {
            bigIntegerSubtract = bigIntegerSubtract.add(this.a);
        }
        return new g$d(bigInteger, bigInteger2, bigIntegerSubtract);
    }

    @Override // org.bouncycastle.d.a.g
    public final g g() {
        if (j() || i()) {
            return this;
        }
        if (!this.a.testBit(0)) {
            throw new RuntimeException("not done yet");
        }
        if (this.a.testBit(1)) {
            return e(new g$d(this.a, this.b, this.i.modPow(this.a.shiftRight(2).add(c.d), this.a)));
        }
        if (this.a.testBit(2)) {
            BigInteger bigIntegerModPow = this.i.modPow(this.a.shiftRight(3), this.a);
            BigInteger bigIntegerA = a(bigIntegerModPow, this.i);
            if (a(bigIntegerA, bigIntegerModPow).equals(c.d)) {
                return e(new g$d(this.a, this.b, bigIntegerA));
            }
            return e(new g$d(this.a, this.b, a(bigIntegerA, c.e.modPow(this.a.shiftRight(2), this.a))));
        }
        BigInteger bigIntegerShiftRight = this.a.shiftRight(1);
        if (!this.i.modPow(bigIntegerShiftRight, this.a).equals(c.d)) {
            return null;
        }
        BigInteger bigInteger = this.i;
        BigInteger bigIntegerB = b(b(bigInteger));
        BigInteger bigIntegerAdd = bigIntegerShiftRight.add(c.d);
        BigInteger bigIntegerSubtract = this.a.subtract(c.d);
        Random random = new Random();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(this.a.bitLength(), random);
            if (bigInteger2.compareTo(this.a) < 0 && d(bigInteger2.multiply(bigInteger2).subtract(bigIntegerB)).modPow(bigIntegerShiftRight, this.a).equals(bigIntegerSubtract)) {
                BigInteger[] bigIntegerArrA = a(bigInteger2, bigInteger, bigIntegerAdd);
                BigInteger bigInteger3 = bigIntegerArrA[0];
                BigInteger bigIntegerSubtract2 = bigIntegerArrA[1];
                if (a(bigIntegerSubtract2, bigIntegerSubtract2).equals(bigIntegerB)) {
                    BigInteger bigInteger4 = this.a;
                    BigInteger bigInteger5 = this.b;
                    if (bigIntegerSubtract2.testBit(0)) {
                        bigIntegerSubtract2 = this.a.subtract(bigIntegerSubtract2);
                    }
                    return new g$d(bigInteger4, bigInteger5, bigIntegerSubtract2.shiftRight(1));
                }
                if (!bigInteger3.equals(c.d) && !bigInteger3.equals(bigIntegerSubtract)) {
                    return null;
                }
            }
        }
    }

    private BigInteger c(BigInteger bigInteger) {
        int iBitLength = this.a.bitLength();
        int i = (iBitLength + 31) >> 5;
        int[] iArr = new int[i];
        org.bouncycastle.d.c.b.a(org.bouncycastle.d.c.c.a(iBitLength, this.a), org.bouncycastle.d.c.c.a(iBitLength, bigInteger), iArr);
        return org.bouncycastle.d.c.c.d(i, iArr);
    }
}
