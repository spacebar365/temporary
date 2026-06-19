package org.cybergarage.p157d;

import org.cybergarage.p154a.C1629g;
import org.cybergarage.p157d.p158a.C1643b;
import org.cybergarage.p157d.p158a.C1644c;
import org.cybergarage.p157d.p158a.InterfaceC1642a;
import org.cybergarage.p157d.p172f.C1729a;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1746c;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.a */
/* JADX INFO: compiled from: Action.java */
/* JADX INFO: loaded from: classes.dex */
public class C1641a {

    /* JADX INFO: renamed from: a */
    private C1752c f6368a;

    /* JADX INFO: renamed from: b */
    private C1752c f6369b;

    /* JADX INFO: renamed from: c */
    private C1746c f6370c = new C1746c();

    /* JADX INFO: renamed from: d */
    private C1743o f6371d = new C1743o();

    /* JADX INFO: renamed from: e */
    private Object f6372e = null;

    public C1641a(C1752c c1752c, C1752c c1752c2) {
        this.f6368a = c1752c;
        this.f6369b = c1752c2;
    }

    public C1641a(C1641a c1641a) {
        this.f6368a = c1641a.f6368a;
        this.f6369b = c1641a.f6369b;
    }

    /* JADX INFO: renamed from: b */
    public final C1669d m4731b() {
        C1669d c1669d = new C1669d();
        C1752c c1752cM5161l = this.f6369b.m5161l("argumentList");
        if (c1752cM5161l != null) {
            int iM5159k = c1752cM5161l.m5159k();
            for (int i = 0; i < iM5159k; i++) {
                C1752c c1752cM5144c = c1752cM5161l.m5144c(i);
                if ("argument".equals(c1752cM5144c.m5153h())) {
                    c1669d.add(new C1660c(this.f6368a, c1752cM5144c));
                }
            }
        }
        return c1669d;
    }

    /* JADX INFO: renamed from: a */
    public final C1660c m4725a(String str) {
        C1669d c1669dM4731b = m4731b();
        int size = c1669dM4731b.size();
        for (int i = 0; i < size; i++) {
            C1660c c1660cM4792a = c1669dM4731b.m4792a(i);
            String strM4747a = c1660cM4792a.m4747a();
            if (strM4747a != null && str.equals(strM4747a)) {
                return c1660cM4792a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m4727a(String str, String str2) {
        C1660c c1660cM4725a = m4725a(str);
        if (c1660cM4725a != null) {
            c1660cM4725a.m4751b(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4726a(String str, int i) {
        m4727a(str, Integer.toString(i));
    }

    /* JADX INFO: renamed from: b */
    public final String m4730b(String str) {
        C1660c c1660cM4725a = m4725a(str);
        return c1660cM4725a == null ? "" : c1660cM4725a.m4754e();
    }

    /* JADX INFO: renamed from: c */
    public final int m4732c(String str) {
        C1660c c1660cM4725a = m4725a(str);
        if (c1660cM4725a == null) {
            return 0;
        }
        return c1660cM4725a.m4755f();
    }

    /* JADX INFO: renamed from: a */
    public final void m4728a(InterfaceC1642a interfaceC1642a) {
        m4723d().m5006a(interfaceC1642a);
    }

    /* JADX INFO: renamed from: c */
    public final void m4733c() {
        C1744a.m5118a("Action : " + m4724a());
        C1669d c1669dM4731b = m4731b();
        int size = c1669dM4731b.size();
        for (int i = 0; i < size; i++) {
            C1660c c1660cM4792a = c1669dM4731b.m4792a(i);
            C1744a.m5118a(" [" + i + "] = " + c1660cM4792a.m4750b() + ", " + c1660cM4792a.m4747a() + ", " + c1660cM4792a.m4754e());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m4724a() {
        return this.f6369b.m5166n("name");
    }

    /* JADX INFO: renamed from: d */
    private C1729a m4723d() {
        C1752c c1752c = this.f6369b;
        C1729a c1729a = (C1729a) c1752c.m5165n();
        if (c1729a == null) {
            C1729a c1729a2 = new C1729a();
            c1752c.m5140a(c1729a2);
            c1729a2.m5027a(c1752c);
            return c1729a2;
        }
        return c1729a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4729a(C1643b c1643b) {
        InterfaceC1642a interfaceC1642aM5005a = m4723d().m5005a();
        if (interfaceC1642aM5005a == null) {
            return false;
        }
        C1644c c1644c = new C1644c();
        String strM5111a = C1743o.m5111a(401);
        this.f6371d.m5115b(401);
        this.f6371d.m5113a(strM5111a);
        C1669d c1669dM4731b = m4731b();
        int size = c1669dM4731b.size();
        for (int i = 0; i < size; i++) {
            C1660c c1660cM4792a = c1669dM4731b.m4792a(i);
            if (c1660cM4792a.m4753d()) {
                c1660cM4792a.m4751b("");
            }
        }
        if (interfaceC1642aM5005a.mo4734a(this)) {
            c1644c.m4671b(200);
            C1752c c1752cV = c1644c.m4722v();
            C1752c c1752c = new C1752c("u:" + m4724a() + "Response");
            c1752c.m5145c("xmlns:u", new C1738j(this.f6368a).m5072d());
            C1669d c1669dM4731b2 = m4731b();
            int size2 = c1669dM4731b2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C1660c c1660cM4792a2 = c1669dM4731b2.m4792a(i2);
                if (c1660cM4792a2.m4753d()) {
                    C1752c c1752c2 = new C1752c();
                    c1752c2.m5150f(c1660cM4792a2.m4747a());
                    c1752c2.m5152g(c1660cM4792a2.m4754e());
                    c1752c.m5146c(c1752c2);
                }
            }
            c1752cV.m5146c(c1752c);
            c1644c.m4720a(c1644c.m4721u());
        } else {
            C1743o c1743o = this.f6371d;
            c1644c.m4738a(c1743o.m5112a(), c1743o.m5114b());
        }
        if (C1744a.m5122c()) {
            c1644c.mo4675t();
        }
        c1643b.m4652a((C1629g) c1644c);
        return true;
    }
}
