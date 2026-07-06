package org.bouncycastle.a.aa;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static String a(org.bouncycastle.a.p pVar) {
        String strB = d.b(pVar);
        if (strB == null) {
            strB = org.bouncycastle.a.u.b.b(pVar);
        }
        if (strB == null) {
            strB = org.bouncycastle.a.o.a.a(pVar);
        }
        if (strB == null) {
            strB = org.bouncycastle.a.v.a.b(pVar);
        }
        if (strB == null) {
            strB = org.bouncycastle.a.a.a.b(pVar);
        }
        if (strB == null) {
            strB = org.bouncycastle.a.f.b.b(pVar);
        }
        if (strB == null) {
            strB = org.bouncycastle.a.i.a.b(pVar);
        }
        return strB == null ? org.bouncycastle.b.c.a.b(pVar) : strB;
    }

    public static Enumeration a() {
        Vector vector = new Vector();
        a(vector, d.a());
        a(vector, org.bouncycastle.a.u.b.a());
        a(vector, org.bouncycastle.a.o.a.a());
        a(vector, org.bouncycastle.a.v.a.a());
        a(vector, org.bouncycastle.a.a.a.a());
        a(vector, org.bouncycastle.a.f.b.a());
        a(vector, org.bouncycastle.a.i.a.a());
        return vector.elements();
    }

    public static ad a(String str) {
        ad adVarA = d.a(str);
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.u.b.a(str);
        }
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.o.a.a(str);
        }
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.v.a.a(str);
        }
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.a.a.a(str);
        }
        if (adVarA == null) {
            adVarA = a(org.bouncycastle.a.f.b.a(str));
        }
        return adVarA == null ? org.bouncycastle.a.i.a.a(str) : adVarA;
    }

    private static ad a(org.bouncycastle.b.k.y yVar) {
        if (yVar == null) {
            return null;
        }
        return new ad(yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.f());
    }

    private static void a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static ad b(org.bouncycastle.a.p pVar) {
        ad adVarA = d.a(pVar);
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.u.b.a(pVar);
        }
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.v.a.a(pVar);
        }
        if (adVarA == null) {
            adVarA = org.bouncycastle.a.a.a.a(pVar);
        }
        if (adVarA == null) {
            adVarA = a(org.bouncycastle.a.f.b.a(pVar));
        }
        return adVarA == null ? org.bouncycastle.a.i.a.a(pVar) : adVarA;
    }

    public static org.bouncycastle.a.p b(String str) {
        org.bouncycastle.a.p pVarB = d.b(str);
        if (pVarB == null) {
            pVarB = org.bouncycastle.a.u.b.b(str);
        }
        if (pVarB == null) {
            pVarB = org.bouncycastle.a.o.a.b(str);
        }
        if (pVarB == null) {
            pVarB = org.bouncycastle.a.v.a.b(str);
        }
        if (pVarB == null) {
            pVarB = org.bouncycastle.a.a.a.b(str);
        }
        if (pVarB == null) {
            pVarB = org.bouncycastle.a.f.b.b(str);
        }
        return pVarB == null ? org.bouncycastle.a.i.a.b(str) : pVarB;
    }
}
