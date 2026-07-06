package org.cybergarage.a;

/* JADX INFO: compiled from: HTTPResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends d {
    private int a = 0;

    public g() {
        a("1.1");
        g("text/html; charset=\"utf-8\"");
        j(h.a());
        f("");
    }

    public g(g gVar) {
        a(gVar);
    }

    public final void b(int i) {
        this.a = i;
    }

    private int u() {
        if (this.a != 0) {
            return this.a;
        }
        return new l(b()).a();
    }

    public final boolean q() {
        int iU = u();
        if (200 <= iU && iU < 300) {
            return true;
        }
        return false;
    }

    public final String r() {
        return "HTTP/" + a() + " " + u() + " " + l.a(this.a) + "\r\n";
    }

    public String s() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(r());
        stringBuffer.append(d());
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(r());
        stringBuffer.append(d());
        stringBuffer.append("\r\n");
        stringBuffer.append(f());
        return stringBuffer.toString();
    }

    public void t() {
        org.cybergarage.e.a.b("[HTTPResponse.java] response content:\n" + toString());
    }
}
