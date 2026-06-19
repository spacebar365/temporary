package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.e */
/* JADX INFO: loaded from: classes.dex */
final class C0701e extends AbstractC0508ae {
    C0701e() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
        byte[] bArrM4106a = C1541f.m4106a("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
