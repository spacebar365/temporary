package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p117c.AbstractC1416c;

/* JADX INFO: renamed from: org.bouncycastle.d.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1392m extends AbstractC1223a {
    @Override // org.bouncycastle.p107d.p108a.AbstractC1223a
    /* JADX INFO: renamed from: b */
    protected final AbstractC1389j mo2904b(AbstractC1389j abstractC1389j, BigInteger bigInteger) {
        AbstractC1381d abstractC1381dM3459d = abstractC1389j.m3459d();
        if (bigInteger.bitLength() > C1394o.m3485a(abstractC1381dM3459d)) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        AbstractC1381d abstractC1381dM3459d2 = abstractC1389j.m3459d();
        C1393n c1393n = (C1393n) abstractC1381dM3459d2.m3359a(abstractC1389j, "bc_fixed_point", new C1395p(abstractC1381dM3459d2, abstractC1389j));
        InterfaceC1387h interfaceC1387hM3479a = c1393n.m3479a();
        int iM3484c = c1393n.m3484c();
        int i = ((r2 + iM3484c) - 1) / iM3484c;
        AbstractC1389j abstractC1389jMo2912e = abstractC1381dM3459d.mo2912e();
        int i2 = i * iM3484c;
        int[] iArrM3581a = AbstractC1416c.m3581a(i2, bigInteger);
        int i3 = i2 - 1;
        int i4 = 0;
        AbstractC1389j abstractC1389jMo2947d = abstractC1389jMo2912e;
        while (i4 < i) {
            int i5 = 0;
            for (int i6 = i3 - i4; i6 >= 0; i6 -= i) {
                int i7 = iArrM3581a[i6 >>> 5] >>> (i6 & 31);
                i5 = ((i5 ^ (i7 >>> 1)) << 1) ^ i7;
            }
            i4++;
            abstractC1389jMo2947d = abstractC1389jMo2947d.mo2947d(interfaceC1387hM3479a.mo2914a(i5));
        }
        return abstractC1389jMo2947d.mo2946b(c1393n.m3483b());
    }
}
