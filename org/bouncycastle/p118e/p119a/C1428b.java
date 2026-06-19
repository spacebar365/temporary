package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p118e.p140d.p141a.C1524a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1428b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final int f5128a;

    /* JADX INFO: renamed from: b */
    private final int f5129b;

    /* JADX INFO: renamed from: c */
    private final C1524a f5130c;

    /* JADX INFO: renamed from: d */
    private final C0759a f5131d;

    public C1428b(int i, int i2, C1524a c1524a, C0759a c0759a) {
        this.f5128a = i;
        this.f5129b = i2;
        this.f5130c = new C1524a(c1524a.m4023a());
        this.f5131d = c0759a;
    }

    private C1428b(AbstractC0723v abstractC0723v) {
        this.f5128a = ((C0640m) abstractC0723v.mo1482a(0)).m1564b().intValue();
        this.f5129b = ((C0640m) abstractC0723v.mo1482a(1)).m1564b().intValue();
        this.f5130c = new C1524a(((AbstractC0655q) abstractC0723v.mo1482a(2)).mo1410c());
        this.f5131d = C0759a.m1781a(abstractC0723v.mo1482a(3));
    }

    /* JADX INFO: renamed from: a */
    public static C1428b m3724a(Object obj) {
        if (obj != null) {
            return new C1428b(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3725a() {
        return this.f5128a;
    }

    /* JADX INFO: renamed from: b */
    public final int m3726b() {
        return this.f5129b;
    }

    /* JADX INFO: renamed from: c */
    public final C1524a m3727c() {
        return this.f5130c;
    }

    /* JADX INFO: renamed from: d */
    public final C0759a m3728d() {
        return this.f5131d;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f5128a));
        c0625g.m1521a(new C0640m(this.f5129b));
        c0625g.m1521a(new C0581be(this.f5130c.m4023a()));
        c0625g.m1521a(this.f5131d);
        return new C0585bi(c0625g);
    }
}
