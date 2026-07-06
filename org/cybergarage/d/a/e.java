package org.cybergarage.d.a;

import org.cybergarage.d.n;
import org.cybergarage.d.o;

/* JADX INFO: compiled from: ControlResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends org.cybergarage.c.c {
    private o a = new o();

    public e() {
        j(n.a());
    }

    public final void a(int i, String str) {
        b(500);
        org.cybergarage.xml.c cVarV = v();
        org.cybergarage.xml.c cVar = new org.cybergarage.xml.c("s:Fault");
        org.cybergarage.xml.c cVar2 = new org.cybergarage.xml.c("faultcode");
        cVar2.g("s:Client");
        cVar.c(cVar2);
        org.cybergarage.xml.c cVar3 = new org.cybergarage.xml.c("faultstring");
        cVar3.g("UPnPError");
        cVar.c(cVar3);
        org.cybergarage.xml.c cVar4 = new org.cybergarage.xml.c("detail");
        cVar.c(cVar4);
        org.cybergarage.xml.c cVar5 = new org.cybergarage.xml.c("UPnPError");
        cVar5.c("xmlns", "urn:schemas-upnp-org:control-1-0");
        cVar4.c(cVar5);
        org.cybergarage.xml.c cVar6 = new org.cybergarage.xml.c("errorCode");
        cVar6.g(Integer.toString(i));
        cVar5.c(cVar6);
        org.cybergarage.xml.c cVar7 = new org.cybergarage.xml.c("errorDescription");
        cVar7.g(str);
        cVar5.c(cVar7);
        cVarV.c(cVar);
        a(u());
    }

    public final void c(int i) {
        a(i, o.a(i));
    }
}
