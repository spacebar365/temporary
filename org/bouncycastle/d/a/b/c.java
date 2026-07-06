package org.bouncycastle.d.a.b;

import java.math.BigInteger;
import org.bouncycastle.d.a.l;
import org.bouncycastle.d.a.u;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    protected final org.bouncycastle.d.a.d a;
    protected final d b;
    protected final l c;

    public c(org.bouncycastle.d.a.d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
        this.c = new u(dVar.a(dVar2.a()));
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(org.bouncycastle.d.a.c.d);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    @Override // org.bouncycastle.d.a.b.a
    public final l a() {
        return this.c;
    }

    @Override // org.bouncycastle.d.a.b.b
    public final BigInteger[] a(BigInteger bigInteger) {
        int iH = this.b.h();
        BigInteger bigIntegerA = a(bigInteger, this.b.f(), iH);
        BigInteger bigIntegerA2 = a(bigInteger, this.b.g(), iH);
        d dVar = this.b;
        return new BigInteger[]{bigInteger.subtract(bigIntegerA.multiply(dVar.b()).add(bigIntegerA2.multiply(dVar.d()))), bigIntegerA.multiply(dVar.c()).add(bigIntegerA2.multiply(dVar.e())).negate()};
    }
}
