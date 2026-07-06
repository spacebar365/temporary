package org.bouncycastle.b.c;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.a.u.aj;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static org.bouncycastle.a.aa.ae a = new b();
    static org.bouncycastle.a.aa.ae b = new m();
    static org.bouncycastle.a.aa.ae c = new x();
    static org.bouncycastle.a.aa.ae d = new ab();
    static org.bouncycastle.a.aa.ae e = new ac();
    static org.bouncycastle.a.aa.ae f = new ad();
    static org.bouncycastle.a.aa.ae g = new ae();
    static org.bouncycastle.a.aa.ae h = new af();
    static org.bouncycastle.a.aa.ae i = new ag();
    static org.bouncycastle.a.aa.ae j = new c();
    static org.bouncycastle.a.aa.ae k = new d();
    static org.bouncycastle.a.aa.ae l = new e();
    static org.bouncycastle.a.aa.ae m = new f();
    static org.bouncycastle.a.aa.ae n = new g();
    static org.bouncycastle.a.aa.ae o = new h();
    static org.bouncycastle.a.aa.ae p = new i();
    static org.bouncycastle.a.aa.ae q = new j();
    static org.bouncycastle.a.aa.ae r = new k();
    static org.bouncycastle.a.aa.ae s = new l();
    static org.bouncycastle.a.aa.ae t = new n();
    static org.bouncycastle.a.aa.ae u = new o();
    static org.bouncycastle.a.aa.ae v = new p();
    static org.bouncycastle.a.aa.ae w = new q();
    static org.bouncycastle.a.aa.ae x = new r();
    static org.bouncycastle.a.aa.ae y = new s();
    static org.bouncycastle.a.aa.ae z = new t();
    static org.bouncycastle.a.aa.ae A = new u();
    static org.bouncycastle.a.aa.ae B = new v();
    static org.bouncycastle.a.aa.ae C = new w();
    static org.bouncycastle.a.aa.ae D = new y();
    static org.bouncycastle.a.aa.ae E = new z();
    static org.bouncycastle.a.aa.ae F = new aa();
    static final Hashtable G = new Hashtable();
    static final Hashtable H = new Hashtable();
    static final Hashtable I = new Hashtable();
    static final Hashtable J = new Hashtable();
    static final Vector K = new Vector();

    static {
        a("curve25519", org.bouncycastle.a.e.a.c, a);
        a("secp128r1", aj.u, b);
        a("secp160k1", aj.j, c);
        a("secp160r1", aj.i, d);
        a("secp160r2", aj.w, e);
        a("secp192k1", aj.x, f);
        a("secp192r1", aj.G, g);
        a("secp224k1", aj.y, h);
        a("secp224r1", aj.z, i);
        a("secp256k1", aj.k, j);
        a("secp256r1", aj.H, k);
        a("secp384r1", aj.A, l);
        a("secp521r1", aj.B, m);
        a("sect113r1", aj.e, n);
        a("sect113r2", aj.f, o);
        a("sect131r1", aj.o, p);
        a("sect131r2", aj.p, q);
        a("sect163k1", aj.b, r);
        a("sect163r1", aj.c, s);
        a("sect163r2", aj.l, t);
        a("sect193r1", aj.q, u);
        a("sect193r2", aj.r, v);
        a("sect233k1", aj.s, w);
        a("sect233r1", aj.t, x);
        a("sect239k1", aj.d, y);
        a("sect283k1", aj.m, z);
        a("sect283r1", aj.n, A);
        a("sect409k1", aj.C, B);
        a("sect409r1", aj.D, C);
        a("sect571k1", aj.E, D);
        a("sect571r1", aj.F, E);
        a("sm2p256v1", org.bouncycastle.a.i.d.F, F);
        a("B-163", aj.l);
        a("B-233", aj.t);
        a("B-283", aj.n);
        a("B-409", aj.D);
        a("B-571", aj.F);
        a("K-163", aj.b);
        a("K-233", aj.s);
        a("K-283", aj.m);
        a("K-409", aj.C);
        a("K-571", aj.E);
        a("P-192", aj.G);
        a("P-224", aj.z);
        a("P-256", aj.H);
        a("P-384", aj.A);
        a("P-521", aj.B);
    }

    public static Enumeration a() {
        return K.elements();
    }

    public static org.bouncycastle.a.aa.ad a(String str) {
        org.bouncycastle.a.aa.ae aeVar = (org.bouncycastle.a.aa.ae) G.get(org.bouncycastle.f.k.c(str));
        if (aeVar == null) {
            return null;
        }
        return aeVar.b();
    }

    public static org.bouncycastle.a.aa.ad a(org.bouncycastle.a.p pVar) {
        org.bouncycastle.a.aa.ae aeVar = (org.bouncycastle.a.aa.ae) I.get(pVar);
        if (aeVar == null) {
            return null;
        }
        return aeVar.b();
    }

    static /* synthetic */ org.bouncycastle.d.a.d a(org.bouncycastle.d.a.d dVar) {
        return dVar;
    }

    private static void a(String str, org.bouncycastle.a.p pVar) {
        Object obj = I.get(pVar);
        if (obj == null) {
            throw new IllegalStateException();
        }
        String strC = org.bouncycastle.f.k.c(str);
        H.put(strC, pVar);
        G.put(strC, obj);
    }

    private static void a(String str, org.bouncycastle.a.p pVar, org.bouncycastle.a.aa.ae aeVar) {
        K.addElement(str);
        J.put(pVar, str);
        I.put(pVar, aeVar);
        String strC = org.bouncycastle.f.k.c(str);
        H.put(strC, pVar);
        G.put(strC, aeVar);
    }

    public static String b(org.bouncycastle.a.p pVar) {
        return (String) J.get(pVar);
    }

    static /* synthetic */ org.bouncycastle.d.a.d a(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.b.d dVar2) {
        return dVar.b().a(new org.bouncycastle.d.a.b.c(dVar, dVar2)).a();
    }
}
