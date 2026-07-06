package org.bouncycastle.a.a;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.p;
import org.bouncycastle.d.a.d;
import org.bouncycastle.f.a.f;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static ae a = new b();
    static final Hashtable b = new Hashtable();
    static final Hashtable c = new Hashtable();
    static final Hashtable d = new Hashtable();

    public static Enumeration a() {
        return d.elements();
    }

    public static ad a(String str) {
        p pVarB = b(str);
        if (pVarB == null) {
            return null;
        }
        return a(pVarB);
    }

    public static ad a(p pVar) {
        ae aeVar = (ae) c.get(pVar);
        if (aeVar == null) {
            return null;
        }
        return aeVar.b();
    }

    static /* synthetic */ d a(d dVar) {
        return dVar;
    }

    public static String b(p pVar) {
        return (String) d.get(pVar);
    }

    public static p b(String str) {
        return (p) b.get(k.c(str));
    }

    static /* synthetic */ BigInteger c(String str) {
        return new BigInteger(1, f.a(str));
    }

    static {
        p pVar = c.a;
        ae aeVar = a;
        b.put(k.c("FRP256v1"), pVar);
        d.put(pVar, "FRP256v1");
        c.put(pVar, aeVar);
    }
}
