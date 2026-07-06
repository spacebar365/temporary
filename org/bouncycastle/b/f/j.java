package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final BigInteger a = BigInteger.valueOf(0);
    private static final BigInteger b = BigInteger.valueOf(1);
    private static final BigInteger c = BigInteger.valueOf(2);
    private org.bouncycastle.b.r d;
    private int e;
    private int f;
    private int g;
    private int h;
    private SecureRandom i;
    private boolean j;
    private int k;

    public j(org.bouncycastle.b.r rVar) {
        this.d = rVar;
    }

    private static int a(int i) {
        if (i <= 1024) {
            return 40;
        }
        return (((i - 1) / 1024) * 8) + 48;
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerDivide = bigInteger.subtract(b).divide(bigInteger2);
        BigInteger bigIntegerSubtract = bigInteger.subtract(c);
        do {
            bigIntegerModPow = org.bouncycastle.f.b.a(c, bigIntegerSubtract, secureRandom).modPow(bigIntegerDivide, bigInteger);
        } while (bigIntegerModPow.bitLength() <= 1);
        return bigIntegerModPow;
    }

    private static BigInteger a(org.bouncycastle.b.r rVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
        BigInteger bigIntegerDivide = bigInteger.subtract(b).divide(bigInteger2);
        byte[] bArrA = org.bouncycastle.f.a.f.a("6767656E");
        byte[] bArr2 = new byte[bArr.length + bArrA.length + 1 + 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrA, 0, bArr2, bArr.length, bArrA.length);
        bArr2[bArr2.length - 3] = (byte) i;
        byte[] bArr3 = new byte[rVar.b()];
        for (int i2 = 1; i2 < 65536; i2++) {
            a(bArr2);
            a(rVar, bArr2, bArr3, 0);
            BigInteger bigIntegerModPow = new BigInteger(1, bArr3).modPow(bigIntegerDivide, bigInteger);
            if (bigIntegerModPow.compareTo(c) >= 0) {
                return bigIntegerModPow;
            }
        }
        return null;
    }

    private static void a(org.bouncycastle.b.r rVar, byte[] bArr, byte[] bArr2, int i) {
        rVar.a(bArr, 0, bArr.length);
        rVar.a(bArr2, i);
    }

    private static void a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b2 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b2;
            if (b2 != 0) {
                return;
            }
        }
    }

    private boolean a(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.bouncycastle.b.k.r b() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.b.f.j.b():org.bouncycastle.b.k.r");
    }

    public final void a(org.bouncycastle.b.k.q qVar) {
        int iA = qVar.a();
        int iB = qVar.b();
        if (iA < 1024 || iA > 3072 || iA % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (iA == 1024 && iB != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (iA == 2048 && iB != 224 && iB != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (iA == 3072 && iB != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.d.b() * 8 < iB) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.e = iA;
        this.f = iB;
        this.g = qVar.c();
        this.h = Math.max(a(iA), (this.g + 1) / 2);
        this.i = qVar.d();
        this.j = true;
        this.k = qVar.e();
    }

    public j() {
        this(new org.bouncycastle.b.b.s());
    }

    public final void a(int i, int i2, SecureRandom secureRandom) {
        this.e = i;
        this.f = i > 1024 ? 256 : 160;
        this.g = i2;
        this.h = Math.max(a(this.e), (i2 + 1) / 2);
        this.i = secureRandom;
        this.j = false;
        this.k = -1;
    }

    public final org.bouncycastle.b.k.r a() {
        BigInteger bit;
        int i;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerA;
        if (!this.j) {
            return b();
        }
        org.bouncycastle.b.r rVar = this.d;
        int iB = rVar.b() * 8;
        byte[] bArr = new byte[this.f / 8];
        int i2 = (this.e - 1) / iB;
        byte[] bArr2 = new byte[this.e / 8];
        byte[] bArr3 = new byte[rVar.b()];
        loop0: while (true) {
            this.i.nextBytes(bArr);
            a(rVar, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(b.shiftLeft(this.f - 1)).setBit(0).setBit(this.f - 1);
            if (a(bit)) {
                byte[] bArrB = org.bouncycastle.f.a.b(bArr);
                int i3 = this.e * 4;
                i = 0;
                while (i < i3) {
                    for (int i4 = 1; i4 <= i2; i4++) {
                        a(bArrB);
                        a(rVar, bArrB, bArr2, bArr2.length - (bArr3.length * i4));
                    }
                    int length = bArr2.length - (bArr3.length * i2);
                    a(bArrB);
                    a(rVar, bArrB, bArr3, 0);
                    System.arraycopy(bArr3, bArr3.length - length, bArr2, 0, length);
                    bArr2[0] = (byte) (bArr2[0] | (-128));
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    bigIntegerSubtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(b));
                    if (bigIntegerSubtract.bitLength() == this.e && a(bigIntegerSubtract)) {
                        break loop0;
                    }
                    i++;
                }
            }
        }
        return (this.k < 0 || (bigIntegerA = a(rVar, bigIntegerSubtract, bit, bArr, this.k)) == null) ? new org.bouncycastle.b.k.r(bigIntegerSubtract, bit, a(bigIntegerSubtract, bit, this.i), new org.bouncycastle.b.k.u(bArr, i)) : new org.bouncycastle.b.k.r(bigIntegerSubtract, bit, bigIntegerA, new org.bouncycastle.b.k.u(bArr, i, this.k));
    }
}
