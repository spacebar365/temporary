package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.z */
/* JADX INFO: loaded from: classes.dex */
final class C0722z extends AbstractC0508ae {
    C0722z() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = InterfaceC1376c.f4994c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerM1706c = C0698b.m1706c("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(4L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(409, 87, bigInteger, bigIntegerValueOf, bigIntegerM1706c, bigIntegerValueOf2));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B")), bigIntegerM1706c, bigIntegerValueOf2, (byte[]) null);
    }
}
