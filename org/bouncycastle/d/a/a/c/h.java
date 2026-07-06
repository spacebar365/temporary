package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j$b {
    public h(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public h(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    h(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new h(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new h(this.b, this.c, this.d.d(), this.e, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j u() {
        return (p() || this.d.j()) ? this : t().b(this);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j b(org.bouncycastle.d.a.j jVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (p()) {
            return jVar;
        }
        if (jVar.p()) {
            return this;
        }
        if (this == jVar) {
            return t();
        }
        org.bouncycastle.d.a.d dVarD = d();
        q qVar = (q) this.c;
        q qVar2 = (q) this.d;
        q qVar3 = (q) jVar.i();
        q qVar4 = (q) jVar.j();
        q qVar5 = (q) this.e[0];
        q qVar6 = (q) jVar.a(0);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zI = qVar5.i();
        if (zI) {
            int[] iArr9 = qVar3.b;
            iArr = qVar4.b;
            iArr2 = iArr9;
        } else {
            p.d(qVar5.b, iArr7);
            p.b(iArr7, qVar3.b, iArr6);
            p.b(iArr7, qVar5.b, iArr7);
            p.b(iArr7, qVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = qVar6.i();
        if (zI2) {
            int[] iArr10 = qVar.b;
            iArr3 = qVar2.b;
            iArr4 = iArr10;
        } else {
            p.d(qVar6.b, iArr8);
            p.b(iArr8, qVar.b, iArr5);
            p.b(iArr8, qVar6.b, iArr8);
            p.b(iArr8, qVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[5];
        p.d(iArr4, iArr2, iArr11);
        p.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.e.b(iArr11)) {
            return org.bouncycastle.d.c.e.b(iArr6) ? t() : dVarD.e();
        }
        p.d(iArr11, iArr7);
        int[] iArr12 = new int[5];
        p.b(iArr7, iArr11, iArr12);
        p.b(iArr7, iArr4, iArr7);
        p.b(iArr12, iArr12);
        org.bouncycastle.d.c.e.c(iArr3, iArr12, iArr5);
        p.a(org.bouncycastle.d.c.e.b(iArr7, iArr7, iArr12), iArr12);
        q qVar7 = new q(iArr8);
        p.d(iArr6, qVar7.b);
        p.d(qVar7.b, iArr12, qVar7.b);
        q qVar8 = new q(iArr12);
        p.d(iArr7, qVar7.b, qVar8.b);
        p.c(qVar8.b, iArr6, iArr5);
        p.c(iArr5, qVar8.b);
        q qVar9 = new q(iArr11);
        if (!zI) {
            p.b(qVar9.b, qVar5.b, qVar9.b);
        }
        if (!zI2) {
            p.b(qVar9.b, qVar6.b, qVar9.b);
        }
        return new h(dVarD, qVar7, qVar8, new org.bouncycastle.d.a.g[]{qVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        q qVar = (q) this.d;
        if (qVar.j()) {
            return dVarD.e();
        }
        q qVar2 = (q) this.c;
        q qVar3 = (q) this.e[0];
        int[] iArr = new int[5];
        p.d(qVar.b, iArr);
        int[] iArr2 = new int[5];
        p.d(iArr, iArr2);
        int[] iArr3 = new int[5];
        p.d(qVar2.b, iArr3);
        p.a(org.bouncycastle.d.c.e.b(iArr3, iArr3, iArr3), iArr3);
        p.b(iArr, qVar2.b, iArr);
        p.a(org.bouncycastle.d.c.c.e(5, iArr, 0), iArr);
        int[] iArr4 = new int[5];
        p.a(org.bouncycastle.d.c.c.b(5, iArr2, 0, iArr4), iArr4);
        q qVar4 = new q(iArr2);
        p.d(iArr3, qVar4.b);
        p.d(qVar4.b, iArr, qVar4.b);
        p.d(qVar4.b, iArr, qVar4.b);
        q qVar5 = new q(iArr);
        p.d(iArr, qVar4.b, qVar5.b);
        p.b(qVar5.b, iArr3, qVar5.b);
        p.d(qVar5.b, iArr4, qVar5.b);
        q qVar6 = new q(iArr3);
        p.e(qVar.b, qVar6.b);
        if (!qVar3.i()) {
            p.b(qVar6.b, qVar3.b, qVar6.b);
        }
        return new h(dVarD, qVar4, qVar5, new org.bouncycastle.d.a.g[]{qVar6}, this.f);
    }
}
