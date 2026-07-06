package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class m extends j$b {
    public m(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public m(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    m(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new m(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new m(this.b, this.c, this.d.d(), this.e, this.f);
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
        l lVar = (l) this.c;
        l lVar2 = (l) this.d;
        l lVar3 = (l) jVar.i();
        l lVar4 = (l) jVar.j();
        l lVar5 = (l) this.e[0];
        l lVar6 = (l) jVar.a(0);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zI = lVar5.i();
        if (zI) {
            int[] iArr9 = lVar3.b;
            iArr = lVar4.b;
            iArr2 = iArr9;
        } else {
            k.d(lVar5.b, iArr7);
            k.b(iArr7, lVar3.b, iArr6);
            k.b(iArr7, lVar5.b, iArr7);
            k.b(iArr7, lVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = lVar6.i();
        if (zI2) {
            int[] iArr10 = lVar.b;
            iArr3 = lVar2.b;
            iArr4 = iArr10;
        } else {
            k.d(lVar6.b, iArr8);
            k.b(iArr8, lVar.b, iArr5);
            k.b(iArr8, lVar6.b, iArr8);
            k.b(iArr8, lVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[5];
        k.d(iArr4, iArr2, iArr11);
        k.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.e.b(iArr11)) {
            return org.bouncycastle.d.c.e.b(iArr6) ? t() : dVarD.e();
        }
        k.d(iArr11, iArr7);
        int[] iArr12 = new int[5];
        k.b(iArr7, iArr11, iArr12);
        k.b(iArr7, iArr4, iArr7);
        k.b(iArr12, iArr12);
        org.bouncycastle.d.c.e.c(iArr3, iArr12, iArr5);
        k.a(org.bouncycastle.d.c.e.b(iArr7, iArr7, iArr12), iArr12);
        l lVar7 = new l(iArr8);
        k.d(iArr6, lVar7.b);
        k.d(lVar7.b, iArr12, lVar7.b);
        l lVar8 = new l(iArr12);
        k.d(iArr7, lVar7.b, lVar8.b);
        k.c(lVar8.b, iArr6, iArr5);
        k.c(iArr5, lVar8.b);
        l lVar9 = new l(iArr11);
        if (!zI) {
            k.b(lVar9.b, lVar5.b, lVar9.b);
        }
        if (!zI2) {
            k.b(lVar9.b, lVar6.b, lVar9.b);
        }
        return new m(dVarD, lVar7, lVar8, new org.bouncycastle.d.a.g[]{lVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        l lVar = (l) this.d;
        if (lVar.j()) {
            return dVarD.e();
        }
        l lVar2 = (l) this.c;
        l lVar3 = (l) this.e[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        k.d(lVar.b, iArr3);
        int[] iArr4 = new int[5];
        k.d(iArr3, iArr4);
        boolean zI = lVar3.i();
        int[] iArr5 = lVar3.b;
        if (!zI) {
            k.d(lVar3.b, iArr2);
            iArr5 = iArr2;
        }
        k.d(lVar2.b, iArr5, iArr);
        k.a(lVar2.b, iArr5, iArr2);
        k.b(iArr2, iArr, iArr2);
        k.a(org.bouncycastle.d.c.e.b(iArr2, iArr2, iArr2), iArr2);
        k.b(iArr3, lVar2.b, iArr3);
        k.a(org.bouncycastle.d.c.c.e(5, iArr3, 0), iArr3);
        k.a(org.bouncycastle.d.c.c.b(5, iArr4, 0, iArr), iArr);
        l lVar4 = new l(iArr4);
        k.d(iArr2, lVar4.b);
        k.d(lVar4.b, iArr3, lVar4.b);
        k.d(lVar4.b, iArr3, lVar4.b);
        l lVar5 = new l(iArr3);
        k.d(iArr3, lVar4.b, lVar5.b);
        k.b(lVar5.b, iArr2, lVar5.b);
        k.d(lVar5.b, iArr, lVar5.b);
        l lVar6 = new l(iArr2);
        k.e(lVar.b, lVar6.b);
        if (!zI) {
            k.b(lVar6.b, lVar3.b, lVar6.b);
        }
        return new m(dVarD, lVar4, lVar5, new org.bouncycastle.d.a.g[]{lVar6}, this.f);
    }
}
