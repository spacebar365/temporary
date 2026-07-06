package org.bouncycastle.a.aa;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    static ae a = new e();
    static ae b = new p();
    static ae c = new u();
    static ae d = new v();
    static ae e = new w();
    static ae f = new x();
    static ae g = new y();
    static ae h = new z();
    static ae i = new aa();
    static ae j = new f();
    static ae k = new g();
    static ae l = new h();
    static ae m = new i();
    static ae n = new j();
    static ae o = new k();
    static ae p = new l();
    static ae q = new m();
    static ae r = new n();
    static ae s = new o();
    static ae t = new q();
    static ae u = new r();
    static ae v = new s();
    static ae w = new t();
    static final Hashtable x = new Hashtable();
    static final Hashtable y = new Hashtable();
    static final Hashtable z = new Hashtable();

    static {
        a("prime192v1", aj.N, a);
        a("prime192v2", aj.O, b);
        a("prime192v3", aj.P, c);
        a("prime239v1", aj.Q, d);
        a("prime239v2", aj.R, e);
        a("prime239v3", aj.S, f);
        a("prime256v1", aj.T, g);
        a("c2pnb163v1", aj.s, h);
        a("c2pnb163v2", aj.t, i);
        a("c2pnb163v3", aj.u, j);
        a("c2pnb176w1", aj.v, k);
        a("c2tnb191v1", aj.w, l);
        a("c2tnb191v2", aj.x, m);
        a("c2tnb191v3", aj.y, n);
        a("c2pnb208w1", aj.B, o);
        a("c2tnb239v1", aj.C, p);
        a("c2tnb239v2", aj.D, q);
        a("c2tnb239v3", aj.E, r);
        a("c2pnb272w1", aj.H, s);
        a("c2pnb304w1", aj.I, t);
        a("c2tnb359v1", aj.J, u);
        a("c2pnb368w1", aj.K, v);
        a("c2tnb431r1", aj.L, w);
    }

    public static Enumeration a() {
        return x.keys();
    }

    public static ad a(String str) {
        org.bouncycastle.a.p pVar = (org.bouncycastle.a.p) x.get(org.bouncycastle.f.k.c(str));
        if (pVar != null) {
            return a(pVar);
        }
        return null;
    }

    public static ad a(org.bouncycastle.a.p pVar) {
        ae aeVar = (ae) y.get(pVar);
        if (aeVar != null) {
            return aeVar.b();
        }
        return null;
    }

    private static void a(String str, org.bouncycastle.a.p pVar, ae aeVar) {
        x.put(str, pVar);
        z.put(pVar, str);
        y.put(pVar, aeVar);
    }

    public static String b(org.bouncycastle.a.p pVar) {
        return (String) z.get(pVar);
    }

    public static org.bouncycastle.a.p b(String str) {
        return (org.bouncycastle.a.p) x.get(org.bouncycastle.f.k.c(str));
    }
}
