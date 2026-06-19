package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0549al;
import org.bouncycastle.p054a.C0553ap;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0665e extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    AbstractC0723v f2592a;

    public C0665e(C0653p c0653p, C0759a c0759a, InterfaceC0618f interfaceC0618f) {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(c0653p);
        c0625g.m1521a(c0759a.mo1358i());
        c0625g.m1521a(new C0553ap(false, 0, interfaceC0618f));
        this.f2592a = new C0549al(c0625g);
    }

    private C0665e(AbstractC0723v abstractC0723v) {
        if (((C0640m) abstractC0723v.mo1482a(0)).m1564b().intValue() != 0) {
            throw new IllegalArgumentException("sequence not version 0");
        }
        this.f2592a = AbstractC0723v.m1708a(abstractC0723v.mo1482a(1));
    }

    /* JADX INFO: renamed from: a */
    public static C0665e m1622a(Object obj) {
        if (obj instanceof C0665e) {
            return (C0665e) obj;
        }
        if (obj != null) {
            return new C0665e(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1623a() {
        return C0759a.m1781a(this.f2592a.mo1482a(1));
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0655q m1624b() {
        if (this.f2592a.mo1484d() == 3) {
            return AbstractC0655q.m1597a(AbstractC0539ab.m1394a(this.f2592a.mo1482a(2)), false);
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(0L));
        c0625g.m1521a(this.f2592a);
        return new C0549al(c0625g);
    }
}
