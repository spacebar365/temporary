package org.cybergarage.p157d.p162e.p163a.p164a.p166b;

import java.io.PrintWriter;
import org.cybergarage.p157d.p162e.p163a.p164a.C1724d;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1690a;
import org.cybergarage.xml.C1750a;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.a */
/* JADX INFO: compiled from: ContentNode.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1689a extends C1752c {

    /* JADX INFO: renamed from: a */
    private C1724d f6433a;

    /* JADX INFO: renamed from: b */
    private C1706d f6434b = new C1706d();

    public AbstractC1689a() {
        m5141a("id", 0);
        m5141a("parentID", -1);
        m5141a("restricted", 1);
        this.f6433a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m4868a(C1724d c1724d) {
        this.f6433a = c1724d;
    }

    /* JADX INFO: renamed from: b */
    public final C1724d m4870b() {
        return this.f6433a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4873c() {
        return this instanceof C1690a;
    }

    /* JADX INFO: renamed from: a */
    public final C1702c m4864a(String str) {
        C1706d c1706d = this.f6434b;
        if (str == null) {
            return null;
        }
        int size = c1706d.size();
        for (int i = 0; i < size; i++) {
            C1702c c1702cM4897a = c1706d.m4897a(i);
            if (str.compareTo(c1702cM4897a.m4884a()) == 0) {
                return c1702cM4897a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m4863a(C1702c c1702c) {
        this.f6434b.add(c1702c);
    }

    /* JADX INFO: renamed from: a */
    public final C1702c m4865a(String str, String str2) {
        C1702c c1702c = new C1702c(str, str2);
        m4863a(c1702c);
        return c1702c;
    }

    /* JADX INFO: renamed from: b */
    public final void m4871b(String str, String str2) {
        C1702c c1702cM4864a = m4864a(str);
        if (c1702cM4864a != null) {
            c1702cM4864a.m4886a(str2 != null ? str2.replace("<", "").replace(">", "") : null);
        } else {
            m4863a(new C1702c(str, str2 != null ? str2.replace("<", "").replace(">", "") : null));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m4869b(String str) {
        C1702c c1702cM4864a = m4864a(str);
        return c1702cM4864a != null ? c1702cM4864a.m4888b() : "";
    }

    /* JADX INFO: renamed from: a */
    public final void m4867a(String str, String str2, String str3) {
        C1702c c1702cM4864a = m4864a(str);
        if (c1702cM4864a == null) {
            c1702cM4864a = new C1702c(str, "");
            m4863a(c1702cM4864a);
        }
        c1702cM4864a.m4889b(str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final void m4872c(String str) {
        m4871b("dc:title", str);
    }

    /* JADX INFO: renamed from: d */
    public final String m4874d() {
        return m4869b("dc:title");
    }

    /* JADX INFO: renamed from: d */
    public final void m4875d(String str) {
        m4871b("upnp:class", str);
    }

    /* JADX INFO: renamed from: e */
    public final String m4876e() {
        return m4869b("upnp:class");
    }

    /* JADX INFO: renamed from: a */
    private static void m4862a(PrintWriter printWriter, C1702c c1702c) {
        int iM4890c = c1702c.m4890c();
        for (int i = 0; i < iM4890c; i++) {
            C1750a c1750aM4885a = c1702c.m4885a(i);
            printWriter.print(" " + c1750aM4885a.m5132a() + "=\"" + c1750aM4885a.m5134b() + "\"");
        }
    }

    @Override // org.cybergarage.xml.C1752c
    /* JADX INFO: renamed from: a */
    public final void mo4866a(PrintWriter printWriter, int i, boolean z) {
        String strM5137a = C1752c.m5137a(i, "   ");
        String strH = m5153h();
        String strI = m5155i();
        if (!m5164m()) {
            if (!(this.f6434b.size() > 0)) {
                printWriter.print(String.valueOf(strM5137a) + "<" + strH);
                m5139a(printWriter);
                printWriter.println(">" + strI + "</" + strH + ">");
                return;
            }
        }
        printWriter.print(String.valueOf(strM5137a) + "<" + strH);
        m5139a(printWriter);
        printWriter.println(">");
        int size = this.f6434b.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM5137a2 = C1752c.m5137a(i + 1, "   ");
            C1702c c1702cM4897a = this.f6434b.m4897a(i2);
            String strM4884a = c1702cM4897a.m4884a();
            String strM4888b = c1702cM4897a.m4888b();
            if (c1702cM4897a.m4890c() > 0) {
                printWriter.print(String.valueOf(strM5137a2) + "<" + strM4884a);
                m4862a(printWriter, c1702cM4897a);
                printWriter.println(">" + strM4888b + "</" + strM4884a + ">");
            } else {
                printWriter.println(String.valueOf(strM5137a2) + "<" + strM4884a + ">" + strM4888b + "</" + strM4884a + ">");
            }
        }
        if (z) {
            int iK = m5159k();
            for (int i3 = 0; i3 < iK; i3++) {
                m5144c(i3).mo4866a(printWriter, i + 1, true);
            }
        }
        printWriter.println(String.valueOf(strM5137a) + "</" + strH + ">");
    }
}
