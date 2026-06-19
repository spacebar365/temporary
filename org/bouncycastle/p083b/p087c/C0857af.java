package org.bouncycastle.p083b.p087c;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.p109a.p112c.C1237ac;
import org.bouncycastle.p107d.p108a.p113b.C1374c;
import org.bouncycastle.p107d.p108a.p113b.C1375d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.b.c.af */
/* JADX INFO: loaded from: classes.dex */
final class C0857af extends AbstractC0508ae {
    C0857af() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        C1375d c1375d = new C1375d(new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16), new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16), new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240);
        C1237ac c1237ac = new C1237ac();
        AbstractC1381d abstractC1381dM3376a = c1237ac.m3363b().m3375a(new C1374c(c1237ac, c1375d)).m3376a();
        return new C0507ad(abstractC1381dM3376a, new C0509af(abstractC1381dM3376a, C1541f.m4106a("04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5")), abstractC1381dM3376a.m3368i(), abstractC1381dM3376a.m3369j(), (byte[]) null);
    }
}
