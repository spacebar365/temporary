package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p107d.p108a.p113b.C1374c;
import org.bouncycastle.p107d.p108a.p113b.C1375d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.ah */
/* JADX INFO: loaded from: classes.dex */
final class C0695ah extends AbstractC0508ae {
    C0695ah() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37");
        BigInteger bigInteger = InterfaceC1376c.f4994c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(3L);
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
        C1375d c1375d = new C1375d(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), 208);
        AbstractC1381d.e eVar = new AbstractC1381d.e(bigIntegerM1706c, bigInteger, bigIntegerValueOf, bigIntegerM1706c2, bigIntegerValueOf2);
        AbstractC1381d abstractC1381dM3376a = eVar.m3363b().m3375a(new C1374c(eVar, c1375d)).m3376a();
        return new C0507ad(abstractC1381dM3376a, new C0509af(abstractC1381dM3376a, C1541f.m4106a("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D")), bigIntegerM1706c2, bigIntegerValueOf2, (byte[]) null);
    }
}
