package org.cybergarage.p157d;

import org.cybergarage.p157d.p172f.C1732d;
import org.cybergarage.p157d.p172f.C1734f;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.m */
/* JADX INFO: compiled from: StateVariable.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1741m extends C1732d {

    /* JADX INFO: renamed from: a */
    private C1752c f6513a;

    /* JADX INFO: renamed from: b */
    private C1752c f6514b;

    /* JADX INFO: renamed from: c */
    private C1743o f6515c;

    /* JADX INFO: renamed from: d */
    private Object f6516d;

    /* JADX INFO: renamed from: a */
    public final C1752c m5091a() {
        return this.f6513a;
    }

    public C1741m() {
        this.f6515c = new C1743o();
        this.f6516d = null;
        this.f6514b = null;
        this.f6513a = new C1752c("stateVariable");
    }

    public C1741m(C1752c c1752c, C1752c c1752c2) {
        this.f6515c = new C1743o();
        this.f6516d = null;
        this.f6514b = c1752c;
        this.f6513a = c1752c2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5093a(String str) {
        C1738j c1738j;
        String strM5034a = m5097d().m5034a();
        if (strM5034a == null || !strM5034a.equals(str)) {
            m5097d().m5035a(str);
            C1752c c1752c = this.f6514b;
            if (c1752c == null) {
                c1738j = null;
            } else {
                c1738j = new C1738j(c1752c);
            }
            if (c1738j != null && m5096c()) {
                c1738j.m5064a(this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5092a(int i) {
        m5093a(Integer.toString(i));
    }

    /* JADX INFO: renamed from: e */
    public final String m5098e() {
        return m5097d().m5034a();
    }

    /* JADX INFO: renamed from: b */
    public final void m5095b(String str) {
        this.f6515c.m5115b(404);
        this.f6515c.m5113a(str);
    }

    /* JADX INFO: renamed from: f */
    public final C1743o m5099f() {
        return this.f6515c;
    }

    /* JADX INFO: renamed from: b */
    public final String m5094b() {
        return this.f6513a.m5166n("name");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5096c() {
        String strM5158j = this.f6513a.m5158j("sendEvents");
        return strM5158j != null && strM5158j.equalsIgnoreCase("yes");
    }

    /* JADX INFO: renamed from: d */
    public final C1734f m5097d() {
        C1752c c1752c = this.f6513a;
        C1734f c1734f = (C1734f) c1752c.m5165n();
        if (c1734f == null) {
            C1734f c1734f2 = new C1734f();
            c1752c.m5140a(c1734f2);
            c1734f2.m5027a(c1752c);
            return c1734f2;
        }
        return c1734f;
    }
}
