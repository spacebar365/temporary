package org.bouncycastle.f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final BigInteger a = BigInteger.valueOf(0);
    public static final BigInteger b = BigInteger.valueOf(1);
    private static final BigInteger c = BigInteger.valueOf(2);
    private static final BigInteger d = BigInteger.valueOf(3);

    public static BigInteger a(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        }
        if (i == 2) {
            return secureRandom.nextInt() < 0 ? c : d;
        }
        do {
            byte[] bArrB = b(i, secureRandom);
            bArrB[0] = (byte) (((byte) (1 << (7 - ((bArrB.length * 8) - i)))) | bArrB[0]);
            int length = bArrB.length - 1;
            bArrB[length] = (byte) (bArrB[length] | 1);
            bigInteger = new BigInteger(1, bArrB);
        } while (!bigInteger.isProbablePrime(i2));
        return bigInteger;
    }

    public static BigInteger a(int i, SecureRandom secureRandom) {
        return new BigInteger(1, b(i, secureRandom));
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo > 0) {
                throw new IllegalArgumentException("'min' may not be greater than 'max'");
            }
            return bigInteger;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return a(a, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 1000) {
                return a(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
            }
            BigInteger bigIntegerA = a(bigInteger2.bitLength(), secureRandom);
            if (bigIntegerA.compareTo(bigInteger) >= 0 && bigIntegerA.compareTo(bigInteger2) <= 0) {
                return bigIntegerA;
            }
            i = i2 + 1;
        }
    }

    public static BigInteger a(byte[] bArr, int i, int i2) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static byte[] a(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = byteArray[0] == 0 ? 1 : 0;
        int length = byteArray.length - i2;
        if (length > i) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, i2, bArr, bArr.length - length, length);
        return bArr;
    }

    public static byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        byte[] bArr = new byte[byteArray.length - 1];
        System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
        return bArr;
    }

    public static int b(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    private static byte[] b(int i, SecureRandom secureRandom) {
        if (i <= 0) {
            throw new IllegalArgumentException("bitLength must be at least 1");
        }
        int i2 = (i + 7) / 8;
        byte[] bArr = new byte[i2];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (((byte) (255 >>> ((i2 * 8) - i))) & bArr[0]);
        return bArr;
    }
}
