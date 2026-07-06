package org.bouncycastle.a.u;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    static org.bouncycastle.a.aa.ae a = new c();
    static org.bouncycastle.a.aa.ae b = new n();
    static org.bouncycastle.a.aa.ae c = new y();
    static org.bouncycastle.a.aa.ae d = new ad();
    static org.bouncycastle.a.aa.ae e = new ae();
    static org.bouncycastle.a.aa.ae f = new af();
    static org.bouncycastle.a.aa.ae g = new ag();
    static org.bouncycastle.a.aa.ae h = new ah();
    static org.bouncycastle.a.aa.ae i = new ai();
    static org.bouncycastle.a.aa.ae j = new d();
    static org.bouncycastle.a.aa.ae k = new e();
    static org.bouncycastle.a.aa.ae l = new f();
    static org.bouncycastle.a.aa.ae m = new g();
    static org.bouncycastle.a.aa.ae n = new h();
    static org.bouncycastle.a.aa.ae o = new i();
    static org.bouncycastle.a.aa.ae p = new j();
    static org.bouncycastle.a.aa.ae q = new k();
    static org.bouncycastle.a.aa.ae r = new l();
    static org.bouncycastle.a.aa.ae s = new m();
    static org.bouncycastle.a.aa.ae t = new o();
    static org.bouncycastle.a.aa.ae u = new p();
    static org.bouncycastle.a.aa.ae v = new q();
    static org.bouncycastle.a.aa.ae w = new r();
    static org.bouncycastle.a.aa.ae x = new s();
    static org.bouncycastle.a.aa.ae y = new t();
    static org.bouncycastle.a.aa.ae z = new u();
    static org.bouncycastle.a.aa.ae A = new v();
    static org.bouncycastle.a.aa.ae B = new w();
    static org.bouncycastle.a.aa.ae C = new x();
    static org.bouncycastle.a.aa.ae D = new z();
    static org.bouncycastle.a.aa.ae E = new aa();
    static org.bouncycastle.a.aa.ae F = new ab();
    static org.bouncycastle.a.aa.ae G = new ac();
    static final Hashtable H = new Hashtable();
    static final Hashtable I = new Hashtable();
    static final Hashtable J = new Hashtable();

    static {
        a("secp112r1", aj.g, a);
        a("secp112r2", aj.h, b);
        a("secp128r1", aj.u, c);
        a("secp128r2", aj.v, d);
        a("secp160k1", aj.j, e);
        a("secp160r1", aj.i, f);
        a("secp160r2", aj.w, g);
        a("secp192k1", aj.x, h);
        a("secp192r1", aj.G, i);
        a("secp224k1", aj.y, j);
        a("secp224r1", aj.z, k);
        a("secp256k1", aj.k, l);
        a("secp256r1", aj.H, m);
        a("secp384r1", aj.A, n);
        a("secp521r1", aj.B, o);
        a("sect113r1", aj.e, p);
        a("sect113r2", aj.f, q);
        a("sect131r1", aj.o, r);
        a("sect131r2", aj.p, s);
        a("sect163k1", aj.b, t);
        a("sect163r1", aj.c, u);
        a("sect163r2", aj.l, v);
        a("sect193r1", aj.q, w);
        a("sect193r2", aj.r, x);
        a("sect233k1", aj.s, y);
        a("sect233r1", aj.t, z);
        a("sect239k1", aj.d, A);
        a("sect283k1", aj.m, B);
        a("sect283r1", aj.n, C);
        a("sect409k1", aj.C, D);
        a("sect409r1", aj.D, E);
        a("sect571k1", aj.E, F);
        a("sect571r1", aj.F, G);
    }

    public static Enumeration a() {
        return J.elements();
    }

    public static org.bouncycastle.a.aa.ad a(String str) {
        org.bouncycastle.a.p pVarB = b(str);
        if (pVarB == null) {
            return null;
        }
        return a(pVarB);
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

    private static void a(String str, org.bouncycastle.a.p pVar, org.bouncycastle.a.aa.ae aeVar) {
        H.put(str, pVar);
        J.put(pVar, str);
        I.put(pVar, aeVar);
    }

    public static String b(org.bouncycastle.a.p pVar) {
        return (String) J.get(pVar);
    }

    public static org.bouncycastle.a.p b(String str) {
        return (org.bouncycastle.a.p) H.get(org.bouncycastle.f.k.c(str));
    }

    static /* synthetic */ BigInteger c(String str) {
        return new BigInteger(1, org.bouncycastle.f.a.f.a(str));
    }

    static /* synthetic */ org.bouncycastle.d.a.d a(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.b.d dVar2) {
        return dVar.b().a(new org.bouncycastle.d.a.b.c(dVar, dVar2)).a();
    }
}
