package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.a.aa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1364aa {

    /* JADX INFO: renamed from: a */
    private static final int[] f4966a = {13, 41, 121, 337, 897, 2305};

    /* JADX INFO: renamed from: b */
    private static final byte[] f4967b = new byte[0];

    /* JADX INFO: renamed from: c */
    private static final int[] f4968c = new int[0];

    /* JADX INFO: renamed from: d */
    private static final AbstractC1389j[] f4969d = new AbstractC1389j[0];

    /* JADX INFO: renamed from: a */
    public static int m3257a(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m3258a(AbstractC1389j abstractC1389j, int i, InterfaceC1391l interfaceC1391l) {
        AbstractC1381d abstractC1381dM3459d = abstractC1389j.m3459d();
        C1405z c1405zM3260a = m3260a(abstractC1389j, i);
        AbstractC1389j abstractC1389jMo3478a = interfaceC1391l.mo3478a(abstractC1389j);
        abstractC1381dM3459d.m3359a(abstractC1389jMo3478a, "bc_wnaf", new C1365ab(c1405zM3260a, interfaceC1391l));
        return abstractC1389jMo3478a;
    }

    /* JADX INFO: renamed from: a */
    public static C1405z m3260a(AbstractC1389j abstractC1389j, int i) {
        AbstractC1381d abstractC1381dM3459d = abstractC1389j.m3459d();
        return (C1405z) abstractC1381dM3459d.m3359a(abstractC1389j, "bc_wnaf", new C1366ac(i, abstractC1389j, abstractC1381dM3459d));
    }

    /* JADX INFO: renamed from: a */
    private static int[] m3262a(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        return iArr2;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3261a(int i, BigInteger bigInteger) {
        int[] iArr;
        int i2;
        int i3;
        if (i == 2) {
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger.signum() == 0) {
                return f4968c;
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
                return m3262a(iArr, i8);
            }
        } else {
            if (i < 2 || i > 16) {
                throw new IllegalArgumentException("'width' must be in the range [2, 16]");
            }
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            }
            if (bigInteger.signum() == 0) {
                return f4968c;
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
                return m3262a(iArr, i13);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3265b(int i, BigInteger bigInteger) {
        int i2;
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return f4967b;
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
            return f4967b;
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

    /* JADX INFO: renamed from: a */
    public static C1405z m3259a(AbstractC1389j abstractC1389j) {
        InterfaceC1399t interfaceC1399tM3358a = abstractC1389j.m3459d().m3358a(abstractC1389j, "bc_wnaf");
        if (interfaceC1399tM3358a instanceof C1405z) {
            return (C1405z) interfaceC1399tM3358a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static int m3256a(int i) {
        int[] iArr = f4966a;
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ AbstractC1389j[] m3264a(AbstractC1389j[] abstractC1389jArr, int i) {
        AbstractC1389j[] abstractC1389jArr2 = new AbstractC1389j[i];
        System.arraycopy(abstractC1389jArr, 0, abstractC1389jArr2, 0, abstractC1389jArr.length);
        return abstractC1389jArr2;
    }
}
