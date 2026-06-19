package org.bouncycastle.p054a.p082z;

import java.io.IOException;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0613d;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.z.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0772m extends AbstractC0650o {

    /* JADX INFO: renamed from: G */
    private C0653p f3199G;

    /* JADX INFO: renamed from: H */
    private boolean f3200H;

    /* JADX INFO: renamed from: I */
    private AbstractC0655q f3201I;

    /* JADX INFO: renamed from: a */
    public static final C0653p f3173a = new C0653p("2.5.29.9").m1595c();

    /* JADX INFO: renamed from: b */
    public static final C0653p f3174b = new C0653p("2.5.29.14").m1595c();

    /* JADX INFO: renamed from: c */
    public static final C0653p f3175c = new C0653p("2.5.29.15").m1595c();

    /* JADX INFO: renamed from: d */
    public static final C0653p f3176d = new C0653p("2.5.29.16").m1595c();

    /* JADX INFO: renamed from: e */
    public static final C0653p f3177e = new C0653p("2.5.29.17").m1595c();

    /* JADX INFO: renamed from: f */
    public static final C0653p f3178f = new C0653p("2.5.29.18").m1595c();

    /* JADX INFO: renamed from: g */
    public static final C0653p f3179g = new C0653p("2.5.29.19").m1595c();

    /* JADX INFO: renamed from: h */
    public static final C0653p f3180h = new C0653p("2.5.29.20").m1595c();

    /* JADX INFO: renamed from: i */
    public static final C0653p f3181i = new C0653p("2.5.29.21").m1595c();

    /* JADX INFO: renamed from: j */
    public static final C0653p f3182j = new C0653p("2.5.29.23").m1595c();

    /* JADX INFO: renamed from: k */
    public static final C0653p f3183k = new C0653p("2.5.29.24").m1595c();

    /* JADX INFO: renamed from: l */
    public static final C0653p f3184l = new C0653p("2.5.29.27").m1595c();

    /* JADX INFO: renamed from: m */
    public static final C0653p f3185m = new C0653p("2.5.29.28").m1595c();

    /* JADX INFO: renamed from: n */
    public static final C0653p f3186n = new C0653p("2.5.29.29").m1595c();

    /* JADX INFO: renamed from: o */
    public static final C0653p f3187o = new C0653p("2.5.29.30").m1595c();

    /* JADX INFO: renamed from: p */
    public static final C0653p f3188p = new C0653p("2.5.29.31").m1595c();

    /* JADX INFO: renamed from: q */
    public static final C0653p f3189q = new C0653p("2.5.29.32").m1595c();

    /* JADX INFO: renamed from: r */
    public static final C0653p f3190r = new C0653p("2.5.29.33").m1595c();

    /* JADX INFO: renamed from: s */
    public static final C0653p f3191s = new C0653p("2.5.29.35").m1595c();

    /* JADX INFO: renamed from: t */
    public static final C0653p f3192t = new C0653p("2.5.29.36").m1595c();

    /* JADX INFO: renamed from: u */
    public static final C0653p f3193u = new C0653p("2.5.29.37").m1595c();

    /* JADX INFO: renamed from: v */
    public static final C0653p f3194v = new C0653p("2.5.29.46").m1595c();

    /* JADX INFO: renamed from: w */
    public static final C0653p f3195w = new C0653p("2.5.29.54").m1595c();

    /* JADX INFO: renamed from: x */
    public static final C0653p f3196x = new C0653p("1.3.6.1.5.5.7.1.1").m1595c();

    /* JADX INFO: renamed from: y */
    public static final C0653p f3197y = new C0653p("1.3.6.1.5.5.7.1.11").m1595c();

    /* JADX INFO: renamed from: z */
    public static final C0653p f3198z = new C0653p("1.3.6.1.5.5.7.1.12").m1595c();

    /* JADX INFO: renamed from: A */
    public static final C0653p f3167A = new C0653p("1.3.6.1.5.5.7.1.2").m1595c();

    /* JADX INFO: renamed from: B */
    public static final C0653p f3168B = new C0653p("1.3.6.1.5.5.7.1.3").m1595c();

    /* JADX INFO: renamed from: C */
    public static final C0653p f3169C = new C0653p("1.3.6.1.5.5.7.1.4").m1595c();

    /* JADX INFO: renamed from: D */
    public static final C0653p f3170D = new C0653p("2.5.29.56").m1595c();

    /* JADX INFO: renamed from: E */
    public static final C0653p f3171E = new C0653p("2.5.29.55").m1595c();

    /* JADX INFO: renamed from: F */
    public static final C0653p f3172F = new C0653p("2.5.29.60").m1595c();

    private C0772m(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() == 2) {
            this.f3199G = C0653p.m1584a(abstractC0723v.mo1482a(0));
            this.f3200H = false;
            this.f3201I = AbstractC0655q.m1596a(abstractC0723v.mo1482a(1));
        } else {
            if (abstractC0723v.mo1484d() != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
            }
            this.f3199G = C0653p.m1584a(abstractC0723v.mo1482a(0));
            this.f3200H = C0613d.m1491a(abstractC0723v.mo1482a(1)).m1495b();
            this.f3201I = AbstractC0655q.m1596a(abstractC0723v.mo1482a(2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0772m m1823a(Object obj) {
        if (obj instanceof C0772m) {
            return (C0772m) obj;
        }
        if (obj != null) {
            return new C0772m(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1824a() {
        return this.f3199G;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1825b() {
        return this.f3200H;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0655q m1826c() {
        return this.f3201I;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0618f m1827d() {
        return m1822a(this);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3199G);
        if (this.f3200H) {
            c0625g.m1521a(C0613d.m1493a(true));
        }
        c0625g.m1521a(this.f3201I);
        return new C0585bi(c0625g);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return this.f3200H ? this.f3201I.hashCode() ^ this.f3199G.hashCode() : (this.f3201I.hashCode() ^ this.f3199G.hashCode()) ^ (-1);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0772m)) {
            return false;
        }
        C0772m c0772m = (C0772m) obj;
        return c0772m.f3199G.equals(this.f3199G) && c0772m.f3201I.equals(this.f3201I) && c0772m.f3200H == this.f3200H;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0686u m1822a(C0772m c0772m) {
        try {
            return AbstractC0686u.m1692b(c0772m.f3201I.mo1410c());
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: ".concat(String.valueOf(e)));
        }
    }
}
