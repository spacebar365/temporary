package org.cybergarage.p157d.p162e.p163a.p164a.p166b;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.k */
/* JADX INFO: compiled from: SearchCriteria.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1718k {

    /* JADX INFO: renamed from: a */
    private String f6446a;

    /* JADX INFO: renamed from: b */
    private String f6447b;

    /* JADX INFO: renamed from: c */
    private String f6448c;

    /* JADX INFO: renamed from: d */
    private String f6449d;

    /* JADX INFO: renamed from: e */
    private boolean f6450e;

    public C1718k() {
        this.f6446a = "";
        this.f6447b = "";
        this.f6448c = "";
        this.f6449d = "";
    }

    public C1718k(C1718k c1718k) {
        this.f6446a = c1718k.f6446a;
        this.f6447b = c1718k.f6447b;
        this.f6448c = c1718k.f6448c;
        this.f6449d = c1718k.f6449d;
        this.f6450e = c1718k.f6450e;
    }

    /* JADX INFO: renamed from: a */
    public final void m4907a(String str) {
        this.f6446a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4906a() {
        return this.f6446a;
    }

    /* JADX INFO: renamed from: b */
    public final void m4909b(String str) {
        this.f6447b = str;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4910b() {
        return this.f6447b.compareTo("=") == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4912c() {
        return this.f6447b.compareTo("<") == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4914d() {
        return this.f6447b.compareTo("<=") == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4915e() {
        return this.f6447b.compareTo(">") == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4916f() {
        return this.f6447b.compareTo(">=") == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4917g() {
        return this.f6447b.compareTo("contains") == 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4918h() {
        return this.f6447b.compareTo("doesNotContain") == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m4911c(String str) {
        this.f6448c = str;
    }

    /* JADX INFO: renamed from: i */
    public final String m4919i() {
        return this.f6448c;
    }

    /* JADX INFO: renamed from: d */
    public final void m4913d(String str) {
        this.f6449d = str;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4920j() {
        return this.f6449d.compareTo("and") == 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4908a(boolean z) {
        this.f6450e = z;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4921k() {
        return this.f6450e;
    }
}
