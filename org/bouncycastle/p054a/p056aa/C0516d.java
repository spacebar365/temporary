package org.bouncycastle.p054a.p056aa;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0516d {

    /* JADX INFO: renamed from: a */
    static AbstractC0508ae f1970a = new C0517e();

    /* JADX INFO: renamed from: b */
    static AbstractC0508ae f1971b = new C0528p();

    /* JADX INFO: renamed from: c */
    static AbstractC0508ae f1972c = new C0533u();

    /* JADX INFO: renamed from: d */
    static AbstractC0508ae f1973d = new C0534v();

    /* JADX INFO: renamed from: e */
    static AbstractC0508ae f1974e = new C0535w();

    /* JADX INFO: renamed from: f */
    static AbstractC0508ae f1975f = new C0536x();

    /* JADX INFO: renamed from: g */
    static AbstractC0508ae f1976g = new C0537y();

    /* JADX INFO: renamed from: h */
    static AbstractC0508ae f1977h = new C0538z();

    /* JADX INFO: renamed from: i */
    static AbstractC0508ae f1978i = new C0504aa();

    /* JADX INFO: renamed from: j */
    static AbstractC0508ae f1979j = new C0518f();

    /* JADX INFO: renamed from: k */
    static AbstractC0508ae f1980k = new C0519g();

    /* JADX INFO: renamed from: l */
    static AbstractC0508ae f1981l = new C0520h();

    /* JADX INFO: renamed from: m */
    static AbstractC0508ae f1982m = new C0521i();

    /* JADX INFO: renamed from: n */
    static AbstractC0508ae f1983n = new C0522j();

    /* JADX INFO: renamed from: o */
    static AbstractC0508ae f1984o = new C0523k();

    /* JADX INFO: renamed from: p */
    static AbstractC0508ae f1985p = new C0524l();

    /* JADX INFO: renamed from: q */
    static AbstractC0508ae f1986q = new C0525m();

    /* JADX INFO: renamed from: r */
    static AbstractC0508ae f1987r = new C0526n();

    /* JADX INFO: renamed from: s */
    static AbstractC0508ae f1988s = new C0527o();

    /* JADX INFO: renamed from: t */
    static AbstractC0508ae f1989t = new C0529q();

    /* JADX INFO: renamed from: u */
    static AbstractC0508ae f1990u = new C0530r();

    /* JADX INFO: renamed from: v */
    static AbstractC0508ae f1991v = new C0531s();

    /* JADX INFO: renamed from: w */
    static AbstractC0508ae f1992w = new C0532t();

    /* JADX INFO: renamed from: x */
    static final Hashtable f1993x = new Hashtable();

    /* JADX INFO: renamed from: y */
    static final Hashtable f1994y = new Hashtable();

    /* JADX INFO: renamed from: z */
    static final Hashtable f1995z = new Hashtable();

    static {
        m1391a("prime192v1", InterfaceC0513aj.f1914N, f1970a);
        m1391a("prime192v2", InterfaceC0513aj.f1915O, f1971b);
        m1391a("prime192v3", InterfaceC0513aj.f1916P, f1972c);
        m1391a("prime239v1", InterfaceC0513aj.f1917Q, f1973d);
        m1391a("prime239v2", InterfaceC0513aj.f1918R, f1974e);
        m1391a("prime239v3", InterfaceC0513aj.f1919S, f1975f);
        m1391a("prime256v1", InterfaceC0513aj.f1920T, f1976g);
        m1391a("c2pnb163v1", InterfaceC0513aj.f1960s, f1977h);
        m1391a("c2pnb163v2", InterfaceC0513aj.f1961t, f1978i);
        m1391a("c2pnb163v3", InterfaceC0513aj.f1962u, f1979j);
        m1391a("c2pnb176w1", InterfaceC0513aj.f1963v, f1980k);
        m1391a("c2tnb191v1", InterfaceC0513aj.f1964w, f1981l);
        m1391a("c2tnb191v2", InterfaceC0513aj.f1965x, f1982m);
        m1391a("c2tnb191v3", InterfaceC0513aj.f1966y, f1983n);
        m1391a("c2pnb208w1", InterfaceC0513aj.f1902B, f1984o);
        m1391a("c2tnb239v1", InterfaceC0513aj.f1903C, f1985p);
        m1391a("c2tnb239v2", InterfaceC0513aj.f1904D, f1986q);
        m1391a("c2tnb239v3", InterfaceC0513aj.f1905E, f1987r);
        m1391a("c2pnb272w1", InterfaceC0513aj.f1908H, f1988s);
        m1391a("c2pnb304w1", InterfaceC0513aj.f1909I, f1989t);
        m1391a("c2tnb359v1", InterfaceC0513aj.f1910J, f1990u);
        m1391a("c2pnb368w1", InterfaceC0513aj.f1911K, f1991v);
        m1391a("c2tnb431r1", InterfaceC0513aj.f1912L, f1992w);
    }

    /* JADX INFO: renamed from: a */
    public static Enumeration m1388a() {
        return f1993x.keys();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1389a(String str) {
        C0653p c0653p = (C0653p) f1993x.get(C1560k.m4166c(str));
        if (c0653p != null) {
            return m1390a(c0653p);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1390a(C0653p c0653p) {
        AbstractC0508ae abstractC0508ae = (AbstractC0508ae) f1994y.get(c0653p);
        if (abstractC0508ae != null) {
            return abstractC0508ae.m1371b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m1391a(String str, C0653p c0653p, AbstractC0508ae abstractC0508ae) {
        f1993x.put(str, c0653p);
        f1995z.put(c0653p, str);
        f1994y.put(c0653p, abstractC0508ae);
    }

    /* JADX INFO: renamed from: b */
    public static String m1392b(C0653p c0653p) {
        return (String) f1995z.get(c0653p);
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1393b(String str) {
        return (C0653p) f1993x.get(C1560k.m4166c(str));
    }
}
