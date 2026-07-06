package org.bouncycastle.a.o;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.p;
import org.bouncycastle.a.u.aj;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static final Hashtable a = new Hashtable();
    static final Hashtable b = new Hashtable();

    static {
        a("B-571", aj.F);
        a("B-409", aj.D);
        a("B-283", aj.n);
        a("B-233", aj.t);
        a("B-163", aj.l);
        a("K-571", aj.E);
        a("K-409", aj.C);
        a("K-283", aj.m);
        a("K-233", aj.s);
        a("K-163", aj.b);
        a("P-521", aj.B);
        a("P-384", aj.A);
        a("P-256", aj.H);
        a("P-224", aj.z);
        a("P-192", aj.G);
    }

    public static String a(p pVar) {
        return (String) b.get(pVar);
    }

    public static Enumeration a() {
        return a.keys();
    }

    private static void a(String str, p pVar) {
        a.put(str, pVar);
        b.put(pVar, str);
    }

    public static p b(String str) {
        return (p) a.get(k.b(str));
    }

    public static ad a(String str) {
        p pVar = (p) a.get(k.b(str));
        if (pVar != null) {
            return org.bouncycastle.a.u.b.a(pVar);
        }
        return null;
    }
}
