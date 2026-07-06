package org.bouncycastle.b.e;

import java.math.BigInteger;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;

/* JADX INFO: loaded from: classes.dex */
final class ao {
    private bm a;
    private boolean b;

    ao() {
    }

    public final int a() {
        return this.b ? ((r0 + 7) / 8) - 1 : (this.a.b().bitLength() + 7) / 8;
    }

    public final BigInteger a(byte[] bArr, int i, int i2) {
        if (i2 > a() + 1) {
            throw new org.bouncycastle.b.o("input too large for RSA cipher.");
        }
        if (i2 == a() + 1 && !this.b) {
            throw new org.bouncycastle.b.o("input too large for RSA cipher.");
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.a.b()) >= 0) {
            throw new org.bouncycastle.b.o("input too large for RSA cipher.");
        }
        return bigInteger;
    }

    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (iVar instanceof org.bouncycastle.b.k.bf) {
            this.a = (bm) ((org.bouncycastle.b.k.bf) iVar).b();
        } else {
            this.a = (bm) iVar;
        }
        this.b = z;
    }

    public final byte[] a(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.b) {
            if (byteArray[0] == 0) {
                bArr = new byte[byteArray.length - 1];
                System.arraycopy(byteArray, 1, bArr, 0, bArr.length);
            } else {
                bArr = new byte[byteArray.length];
                System.arraycopy(byteArray, 0, bArr, 0, bArr.length);
            }
            org.bouncycastle.f.a.a(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > b()) {
            byte[] bArr2 = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr2, 0, bArr2.length);
            return bArr2;
        }
        if (byteArray.length >= b()) {
            return byteArray;
        }
        byte[] bArr3 = new byte[b()];
        System.arraycopy(byteArray, 0, bArr3, bArr3.length - byteArray.length, byteArray.length);
        return bArr3;
    }

    public final int b() {
        return this.b ? (this.a.b().bitLength() + 7) / 8 : ((r0 + 7) / 8) - 1;
    }

    public final BigInteger b(BigInteger bigInteger) {
        if (!(this.a instanceof bn)) {
            return bigInteger.modPow(this.a.c(), this.a.b());
        }
        bn bnVar = (bn) this.a;
        BigInteger bigIntegerE = bnVar.e();
        BigInteger bigIntegerF = bnVar.f();
        BigInteger bigIntegerG = bnVar.g();
        BigInteger bigIntegerH = bnVar.h();
        BigInteger bigIntegerI = bnVar.i();
        BigInteger bigIntegerModPow = bigInteger.remainder(bigIntegerE).modPow(bigIntegerG, bigIntegerE);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(bigIntegerF).modPow(bigIntegerH, bigIntegerF);
        return bigIntegerModPow.subtract(bigIntegerModPow2).multiply(bigIntegerI).mod(bigIntegerE).multiply(bigIntegerF).add(bigIntegerModPow2);
    }
}
