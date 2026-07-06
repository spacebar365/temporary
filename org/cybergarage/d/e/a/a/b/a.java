package org.cybergarage.d.e.a.a.b;

import java.io.PrintWriter;

/* JADX INFO: compiled from: ContentNode.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends org.cybergarage.xml.c {
    private org.cybergarage.d.e.a.a.d a;
    private d b = new d();

    public a() {
        a("id", 0);
        a("parentID", -1);
        a("restricted", 1);
        this.a = null;
    }

    public final void a(org.cybergarage.d.e.a.a.d dVar) {
        this.a = dVar;
    }

    public final org.cybergarage.d.e.a.a.d b() {
        return this.a;
    }

    public final boolean c() {
        return this instanceof org.cybergarage.d.e.a.a.b.a.a;
    }

    public final c a(String str) {
        d dVar = this.b;
        if (str == null) {
            return null;
        }
        int size = dVar.size();
        for (int i = 0; i < size; i++) {
            c cVarA = dVar.a(i);
            if (str.compareTo(cVarA.a()) == 0) {
                return cVarA;
            }
        }
        return null;
    }

    private void a(c cVar) {
        this.b.add(cVar);
    }

    public final c a(String str, String str2) {
        c cVar = new c(str, str2);
        a(cVar);
        return cVar;
    }

    public final void b(String str, String str2) {
        c cVarA = a(str);
        if (cVarA != null) {
            cVarA.a(str2 != null ? str2.replace("<", "").replace(">", "") : null);
        } else {
            a(new c(str, str2 != null ? str2.replace("<", "").replace(">", "") : null));
        }
    }

    public final String b(String str) {
        c cVarA = a(str);
        return cVarA != null ? cVarA.b() : "";
    }

    public final void a(String str, String str2, String str3) {
        c cVarA = a(str);
        if (cVarA == null) {
            cVarA = new c(str, "");
            a(cVarA);
        }
        cVarA.b(str2, str3);
    }

    public final void c(String str) {
        b("dc:title", str);
    }

    public final String d() {
        return b("dc:title");
    }

    public final void d(String str) {
        b("upnp:class", str);
    }

    public final String e() {
        return b("upnp:class");
    }

    private static void a(PrintWriter printWriter, c cVar) {
        int iC = cVar.c();
        for (int i = 0; i < iC; i++) {
            org.cybergarage.xml.a aVarA = cVar.a(i);
            printWriter.print(" " + aVarA.a() + "=\"" + aVarA.b() + "\"");
        }
    }

    @Override // org.cybergarage.xml.c
    public final void a(PrintWriter printWriter, int i, boolean z) {
        String strA = org.cybergarage.xml.c.a(i, "   ");
        String strH = h();
        String strI = i();
        if (!m()) {
            if (!(this.b.size() > 0)) {
                printWriter.print(String.valueOf(strA) + "<" + strH);
                a(printWriter);
                printWriter.println(">" + strI + "</" + strH + ">");
                return;
            }
        }
        printWriter.print(String.valueOf(strA) + "<" + strH);
        a(printWriter);
        printWriter.println(">");
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strA2 = org.cybergarage.xml.c.a(i + 1, "   ");
            c cVarA = this.b.a(i2);
            String strA3 = cVarA.a();
            String strB = cVarA.b();
            if (cVarA.c() > 0) {
                printWriter.print(String.valueOf(strA2) + "<" + strA3);
                a(printWriter, cVarA);
                printWriter.println(">" + strB + "</" + strA3 + ">");
            } else {
                printWriter.println(String.valueOf(strA2) + "<" + strA3 + ">" + strB + "</" + strA3 + ">");
            }
        }
        if (z) {
            int iK = k();
            for (int i3 = 0; i3 < iK; i3++) {
                c(i3).a(printWriter, i + 1, true);
            }
        }
        printWriter.println(String.valueOf(strA) + "</" + strH + ">");
    }
}
