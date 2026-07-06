package org.cybergarage.d;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes.dex */
public class f implements org.cybergarage.a.f, org.cybergarage.d.b.g {
    private static Calendar i;
    private org.cybergarage.xml.c a;
    private org.cybergarage.xml.c b;
    private org.cybergarage.e.c c;
    private boolean d;
    private String e;
    private int f;
    private org.cybergarage.d.b.e g;
    private HashMap<String, byte[]> h;
    private List<InetAddress> j;
    private Object k;

    public final org.cybergarage.xml.c a() {
        if (this.a != null) {
            return this.a;
        }
        if (this.b == null) {
            return null;
        }
        return this.b.g();
    }

    public final org.cybergarage.xml.c b() {
        return this.b;
    }

    static {
        n.g();
        i = Calendar.getInstance();
    }

    public f(org.cybergarage.xml.c cVar, org.cybergarage.xml.c cVar2) {
        this.c = new org.cybergarage.e.c();
        this.h = new HashMap<>();
        this.k = null;
        this.a = cVar;
        this.b = cVar2;
        this.e = n.c();
        this.d = false;
    }

    public f() {
        this(null, null);
    }

    private f(org.cybergarage.xml.c cVar) {
        this(null, cVar);
    }

    private String a(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return new URL(str).toString();
        } catch (Exception e) {
            if ((str2 == null || str2.length() <= 0) && str3 != null && str3.length() > 0) {
                if (!str3.endsWith("/") || !str.startsWith("/")) {
                    try {
                        return new URL(String.valueOf(str3) + str).toString();
                    } catch (Exception e2) {
                        return new URL(org.cybergarage.a.b.a(str3, str)).toString();
                    }
                }
                try {
                    return new URL(String.valueOf(str3) + str.substring(1)).toString();
                } catch (Exception e3) {
                    return new URL(org.cybergarage.a.b.a(str3, str)).toString();
                }
                try {
                    return new URL(org.cybergarage.a.b.a(str3, str)).toString();
                } catch (Exception e4) {
                    f fVarC = c();
                    if (fVarC != null) {
                        String strG = fVarC.g();
                        str2 = org.cybergarage.a.b.a(org.cybergarage.a.b.b(strG), org.cybergarage.a.b.c(strG));
                    }
                    if (str2 == null && str2.length() > 0) {
                        if (!str2.endsWith("/") || !str.startsWith("/")) {
                            try {
                                return new URL(String.valueOf(str2) + str).toString();
                            } catch (Exception e5) {
                                return new URL(org.cybergarage.a.b.a(str2, str)).toString();
                            }
                        }
                        try {
                            return new URL(String.valueOf(str2) + str.substring(1)).toString();
                        } catch (Exception e6) {
                            return new URL(org.cybergarage.a.b.a(str2, str)).toString();
                        }
                        try {
                            return new URL(org.cybergarage.a.b.a(str2, str)).toString();
                        } catch (Exception e7) {
                            return str;
                        }
                    }
                }
            }
            return str2 == null ? str : str;
        }
    }

    public final String a(String str) {
        String strG;
        String str2;
        f fVarC = c();
        if (fVarC != null) {
            String strI = fVarC.i();
            strG = fVarC.g();
            str2 = strI;
        } else {
            strG = null;
            str2 = null;
        }
        return a(str, str2, strG);
    }

    private int t() {
        return (s() && this.d) ? 4 : 1;
    }

    private void a(f fVar) {
        g gVarL = fVar.l();
        int size = gVarL.size();
        int iK = 0;
        for (int i2 = 0; i2 < size; i2++) {
            f fVarA = gVarL.a(i2);
            a(fVarA);
            org.cybergarage.xml.c cVar = fVarA.b;
            iK = ((cVar == null ? 0 : cVar.k("configId")) + iK) & 16777215;
        }
        k kVarM = fVar.m();
        int size2 = kVarM.size();
        int iF = iK;
        for (int i3 = 0; i3 < size2; i3++) {
            j jVarA = kVarM.a(i3);
            jVarA.e();
            iF = (iF + jVarA.f()) & 16777215;
        }
        org.cybergarage.xml.c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.a("configId", (iF + n.a(cVar2.toString())) & 16777215);
        }
    }

    public final f c() {
        org.cybergarage.xml.c cVarL;
        org.cybergarage.xml.c cVarA = a();
        if (cVarA == null || (cVarL = cVarA.l("device")) == null) {
            return null;
        }
        return new f(cVarA, cVarL);
    }

    public final boolean b(String str) throws org.cybergarage.d.b.c {
        try {
            this.a = n.e().a(str);
            if (this.a == null) {
                throw new org.cybergarage.d.b.c("Couldn't find a root node");
            }
            this.b = this.a.l("device");
            if (this.b == null) {
                throw new org.cybergarage.d.b.c("Couldn't find a root device node");
            }
            u().a("/description.xml");
            u().f();
            org.cybergarage.d.b.a aVarL = u().l();
            if (aVarL != null) {
                o();
                aVarL.h();
                aVarL.f();
            }
            a(4004);
            String strK = k();
            if (!(strK != null && strK.length() > 0)) {
                c("uuid:" + this.e);
            }
            u().c();
            return true;
        } catch (org.cybergarage.xml.f e) {
            throw new org.cybergarage.d.b.c(e);
        }
    }

    private static boolean a(org.cybergarage.xml.c cVar) {
        return "device".equals(cVar.h());
    }

    public final boolean e() {
        return a().l("device").n("UDN").equals(k());
    }

    public final void a(org.cybergarage.d.d.g gVar) {
        u().a(gVar);
    }

    public final org.cybergarage.d.d.g f() {
        if (e()) {
            return u().k();
        }
        return null;
    }

    public final String g() {
        org.cybergarage.d.d.g gVarF = f();
        return gVarF != null ? gVarF.e() : u().d();
    }

    public final int h() {
        org.cybergarage.d.d.g gVarF = f();
        return gVarF != null ? org.cybergarage.d.d.c.b(org.cybergarage.a.c.a(gVarF.d(), "Cache-Control")) : u().e();
    }

    public final String i() {
        return e() ? a().n("URLBase") : "";
    }

    public final g l() {
        g gVar = new g();
        org.cybergarage.xml.c cVarL = this.b.l("deviceList");
        if (cVarL != null) {
            int iK = cVarL.k();
            for (int i2 = 0; i2 < iK; i2++) {
                org.cybergarage.xml.c cVarC = cVarL.c(i2);
                if (a(cVarC)) {
                    gVar.add(new f(cVarC));
                }
            }
        }
        return gVar;
    }

    public final boolean d(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(k()) || str.equals(j()) || str.endsWith(v());
    }

    public final f e(String str) {
        g gVarL = l();
        int size = gVarL.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVarA = gVarL.a(i2);
            if (fVarA.d(str)) {
                return fVarA;
            }
            f fVarE = fVarA.e(str);
            if (fVarE != null) {
                return fVarE;
            }
        }
        return null;
    }

    private f k(String str) {
        g gVarL = l();
        int size = gVarL.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVarA = gVarL.a(i2);
            if (fVarA.j(str)) {
                return fVarA;
            }
            f fVarK = fVarA.k(str);
            if (fVarK != null) {
                return fVarK;
            }
        }
        return null;
    }

    public final k m() {
        k kVar = new k();
        org.cybergarage.xml.c cVarL = this.b.l("serviceList");
        if (cVarL != null) {
            int iK = cVarL.k();
            for (int i2 = 0; i2 < iK; i2++) {
                org.cybergarage.xml.c cVarC = cVarL.c(i2);
                if (j.a(cVarC)) {
                    kVar.add(new j(cVarC));
                }
            }
        }
        return kVar;
    }

    public final j f(String str) {
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVarA = kVarM.a(i2);
            boolean z = str != null && (str.endsWith(jVarA.d()) || str.endsWith(jVarA.a().n("serviceId")));
            if (z) {
                return jVarA;
            }
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j jVarF = gVarL.a(i3).f(str);
            if (jVarF != null) {
                return jVarF;
            }
        }
        return null;
    }

    private j l(String str) {
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVarA = kVarM.a(i2);
            if (jVarA.a(str)) {
                return jVarA;
            }
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j jVarL = gVarL.a(i3).l(str);
            if (jVarL != null) {
                return jVarL;
            }
        }
        return null;
    }

    private j m(String str) {
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVarA = kVarM.a(i2);
            if (jVarA.b(str)) {
                return jVarA;
            }
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j jVarM = gVarL.a(i3).m(str);
            if (jVarM != null) {
                return jVarM;
            }
        }
        return null;
    }

    private j n(String str) {
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVarA = kVarM.a(i2);
            if (jVarA.c(str)) {
                return jVarA;
            }
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j jVarN = gVarL.a(i3).n(str);
            if (jVarN != null) {
                return jVarN;
            }
        }
        return null;
    }

    private m a(String str, String str2) {
        m mVarF;
        if (str == null && str2 == null) {
            return null;
        }
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVarA = kVarM.a(i2);
            if ((str == null || jVarA.d().equals(str)) && (mVarF = jVarA.f(str2)) != null) {
                return mVarF;
            }
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            m mVarA = gVarL.a(i3).a(str, str2);
            if (mVarA != null) {
                return mVarA;
            }
        }
        return null;
    }

    public final m g(String str) {
        return a(null, str);
    }

    private static byte[] p(String str) {
        byte[] byteArray = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                } else {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                    return byteArray;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return byteArray;
        } catch (IOException e2) {
            e2.printStackTrace();
            return byteArray;
        }
    }

    private String w() {
        return !e() ? k() : "upnp:rootdevice";
    }

    private String x() {
        return !e() ? k() : String.valueOf(k()) + "::upnp:rootdevice";
    }

    private String y() {
        return String.valueOf(k()) + "::" + v();
    }

    public static final void n() {
        org.cybergarage.e.f.a(300);
    }

    private void q(String str) {
        String strH = h(str);
        org.cybergarage.d.d.e eVar = new org.cybergarage.d.d.e(str);
        org.cybergarage.d.d.d dVar = new org.cybergarage.d.d.d();
        dVar.j(n.a());
        dVar.c(h());
        dVar.a("Location", strH);
        dVar.a("NTS", "ssdp:alive");
        dVar.a("BOOTID.UPNP.ORG", this.f);
        if (e()) {
            String strW = w();
            String strX = x();
            dVar.a("NT", strW);
            dVar.a("USN", strX);
            eVar.a(dVar);
            String strK = k();
            dVar.a("NT", strK);
            dVar.a("USN", strK);
            eVar.a(dVar);
        }
        String strV = v();
        String strY = y();
        dVar.a("NT", strV);
        dVar.a("USN", strY);
        eVar.a(dVar);
        eVar.g();
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            kVarM.a(i2).g(str);
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            gVarL.a(i3).q(str);
        }
    }

    private void r(String str) {
        org.cybergarage.d.d.e eVar = new org.cybergarage.d.d.e(str);
        org.cybergarage.d.d.d dVar = new org.cybergarage.d.d.d();
        dVar.a("NTS", "ssdp:byebye");
        if (e()) {
            String strW = w();
            String strX = x();
            dVar.a("NT", strW);
            dVar.a("USN", strX);
            eVar.a(dVar);
        }
        String strV = v();
        String strY = y();
        dVar.a("NT", strV);
        dVar.a("USN", strY);
        eVar.a(dVar);
        eVar.g();
        k kVarM = m();
        int size = kVarM.size();
        for (int i2 = 0; i2 < size; i2++) {
            kVarM.a(i2).h(str);
        }
        g gVarL = l();
        int size2 = gVarL.size();
        for (int i3 = 0; i3 < size2; i3++) {
            gVarL.a(i3).r(str);
        }
    }

    private void z() {
        String[] strArr;
        InetAddress[] inetAddressArrH = u().h();
        if (inetAddressArrH != null) {
            String[] strArr2 = new String[inetAddressArrH.length];
            for (int i2 = 0; i2 < inetAddressArrH.length; i2++) {
                strArr2[i2] = inetAddressArrH[i2].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iC = org.cybergarage.b.a.c();
            strArr = new String[iC];
            for (int i3 = 0; i3 < iC; i3++) {
                strArr[i3] = org.cybergarage.b.a.a(i3);
            }
        }
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4] != null && strArr[i4].length() > 0) {
                int iT = t();
                for (int i5 = 0; i5 < iT; i5++) {
                    r(strArr[i4]);
                }
            }
        }
    }

    public final boolean a(org.cybergarage.d.d.g gVar, String str, String str2) {
        String strH = c().h(gVar.b());
        org.cybergarage.d.d.j jVar = new org.cybergarage.d.d.j();
        jVar.a("Cache-Control", "max-age=" + Integer.toString(h()));
        jVar.a(i);
        jVar.a("ST", str);
        jVar.a("USN", str2);
        jVar.a("Location", strH);
        jVar.a("BOOTID.UPNP.ORG", this.f);
        jVar.a("MYNAME", j());
        org.cybergarage.e.f.a(org.cybergarage.a.c.b(gVar.d(), "MX") * 1000);
        String hostAddress = gVar.a().getAddress().getHostAddress();
        int port = gVar.a().getPort();
        org.cybergarage.d.d.k kVar = new org.cybergarage.d.d.k();
        int iT = t();
        for (int i2 = 0; i2 < iT; i2++) {
            kVar.a(hostAddress, port, jVar.s());
        }
        return true;
    }

    private void c(org.cybergarage.d.d.g gVar) {
        boolean zStartsWith;
        boolean zStartsWith2;
        String strF = gVar.f();
        if (strF != null) {
            boolean zE = e();
            String strK = k();
            if (zE) {
                strK = String.valueOf(strK) + "::upnp:rootdevice";
            }
            if (org.cybergarage.d.b.f.a(strF)) {
                String strW = w();
                int i2 = zE ? 3 : 2;
                for (int i3 = 0; i3 < i2; i3++) {
                    a(gVar, strW, strK);
                }
            } else if (org.cybergarage.d.b.f.b(strF)) {
                if (zE) {
                    a(gVar, "upnp:rootdevice", strK);
                }
            } else {
                if (strF == null) {
                    zStartsWith = false;
                } else {
                    zStartsWith = strF.startsWith("uuid") ? true : strF.startsWith("\"uuid");
                }
                if (zStartsWith) {
                    String strK2 = k();
                    if (strF.equals(strK2)) {
                        a(gVar, strK2, strK);
                    }
                } else {
                    if (strF == null) {
                        zStartsWith2 = false;
                    } else {
                        zStartsWith2 = strF.startsWith("urn:schemas-upnp-org:device:") ? true : strF.startsWith("\"urn:schemas-upnp-org:device:");
                    }
                    if (zStartsWith2) {
                        String strV = v();
                        if (strF.equals(strV)) {
                            a(gVar, strV, String.valueOf(k()) + "::" + strV);
                        }
                    }
                }
            }
            k kVarM = m();
            int size = kVarM.size();
            for (int i4 = 0; i4 < size; i4++) {
                kVarM.a(i4).a(gVar);
            }
            g gVarL = l();
            int size2 = gVarL.size();
            for (int i5 = 0; i5 < size2; i5++) {
                gVarL.a(i5).c(gVar);
            }
        }
    }

    @Override // org.cybergarage.d.b.g
    public final void b(org.cybergarage.d.d.g gVar) {
        c(gVar);
    }

    public final void a(int i2) {
        u().a(i2);
    }

    public final void i(String str) {
        String[] strArrSplit = str.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            try {
                if (!str2.isEmpty()) {
                    arrayList.add(InetAddress.getByName(str2));
                }
            } catch (UnknownHostException e) {
                System.err.println(String.valueOf(f.class.getName()) + ".setWhiteList(" + str + ")");
                System.err.println(e);
            }
        }
        this.j = arrayList;
    }

    private synchronized byte[] s(String str) {
        byte[] bytes;
        if (!s()) {
            String strA = org.cybergarage.b.a.a(str, u().i(), "");
            if (e()) {
                org.cybergarage.xml.c cVarL = a().l("URLBase");
                if (cVarL != null) {
                    cVarL.g(strA);
                } else {
                    org.cybergarage.xml.c cVar = new org.cybergarage.xml.c("URLBase");
                    cVar.g(strA);
                    a().m();
                    a().d(cVar);
                }
            }
        }
        org.cybergarage.xml.c cVarA = a();
        if (cVarA == null) {
            bytes = new byte[0];
        } else {
            bytes = (String.valueOf(String.valueOf(String.valueOf(new String()) + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + cVarA.toString()).getBytes();
        }
        return bytes;
    }

    private static void a(org.cybergarage.d.a.d dVar) {
        org.cybergarage.d.a.c cVar = new org.cybergarage.d.a.c();
        cVar.c(401);
        dVar.a((org.cybergarage.a.g) cVar);
    }

    private static void a(org.cybergarage.d.c.g gVar) {
        org.cybergarage.d.c.h hVar = new org.cybergarage.d.c.h();
        hVar.u();
        gVar.a(hVar);
    }

    private void a(org.cybergarage.d.b.a aVar) {
        u().a(aVar);
    }

    public boolean p() {
        A();
        u().b(org.cybergarage.b.a.d());
        u().a(org.cybergarage.b.a.d());
        int i2 = u().i();
        org.cybergarage.a.i iVarG = u().g();
        int i3 = 0;
        while (!iVarG.b(i2)) {
            i3++;
            if (100 < i3) {
                return false;
            }
            a(i2 + 1);
            i2 = u().i();
        }
        int size = iVarG.size();
        for (int i4 = 0; i4 < size; i4++) {
            iVarG.a(i4).a(this);
        }
        int size2 = iVarG.size();
        for (int i5 = 0; i5 < size2; i5++) {
            iVarG.a(i5).c();
        }
        org.cybergarage.d.d.n nVarJ = u().j();
        nVarJ.a();
        int size3 = nVarJ.size();
        for (int i6 = 0; i6 < size3; i6++) {
            nVarJ.a(i6).a(this);
        }
        int size4 = nVarJ.size();
        for (int i7 = 0; i7 < size4; i7++) {
            nVarJ.a(i7).i();
        }
        this.f = n.d();
        a(this);
        o();
        org.cybergarage.d.b.a aVar = new org.cybergarage.d.b.a(this);
        a(aVar);
        aVar.f();
        return true;
    }

    private boolean A() {
        z();
        org.cybergarage.a.i iVarG = u().g();
        iVarG.b();
        iVarG.a();
        iVarG.clear();
        org.cybergarage.d.d.n nVarJ = u().j();
        nVarJ.c();
        nVarJ.b();
        nVarJ.clear();
        org.cybergarage.d.b.a aVarL = u().l();
        if (aVarL != null) {
            aVarL.h();
            a((org.cybergarage.d.b.a) null);
            return true;
        }
        return true;
    }

    public boolean q() {
        return A();
    }

    public String r() {
        org.cybergarage.d.d.g gVarF = f();
        return gVarF == null ? "" : gVarF.b();
    }

    private boolean s() {
        org.cybergarage.xml.c cVar = this.b;
        return (cVar == null || cVar.l("INMPR03") == null) ? false : true;
    }

    private org.cybergarage.d.f.c u() {
        org.cybergarage.xml.c cVar = this.b;
        org.cybergarage.d.f.c cVar2 = (org.cybergarage.d.f.c) cVar.n();
        if (cVar2 == null) {
            org.cybergarage.d.f.c cVar3 = new org.cybergarage.d.f.c();
            cVar.a(cVar3);
            cVar3.a(cVar);
            return cVar3;
        }
        return cVar2;
    }

    private boolean j(String str) {
        String strB = u().b();
        if (str == null || strB == null) {
            return false;
        }
        return strB.equals(str);
    }

    public final String d() {
        File fileA = u().a();
        return fileA == null ? "" : fileA.getAbsoluteFile().getParent();
    }

    private String v() {
        return this.b.n("deviceType");
    }

    public final String j() {
        return this.b.n("friendlyName");
    }

    public final void c(String str) {
        this.b.d("UDN", str);
    }

    public final String k() {
        return this.b.n("UDN");
    }

    private h o(String str) {
        String strC;
        i iVar = new i();
        org.cybergarage.xml.c cVarL = this.b.l("iconList");
        if (cVarL != null) {
            int iK = cVarL.k();
            for (int i2 = 0; i2 < iK; i2++) {
                org.cybergarage.xml.c cVarC = cVarL.c(i2);
                if (h.a(cVarC)) {
                    h hVar = new h(cVarC);
                    if (hVar.d()) {
                        byte[] bArr = this.h.get(hVar.c());
                        if (bArr != null) {
                            hVar.a(bArr);
                        } else {
                            f fVarC = c();
                            if (fVarC != null) {
                                String strC2 = hVar.c();
                                String strD = fVarC.d();
                                if (strD != null) {
                                    File file = new File(strD.concat(strC2));
                                    if (file.exists()) {
                                        hVar.a(p(file.getPath()));
                                    }
                                }
                            }
                        }
                    }
                    iVar.add(hVar);
                }
            }
        }
        if (iVar.size() <= 0) {
            return null;
        }
        int size = iVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            h hVar2 = (h) iVar.get(i3);
            boolean zEquals = (str == null || (strC = hVar2.c()) == null) ? false : strC.equals(str);
            if (zEquals) {
                return hVar2;
            }
        }
        return null;
    }

    public final boolean a(h hVar) {
        org.cybergarage.xml.c cVar = this.b;
        if (cVar == null) {
            return false;
        }
        org.cybergarage.xml.c cVarL = cVar.l("iconList");
        if (cVarL == null) {
            cVarL = new org.cybergarage.xml.c("iconList");
            cVar.c(cVarL);
        }
        org.cybergarage.xml.c cVar2 = new org.cybergarage.xml.c("icon");
        if (hVar.a() != null) {
            cVar2.b(hVar.a());
        }
        cVarL.c(cVar2);
        if (hVar.d() && hVar.e()) {
            this.h.put(hVar.c(), hVar.f());
        }
        return true;
    }

    public final String h(String str) {
        return org.cybergarage.b.a.a(str, u().i(), u().b());
    }

    public final void o() {
        String[] strArr;
        org.cybergarage.e.f.a(300);
        InetAddress[] inetAddressArrH = u().h();
        if (inetAddressArrH != null) {
            String[] strArr2 = new String[inetAddressArrH.length];
            for (int i2 = 0; i2 < inetAddressArrH.length; i2++) {
                strArr2[i2] = inetAddressArrH[i2].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iC = org.cybergarage.b.a.c();
            strArr = new String[iC];
            for (int i3 = 0; i3 < iC; i3++) {
                strArr[i3] = org.cybergarage.b.a.a(i3);
            }
        }
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4] != null && strArr[i4].length() != 0) {
                int iT = t();
                for (int i5 = 0; i5 < iT; i5++) {
                    q(strArr[i4]);
                }
            }
        }
    }

    @Override // org.cybergarage.a.f
    public void a(org.cybergarage.a.e eVar) {
        String str;
        String strN;
        boolean zEquals;
        c cVarA;
        org.cybergarage.xml.c cVarC;
        String strI;
        String strW;
        String strN2;
        boolean zE = false;
        if (this.g != null) {
            boolean zStartsWith = (!eVar.q() || (strW = eVar.w()) == null || (strN2 = this.b.n("presentationURL")) == null) ? false : strW.startsWith(strN2);
            if (zStartsWith) {
                return;
            }
        }
        if (this.j != null && !this.j.isEmpty() && !this.j.contains(eVar.B())) {
            eVar.G();
            return;
        }
        if (!eVar.q() && !eVar.s()) {
            if (!eVar.r()) {
                if (eVar.t() || eVar.u()) {
                    org.cybergarage.d.c.g gVar = new org.cybergarage.d.c.g(eVar);
                    j jVarN = n(gVar.w());
                    if (jVarN == null) {
                        gVar.F();
                        return;
                    }
                    if (gVar.J() || gVar.L()) {
                        if (!gVar.u()) {
                            if (!gVar.J()) {
                                if (gVar.L()) {
                                    String strK = gVar.K();
                                    org.cybergarage.d.c.d dVarI = jVarN.i(strK);
                                    if (dVarI == null) {
                                        a(gVar);
                                        return;
                                    }
                                    long jM = gVar.M();
                                    dVarI.a(jM);
                                    dVarI.h();
                                    org.cybergarage.d.c.h hVar = new org.cybergarage.d.c.h();
                                    hVar.b(200);
                                    hVar.k(strK);
                                    hVar.b(jM);
                                    gVar.a(hVar);
                                    if (!org.cybergarage.e.a.c()) {
                                        return;
                                    }
                                    hVar.t();
                                    return;
                                }
                            } else {
                                String strI2 = gVar.I();
                                try {
                                    new URL(strI2);
                                    long jM2 = gVar.M();
                                    String strC = n.c();
                                    org.cybergarage.d.c.d dVar = new org.cybergarage.d.c.d();
                                    dVar.b(strI2);
                                    dVar.a(jM2);
                                    dVar.a(strC);
                                    jVarN.a(dVar);
                                    org.cybergarage.d.c.h hVar2 = new org.cybergarage.d.c.h();
                                    hVar2.b(200);
                                    hVar2.k(strC);
                                    hVar2.b(jM2);
                                    if (org.cybergarage.e.a.c()) {
                                        hVar2.t();
                                    }
                                    gVar.a(hVar2);
                                    if (org.cybergarage.e.a.c()) {
                                        hVar2.t();
                                    }
                                    jVarN.i();
                                    return;
                                } catch (Exception e) {
                                    a(gVar);
                                    return;
                                }
                            }
                        } else {
                            org.cybergarage.d.c.d dVarI2 = jVarN.i(gVar.K());
                            if (dVarI2 == null) {
                                a(gVar);
                                return;
                            }
                            jVarN.b(dVarI2);
                            org.cybergarage.d.c.h hVar3 = new org.cybergarage.d.c.h();
                            hVar3.b(200);
                            gVar.a(hVar3);
                            if (org.cybergarage.e.a.c()) {
                                hVar3.t();
                                return;
                            }
                            return;
                        }
                    }
                    a(gVar);
                    return;
                }
                eVar.F();
                return;
            }
            if (!eVar.b("SOAPACTION")) {
                eVar.F();
                return;
            }
            j jVarM = m(eVar.w());
            if (jVarM != null) {
                org.cybergarage.d.a.b bVar = new org.cybergarage.d.a.b(eVar);
                String strC2 = bVar.c("SOAPACTION");
                if (strC2 == null) {
                    zEquals = false;
                } else if (strC2.equals("urn:schemas-upnp-org:control-1-0#QueryStateVariable")) {
                    zEquals = true;
                } else {
                    String strD = bVar.d("SOAPACTION");
                    zEquals = strD == null ? false : strD.equals("urn:schemas-upnp-org:control-1-0#QueryStateVariable");
                }
                if (zEquals) {
                    org.cybergarage.d.a.g gVar2 = new org.cybergarage.d.a.g(bVar);
                    org.cybergarage.xml.c cVarJ = gVar2.J();
                    org.cybergarage.xml.c cVarC2 = (cVarJ != null && cVarJ.m() && (cVarC = cVarJ.c(0)) != null && cVarC.m()) ? cVarC.c(0) : null;
                    if (cVarC2 == null) {
                        strI = "";
                    } else {
                        strI = cVarC2.i();
                    }
                    if (!(jVarM.f(strI) != null)) {
                        a((org.cybergarage.d.a.d) gVar2);
                        return;
                    }
                    m mVarA = a(null, strI);
                    if (mVarA.d().b() != null) {
                        org.cybergarage.d.a.h hVar4 = new org.cybergarage.d.a.h();
                        m mVar = new m();
                        mVar.a().d("name", mVarA.b());
                        mVar.a(mVarA.e());
                        mVar.a().d("dataType", mVarA.a().n("dataType"));
                        mVar.a().c("sendEvents", mVarA.c() ? "yes" : "no");
                        mVar.a("");
                        mVar.b(o.a(404));
                        o oVarF = mVar.f();
                        hVar4.a(oVarF.a(), oVarF.b());
                        gVar2.a((org.cybergarage.a.g) hVar4);
                        zE = true;
                    }
                    if (!zE) {
                        a((org.cybergarage.d.a.d) gVar2);
                        return;
                    }
                    return;
                }
                org.cybergarage.d.a.b bVar2 = new org.cybergarage.d.a.b(bVar);
                a aVarE = jVarM.e(bVar2.K());
                if (aVarE == null) {
                    a((org.cybergarage.d.a.d) bVar2);
                    return;
                }
                d dVarB = aVarE.b();
                d dVarL = bVar2.L();
                try {
                    int size = dVarB.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        c cVarA2 = dVarB.a(i2);
                        if (cVarA2.c()) {
                            String strA = cVarA2.a();
                            int size2 = dVarL.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    cVarA = null;
                                    break;
                                }
                                cVarA = dVarL.a(i3);
                                String strA2 = cVarA.a();
                                if (strA2 != null && strA2.equals(strA)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (cVarA == null) {
                                throw new IllegalArgumentException("Argument \"" + strA + "\" missing.");
                            }
                            cVarA2.b(cVarA.e());
                        }
                    }
                    if (!aVarE.a(bVar2)) {
                        a((org.cybergarage.d.a.d) bVar2);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e2) {
                    org.cybergarage.d.a.c cVar = new org.cybergarage.d.a.c();
                    cVar.c(402);
                    bVar2.a((org.cybergarage.a.g) cVar);
                    return;
                }
            }
            org.cybergarage.c.c cVar2 = new org.cybergarage.c.c();
            cVar2.b(400);
            eVar.a((org.cybergarage.a.g) cVar2);
            return;
        }
        String strW2 = eVar.w();
        org.cybergarage.e.a.b("[Device.java] httpGetRequestReceived() ".concat(String.valueOf(strW2)));
        if (strW2 == null) {
            eVar.F();
            return;
        }
        byte[] bArrF = new byte[0];
        if (j(strW2)) {
            String strA3 = eVar.A();
            if (strA3 == null || strA3.length() <= 0) {
                strA3 = org.cybergarage.b.a.a();
            }
            strN = "text/xml; charset=\"utf-8\"";
            bArrF = s(strA3);
            str = "en";
        } else {
            f fVarK = k(strW2);
            if (fVarK != null) {
                str = "en";
                bArrF = fVarK.s(eVar.A());
                strN = "text/xml; charset=\"utf-8\"";
            } else {
                j jVarL = l(strW2);
                if (jVarL != null) {
                    str = "en";
                    bArrF = jVarL.h();
                    strN = "text/xml; charset=\"utf-8\"";
                } else {
                    if (this.h.get(strW2) == null) {
                        h hVarO = o(strW2);
                        if (hVarO != null) {
                            zE = hVarO.e();
                        }
                    } else {
                        zE = true;
                    }
                    if (zE) {
                        h hVarO2 = o(strW2);
                        if (hVarO2 != null) {
                            strN = hVarO2.a().n("mimetype");
                            bArrF = hVarO2.f();
                            str = null;
                        } else {
                            str = null;
                            strN = null;
                        }
                    } else {
                        eVar.F();
                        return;
                    }
                }
            }
        }
        org.cybergarage.a.g gVar3 = new org.cybergarage.a.g();
        gVar3.b(200);
        if (strN != null) {
            gVar3.g(strN);
        }
        if (str != null) {
            gVar3.h(str);
        }
        gVar3.a(bArrF);
        eVar.a(gVar3);
    }
}
