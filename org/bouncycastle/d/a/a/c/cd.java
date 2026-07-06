package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$a;

/* JADX INFO: loaded from: classes.dex */
public final class cd extends j$a {
    public cd(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public cd(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    cd(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j b(org.bouncycastle.d.a.j jVar) {
        org.bouncycastle.d.a.g gVarC;
        org.bouncycastle.d.a.g gVarC2;
        org.bouncycastle.d.a.g gVarC3;
        org.bouncycastle.d.a.g gVarC4;
        org.bouncycastle.d.a.g gVarA;
        org.bouncycastle.d.a.g gVarC5;
        if (p()) {
            return jVar;
        }
        if (jVar.p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        org.bouncycastle.d.a.g gVarC6 = this.c;
        org.bouncycastle.d.a.g gVarK = jVar.k();
        if (gVarC6.j()) {
            return gVarK.j() ? dVarD.e() : jVar.b(this);
        }
        org.bouncycastle.d.a.g gVar = this.d;
        org.bouncycastle.d.a.g gVar2 = this.e[0];
        org.bouncycastle.d.a.g gVarL = jVar.l();
        org.bouncycastle.d.a.g gVarA2 = jVar.a(0);
        boolean zI = gVar2.i();
        if (zI) {
            gVarC = gVarL;
            gVarC2 = gVarK;
        } else {
            gVarC2 = gVarK.c(gVar2);
            gVarC = gVarL.c(gVar2);
        }
        boolean zI2 = gVarA2.i();
        if (zI2) {
            gVarC3 = gVar;
        } else {
            gVarC6 = gVarC6.c(gVarA2);
            gVarC3 = gVar.c(gVarA2);
        }
        org.bouncycastle.d.a.g gVarA3 = gVarC3.a(gVarC);
        org.bouncycastle.d.a.g gVarA4 = gVarC6.a(gVarC2);
        if (gVarA4.j()) {
            return gVarA3.j() ? t() : dVarD.e();
        }
        if (gVarK.j()) {
            org.bouncycastle.d.a.j jVarO = o();
            org.bouncycastle.d.a.g gVarI = jVarO.i();
            org.bouncycastle.d.a.g gVarJ = jVarO.j();
            org.bouncycastle.d.a.g gVarD = gVarJ.a(gVarL).d(gVarI);
            gVarC4 = gVarD.e().a(gVarD).a(gVarI).a(dVarD.g());
            if (gVarC4.j()) {
                return new cd(dVarD, gVarC4, dVarD.h().g(), this.f);
            }
            gVarA = gVarD.c(gVarI.a(gVarC4)).a(gVarC4).a(gVarJ).d(gVarC4).a(gVarC4);
            gVarC5 = dVarD.a(org.bouncycastle.d.a.c.d);
        } else {
            org.bouncycastle.d.a.g gVarE = gVarA4.e();
            org.bouncycastle.d.a.g gVarC7 = gVarA3.c(gVarC6);
            org.bouncycastle.d.a.g gVarC8 = gVarA3.c(gVarC2);
            gVarC4 = gVarC7.c(gVarC8);
            if (gVarC4.j()) {
                return new cd(dVarD, gVarC4, dVarD.h().g(), this.f);
            }
            org.bouncycastle.d.a.g gVarC9 = gVarA3.c(gVarE);
            if (!zI2) {
                gVarC9 = gVarC9.c(gVarA2);
            }
            gVarA = gVarC8.a(gVarE).a(gVarC9, gVar.a(gVar2));
            gVarC5 = !zI ? gVarC9.c(gVar2) : gVarC9;
        }
        return new cd(dVarD, gVarC4, gVarA, new org.bouncycastle.d.a.g[]{gVarC5}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        if (p()) {
            return jVar;
        }
        if (jVar.p()) {
            return t();
        }
        org.bouncycastle.d.a.d dVarD = d();
        org.bouncycastle.d.a.g gVar = this.c;
        if (gVar.j()) {
            return jVar;
        }
        org.bouncycastle.d.a.g gVarK = jVar.k();
        org.bouncycastle.d.a.g gVarA = jVar.a(0);
        if (gVarK.j() || !gVarA.i()) {
            return t().b(jVar);
        }
        org.bouncycastle.d.a.g gVar2 = this.d;
        org.bouncycastle.d.a.g gVar3 = this.e[0];
        org.bouncycastle.d.a.g gVarL = jVar.l();
        org.bouncycastle.d.a.g gVarE = gVar.e();
        org.bouncycastle.d.a.g gVarE2 = gVar2.e();
        org.bouncycastle.d.a.g gVarE3 = gVar3.e();
        org.bouncycastle.d.a.g gVarA2 = dVarD.g().c(gVarE3).a(gVarE2).a(gVar2.c(gVar3));
        org.bouncycastle.d.a.g gVarC = gVarL.c();
        org.bouncycastle.d.a.g gVarB = dVarD.g().a(gVarC).c(gVarE3).a(gVarE2).b(gVarA2, gVarE, gVarE3);
        org.bouncycastle.d.a.g gVarC2 = gVarK.c(gVarE3);
        org.bouncycastle.d.a.g gVarE4 = gVarC2.a(gVarA2).e();
        if (gVarE4.j()) {
            return gVarB.j() ? jVar.t() : dVarD.e();
        }
        if (gVarB.j()) {
            return new cd(dVarD, gVarB, dVarD.h().g(), this.f);
        }
        org.bouncycastle.d.a.g gVarC3 = gVarB.e().c(gVarC2);
        org.bouncycastle.d.a.g gVarC4 = gVarB.c(gVarE4).c(gVarE3);
        return new cd(dVarD, gVarC3, gVarB.a(gVarE4).e().b(gVarA2, gVarC, gVarC4), new org.bouncycastle.d.a.g[]{gVarC4}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new cd(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.g j() {
        org.bouncycastle.d.a.g gVar = this.c;
        org.bouncycastle.d.a.g gVar2 = this.d;
        if (p() || gVar.j()) {
            return gVar2;
        }
        org.bouncycastle.d.a.g gVarC = gVar2.a(gVar).c(gVar);
        org.bouncycastle.d.a.g gVar3 = this.e[0];
        return !gVar3.i() ? gVarC.d(gVar3) : gVarC;
    }

    @Override // org.bouncycastle.d.a.j
    protected final boolean r() {
        org.bouncycastle.d.a.g gVarK = k();
        return (gVarK.j() || l().k() == gVarK.k()) ? false : true;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.g gVar = this.c;
        if (gVar.j()) {
            return this;
        }
        org.bouncycastle.d.a.g gVar2 = this.d;
        org.bouncycastle.d.a.g gVar3 = this.e[0];
        return new cd(this.b, gVar, gVar2.a(gVar3), new org.bouncycastle.d.a.g[]{gVar3}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        org.bouncycastle.d.a.g gVar = this.c;
        if (gVar.j()) {
            return dVarD.e();
        }
        org.bouncycastle.d.a.g gVar2 = this.d;
        org.bouncycastle.d.a.g gVar3 = this.e[0];
        boolean zI = gVar3.i();
        org.bouncycastle.d.a.g gVarC = zI ? gVar2 : gVar2.c(gVar3);
        org.bouncycastle.d.a.g gVarE = zI ? gVar3 : gVar3.e();
        org.bouncycastle.d.a.g gVarG = dVarD.g();
        if (!zI) {
            gVarG = gVarG.c(gVarE);
        }
        org.bouncycastle.d.a.g gVarA = gVar2.e().a(gVarC).a(gVarG);
        if (gVarA.j()) {
            return new cd(dVarD, gVarA, dVarD.h().g(), this.f);
        }
        org.bouncycastle.d.a.g gVarE2 = gVarA.e();
        org.bouncycastle.d.a.g gVarC2 = zI ? gVarA : gVarA.c(gVarE);
        return new cd(dVarD, gVarE2, (zI ? gVar : gVar.c(gVar3)).a(gVarA, gVarC).a(gVarE2).a(gVarC2), new org.bouncycastle.d.a.g[]{gVarC2}, this.f);
    }
}
