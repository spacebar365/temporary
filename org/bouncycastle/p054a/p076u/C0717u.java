package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.u */
/* JADX INFO: loaded from: classes.dex */
final class C0717u extends AbstractC0508ae {
    C0717u() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerM1706c = C0698b.m1706c("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
        byte[] bArrM4106a = C1541f.m4106a("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(233, 74, bigIntegerValueOf, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerValueOf2));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052")), bigIntegerM1706c2, bigIntegerValueOf2, bArrM4106a);
    }
}
