package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p169c;

import java.text.SimpleDateFormat;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1702c;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1690a;
import org.cybergarage.xml.C1750a;
import org.cybergarage.xml.C1751b;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.c.a */
/* JADX INFO: compiled from: ItemNode.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1703a extends AbstractC1689a {

    /* JADX INFO: renamed from: a */
    private C1705c f6444a = new C1705c();

    public C1703a() {
        m5141a("id", -1);
        m5150f("item");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4891a(C1752c c1752c) {
        String strM5153h = c1752c.m5153h();
        if (strM5153h == null) {
            return false;
        }
        return strM5153h.equals("item");
    }

    @Override // org.cybergarage.xml.C1752c
    /* JADX INFO: renamed from: b */
    public final boolean mo4880b(C1752c c1752c) {
        int iM5159k = c1752c.m5159k();
        for (int i = 0; i < iM5159k; i++) {
            C1752c c1752cM5144c = c1752c.m5144c(i);
            if (!C1690a.m4877a(c1752cM5144c) && !m4891a(c1752cM5144c)) {
                String strM5153h = c1752cM5144c.m5153h();
                if (strM5153h == null ? false : strM5153h.equals("res")) {
                    C1704b c1704b = new C1704b();
                    c1704b.mo4880b(c1752cM5144c);
                    this.f6444a.add(c1704b);
                } else {
                    m4871b(c1752cM5144c.m5153h(), c1752cM5144c.m5155i());
                }
            }
        }
        int iM5157j = c1752c.m5157j();
        for (int i2 = 0; i2 < iM5157j; i2++) {
            C1750a c1750aM5143b = c1752c.m5143b(i2);
            m5145c(c1750aM5143b.m5132a(), c1750aM5143b.m5134b());
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m4895a(String str, C1751b c1751b) {
        C1702c c1702cA = m4865a("upnp:albumArtURI", str);
        int size = c1751b.size();
        for (int i = 0; i < size; i++) {
            C1750a c1750aM5135a = c1751b.m5135a(i);
            c1702cA.m4889b(c1750aM5135a.m5132a(), c1750aM5135a.m5134b());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4893a(String str, String str2, String str3, String str4) {
        m4871b(str, str4);
        m4867a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m4894a(String str, String str2, C1751b c1751b) {
        C1702c c1702cA = m4865a("res", str);
        c1702cA.m4889b("protocolInfo", str2);
        int size = c1751b.size();
        for (int i = 0; i < size; i++) {
            C1750a c1750aM5135a = c1751b.m5135a(i);
            c1702cA.m4889b(c1750aM5135a.m5132a(), c1750aM5135a.m5134b());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4896b(String str, String str2, C1751b c1751b) {
        m4871b("res", str);
        m4867a("res", "protocolInfo", str2);
        int size = c1751b.size();
        for (int i = 0; i < size; i++) {
            C1750a c1750aM5135a = c1751b.m5135a(i);
            m4867a("res", c1750aM5135a.m5132a(), c1750aM5135a.m5134b());
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m4892a() {
        String strB = m4869b("dc:date");
        if (strB == null || strB.length() < 10) {
            return 0L;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(strB).getTime();
        } catch (Exception e) {
            return 0L;
        }
    }
}
