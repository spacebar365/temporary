package org.bouncycastle.p142f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1544b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f5494a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b */
    public static final BigInteger f5495b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f5496c = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: d */
    private static final BigInteger f5497d = BigInteger.valueOf(3);

    /* JADX INFO: renamed from: a */
    public static BigInteger m4113a(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        }
        if (i == 2) {
            return secureRandom.nextInt() < 0 ? f5496c : f5497d;
        }
        do {
            byte[] bArrM4120b = m4120b(i, secureRandom);
            bArrM4120b[0] = (byte) (((byte) (1 << (7 - ((bArrM4120b.length * 8) - i)))) | bArrM4120b[0]);
            int length = bArrM4120b.length - 1;
            bArrM4120b[length] = (byte) (bArrM4120b[length] | 1);
            bigInteger = new BigInteger(1, bArrM4120b);
        } while (!bigInteger.isProbablePrime(i2));
        return bigInteger;
    }

    /* JADX INFO: renamed from: a */
    public static BigInteger m4114a(int i, SecureRandom secureRandom) {
        return new BigInteger(1, m4120b(i, secureRandom));
    }

    /* JADX INFO: renamed from: a */
    public static BigInteger m4115a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo > 0) {
                throw new IllegalArgumentException("'min' may not be greater than 'max'");
            }
            return bigInteger;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return m4115a(f5494a, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 1000) {
                return m4114a(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
            }
            BigInteger bigIntegerM4114a = m4114a(bigInteger2.bitLength(), secureRandom);
            if (bigIntegerM4114a.compareTo(bigInteger) >= 0 && bigIntegerM4114a.compareTo(bigInteger2) <= 0) {
                return bigIntegerM4114a;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static BigInteger m4116a(byte[] bArr, int i, int i2) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4117a(int i, BigInteger bigInteger) {
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

    /* JADX INFO: renamed from: a */
    public static byte[] m4118a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        byte[] bArr = new byte[byteArray.length - 1];
        System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int m4119b(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m4120b(int i, SecureRandom secureRandom) {
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
