package org.cybergarage.xml;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: org.cybergarage.xml.c */
/* JADX INFO: compiled from: Node.java */
/* JADX INFO: loaded from: classes.dex */
public class C1752c {

    /* JADX INFO: renamed from: a */
    private C1752c f6526a;

    /* JADX INFO: renamed from: b */
    private String f6527b;

    /* JADX INFO: renamed from: c */
    private String f6528c;

    /* JADX INFO: renamed from: d */
    private C1751b f6529d;

    /* JADX INFO: renamed from: e */
    private C1753d f6530e;

    /* JADX INFO: renamed from: f */
    private Object f6531f;

    public C1752c() {
        this.f6526a = null;
        this.f6527b = new String();
        this.f6528c = new String();
        this.f6529d = new C1751b();
        this.f6530e = new C1753d();
        this.f6531f = null;
        this.f6531f = null;
        this.f6526a = null;
    }

    public C1752c(String str) {
        this();
        this.f6527b = str;
    }

    /* JADX INFO: renamed from: f */
    public final C1752c m5149f() {
        return this.f6526a;
    }

    /* JADX INFO: renamed from: g */
    public final C1752c m5151g() {
        C1752c c1752c = null;
        for (C1752c c1752c2 = this.f6526a; c1752c2 != null; c1752c2 = c1752c2.f6526a) {
            c1752c = c1752c2;
        }
        return c1752c;
    }

    /* JADX INFO: renamed from: f */
    public final void m5150f(String str) {
        this.f6527b = str;
    }

    /* JADX INFO: renamed from: h */
    public final String m5153h() {
        return this.f6527b;
    }

    /* JADX INFO: renamed from: g */
    public final void m5152g(String str) {
        this.f6528c = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m5154h(String str) {
        if (this.f6528c == null) {
            this.f6528c = str;
        } else if (str != null) {
            this.f6528c = String.valueOf(this.f6528c) + str;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m5155i() {
        return this.f6528c;
    }

    /* JADX INFO: renamed from: j */
    public final int m5157j() {
        return this.f6529d.size();
    }

    /* JADX INFO: renamed from: b */
    public final C1750a m5143b(int i) {
        return this.f6529d.m5135a(i);
    }

    /* JADX INFO: renamed from: i */
    public final C1750a m5156i(String str) {
        return this.f6529d.m5136a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m5142a(C1750a c1750a) {
        this.f6529d.add(c1750a);
    }

    /* JADX INFO: renamed from: c */
    public final void m5145c(String str, String str2) {
        C1750a c1750aM5156i = m5156i(str);
        if (c1750aM5156i != null) {
            c1750aM5156i.m5133a(str2);
        } else {
            m5142a(new C1750a(str, str2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5141a(String str, int i) {
        m5145c(str, Integer.toString(i));
    }

    /* JADX INFO: renamed from: j */
    public final String m5158j(String str) {
        C1750a c1750aM5156i = m5156i(str);
        return c1750aM5156i != null ? c1750aM5156i.m5134b() : "";
    }

    /* JADX INFO: renamed from: k */
    public final int m5160k(String str) {
        try {
            return Integer.parseInt(m5158j(str));
        } catch (Exception e) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo4880b(C1752c c1752c) {
        if (c1752c == null) {
            return false;
        }
        this.f6527b = c1752c.f6527b;
        this.f6528c = c1752c.f6528c;
        this.f6529d.clear();
        int size = c1752c.f6529d.size();
        for (int i = 0; i < size; i++) {
            m5142a(new C1750a(c1752c.m5143b(i)));
        }
        this.f6530e.clear();
        int size2 = c1752c.f6530e.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1752c c1752cM5144c = c1752c.m5144c(i2);
            C1752c c1752c2 = new C1752c();
            c1752c2.mo4880b(c1752cM5144c);
            m5146c(c1752c2);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final int m5159k() {
        return this.f6530e.size();
    }

    /* JADX INFO: renamed from: c */
    public final C1752c m5144c(int i) {
        return this.f6530e.m5167a(i);
    }

    /* JADX INFO: renamed from: l */
    public final C1752c m5161l(String str) {
        return this.f6530e.m5168a(str);
    }

    /* JADX INFO: renamed from: m */
    public final C1752c m5163m(String str) {
        return this.f6530e.m5169b(str);
    }

    /* JADX INFO: renamed from: l */
    public final void m5162l() {
        this.f6530e.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m5147d(String str, String str2) {
        C1752c c1752cM5161l = m5161l(str);
        if (c1752cM5161l == null) {
            c1752cM5161l = new C1752c(str);
            m5146c(c1752cM5161l);
        }
        c1752cM5161l.f6528c = str2;
    }

    /* JADX INFO: renamed from: n */
    public final String m5166n(String str) {
        C1752c c1752cM5161l = m5161l(str);
        return c1752cM5161l != null ? c1752cM5161l.f6528c : "";
    }

    /* JADX INFO: renamed from: a */
    public final void m5140a(Object obj) {
        this.f6531f = obj;
    }

    /* JADX INFO: renamed from: n */
    public final Object m5165n() {
        return this.f6531f;
    }

    /* JADX INFO: renamed from: a */
    public static String m5137a(int i, String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() * i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private String m5138a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        mo4866a(printWriter, 0, true);
        printWriter.flush();
        try {
            if (str.length() > 0) {
                return byteArrayOutputStream.toString(str);
            }
        } catch (UnsupportedEncodingException e) {
        }
        return byteArrayOutputStream.toString();
    }

    public String toString() {
        return m5138a("utf-8");
    }

    /* JADX INFO: renamed from: c */
    public final void m5146c(C1752c c1752c) {
        c1752c.f6526a = this;
        this.f6530e.add(c1752c);
    }

    /* JADX INFO: renamed from: d */
    public final void m5148d(C1752c c1752c) {
        c1752c.f6526a = this;
        this.f6530e.insertElementAt(c1752c, 1);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5164m() {
        return this.f6530e.size() > 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5139a(PrintWriter printWriter) {
        int size = this.f6529d.size();
        for (int i = 0; i < size; i++) {
            C1750a c1750aM5143b = m5143b(i);
            printWriter.print(" " + c1750aM5143b.m5132a() + "=\"" + C1756g.m5174a(c1750aM5143b.m5134b()) + "\"");
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo4866a(PrintWriter printWriter, int i, boolean z) {
        String strM5137a = m5137a(i, "   ");
        String str = this.f6527b;
        String str2 = this.f6528c;
        if (!m5164m() || !z) {
            printWriter.print(String.valueOf(strM5137a) + "<" + str);
            m5139a(printWriter);
            if (str2 == null || str2.length() == 0) {
                printWriter.println("></" + str + ">");
                return;
            } else {
                printWriter.println(">" + C1756g.m5174a(str2) + "</" + str + ">");
                return;
            }
        }
        printWriter.print(String.valueOf(strM5137a) + "<" + str);
        m5139a(printWriter);
        printWriter.println(">");
        int size = this.f6530e.size();
        for (int i2 = 0; i2 < size; i2++) {
            m5144c(i2).mo4866a(printWriter, i + 1, true);
        }
        printWriter.println(String.valueOf(strM5137a) + "</" + str + ">");
    }
}
