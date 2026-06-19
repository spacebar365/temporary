package org.bouncycastle.p107d.p108a.p113b;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.C1400u;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p107d.p108a.InterfaceC1391l;

/* JADX INFO: renamed from: org.bouncycastle.d.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1374c implements InterfaceC1373b {

    /* JADX INFO: renamed from: a */
    protected final AbstractC1381d f4982a;

    /* JADX INFO: renamed from: b */
    protected final C1375d f4983b;

    /* JADX INFO: renamed from: c */
    protected final InterfaceC1391l f4984c;

    public C1374c(AbstractC1381d abstractC1381d, C1375d c1375d) {
        this.f4982a = abstractC1381d;
        this.f4983b = c1375d;
        this.f4984c = new C1400u(abstractC1381d.mo2906a(c1375d.m3285a()));
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m3283a(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(InterfaceC1376c.f4995d);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    @Override // org.bouncycastle.p107d.p108a.p113b.InterfaceC1372a
    /* JADX INFO: renamed from: a */
    public final InterfaceC1391l mo3281a() {
        return this.f4984c;
    }

    @Override // org.bouncycastle.p107d.p108a.p113b.InterfaceC1373b
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo3282a(BigInteger bigInteger) {
        int iM3292h = this.f4983b.m3292h();
        BigInteger bigIntegerM3283a = m3283a(bigInteger, this.f4983b.m3290f(), iM3292h);
        BigInteger bigIntegerM3283a2 = m3283a(bigInteger, this.f4983b.m3291g(), iM3292h);
        C1375d c1375d = this.f4983b;
        return new BigInteger[]{bigInteger.subtract(bigIntegerM3283a.multiply(c1375d.m3286b()).add(bigIntegerM3283a2.multiply(c1375d.m3288d()))), bigIntegerM3283a.multiply(c1375d.m3287c()).add(bigIntegerM3283a2.multiply(c1375d.m3289e())).negate()};
    }
}
