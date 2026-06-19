package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0511ah extends AbstractC0650o implements InterfaceC0513aj {

    /* JADX INFO: renamed from: ap */
    private C0653p f1899ap;

    /* JADX INFO: renamed from: aq */
    private AbstractC0686u f1900aq;

    public C0511ah(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public C0511ah(int i, int i2, int i3, int i4) {
        this.f1899ap = f1945d;
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            c0625g.m1521a(f1947f);
            c0625g.m1521a(new C0640m(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            c0625g.m1521a(f1948g);
            C0625g c0625g2 = new C0625g();
            c0625g2.m1521a(new C0640m(i2));
            c0625g2.m1521a(new C0640m(i3));
            c0625g2.m1521a(new C0640m(i4));
            c0625g.m1521a(new C0585bi(c0625g2));
        }
        this.f1900aq = new C0585bi(c0625g);
    }

    public C0511ah(BigInteger bigInteger) {
        this.f1899ap = f1944c;
        this.f1900aq = new C0640m(bigInteger);
    }

    private C0511ah(AbstractC0723v abstractC0723v) {
        this.f1899ap = C0653p.m1584a(abstractC0723v.mo1482a(0));
        this.f1900aq = abstractC0723v.mo1482a(1).mo1358i();
    }

    /* JADX INFO: renamed from: a */
    public static C0511ah m1373a(Object obj) {
        if (obj instanceof C0511ah) {
            return (C0511ah) obj;
        }
        if (obj != null) {
            return new C0511ah(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1374a() {
        return this.f1899ap;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0686u m1375b() {
        return this.f1900aq;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f1899ap);
        c0625g.m1521a(this.f1900aq);
        return new C0585bi(c0625g);
    }
}
