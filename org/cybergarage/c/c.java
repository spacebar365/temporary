package org.cybergarage.c;

import org.cybergarage.a.g;

/* JADX INFO: compiled from: SOAPResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends g {
    private org.cybergarage.xml.c a;

    public c() {
        org.cybergarage.xml.c cVar = new org.cybergarage.xml.c("s:Envelope");
        cVar.c("xmlns:s", "http://schemas.xmlsoap.org/soap/envelope/");
        cVar.c("s:encodingStyle", "http://schemas.xmlsoap.org/soap/encoding/");
        cVar.c(new org.cybergarage.xml.c("s:Body"));
        this.a = cVar;
        g("text/xml; charset=\"utf-8\"");
    }

    public final void a(org.cybergarage.xml.c cVar) {
        f(String.valueOf(String.valueOf(String.valueOf("") + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + cVar.toString());
    }

    @Override // org.cybergarage.a.g
    public final void t() {
        org.cybergarage.xml.c cVar;
        org.cybergarage.e.a.b("[SOAPResponse.java] Control/query results, content:\n" + toString());
        if (!g() && (cVar = this.a) != null) {
            org.cybergarage.e.a.b(cVar.toString());
        }
    }

    public final org.cybergarage.xml.c u() {
        return this.a;
    }

    public final org.cybergarage.xml.c v() {
        org.cybergarage.xml.c cVar = this.a;
        if (cVar == null) {
            return null;
        }
        return cVar.m("Body");
    }
}
