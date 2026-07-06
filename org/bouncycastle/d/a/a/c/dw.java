package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$a;

/* JADX INFO: loaded from: classes.dex */
public final class dw extends j$a {
    public dw(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public dw(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    dw(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
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
        org.bouncycastle.d.a.g gVarA2 = gVarE2.a(gVar2.c(gVar3));
        org.bouncycastle.d.a.g gVarC = gVarL.c();
        org.bouncycastle.d.a.g gVarB = gVarC.c(gVarE3).a(gVarE2).b(gVarA2, gVarE, gVarE3);
        org.bouncycastle.d.a.g gVarC2 = gVarK.c(gVarE3);
        org.bouncycastle.d.a.g gVarE4 = gVarC2.a(gVarA2).e();
        if (gVarE4.j()) {
            return gVarB.j() ? jVar.t() : dVarD.e();
        }
        if (gVarB.j()) {
            return new dw(dVarD, gVarB, dVarD.h(), this.f);
        }
        org.bouncycastle.d.a.g gVarC3 = gVarB.e().c(gVarC2);
        org.bouncycastle.d.a.g gVarC4 = gVarB.c(gVarE4).c(gVarE3);
        return new dw(dVarD, gVarC3, gVarB.a(gVarE4).e().b(gVarA2, gVarC, gVarC4), new org.bouncycastle.d.a.g[]{gVarC4}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new dw(null, g(), h());
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
        return new dw(this.b, gVar, gVar2.a(gVar3), new org.bouncycastle.d.a.g[]{gVar3}, this.f);
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
        org.bouncycastle.d.a.g gVarE = zI ? gVar3 : gVar3.e();
        org.bouncycastle.d.a.g gVarA = zI ? gVar2.e().a(gVar2) : gVar2.a(gVar3).c(gVar2);
        if (gVarA.j()) {
            return new dw(dVarD, gVarA, dVarD.h(), this.f);
        }
        org.bouncycastle.d.a.g gVarE2 = gVarA.e();
        org.bouncycastle.d.a.g gVarC = zI ? gVarA : gVarA.c(gVarE);
        org.bouncycastle.d.a.g gVarE3 = gVar2.a(gVar).e();
        return new dw(dVarD, gVarE2, gVarE3.a(gVarA).a(gVarE).c(gVarE3).a(zI ? gVar3 : gVarE.e()).a(gVarE2).a(gVarC), new org.bouncycastle.d.a.g[]{gVarC}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j b(org.bouncycastle.d.a.j jVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        dt dtVar;
        dt dtVar2;
        dt dtVar3;
        if (p()) {
            return jVar;
        }
        if (jVar.p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        dt dtVar4 = (dt) this.c;
        dt dtVar5 = (dt) jVar.k();
        if (dtVar4.j()) {
            return dtVar5.j() ? dVarD.e() : jVar.b(this);
        }
        dt dtVar6 = (dt) this.d;
        dt dtVar7 = (dt) this.e[0];
        dt dtVar8 = (dt) jVar.l();
        dt dtVar9 = (dt) jVar.a(0);
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] jArr8 = new long[9];
        long[] jArrA = dtVar7.i() ? null : ds.a(dtVar7.a);
        if (jArrA == null) {
            jArr2 = dtVar5.a;
            jArr = dtVar8.a;
        } else {
            ds.e(dtVar5.a, jArrA, jArr6);
            ds.e(dtVar8.a, jArrA, jArr8);
            jArr = jArr8;
            jArr2 = jArr6;
        }
        long[] jArrA2 = dtVar9.i() ? null : ds.a(dtVar9.a);
        if (jArrA2 == null) {
            jArr4 = dtVar4.a;
            jArr3 = dtVar6.a;
        } else {
            ds.e(dtVar4.a, jArrA2, jArr5);
            ds.e(dtVar6.a, jArrA2, jArr7);
            jArr3 = jArr7;
            jArr4 = jArr5;
        }
        ds.a(jArr3, jArr, jArr7);
        ds.a(jArr4, jArr2, jArr8);
        if (org.bouncycastle.d.c.m.a(jArr8)) {
            return org.bouncycastle.d.c.m.a(jArr7) ? t() : dVarD.e();
        }
        if (dtVar5.j()) {
            org.bouncycastle.d.a.j jVarO = o();
            dt dtVar10 = (dt) jVarO.i();
            org.bouncycastle.d.a.g gVarJ = jVarO.j();
            org.bouncycastle.d.a.g gVarD = gVarJ.a(dtVar8).d(dtVar10);
            dtVar = (dt) gVarD.e().a(gVarD).a(dtVar10);
            if (dtVar.j()) {
                return new dw(dVarD, dtVar, dVarD.h(), this.f);
            }
            dt dtVar11 = (dt) gVarD.c(dtVar10.a(dtVar)).a(dtVar).a(gVarJ).d(dtVar).a(dtVar);
            dtVar3 = (dt) dVarD.a(org.bouncycastle.d.a.c.d);
            dtVar2 = dtVar11;
        } else {
            ds.e(jArr8, jArr8);
            long[] jArrA3 = ds.a(jArr7);
            ds.e(jArr4, jArrA3, jArr5);
            ds.e(jArr2, jArrA3, jArr6);
            dtVar = new dt(jArr5);
            ds.c(jArr5, jArr6, dtVar.a);
            if (dtVar.j()) {
                return new dw(dVarD, dtVar, dVarD.h(), this.f);
            }
            dt dtVar12 = new dt(jArr7);
            ds.e(jArr8, jArrA3, dtVar12.a);
            if (jArrA2 != null) {
                ds.e(dtVar12.a, jArrA2, dtVar12.a);
            }
            long[] jArr9 = new long[18];
            ds.a(jArr6, jArr8, jArr8);
            ds.f(jArr8, jArr9);
            ds.a(dtVar6.a, dtVar7.a, jArr8);
            ds.d(jArr8, dtVar12.a, jArr9);
            dtVar2 = new dt(jArr8);
            ds.c(jArr9, dtVar2.a);
            if (jArrA != null) {
                ds.e(dtVar12.a, jArrA, dtVar12.a);
            }
            dtVar3 = dtVar12;
        }
        return new dw(dVarD, dtVar, dtVar2, new org.bouncycastle.d.a.g[]{dtVar3}, this.f);
    }
}
