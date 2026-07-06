package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa {
    private static final int[] a = {13, 41, 121, 337, 897, 2305};
    private static final byte[] b = new byte[0];
    private static final int[] c = new int[0];
    private static final j[] d = new j[0];

    public static int a(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static j a(j jVar, int i, l lVar) {
        d dVarD = jVar.d();
        z zVarA = a(jVar, i);
        j jVarA = lVar.a(jVar);
        dVarD.a(jVarA, "bc_wnaf", new ab(zVarA, lVar));
        return jVarA;
    }

    public static z a(j jVar, int i) {
        d dVarD = jVar.d();
        return (z) dVarD.a(jVar, "bc_wnaf", new ac(i, jVar, dVarD));
    }

    private static int[] a(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        return iArr2;
    }

    static /* synthetic */ j[] a() {
        return d;
    }

    public static int[] a(int i, BigInteger bigInteger) {
        int[] iArr;
        int i2;
        int i3;
        if (i == 2) {
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger.signum() == 0) {
                return c;
            }
            BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
            int iBitLength = bigIntegerAdd.bitLength();
            iArr = new int[iBitLength >> 1];
            BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
            int i4 = iBitLength - 1;
            int i5 = 1;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                if (bigIntegerXor.testBit(i5)) {
                    iArr[i7] = ((bigInteger.testBit(i5) ? -1 : 1) << 16) | i6;
                    i2 = i5 + 1;
                    i3 = 1;
                    i7++;
                } else {
                    i3 = i6 + 1;
                    i2 = i5;
                }
                i5 = i2 + 1;
                i6 = i3;
            }
            int i8 = i7 + 1;
            iArr[i7] = 65536 | i6;
            if (iArr.length > i8) {
                return a(iArr, i8);
            }
        } else {
            if (i < 2 || i > 16) {
                throw new IllegalArgumentException("'width' must be in the range [2, 16]");
            }
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger.signum() == 0) {
                return c;
            }
            iArr = new int[(bigInteger.bitLength() / i) + 1];
            int i9 = 1 << i;
            int i10 = i9 - 1;
            int i11 = i9 >>> 1;
            int i12 = 0;
            int i13 = 0;
            boolean z = false;
            while (i12 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i12) == z) {
                    i12++;
                } else {
                    bigInteger = bigInteger.shiftRight(i12);
                    int iIntValue = bigInteger.intValue() & i10;
                    if (z) {
                        iIntValue++;
                    }
                    z = (iIntValue & i11) != 0;
                    int i14 = z ? iIntValue - i9 : iIntValue;
                    if (i13 > 0) {
                        i12--;
                    }
                    iArr[i13] = i12 | (i14 << 16);
                    i12 = i;
                    i13++;
                }
            }
            if (iArr.length > i13) {
                return a(iArr, i13);
            }
        }
        return iArr;
    }

    public static byte[] b(int i, BigInteger bigInteger) {
        int i2;
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return b;
            }
            BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
            int iBitLength = bigIntegerAdd.bitLength() - 1;
            byte[] bArr = new byte[iBitLength];
            BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
            int i3 = 1;
            while (i3 < iBitLength) {
                if (bigIntegerXor.testBit(i3)) {
                    bArr[i3 - 1] = (byte) (bigInteger.testBit(i3) ? -1 : 1);
                    i2 = i3 + 1;
                } else {
                    i2 = i3;
                }
                i3 = i2 + 1;
            }
            bArr[iBitLength - 1] = 1;
            return bArr;
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return b;
        }
        byte[] bArr2 = new byte[bigInteger.bitLength() + 1];
        int i4 = 1 << i;
        int i5 = i4 - 1;
        int i6 = i4 >>> 1;
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        while (i7 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i7) == z) {
                i7++;
            } else {
                bigInteger = bigInteger.shiftRight(i7);
                int iIntValue = bigInteger.intValue() & i5;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i6) != 0;
                if (z) {
                    iIntValue -= i4;
                }
                if (i8 > 0) {
                    i7--;
                }
                int i9 = i7 + i8;
                i8 = i9 + 1;
                bArr2[i9] = (byte) iIntValue;
                i7 = i;
            }
        }
        if (bArr2.length <= i8) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
        return bArr3;
    }

    public static z a(j jVar) {
        t tVarA = jVar.d().a(jVar, "bc_wnaf");
        if (tVarA instanceof z) {
            return (z) tVarA;
        }
        return null;
    }

    public static int a(int i) {
        int[] iArr = a;
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    static /* synthetic */ j[] a(j[] jVarArr, int i) {
        j[] jVarArr2 = new j[i];
        System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
        return jVarArr2;
    }
}
