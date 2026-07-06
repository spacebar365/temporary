package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public class ad extends org.bouncycastle.a.o implements aj {
    private static final BigInteger ap = BigInteger.valueOf(1);
    private ah aq;
    private org.bouncycastle.d.a.d ar;
    private af as;
    private BigInteger at;
    private BigInteger au;
    private byte[] av;

    private ad(org.bouncycastle.a.v vVar) {
        if (!(vVar.a(0) instanceof org.bouncycastle.a.m) || !((org.bouncycastle.a.m) vVar.a(0)).b().equals(ap)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.at = ((org.bouncycastle.a.m) vVar.a(4)).b();
        if (vVar.d() == 6) {
            this.au = ((org.bouncycastle.a.m) vVar.a(5)).b();
        }
        ac acVar = new ac(ah.a(vVar.a(1)), this.at, this.au, org.bouncycastle.a.v.a(vVar.a(2)));
        this.ar = acVar.a();
        org.bouncycastle.a.f fVarA = vVar.a(3);
        if (fVarA instanceof af) {
            this.as = (af) fVarA;
        } else {
            this.as = new af(this.ar, (org.bouncycastle.a.q) fVarA);
        }
        this.av = acVar.b();
    }

    public ad(org.bouncycastle.d.a.d dVar, af afVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(dVar, afVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public ad(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(dVar, new af(jVar), bigInteger, bigInteger2, bArr);
    }

    public static ad a(Object obj) {
        if (obj != null) {
            return new ad(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.d.a.d a() {
        return this.ar;
    }

    public final org.bouncycastle.d.a.j b() {
        return this.as.a();
    }

    public final BigInteger c() {
        return this.at;
    }

    public final BigInteger d() {
        return this.au;
    }

    public final byte[] e() {
        return org.bouncycastle.f.a.b(this.av);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(ap));
        gVar.a(this.aq);
        gVar.a(new ac(this.ar, this.av));
        gVar.a(this.as);
        gVar.a(new org.bouncycastle.a.m(this.at));
        if (this.au != null) {
            gVar.a(new org.bouncycastle.a.m(this.au));
        }
        return new bi(gVar);
    }

    public ad(org.bouncycastle.d.a.d dVar, af afVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.ar = dVar;
        this.as = afVar;
        this.at = bigInteger;
        this.au = bigInteger2;
        this.av = org.bouncycastle.f.a.b(bArr);
        if (org.bouncycastle.d.a.b.b(dVar.f())) {
            this.aq = new ah(dVar.f().a());
            return;
        }
        if (!org.bouncycastle.d.a.b.a(dVar.f())) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        int[] iArrB = ((org.bouncycastle.d.b.g) dVar.f()).c().b();
        if (iArrB.length == 3) {
            this.aq = new ah(iArrB[2], iArrB[1]);
        } else {
            if (iArrB.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
            this.aq = new ah(iArrB[4], iArrB[1], iArrB[2], iArrB[3]);
        }
    }
}
