package org.cybergarage.p157d.p158a;

import org.cybergarage.p156c.C1640c;
import org.cybergarage.p157d.C1742n;
import org.cybergarage.p157d.C1743o;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.a.e */
/* JADX INFO: compiled from: ControlResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C1646e extends C1640c {

    /* JADX INFO: renamed from: a */
    private C1743o f6373a = new C1743o();

    public C1646e() {
        m4630j(C1742n.m5101a());
    }

    /* JADX INFO: renamed from: a */
    public final void m4738a(int i, String str) {
        m4671b(500);
        C1752c c1752cV = m4722v();
        C1752c c1752c = new C1752c("s:Fault");
        C1752c c1752c2 = new C1752c("faultcode");
        c1752c2.m5152g("s:Client");
        c1752c.m5146c(c1752c2);
        C1752c c1752c3 = new C1752c("faultstring");
        c1752c3.m5152g("UPnPError");
        c1752c.m5146c(c1752c3);
        C1752c c1752c4 = new C1752c("detail");
        c1752c.m5146c(c1752c4);
        C1752c c1752c5 = new C1752c("UPnPError");
        c1752c5.m5145c("xmlns", "urn:schemas-upnp-org:control-1-0");
        c1752c4.m5146c(c1752c5);
        C1752c c1752c6 = new C1752c("errorCode");
        c1752c6.m5152g(Integer.toString(i));
        c1752c5.m5146c(c1752c6);
        C1752c c1752c7 = new C1752c("errorDescription");
        c1752c7.m5152g(str);
        c1752c5.m5146c(c1752c7);
        c1752cV.m5146c(c1752c);
        m4720a(m4721u());
    }

    /* JADX INFO: renamed from: c */
    public final void m4739c(int i) {
        m4738a(i, C1743o.m5111a(i));
    }
}
