package org.bouncycastle.p118e.p120b.p127f;

import java.io.IOException;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p118e.p119a.C1434h;
import org.bouncycastle.p118e.p119a.C1435i;
import org.bouncycastle.p118e.p119a.C1436j;
import org.bouncycastle.p118e.p119a.C1438l;
import org.bouncycastle.p118e.p119a.C1440n;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p122b.C1449b;
import org.bouncycastle.p118e.p120b.p123c.C1451b;
import org.bouncycastle.p118e.p120b.p126e.C1457c;
import org.bouncycastle.p118e.p120b.p128g.C1483t;
import org.bouncycastle.p118e.p120b.p128g.C1489z;

/* JADX INFO: renamed from: org.bouncycastle.e.b.f.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1461d {
    /* JADX INFO: renamed from: a */
    public static C0780u m3820a(C1075b c1075b) throws IOException {
        if (c1075b instanceof C1451b) {
            C1451b c1451b = (C1451b) c1075b;
            return new C0780u(C1462e.m3823a(c1451b.m3796b()), c1451b.m3797c());
        }
        if (c1075b instanceof C1457c) {
            C1457c c1457c = (C1457c) c1075b;
            return new C0780u(new C0759a(InterfaceC1431e.f5187r, new C1434h(C1462e.m3824a(c1457c.m3812b()))), c1457c.m3814c());
        }
        if (c1075b instanceof C1449b) {
            return new C0780u(new C0759a(InterfaceC1431e.f5191v), ((C1449b) c1075b).m3793b());
        }
        if (c1075b instanceof C1489z) {
            C1489z c1489z = (C1489z) c1075b;
            return new C0780u(new C0759a(InterfaceC1431e.f5192w, new C1435i(c1489z.m3989f().m3965d(), C1462e.m3826b(c1489z.m3920b()))), new C1440n(c1489z.m3988e(), c1489z.m3987d()));
        }
        if (!(c1075b instanceof C1483t)) {
            throw new IOException("key parameters not recognized");
        }
        C1483t c1483t = (C1483t) c1075b;
        return new C0780u(new C0759a(InterfaceC1431e.f5147F, new C1436j(c1483t.m3948f().m3922a(), c1483t.m3948f().m3923b(), C1462e.m3826b(c1483t.m3921b()))), new C1438l(c1483t.m3947e(), c1483t.m3946d()));
    }
}
