package org.cybergarage.d.e.a.a.b;

/* JADX INFO: compiled from: SearchCriteria.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;

    public k() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public k(k kVar) {
        this.a = kVar.a;
        this.b = kVar.b;
        this.c = kVar.c;
        this.d = kVar.d;
        this.e = kVar.e;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final boolean b() {
        return this.b.compareTo("=") == 0;
    }

    public final boolean c() {
        return this.b.compareTo("<") == 0;
    }

    public final boolean d() {
        return this.b.compareTo("<=") == 0;
    }

    public final boolean e() {
        return this.b.compareTo(">") == 0;
    }

    public final boolean f() {
        return this.b.compareTo(">=") == 0;
    }

    public final boolean g() {
        return this.b.compareTo("contains") == 0;
    }

    public final boolean h() {
        return this.b.compareTo("doesNotContain") == 0;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final String i() {
        return this.c;
    }

    public final void d(String str) {
        this.d = str;
    }

    public final boolean j() {
        return this.d.compareTo("and") == 0;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final boolean k() {
        return this.e;
    }
}
