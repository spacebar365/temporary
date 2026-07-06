package org.bouncycastle.b.e;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;

/* JADX INFO: loaded from: classes.dex */
public final class an implements org.bouncycastle.b.a {
    private static final BigInteger a = BigInteger.valueOf(1);
    private ao b = new ao();
    private bm c;
    private SecureRandom d;

    @Override // org.bouncycastle.b.a
    public final int a() {
        return this.b.a();
    }

    @Override // org.bouncycastle.b.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.b.a(z, iVar);
        if (!(iVar instanceof org.bouncycastle.b.k.bf)) {
            this.c = (bm) iVar;
            this.d = org.bouncycastle.b.l.a();
        } else {
            org.bouncycastle.b.k.bf bfVar = (org.bouncycastle.b.k.bf) iVar;
            this.c = (bm) bfVar.b();
            this.d = bfVar.a();
        }
    }

    @Override // org.bouncycastle.b.a
    public final byte[] a(byte[] bArr, int i, int i2) {
        BigInteger bigIntegerB;
        bn bnVar;
        BigInteger bigIntegerD;
        if (this.c == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        BigInteger bigIntegerA = this.b.a(bArr, i, i2);
        if (!(this.c instanceof bn) || (bigIntegerD = (bnVar = (bn) this.c).d()) == null) {
            bigIntegerB = this.b.b(bigIntegerA);
        } else {
            BigInteger bigIntegerB2 = bnVar.b();
            BigInteger bigIntegerA2 = org.bouncycastle.f.b.a(a, bigIntegerB2.subtract(a), this.d);
            bigIntegerB = this.b.b(bigIntegerA2.modPow(bigIntegerD, bigIntegerB2).multiply(bigIntegerA).mod(bigIntegerB2)).multiply(bigIntegerA2.modInverse(bigIntegerB2)).mod(bigIntegerB2);
            if (!bigIntegerA.equals(bigIntegerB.modPow(bigIntegerD, bigIntegerB2))) {
                throw new IllegalStateException("RSA engine faulty decryption/signing detected");
            }
        }
        return this.b.a(bigIntegerB);
    }

    @Override // org.bouncycastle.b.a
    public final int b() {
        return this.b.b();
    }
}
