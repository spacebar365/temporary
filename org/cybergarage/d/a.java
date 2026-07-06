package org.cybergarage.d;

/* JADX INFO: compiled from: Action.java */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private org.cybergarage.xml.c a;
    private org.cybergarage.xml.c b;
    private org.cybergarage.e.c c = new org.cybergarage.e.c();
    private o d = new o();
    private Object e = null;

    public a(org.cybergarage.xml.c cVar, org.cybergarage.xml.c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    public a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }

    public final d b() {
        d dVar = new d();
        org.cybergarage.xml.c cVarL = this.b.l("argumentList");
        if (cVarL != null) {
            int iK = cVarL.k();
            for (int i = 0; i < iK; i++) {
                org.cybergarage.xml.c cVarC = cVarL.c(i);
                if ("argument".equals(cVarC.h())) {
                    dVar.add(new c(this.a, cVarC));
                }
            }
        }
        return dVar;
    }

    public final c a(String str) {
        d dVarB = b();
        int size = dVarB.size();
        for (int i = 0; i < size; i++) {
            c cVarA = dVarB.a(i);
            String strA = cVarA.a();
            if (strA != null && str.equals(strA)) {
                return cVarA;
            }
        }
        return null;
    }

    public final void a(String str, String str2) {
        c cVarA = a(str);
        if (cVarA != null) {
            cVarA.b(str2);
        }
    }

    public final void a(String str, int i) {
        a(str, Integer.toString(i));
    }

    public final String b(String str) {
        c cVarA = a(str);
        return cVarA == null ? "" : cVarA.e();
    }

    public final int c(String str) {
        c cVarA = a(str);
        if (cVarA == null) {
            return 0;
        }
        return cVarA.f();
    }

    public final void a(org.cybergarage.d.a.a aVar) {
        d().a(aVar);
    }

    public final void c() {
        org.cybergarage.e.a.a("Action : " + a());
        d dVarB = b();
        int size = dVarB.size();
        for (int i = 0; i < size; i++) {
            c cVarA = dVarB.a(i);
            org.cybergarage.e.a.a(" [" + i + "] = " + cVarA.b() + ", " + cVarA.a() + ", " + cVarA.e());
        }
    }

    public final String a() {
        return this.b.n("name");
    }

    private org.cybergarage.d.f.a d() {
        org.cybergarage.xml.c cVar = this.b;
        org.cybergarage.d.f.a aVar = (org.cybergarage.d.f.a) cVar.n();
        if (aVar == null) {
            org.cybergarage.d.f.a aVar2 = new org.cybergarage.d.f.a();
            cVar.a(aVar2);
            aVar2.a(cVar);
            return aVar2;
        }
        return aVar;
    }

    public final boolean a(org.cybergarage.d.a.b bVar) {
        org.cybergarage.d.a.a aVarA = d().a();
        if (aVarA == null) {
            return false;
        }
        org.cybergarage.d.a.c cVar = new org.cybergarage.d.a.c();
        String strA = o.a(401);
        this.d.b(401);
        this.d.a(strA);
        d dVarB = b();
        int size = dVarB.size();
        for (int i = 0; i < size; i++) {
            c cVarA = dVarB.a(i);
            if (cVarA.d()) {
                cVarA.b("");
            }
        }
        if (aVarA.a(this)) {
            cVar.b(200);
            org.cybergarage.xml.c cVarV = cVar.v();
            org.cybergarage.xml.c cVar2 = new org.cybergarage.xml.c("u:" + a() + "Response");
            cVar2.c("xmlns:u", new j(this.a).d());
            d dVarB2 = b();
            int size2 = dVarB2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c cVarA2 = dVarB2.a(i2);
                if (cVarA2.d()) {
                    org.cybergarage.xml.c cVar3 = new org.cybergarage.xml.c();
                    cVar3.f(cVarA2.a());
                    cVar3.g(cVarA2.e());
                    cVar2.c(cVar3);
                }
            }
            cVarV.c(cVar2);
            cVar.a(cVar.u());
        } else {
            o oVar = this.d;
            cVar.a(oVar.a(), oVar.b());
        }
        if (org.cybergarage.e.a.c()) {
            cVar.t();
        }
        bVar.a((org.cybergarage.a.g) cVar);
        return true;
    }
}
