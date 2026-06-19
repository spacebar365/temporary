package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.p */
/* JADX INFO: loaded from: classes.dex */
final class C0712p extends AbstractC0508ae {
    C0712p() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
        byte[] bArrM4106a = C1541f.m4106a("24B7B137C8A14D696E6768756151756FD0DA2E5C");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(163, 3, 6, 7, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883")), bigIntegerM1706c3, bigIntegerValueOf, bArrM4106a);
    }
}
