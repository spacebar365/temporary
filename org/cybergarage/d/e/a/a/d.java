package org.cybergarage.d.e.a.a;

import java.util.StringTokenizer;
import org.cybergarage.d.e.a.a.b.h;
import org.cybergarage.d.e.a.a.b.i;
import org.cybergarage.d.e.a.a.b.j;
import org.cybergarage.d.e.a.a.b.k;
import org.cybergarage.d.e.a.a.b.l;
import org.cybergarage.d.e.a.a.b.m;
import org.cybergarage.d.e.a.a.b.n;
import org.cybergarage.d.e.a.a.b.o;

/* JADX INFO: compiled from: ContentDirectory.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends org.cybergarage.e.e implements org.cybergarage.d.a.a, org.cybergarage.d.a.f {
    private g a;
    private org.cybergarage.e.c b = new org.cybergarage.e.c();
    private h f = new h();
    private n g = new n();
    private j h = new j();
    private f i = new f();
    private int c = 0;
    private int d = 0;
    private long j = 2000;
    private long k = 60000;
    private org.cybergarage.d.e.a.a.b.a.b e = new org.cybergarage.d.e.a.a.b.a.b();

    public d(g gVar) {
        this.a = gVar;
        this.e.a(this);
        a(new org.cybergarage.d.e.a.a.b.e.c());
        a(new org.cybergarage.d.e.a.a.b.e.b());
        a(new org.cybergarage.d.e.a.a.b.e.a());
        a(new org.cybergarage.d.e.a.a.b.d.a());
        a(new org.cybergarage.d.e.a.a.b.d.b());
    }

    public final synchronized void a() {
        this.c++;
    }

    private synchronized int i() {
        return this.c;
    }

    public final org.cybergarage.d.e.a.a.b.a.b b() {
        return this.e;
    }

    public final boolean a(org.cybergarage.d.e.a.a.b.g gVar) {
        this.f.add(gVar);
        return true;
    }

    public final org.cybergarage.d.e.a.a.b.g a(int i) {
        return (org.cybergarage.d.e.a.a.b.g) this.f.get(i);
    }

    public final int c() {
        return this.f.size();
    }

    private boolean a(m mVar) {
        this.g.add(mVar);
        return true;
    }

    private m a(String str) {
        n nVar = this.g;
        if (str == null) {
            return null;
        }
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            m mVarA = nVar.a(i);
            if (str.compareTo(mVarA.a()) == 0) {
                return mVarA;
            }
        }
        return null;
    }

    private String j() {
        String str = "";
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            String strA = this.g.a(i).a();
            if (i > 0) {
                str = String.valueOf(str) + ",";
            }
            str = String.valueOf(str) + strA;
        }
        return str;
    }

    private boolean a(i iVar) {
        this.h.add(iVar);
        return true;
    }

    private String k() {
        String str = "";
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            String strA = this.h.a(i).a();
            if (i > 0) {
                str = String.valueOf(str) + ",";
            }
            str = String.valueOf(str) + strA;
        }
        return str;
    }

    public final boolean d() {
        this.i.removeAllElements();
        return true;
    }

    @Override // org.cybergarage.d.a.a
    public final boolean a(org.cybergarage.d.a aVar) {
        int i = 0;
        String strA = aVar.a();
        if (strA.equals("Browse")) {
            org.cybergarage.d.e.a.a.a.a aVar2 = new org.cybergarage.d.e.a.a.a.a(aVar);
            if (!"BrowseMetadata".equals(aVar2.b("BrowseFlag"))) {
                if (!"BrowseDirectChildren".equals(aVar2.b("BrowseFlag"))) {
                    return false;
                }
                String strB = aVar2.b("ObjectID");
                org.cybergarage.d.e.a.a.b.a aVarB = b(strB);
                if (aVarB == null || !aVarB.c()) {
                    aVarB = new org.cybergarage.d.e.a.a.b.a.a();
                }
                org.cybergarage.d.e.a.a.b.a.a aVar3 = (org.cybergarage.d.e.a.a.b.a.a) aVarB;
                org.cybergarage.d.e.a.a.b.b bVar = new org.cybergarage.d.e.a.a.b.b();
                int iK = aVar3.k();
                for (int i2 = 0; i2 < iK; i2++) {
                    bVar.add(aVar3.a(i2));
                }
                String strB2 = aVar2.b("SortCriteria");
                org.cybergarage.d.e.a.a.b.b bVarA = !strB2.equals("+dc:title") ? a(bVar, strB2) : bVar;
                int iC = aVar2.c("StartingIndex");
                if (iC <= 0) {
                    iC = 0;
                }
                int iC2 = aVar2.c("RequestedCount");
                if (iC2 == 0) {
                    iC2 = iK;
                }
                org.cybergarage.d.e.a.a.b.e eVar = new org.cybergarage.d.e.a.a.b.e();
                while (iC < iK && i < iC2) {
                    org.cybergarage.d.e.a.a.b.a aVarA = bVarA.a(iC);
                    eVar.b(aVarA);
                    aVarA.c("parentID", strB);
                    i++;
                    iC++;
                }
                aVar2.a("Result", eVar.toString());
                aVar2.a("NumberReturned", i);
                aVar2.a("TotalMatches", iK);
                aVar2.a("UpdateID", i());
                return true;
            }
            org.cybergarage.d.e.a.a.b.a aVarB2 = b(aVar2.b("ObjectID"));
            if (aVarB2 == null) {
                return false;
            }
            org.cybergarage.d.e.a.a.b.e eVar2 = new org.cybergarage.d.e.a.a.b.e();
            eVar2.a(aVarB2);
            aVar2.a("Result", eVar2.toString());
            aVar2.a("NumberReturned", 1);
            aVar2.a("TotalMatches", 1);
            aVar2.a("UpdateID", i());
            if (org.cybergarage.e.a.c()) {
                aVar2.c();
            }
            return true;
        }
        if (strA.equals("Search")) {
            org.cybergarage.d.e.a.a.a.b bVar2 = new org.cybergarage.d.e.a.a.a.b(aVar);
            org.cybergarage.d.e.a.a.b.a aVarB3 = b(bVar2.b("ContainerID"));
            if (aVarB3 == null || !aVarB3.c()) {
                return false;
            }
            org.cybergarage.d.e.a.a.b.a.a aVar4 = (org.cybergarage.d.e.a.a.b.a.a) aVarB3;
            String strB3 = bVar2.b("SearchCriteria");
            l lVar = new l();
            if (strB3 != null && strB3.compareTo("*") != 0) {
                StringTokenizer stringTokenizer = new StringTokenizer(strB3, " \t\n\f\r");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String strNextToken2 = stringTokenizer.nextToken();
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String strNextToken3 = stringTokenizer.nextToken();
                    int iA = org.cybergarage.e.d.a(strNextToken3, "\"", 0, strNextToken3.length() - 1, 1);
                    if (iA >= 0) {
                        strNextToken3 = strNextToken3.substring(iA, strNextToken3.length());
                        int iA2 = org.cybergarage.e.d.a(strNextToken3, "\"", strNextToken3.length() - 1, 0, -1);
                        if (iA2 >= 0) {
                            strNextToken3 = strNextToken3.substring(0, iA2 + 1);
                        }
                    }
                    String strNextToken4 = "";
                    if (stringTokenizer.hasMoreTokens()) {
                        strNextToken4 = stringTokenizer.nextToken();
                    }
                    k kVar = new k();
                    kVar.a(strNextToken);
                    kVar.b(strNextToken2);
                    kVar.c(strNextToken3);
                    kVar.d(strNextToken4);
                    lVar.add(kVar);
                }
            }
            j jVar = this.h;
            org.cybergarage.d.e.a.a.b.b bVar3 = new org.cybergarage.d.e.a.a.b.b();
            int iK2 = aVar4.k();
            for (int i3 = 0; i3 < iK2; i3++) {
                org.cybergarage.d.e.a.a.b.a aVarA2 = aVar4.a(i3);
                if (aVarA2.c()) {
                    a((org.cybergarage.d.e.a.a.b.a.a) aVarA2, lVar, jVar, bVar3);
                }
            }
            int size = bVar3.size();
            org.cybergarage.d.e.a.a.b.b bVarA2 = a(bVar3, bVar2.b("SortCriteria"));
            int iC3 = bVar2.c("StartingIndex");
            if (iC3 <= 0) {
                iC3 = 0;
            }
            int iC4 = bVar2.c("RequestedCount");
            if (iC4 == 0) {
                iC4 = size;
            }
            org.cybergarage.d.e.a.a.b.e eVar3 = new org.cybergarage.d.e.a.a.b.e();
            while (iC3 < size && i < iC4) {
                eVar3.b(bVarA2.a(iC3));
                i++;
                iC3++;
            }
            bVar2.a("Result", eVar3.toString());
            bVar2.a("NumberReturned", i);
            bVar2.a("TotalMatches", size);
            bVar2.a("UpdateID", i());
            return true;
        }
        if (strA.equals("GetSearchCapabilities")) {
            aVar.a("SearchCaps").b(k());
            return true;
        }
        if (strA.equals("GetSortCapabilities")) {
            aVar.a("SortCaps").b(j());
            return true;
        }
        if (!strA.equals("GetSystemUpdateID")) {
            return false;
        }
        aVar.a("Id").a(i());
        return true;
    }

    private static void a(org.cybergarage.d.e.a.a.b.a[] aVarArr, m mVar, boolean z) {
        int length = aVarArr.length;
        for (int i = 0; i < length - 1; i++) {
            int i2 = i;
            for (int i3 = i + 1; i3 < length; i3++) {
                int iA = mVar.a(aVarArr[i2], aVarArr[i3]);
                if (z && iA < 0) {
                    i2 = i3;
                }
                if (!z && iA > 0) {
                    i2 = i3;
                }
            }
            org.cybergarage.d.e.a.a.b.a aVar = aVarArr[i];
            aVarArr[i] = aVarArr[i2];
            aVarArr[i2] = aVar;
        }
    }

    private static o c(String str) {
        o oVar = new o();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        while (stringTokenizer.hasMoreTokens()) {
            oVar.add(stringTokenizer.nextToken());
        }
        return oVar;
    }

    private org.cybergarage.d.e.a.a.b.b a(org.cybergarage.d.e.a.a.b.b bVar, String str) {
        if (str != null && str.length() > 0) {
            int size = bVar.size();
            org.cybergarage.d.e.a.a.b.a[] aVarArr = new org.cybergarage.d.e.a.a.b.a[size];
            for (int i = 0; i < size; i++) {
                aVarArr[i] = bVar.a(i);
            }
            o oVarC = c(str);
            int size2 = oVarC.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strA = oVarC.a(i2);
                org.cybergarage.e.a.b("[" + i2 + "] = " + strA);
                char cCharAt = strA.charAt(0);
                boolean z = cCharAt != '-';
                if (cCharAt == '+' || cCharAt == '-') {
                    strA = strA.substring(1);
                }
                m mVarA = a(strA);
                if (mVarA != null) {
                    org.cybergarage.e.a.b("  ascSeq = ".concat(String.valueOf(z)));
                    org.cybergarage.e.a.b("  sortCap = " + mVarA.a());
                    a(aVarArr, mVarA, z);
                }
            }
            bVar = new org.cybergarage.d.e.a.a.b.b();
            for (int i3 = 0; i3 < size; i3++) {
                bVar.add(aVarArr[i3]);
            }
        }
        return bVar;
    }

    public final void a(org.cybergarage.a.e eVar) {
        if (!eVar.w().startsWith("/ExportContent")) {
            eVar.F();
            return;
        }
        org.cybergarage.a.n nVarX = eVar.x();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= nVarX.size()) {
                break;
            }
            org.cybergarage.a.m mVar = (org.cybergarage.a.m) nVarX.get(i2);
            org.cybergarage.e.a.b("[" + mVar.a() + "] = " + mVar.b());
            i = i2 + 1;
        }
        org.cybergarage.d.e.a.a.b.a aVarB = b(nVarX.a("id"));
        if (aVarB == null) {
            eVar.F();
        } else {
            if (!(aVarB instanceof org.cybergarage.d.e.a.a.b.c.a)) {
                eVar.F();
                return;
            }
            if (0 > 0) {
                "*/*".length();
            }
            eVar.F();
        }
    }

    private org.cybergarage.d.e.a.a.b.a b(String str) {
        return this.e.e(str);
    }

    private int a(org.cybergarage.d.e.a.a.b.a.a aVar, l lVar, j jVar, org.cybergarage.d.e.a.a.b.b bVar) {
        i iVarA;
        boolean z = true;
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            k kVarA = lVar.a(i);
            String strA = kVarA.a();
            if (strA == null) {
                kVarA.a(true);
            } else {
                if (strA != null) {
                    int size2 = jVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            iVarA = null;
                            break;
                        }
                        iVarA = jVar.a(i2);
                        if (strA.compareTo(iVarA.a()) == 0) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    iVarA = null;
                }
                if (iVarA == null) {
                    kVarA.a(true);
                } else {
                    kVarA.a(iVarA.a(kVarA, aVar));
                }
            }
        }
        l lVar2 = new l();
        for (int i3 = 0; i3 < size; i3++) {
            k kVarA2 = lVar.a(i3);
            if (i3 < size - 1 && kVarA2.j()) {
                k kVarA3 = lVar.a(i3 + 1);
                kVarA3.a(kVarA2.k() & kVarA3.k());
            } else {
                lVar2.add(new k(kVarA2));
            }
        }
        int size3 = lVar2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z = false;
                break;
            }
            if (lVar.a(i4).k()) {
                break;
            }
            i4++;
        }
        if (z) {
            bVar.add(aVar);
        }
        int iK = aVar.k();
        for (int i5 = 0; i5 < iK; i5++) {
            org.cybergarage.d.e.a.a.b.a aVarA = aVar.a(i5);
            if (aVarA.c()) {
                a((org.cybergarage.d.e.a.a.b.a.a) aVarA, lVar, jVar, bVar);
            }
        }
        return bVar.size();
    }

    @Override // org.cybergarage.e.e, java.lang.Runnable
    public final void run() {
        org.cybergarage.d.m mVarG = this.a.g("SystemUpdateID");
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (g()) {
            try {
                Thread.sleep(this.j);
            } catch (InterruptedException e) {
            }
            int i2 = i();
            if (i != i2) {
                mVarG.a(i2);
                i = i2;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (this.k < jCurrentTimeMillis2 - jCurrentTimeMillis) {
                f fVar = this.i;
                int size = fVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    e eVar = (e) fVar.get(i3);
                    if (eVar.a()) {
                        eVar.a("childCount", eVar.k());
                        eVar.b().a();
                    }
                }
                jCurrentTimeMillis = jCurrentTimeMillis2;
            }
        }
    }
}
