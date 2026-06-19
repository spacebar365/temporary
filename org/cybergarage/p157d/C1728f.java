package org.cybergarage.p157d;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.cybergarage.p154a.C1624b;
import org.cybergarage.p154a.C1625c;
import org.cybergarage.p154a.C1627e;
import org.cybergarage.p154a.C1629g;
import org.cybergarage.p154a.C1631i;
import org.cybergarage.p154a.InterfaceC1628f;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p156c.C1640c;
import org.cybergarage.p157d.p158a.C1643b;
import org.cybergarage.p157d.p158a.C1644c;
import org.cybergarage.p157d.p158a.C1645d;
import org.cybergarage.p157d.p158a.C1648g;
import org.cybergarage.p157d.p158a.C1649h;
import org.cybergarage.p157d.p159b.C1652a;
import org.cybergarage.p157d.p159b.C1654c;
import org.cybergarage.p157d.p159b.C1657f;
import org.cybergarage.p157d.p159b.InterfaceC1656e;
import org.cybergarage.p157d.p159b.InterfaceC1658g;
import org.cybergarage.p157d.p160c.C1664d;
import org.cybergarage.p157d.p160c.C1667g;
import org.cybergarage.p157d.p160c.C1668h;
import org.cybergarage.p157d.p161d.C1672c;
import org.cybergarage.p157d.p161d.C1673d;
import org.cybergarage.p157d.p161d.C1676g;
import org.cybergarage.p157d.p161d.C1679j;
import org.cybergarage.p157d.p161d.C1683n;
import org.cybergarage.p157d.p161d.RunnableC1674e;
import org.cybergarage.p157d.p161d.RunnableC1680k;
import org.cybergarage.p157d.p172f.C1731c;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1746c;
import org.cybergarage.p173e.C1749f;
import org.cybergarage.xml.C1752c;
import org.cybergarage.xml.C1755f;

/* JADX INFO: renamed from: org.cybergarage.d.f */
/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes.dex */
public class C1728f implements InterfaceC1628f, InterfaceC1658g {

    /* JADX INFO: renamed from: i */
    private static Calendar f6468i;

    /* JADX INFO: renamed from: a */
    private C1752c f6469a;

    /* JADX INFO: renamed from: b */
    private C1752c f6470b;

    /* JADX INFO: renamed from: c */
    private C1746c f6471c;

    /* JADX INFO: renamed from: d */
    private boolean f6472d;

    /* JADX INFO: renamed from: e */
    private String f6473e;

    /* JADX INFO: renamed from: f */
    private int f6474f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1656e f6475g;

    /* JADX INFO: renamed from: h */
    private HashMap<String, byte[]> f6476h;

    /* JADX INFO: renamed from: j */
    private List<InetAddress> f6477j;

    /* JADX INFO: renamed from: k */
    private Object f6478k;

    /* JADX INFO: renamed from: a */
    public final C1752c m4979a() {
        if (this.f6469a != null) {
            return this.f6469a;
        }
        if (this.f6470b == null) {
            return null;
        }
        return this.f6470b.m5151g();
    }

    /* JADX INFO: renamed from: b */
    public final C1752c m4984b() {
        return this.f6470b;
    }

    static {
        C1742n.m5109g();
        f6468i = Calendar.getInstance();
    }

    public C1728f(C1752c c1752c, C1752c c1752c2) {
        this.f6471c = new C1746c();
        this.f6476h = new HashMap<>();
        this.f6478k = null;
        this.f6469a = c1752c;
        this.f6470b = c1752c2;
        this.f6473e = C1742n.m5105c();
        this.f6472d = false;
    }

    public C1728f() {
        this(null, null);
    }

    private C1728f(C1752c c1752c) {
        this(null, c1752c);
    }

