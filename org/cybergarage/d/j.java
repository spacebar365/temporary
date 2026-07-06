package org.cybergarage.d;

import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: Service.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private org.cybergarage.xml.c a;
    private org.cybergarage.e.c b;
    private Object c;

    public final org.cybergarage.xml.c a() {
        return this.a;
    }

    public j() {
        this(new org.cybergarage.xml.c("service"));
        org.cybergarage.xml.c cVar = new org.cybergarage.xml.c("specVersion");
        org.cybergarage.xml.c cVar2 = new org.cybergarage.xml.c("major");
        cVar2.g("1");
        cVar.c(cVar2);
        org.cybergarage.xml.c cVar3 = new org.cybergarage.xml.c("minor");
        cVar3.g("0");
        cVar.c(cVar3);
        org.cybergarage.xml.c cVar4 = new org.cybergarage.xml.c("scpd");
        cVar4.a(new org.cybergarage.xml.a("xmlns", "urn:schemas-upnp-org:service-1-0"));
        cVar4.c(cVar);
        r().b(cVar4);
    }

    public j(org.cybergarage.xml.c cVar) {
        this.b = new org.cybergarage.e.c();
        this.c = null;
        this.a = cVar;
    }

    public static boolean a(org.cybergarage.xml.c cVar) {
        return "service".equals(cVar.h());
    }

    public final f b() {
        org.cybergarage.xml.c cVarF;
        org.cybergarage.xml.c cVarG = this.a.g();
        org.cybergarage.xml.c cVarF2 = this.a.f();
        if (cVarF2 == null) {
            cVarF = null;
        } else {
            cVarF = cVarF2.f();
        }
        return new f(cVarG, cVarF);
    }

    public final f c() {
        return b().c();
    }

    public final void e() {
        org.cybergarage.xml.c cVarO = o();
        if (cVarO != null) {
            cVarO.a("configId", n.a(cVarO.toString()));
        }
    }

    public final int f() {
        org.cybergarage.xml.c cVarO = o();
        if (cVarO == null) {
            return 0;
        }
        return cVarO.k("configId");
    }

    private static boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str2.equals(str) || str2.equals(org.cybergarage.a.b.a(str, false));
    }

    public final boolean a(String str) {
        return a(n(), str);
    }

    public final boolean c(String str) {
        return a(g(), str);
    }

    public final boolean d(String str) throws org.cybergarage.d.b.c {
        try {
            org.cybergarage.xml.c cVarA = n.e().a(str);
            if (cVarA == null) {
                return false;
            }
            r().b(cVarA);
            return true;
        } catch (org.cybergarage.xml.f e) {
            throw new org.cybergarage.d.b.c(e);
        }
    }

    private org.cybergarage.xml.c o() {
        org.cybergarage.d.f.e eVarR = r();
        org.cybergarage.xml.c cVarA = eVarR.a();
        if (cVarA != null) {
            return cVarA;
        }
        f fVarC = b().c();
        if (fVarC == null) {
            return null;
        }
        String strN = n();
        String strD = fVarC.d();
        if (strD != null) {
            File file = new File(strD.concat(strN));
            if (file.exists()) {
                try {
                    cVarA = n.e().a(file);
                } catch (org.cybergarage.xml.f e) {
                    e.printStackTrace();
                }
                if (cVarA != null) {
                    eVarR.b(cVarA);
                    return cVarA;
                }
            }
        }
        try {
            org.cybergarage.xml.c cVarA2 = n.e().a(new URL(fVarC.a(strN)));
            if (cVarA2 != null) {
                eVarR.b(cVarA2);
                return cVarA2;
            }
        } catch (Exception e2) {
        }
        try {
            return n.e().a(new File(String.valueOf(fVarC.d()) + org.cybergarage.a.b.d(strN)));
        } catch (Exception e3) {
            org.cybergarage.e.a.a(e3);
            return null;
        }
    }

    public final byte[] h() {
        org.cybergarage.xml.c cVarO = o();
        if (cVarO == null) {
            return new byte[0];
        }
        return (String.valueOf(String.valueOf(String.valueOf(new String()) + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + cVarO.toString()).getBytes();
    }

    private b p() {
        org.cybergarage.xml.c cVarL;
        b bVar = new b();
        org.cybergarage.xml.c cVarO = o();
        if (cVarO != null && (cVarL = cVarO.l("actionList")) != null) {
            int iK = cVarL.k();
            for (int i = 0; i < iK; i++) {
                org.cybergarage.xml.c cVarC = cVarL.c(i);
                if ("action".equals(cVarC.h())) {
                    bVar.add(new a(this.a, cVarC));
                }
            }
        }
        return bVar;
    }

    public final a e(String str) {
        b bVarP = p();
        int size = bVarP.size();
        for (int i = 0; i < size; i++) {
            a aVarA = bVarP.a(i);
            String strA = aVarA.a();
            if (strA != null && strA.equals(str)) {
                return aVarA;
            }
        }
        return null;
    }

    private l q() {
        l lVar = new l();
        org.cybergarage.xml.c cVarL = o().l("serviceStateTable");
        if (cVarL != null) {
            org.cybergarage.xml.c cVar = this.a;
            int iK = cVarL.k();
            for (int i = 0; i < iK; i++) {
                org.cybergarage.xml.c cVarC = cVarL.c(i);
                if ("stateVariable".equals(cVarC.h())) {
                    lVar.add(new m(cVar, cVarC));
                }
            }
        }
        return lVar;
    }

    public final m f(String str) {
        l lVarQ = q();
        int size = lVarQ.size();
        for (int i = 0; i < size; i++) {
            m mVarA = lVarQ.a(i);
            String strB = mVarA.b();
            if (strB != null && strB.equals(str)) {
                return mVarA;
            }
        }
        return null;
    }

    private String s() {
        return String.valueOf(b().k()) + "::" + d();
    }

    public final boolean a(org.cybergarage.d.d.g gVar) {
        boolean zStartsWith = false;
        String strF = gVar.f();
        if (strF == null) {
            return false;
        }
        f fVarB = b();
        String strD = d();
        String strS = s();
        if (org.cybergarage.d.b.f.a(strF)) {
            fVarB.a(gVar, strD, strS);
        } else {
            if (strF != null) {
                zStartsWith = strF.startsWith("urn:schemas-upnp-org:service:") ? true : strF.startsWith("\"urn:schemas-upnp-org:service:");
            }
            if (zStartsWith) {
                String strD2 = d();
                if (strF.equals(strD2)) {
                    fVarB.a(gVar, strD2, strS);
                }
            }
        }
        return true;
    }

    public final void a(org.cybergarage.d.a.f fVar) {
        l lVarQ = q();
        int size = lVarQ.size();
        for (int i = 0; i < size; i++) {
            lVarQ.a(i).d().a(fVar);
        }
    }

    public final void i() {
        l lVarQ = q();
        int size = lVarQ.size();
        for (int i = 0; i < size; i++) {
            m mVarA = lVarQ.a(i);
            if (mVarA.c()) {
                a(mVarA);
            }
        }
    }

    public final String j() {
        return r().c();
    }

    public final void j(String str) {
        r().a(str);
    }

    public final void k() {
        j("");
        a(0L);
    }

    public final boolean m() {
        return l();
    }

    public final void a(long j) {
        r().a(j);
    }

    public final void a(org.cybergarage.d.a.a aVar) {
        b bVarP = p();
        int size = bVarP.size();
        for (int i = 0; i < size; i++) {
            bVarP.a(i).a(aVar);
        }
    }

    public final String d() {
        return this.a.n("serviceType");
    }

    private String n() {
        return this.a.n("SCPDURL");
    }

    public final boolean b(String str) {
        return a(this.a.n("controlURL"), str);
    }

    public final String g() {
        return this.a.n("eventSubURL");
    }

    private org.cybergarage.d.f.e r() {
        org.cybergarage.xml.c cVar = this.a;
        org.cybergarage.d.f.e eVar = (org.cybergarage.d.f.e) cVar.n();
        if (eVar == null) {
            org.cybergarage.d.f.e eVar2 = new org.cybergarage.d.f.e();
            cVar.a(eVar2);
            eVar2.a(cVar);
            return eVar2;
        }
        return eVar;
    }

    public final void g(String str) {
        String strH = b().c().h(str);
        String strD = d();
        String strS = s();
        f fVarB = b();
        org.cybergarage.d.d.d dVar = new org.cybergarage.d.d.d();
        dVar.j(n.a());
        dVar.c(fVarB.h());
        dVar.a("Location", strH);
        dVar.a("NTS", "ssdp:alive");
        dVar.a("NT", strD);
        dVar.a("USN", strS);
        org.cybergarage.d.d.e eVar = new org.cybergarage.d.d.e(str);
        f.n();
        eVar.a(dVar);
    }

    public final void h(String str) {
        String strD = d();
        String strS = s();
        org.cybergarage.d.d.d dVar = new org.cybergarage.d.d.d();
        dVar.a("NTS", "ssdp:byebye");
        dVar.a("NT", strD);
        dVar.a("USN", strS);
        org.cybergarage.d.d.e eVar = new org.cybergarage.d.d.e(str);
        f.n();
        eVar.a(dVar);
    }

    public final void a(org.cybergarage.d.c.d dVar) {
        r().b().add(dVar);
    }

    public final void b(org.cybergarage.d.c.d dVar) {
        r().b().remove(dVar);
    }

    public final org.cybergarage.d.c.d i(String str) {
        String strA;
        org.cybergarage.d.c.e eVarB = r().b();
        int size = eVarB.size();
        for (int i = 0; i < size; i++) {
            org.cybergarage.d.c.d dVarA = eVarB.a(i);
            if (dVarA != null && (strA = dVarA.a()) != null && strA.equals(str)) {
                return dVarA;
            }
        }
        return null;
    }

    public final void a(m mVar) {
        org.cybergarage.d.c.e eVarB = r().b();
        int size = eVarB.size();
        org.cybergarage.d.c.d[] dVarArr = new org.cybergarage.d.c.d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = eVarB.a(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            org.cybergarage.d.c.d dVar = dVarArr[i2];
            if (dVar != null && dVar.e()) {
                b(dVar);
            }
        }
        int size2 = eVarB.size();
        org.cybergarage.d.c.d[] dVarArr2 = new org.cybergarage.d.c.d[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            dVarArr2[i3] = eVarB.a(i3);
        }
        for (int i4 = 0; i4 < size2; i4++) {
            org.cybergarage.d.c.d dVar2 = dVarArr2[i4];
            if (dVar2 != null) {
                String strB = mVar.b();
                String strE = mVar.e();
                String strB2 = dVar2.b();
                int iD = dVar2.d();
                org.cybergarage.d.c.a aVar = new org.cybergarage.d.c.a();
                String strA = dVar2.a();
                long jF = dVar2.f();
                String strB3 = dVar2.b();
                String strC = dVar2.c();
                int iD2 = dVar2.d();
                aVar.k("NOTIFY");
                aVar.l(strC);
                aVar.b(strB3, iD2);
                aVar.a("NT", "upnp:event");
                aVar.a("NTS", "upnp:propchange");
                aVar.a("SID", org.cybergarage.d.c.f.b(strA));
                aVar.a("SEQ", Long.toString(jF));
                aVar.g("text/xml; charset=\"utf-8\"");
                org.cybergarage.xml.c cVar = new org.cybergarage.xml.c("propertyset");
                cVar.c("xmlns:".concat(String.valueOf("e")), "urn:schemas-upnp-org:event-1-0");
                org.cybergarage.xml.c cVar2 = new org.cybergarage.xml.c("property");
                cVar.c(cVar2);
                org.cybergarage.xml.c cVar3 = new org.cybergarage.xml.c(strB);
                cVar3.g(strE);
                cVar2.c(cVar3);
                aVar.f(String.valueOf(String.valueOf(String.valueOf("") + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + cVar.toString());
                if (aVar.c(strB2, iD).q()) {
                    dVar2.g();
                }
            }
        }
    }

    public final boolean l() {
        String strC = r().c();
        return strC != null && strC.length() > 0;
    }
}
