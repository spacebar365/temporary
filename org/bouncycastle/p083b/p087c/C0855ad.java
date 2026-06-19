package org.bouncycastle.p083b.p087c;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.p109a.p112c.C1356s;
import org.bouncycastle.p107d.p108a.p113b.C1374c;
import org.bouncycastle.p107d.p108a.p113b.C1375d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.b.c.ad */
/* JADX INFO: loaded from: classes.dex */
final class C0855ad extends AbstractC0508ae {
    C0855ad() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        C1375d c1375d = new C1375d(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), 208);
        C1356s c1356s = new C1356s();
        AbstractC1381d abstractC1381dM3376a = c1356s.m3363b().m3375a(new C1374c(c1356s, c1375d)).m3376a();
        return new C0507ad(abstractC1381dM3376a, new C0509af(abstractC1381dM3376a, C1541f.m4106a("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D")), abstractC1381dM3376a.m3368i(), abstractC1381dM3376a.m3369j(), (byte[]) null);
    }
}
