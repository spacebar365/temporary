package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.j */
/* JADX INFO: loaded from: classes.dex */
final class C0706j extends AbstractC0508ae {
    C0706j() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("003088250CA6E7C7FE649CE85820F7");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("00E8BEE4D3E2260744188BE0E9C723");
        byte[] bArrM4106a = C1541f.m4106a("10E723AB14D696E6768756151756FEBF8FCB49A9");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("0100000000000000D9CCEC8A39E56F");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(113, 9, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886")), bigIntegerM1706c3, bigIntegerValueOf, bArrM4106a);
    }
}
