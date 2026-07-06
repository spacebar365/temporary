package org.cybergarage.d;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: ControlPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements org.cybergarage.a.f {
    org.cybergarage.e.b a;
    private org.cybergarage.d.d.f b;
    private org.cybergarage.d.d.l c;
    private int d;
    private final org.cybergarage.xml.d e;
    private final ReentrantReadWriteLock f;
    private org.cybergarage.d.b.b g;
    private long h;
    private org.cybergarage.e.b i;
    private org.cybergarage.e.b j;
    private org.cybergarage.e.b k;
    private String l;
    private org.cybergarage.d.a.i m;

    static {
        n.g();
    }

    private void c(org.cybergarage.d.d.g gVar) {
        if (gVar.i()) {
            f fVarA = a(org.cybergarage.d.b.h.a(gVar.h()));
            if (fVarA != null) {
                fVarA.a(gVar);
                return;
            }
            try {
                org.cybergarage.xml.c cVarA = n.e().a(new URL(gVar.e()));
                f fVarA2 = a(cVarA);
                if (fVarA2 != null) {
                    fVarA2.a(gVar);
                    this.f.writeLock().lock();
                    try {
                        this.e.add(cVarA);
                        this.f.writeLock().unlock();
                        e();
                    } catch (Throwable th) {
                        this.f.writeLock().unlock();
                        throw th;
                    }
                }
            } catch (MalformedURLException e) {
                org.cybergarage.e.a.c(gVar.toString());
                org.cybergarage.e.a.a(e);
            } catch (org.cybergarage.xml.f e2) {
                org.cybergarage.e.a.c(gVar.toString());
                org.cybergarage.e.a.a(e2);
            }
        }
    }

    private static f a(org.cybergarage.xml.c cVar) {
        org.cybergarage.xml.c cVarL;
        if (cVar == null || (cVarL = cVar.l("device")) == null) {
            return null;
        }
        return new f(cVar, cVarL);
    }

    private g d() {
        this.f.readLock().lock();
        try {
            g gVar = new g();
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                f fVarA = a(this.e.a(i));
                if (fVarA != null) {
                    gVar.add(fVarA);
                }
            }
            return gVar;
        } finally {
            this.f.readLock().unlock();
        }
    }

    private f a(String str) {
        this.f.readLock().lock();
        try {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                f fVarA = a(this.e.a(i));
                if (fVarA != null) {
                    if (fVarA.d(str)) {
                        return fVarA;
                    }
                    f fVarE = fVarA.e(str);
                    if (fVarE != null) {
                        return fVarE;
                    }
                }
            }
            this.f.readLock().unlock();
            return null;
        } finally {
            this.f.readLock().unlock();
        }
    }

    private void a(f fVar) {
        if (fVar != null) {
            org.cybergarage.xml.c cVarA = fVar.a();
            f fVarA = a(cVarA);
            if (fVarA != null && fVarA.e()) {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    this.a.get(i);
                }
            }
            this.f.writeLock().lock();
            try {
                this.e.remove(cVarA);
            } finally {
                this.f.writeLock().unlock();
            }
        }
    }

    public final void a() {
        long jC;
        g gVarD = d();
        int size = gVarD.size();
        f[] fVarArr = new f[size];
        for (int i = 0; i < size; i++) {
            fVarArr[i] = gVarD.a(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = fVarArr[i2];
            long jCurrentTimeMillis = System.currentTimeMillis();
            org.cybergarage.d.d.g gVarF = fVar.f();
            if (gVarF != null) {
                jC = gVarF.c();
            } else {
                jC = 0;
            }
            if (((long) (fVar.h() + 60)) < (jCurrentTimeMillis - jC) / 1000) {
                org.cybergarage.e.a.b("Expired device = " + fVarArr[i2].j());
                a(fVarArr[i2]);
            }
        }
    }

    public final long b() {
        return this.h;
    }

    private void e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i);
        }
    }

    public final void a(org.cybergarage.d.d.g gVar) {
        if (gVar.i()) {
            String strG = gVar.g();
            if (strG == null ? false : strG.startsWith("ssdp:alive")) {
                c(gVar);
            } else if (gVar.k() && gVar.k()) {
                a(a(org.cybergarage.d.b.h.a(gVar.h())));
            }
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.get(i);
        }
    }

    public final void b(org.cybergarage.d.d.g gVar) {
        if (gVar.i()) {
            c(gVar);
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.get(i);
        }
    }

    @Override // org.cybergarage.a.f
    public final void a(org.cybergarage.a.e eVar) {
        org.cybergarage.d.c.b bVar;
        if (org.cybergarage.e.a.c()) {
            eVar.H();
        }
        if (eVar.v()) {
            org.cybergarage.d.c.a aVar = new org.cybergarage.d.c.a(eVar);
            org.cybergarage.d.c.f.c(aVar.c("SID"));
            aVar.e("SEQ");
            org.cybergarage.d.c.c cVar = new org.cybergarage.d.c.c();
            org.cybergarage.xml.c cVarI = aVar.I();
            for (int i = 0; i < cVarI.k(); i++) {
                org.cybergarage.xml.c cVarC = cVarI.c(i);
                if (cVarC != null) {
                    org.cybergarage.xml.c cVarC2 = cVarC.c(0);
                    org.cybergarage.d.c.b bVar2 = new org.cybergarage.d.c.b();
                    if (cVarC2 == null) {
                        bVar = bVar2;
                    } else {
                        String strH = cVarC2.h();
                        int iLastIndexOf = strH.lastIndexOf(58);
                        if (iLastIndexOf != -1) {
                            strH = strH.substring(iLastIndexOf + 1);
                        }
                        bVar2.a(strH);
                        bVar2.b(cVarC2.i());
                        bVar = bVar2;
                    }
                    cVar.add(bVar);
                }
            }
            int size = cVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                cVar.get(i2);
                int size2 = this.k.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.k.get(i3);
                }
            }
            eVar.E();
            return;
        }
        eVar.F();
    }

    private static boolean a(j jVar, String str, long j) {
        org.cybergarage.d.c.g gVar = new org.cybergarage.d.c.g();
        gVar.b(jVar, str, j);
        if (org.cybergarage.e.a.c()) {
            gVar.H();
        }
        org.cybergarage.d.c.h hVarN = gVar.N();
        if (org.cybergarage.e.a.c()) {
            hVarN.t();
        }
        if (hVarN.q()) {
            jVar.j(hVarN.v());
            jVar.a(hVarN.w());
            return true;
        }
        jVar.k();
        return false;
    }

    private static boolean a(j jVar) {
        org.cybergarage.d.c.g gVar = new org.cybergarage.d.c.g();
        gVar.a(jVar);
        if (!gVar.N().q()) {
            return false;
        }
        jVar.k();
        return true;
    }

    private void b(f fVar) {
        k kVarM = fVar.m();
        int size = kVarM.size();
        for (int i = 0; i < size; i++) {
            j jVarA = kVarM.a(i);
            if (jVarA.l()) {
                a(jVarA);
            }
        }
        g gVarL = fVar.l();
        int size2 = gVarL.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b(gVarL.a(i2));
        }
    }

    private void a(f fVar, long j) {
        k kVarM = fVar.m();
        int size = kVarM.size();
        for (int i = 0; i < size; i++) {
            j jVarA = kVarM.a(i);
            if (jVarA.m() && !a(jVarA, jVarA.j(), j)) {
                if (jVarA.m()) {
                    a(jVarA, jVarA.j(), j);
                } else {
                    f fVarC = jVarA.c();
                    if (fVarC != null) {
                        String strR = fVarC.r();
                        org.cybergarage.d.c.g gVar = new org.cybergarage.d.c.g();
                        gVar.a(jVarA, org.cybergarage.b.a.a(strR, this.d, this.l), j);
                        org.cybergarage.d.c.h hVarN = gVar.N();
                        if (hVarN.q()) {
                            jVarA.j(hVarN.v());
                            jVarA.a(hVarN.w());
                        } else {
                            jVarA.k();
                        }
                    }
                }
            }
        }
        g gVarL = fVar.l();
        int size2 = gVarL.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a(gVarL.a(i2), j);
        }
    }

    public final void finalize() {
        g gVarD = d();
        int size = gVarD.size();
        for (int i = 0; i < size; i++) {
            b(gVarD.a(i));
        }
        org.cybergarage.d.d.f fVar = this.b;
        int size2 = fVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fVar.a(i2).i();
        }
        int size3 = fVar.size();
        for (int i3 = 0; i3 < size3; i3++) {
            fVar.a(i3).g();
        }
        fVar.clear();
        fVar.clear();
        org.cybergarage.d.d.l lVar = this.c;
        int size4 = lVar.size();
        for (int i4 = 0; i4 < size4; i4++) {
            lVar.a(i4).d();
        }
        int size5 = lVar.size();
        for (int i5 = 0; i5 < size5; i5++) {
            lVar.a(i5).b();
        }
        lVar.clear();
        lVar.clear();
        org.cybergarage.d.b.b bVar = this.g;
        if (bVar != null) {
            bVar.h();
            this.g = null;
        }
        org.cybergarage.d.a.i iVar = this.m;
        if (iVar == null) {
            return;
        }
        iVar.h();
        this.m = null;
    }

    public final void c() {
        g gVarD = d();
        int size = gVarD.size();
        for (int i = 0; i < size; i++) {
            a(gVarD.a(i), -1L);
        }
    }
}
