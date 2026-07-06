package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.bf;

/* JADX INFO: loaded from: classes.dex */
public final class a implements org.bouncycastle.b.d {
    private static final BigInteger a = BigInteger.valueOf(1);
    private org.bouncycastle.b.k.j b;
    private org.bouncycastle.b.k.i c;

    @Override // org.bouncycastle.b.d
    public final int a() {
        return (this.b.b().a().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.b.d
    public final void a(org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.k.b bVar = iVar instanceof bf ? (org.bouncycastle.b.k.b) ((bf) iVar).b() : (org.bouncycastle.b.k.b) iVar;
        if (!(bVar instanceof org.bouncycastle.b.k.j)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        this.b = (org.bouncycastle.b.k.j) bVar;
        this.c = this.b.b();
    }

    @Override // org.bouncycastle.b.d
    public final BigInteger b(org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.k.k kVar = (org.bouncycastle.b.k.k) iVar;
        if (!kVar.b().equals(this.c)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger bigIntegerA = this.c.a();
        BigInteger bigIntegerC = kVar.c();
        if (bigIntegerC == null || bigIntegerC.compareTo(a) <= 0 || bigIntegerC.compareTo(bigIntegerA.subtract(a)) >= 0) {
            throw new IllegalArgumentException("Diffie-Hellman public key is weak");
        }
        BigInteger bigIntegerModPow = bigIntegerC.modPow(this.b.c(), bigIntegerA);
        if (bigIntegerModPow.equals(a)) {
            throw new IllegalStateException("Shared key can't be 1");
        }
        return bigIntegerModPow;
    }
}
