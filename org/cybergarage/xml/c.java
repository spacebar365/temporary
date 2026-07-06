package org.cybergarage.xml;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: Node.java */
/* JADX INFO: loaded from: classes.dex */
public class c {
    private c a;
    private String b;
    private String c;
    private b d;
    private d e;
    private Object f;

    public c() {
        this.a = null;
        this.b = new String();
        this.c = new String();
        this.d = new b();
        this.e = new d();
        this.f = null;
        this.f = null;
        this.a = null;
    }

    public c(String str) {
        this();
        this.b = str;
    }

    public final c f() {
        return this.a;
    }

    public final c g() {
        c cVar = null;
        for (c cVar2 = this.a; cVar2 != null; cVar2 = cVar2.a) {
            cVar = cVar2;
        }
        return cVar;
    }

    public final void f(String str) {
        this.b = str;
    }

    public final String h() {
        return this.b;
    }

    public final void g(String str) {
        this.c = str;
    }

    public final void h(String str) {
        if (this.c == null) {
            this.c = str;
        } else if (str != null) {
            this.c = String.valueOf(this.c) + str;
        }
    }

    public final String i() {
        return this.c;
    }

    public final int j() {
        return this.d.size();
    }

    public final a b(int i) {
        return this.d.a(i);
    }

    public final a i(String str) {
        return this.d.a(str);
    }

    public final void a(a aVar) {
        this.d.add(aVar);
    }

    public final void c(String str, String str2) {
        a aVarI = i(str);
        if (aVarI != null) {
            aVarI.a(str2);
        } else {
            a(new a(str, str2));
        }
    }

    public final void a(String str, int i) {
        c(str, Integer.toString(i));
    }

    public final String j(String str) {
        a aVarI = i(str);
        return aVarI != null ? aVarI.b() : "";
    }

    public final int k(String str) {
        try {
            return Integer.parseInt(j(str));
        } catch (Exception e) {
            return 0;
        }
    }

    public boolean b(c cVar) {
        if (cVar == null) {
            return false;
        }
        this.b = cVar.b;
        this.c = cVar.c;
        this.d.clear();
        int size = cVar.d.size();
        for (int i = 0; i < size; i++) {
            a(new a(cVar.b(i)));
        }
        this.e.clear();
        int size2 = cVar.e.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c cVarC = cVar.c(i2);
            c cVar2 = new c();
            cVar2.b(cVarC);
            c(cVar2);
        }
        return true;
    }

    public final int k() {
        return this.e.size();
    }

    public final c c(int i) {
        return this.e.a(i);
    }

    public final c l(String str) {
        return this.e.a(str);
    }

    public final c m(String str) {
        return this.e.b(str);
    }

    public final void l() {
        this.e.clear();
    }

    public final void d(String str, String str2) {
        c cVarL = l(str);
        if (cVarL == null) {
            cVarL = new c(str);
            c(cVarL);
        }
        cVarL.c = str2;
    }

    public final String n(String str) {
        c cVarL = l(str);
        return cVarL != null ? cVarL.c : "";
    }

    public final void a(Object obj) {
        this.f = obj;
    }

    public final Object n() {
        return this.f;
    }

    public static String a(int i, String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() * i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    private String a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        a(printWriter, 0, true);
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
        return a("utf-8");
    }

    public final void c(c cVar) {
        cVar.a = this;
        this.e.add(cVar);
    }

    public final void d(c cVar) {
        cVar.a = this;
        this.e.insertElementAt(cVar, 1);
    }

    public final boolean m() {
        return this.e.size() > 0;
    }

    public final void a(PrintWriter printWriter) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            a aVarB = b(i);
            printWriter.print(" " + aVarB.a() + "=\"" + g.a(aVarB.b()) + "\"");
        }
    }

    public void a(PrintWriter printWriter, int i, boolean z) {
        String strA = a(i, "   ");
        String str = this.b;
        String str2 = this.c;
        if (!m() || !z) {
            printWriter.print(String.valueOf(strA) + "<" + str);
            a(printWriter);
            if (str2 == null || str2.length() == 0) {
                printWriter.println("></" + str + ">");
                return;
            } else {
                printWriter.println(">" + g.a(str2) + "</" + str + ">");
                return;
            }
        }
        printWriter.print(String.valueOf(strA) + "<" + str);
        a(printWriter);
        printWriter.println(">");
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            c(i2).a(printWriter, i + 1, true);
        }
        printWriter.println(String.valueOf(strA) + "</" + str + ">");
    }
}
