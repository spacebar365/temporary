package org.bouncycastle.p054a.p057b;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0563az;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0591bo;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0636k;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0572h extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final BigInteger f2094a;

    /* JADX INFO: renamed from: b */
    private final C0759a f2095b;

    /* JADX INFO: renamed from: c */
    private final C0636k f2096c;

    /* JADX INFO: renamed from: d */
    private final C0636k f2097d;

    /* JADX INFO: renamed from: e */
    private final C0570f f2098e;

    /* JADX INFO: renamed from: f */
    private final String f2099f;

    private C0572h(AbstractC0723v abstractC0723v) {
        this.f2094a = C0640m.m1561a(abstractC0723v.mo1482a(0)).m1564b();
        this.f2095b = C0759a.m1781a(abstractC0723v.mo1482a(1));
        this.f2096c = C0636k.m1542a(abstractC0723v.mo1482a(2));
        this.f2097d = C0636k.m1542a(abstractC0723v.mo1482a(3));
        this.f2098e = C0570f.m1434a(abstractC0723v.mo1482a(4));
        this.f2099f = abstractC0723v.mo1484d() == 6 ? C0591bo.m1464a(abstractC0723v.mo1482a(5)).mo1350b() : null;
    }

    public C0572h(C0759a c0759a, Date date, Date date2, C0570f c0570f) {
        this.f2094a = BigInteger.valueOf(1L);
        this.f2095b = c0759a;
        this.f2096c = new C0563az(date);
        this.f2097d = new C0563az(date2);
        this.f2098e = c0570f;
        this.f2099f = null;
    }

    /* JADX INFO: renamed from: a */
    public static C0572h m1438a(Object obj) {
        if (obj instanceof C0572h) {
            return (C0572h) obj;
        }
        if (obj != null) {
            return new C0572h(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0636k m1439a() {
        return this.f2096c;
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m1440b() {
        return this.f2095b;
    }

    /* JADX INFO: renamed from: c */
    public final C0636k m1441c() {
        return this.f2097d;
    }

    /* JADX INFO: renamed from: d */
    public final C0570f m1442d() {
        return this.f2098e;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f2094a));
        c0625g.m1521a(this.f2095b);
        c0625g.m1521a(this.f2096c);
        c0625g.m1521a(this.f2097d);
        c0625g.m1521a(this.f2098e);
        if (this.f2099f != null) {
            c0625g.m1521a(new C0591bo(this.f2099f));
        }
        return new C0585bi(c0625g);
    }
}
