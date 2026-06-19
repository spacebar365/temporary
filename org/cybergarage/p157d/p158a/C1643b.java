package org.cybergarage.p157d.p158a;

import org.cybergarage.p154a.C1627e;
import org.cybergarage.p157d.C1660c;
import org.cybergarage.p157d.C1669d;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.a.b */
/* JADX INFO: compiled from: ActionRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1643b extends C1645d {
    public C1643b() {
    }

    public C1643b(C1627e c1627e) {
        m4651a(c1627e);
    }

    /* JADX INFO: renamed from: M */
    private C1752c m4735M() {
        C1752c c1752cJ = m4719J();
        if (c1752cJ != null && c1752cJ.m5164m()) {
            return c1752cJ.m5144c(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final String m4736K() {
        String strM5153h;
        int iIndexOf;
        C1752c c1752cM4735M = m4735M();
        if (c1752cM4735M == null || (strM5153h = c1752cM4735M.m5153h()) == null || (iIndexOf = strM5153h.indexOf(":") + 1) < 0) {
            return "";
        }
        return strM5153h.substring(iIndexOf, strM5153h.length());
    }

    /* JADX INFO: renamed from: L */
    public final C1669d m4737L() {
        C1752c c1752cM4735M = m4735M();
        int iM5159k = c1752cM4735M.m5159k();
        C1669d c1669d = new C1669d();
        for (int i = 0; i < iM5159k; i++) {
            C1660c c1660c = new C1660c();
            C1752c c1752cM5144c = c1752cM4735M.m5144c(i);
            c1660c.m4749a(c1752cM5144c.m5153h());
            c1660c.m4751b(c1752cM5144c.m5155i());
            c1669d.add(c1660c);
        }
        return c1669d;
    }
}
