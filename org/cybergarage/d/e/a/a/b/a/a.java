package org.cybergarage.d.e.a.a.b.a;

import org.cybergarage.xml.c;

/* JADX INFO: compiled from: ContainerNode.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends org.cybergarage.d.e.a.a.b.a {
    public a() {
        a("id", -1);
        f("container");
        a("searchable", 0);
        a("childCount", 0);
        d("object.container");
    }

    public static final boolean a(c cVar) {
        String strH = cVar.h();
        if (strH == null) {
            return false;
        }
        return strH.equals("container");
    }

    @Override // org.cybergarage.xml.c
    public final boolean b(c cVar) {
        int iK = cVar.k();
        for (int i = 0; i < iK; i++) {
            c cVarC = cVar.c(i);
            if (!a(cVarC) && !org.cybergarage.d.e.a.a.b.c.a.a(cVarC)) {
                b(cVarC.h(), cVarC.i());
            }
        }
        int iJ = cVar.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            org.cybergarage.xml.a aVarB = cVar.b(i2);
            c(aVarB.a(), aVarB.b());
        }
        return true;
    }

    public final org.cybergarage.d.e.a.a.b.a a(int i) {
        return (org.cybergarage.d.e.a.a.b.a) c(i);
    }

    public final void a(org.cybergarage.d.e.a.a.b.a aVar) {
        c(aVar);
        aVar.c("parentID", j("id"));
        a("childCount", k());
        aVar.a(b());
    }

    public final org.cybergarage.d.e.a.a.b.a e(String str) {
        org.cybergarage.d.e.a.a.b.a aVarE;
        if (str == null) {
            return null;
        }
        if (str.equals(j("id"))) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            org.cybergarage.d.e.a.a.b.a aVarA = a(i);
            if (aVarA == null) {
                return null;
            }
            if (!aVarA.c() && str.equals(aVarA.j("id"))) {
                return aVarA;
            }
            if (aVarA.c() && (aVarE = ((a) aVarA).e(str)) != null) {
                return aVarE;
            }
        }
        return null;
    }
}
