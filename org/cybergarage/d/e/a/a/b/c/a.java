package org.cybergarage.d.e.a.a.b.c;

import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: ItemNode.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends org.cybergarage.d.e.a.a.b.a {
    private c a = new c();

    public a() {
        a("id", -1);
        f("item");
    }

    public static final boolean a(org.cybergarage.xml.c cVar) {
        String strH = cVar.h();
        if (strH == null) {
            return false;
        }
        return strH.equals("item");
    }

    @Override // org.cybergarage.xml.c
    public final boolean b(org.cybergarage.xml.c cVar) {
        int iK = cVar.k();
        for (int i = 0; i < iK; i++) {
            org.cybergarage.xml.c cVarC = cVar.c(i);
            if (!org.cybergarage.d.e.a.a.b.a.a.a(cVarC) && !a(cVarC)) {
                String strH = cVarC.h();
                if (strH == null ? false : strH.equals("res")) {
                    b bVar = new b();
                    bVar.b(cVarC);
                    this.a.add(bVar);
                } else {
                    b(cVarC.h(), cVarC.i());
                }
            }
        }
        int iJ = cVar.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            org.cybergarage.xml.a aVarB = cVar.b(i2);
            c(aVarB.a(), aVarB.b());
        }
        return true;
    }

    public final void a(String str, org.cybergarage.xml.b bVar) {
        org.cybergarage.d.e.a.a.b.c cVarA = a("upnp:albumArtURI", str);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            org.cybergarage.xml.a aVarA = bVar.a(i);
            cVarA.b(aVarA.a(), aVarA.b());
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        b(str, str4);
        a(str, str2, str3);
    }

    public final void a(String str, String str2, org.cybergarage.xml.b bVar) {
        org.cybergarage.d.e.a.a.b.c cVarA = a("res", str);
        cVarA.b("protocolInfo", str2);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            org.cybergarage.xml.a aVarA = bVar.a(i);
            cVarA.b(aVarA.a(), aVarA.b());
        }
    }

    public final void b(String str, String str2, org.cybergarage.xml.b bVar) {
        b("res", str);
        a("res", "protocolInfo", str2);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            org.cybergarage.xml.a aVarA = bVar.a(i);
            a("res", aVarA.a(), aVarA.b());
        }
    }

    public final long a() {
        String strB = b("dc:date");
        if (strB == null || strB.length() < 10) {
            return 0L;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(strB).getTime();
        } catch (Exception e) {
            return 0L;
        }
    }
}
