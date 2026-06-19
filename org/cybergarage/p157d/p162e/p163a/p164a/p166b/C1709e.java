package org.cybergarage.p157d.p162e.p163a.p164a.p166b;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.e */
/* JADX INFO: compiled from: DIDLLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1709e {

    /* JADX INFO: renamed from: a */
    private C1692b f6445a = new C1692b();

    /* JADX INFO: renamed from: a */
    public final void m4901a(AbstractC1689a abstractC1689a) {
        this.f6445a.clear();
        this.f6445a.add(abstractC1689a);
    }

    /* JADX INFO: renamed from: b */
    public final void m4902b(AbstractC1689a abstractC1689a) {
        this.f6445a.add(abstractC1689a);
    }

    /* JADX INFO: renamed from: a */
    private void m4900a(PrintWriter printWriter) {
        C1713f c1713f = new C1713f();
        String strH = c1713f.m5153h();
        printWriter.print("<".concat(String.valueOf(strH)));
        c1713f.m5139a(printWriter);
        printWriter.println(">");
        int size = this.f6445a.size();
        for (int i = 0; i < size; i++) {
            this.f6445a.m4882a(i).mo4866a(printWriter, 1, false);
        }
        printWriter.println("</" + strH + ">");
    }

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, "UTF-8"));
            m4900a(printWriter);
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (UnsupportedEncodingException e) {
            C1744a.m5117a(e);
            return "";
        }
    }
}
