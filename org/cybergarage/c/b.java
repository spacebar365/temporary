package org.cybergarage.c;

import java.io.ByteArrayInputStream;
import org.cybergarage.a.e;
import org.cybergarage.xml.f;

/* JADX INFO: compiled from: SOAPRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends e {
    private org.cybergarage.xml.c a;

    public b() {
        g("text/xml; charset=\"utf-8\"");
        k("POST");
    }

    private synchronized org.cybergarage.xml.c K() {
        org.cybergarage.xml.c cVar;
        if (this.a != null) {
            cVar = this.a;
        } else {
            try {
                this.a = a.a().a(new ByteArrayInputStream(e()));
            } catch (f e) {
                org.cybergarage.e.a.a(e);
            }
            cVar = this.a;
        }
        return cVar;
    }

    public final org.cybergarage.xml.c I() {
        return K();
    }

    @Override // org.cybergarage.a.e
    public final void H() {
        org.cybergarage.xml.c cVarK;
        org.cybergarage.e.a.b("[SOAPRequest.java] Connected to the control/query request, the content:\n" + toString());
        if (!g() && (cVarK = K()) != null) {
            org.cybergarage.e.a.b(cVarK.toString());
        }
    }

    public final org.cybergarage.xml.c J() {
        org.cybergarage.xml.c cVarK = K();
        if (cVarK != null && cVarK.m()) {
            return cVarK.c(0);
        }
        return null;
    }
}