    /* JADX INFO: renamed from: a */
    private String m4951a(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return new URL(str).toString();
        } catch (Exception e) {
            if ((str2 == null || str2.length() <= 0) && str3 != null && str3.length() > 0) {
                if (!str3.endsWith("/") || !str.startsWith("/")) {
                    try {
                        return new URL(String.valueOf(str3) + str).toString();
                    } catch (Exception e2) {
                        return new URL(C1624b.m4579a(str3, str)).toString();
                    }
                }
                try {
                    return new URL(String.valueOf(str3) + str.substring(1)).toString();
                } catch (Exception e3) {
                    return new URL(C1624b.m4579a(str3, str)).toString();
                }
                try {
                    return new URL(C1624b.m4579a(str3, str)).toString();
                } catch (Exception e4) {
                    C1728f c1728fM4986c = m4986c();
                    if (c1728fM4986c != null) {
                        String strM4994g = c1728fM4986c.m4994g();
                        str2 = C1624b.m4578a(C1624b.m4582b(strM4994g), C1624b.m4583c(strM4994g));
                    }
                    if (str2 == null && str2.length() > 0) {
                        if (!str2.endsWith("/") || !str.startsWith("/")) {
                            try {
                                return new URL(String.valueOf(str2) + str).toString();
                            } catch (Exception e5) {
                                return new URL(C1624b.m4579a(str2, str)).toString();
                            }
                        }
                        try {
                            return new URL(String.valueOf(str2) + str.substring(1)).toString();
                        } catch (Exception e6) {
                            return new URL(C1624b.m4579a(str2, str)).toString();
                        }
                        try {
                            return new URL(C1624b.m4579a(str2, str)).toString();
                        } catch (Exception e7) {
                            return str;
                        }
                    }
                }
            }
            return str2 == null ? str : str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m4978a(String str) {
        String strM4994g;
        String str2;
        C1728f c1728fM4986c = m4986c();
        if (c1728fM4986c != null) {
            String strM4998i = c1728fM4986c.m4998i();
            strM4994g = c1728fM4986c.m4994g();
            str2 = strM4998i;
        } else {
            strM4994g = null;
            str2 = null;
        }
        return m4951a(str, str2, strM4994g);
    }

    /* JADX INFO: renamed from: t */
    private int m4971t() {
        return (m4969s() && this.f6472d) ? 4 : 1;
    }

    /* JADX INFO: renamed from: a */
    private void m4956a(C1728f c1728f) {
        C1735g c1735gM5002l = c1728f.m5002l();
        int size = c1735gM5002l.size();
        int iM5160k = 0;
        for (int i = 0; i < size; i++) {
            C1728f c1728fM5038a = c1735gM5002l.m5038a(i);
            m4956a(c1728fM5038a);
            C1752c c1752c = c1728fM5038a.f6470b;
            iM5160k = ((c1752c == null ? 0 : c1752c.m5160k("configId")) + iM5160k) & 16777215;
        }
        C1739k c1739kM5003m = c1728f.m5003m();
        int size2 = c1739kM5003m.size();
        int iM5076f = iM5160k;
        for (int i2 = 0; i2 < size2; i2++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i2);
            c1738jM5089a.m5075e();
            iM5076f = (iM5076f + c1738jM5089a.m5076f()) & 16777215;
        }
        C1752c c1752c2 = this.f6470b;
        if (c1752c2 != null) {
            c1752c2.m5141a("configId", (iM5076f + C1742n.m5100a(c1752c2.toString())) & 16777215);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1728f m4986c() {
        C1752c c1752cM5161l;
        C1752c c1752cM4979a = m4979a();
        if (c1752cM4979a == null || (c1752cM5161l = c1752cM4979a.m5161l("device")) == null) {
            return null;
        }
        return new C1728f(c1752cM4979a, c1752cM5161l);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4985b(String str) throws C1654c {
        try {
            this.f6469a = C1742n.m5107e().m5172a(str);
            if (this.f6469a == null) {
                throw new C1654c("Couldn't find a root node");
            }
            this.f6470b = this.f6469a.m5161l("device");
            if (this.f6470b == null) {
                throw new C1654c("Couldn't find a root device node");
            }
            m4972u().m5011a("/description.xml");
            m4972u().m5020f();
            C1652a c1652aM5026l = m4972u().m5026l();
            if (c1652aM5026l != null) {
                m5004o();
                c1652aM5026l.m5130h();
                c1652aM5026l.m5128f();
            }
            m4980a(4004);
            String strM5001k = m5001k();
            if (!(strM5001k != null && strM5001k.length() > 0)) {
                m4987c("uuid:" + this.f6473e);
            }
            m4972u().m5017c();
            return true;
        } catch (C1755f e) {
            throw new C1654c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4957a(C1752c c1752c) {
        return "device".equals(c1752c.m5153h());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4991e() {
        return m4979a().m5161l("device").m5166n("UDN").equals(m5001k());
    }

    /* JADX INFO: renamed from: a */
    public final void m4981a(C1676g c1676g) {
        m4972u().m5013a(c1676g);
    }

    /* JADX INFO: renamed from: f */
    public final C1676g m4992f() {
        if (m4991e()) {
            return m4972u().m5025k();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m4994g() {
        C1676g c1676gM4992f = m4992f();
        return c1676gM4992f != null ? c1676gM4992f.m4821e() : m4972u().m5018d();
    }

    /* JADX INFO: renamed from: h */
    public final int m4996h() {
        C1676g c1676gM4992f = m4992f();
        return c1676gM4992f != null ? C1672c.m4811b(C1625c.m4586a(c1676gM4992f.m4820d(), "Cache-Control")) : m4972u().m5019e();
    }

    /* JADX INFO: renamed from: i */
    public final String m4998i() {
        return m4991e() ? m4979a().m5166n("URLBase") : "";
    }

    /* JADX INFO: renamed from: l */
    public final C1735g m5002l() {
        C1735g c1735g = new C1735g();
        C1752c c1752cM5161l = this.f6470b.m5161l("deviceList");
        if (c1752cM5161l != null) {
            int iM5159k = c1752cM5161l.m5159k();
            for (int i = 0; i < iM5159k; i++) {
                C1752c c1752cM5144c = c1752cM5161l.m5144c(i);
                if (m4957a(c1752cM5144c)) {
                    c1735g.add(new C1728f(c1752cM5144c));
                }
            }
        }
        return c1735g;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4989d(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(m5001k()) || str.equals(m5000j()) || str.endsWith(m4973v());
    }

    /* JADX INFO: renamed from: e */
    public final C1728f m4990e(String str) {
        C1735g c1735gM5002l = m5002l();
        int size = c1735gM5002l.size();
        for (int i = 0; i < size; i++) {
            C1728f c1728fM5038a = c1735gM5002l.m5038a(i);
            if (c1728fM5038a.m4989d(str)) {
                return c1728fM5038a;
            }
            C1728f c1728fM4990e = c1728fM5038a.m4990e(str);
            if (c1728fM4990e != null) {
                return c1728fM4990e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private C1728f m4960k(String str) {
        C1735g c1735gM5002l = m5002l();
        int size = c1735gM5002l.size();
        for (int i = 0; i < size; i++) {
            C1728f c1728fM5038a = c1735gM5002l.m5038a(i);
            if (c1728fM5038a.m4959j(str)) {
                return c1728fM5038a;
            }
            C1728f c1728fM4960k = c1728fM5038a.m4960k(str);
            if (c1728fM4960k != null) {
                return c1728fM4960k;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final C1739k m5003m() {
        C1739k c1739k = new C1739k();
        C1752c c1752cM5161l = this.f6470b.m5161l("serviceList");
        if (c1752cM5161l != null) {
            int iM5159k = c1752cM5161l.m5159k();
            for (int i = 0; i < iM5159k; i++) {
                C1752c c1752cM5144c = c1752cM5161l.m5144c(i);
                if (C1738j.m5052a(c1752cM5144c)) {
                    c1739k.add(new C1738j(c1752cM5144c));
                }
            }
        }
        return c1739k;
    }

    /* JADX INFO: renamed from: f */
    public final C1738j m4993f(String str) {
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            boolean z = str != null && (str.endsWith(c1738jM5089a.m5072d()) || str.endsWith(c1738jM5089a.m5059a().m5166n("serviceId")));
            if (z) {
                return c1738jM5089a;
            }
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1738j c1738jM4993f = c1735gM5002l.m5038a(i2).m4993f(str);
            if (c1738jM4993f != null) {
                return c1738jM4993f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private C1738j m4961l(String str) {
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            if (c1738jM5089a.m5065a(str)) {
                return c1738jM5089a;
            }
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1738j c1738jM4961l = c1735gM5002l.m5038a(i2).m4961l(str);
            if (c1738jM4961l != null) {
                return c1738jM4961l;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    private C1738j m4962m(String str) {
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            if (c1738jM5089a.m5069b(str)) {
                return c1738jM5089a;
            }
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1738j c1738jM4962m = c1735gM5002l.m5038a(i2).m4962m(str);
            if (c1738jM4962m != null) {
                return c1738jM4962m;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private C1738j m4963n(String str) {
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            if (c1738jM5089a.m5071c(str)) {
                return c1738jM5089a;
            }
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1738j c1738jM4963n = c1735gM5002l.m5038a(i2).m4963n(str);
            if (c1738jM4963n != null) {
                return c1738jM4963n;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private C1741m m4952a(String str, String str2) {
        C1741m c1741mM5077f;
        if (str == null && str2 == null) {
            return null;
        }
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            if ((str == null || c1738jM5089a.m5072d().equals(str)) && (c1741mM5077f = c1738jM5089a.m5077f(str2)) != null) {
                return c1741mM5077f;
            }
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1741m c1741mM4952a = c1735gM5002l.m5038a(i2).m4952a(str, str2);
            if (c1741mM4952a != null) {
                return c1741mM4952a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C1741m m4995g(String str) {
        return m4952a(null, str);
    }

    /* JADX INFO: renamed from: p */
    private static byte[] m4966p(String str) {
        byte[] byteArray = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                    return byteArray;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return byteArray;
        } catch (IOException e2) {
            e2.printStackTrace();
            return byteArray;
        }
    }

    /* JADX INFO: renamed from: w */
    private String m4974w() {
        return !m4991e() ? m5001k() : "upnp:rootdevice";
    }

    /* JADX INFO: renamed from: x */
    private String m4975x() {
        return !m4991e() ? m5001k() : String.valueOf(m5001k()) + "::upnp:rootdevice";
    }

    /* JADX INFO: renamed from: y */
    private String m4976y() {
        return String.valueOf(m5001k()) + "::" + m4973v();
    }

    /* JADX INFO: renamed from: n */
    public static final void m4964n() {
        C1749f.m5131a(300);
    }

    /* JADX INFO: renamed from: q */
    private void m4967q(String str) {
        String strM4997h = m4997h(str);
        RunnableC1674e runnableC1674e = new RunnableC1674e(str);
        C1673d c1673d = new C1673d();
        c1673d.m4630j(C1742n.m5101a());
        c1673d.m4828c(m4996h());
        c1673d.m4606a("Location", strM4997h);
        c1673d.m4606a("NTS", "ssdp:alive");
        c1673d.m4605a("BOOTID.UPNP.ORG", this.f6474f);
        if (m4991e()) {
            String strM4974w = m4974w();
            String strM4975x = m4975x();
            c1673d.m4606a("NT", strM4974w);
            c1673d.m4606a("USN", strM4975x);
            runnableC1674e.m4812a(c1673d);
            String strM5001k = m5001k();
            c1673d.m4606a("NT", strM5001k);
            c1673d.m4606a("USN", strM5001k);
            runnableC1674e.m4812a(c1673d);
        }
        String strM4973v = m4973v();
        String strM4976y = m4976y();
        c1673d.m4606a("NT", strM4973v);
        c1673d.m4606a("USN", strM4976y);
        runnableC1674e.m4812a(c1673d);
        runnableC1674e.m4802g();
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            c1739kM5003m.m5089a(i).m5079g(str);
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c1735gM5002l.m5038a(i2).m4967q(str);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m4968r(String str) {
        RunnableC1674e runnableC1674e = new RunnableC1674e(str);
        C1673d c1673d = new C1673d();
        c1673d.m4606a("NTS", "ssdp:byebye");
        if (m4991e()) {
            String strM4974w = m4974w();
            String strM4975x = m4975x();
            c1673d.m4606a("NT", strM4974w);
            c1673d.m4606a("USN", strM4975x);
            runnableC1674e.m4812a(c1673d);
        }
        String strM4973v = m4973v();
        String strM4976y = m4976y();
        c1673d.m4606a("NT", strM4973v);
        c1673d.m4606a("USN", strM4976y);
        runnableC1674e.m4812a(c1673d);
        runnableC1674e.m4802g();
        C1739k c1739kM5003m = m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            c1739kM5003m.m5089a(i).m5080h(str);
        }
        C1735g c1735gM5002l = m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c1735gM5002l.m5038a(i2).m4968r(str);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m4977z() {
        String[] strArr;
        InetAddress[] inetAddressArrM5022h = m4972u().m5022h();
        if (inetAddressArrM5022h != null) {
            String[] strArr2 = new String[inetAddressArrM5022h.length];
            for (int i = 0; i < inetAddressArrM5022h.length; i++) {
                strArr2[i] = inetAddressArrM5022h[i].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iM4709c = C1637a.m4709c();
            strArr = new String[iM4709c];
            for (int i2 = 0; i2 < iM4709c; i2++) {
                strArr[i2] = C1637a.m4703a(i2);
            }
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null && strArr[i3].length() > 0) {
                int iM4971t = m4971t();
                for (int i4 = 0; i4 < iM4971t; i4++) {
                    m4968r(strArr[i3]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4982a(C1676g c1676g, String str, String str2) {
        String strM4997h = m4986c().m4997h(c1676g.m4818b());
        C1679j c1679j = new C1679j();
        c1679j.m4606a("Cache-Control", "max-age=" + Integer.toString(m4996h()));
        c1679j.m4607a(f6468i);
        c1679j.m4606a("ST", str);
        c1679j.m4606a("USN", str2);
        c1679j.m4606a("Location", strM4997h);
        c1679j.m4605a("BOOTID.UPNP.ORG", this.f6474f);
        c1679j.m4606a("MYNAME", m5000j());
        C1749f.m5131a(C1625c.m4587b(c1676g.m4820d(), "MX") * 1000);
        String hostAddress = c1676g.m4815a().getAddress().getHostAddress();
        int port = c1676g.m4815a().getPort();
        RunnableC1680k runnableC1680k = new RunnableC1680k();
        int iM4971t = m4971t();
        for (int i = 0; i < iM4971t; i++) {
            runnableC1680k.m4806a(hostAddress, port, c1679j.mo4674s());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private void m4958c(C1676g c1676g) {
        boolean zStartsWith;
        boolean zStartsWith2;
        String strM4822f = c1676g.m4822f();
        if (strM4822f != null) {
            boolean zM4991e = m4991e();
            String strM5001k = m5001k();
            if (zM4991e) {
                strM5001k = String.valueOf(strM5001k) + "::upnp:rootdevice";
            }
            if (C1657f.m4742a(strM4822f)) {
                String strM4974w = m4974w();
                int i = zM4991e ? 3 : 2;
                for (int i2 = 0; i2 < i; i2++) {
                    m4982a(c1676g, strM4974w, strM5001k);
                }
            } else if (C1657f.m4743b(strM4822f)) {
                if (zM4991e) {
                    m4982a(c1676g, "upnp:rootdevice", strM5001k);
                }
            } else {
                if (strM4822f == null) {
                    zStartsWith = false;
                } else {
                    zStartsWith = strM4822f.startsWith("uuid") ? true : strM4822f.startsWith("\"uuid");
                }
                if (zStartsWith) {
                    String strM5001k2 = m5001k();
                    if (strM4822f.equals(strM5001k2)) {
                        m4982a(c1676g, strM5001k2, strM5001k);
                    }
                } else {
                    if (strM4822f == null) {
                        zStartsWith2 = false;
                    } else {
                        zStartsWith2 = strM4822f.startsWith("urn:schemas-upnp-org:device:") ? true : strM4822f.startsWith("\"urn:schemas-upnp-org:device:");
                    }
                    if (zStartsWith2) {
                        String strM4973v = m4973v();
                        if (strM4822f.equals(strM4973v)) {
                            m4982a(c1676g, strM4973v, String.valueOf(m5001k()) + "::" + strM4973v);
                        }
                    }
                }
            }
            C1739k c1739kM5003m = m5003m();
            int size = c1739kM5003m.size();
            for (int i3 = 0; i3 < size; i3++) {
                c1739kM5003m.m5089a(i3).m5066a(c1676g);
            }
            C1735g c1735gM5002l = m5002l();
            int size2 = c1735gM5002l.size();
            for (int i4 = 0; i4 < size2; i4++) {
                c1735gM5002l.m5038a(i4).m4958c(c1676g);
            }
        }
    }

    @Override // org.cybergarage.p157d.p159b.InterfaceC1658g
    /* JADX INFO: renamed from: b */
    public final void mo4744b(C1676g c1676g) {
        m4958c(c1676g);
    }

    /* JADX INFO: renamed from: a */
    public final void m4980a(int i) {
        m4972u().m5010a(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m4999i(String str) {
        String[] strArrSplit = str.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            try {
                if (!str2.isEmpty()) {
                    arrayList.add(InetAddress.getByName(str2));
                }
            } catch (UnknownHostException e) {
                System.err.println(String.valueOf(C1728f.class.getName()) + ".setWhiteList(" + str + ")");
                System.err.println(e);
            }
        }
        this.f6477j = arrayList;
    }

    /* JADX INFO: renamed from: s */
    private synchronized byte[] m4970s(String str) {
        byte[] bytes;
        if (!m4969s()) {
            String strM4704a = C1637a.m4704a(str, m4972u().m5023i(), "");
            if (m4991e()) {
                C1752c c1752cM5161l = m4979a().m5161l("URLBase");
                if (c1752cM5161l != null) {
                    c1752cM5161l.m5152g(strM4704a);
                } else {
                    C1752c c1752c = new C1752c("URLBase");
                    c1752c.m5152g(strM4704a);
                    m4979a().m5164m();
                    m4979a().m5148d(c1752c);
                }
            }
        }
        C1752c c1752cM4979a = m4979a();
        if (c1752cM4979a == null) {
            bytes = new byte[0];
        } else {
            bytes = (String.valueOf(String.valueOf(String.valueOf(new String()) + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + c1752cM4979a.toString()).getBytes();
        }
        return bytes;
    }

    /* JADX INFO: renamed from: a */
    private static void m4953a(C1645d c1645d) {
        C1644c c1644c = new C1644c();
        c1644c.m4739c(401);
        c1645d.m4652a((C1629g) c1644c);
    }

    /* JADX INFO: renamed from: a */
    private static void m4955a(C1667g c1667g) {
        C1668h c1668h = new C1668h();
        c1668h.m4789u();
        c1667g.m4783a(c1668h);
    }

    /* JADX INFO: renamed from: a */
    private void m4954a(C1652a c1652a) {
        m4972u().m5012a(c1652a);
    }

    /* JADX INFO: renamed from: p */
    public boolean mo4946p() {
        m4950A();
        m4972u().m5016b(C1637a.m4712d());
        m4972u().m5014a(C1637a.m4712d());
        int iM5023i = m4972u().m5023i();
        C1631i c1631iM5021g = m4972u().m5021g();
        int i = 0;
        while (!c1631iM5021g.m4688b(iM5023i)) {
            i++;
            if (100 < i) {
                return false;
            }
            m4980a(iM5023i + 1);
            iM5023i = m4972u().m5023i();
        }
        int size = c1631iM5021g.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1631iM5021g.m4685a(i2).m4680a(this);
        }
        int size2 = c1631iM5021g.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c1631iM5021g.m4685a(i3).m4683c();
        }
        C1683n c1683nM5024j = m4972u().m5024j();
        c1683nM5024j.m4836a();
        int size3 = c1683nM5024j.size();
        for (int i4 = 0; i4 < size3; i4++) {
            c1683nM5024j.m4835a(i4).m4832a(this);
        }
        int size4 = c1683nM5024j.size();
        for (int i5 = 0; i5 < size4; i5++) {
            c1683nM5024j.m4835a(i5).m4833i();
        }
        this.f6474f = C1742n.m5106d();
        m4956a(this);
        m5004o();
        C1652a c1652a = new C1652a(this);
        m4954a(c1652a);
        c1652a.m5128f();
        return true;
    }

    /* JADX INFO: renamed from: A */
    private boolean m4950A() {
        m4977z();
        C1631i c1631iM5021g = m4972u().m5021g();
        c1631iM5021g.m4687b();
        c1631iM5021g.m4686a();
        c1631iM5021g.clear();
        C1683n c1683nM5024j = m4972u().m5024j();
        c1683nM5024j.m4838c();
        c1683nM5024j.m4837b();
        c1683nM5024j.clear();
        C1652a c1652aM5026l = m4972u().m5026l();
        if (c1652aM5026l != null) {
            c1652aM5026l.m5130h();
            m4954a((C1652a) null);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo4947q() {
        return m4950A();
    }

    /* JADX INFO: renamed from: r */
    public String mo4948r() {
        C1676g c1676gM4992f = m4992f();
        return c1676gM4992f == null ? "" : c1676gM4992f.m4818b();
    }

    /* JADX INFO: renamed from: s */
    private boolean m4969s() {
        C1752c c1752c = this.f6470b;
        return (c1752c == null || c1752c.m5161l("INMPR03") == null) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    private C1731c m4972u() {
        C1752c c1752c = this.f6470b;
        C1731c c1731c = (C1731c) c1752c.m5165n();
        if (c1731c == null) {
            C1731c c1731c2 = new C1731c();
            c1752c.m5140a(c1731c2);
            c1731c2.m5027a(c1752c);
            return c1731c2;
        }
        return c1731c;
    }

    /* JADX INFO: renamed from: j */
    private boolean m4959j(String str) {
        String strM5015b = m4972u().m5015b();
        if (str == null || strM5015b == null) {
            return false;
        }
        return strM5015b.equals(str);
    }

    /* JADX INFO: renamed from: d */
    public final String m4988d() {
        File fileM5009a = m4972u().m5009a();
        return fileM5009a == null ? "" : fileM5009a.getAbsoluteFile().getParent();
    }

    /* JADX INFO: renamed from: v */
    private String m4973v() {
        return this.f6470b.m5166n("deviceType");
    }

    /* JADX INFO: renamed from: j */
    public final String m5000j() {
        return this.f6470b.m5166n("friendlyName");
    }

    /* JADX INFO: renamed from: c */
    public final void m4987c(String str) {
        this.f6470b.m5147d("UDN", str);
    }

    /* JADX INFO: renamed from: k */
    public final String m5001k() {
        return this.f6470b.m5166n("UDN");
    }

    /* JADX INFO: renamed from: o */
    private C1736h m4965o(String str) {
        String strM5047c;
        C1737i c1737i = new C1737i();
        C1752c c1752cM5161l = this.f6470b.m5161l("iconList");
        if (c1752cM5161l != null) {
            int iM5159k = c1752cM5161l.m5159k();
            for (int i = 0; i < iM5159k; i++) {
                C1752c c1752cM5144c = c1752cM5161l.m5144c(i);
                if (C1736h.m5039a(c1752cM5144c)) {
                    C1736h c1736h = new C1736h(c1752cM5144c);
                    if (c1736h.m5048d()) {
                        byte[] bArr = this.f6476h.get(c1736h.m5047c());
                        if (bArr != null) {
                            c1736h.m5043a(bArr);
                        } else {
                            C1728f c1728fM4986c = m4986c();
                            if (c1728fM4986c != null) {
                                String strM5047c2 = c1736h.m5047c();
                                String strM4988d = c1728fM4986c.m4988d();
                                if (strM4988d != null) {
                                    File file = new File(strM4988d.concat(strM5047c2));
                                    if (file.exists()) {
                                        c1736h.m5043a(m4966p(file.getPath()));
                                    }
                                }
                            }
                        }
                    }
                    c1737i.add(c1736h);
                }
            }
        }
        if (c1737i.size() <= 0) {
            return null;
        }
        int size = c1737i.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1736h c1736h2 = (C1736h) c1737i.get(i2);
            boolean zEquals = (str == null || (strM5047c = c1736h2.m5047c()) == null) ? false : strM5047c.equals(str);
            if (zEquals) {
                return c1736h2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4983a(C1736h c1736h) {
        C1752c c1752c = this.f6470b;
        if (c1752c == null) {
            return false;
        }
        C1752c c1752cM5161l = c1752c.m5161l("iconList");
        if (c1752cM5161l == null) {
            c1752cM5161l = new C1752c("iconList");
            c1752c.m5146c(c1752cM5161l);
        }
        C1752c c1752c2 = new C1752c("icon");
        if (c1736h.m5040a() != null) {
            c1752c2.mo4880b(c1736h.m5040a());
        }
        c1752cM5161l.m5146c(c1752c2);
        if (c1736h.m5048d() && c1736h.m5049e()) {
            this.f6476h.put(c1736h.m5047c(), c1736h.m5050f());
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final String m4997h(String str) {
        return C1637a.m4704a(str, m4972u().m5023i(), m4972u().m5015b());
    }

    /* JADX INFO: renamed from: o */
    public final void m5004o() {
        String[] strArr;
        C1749f.m5131a(300);
        InetAddress[] inetAddressArrM5022h = m4972u().m5022h();
        if (inetAddressArrM5022h != null) {
            String[] strArr2 = new String[inetAddressArrM5022h.length];
            for (int i = 0; i < inetAddressArrM5022h.length; i++) {
                strArr2[i] = inetAddressArrM5022h[i].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iM4709c = C1637a.m4709c();
            strArr = new String[iM4709c];
            for (int i2 = 0; i2 < iM4709c; i2++) {
                strArr[i2] = C1637a.m4703a(i2);
            }
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null && strArr[i3].length() != 0) {
                int iM4971t = m4971t();
                for (int i4 = 0; i4 < iM4971t; i4++) {
                    m4967q(strArr[i3]);
                }
            }
        }
    }

    @Override // org.cybergarage.p154a.InterfaceC1628f
    /* JADX INFO: renamed from: a */
    public void mo4669a(C1627e c1627e) {
        String str;
        String strM5166n;
        boolean zEquals;
        C1660c c1660cM4792a;
        C1752c c1752cM5144c;
        String strM5155i;
        String strM4665w;
        String strM5166n2;
        boolean zM5049e = false;
        if (this.f6475g != null) {
            boolean zStartsWith = (!c1627e.m4659q() || (strM4665w = c1627e.m4665w()) == null || (strM5166n2 = this.f6470b.m5166n("presentationURL")) == null) ? false : strM4665w.startsWith(strM5166n2);
            if (zStartsWith) {
                return;
            }
        }
        if (this.f6477j != null && !this.f6477j.isEmpty() && !this.f6477j.contains(c1627e.m4643B())) {
            c1627e.m4648G();
            return;
        }
        if (!c1627e.m4659q() && !c1627e.m4661s()) {
            if (!c1627e.m4660r()) {
                if (c1627e.m4662t() || c1627e.m4663u()) {
                    C1667g c1667g = new C1667g(c1627e);
                    C1738j c1738jM4963n = m4963n(c1667g.m4665w());
                    if (c1738jM4963n == null) {
                        c1667g.m4647F();
                        return;
                    }
                    if (c1667g.m4778J() || c1667g.m4780L()) {
                        if (!c1667g.m4663u()) {
                            if (!c1667g.m4778J()) {
                                if (c1667g.m4780L()) {
                                    String strM4779K = c1667g.m4779K();
                                    C1664d c1664dM5082i = c1738jM4963n.m5082i(strM4779K);
                                    if (c1664dM5082i == null) {
                                        m4955a(c1667g);
                                        return;
                                    }
                                    long jM4781M = c1667g.m4781M();
                                    c1664dM5082i.m4759a(jM4781M);
                                    c1664dM5082i.m4768h();
                                    C1668h c1668h = new C1668h();
                                    c1668h.m4671b(200);
                                    c1668h.m4788k(strM4779K);
                                    c1668h.m4787b(jM4781M);
                                    c1667g.m4783a(c1668h);
                                    if (!C1744a.m5122c()) {
                                        return;
                                    }
                                    c1668h.mo4675t();
                                    return;
                                }
                            } else {
                                String strM4777I = c1667g.m4777I();
                                try {
                                    new URL(strM4777I);
                                    long jM4781M2 = c1667g.m4781M();
                                    String strM5105c = C1742n.m5105c();
                                    C1664d c1664d = new C1664d();
                                    c1664d.m4762b(strM4777I);
                                    c1664d.m4759a(jM4781M2);
                                    c1664d.m4760a(strM5105c);
                                    c1738jM4963n.m5063a(c1664d);
                                    C1668h c1668h2 = new C1668h();
                                    c1668h2.m4671b(200);
                                    c1668h2.m4788k(strM5105c);
                                    c1668h2.m4787b(jM4781M2);
                                    if (C1744a.m5122c()) {
                                        c1668h2.mo4675t();
                                    }
                                    c1667g.m4783a(c1668h2);
                                    if (C1744a.m5122c()) {
                                        c1668h2.mo4675t();
                                    }
                                    c1738jM4963n.m5083i();
                                    return;
                                } catch (Exception e) {
                                    m4955a(c1667g);
                                    return;
                                }
                            }
                        } else {
                            C1664d c1664dM5082i2 = c1738jM4963n.m5082i(c1667g.m4779K());
                            if (c1664dM5082i2 == null) {
                                m4955a(c1667g);
                                return;
                            }
                            c1738jM4963n.m5068b(c1664dM5082i2);
                            C1668h c1668h3 = new C1668h();
                            c1668h3.m4671b(200);
                            c1667g.m4783a(c1668h3);
                            if (C1744a.m5122c()) {
                                c1668h3.mo4675t();
                                return;
                            }
                            return;
                        }
                    }
                    m4955a(c1667g);
                    return;
                }
                c1627e.m4647F();
                return;
            }
            if (!c1627e.m4614b("SOAPACTION")) {
                c1627e.m4647F();
                return;
            }
            C1738j c1738jM4962m = m4962m(c1627e.m4665w());
            if (c1738jM4962m != null) {
                C1643b c1643b = new C1643b(c1627e);
                String strC = c1643b.m4615c("SOAPACTION");
                if (strC == null) {
                    zEquals = false;
                } else if (strC.equals("urn:schemas-upnp-org:control-1-0#QueryStateVariable")) {
                    zEquals = true;
                } else {
                    String strD = c1643b.m4618d("SOAPACTION");
                    zEquals = strD == null ? false : strD.equals("urn:schemas-upnp-org:control-1-0#QueryStateVariable");
                }
                if (zEquals) {
                    C1648g c1648g = new C1648g(c1643b);
                    C1752c c1752cJ = c1648g.m4719J();
                    C1752c c1752cM5144c2 = (c1752cJ != null && c1752cJ.m5164m() && (c1752cM5144c = c1752cJ.m5144c(0)) != null && c1752cM5144c.m5164m()) ? c1752cM5144c.m5144c(0) : null;
                    if (c1752cM5144c2 == null) {
                        strM5155i = "";
                    } else {
                        strM5155i = c1752cM5144c2.m5155i();
                    }
                    if (!(c1738jM4962m.m5077f(strM5155i) != null)) {
                        m4953a((C1645d) c1648g);
                        return;
                    }
                    C1741m c1741mM4952a = m4952a(null, strM5155i);
                    if (c1741mM4952a.m5097d().m5037b() != null) {
                        C1649h c1649h = new C1649h();
                        C1741m c1741m = new C1741m();
                        c1741m.m5091a().m5147d("name", c1741mM4952a.m5094b());
                        c1741m.m5093a(c1741mM4952a.m5098e());
                        c1741m.m5091a().m5147d("dataType", c1741mM4952a.m5091a().m5166n("dataType"));
                        c1741m.m5091a().m5145c("sendEvents", c1741mM4952a.m5096c() ? "yes" : "no");
                        c1741m.m5093a("");
                        c1741m.m5095b(C1743o.m5111a(404));
                        C1743o c1743oM5099f = c1741m.m5099f();
                        c1649h.m4738a(c1743oM5099f.m5112a(), c1743oM5099f.m5114b());
                        c1648g.m4652a((C1629g) c1649h);
                        zM5049e = true;
                    }
                    if (!zM5049e) {
                        m4953a((C1645d) c1648g);
                        return;
                    }
                    return;
                }
                C1643b c1643b2 = new C1643b(c1643b);
                C1641a c1641aM5074e = c1738jM4962m.m5074e(c1643b2.m4736K());
                if (c1641aM5074e == null) {
                    m4953a((C1645d) c1643b2);
                    return;
                }
                C1669d c1669dM4731b = c1641aM5074e.m4731b();
                C1669d c1669dM4737L = c1643b2.m4737L();
                try {
                    int size = c1669dM4731b.size();
                    for (int i = 0; i < size; i++) {
                        C1660c c1660cM4792a2 = c1669dM4731b.m4792a(i);
                        if (c1660cM4792a2.m4752c()) {
                            String strM4747a = c1660cM4792a2.m4747a();
                            int size2 = c1669dM4737L.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size2) {
                                    c1660cM4792a = null;
                                    break;
                                }
                                c1660cM4792a = c1669dM4737L.m4792a(i2);
                                String strM4747a2 = c1660cM4792a.m4747a();
                                if (strM4747a2 != null && strM4747a2.equals(strM4747a)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (c1660cM4792a == null) {
                                throw new IllegalArgumentException("Argument \"" + strM4747a + "\" missing.");
                            }
                            c1660cM4792a2.m4751b(c1660cM4792a.m4754e());
                        }
                    }
                    if (!c1641aM5074e.m4729a(c1643b2)) {
                        m4953a((C1645d) c1643b2);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e2) {
                    C1644c c1644c = new C1644c();
                    c1644c.m4739c(402);
                    c1643b2.m4652a((C1629g) c1644c);
                    return;
                }
            }
            C1640c c1640c = new C1640c();
            c1640c.m4671b(400);
            c1627e.m4652a((C1629g) c1640c);
            return;
        }
        String strM4665w2 = c1627e.m4665w();
        C1744a.m5120b("[Device.java] httpGetRequestReceived() ".concat(String.valueOf(strM4665w2)));
        if (strM4665w2 == null) {
            c1627e.m4647F();
            return;
        }
        byte[] bArrM5050f = new byte[0];
        if (m4959j(strM4665w2)) {
            String strM4642A = c1627e.m4642A();
            if (strM4642A == null || strM4642A.length() <= 0) {
                strM4642A = C1637a.m4702a();
            }
            strM5166n = "text/xml; charset=\"utf-8\"";
            bArrM5050f = m4970s(strM4642A);
            str = "en";
        } else {
            C1728f c1728fM4960k = m4960k(strM4665w2);
            if (c1728fM4960k != null) {
                str = "en";
                bArrM5050f = c1728fM4960k.m4970s(c1627e.m4642A());
                strM5166n = "text/xml; charset=\"utf-8\"";
            } else {
                C1738j c1738jM4961l = m4961l(strM4665w2);
                if (c1738jM4961l != null) {
                    str = "en";
                    bArrM5050f = c1738jM4961l.m5081h();
                    strM5166n = "text/xml; charset=\"utf-8\"";
                } else {
                    if (this.f6476h.get(strM4665w2) == null) {
                        C1736h c1736hM4965o = m4965o(strM4665w2);
                        if (c1736hM4965o != null) {
                            zM5049e = c1736hM4965o.m5049e();
                        }
                    } else {
                        zM5049e = true;
                    }
                    if (zM5049e) {
                        C1736h c1736hM4965o2 = m4965o(strM4665w2);
                        if (c1736hM4965o2 != null) {
                            strM5166n = c1736hM4965o2.m5040a().m5166n("mimetype");
                            bArrM5050f = c1736hM4965o2.m5050f();
                            str = null;
                        } else {
                            str = null;
                            strM5166n = null;
                        }
                    } else {
                        c1627e.m4647F();
                        return;
                    }
                }
            }
        }
        C1629g c1629g = new C1629g();
        c1629g.m4671b(200);
        if (strM5166n != null) {
            c1629g.m4623g(strM5166n);
        }
        if (str != null) {
            c1629g.m4626h(str);
        }
        c1629g.m4609a(bArrM5050f);
        c1627e.m4652a(c1629g);
    }
}
