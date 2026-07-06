package org.bouncycastle.a.v;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static ae a = new b();
    static ae b = new h();
    static ae c = new i();
    static ae d = new j();
    static ae e = new k();
    static ae f = new l();
    static ae g = new m();
    static ae h = new n();
    static ae i = new o();
    static ae j = new c();
    static ae k = new d();
    static ae l = new e();
    static ae m = new f();
    static ae n = new g();
    static final Hashtable o = new Hashtable();
    static final Hashtable p = new Hashtable();
    static final Hashtable q = new Hashtable();

    static {
        a("brainpoolP160r1", p.o, a);
        a("brainpoolP160t1", p.p, b);
        a("brainpoolP192r1", p.q, c);
        a("brainpoolP192t1", p.r, d);
        a("brainpoolP224r1", p.s, e);
        a("brainpoolP224t1", p.t, f);
        a("brainpoolP256r1", p.u, g);
        a("brainpoolP256t1", p.v, h);
        a("brainpoolP320r1", p.w, i);
        a("brainpoolP320t1", p.x, j);
        a("brainpoolP384r1", p.y, k);
        a("brainpoolP384t1", p.z, l);
        a("brainpoolP512r1", p.A, m);
        a("brainpoolP512t1", p.B, n);
    }

    public static Enumeration a() {
        return q.elements();
    }

    public static ad a(String str) {
        org.bouncycastle.a.p pVar = (org.bouncycastle.a.p) o.get(org.bouncycastle.f.k.c(str));
        if (pVar != null) {
            return a(pVar);
        }
        return null;
    }

    public static ad a(org.bouncycastle.a.p pVar) {
        ae aeVar = (ae) p.get(pVar);
        if (aeVar != null) {
            return aeVar.b();
        }
        return null;
    }

    static /* synthetic */ org.bouncycastle.d.a.d a(org.bouncycastle.d.a.d dVar) {
        return dVar;
    }

    private static void a(String str, org.bouncycastle.a.p pVar, ae aeVar) {
        o.put(org.bouncycastle.f.k.c(str), pVar);
        q.put(pVar, str);
        p.put(pVar, aeVar);
    }

    public static String b(org.bouncycastle.a.p pVar) {
        return (String) q.get(pVar);
    }

    public static org.bouncycastle.a.p b(String str) {
        return (org.bouncycastle.a.p) o.get(org.bouncycastle.f.k.c(str));
    }
}
