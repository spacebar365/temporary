package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bi;
import org.bouncycastle.d.a.d$d;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
public final class ac extends org.bouncycastle.a.o implements aj {
    private org.bouncycastle.d.a.d ap;
    private byte[] aq;
    private org.bouncycastle.a.p ar;

    public ac(ah ahVar, BigInteger bigInteger, BigInteger bigInteger2, org.bouncycastle.a.v vVar) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.ar = null;
        this.ar = ahVar.a();
        if (this.ar.equals(c)) {
            this.ap = new d$e(((org.bouncycastle.a.m) ahVar.b()).b(), new BigInteger(1, org.bouncycastle.a.q.a(vVar.a(0)).c()), new BigInteger(1, org.bouncycastle.a.q.a(vVar.a(1)).c()), bigInteger, bigInteger2);
        } else {
            if (!this.ar.equals(d)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            org.bouncycastle.a.v vVarA = org.bouncycastle.a.v.a((Object) ahVar.b());
            int iIntValue4 = ((org.bouncycastle.a.m) vVarA.a(0)).b().intValue();
            org.bouncycastle.a.p pVar = (org.bouncycastle.a.p) vVarA.a(1);
            if (pVar.equals(f)) {
                iIntValue = org.bouncycastle.a.m.a(vVarA.a(2)).b().intValue();
                iIntValue3 = 0;
                iIntValue2 = 0;
            } else {
                if (!pVar.equals(g)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                org.bouncycastle.a.v vVarA2 = org.bouncycastle.a.v.a(vVarA.a(2));
                iIntValue = org.bouncycastle.a.m.a(vVarA2.a(0)).b().intValue();
                iIntValue2 = org.bouncycastle.a.m.a(vVarA2.a(1)).b().intValue();
                iIntValue3 = org.bouncycastle.a.m.a(vVarA2.a(2)).b().intValue();
            }
            this.ap = new d$d(iIntValue4, iIntValue, iIntValue2, iIntValue3, new BigInteger(1, org.bouncycastle.a.q.a(vVar.a(0)).c()), new BigInteger(1, org.bouncycastle.a.q.a(vVar.a(1)).c()), bigInteger, bigInteger2);
        }
        if (vVar.d() == 3) {
            this.aq = org.bouncycastle.f.a.b(((au) vVar.a(2)).d());
        }
    }

    public final org.bouncycastle.d.a.d a() {
        return this.ap;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.aq);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.ar.equals(c) || this.ar.equals(d)) {
            gVar.a(new ag(this.ap.g()).i());
            gVar.a(new ag(this.ap.h()).i());
        }
        if (this.aq != null) {
            gVar.a(new au(this.aq));
        }
        return new bi(gVar);
    }

    public ac(org.bouncycastle.d.a.d dVar, byte[] bArr) {
        this.ar = null;
        this.ap = dVar;
        this.aq = org.bouncycastle.f.a.b(bArr);
        if (org.bouncycastle.d.a.b.b(this.ap.f())) {
            this.ar = c;
        } else {
            if (!org.bouncycastle.d.a.b.a(this.ap.f())) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.ar = d;
        }
    }
}
