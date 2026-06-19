package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1436j extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0640m f5215a;

    /* JADX INFO: renamed from: b */
    private final int f5216b;

    /* JADX INFO: renamed from: c */
    private final int f5217c;

    /* JADX INFO: renamed from: d */
    private final C0759a f5218d;

    public C1436j(int i, int i2, C0759a c0759a) {
        this.f5215a = new C0640m(0L);
        this.f5216b = i;
        this.f5217c = i2;
        this.f5218d = c0759a;
    }

    private C1436j(AbstractC0723v abstractC0723v) {
        this.f5215a = C0640m.m1561a(abstractC0723v.mo1482a(0));
        this.f5216b = C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b().intValue();
        this.f5217c = C0640m.m1561a(abstractC0723v.mo1482a(2)).m1564b().intValue();
        this.f5218d = C0759a.m1781a(abstractC0723v.mo1482a(3));
    }

    /* JADX INFO: renamed from: a */
    public static C1436j m3758a(Object obj) {
        if (obj instanceof C1436j) {
            return (C1436j) obj;
        }
        if (obj != null) {
            return new C1436j(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3759a() {
        return this.f5216b;
    }

    /* JADX INFO: renamed from: b */
    public final int m3760b() {
        return this.f5217c;
    }

    /* JADX INFO: renamed from: c */
    public final C0759a m3761c() {
        return this.f5218d;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f5215a);
        c0625g.m1521a(new C0640m(this.f5216b));
        c0625g.m1521a(new C0640m(this.f5217c));
        c0625g.m1521a(this.f5218d);
        return new C0585bi(c0625g);
    }
}
