package org.bouncycastle.p118e.p120b.p127f;

import java.io.IOException;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p057b.InterfaceC0565a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p118e.p119a.C1434h;
import org.bouncycastle.p118e.p119a.C1435i;
import org.bouncycastle.p118e.p119a.C1436j;
import org.bouncycastle.p118e.p119a.C1439m;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p122b.C1448a;
import org.bouncycastle.p118e.p120b.p123c.C1450a;
import org.bouncycastle.p118e.p120b.p126e.C1456b;
import org.bouncycastle.p118e.p120b.p128g.C1463a;
import org.bouncycastle.p118e.p120b.p128g.C1464aa;
import org.bouncycastle.p118e.p120b.p128g.C1465b;
import org.bouncycastle.p118e.p120b.p128g.C1481r;
import org.bouncycastle.p118e.p120b.p128g.C1482s;
import org.bouncycastle.p118e.p120b.p128g.C1487x;
import org.bouncycastle.p118e.p120b.p128g.C1488y;

/* JADX INFO: renamed from: org.bouncycastle.e.b.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1458a {
    /* JADX INFO: renamed from: a */
    public static C1075b m3815a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (c0653pM1783a.m1592a(InterfaceC0565a.f2045W)) {
            return new C1450a(C1462e.m3821a(c0676p.m1658b()), AbstractC0655q.m1596a(c0676p.m1659c()).mo1410c());
        }
        if (c0653pM1783a.equals(InterfaceC0565a.f2071s)) {
            return new C1456b(AbstractC0655q.m1596a(c0676p.m1659c()).mo1410c(), C1462e.m3822a(C1434h.m3753a(c0676p.m1658b().m1784b())));
        }
        if (c0653pM1783a.equals(InterfaceC0565a.f2053ad)) {
            return new C1448a(m3816a(AbstractC0655q.m1596a(c0676p.m1659c()).mo1410c()));
        }
        if (c0653pM1783a.equals(InterfaceC0565a.f2075w)) {
            C1435i c1435iM3755a = C1435i.m3755a(c0676p.m1658b().m1784b());
            C0653p c0653pM1783a2 = c1435iM3755a.m3757b().m1783a();
            C1439m c1439mM3762a = C1439m.m3762a(c0676p.m1659c());
            try {
                C1488y.a aVarM3985d = new C1488y.a(new C1487x(c1435iM3755a.m3756a(), C1462e.m3825a(c0653pM1783a2))).m3979a(c1439mM3762a.m3763a()).m3981a(c1439mM3762a.m3764b()).m3983b(c1439mM3762a.m3765c()).m3984c(c1439mM3762a.m3766d()).m3985d(c1439mM3762a.m3767e());
                if (c1439mM3762a.m3768f() != null) {
                    aVarM3985d.m3980a(((C1463a) C1464aa.m3836a(c1439mM3762a.m3768f(), C1463a.class)).m3831a(c0653pM1783a2));
                }
                return aVarM3985d.m3982a();
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
            }
        }
        if (!c0653pM1783a.equals(InterfaceC1431e.f5147F)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        C1436j c1436jM3758a = C1436j.m3758a(c0676p.m1658b().m1784b());
        C0653p c0653pM1783a3 = c1436jM3758a.m3761c().m1783a();
        try {
            C1439m c1439mM3762a2 = C1439m.m3762a(c0676p.m1659c());
            C1482s.a aVarM3944d = new C1482s.a(new C1481r(c1436jM3758a.m3759a(), c1436jM3758a.m3760b(), C1462e.m3825a(c0653pM1783a3))).m3938a(c1439mM3762a2.m3763a()).m3940a(c1439mM3762a2.m3764b()).m3942b(c1439mM3762a2.m3765c()).m3943c(c1439mM3762a2.m3766d()).m3944d(c1439mM3762a2.m3767e());
            if (c1439mM3762a2.m3768f() != null) {
                aVarM3944d.m3939a(((C1465b) C1464aa.m3836a(c1439mM3762a2.m3768f(), C1465b.class)).m3850a(c0653pM1783a3));
            }
            return aVarM3944d.m3941a();
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static short[] m3816a(byte[] bArr) {
        short[] sArr = new short[bArr.length / 2];
        for (int i = 0; i != sArr.length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
        }
        return sArr;
    }
}
