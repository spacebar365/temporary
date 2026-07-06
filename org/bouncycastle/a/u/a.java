package org.bouncycastle.a.u;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.au;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class a extends org.bouncycastle.a.o {
    private org.bouncycastle.a.v a;

    public a(int i, BigInteger bigInteger, au auVar, org.bouncycastle.a.f fVar) {
        byte[] bArrA = org.bouncycastle.f.b.a((i + 7) / 8, bigInteger);
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(1L));
        gVar.a(new be(bArrA));
        if (fVar != null) {
            gVar.a(new bn(true, 0, fVar));
        }
        if (auVar != null) {
            gVar.a(new bn(true, 1, auVar));
        }
        this.a = new bi(gVar);
    }

    public a(int i, BigInteger bigInteger, org.bouncycastle.a.f fVar) {
        this(i, bigInteger, null, fVar);
    }

    private a(org.bouncycastle.a.v vVar) {
        this.a = vVar;
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    private org.bouncycastle.a.u a(int i) {
        Enumeration enumerationC = this.a.c();
        while (enumerationC.hasMoreElements()) {
            org.bouncycastle.a.f fVar = (org.bouncycastle.a.f) enumerationC.nextElement();
            if (fVar instanceof org.bouncycastle.a.ab) {
                org.bouncycastle.a.ab abVar = (org.bouncycastle.a.ab) fVar;
                if (abVar.b() == i) {
                    return abVar.j().i();
                }
            }
        }
        return null;
    }

    public final BigInteger a() {
        return new BigInteger(1, ((org.bouncycastle.a.q) this.a.a(1)).c());
    }

    public final au b() {
        return (au) a(1);
    }

    public final org.bouncycastle.a.u c() {
        return a(0);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }
}
