package org.cybergarage.d;

/* JADX INFO: compiled from: StateVariable.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends org.cybergarage.d.f.d {
    private org.cybergarage.xml.c a;
    private org.cybergarage.xml.c b;
    private o c;
    private Object d;

    public final org.cybergarage.xml.c a() {
        return this.a;
    }

    public m() {
        this.c = new o();
        this.d = null;
        this.b = null;
        this.a = new org.cybergarage.xml.c("stateVariable");
    }

    public m(org.cybergarage.xml.c cVar, org.cybergarage.xml.c cVar2) {
        this.c = new o();
        this.d = null;
        this.b = cVar;
        this.a = cVar2;
    }

    public final void a(String str) {
        j jVar;
        String strA = d().a();
        if (strA == null || !strA.equals(str)) {
            d().a(str);
            org.cybergarage.xml.c cVar = this.b;
            if (cVar == null) {
                jVar = null;
            } else {
                jVar = new j(cVar);
            }
            if (jVar != null && c()) {
                jVar.a(this);
            }
        }
    }

    public final void a(int i) {
        a(Integer.toString(i));
    }

    public final String e() {
        return d().a();
    }

    public final void b(String str) {
        this.c.b(404);
        this.c.a(str);
    }

    public final o f() {
        return this.c;
    }

    public final String b() {
        return this.a.n("name");
    }

    public final boolean c() {
        String strJ = this.a.j("sendEvents");
        return strJ != null && strJ.equalsIgnoreCase("yes");
    }

    public final org.cybergarage.d.f.f d() {
        org.cybergarage.xml.c cVar = this.a;
        org.cybergarage.d.f.f fVar = (org.cybergarage.d.f.f) cVar.n();
        if (fVar == null) {
            org.cybergarage.d.f.f fVar2 = new org.cybergarage.d.f.f();
            cVar.a(fVar2);
            fVar2.a(cVar);
            return fVar2;
        }
        return fVar;
    }
}
