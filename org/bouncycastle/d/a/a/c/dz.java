package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$a;

/* JADX INFO: loaded from: classes.dex */
public final class dz extends j$a {
    public dz(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public dz(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    dz(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new dz(null, g(), h());
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
        return new dz(this.b, gVar, gVar2.a(gVar3), new org.bouncycastle.d.a.g[]{gVar3}, this.f);
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
            dtVar = (dt) gVarD.e().a(gVarD).a(dtVar10).c();
            if (dtVar.j()) {
                return new dz(dVarD, dtVar, dx.k, this.f);
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
                return new dz(dVarD, dtVar, dx.k, this.f);
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
        return new dz(dVarD, dtVar, dtVar2, new org.bouncycastle.d.a.g[]{dtVar3}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        dt dtVar = (dt) this.c;
        if (dtVar.j()) {
            return dVarD.e();
        }
        dt dtVar2 = (dt) this.d;
        dt dtVar3 = (dt) this.e[0];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArrA = dtVar3.i() ? null : ds.a(dtVar3.a);
        if (jArrA == null) {
            long[] jArr6 = dtVar2.a;
            jArr2 = dtVar3.a;
            jArr = jArr6;
        } else {
            ds.e(dtVar2.a, jArrA, jArr4);
            ds.e(dtVar3.a, jArr5);
            jArr = jArr4;
            jArr2 = jArr5;
        }
        long[] jArr7 = new long[9];
        ds.e(dtVar2.a, jArr7);
        ds.b(jArr, jArr2, jArr7);
        if (org.bouncycastle.d.c.m.a(jArr7)) {
            return new dz(dVarD, new dt(jArr7), dx.k, this.f);
        }
        long[] jArr8 = new long[18];
        ds.d(jArr7, jArr, jArr8);
        dt dtVar4 = new dt(jArr4);
        ds.e(jArr7, dtVar4.a);
        dt dtVar5 = new dt(jArr7);
        if (jArrA != null) {
            ds.c(dtVar5.a, jArr2, dtVar5.a);
        }
        if (jArrA == null) {
            jArr3 = dtVar.a;
        } else {
            ds.e(dtVar.a, jArrA, jArr5);
            jArr3 = jArr5;
        }
        ds.f(jArr3, jArr8);
        ds.c(jArr8, jArr5);
        ds.b(dtVar4.a, dtVar5.a, jArr5);
        return new dz(dVarD, dtVar4, new dt(jArr5), new org.bouncycastle.d.a.g[]{dtVar5}, this.f);
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
        dt dtVar = (dt) this.c;
        if (dtVar.j()) {
            return jVar;
        }
        dt dtVar2 = (dt) jVar.k();
        dt dtVar3 = (dt) jVar.a(0);
        if (dtVar2.j() || !dtVar3.i()) {
            return t().b(jVar);
        }
        dt dtVar4 = (dt) this.d;
        dt dtVar5 = (dt) this.e[0];
        dt dtVar6 = (dt) jVar.l();
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        ds.e(dtVar.a, jArr);
        ds.e(dtVar4.a, jArr2);
        ds.e(dtVar5.a, jArr3);
        ds.c(dtVar4.a, dtVar5.a, jArr4);
        ds.b(jArr3, jArr2, jArr4);
        long[] jArrA = ds.a(jArr3);
        ds.e(dtVar6.a, jArrA, jArr3);
        ds.a(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        ds.d(jArr3, jArr4, jArr5);
        ds.f(jArr, jArrA, jArr5);
        ds.c(jArr5, jArr3);
        ds.e(dtVar2.a, jArrA, jArr);
        ds.a(jArr, jArr4, jArr2);
        ds.e(jArr2, jArr2);
        if (org.bouncycastle.d.c.m.a(jArr2)) {
            return org.bouncycastle.d.c.m.a(jArr3) ? jVar.t() : dVarD.e();
        }
        if (org.bouncycastle.d.c.m.a(jArr3)) {
            return new dz(dVarD, new dt(jArr3), dx.k, this.f);
        }
        dt dtVar7 = new dt();
        ds.e(jArr3, dtVar7.a);
        ds.c(dtVar7.a, jArr, dtVar7.a);
        dt dtVar8 = new dt(jArr);
        ds.c(jArr3, jArr2, dtVar8.a);
        ds.e(dtVar8.a, jArrA, dtVar8.a);
        dt dtVar9 = new dt(jArr2);
        ds.a(jArr3, jArr2, dtVar9.a);
        ds.e(dtVar9.a, dtVar9.a);
        for (int i = 0; i < 18; i++) {
            jArr5[i] = 0;
        }
        ds.d(dtVar9.a, jArr4, jArr5);
        ds.a(dtVar6.a, jArr4);
        ds.d(jArr4, dtVar8.a, jArr5);
        ds.c(jArr5, dtVar9.a);
        return new dz(dVarD, dtVar7, dtVar9, new org.bouncycastle.d.a.g[]{dtVar8}, this.f);
    }
}
