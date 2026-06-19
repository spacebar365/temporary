package org.cybergarage.p156c;

import org.cybergarage.p154a.C1629g;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.c.c */
/* JADX INFO: compiled from: SOAPResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C1640c extends C1629g {

    /* JADX INFO: renamed from: a */
    private C1752c f6367a;

    public C1640c() {
        C1752c c1752c = new C1752c("s:Envelope");
        c1752c.m5145c("xmlns:s", "http://schemas.xmlsoap.org/soap/envelope/");
        c1752c.m5145c("s:encodingStyle", "http://schemas.xmlsoap.org/soap/encoding/");
        c1752c.m5146c(new C1752c("s:Body"));
        this.f6367a = c1752c;
        m4623g("text/xml; charset=\"utf-8\"");
    }

    /* JADX INFO: renamed from: a */
    public final void m4720a(C1752c c1752c) {
        m4622f(String.valueOf(String.valueOf(String.valueOf("") + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + c1752c.toString());
    }

    @Override // org.cybergarage.p154a.C1629g
    /* JADX INFO: renamed from: t */
    public final void mo4675t() {
        C1752c c1752c;
        C1744a.m5120b("[SOAPResponse.java] Control/query results, content:\n" + toString());
        if (!m4624g() && (c1752c = this.f6367a) != null) {
            C1744a.m5120b(c1752c.toString());
        }
    }

    /* JADX INFO: renamed from: u */
    public final C1752c m4721u() {
        return this.f6367a;
    }

    /* JADX INFO: renamed from: v */
    public final C1752c m4722v() {
        C1752c c1752c = this.f6367a;
        if (c1752c == null) {
            return null;
        }
        return c1752c.m5163m("Body");
    }
}
