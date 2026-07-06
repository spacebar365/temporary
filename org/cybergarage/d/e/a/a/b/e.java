package org.cybergarage.d.e.a.a.b;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: DIDLLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private b a = new b();

    public final void a(a aVar) {
        this.a.clear();
        this.a.add(aVar);
    }

    public final void b(a aVar) {
        this.a.add(aVar);
    }

    private void a(PrintWriter printWriter) {
        f fVar = new f();
        String strH = fVar.h();
        printWriter.print("<".concat(String.valueOf(strH)));
        fVar.a(printWriter);
        printWriter.println(">");
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.a(i).a(printWriter, 1, false);
        }
        printWriter.println("</" + strH + ">");
    }

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, "UTF-8"));
            a(printWriter);
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (UnsupportedEncodingException e) {
            org.cybergarage.e.a.a(e);
            return "";
        }
    }
}
