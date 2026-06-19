package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0506ac extends AbstractC0650o implements InterfaceC0513aj {

    /* JADX INFO: renamed from: ap */
    private AbstractC1381d f1883ap;

    /* JADX INFO: renamed from: aq */
    private byte[] f1884aq;

    /* JADX INFO: renamed from: ar */
    private C0653p f1885ar;

    public C0506ac(C0511ah c0511ah, BigInteger bigInteger, BigInteger bigInteger2, AbstractC0723v abstractC0723v) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.f1885ar = null;
        this.f1885ar = c0511ah.m1374a();
        if (this.f1885ar.equals(f1944c)) {
            this.f1883ap = new AbstractC1381d.e(((C0640m) c0511ah.m1375b()).m1564b(), new BigInteger(1, AbstractC0655q.m1596a(abstractC0723v.mo1482a(0)).mo1410c()), new BigInteger(1, AbstractC0655q.m1596a(abstractC0723v.mo1482a(1)).mo1410c()), bigInteger, bigInteger2);
        } else {
            if (!this.f1885ar.equals(f1945d)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a((Object) c0511ah.m1375b());
            int iIntValue4 = ((C0640m) abstractC0723vM1708a.mo1482a(0)).m1564b().intValue();
            C0653p c0653p = (C0653p) abstractC0723vM1708a.mo1482a(1);
            if (c0653p.equals(f1947f)) {
                iIntValue = C0640m.m1561a(abstractC0723vM1708a.mo1482a(2)).m1564b().intValue();
                iIntValue3 = 0;
                iIntValue2 = 0;
            } else {
                if (!c0653p.equals(f1948g)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                AbstractC0723v abstractC0723vM1708a2 = AbstractC0723v.m1708a(abstractC0723vM1708a.mo1482a(2));
                iIntValue = C0640m.m1561a(abstractC0723vM1708a2.mo1482a(0)).m1564b().intValue();
                iIntValue2 = C0640m.m1561a(abstractC0723vM1708a2.mo1482a(1)).m1564b().intValue();
                iIntValue3 = C0640m.m1561a(abstractC0723vM1708a2.mo1482a(2)).m1564b().intValue();
            }
            this.f1883ap = new AbstractC1381d.d(iIntValue4, iIntValue, iIntValue2, iIntValue3, new BigInteger(1, AbstractC0655q.m1596a(abstractC0723v.mo1482a(0)).mo1410c()), new BigInteger(1, AbstractC0655q.m1596a(abstractC0723v.mo1482a(1)).mo1410c()), bigInteger, bigInteger2);
        }
        if (abstractC0723v.mo1484d() == 3) {
            this.f1884aq = C1535a.m4086b(((C0558au) abstractC0723v.mo1482a(2)).m1474d());
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1381d m1363a() {
        return this.f1883ap;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1364b() {
        return C1535a.m4086b(this.f1884aq);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f1885ar.equals(f1944c) || this.f1885ar.equals(f1945d)) {
            c0625g.m1521a(new C0510ag(this.f1883ap.m3366g()).mo1358i());
            c0625g.m1521a(new C0510ag(this.f1883ap.m3367h()).mo1358i());
        }
        if (this.f1884aq != null) {
            c0625g.m1521a(new C0558au(this.f1884aq));
        }
        return new C0585bi(c0625g);
    }

    public C0506ac(AbstractC1381d abstractC1381d, byte[] bArr) {
        this.f1885ar = null;
        this.f1883ap = abstractC1381d;
        this.f1884aq = C1535a.m4086b(bArr);
        if (C1371b.m3280b(this.f1883ap.m3365f())) {
            this.f1885ar = f1944c;
        } else {
            if (!C1371b.m3278a(this.f1883ap.m3365f())) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.f1885ar = f1945d;
        }
    }
}
