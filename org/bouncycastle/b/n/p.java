package org.bouncycastle.b.n;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class p implements a {
    public static final p a = new p();

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    private static BigInteger a(BigInteger bigInteger, byte[] bArr, int i, int i2) {
        return a(bigInteger, new BigInteger(1, org.bouncycastle.f.a.c(bArr, i, i + i2)));
    }

    private static void a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i, int i2) {
        byte[] byteArray = a(bigInteger, bigInteger2).toByteArray();
        int iMax = Math.max(0, byteArray.length - i2);
        int length = byteArray.length - iMax;
        int i3 = i2 - length;
        org.bouncycastle.f.a.b(bArr, i, i + i3);
        System.arraycopy(byteArray, iMax, bArr, i3 + i, length);
    }

    @Override // org.bouncycastle.b.n.a
    public final byte[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int iB = org.bouncycastle.f.b.b(bigInteger);
        byte[] bArr = new byte[iB * 2];
        a(bigInteger, bigInteger2, bArr, 0, iB);
        a(bigInteger, bigInteger3, bArr, iB, iB);
        return bArr;
    }

    @Override // org.bouncycastle.b.n.a
    public final BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        int iB = org.bouncycastle.f.b.b(bigInteger);
        if (bArr.length != iB * 2) {
            throw new IllegalArgumentException("Encoding has incorrect length");
        }
        return new BigInteger[]{a(bigInteger, bArr, 0, iB), a(bigInteger, bArr, iB, iB)};
    }
}
