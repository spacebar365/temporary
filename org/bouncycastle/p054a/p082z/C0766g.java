package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p080y.C0756c;

/* JADX INFO: renamed from: org.bouncycastle.a.z.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0766g extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    AbstractC0723v f3148a;

    /* JADX INFO: renamed from: b */
    C0782w f3149b;

    /* JADX INFO: renamed from: c */
    C0759a f3150c;

    /* JADX INFO: renamed from: d */
    C0558au f3151d;

    private C0766g(AbstractC0723v abstractC0723v) {
        this.f3148a = abstractC0723v;
        if (abstractC0723v.mo1484d() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.f3149b = C0782w.m1854a(abstractC0723v.mo1482a(0));
        this.f3150c = C0759a.m1781a(abstractC0723v.mo1482a(1));
        this.f3151d = C0558au.m1414a(abstractC0723v.mo1482a(2));
    }

    /* JADX INFO: renamed from: a */
    public static C0766g m1793a(Object obj) {
        if (obj instanceof C0766g) {
            return (C0766g) obj;
        }
        if (obj != null) {
            return new C0766g(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0782w m1794a() {
        return this.f3149b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3148a;
    }

    /* JADX INFO: renamed from: j */
    public final C0759a m1802j() {
        return this.f3150c;
    }

    /* JADX INFO: renamed from: l */
    public final C0558au m1803l() {
        return this.f3151d;
    }

    /* JADX INFO: renamed from: b */
    public final int m1795b() {
        return this.f3149b.f3231b.m1564b().intValue() + 1;
    }

    /* JADX INFO: renamed from: c */
    public final C0640m m1796c() {
        return this.f3149b.f3232c;
    }

    /* JADX INFO: renamed from: d */
    public final C0756c m1797d() {
        return this.f3149b.f3234e;
    }

    /* JADX INFO: renamed from: e */
    public final C0783x m1798e() {
        return this.f3149b.f3235f;
    }

    /* JADX INFO: renamed from: f */
    public final C0783x m1799f() {
        return this.f3149b.f3236g;
    }

    /* JADX INFO: renamed from: g */
    public final C0756c m1800g() {
        return this.f3149b.f3237h;
    }

    /* JADX INFO: renamed from: h */
    public final C0780u m1801h() {
        return this.f3149b.f3238i;
    }
}
