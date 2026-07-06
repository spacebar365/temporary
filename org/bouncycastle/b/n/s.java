package org.bouncycastle.b.n;

import java.math.BigInteger;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class s implements a {
    public static final s a = new s();

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    private static BigInteger a(BigInteger bigInteger, v vVar, int i) {
        return a(bigInteger, ((org.bouncycastle.a.m) vVar.a(i)).b());
    }

    private static void a(BigInteger bigInteger, org.bouncycastle.a.g gVar, BigInteger bigInteger2) {
        gVar.a(new org.bouncycastle.a.m(a(bigInteger, bigInteger2)));
    }

    @Override // org.bouncycastle.b.n.a
    public final byte[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        a(bigInteger, gVar, bigInteger2);
        a(bigInteger, gVar, bigInteger3);
        return new bi(gVar).a("DER");
    }

    @Override // org.bouncycastle.b.n.a
    public final BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        v vVar = (v) u.b(bArr);
        if (vVar.d() == 2) {
            BigInteger bigIntegerA = a(bigInteger, vVar, 0);
            BigInteger bigIntegerA2 = a(bigInteger, vVar, 1);
            if (org.bouncycastle.f.a.a(a(bigInteger, bigIntegerA, bigIntegerA2), bArr)) {
                return new BigInteger[]{bigIntegerA, bigIntegerA2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }
}
