package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1434h extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0640m f5210a;

    /* JADX INFO: renamed from: b */
    private final C0759a f5211b;

    private C1434h(AbstractC0723v abstractC0723v) {
        this.f5210a = C0640m.m1561a(abstractC0723v.mo1482a(0));
        this.f5211b = C0759a.m1781a(abstractC0723v.mo1482a(1));
    }

    public C1434h(C0759a c0759a) {
        this.f5210a = new C0640m(0L);
        this.f5211b = c0759a;
    }

    /* JADX INFO: renamed from: a */
    public static final C1434h m3753a(Object obj) {
        if (obj instanceof C1434h) {
            return (C1434h) obj;
        }
        if (obj != null) {
            return new C1434h(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m3754a() {
        return this.f5211b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f5210a);
        c0625g.m1521a(this.f5211b);
        return new C0585bi(c0625g);
    }
}
