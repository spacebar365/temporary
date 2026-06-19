package org.cybergarage.p157d;

import org.cybergarage.p157d.p172f.C1730b;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.c */
/* JADX INFO: compiled from: Argument.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1660c {

    /* JADX INFO: renamed from: a */
    private C1752c f6377a;

    /* JADX INFO: renamed from: b */
    private C1752c f6378b;

    /* JADX INFO: renamed from: c */
    private Object f6379c;

    public C1660c() {
        this.f6379c = null;
        this.f6377a = new C1752c("argument");
        this.f6378b = null;
    }

    public C1660c(C1752c c1752c, C1752c c1752c2) {
        this.f6379c = null;
        this.f6378b = c1752c;
        this.f6377a = c1752c2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4752c() {
        String strM4750b = m4750b();
        if (strM4750b == null) {
            return false;
        }
        return strM4750b.equalsIgnoreCase("in");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4753d() {
        return !m4752c();
    }

    /* JADX INFO: renamed from: b */
    public final void m4751b(String str) {
        m4746g().m5008a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m4748a(int i) {
        m4751b(Integer.toString(i));
    }

    /* JADX INFO: renamed from: e */
    public final String m4754e() {
        return m4746g().m5007a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4749a(String str) {
        this.f6377a.m5147d("name", str);
    }

    /* JADX INFO: renamed from: a */
    public final String m4747a() {
        return this.f6377a.m5166n("name");
    }

    /* JADX INFO: renamed from: b */
    public final String m4750b() {
        return this.f6377a.m5166n("direction");
    }

    /* JADX INFO: renamed from: g */
    private C1730b m4746g() {
        C1752c c1752c = this.f6377a;
        C1730b c1730b = (C1730b) c1752c.m5165n();
        if (c1730b == null) {
            C1730b c1730b2 = new C1730b();
            c1752c.m5140a(c1730b2);
            c1730b2.m5027a(c1752c);
            return c1730b2;
        }
        return c1730b;
    }

    /* JADX INFO: renamed from: f */
    public final int m4755f() {
        try {
            return Integer.parseInt(m4746g().m5007a());
        } catch (Exception e) {
            return 0;
        }
    }
}
