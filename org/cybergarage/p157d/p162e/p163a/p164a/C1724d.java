package org.cybergarage.p157d.p162e.p163a.p164a;

import java.util.StringTokenizer;
import org.cybergarage.p154a.C1627e;
import org.cybergarage.p154a.C1635m;
import org.cybergarage.p154a.C1636n;
import org.cybergarage.p157d.C1641a;
import org.cybergarage.p157d.C1741m;
import org.cybergarage.p157d.p158a.InterfaceC1642a;
import org.cybergarage.p157d.p158a.InterfaceC1647f;
import org.cybergarage.p157d.p162e.p163a.p164a.p165a.C1686a;
import org.cybergarage.p157d.p162e.p163a.p164a.p165a.C1687b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1692b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1709e;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1715h;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1717j;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1718k;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1719l;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1721n;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1722o;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1714g;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1690a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1691b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p169c.C1703a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p170d.C1707a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p170d.C1708b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p171e.C1710a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p171e.C1711b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p171e.C1712c;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1746c;
import org.cybergarage.p173e.C1747d;
import org.cybergarage.p173e.RunnableC1748e;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.d */
/* JADX INFO: compiled from: ContentDirectory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1724d extends RunnableC1748e implements InterfaceC1642a, InterfaceC1647f {

    /* JADX INFO: renamed from: a */
    private C1727g f6455a;

    /* JADX INFO: renamed from: b */
    private C1746c f6456b = new C1746c();

    /* JADX INFO: renamed from: f */
    private C1715h f6460f = new C1715h();

    /* JADX INFO: renamed from: g */
    private C1721n f6461g = new C1721n();

    /* JADX INFO: renamed from: h */
    private C1717j f6462h = new C1717j();

    /* JADX INFO: renamed from: i */
    private C1726f f6463i = new C1726f();

    /* JADX INFO: renamed from: c */
    private int f6457c = 0;

    /* JADX INFO: renamed from: d */
    private int f6458d = 0;

    /* JADX INFO: renamed from: j */
    private long f6464j = 2000;

    /* JADX INFO: renamed from: k */
    private long f6465k = 60000;

    /* JADX INFO: renamed from: e */
    private C1691b f6459e = new C1691b();

    public C1724d(C1727g c1727g) {
        this.f6455a = c1727g;
        this.f6459e.m4868a(this);
        m4932a(new C1712c());
        m4932a(new C1711b());
        m4932a(new C1710a());
        m4931a(new C1707a());
        m4931a(new C1708b());
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4939a() {
        this.f6457c++;
    }

    /* JADX INFO: renamed from: i */
    private synchronized int m4935i() {
        return this.f6457c;
    }

    /* JADX INFO: renamed from: b */
    public final C1691b m4942b() {
        return this.f6459e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4941a(InterfaceC1714g interfaceC1714g) {
        this.f6460f.add(interfaceC1714g);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1714g m4938a(int i) {
        return (InterfaceC1714g) this.f6460f.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m4943c() {
        return this.f6460f.size();
    }

    /* JADX INFO: renamed from: a */
    private boolean m4932a(InterfaceC1720m interfaceC1720m) {
        this.f6461g.add(interfaceC1720m);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC1720m m4929a(String str) {
        C1721n c1721n = this.f6461g;
        if (str == null) {
            return null;
        }
        int size = c1721n.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1720m interfaceC1720mM4923a = c1721n.m4923a(i);
            if (str.compareTo(interfaceC1720mM4923a.mo4904a()) == 0) {
                return interfaceC1720mM4923a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private String m4936j() {
        String str = "";
        int size = this.f6461g.size();
        for (int i = 0; i < size; i++) {
            String strMo4904a = this.f6461g.m4923a(i).mo4904a();
            if (i > 0) {
                str = String.valueOf(str) + ",";
            }
            str = String.valueOf(str) + strMo4904a;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4931a(InterfaceC1716i interfaceC1716i) {
        this.f6462h.add(interfaceC1716i);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private String m4937k() {
        String str = "";
        int size = this.f6462h.size();
        for (int i = 0; i < size; i++) {
            String strMo4898a = this.f6462h.m4905a(i).mo4898a();
            if (i > 0) {
                str = String.valueOf(str) + ",";
            }
            str = String.valueOf(str) + strMo4898a;
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4944d() {
        this.f6463i.removeAllElements();
        return true;
    }

    @Override // org.cybergarage.p157d.p158a.InterfaceC1642a
    /* JADX INFO: renamed from: a */
    public final boolean mo4734a(C1641a c1641a) {
        int i = 0;
        String strM4724a = c1641a.m4724a();
        if (strM4724a.equals("Browse")) {
            C1686a c1686a = new C1686a(c1641a);
            if (!"BrowseMetadata".equals(c1686a.m4730b("BrowseFlag"))) {
                if (!"BrowseDirectChildren".equals(c1686a.m4730b("BrowseFlag"))) {
                    return false;
                }
                String strB = c1686a.m4730b("ObjectID");
                AbstractC1689a abstractC1689aM4933b = m4933b(strB);
                if (abstractC1689aM4933b == null || !abstractC1689aM4933b.m4873c()) {
                    abstractC1689aM4933b = new C1690a();
                }
                C1690a c1690a = (C1690a) abstractC1689aM4933b;
                C1692b c1692b = new C1692b();
                int iK = c1690a.m5159k();
                for (int i2 = 0; i2 < iK; i2++) {
                    c1692b.add(c1690a.m4878a(i2));
                }
                String strB2 = c1686a.m4730b("SortCriteria");
                C1692b c1692bM4928a = !strB2.equals("+dc:title") ? m4928a(c1692b, strB2) : c1692b;
                int iC = c1686a.m4732c("StartingIndex");
                if (iC <= 0) {
                    iC = 0;
                }
                int iC2 = c1686a.m4732c("RequestedCount");
                if (iC2 == 0) {
                    iC2 = iK;
                }
                C1709e c1709e = new C1709e();
                while (iC < iK && i < iC2) {
                    AbstractC1689a abstractC1689aM4882a = c1692bM4928a.m4882a(iC);
                    c1709e.m4902b(abstractC1689aM4882a);
                    abstractC1689aM4882a.m5145c("parentID", strB);
                    i++;
                    iC++;
                }
                c1686a.m4727a("Result", c1709e.toString());
                c1686a.m4726a("NumberReturned", i);
                c1686a.m4726a("TotalMatches", iK);
                c1686a.m4726a("UpdateID", m4935i());
                return true;
            }
            AbstractC1689a abstractC1689aM4933b2 = m4933b(c1686a.m4730b("ObjectID"));
            if (abstractC1689aM4933b2 == null) {
                return false;
            }
            C1709e c1709e2 = new C1709e();
            c1709e2.m4901a(abstractC1689aM4933b2);
            c1686a.m4727a("Result", c1709e2.toString());
            c1686a.m4726a("NumberReturned", 1);
            c1686a.m4726a("TotalMatches", 1);
            c1686a.m4726a("UpdateID", m4935i());
            if (C1744a.m5122c()) {
                c1686a.m4733c();
            }
            return true;
        }
        if (strM4724a.equals("Search")) {
            C1687b c1687b = new C1687b(c1641a);
            AbstractC1689a abstractC1689aM4933b3 = m4933b(c1687b.m4730b("ContainerID"));
            if (abstractC1689aM4933b3 == null || !abstractC1689aM4933b3.m4873c()) {
                return false;
            }
            C1690a c1690a2 = (C1690a) abstractC1689aM4933b3;
            String strB3 = c1687b.m4730b("SearchCriteria");
            C1719l c1719l = new C1719l();
            if (strB3 != null && strB3.compareTo("*") != 0) {
                StringTokenizer stringTokenizer = new StringTokenizer(strB3, " \t\n\f\r");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String strNextToken2 = stringTokenizer.nextToken();
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String strNextToken3 = stringTokenizer.nextToken();
                    int iM5125a = C1747d.m5125a(strNextToken3, "\"", 0, strNextToken3.length() - 1, 1);
                    if (iM5125a >= 0) {
                        strNextToken3 = strNextToken3.substring(iM5125a, strNextToken3.length());
                        int iM5125a2 = C1747d.m5125a(strNextToken3, "\"", strNextToken3.length() - 1, 0, -1);
                        if (iM5125a2 >= 0) {
                            strNextToken3 = strNextToken3.substring(0, iM5125a2 + 1);
                        }
                    }
                    String strNextToken4 = "";
                    if (stringTokenizer.hasMoreTokens()) {
                        strNextToken4 = stringTokenizer.nextToken();
                    }
                    C1718k c1718k = new C1718k();
                    c1718k.m4907a(strNextToken);
                    c1718k.m4909b(strNextToken2);
                    c1718k.m4911c(strNextToken3);
                    c1718k.m4913d(strNextToken4);
                    c1719l.add(c1718k);
                }
            }
            C1717j c1717j = this.f6462h;
            C1692b c1692b2 = new C1692b();
            int iK2 = c1690a2.m5159k();
            for (int i3 = 0; i3 < iK2; i3++) {
                AbstractC1689a abstractC1689aM4878a = c1690a2.m4878a(i3);
                if (abstractC1689aM4878a.m4873c()) {
                    m4927a((C1690a) abstractC1689aM4878a, c1719l, c1717j, c1692b2);
                }
            }
            int size = c1692b2.size();
            C1692b c1692bM4928a2 = m4928a(c1692b2, c1687b.m4730b("SortCriteria"));
            int iC3 = c1687b.m4732c("StartingIndex");
            if (iC3 <= 0) {
                iC3 = 0;
            }
            int iC4 = c1687b.m4732c("RequestedCount");
            if (iC4 == 0) {
                iC4 = size;
            }
            C1709e c1709e3 = new C1709e();
            while (iC3 < size && i < iC4) {
                c1709e3.m4902b(c1692bM4928a2.m4882a(iC3));
                i++;
                iC3++;
            }
            c1687b.m4727a("Result", c1709e3.toString());
            c1687b.m4726a("NumberReturned", i);
            c1687b.m4726a("TotalMatches", size);
            c1687b.m4726a("UpdateID", m4935i());
            return true;
        }
        if (strM4724a.equals("GetSearchCapabilities")) {
            c1641a.m4725a("SearchCaps").m4751b(m4937k());
            return true;
        }
        if (strM4724a.equals("GetSortCapabilities")) {
            c1641a.m4725a("SortCaps").m4751b(m4936j());
            return true;
        }
        if (!strM4724a.equals("GetSystemUpdateID")) {
            return false;
        }
        c1641a.m4725a("Id").m4748a(m4935i());
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static void m4930a(AbstractC1689a[] abstractC1689aArr, InterfaceC1720m interfaceC1720m, boolean z) {
        int length = abstractC1689aArr.length;
        for (int i = 0; i < length - 1; i++) {
            int i2 = i;
            for (int i3 = i + 1; i3 < length; i3++) {
                int iMo4903a = interfaceC1720m.mo4903a(abstractC1689aArr[i2], abstractC1689aArr[i3]);
                if (z && iMo4903a < 0) {
                    i2 = i3;
                }
                if (!z && iMo4903a > 0) {
                    i2 = i3;
                }
            }
            AbstractC1689a abstractC1689a = abstractC1689aArr[i];
            abstractC1689aArr[i] = abstractC1689aArr[i2];
            abstractC1689aArr[i2] = abstractC1689a;
        }
    }

    /* JADX INFO: renamed from: c */
    private static C1722o m4934c(String str) {
        C1722o c1722o = new C1722o();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        while (stringTokenizer.hasMoreTokens()) {
            c1722o.add(stringTokenizer.nextToken());
        }
        return c1722o;
    }

    /* JADX INFO: renamed from: a */
    private C1692b m4928a(C1692b c1692b, String str) {
        if (str != null && str.length() > 0) {
            int size = c1692b.size();
            AbstractC1689a[] abstractC1689aArr = new AbstractC1689a[size];
            for (int i = 0; i < size; i++) {
                abstractC1689aArr[i] = c1692b.m4882a(i);
            }
            C1722o c1722oM4934c = m4934c(str);
            int size2 = c1722oM4934c.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strM4924a = c1722oM4934c.m4924a(i2);
                C1744a.m5120b("[" + i2 + "] = " + strM4924a);
                char cCharAt = strM4924a.charAt(0);
                boolean z = cCharAt != '-';
                if (cCharAt == '+' || cCharAt == '-') {
                    strM4924a = strM4924a.substring(1);
                }
                InterfaceC1720m interfaceC1720mM4929a = m4929a(strM4924a);
                if (interfaceC1720mM4929a != null) {
                    C1744a.m5120b("  ascSeq = ".concat(String.valueOf(z)));
                    C1744a.m5120b("  sortCap = " + interfaceC1720mM4929a.mo4904a());
                    m4930a(abstractC1689aArr, interfaceC1720mM4929a, z);
                }
            }
            c1692b = new C1692b();
            for (int i3 = 0; i3 < size; i3++) {
                c1692b.add(abstractC1689aArr[i3]);
            }
        }
        return c1692b;
    }

    /* JADX INFO: renamed from: a */
    public final void m4940a(C1627e c1627e) {
        if (!c1627e.m4665w().startsWith("/ExportContent")) {
            c1627e.m4647F();
            return;
        }
        C1636n c1636nM4666x = c1627e.m4666x();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c1636nM4666x.size()) {
                break;
            }
            C1635m c1635m = (C1635m) c1636nM4666x.get(i2);
            C1744a.m5120b("[" + c1635m.m4699a() + "] = " + c1635m.m4700b());
            i = i2 + 1;
        }
        AbstractC1689a abstractC1689aM4933b = m4933b(c1636nM4666x.m4701a("id"));
        if (abstractC1689aM4933b == null) {
            c1627e.m4647F();
        } else {
            if (!(abstractC1689aM4933b instanceof C1703a)) {
                c1627e.m4647F();
                return;
            }
            if (0 > 0) {
                "*/*".length();
            }
            c1627e.m4647F();
        }
    }

    /* JADX INFO: renamed from: b */
    private AbstractC1689a m4933b(String str) {
        return this.f6459e.m4881e(str);
    }

    /* JADX INFO: renamed from: a */
    private int m4927a(C1690a c1690a, C1719l c1719l, C1717j c1717j, C1692b c1692b) {
        InterfaceC1716i interfaceC1716iM4905a;
        boolean z = true;
        int size = c1719l.size();
        for (int i = 0; i < size; i++) {
            C1718k c1718kM4922a = c1719l.m4922a(i);
            String strM4906a = c1718kM4922a.m4906a();
            if (strM4906a == null) {
                c1718kM4922a.m4908a(true);
            } else {
                if (strM4906a != null) {
                    int size2 = c1717j.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            interfaceC1716iM4905a = null;
                            break;
                        }
                        interfaceC1716iM4905a = c1717j.m4905a(i2);
                        if (strM4906a.compareTo(interfaceC1716iM4905a.mo4898a()) == 0) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    interfaceC1716iM4905a = null;
                }
                if (interfaceC1716iM4905a == null) {
                    c1718kM4922a.m4908a(true);
                } else {
                    c1718kM4922a.m4908a(interfaceC1716iM4905a.mo4899a(c1718kM4922a, c1690a));
                }
            }
        }
        C1719l c1719l2 = new C1719l();
        for (int i3 = 0; i3 < size; i3++) {
            C1718k c1718kM4922a2 = c1719l.m4922a(i3);
            if (i3 < size - 1 && c1718kM4922a2.m4920j()) {
                C1718k c1718kM4922a3 = c1719l.m4922a(i3 + 1);
                c1718kM4922a3.m4908a(c1718kM4922a2.m4921k() & c1718kM4922a3.m4921k());
            } else {
                c1719l2.add(new C1718k(c1718kM4922a2));
            }
        }
        int size3 = c1719l2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z = false;
                break;
            }
            if (c1719l.m4922a(i4).m4921k()) {
                break;
            }
            i4++;
        }
        if (z) {
            c1692b.add(c1690a);
        }
        int iK = c1690a.m5159k();
        for (int i5 = 0; i5 < iK; i5++) {
            AbstractC1689a abstractC1689aM4878a = c1690a.m4878a(i5);
            if (abstractC1689aM4878a.m4873c()) {
                m4927a((C1690a) abstractC1689aM4878a, c1719l, c1717j, c1692b);
            }
        }
        return c1692b.size();
    }

    @Override // org.cybergarage.p173e.RunnableC1748e, java.lang.Runnable
    public final void run() {
        C1741m c1741mG = this.f6455a.m4995g("SystemUpdateID");
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (m5129g()) {
            try {
                Thread.sleep(this.f6464j);
            } catch (InterruptedException e) {
            }
            int iM4935i = m4935i();
            if (i != iM4935i) {
                c1741mG.m5092a(iM4935i);
                i = iM4935i;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (this.f6465k < jCurrentTimeMillis2 - jCurrentTimeMillis) {
                C1726f c1726f = this.f6463i;
                int size = c1726f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1725e abstractC1725e = (AbstractC1725e) c1726f.get(i2);
                    if (abstractC1725e.m4945a()) {
                        abstractC1725e.m5141a("childCount", abstractC1725e.m5159k());
                        abstractC1725e.m4870b().m4939a();
                    }
                }
                jCurrentTimeMillis = jCurrentTimeMillis2;
            }
        }
    }
}
