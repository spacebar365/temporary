package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.a.p;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.b.b.m;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.b.t;
import org.bouncycastle.b.b.u;
import org.bouncycastle.b.b.v;
import org.bouncycastle.b.b.x;
import org.bouncycastle.b.o.a;
import org.bouncycastle.b.r;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public class DigestFactory {
    private static Set a = new HashSet();
    private static Set b = new HashSet();
    private static Set c = new HashSet();
    private static Set d = new HashSet();
    private static Set e = new HashSet();
    private static Set f = new HashSet();
    private static Set g = new HashSet();
    private static Set h = new HashSet();
    private static Set i = new HashSet();
    private static Set j = new HashSet();
    private static Set k = new HashSet();
    private static Set l = new HashSet();
    private static Map m = new HashMap();

    static {
        a.add("MD5");
        a.add(n.J.b());
        b.add("SHA1");
        b.add("SHA-1");
        b.add(b.i.b());
        c.add("SHA224");
        c.add("SHA-224");
        c.add(org.bouncycastle.a.o.b.f.b());
        d.add("SHA256");
        d.add("SHA-256");
        d.add(org.bouncycastle.a.o.b.c.b());
        e.add("SHA384");
        e.add("SHA-384");
        e.add(org.bouncycastle.a.o.b.d.b());
        f.add("SHA512");
        f.add("SHA-512");
        f.add(org.bouncycastle.a.o.b.e.b());
        g.add("SHA512(224)");
        g.add("SHA-512(224)");
        g.add(org.bouncycastle.a.o.b.g.b());
        h.add("SHA512(256)");
        h.add("SHA-512(256)");
        h.add(org.bouncycastle.a.o.b.h.b());
        i.add("SHA3-224");
        i.add(org.bouncycastle.a.o.b.i.b());
        j.add("SHA3-256");
        j.add(org.bouncycastle.a.o.b.j.b());
        k.add("SHA3-384");
        k.add(org.bouncycastle.a.o.b.k.b());
        l.add("SHA3-512");
        l.add(org.bouncycastle.a.o.b.l.b());
        m.put("MD5", n.J);
        m.put(n.J.b(), n.J);
        m.put("SHA1", b.i);
        m.put("SHA-1", b.i);
        m.put(b.i.b(), b.i);
        m.put("SHA224", org.bouncycastle.a.o.b.f);
        m.put("SHA-224", org.bouncycastle.a.o.b.f);
        m.put(org.bouncycastle.a.o.b.f.b(), org.bouncycastle.a.o.b.f);
        m.put("SHA256", org.bouncycastle.a.o.b.c);
        m.put("SHA-256", org.bouncycastle.a.o.b.c);
        m.put(org.bouncycastle.a.o.b.c.b(), org.bouncycastle.a.o.b.c);
        m.put("SHA384", org.bouncycastle.a.o.b.d);
        m.put("SHA-384", org.bouncycastle.a.o.b.d);
        m.put(org.bouncycastle.a.o.b.d.b(), org.bouncycastle.a.o.b.d);
        m.put("SHA512", org.bouncycastle.a.o.b.e);
        m.put("SHA-512", org.bouncycastle.a.o.b.e);
        m.put(org.bouncycastle.a.o.b.e.b(), org.bouncycastle.a.o.b.e);
        m.put("SHA512(224)", org.bouncycastle.a.o.b.g);
        m.put("SHA-512(224)", org.bouncycastle.a.o.b.g);
        m.put(org.bouncycastle.a.o.b.g.b(), org.bouncycastle.a.o.b.g);
        m.put("SHA512(256)", org.bouncycastle.a.o.b.h);
        m.put("SHA-512(256)", org.bouncycastle.a.o.b.h);
        m.put(org.bouncycastle.a.o.b.h.b(), org.bouncycastle.a.o.b.h);
        m.put("SHA3-224", org.bouncycastle.a.o.b.i);
        m.put(org.bouncycastle.a.o.b.i.b(), org.bouncycastle.a.o.b.i);
        m.put("SHA3-256", org.bouncycastle.a.o.b.j);
        m.put(org.bouncycastle.a.o.b.j.b(), org.bouncycastle.a.o.b.j);
        m.put("SHA3-384", org.bouncycastle.a.o.b.k);
        m.put(org.bouncycastle.a.o.b.k.b(), org.bouncycastle.a.o.b.k);
        m.put("SHA3-512", org.bouncycastle.a.o.b.l);
        m.put(org.bouncycastle.a.o.b.l.b(), org.bouncycastle.a.o.b.l);
    }

    public static boolean a(String str, String str2) {
        return (b.contains(str) && b.contains(str2)) || (c.contains(str) && c.contains(str2)) || ((d.contains(str) && d.contains(str2)) || ((e.contains(str) && e.contains(str2)) || ((f.contains(str) && f.contains(str2)) || ((g.contains(str) && g.contains(str2)) || ((h.contains(str) && h.contains(str2)) || ((i.contains(str) && i.contains(str2)) || ((j.contains(str) && j.contains(str2)) || ((k.contains(str) && k.contains(str2)) || ((l.contains(str) && l.contains(str2)) || (a.contains(str) && a.contains(str2)))))))))));
    }

    public static p b(String str) {
        return (p) m.get(str);
    }

    public static r a(String str) {
        String strB = k.b(str);
        if (b.contains(strB)) {
            return new s();
        }
        if (a.contains(strB)) {
            return new m();
        }
        if (c.contains(strB)) {
            return new t();
        }
        if (d.contains(strB)) {
            return new u();
        }
        if (e.contains(strB)) {
            return new v();
        }
        if (f.contains(strB)) {
            return new x();
        }
        if (g.contains(strB)) {
            return a.a();
        }
        if (h.contains(strB)) {
            return a.b();
        }
        if (i.contains(strB)) {
            return a.c();
        }
        if (j.contains(strB)) {
            return a.d();
        }
        if (k.contains(strB)) {
            return a.e();
        }
        if (l.contains(strB)) {
            return a.f();
        }
        return null;
    }
}
