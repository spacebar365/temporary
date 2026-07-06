package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.ba;

/* JADX INFO: loaded from: classes.dex */
public final class l implements b {
    private static final BigInteger a = BigInteger.valueOf(0);
    private final org.bouncycastle.b.h.g b;
    private final byte[] c;
    private final byte[] d;
    private BigInteger e;

    public l(org.bouncycastle.b.r rVar) {
        this.b = new org.bouncycastle.b.h.g(rVar);
        this.d = new byte[this.b.b()];
        this.c = new byte[this.b.b()];
    }

    private BigInteger a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.e.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.e.bitLength()) : bigInteger;
    }

    @Override // org.bouncycastle.b.n.b
    public final void a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.e = bigInteger;
        org.bouncycastle.f.a.a(this.d, (byte) 1);
        org.bouncycastle.f.a.a(this.c, (byte) 0);
        int iB = org.bouncycastle.f.b.b(bigInteger);
        byte[] bArr2 = new byte[iB];
        byte[] bArrA = org.bouncycastle.f.b.a(bigInteger2);
        System.arraycopy(bArrA, 0, bArr2, bArr2.length - bArrA.length, bArrA.length);
        byte[] bArr3 = new byte[iB];
        BigInteger bigIntegerA = a(bArr);
        if (bigIntegerA.compareTo(bigInteger) >= 0) {
            bigIntegerA = bigIntegerA.subtract(bigInteger);
        }
        byte[] bArrA2 = org.bouncycastle.f.b.a(bigIntegerA);
        System.arraycopy(bArrA2, 0, bArr3, bArr3.length - bArrA2.length, bArrA2.length);
        this.b.a(new ba(this.c));
        this.b.a(this.d, 0, this.d.length);
        this.b.a((byte) 0);
        this.b.a(bArr2, 0, bArr2.length);
        this.b.a(bArr3, 0, bArr3.length);
        this.b.a(this.c, 0);
        this.b.a(new ba(this.c));
        this.b.a(this.d, 0, this.d.length);
        this.b.a(this.d, 0);
        this.b.a(this.d, 0, this.d.length);
        this.b.a((byte) 1);
        this.b.a(bArr2, 0, bArr2.length);
        this.b.a(bArr3, 0, bArr3.length);
        this.b.a(this.c, 0);
        this.b.a(new ba(this.c));
        this.b.a(this.d, 0, this.d.length);
        this.b.a(this.d, 0);
    }

    @Override // org.bouncycastle.b.n.b
    public final void a(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.b.n.b
    public final boolean a() {
        return true;
    }

    @Override // org.bouncycastle.b.n.b
    public final BigInteger b() {
        byte[] bArr = new byte[org.bouncycastle.f.b.b(this.e)];
        while (true) {
            int i = 0;
            while (i < bArr.length) {
                this.b.a(this.d, 0, this.d.length);
                this.b.a(this.d, 0);
                int iMin = Math.min(bArr.length - i, this.d.length);
                System.arraycopy(this.d, 0, bArr, i, iMin);
                i += iMin;
            }
            BigInteger bigIntegerA = a(bArr);
            if (bigIntegerA.compareTo(a) > 0 && bigIntegerA.compareTo(this.e) < 0) {
                return bigIntegerA;
            }
            this.b.a(this.d, 0, this.d.length);
            this.b.a((byte) 0);
            this.b.a(this.c, 0);
            this.b.a(new ba(this.c));
            this.b.a(this.d, 0, this.d.length);
            this.b.a(this.d, 0);
        }
    }
}
