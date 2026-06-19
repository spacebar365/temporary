package org.cybergarage.p156c;

import java.io.ByteArrayInputStream;
import org.cybergarage.p154a.C1627e;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.xml.C1752c;
import org.cybergarage.xml.C1755f;

/* JADX INFO: renamed from: org.cybergarage.c.b */
/* JADX INFO: compiled from: SOAPRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class C1639b extends C1627e {

    /* JADX INFO: renamed from: a */
    private C1752c f6366a;

    public C1639b() {
        m4623g("text/xml; charset=\"utf-8\"");
        m4656k("POST");
    }

    /* JADX INFO: renamed from: K */
    private synchronized C1752c m4717K() {
        C1752c c1752c;
        if (this.f6366a != null) {
            c1752c = this.f6366a;
        } else {
            try {
                this.f6366a = C1638a.m4715a().mo5171a(new ByteArrayInputStream(m4620e()));
            } catch (C1755f e) {
                C1744a.m5117a(e);
            }
            c1752c = this.f6366a;
        }
        return c1752c;
    }

    /* JADX INFO: renamed from: I */
    public final C1752c m4718I() {
        return m4717K();
    }

    @Override // org.cybergarage.p154a.C1627e
    /* JADX INFO: renamed from: H */
    public final void mo4649H() {
        C1752c c1752cM4717K;
        C1744a.m5120b("[SOAPRequest.java] Connected to the control/query request, the content:\n" + toString());
        if (!m4624g() && (c1752cM4717K = m4717K()) != null) {
            C1744a.m5120b(c1752cM4717K.toString());
        }
    }

    /* JADX INFO: renamed from: J */
    public final C1752c m4719J() {
        C1752c c1752cM4717K = m4717K();
        if (c1752cM4717K != null && c1752cM4717K.m5164m()) {
            return c1752cM4717K.m5144c(0);
        }
        return null;
    }
}
