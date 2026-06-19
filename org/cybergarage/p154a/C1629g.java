package org.cybergarage.p154a;

import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.a.g */
/* JADX INFO: compiled from: HTTPResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C1629g extends C1626d {

    /* JADX INFO: renamed from: a */
    private int f6341a = 0;

    public C1629g() {
        m4604a("1.1");
        m4623g("text/html; charset=\"utf-8\"");
        m4630j(RunnableC1630h.m4676a());
        m4622f("");
    }

    public C1629g(C1629g c1629g) {
        m4608a(c1629g);
    }

    /* JADX INFO: renamed from: b */
    public final void m4671b(int i) {
        this.f6341a = i;
    }

    /* JADX INFO: renamed from: u */
    private int m4670u() {
        if (this.f6341a != 0) {
            return this.f6341a;
        }
        return new C1634l(m4612b()).m4698a();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4672q() {
        int iM4670u = m4670u();
        if (200 <= iM4670u && iM4670u < 300) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final String m4673r() {
        return "HTTP/" + m4600a() + " " + m4670u() + " " + C1634l.m4696a(this.f6341a) + "\r\n";
    }

    /* JADX INFO: renamed from: s */
    public String mo4674s() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m4673r());
        stringBuffer.append(m4617d());
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m4673r());
        stringBuffer.append(m4617d());
        stringBuffer.append("\r\n");
        stringBuffer.append(m4621f());
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: t */
    public void mo4675t() {
        C1744a.m5120b("[HTTPResponse.java] response content:\n" + toString());
    }
}
