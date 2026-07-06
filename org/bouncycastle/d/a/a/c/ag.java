package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends j$b {
    public ag(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public ag(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    ag(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new ag(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new ag(this.b, this.c, this.d.d(), this.e, this.f);
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
        af afVar = (af) this.c;
        af afVar2 = (af) this.d;
        af afVar3 = (af) jVar.i();
        af afVar4 = (af) jVar.j();
        af afVar5 = (af) this.e[0];
        af afVar6 = (af) jVar.a(0);
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zI = afVar5.i();
        if (zI) {
            int[] iArr9 = afVar3.b;
            iArr = afVar4.b;
            iArr2 = iArr9;
        } else {
            ae.d(afVar5.b, iArr7);
            ae.b(iArr7, afVar3.b, iArr6);
            ae.b(iArr7, afVar5.b, iArr7);
            ae.b(iArr7, afVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = afVar6.i();
        if (zI2) {
            int[] iArr10 = afVar.b;
            iArr3 = afVar2.b;
            iArr4 = iArr10;
        } else {
            ae.d(afVar6.b, iArr8);
            ae.b(iArr8, afVar.b, iArr5);
            ae.b(iArr8, afVar6.b, iArr8);
            ae.b(iArr8, afVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[7];
        ae.d(iArr4, iArr2, iArr11);
        ae.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.g.b(iArr11)) {
            return org.bouncycastle.d.c.g.b(iArr6) ? t() : dVarD.e();
        }
        ae.d(iArr11, iArr7);
        int[] iArr12 = new int[7];
        ae.b(iArr7, iArr11, iArr12);
        ae.b(iArr7, iArr4, iArr7);
        ae.b(iArr12, iArr12);
        org.bouncycastle.d.c.g.c(iArr3, iArr12, iArr5);
        ae.a(org.bouncycastle.d.c.g.b(iArr7, iArr7, iArr12), iArr12);
        af afVar7 = new af(iArr8);
        ae.d(iArr6, afVar7.b);
        ae.d(afVar7.b, iArr12, afVar7.b);
        af afVar8 = new af(iArr12);
        ae.d(iArr7, afVar7.b, afVar8.b);
        ae.c(afVar8.b, iArr6, iArr5);
        ae.c(iArr5, afVar8.b);
        af afVar9 = new af(iArr11);
        if (!zI) {
            ae.b(afVar9.b, afVar5.b, afVar9.b);
        }
        if (!zI2) {
            ae.b(afVar9.b, afVar6.b, afVar9.b);
        }
        return new ag(dVarD, afVar7, afVar8, new org.bouncycastle.d.a.g[]{afVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        af afVar = (af) this.d;
        if (afVar.j()) {
            return dVarD.e();
        }
        af afVar2 = (af) this.c;
        af afVar3 = (af) this.e[0];
        int[] iArr = new int[7];
        ae.d(afVar.b, iArr);
        int[] iArr2 = new int[7];
        ae.d(iArr, iArr2);
        int[] iArr3 = new int[7];
        ae.d(afVar2.b, iArr3);
        ae.a(org.bouncycastle.d.c.g.b(iArr3, iArr3, iArr3), iArr3);
        ae.b(iArr, afVar2.b, iArr);
        ae.a(org.bouncycastle.d.c.c.e(7, iArr, 0), iArr);
        int[] iArr4 = new int[7];
        ae.a(org.bouncycastle.d.c.c.b(7, iArr2, 0, iArr4), iArr4);
        af afVar4 = new af(iArr2);
        ae.d(iArr3, afVar4.b);
        ae.d(afVar4.b, iArr, afVar4.b);
        ae.d(afVar4.b, iArr, afVar4.b);
        af afVar5 = new af(iArr);
        ae.d(iArr, afVar4.b, afVar5.b);
        ae.b(afVar5.b, iArr3, afVar5.b);
        ae.d(afVar5.b, iArr4, afVar5.b);
        af afVar6 = new af(iArr3);
        ae.e(afVar.b, afVar6.b);
        if (!afVar3.i()) {
            ae.b(afVar6.b, afVar3.b, afVar6.b);
        }
        return new ag(dVarD, afVar4, afVar5, new org.bouncycastle.d.a.g[]{afVar6}, this.f);
    }
}
