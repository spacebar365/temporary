package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class al extends j$b {
    public al(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public al(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    al(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new al(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new al(this.b, this.c, this.d.d(), this.e, this.f);
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
        ak akVar = (ak) this.c;
        ak akVar2 = (ak) this.d;
        ak akVar3 = (ak) jVar.i();
        ak akVar4 = (ak) jVar.j();
        ak akVar5 = (ak) this.e[0];
        ak akVar6 = (ak) jVar.a(0);
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zI = akVar5.i();
        if (zI) {
            int[] iArr9 = akVar3.b;
            iArr = akVar4.b;
            iArr2 = iArr9;
        } else {
            aj.d(akVar5.b, iArr7);
            aj.b(iArr7, akVar3.b, iArr6);
            aj.b(iArr7, akVar5.b, iArr7);
            aj.b(iArr7, akVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = akVar6.i();
        if (zI2) {
            int[] iArr10 = akVar.b;
            iArr3 = akVar2.b;
            iArr4 = iArr10;
        } else {
            aj.d(akVar6.b, iArr8);
            aj.b(iArr8, akVar.b, iArr5);
            aj.b(iArr8, akVar6.b, iArr8);
            aj.b(iArr8, akVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[7];
        aj.d(iArr4, iArr2, iArr11);
        aj.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.g.b(iArr11)) {
            return org.bouncycastle.d.c.g.b(iArr6) ? t() : dVarD.e();
        }
        aj.d(iArr11, iArr7);
        int[] iArr12 = new int[7];
        aj.b(iArr7, iArr11, iArr12);
        aj.b(iArr7, iArr4, iArr7);
        aj.b(iArr12, iArr12);
        org.bouncycastle.d.c.g.c(iArr3, iArr12, iArr5);
        aj.a(org.bouncycastle.d.c.g.b(iArr7, iArr7, iArr12), iArr12);
        ak akVar7 = new ak(iArr8);
        aj.d(iArr6, akVar7.b);
        aj.d(akVar7.b, iArr12, akVar7.b);
        ak akVar8 = new ak(iArr12);
        aj.d(iArr7, akVar7.b, akVar8.b);
        aj.c(akVar8.b, iArr6, iArr5);
        aj.c(iArr5, akVar8.b);
        ak akVar9 = new ak(iArr11);
        if (!zI) {
            aj.b(akVar9.b, akVar5.b, akVar9.b);
        }
        if (!zI2) {
            aj.b(akVar9.b, akVar6.b, akVar9.b);
        }
        return new al(dVarD, akVar7, akVar8, new org.bouncycastle.d.a.g[]{akVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        ak akVar = (ak) this.d;
        if (akVar.j()) {
            return dVarD.e();
        }
        ak akVar2 = (ak) this.c;
        ak akVar3 = (ak) this.e[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        aj.d(akVar.b, iArr3);
        int[] iArr4 = new int[7];
        aj.d(iArr3, iArr4);
        boolean zI = akVar3.i();
        int[] iArr5 = akVar3.b;
        if (!zI) {
            aj.d(akVar3.b, iArr2);
            iArr5 = iArr2;
        }
        aj.d(akVar2.b, iArr5, iArr);
        aj.a(akVar2.b, iArr5, iArr2);
        aj.b(iArr2, iArr, iArr2);
        aj.a(org.bouncycastle.d.c.g.b(iArr2, iArr2, iArr2), iArr2);
        aj.b(iArr3, akVar2.b, iArr3);
        aj.a(org.bouncycastle.d.c.c.e(7, iArr3, 0), iArr3);
        aj.a(org.bouncycastle.d.c.c.b(7, iArr4, 0, iArr), iArr);
        ak akVar4 = new ak(iArr4);
        aj.d(iArr2, akVar4.b);
        aj.d(akVar4.b, iArr3, akVar4.b);
        aj.d(akVar4.b, iArr3, akVar4.b);
        ak akVar5 = new ak(iArr3);
        aj.d(iArr3, akVar4.b, akVar5.b);
        aj.b(akVar5.b, iArr2, akVar5.b);
        aj.d(akVar5.b, iArr, akVar5.b);
        ak akVar6 = new ak(iArr2);
        aj.e(akVar.b, akVar6.b);
        if (!zI) {
            aj.b(akVar6.b, akVar3.b, akVar6.b);
        }
        return new al(dVarD, akVar4, akVar5, new org.bouncycastle.d.a.g[]{akVar6}, this.f);
    }
}
