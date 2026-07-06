package org.bouncycastle.a.i;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.p;
import org.bouncycastle.f.a.f;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static ae a = new b();
    static ae b = new c();
    static final Hashtable c = new Hashtable();
    static final Hashtable d = new Hashtable();
    static final Hashtable e = new Hashtable();

    static {
        a("wapip192v1", d.J, b);
        a("sm2p256v1", d.F, a);
    }

    public static Enumeration a() {
        return e.elements();
    }

    public static ad a(String str) {
        p pVarB = b(str);
        if (pVarB == null) {
            return null;
        }
        return a(pVarB);
    }

    public static ad a(p pVar) {
        ae aeVar = (ae) d.get(pVar);
        if (aeVar == null) {
            return null;
        }
        return aeVar.b();
    }

    static /* synthetic */ org.bouncycastle.d.a.d a(org.bouncycastle.d.a.d dVar) {
        return dVar;
    }

    private static void a(String str, p pVar, ae aeVar) {
        c.put(k.c(str), pVar);
        e.put(pVar, str);
        d.put(pVar, aeVar);
    }

    public static String b(p pVar) {
        return (String) e.get(pVar);
    }

    public static p b(String str) {
        return (p) c.get(k.c(str));
    }

    static /* synthetic */ BigInteger c(String str) {
        return new BigInteger(1, f.a(str));
    }
}
