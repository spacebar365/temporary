package org.bouncycastle.b.e;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class t implements org.bouncycastle.b.a {
    private static final BigInteger e = BigInteger.valueOf(0);
    private static final BigInteger f = BigInteger.valueOf(1);
    private static final BigInteger g = BigInteger.valueOf(2);
    private org.bouncycastle.b.k.am a;
    private SecureRandom b;
    private boolean c;
    private int d;

    @Override // org.bouncycastle.b.a
    public final int a() {
        return this.c ? (this.d - 1) / 8 : ((this.d + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.b.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (iVar instanceof org.bouncycastle.b.k.bf) {
            org.bouncycastle.b.k.bf bfVar = (org.bouncycastle.b.k.bf) iVar;
            this.a = (org.bouncycastle.b.k.am) bfVar.b();
            this.b = bfVar.a();
        } else {
            this.a = (org.bouncycastle.b.k.am) iVar;
            this.b = org.bouncycastle.b.l.a();
        }
        this.c = z;
        this.d = this.a.b().a().bitLength();
        if (z) {
            if (!(this.a instanceof org.bouncycastle.b.k.ap)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.a instanceof org.bouncycastle.b.k.ao)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.bouncycastle.b.a
    public final byte[] a(byte[] bArr, int i, int i2) {
        if (this.a == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i2 > (this.c ? ((this.d - 1) + 7) / 8 : a())) {
            throw new org.bouncycastle.b.o("input too large for ElGamal cipher.\n");
        }
        BigInteger bigIntegerA = this.a.b().a();
        if (this.a instanceof org.bouncycastle.b.k.ao) {
            byte[] bArr2 = new byte[i2 / 2];
            byte[] bArr3 = new byte[i2 / 2];
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            System.arraycopy(bArr, bArr2.length + i, bArr3, 0, bArr3.length);
            return org.bouncycastle.f.b.a(new BigInteger(1, bArr2).modPow(bigIntegerA.subtract(f).subtract(((org.bouncycastle.b.k.ao) this.a).c()), bigIntegerA).multiply(new BigInteger(1, bArr3)).mod(bigIntegerA));
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(bigIntegerA) >= 0) {
            throw new org.bouncycastle.b.o("input too large for ElGamal cipher.\n");
        }
        org.bouncycastle.b.k.ap apVar = (org.bouncycastle.b.k.ap) this.a;
        int iBitLength = bigIntegerA.bitLength();
        BigInteger bigIntegerA2 = org.bouncycastle.f.b.a(iBitLength, this.b);
        while (true) {
            if (!bigIntegerA2.equals(e) && bigIntegerA2.compareTo(bigIntegerA.subtract(g)) <= 0) {
                break;
            }
            bigIntegerA2 = org.bouncycastle.f.b.a(iBitLength, this.b);
        }
        BigInteger bigIntegerModPow = this.a.b().b().modPow(bigIntegerA2, bigIntegerA);
        BigInteger bigIntegerMod = bigInteger.multiply(apVar.c().modPow(bigIntegerA2, bigIntegerA)).mod(bigIntegerA);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        byte[] bArr5 = new byte[b()];
        if (byteArray.length > bArr5.length / 2) {
            System.arraycopy(byteArray, 1, bArr5, (bArr5.length / 2) - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, (bArr5.length / 2) - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > bArr5.length / 2) {
            System.arraycopy(byteArray2, 1, bArr5, bArr5.length - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, bArr5.length - byteArray2.length, byteArray2.length);
        return bArr5;
    }

    @Override // org.bouncycastle.b.a
    public final int b() {
        return this.c ? ((this.d + 7) / 8) * 2 : (this.d - 1) / 8;
    }
}
