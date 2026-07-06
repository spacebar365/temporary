package org.bouncycastle.a.z;

import java.io.IOException;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class m extends org.bouncycastle.a.o {
    private org.bouncycastle.a.p G;
    private boolean H;
    private org.bouncycastle.a.q I;
    public static final org.bouncycastle.a.p a = new org.bouncycastle.a.p("2.5.29.9").c();
    public static final org.bouncycastle.a.p b = new org.bouncycastle.a.p("2.5.29.14").c();
    public static final org.bouncycastle.a.p c = new org.bouncycastle.a.p("2.5.29.15").c();
    public static final org.bouncycastle.a.p d = new org.bouncycastle.a.p("2.5.29.16").c();
    public static final org.bouncycastle.a.p e = new org.bouncycastle.a.p("2.5.29.17").c();
    public static final org.bouncycastle.a.p f = new org.bouncycastle.a.p("2.5.29.18").c();
    public static final org.bouncycastle.a.p g = new org.bouncycastle.a.p("2.5.29.19").c();
    public static final org.bouncycastle.a.p h = new org.bouncycastle.a.p("2.5.29.20").c();
    public static final org.bouncycastle.a.p i = new org.bouncycastle.a.p("2.5.29.21").c();
    public static final org.bouncycastle.a.p j = new org.bouncycastle.a.p("2.5.29.23").c();
    public static final org.bouncycastle.a.p k = new org.bouncycastle.a.p("2.5.29.24").c();
    public static final org.bouncycastle.a.p l = new org.bouncycastle.a.p("2.5.29.27").c();
    public static final org.bouncycastle.a.p m = new org.bouncycastle.a.p("2.5.29.28").c();
    public static final org.bouncycastle.a.p n = new org.bouncycastle.a.p("2.5.29.29").c();
    public static final org.bouncycastle.a.p o = new org.bouncycastle.a.p("2.5.29.30").c();
    public static final org.bouncycastle.a.p p = new org.bouncycastle.a.p("2.5.29.31").c();
    public static final org.bouncycastle.a.p q = new org.bouncycastle.a.p("2.5.29.32").c();
    public static final org.bouncycastle.a.p r = new org.bouncycastle.a.p("2.5.29.33").c();
    public static final org.bouncycastle.a.p s = new org.bouncycastle.a.p("2.5.29.35").c();
    public static final org.bouncycastle.a.p t = new org.bouncycastle.a.p("2.5.29.36").c();
    public static final org.bouncycastle.a.p u = new org.bouncycastle.a.p("2.5.29.37").c();
    public static final org.bouncycastle.a.p v = new org.bouncycastle.a.p("2.5.29.46").c();
    public static final org.bouncycastle.a.p w = new org.bouncycastle.a.p("2.5.29.54").c();
    public static final org.bouncycastle.a.p x = new org.bouncycastle.a.p("1.3.6.1.5.5.7.1.1").c();
    public static final org.bouncycastle.a.p y = new org.bouncycastle.a.p("1.3.6.1.5.5.7.1.11").c();
    public static final org.bouncycastle.a.p z = new org.bouncycastle.a.p("1.3.6.1.5.5.7.1.12").c();
    public static final org.bouncycastle.a.p A = new org.bouncycastle.a.p("1.3.6.1.5.5.7.1.2").c();
    public static final org.bouncycastle.a.p B = new org.bouncycastle.a.p("1.3.6.1.5.5.7.1.3").c();
    public static final org.bouncycastle.a.p C = new org.bouncycastle.a.p("1.3.6.1.5.5.7.1.4").c();
    public static final org.bouncycastle.a.p D = new org.bouncycastle.a.p("2.5.29.56").c();
    public static final org.bouncycastle.a.p E = new org.bouncycastle.a.p("2.5.29.55").c();
    public static final org.bouncycastle.a.p F = new org.bouncycastle.a.p("2.5.29.60").c();

    private m(org.bouncycastle.a.v vVar) {
        if (vVar.d() == 2) {
            this.G = org.bouncycastle.a.p.a(vVar.a(0));
            this.H = false;
            this.I = org.bouncycastle.a.q.a(vVar.a(1));
        } else {
            if (vVar.d() != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
            }
            this.G = org.bouncycastle.a.p.a(vVar.a(0));
            this.H = org.bouncycastle.a.d.a(vVar.a(1)).b();
            this.I = org.bouncycastle.a.q.a(vVar.a(2));
        }
    }

    public static m a(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.p a() {
        return this.G;
    }

    public final boolean b() {
        return this.H;
    }

    public final org.bouncycastle.a.q c() {
        return this.I;
    }

    public final org.bouncycastle.a.f d() {
        return a(this);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.G);
        if (this.H) {
            gVar.a(org.bouncycastle.a.d.a(true));
        }
        gVar.a(this.I);
        return new bi(gVar);
    }

    @Override // org.bouncycastle.a.o
    public final int hashCode() {
        return this.H ? this.I.hashCode() ^ this.G.hashCode() : (this.I.hashCode() ^ this.G.hashCode()) ^ (-1);
    }

    @Override // org.bouncycastle.a.o
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.G.equals(this.G) && mVar.I.equals(this.I) && mVar.H == this.H;
    }

    private static org.bouncycastle.a.u a(m mVar) {
        try {
            return org.bouncycastle.a.u.b(mVar.I.c());
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: ".concat(String.valueOf(e2)));
        }
    }
}
