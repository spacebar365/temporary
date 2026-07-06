package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends j$b {
    public bf(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public bf(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    bf(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new bf(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new bf(this.b, this.c, this.d.d(), this.e, this.f);
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
        be beVar = (be) this.c;
        be beVar2 = (be) this.d;
        be beVar3 = (be) jVar.i();
        be beVar4 = (be) jVar.j();
        be beVar5 = (be) this.e[0];
        be beVar6 = (be) jVar.a(0);
        int[] iArr5 = new int[17];
        int[] iArr6 = new int[17];
        int[] iArr7 = new int[17];
        int[] iArr8 = new int[17];
        boolean zI = beVar5.i();
        if (zI) {
            int[] iArr9 = beVar3.b;
            iArr = beVar4.b;
            iArr2 = iArr9;
        } else {
            bd.c(beVar5.b, iArr7);
            bd.b(iArr7, beVar3.b, iArr6);
            bd.b(iArr7, beVar5.b, iArr7);
            bd.b(iArr7, beVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = beVar6.i();
        if (zI2) {
            int[] iArr10 = beVar.b;
            iArr3 = beVar2.b;
            iArr4 = iArr10;
        } else {
            bd.c(beVar6.b, iArr8);
            bd.b(iArr8, beVar.b, iArr5);
            bd.b(iArr8, beVar6.b, iArr8);
            bd.b(iArr8, beVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[17];
        bd.c(iArr4, iArr2, iArr11);
        bd.c(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.c.c(17, iArr11)) {
            return org.bouncycastle.d.c.c.c(17, iArr6) ? t() : dVarD.e();
        }
        bd.c(iArr11, iArr7);
        int[] iArr12 = new int[17];
        bd.b(iArr7, iArr11, iArr12);
        bd.b(iArr7, iArr4, iArr7);
        bd.b(iArr3, iArr12, iArr5);
        be beVar7 = new be(iArr8);
        bd.c(iArr6, beVar7.b);
        bd.a(beVar7.b, iArr12, beVar7.b);
        bd.c(beVar7.b, iArr7, beVar7.b);
        bd.c(beVar7.b, iArr7, beVar7.b);
        be beVar8 = new be(iArr12);
        bd.c(iArr7, beVar7.b, beVar8.b);
        bd.b(beVar8.b, iArr6, iArr6);
        bd.c(iArr6, iArr5, beVar8.b);
        be beVar9 = new be(iArr11);
        if (!zI) {
            bd.b(beVar9.b, beVar5.b, beVar9.b);
        }
        if (!zI2) {
            bd.b(beVar9.b, beVar6.b, beVar9.b);
        }
        return new bf(dVarD, beVar7, beVar8, new org.bouncycastle.d.a.g[]{beVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        be beVar = (be) this.d;
        if (beVar.j()) {
            return dVarD.e();
        }
        be beVar2 = (be) this.c;
        be beVar3 = (be) this.e[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        bd.c(beVar.b, iArr3);
        int[] iArr4 = new int[17];
        bd.c(iArr3, iArr4);
        boolean zI = beVar3.i();
        int[] iArr5 = beVar3.b;
        if (!zI) {
            bd.c(beVar3.b, iArr2);
            iArr5 = iArr2;
        }
        bd.c(beVar2.b, iArr5, iArr);
        bd.a(beVar2.b, iArr5, iArr2);
        bd.b(iArr2, iArr, iArr2);
        org.bouncycastle.d.c.c.b(17, iArr2, iArr2, iArr2);
        bd.a(iArr2);
        bd.b(iArr3, beVar2.b, iArr3);
        org.bouncycastle.d.c.c.e(17, iArr3, 0);
        bd.a(iArr3);
        org.bouncycastle.d.c.c.b(17, iArr4, 0, iArr);
        bd.a(iArr);
        be beVar4 = new be(iArr4);
        bd.c(iArr2, beVar4.b);
        bd.c(beVar4.b, iArr3, beVar4.b);
        bd.c(beVar4.b, iArr3, beVar4.b);
        be beVar5 = new be(iArr3);
        bd.c(iArr3, beVar4.b, beVar5.b);
        bd.b(beVar5.b, iArr2, beVar5.b);
        bd.c(beVar5.b, iArr, beVar5.b);
        be beVar6 = new be(iArr2);
        bd.d(beVar.b, beVar6.b);
        if (!zI) {
            bd.b(beVar6.b, beVar3.b, beVar6.b);
        }
        return new bf(dVarD, beVar4, beVar5, new org.bouncycastle.d.a.g[]{beVar6}, this.f);
    }
}
