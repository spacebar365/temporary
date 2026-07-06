package org.bouncycastle.d;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.f.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static final BigInteger a = BigInteger.valueOf(1);
    private static final BigInteger b = BigInteger.valueOf(2);
    private static final BigInteger c = BigInteger.valueOf(3);

    private static void a(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() <= 0 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'" + str + "' must be non-null and >= 2");
        }
    }

    private static boolean a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, BigInteger bigInteger4) {
        BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (bigIntegerModPow.equals(a) || bigIntegerModPow.equals(bigInteger2)) {
            return true;
        }
        for (int i2 = 1; i2 < i; i2++) {
            bigIntegerModPow = bigIntegerModPow.modPow(b, bigInteger);
            if (bigIntegerModPow.equals(bigInteger2)) {
                return true;
            }
            if (bigIntegerModPow.equals(a)) {
                return false;
            }
        }
        return false;
    }

    public static boolean a(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        a(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        if (!bigInteger.testBit(0)) {
            return false;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(a);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(b);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            if (!a(bigInteger, bigIntegerSubtract, bigIntegerShiftRight, lowestSetBit, b.a(b, bigIntegerSubtract2, secureRandom))) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(BigInteger bigInteger) {
        a(bigInteger, "candidate");
        int iIntValue = bigInteger.mod(BigInteger.valueOf(223092870L)).intValue();
        if (iIntValue % 2 == 0 || iIntValue % 3 == 0 || iIntValue % 5 == 0 || iIntValue % 7 == 0 || iIntValue % 11 == 0 || iIntValue % 13 == 0 || iIntValue % 17 == 0 || iIntValue % 19 == 0 || iIntValue % 23 == 0) {
            return true;
        }
        int iIntValue2 = bigInteger.mod(BigInteger.valueOf(58642669L)).intValue();
        if (iIntValue2 % 29 == 0 || iIntValue2 % 31 == 0 || iIntValue2 % 37 == 0 || iIntValue2 % 41 == 0 || iIntValue2 % 43 == 0) {
            return true;
        }
        int iIntValue3 = bigInteger.mod(BigInteger.valueOf(600662303L)).intValue();
        if (iIntValue3 % 47 == 0 || iIntValue3 % 53 == 0 || iIntValue3 % 59 == 0 || iIntValue3 % 61 == 0 || iIntValue3 % 67 == 0) {
            return true;
        }
        int iIntValue4 = bigInteger.mod(BigInteger.valueOf(33984931L)).intValue();
        if (iIntValue4 % 71 == 0 || iIntValue4 % 73 == 0 || iIntValue4 % 79 == 0 || iIntValue4 % 83 == 0) {
            return true;
        }
        int iIntValue5 = bigInteger.mod(BigInteger.valueOf(89809099L)).intValue();
        if (iIntValue5 % 89 == 0 || iIntValue5 % 97 == 0 || iIntValue5 % 101 == 0 || iIntValue5 % 103 == 0) {
            return true;
        }
        int iIntValue6 = bigInteger.mod(BigInteger.valueOf(167375713L)).intValue();
        if (iIntValue6 % 107 == 0 || iIntValue6 % 109 == 0 || iIntValue6 % 113 == 0 || iIntValue6 % 127 == 0) {
            return true;
        }
        int iIntValue7 = bigInteger.mod(BigInteger.valueOf(371700317L)).intValue();
        if (iIntValue7 % 131 == 0 || iIntValue7 % 137 == 0 || iIntValue7 % 139 == 0 || iIntValue7 % 149 == 0) {
            return true;
        }
        int iIntValue8 = bigInteger.mod(BigInteger.valueOf(645328247L)).intValue();
        if (iIntValue8 % 151 == 0 || iIntValue8 % 157 == 0 || iIntValue8 % 163 == 0 || iIntValue8 % 167 == 0) {
            return true;
        }
        int iIntValue9 = bigInteger.mod(BigInteger.valueOf(1070560157L)).intValue();
        if (iIntValue9 % 173 == 0 || iIntValue9 % 179 == 0 || iIntValue9 % 181 == 0 || iIntValue9 % 191 == 0) {
            return true;
        }
        int iIntValue10 = bigInteger.mod(BigInteger.valueOf(1596463769L)).intValue();
        return iIntValue10 % 193 == 0 || iIntValue10 % 197 == 0 || iIntValue10 % 199 == 0 || iIntValue10 % 211 == 0;
    }
}
