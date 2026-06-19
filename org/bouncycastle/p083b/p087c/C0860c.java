package org.bouncycastle.p083b.p087c;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.p109a.p112c.C1247am;
import org.bouncycastle.p107d.p108a.p113b.C1374c;
import org.bouncycastle.p107d.p108a.p113b.C1375d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.b.c.c */
/* JADX INFO: loaded from: classes.dex */
final class C0860c extends AbstractC0508ae {
    C0860c() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        C1375d c1375d = new C1375d(new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16), new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16), new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), 272);
        C1247am c1247am = new C1247am();
        AbstractC1381d abstractC1381dM3376a = c1247am.m3363b().m3375a(new C1374c(c1247am, c1375d)).m3376a();
        return new C0507ad(abstractC1381dM3376a, new C0509af(abstractC1381dM3376a, C1541f.m4106a("0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8")), abstractC1381dM3376a.m3368i(), abstractC1381dM3376a.m3369j(), (byte[]) null);
    }
}
