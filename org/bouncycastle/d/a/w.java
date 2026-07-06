package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class w {
    public static final ag[] a;
    public static final byte[][] b;
    public static final ag[] c;
    public static final byte[][] d;
    private static final BigInteger e = c.d.negate();
    private static final BigInteger f = c.e.negate();
    private static final BigInteger g = c.f.negate();

    static {
        BigInteger bigInteger = e;
        a = new ag[]{null, new ag(c.d, c.c), null, new ag(g, e), null, new ag(bigInteger, bigInteger), null, new ag(c.d, e), null};
        b = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        BigInteger bigInteger2 = c.d;
        c = new ag[]{null, new ag(c.d, c.c), null, new ag(g, c.d), null, new ag(e, c.d), null, new ag(bigInteger2, bigInteger2), null};
        d = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static byte a(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static BigInteger a(byte b2) {
        return b2 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
    }

    private static v a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i) {
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - r1) - 2) + b2));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight((((i + 5) / 2) + 10) - 10);
        if (bigIntegerAdd.testBit((r1 - 10) - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(c.d);
        }
        return new v(bigIntegerShiftRight, 10);
    }

    private static BigInteger[] a(byte b2, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerValueOf;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = c.e;
            bigIntegerValueOf = BigInteger.valueOf(b2);
        } else {
            bigInteger = c.c;
            bigIntegerValueOf = c.d;
        }
        int i2 = 1;
        BigInteger bigInteger2 = bigIntegerValueOf;
        BigInteger bigInteger3 = bigInteger;
        while (i2 < i) {
            BigInteger bigIntegerSubtract = (b2 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger3.shiftLeft(1));
            i2++;
            bigInteger3 = bigInteger2;
            bigInteger2 = bigIntegerSubtract;
        }
        return new BigInteger[]{bigInteger3, bigInteger2};
    }

    public static BigInteger[] a(d$a d_a) {
        int i;
        if (!d_a.o()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int iA = d_a.a();
        int iIntValue = d_a.g().a().intValue();
        byte bA = a(iIntValue);
        BigInteger bigIntegerJ = d_a.j();
        if (bigIntegerJ != null) {
            if (bigIntegerJ.equals(c.e)) {
                i = 1;
            } else if (bigIntegerJ.equals(c.g)) {
                i = 2;
            }
            BigInteger[] bigIntegerArrA = a(bA, (iA + 3) - iIntValue, false);
            if (bA == 1) {
                bigIntegerArrA[0] = bigIntegerArrA[0].negate();
                bigIntegerArrA[1] = bigIntegerArrA[1].negate();
            }
            return new BigInteger[]{c.d.add(bigIntegerArrA[1]).shiftRight(i), c.d.add(bigIntegerArrA[0]).shiftRight(i).negate()};
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static ag a(BigInteger bigInteger, int i, byte b2, BigInteger[] bigIntegerArr, byte b3) {
        v vVarA;
        v vVarB;
        BigInteger bigIntegerAdd = b3 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = a(b3, i, true)[1];
        v vVarA2 = a(bigInteger, bigIntegerArr[0], bigInteger2, b2, i);
        v vVarA3 = a(bigInteger, bigIntegerArr[1], bigInteger2, b2, i);
        if (vVarA3.b() != vVarA2.b()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (b3 != 1 && b3 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerA = vVarA2.a();
        BigInteger bigIntegerA2 = vVarA3.a();
        v vVarA4 = vVarA2.a(bigIntegerA);
        v vVarA5 = vVarA3.a(bigIntegerA2);
        v vVarA6 = vVarA4.a(vVarA4);
        v vVarA7 = b3 == 1 ? vVarA6.a(vVarA5) : vVarA6.b(vVarA5);
        v vVarA8 = vVarA5.a(vVarA5).a(vVarA5);
        v vVarA9 = vVarA8.a(vVarA5);
        if (b3 == 1) {
            vVarA = vVarA4.b(vVarA8);
            vVarB = vVarA4.a(vVarA9);
        } else {
            vVarA = vVarA4.a(vVarA8);
            vVarB = vVarA4.b(vVarA9);
        }
        int i2 = 0;
        byte b4 = 0;
        if (vVarA7.b(c.d) >= 0) {
            if (vVarA.b(e) < 0) {
                b4 = b3;
            } else {
                i2 = 1;
            }
        } else if (vVarB.b(c.e) >= 0) {
            b4 = b3;
        }
        if (vVarA7.b(e) < 0) {
            if (vVarA.b(c.d) >= 0) {
                b4 = (byte) (-b3);
            } else {
                i2 = -1;
            }
        } else if (vVarB.b(f) < 0) {
            b4 = (byte) (-b3);
        }
        ag agVar = new ag(bigIntegerA.add(BigInteger.valueOf(i2)), bigIntegerA2.add(BigInteger.valueOf(b4)));
        return new ag(bigInteger.subtract(bigIntegerAdd.multiply(agVar.a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(agVar.b)), bigIntegerArr[1].multiply(agVar.a).subtract(bigIntegerArr[0].multiply(agVar.b)));
    }

    public static byte[] a(byte b2, ag agVar, BigInteger bigInteger, BigInteger bigInteger2, ag[] agVarArr) {
        BigInteger bigIntegerAdd;
        BigInteger bigInteger3;
        boolean z;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerMultiply = agVar.a.multiply(agVar.a);
        BigInteger bigIntegerMultiply2 = agVar.a.multiply(agVar.b);
        BigInteger bigIntegerShiftLeft = agVar.b.multiply(agVar.b).shiftLeft(1);
        if (b2 == 1) {
            bigIntegerAdd = bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        } else {
            if (b2 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerAdd = bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        int iBitLength = bigIntegerAdd.bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + 4 : 38];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd2 = agVar.a;
        BigInteger bigIntegerNegate = agVar.b;
        int i = 0;
        while (true) {
            if (bigIntegerAdd2.equals(c.c) && bigIntegerNegate.equals(c.c)) {
                return bArr;
            }
            if (bigIntegerAdd2.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd2.add(bigIntegerNegate.multiply(bigInteger2)).mod(bigInteger);
                byte bIntValue = bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0 ? (byte) bigIntegerMod.subtract(bigInteger).intValue() : (byte) bigIntegerMod.intValue();
                bArr[i] = bIntValue;
                if (bIntValue < 0) {
                    bIntValue = (byte) (-bIntValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    BigInteger bigIntegerSubtract = bigIntegerAdd2.subtract(agVarArr[bIntValue].a);
                    bigIntegerNegate = bigIntegerNegate.subtract(agVarArr[bIntValue].b);
                    bigInteger3 = bigIntegerSubtract;
                } else {
                    BigInteger bigIntegerAdd3 = bigIntegerAdd2.add(agVarArr[bIntValue].a);
                    bigIntegerNegate = bigIntegerNegate.add(agVarArr[bIntValue].b);
                    bigInteger3 = bigIntegerAdd3;
                }
            } else {
                bArr[i] = 0;
                bigInteger3 = bigIntegerAdd2;
            }
            bigIntegerAdd2 = b2 == 1 ? bigIntegerNegate.add(bigInteger3.shiftRight(1)) : bigIntegerNegate.subtract(bigInteger3.shiftRight(1));
            bigIntegerNegate = bigInteger3.shiftRight(1).negate();
            i++;
        }
    }

    public static j$a[] a(j$a j_a, byte b2) {
        int i;
        byte[][] bArr = b2 == 0 ? b : d;
        j$a[] j_aArr = new j$a[(bArr.length + 1) >>> 1];
        j_aArr[0] = j_a;
        int length = bArr.length;
        for (int i2 = 3; i2 < length; i2 += 2) {
            int i3 = i2 >>> 1;
            byte[] bArr2 = bArr[i2];
            j$a j_a2 = (j$a) j_a.d().e();
            j$a j_a3 = (j$a) j_a.s();
            int length2 = bArr2.length - 1;
            int i4 = 0;
            j$a j_aC = j_a2;
            while (length2 >= 0) {
                int i5 = i4 + 1;
                byte b3 = bArr2[length2];
                if (b3 != 0) {
                    j$a j_aC2 = j_aC.c(i5);
                    j$a j_a4 = b3 > 0 ? j_a : j_a3;
                    i = 0;
                    j_aC = (j$a) j_aC2.b(j_a4);
                } else {
                    i = i5;
                }
                length2--;
                i4 = i;
            }
            if (i4 > 0) {
                j_aC = j_aC.c(i4);
            }
            j_aArr[i3] = j_aC;
        }
        j_a.d().a(j_aArr);
        return j_aArr;
    }
}
