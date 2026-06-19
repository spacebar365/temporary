package org.cybergarage.p157d;

import java.io.File;
import java.net.URL;
import org.cybergarage.p154a.C1624b;
import org.cybergarage.p157d.p158a.InterfaceC1642a;
import org.cybergarage.p157d.p158a.InterfaceC1647f;
import org.cybergarage.p157d.p159b.C1654c;
import org.cybergarage.p157d.p159b.C1657f;
import org.cybergarage.p157d.p160c.C1661a;
import org.cybergarage.p157d.p160c.C1664d;
import org.cybergarage.p157d.p160c.C1665e;
import org.cybergarage.p157d.p160c.C1666f;
import org.cybergarage.p157d.p161d.C1673d;
import org.cybergarage.p157d.p161d.C1676g;
import org.cybergarage.p157d.p161d.RunnableC1674e;
import org.cybergarage.p157d.p172f.C1733e;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1746c;
import org.cybergarage.xml.C1750a;
import org.cybergarage.xml.C1752c;
import org.cybergarage.xml.C1755f;

/* JADX INFO: renamed from: org.cybergarage.d.j */
/* JADX INFO: compiled from: Service.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1738j {

    /* JADX INFO: renamed from: a */
    private C1752c f6510a;

    /* JADX INFO: renamed from: b */
    private C1746c f6511b;

    /* JADX INFO: renamed from: c */
    private Object f6512c;

    /* JADX INFO: renamed from: a */
    public final C1752c m5059a() {
        return this.f6510a;
    }

    public C1738j() {
        this(new C1752c("service"));
        C1752c c1752c = new C1752c("specVersion");
        C1752c c1752c2 = new C1752c("major");
        c1752c2.m5152g("1");
        c1752c.m5146c(c1752c2);
        C1752c c1752c3 = new C1752c("minor");
        c1752c3.m5152g("0");
        c1752c.m5146c(c1752c3);
        C1752c c1752c4 = new C1752c("scpd");
        c1752c4.m5142a(new C1750a("xmlns", "urn:schemas-upnp-org:service-1-0"));
        c1752c4.m5146c(c1752c);
        m5057r().m5032b(c1752c4);
    }

    public C1738j(C1752c c1752c) {
        this.f6511b = new C1746c();
        this.f6512c = null;
        this.f6510a = c1752c;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5052a(C1752c c1752c) {
        return "service".equals(c1752c.m5153h());
    }

    /* JADX INFO: renamed from: b */
    public final C1728f m5067b() {
        C1752c c1752cM5149f;
        C1752c c1752cM5151g = this.f6510a.m5151g();
        C1752c c1752cM5149f2 = this.f6510a.m5149f();
        if (c1752cM5149f2 == null) {
            c1752cM5149f = null;
        } else {
            c1752cM5149f = c1752cM5149f2.m5149f();
        }
        return new C1728f(c1752cM5151g, c1752cM5149f);
    }

    /* JADX INFO: renamed from: c */
    public final C1728f m5070c() {
        return m5067b().m4986c();
    }

    /* JADX INFO: renamed from: e */
    public final void m5075e() {
        C1752c c1752cM5054o = m5054o();
        if (c1752cM5054o != null) {
            c1752cM5054o.m5141a("configId", C1742n.m5100a(c1752cM5054o.toString()));
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m5076f() {
        C1752c c1752cM5054o = m5054o();
        if (c1752cM5054o == null) {
            return 0;
        }
        return c1752cM5054o.m5160k("configId");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5051a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str2.equals(str) || str2.equals(C1624b.m4580a(str, false));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5065a(String str) {
        return m5051a(m5053n(), str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5071c(String str) {
        return m5051a(m5078g(), str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5073d(String str) throws C1654c {
        try {
            C1752c c1752cM5172a = C1742n.m5107e().m5172a(str);
            if (c1752cM5172a == null) {
                return false;
            }
            m5057r().m5032b(c1752cM5172a);
            return true;
        } catch (C1755f e) {
            throw new C1654c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    private C1752c m5054o() {
        C1733e c1733eM5057r = m5057r();
        C1752c c1752cM5028a = c1733eM5057r.m5028a();
        if (c1752cM5028a != null) {
            return c1752cM5028a;
        }
        C1728f c1728fM4986c = m5067b().m4986c();
        if (c1728fM4986c == null) {
            return null;
        }
        String strM5053n = m5053n();
        String strM4988d = c1728fM4986c.m4988d();
        if (strM4988d != null) {
            File file = new File(strM4988d.concat(strM5053n));
            if (file.exists()) {
                try {
                    c1752cM5028a = C1742n.m5107e().m5170a(file);
                } catch (C1755f e) {
                    e.printStackTrace();
                }
                if (c1752cM5028a != null) {
                    c1733eM5057r.m5032b(c1752cM5028a);
                    return c1752cM5028a;
                }
            }
        }
        try {
            C1752c c1752cM5173a = C1742n.m5107e().m5173a(new URL(c1728fM4986c.m4978a(strM5053n)));
            if (c1752cM5173a != null) {
                c1733eM5057r.m5032b(c1752cM5173a);
                return c1752cM5173a;
            }
        } catch (Exception e2) {
        }
        try {
            return C1742n.m5107e().m5170a(new File(String.valueOf(c1728fM4986c.m4988d()) + C1624b.m4584d(strM5053n)));
        } catch (Exception e3) {
            C1744a.m5117a(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m5081h() {
        C1752c c1752cM5054o = m5054o();
        if (c1752cM5054o == null) {
            return new byte[0];
        }
        return (String.valueOf(String.valueOf(String.valueOf(new String()) + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + c1752cM5054o.toString()).getBytes();
    }

    /* JADX INFO: renamed from: p */
    private C1651b m5055p() {
        C1752c c1752cM5161l;
        C1651b c1651b = new C1651b();
        C1752c c1752cM5054o = m5054o();
        if (c1752cM5054o != null && (c1752cM5161l = c1752cM5054o.m5161l("actionList")) != null) {
            int iM5159k = c1752cM5161l.m5159k();
            for (int i = 0; i < iM5159k; i++) {
                C1752c c1752cM5144c = c1752cM5161l.m5144c(i);
                if ("action".equals(c1752cM5144c.m5153h())) {
                    c1651b.add(new C1641a(this.f6510a, c1752cM5144c));
                }
            }
        }
        return c1651b;
    }

    /* JADX INFO: renamed from: e */
    public final C1641a m5074e(String str) {
        C1651b c1651bM5055p = m5055p();
        int size = c1651bM5055p.size();
        for (int i = 0; i < size; i++) {
            C1641a c1641aM4740a = c1651bM5055p.m4740a(i);
            String strM4724a = c1641aM4740a.m4724a();
            if (strM4724a != null && strM4724a.equals(str)) {
                return c1641aM4740a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private C1740l m5056q() {
        C1740l c1740l = new C1740l();
        C1752c c1752cM5161l = m5054o().m5161l("serviceStateTable");
        if (c1752cM5161l != null) {
            C1752c c1752c = this.f6510a;
            int iM5159k = c1752cM5161l.m5159k();
            for (int i = 0; i < iM5159k; i++) {
                C1752c c1752cM5144c = c1752cM5161l.m5144c(i);
                if ("stateVariable".equals(c1752cM5144c.m5153h())) {
                    c1740l.add(new C1741m(c1752c, c1752cM5144c));
                }
            }
        }
        return c1740l;
    }

    /* JADX INFO: renamed from: f */
    public final C1741m m5077f(String str) {
        C1740l c1740lM5056q = m5056q();
        int size = c1740lM5056q.size();
        for (int i = 0; i < size; i++) {
            C1741m c1741mM5090a = c1740lM5056q.m5090a(i);
            String strM5094b = c1741mM5090a.m5094b();
            if (strM5094b != null && strM5094b.equals(str)) {
                return c1741mM5090a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private String m5058s() {
        return String.valueOf(m5067b().m5001k()) + "::" + m5072d();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5066a(C1676g c1676g) {
        boolean zStartsWith = false;
        String strM4822f = c1676g.m4822f();
        if (strM4822f == null) {
            return false;
        }
        C1728f c1728fM5067b = m5067b();
        String strM5072d = m5072d();
        String strM5058s = m5058s();
        if (C1657f.m4742a(strM4822f)) {
            c1728fM5067b.m4982a(c1676g, strM5072d, strM5058s);
        } else {
            if (strM4822f != null) {
                zStartsWith = strM4822f.startsWith("urn:schemas-upnp-org:service:") ? true : strM4822f.startsWith("\"urn:schemas-upnp-org:service:");
            }
            if (zStartsWith) {
                String strM5072d2 = m5072d();
                if (strM4822f.equals(strM5072d2)) {
                    c1728fM5067b.m4982a(c1676g, strM5072d2, strM5058s);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5062a(InterfaceC1647f interfaceC1647f) {
        C1740l c1740lM5056q = m5056q();
        int size = c1740lM5056q.size();
        for (int i = 0; i < size; i++) {
            c1740lM5056q.m5090a(i).m5097d().m5036a(interfaceC1647f);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5083i() {
        C1740l c1740lM5056q = m5056q();
        int size = c1740lM5056q.size();
        for (int i = 0; i < size; i++) {
            C1741m c1741mM5090a = c1740lM5056q.m5090a(i);
            if (c1741mM5090a.m5096c()) {
                m5064a(c1741mM5090a);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m5084j() {
        return m5057r().m5033c();
    }

    /* JADX INFO: renamed from: j */
    public final void m5085j(String str) {
        m5057r().m5030a(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m5086k() {
        m5085j("");
        m5060a(0L);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5088m() {
        return m5087l();
    }

    /* JADX INFO: renamed from: a */
    public final void m5060a(long j) {
        m5057r().m5029a(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m5061a(InterfaceC1642a interfaceC1642a) {
        C1651b c1651bM5055p = m5055p();
        int size = c1651bM5055p.size();
        for (int i = 0; i < size; i++) {
            c1651bM5055p.m4740a(i).m4728a(interfaceC1642a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m5072d() {
        return this.f6510a.m5166n("serviceType");
    }

    /* JADX INFO: renamed from: n */
    private String m5053n() {
        return this.f6510a.m5166n("SCPDURL");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5069b(String str) {
        return m5051a(this.f6510a.m5166n("controlURL"), str);
    }

    /* JADX INFO: renamed from: g */
    public final String m5078g() {
        return this.f6510a.m5166n("eventSubURL");
    }

    /* JADX INFO: renamed from: r */
    private C1733e m5057r() {
        C1752c c1752c = this.f6510a;
        C1733e c1733e = (C1733e) c1752c.m5165n();
        if (c1733e == null) {
            C1733e c1733e2 = new C1733e();
            c1752c.m5140a(c1733e2);
            c1733e2.m5027a(c1752c);
            return c1733e2;
        }
        return c1733e;
    }

    /* JADX INFO: renamed from: g */
    public final void m5079g(String str) {
        String strM4997h = m5067b().m4986c().m4997h(str);
        String strM5072d = m5072d();
        String strM5058s = m5058s();
        C1728f c1728fM5067b = m5067b();
        C1673d c1673d = new C1673d();
        c1673d.m4630j(C1742n.m5101a());
        c1673d.m4828c(c1728fM5067b.m4996h());
        c1673d.m4606a("Location", strM4997h);
        c1673d.m4606a("NTS", "ssdp:alive");
        c1673d.m4606a("NT", strM5072d);
        c1673d.m4606a("USN", strM5058s);
        RunnableC1674e runnableC1674e = new RunnableC1674e(str);
        C1728f.m4964n();
        runnableC1674e.m4812a(c1673d);
    }

    /* JADX INFO: renamed from: h */
    public final void m5080h(String str) {
        String strM5072d = m5072d();
        String strM5058s = m5058s();
        C1673d c1673d = new C1673d();
        c1673d.m4606a("NTS", "ssdp:byebye");
        c1673d.m4606a("NT", strM5072d);
        c1673d.m4606a("USN", strM5058s);
        RunnableC1674e runnableC1674e = new RunnableC1674e(str);
        C1728f.m4964n();
        runnableC1674e.m4812a(c1673d);
    }

    /* JADX INFO: renamed from: a */
    public final void m5063a(C1664d c1664d) {
        m5057r().m5031b().add(c1664d);
    }

    /* JADX INFO: renamed from: b */
    public final void m5068b(C1664d c1664d) {
        m5057r().m5031b().remove(c1664d);
    }

    /* JADX INFO: renamed from: i */
    public final C1664d m5082i(String str) {
        String strM4758a;
        C1665e c1665eM5031b = m5057r().m5031b();
        int size = c1665eM5031b.size();
        for (int i = 0; i < size; i++) {
            C1664d c1664dM4769a = c1665eM5031b.m4769a(i);
            if (c1664dM4769a != null && (strM4758a = c1664dM4769a.m4758a()) != null && strM4758a.equals(str)) {
                return c1664dM4769a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m5064a(C1741m c1741m) {
        C1665e c1665eM5031b = m5057r().m5031b();
        int size = c1665eM5031b.size();
        C1664d[] c1664dArr = new C1664d[size];
        for (int i = 0; i < size; i++) {
            c1664dArr[i] = c1665eM5031b.m4769a(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            C1664d c1664d = c1664dArr[i2];
            if (c1664d != null && c1664d.m4765e()) {
                m5068b(c1664d);
            }
        }
        int size2 = c1665eM5031b.size();
        C1664d[] c1664dArr2 = new C1664d[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            c1664dArr2[i3] = c1665eM5031b.m4769a(i3);
        }
        for (int i4 = 0; i4 < size2; i4++) {
            C1664d c1664d2 = c1664dArr2[i4];
            if (c1664d2 != null) {
                String strM5094b = c1741m.m5094b();
                String strM5098e = c1741m.m5098e();
                String strM4761b = c1664d2.m4761b();
                int iM4764d = c1664d2.m4764d();
                C1661a c1661a = new C1661a();
                String strM4758a = c1664d2.m4758a();
                long jM4766f = c1664d2.m4766f();
                String strM4761b2 = c1664d2.m4761b();
                String strM4763c = c1664d2.m4763c();
                int iM4764d2 = c1664d2.m4764d();
                c1661a.m4656k("NOTIFY");
                c1661a.m4657l(strM4763c);
                c1661a.m4613b(strM4761b2, iM4764d2);
                c1661a.m4606a("NT", "upnp:event");
                c1661a.m4606a("NTS", "upnp:propchange");
                c1661a.m4606a("SID", C1666f.m4772b(strM4758a));
                c1661a.m4606a("SEQ", Long.toString(jM4766f));
                c1661a.m4623g("text/xml; charset=\"utf-8\"");
                C1752c c1752c = new C1752c("propertyset");
                c1752c.m5145c("xmlns:".concat(String.valueOf("e")), "urn:schemas-upnp-org:event-1-0");
                C1752c c1752c2 = new C1752c("property");
                c1752c.m5146c(c1752c2);
                C1752c c1752c3 = new C1752c(strM5094b);
                c1752c3.m5152g(strM5098e);
                c1752c2.m5146c(c1752c3);
                c1661a.m4622f(String.valueOf(String.valueOf(String.valueOf("") + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + c1752c.toString());
                if (c1661a.m4655c(strM4761b, iM4764d).m4672q()) {
                    c1664d2.m4767g();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5087l() {
        String strM5033c = m5057r().m5033c();
        return strM5033c != null && strM5033c.length() > 0;
    }
}
