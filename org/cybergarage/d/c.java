package org.cybergarage.d;

/* JADX INFO: compiled from: Argument.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private org.cybergarage.xml.c a;
    private org.cybergarage.xml.c b;
    private Object c;

    public c() {
        this.c = null;
        this.a = new org.cybergarage.xml.c("argument");
        this.b = null;
    }

    public c(org.cybergarage.xml.c cVar, org.cybergarage.xml.c cVar2) {
        this.c = null;
        this.b = cVar;
        this.a = cVar2;
    }

    public final boolean c() {
        String strB = b();
        if (strB == null) {
            return false;
        }
        return strB.equalsIgnoreCase("in");
    }

    public final boolean d() {
        return !c();
    }

    public final void b(String str) {
        g().a(str);
    }

    public final void a(int i) {
        b(Integer.toString(i));
    }

    public final String e() {
        return g().a();
    }

    public final void a(String str) {
        this.a.d("name", str);
    }

    public final String a() {
        return this.a.n("name");
    }

    public final String b() {
        return this.a.n("direction");
    }

    private org.cybergarage.d.f.b g() {
        org.cybergarage.xml.c cVar = this.a;
        org.cybergarage.d.f.b bVar = (org.cybergarage.d.f.b) cVar.n();
        if (bVar == null) {
            org.cybergarage.d.f.b bVar2 = new org.cybergarage.d.f.b();
            cVar.a(bVar2);
            bVar2.a(cVar);
            return bVar2;
        }
        return bVar;
    }

    public final int f() {
        try {
            return Integer.parseInt(g().a());
        } catch (Exception e) {
            return 0;
        }
    }
}
