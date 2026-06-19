package org.bouncycastle.p054a.p078w;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.w.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0741a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private int f2955a;

    /* JADX INFO: renamed from: b */
    private int f2956b;

    /* JADX INFO: renamed from: c */
    private int f2957c;

    /* JADX INFO: renamed from: d */
    private int f2958d;

    private C0741a(AbstractC0723v abstractC0723v) {
        this.f2955a = C0640m.m1561a(abstractC0723v.mo1482a(0)).m1565c().intValue();
        if (abstractC0723v.mo1482a(1) instanceof C0640m) {
            this.f2956b = ((C0640m) abstractC0723v.mo1482a(1)).m1565c().intValue();
        } else {
            if (!(abstractC0723v.mo1482a(1) instanceof AbstractC0723v)) {
                throw new IllegalArgumentException("object parse error");
            }
            AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(abstractC0723v.mo1482a(1));
            this.f2956b = C0640m.m1561a(abstractC0723vM1708a.mo1482a(0)).m1565c().intValue();
            this.f2957c = C0640m.m1561a(abstractC0723vM1708a.mo1482a(1)).m1565c().intValue();
            this.f2958d = C0640m.m1561a(abstractC0723vM1708a.mo1482a(2)).m1565c().intValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0741a m1718a(Object obj) {
        if (obj instanceof C0741a) {
            return (C0741a) obj;
        }
        if (obj != null) {
            return new C0741a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m1719a() {
        return this.f2955a;
    }

    /* JADX INFO: renamed from: b */
    public final int m1720b() {
        return this.f2956b;
    }

    /* JADX INFO: renamed from: c */
    public final int m1721c() {
        return this.f2957c;
    }

    /* JADX INFO: renamed from: d */
    public final int m1722d() {
        return this.f2958d;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f2955a));
        if (this.f2957c == 0) {
            c0625g.m1521a(new C0640m(this.f2956b));
        } else {
            C0625g c0625g2 = new C0625g();
            c0625g2.m1521a(new C0640m(this.f2956b));
            c0625g2.m1521a(new C0640m(this.f2957c));
            c0625g2.m1521a(new C0640m(this.f2958d));
            c0625g.m1521a(new C0585bi(c0625g2));
        }
        return new C0585bi(c0625g);
    }
}
