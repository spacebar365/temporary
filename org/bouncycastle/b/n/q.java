package org.bouncycastle.b.n;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class q implements b {
    private static final BigInteger a = BigInteger.valueOf(0);
    private BigInteger b;
    private SecureRandom c;

    @Override // org.bouncycastle.b.n.b
    public final void a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.b.n.b
    public final void a(BigInteger bigInteger, SecureRandom secureRandom) {
        this.b = bigInteger;
        this.c = secureRandom;
    }

    @Override // org.bouncycastle.b.n.b
    public final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.b.n.b
    public final BigInteger b() {
        int iBitLength = this.b.bitLength();
        while (true) {
            BigInteger bigIntegerA = org.bouncycastle.f.b.a(iBitLength, this.c);
            if (!bigIntegerA.equals(a) && bigIntegerA.compareTo(this.b) < 0) {
                return bigIntegerA;
            }
        }
    }
}
