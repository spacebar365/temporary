package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends j$b {
    public ab(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public ab(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    ab(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new ab(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new ab(this.b, this.c, this.d.d(), this.e, this.f);
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
        aa aaVar = (aa) this.c;
        aa aaVar2 = (aa) this.d;
        aa aaVar3 = (aa) jVar.i();
        aa aaVar4 = (aa) jVar.j();
        aa aaVar5 = (aa) this.e[0];
        aa aaVar6 = (aa) jVar.a(0);
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zI = aaVar5.i();
        if (zI) {
            int[] iArr9 = aaVar3.b;
            iArr = aaVar4.b;
            iArr2 = iArr9;
        } else {
            z.d(aaVar5.b, iArr7);
            z.b(iArr7, aaVar3.b, iArr6);
            z.b(iArr7, aaVar5.b, iArr7);
            z.b(iArr7, aaVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = aaVar6.i();
        if (zI2) {
            int[] iArr10 = aaVar.b;
            iArr3 = aaVar2.b;
            iArr4 = iArr10;
        } else {
            z.d(aaVar6.b, iArr8);
            z.b(iArr8, aaVar.b, iArr5);
            z.b(iArr8, aaVar6.b, iArr8);
            z.b(iArr8, aaVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[6];
        z.d(iArr4, iArr2, iArr11);
        z.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.f.b(iArr11)) {
            return org.bouncycastle.d.c.f.b(iArr6) ? t() : dVarD.e();
        }
        z.d(iArr11, iArr7);
        int[] iArr12 = new int[6];
        z.b(iArr7, iArr11, iArr12);
        z.b(iArr7, iArr4, iArr7);
        z.b(iArr12, iArr12);
        org.bouncycastle.d.c.f.d(iArr3, iArr12, iArr5);
        z.a(org.bouncycastle.d.c.f.b(iArr7, iArr7, iArr12), iArr12);
        aa aaVar7 = new aa(iArr8);
        z.d(iArr6, aaVar7.b);
        z.d(aaVar7.b, iArr12, aaVar7.b);
        aa aaVar8 = new aa(iArr12);
        z.d(iArr7, aaVar7.b, aaVar8.b);
        z.c(aaVar8.b, iArr6, iArr5);
        z.c(iArr5, aaVar8.b);
        aa aaVar9 = new aa(iArr11);
        if (!zI) {
            z.b(aaVar9.b, aaVar5.b, aaVar9.b);
        }
        if (!zI2) {
            z.b(aaVar9.b, aaVar6.b, aaVar9.b);
        }
        return new ab(dVarD, aaVar7, aaVar8, new org.bouncycastle.d.a.g[]{aaVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        aa aaVar = (aa) this.d;
        if (aaVar.j()) {
            return dVarD.e();
        }
        aa aaVar2 = (aa) this.c;
        aa aaVar3 = (aa) this.e[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        z.d(aaVar.b, iArr3);
        int[] iArr4 = new int[6];
        z.d(iArr3, iArr4);
        boolean zI = aaVar3.i();
        int[] iArr5 = aaVar3.b;
        if (!zI) {
            z.d(aaVar3.b, iArr2);
            iArr5 = iArr2;
        }
        z.d(aaVar2.b, iArr5, iArr);
        z.a(aaVar2.b, iArr5, iArr2);
        z.b(iArr2, iArr, iArr2);
        z.a(org.bouncycastle.d.c.f.b(iArr2, iArr2, iArr2), iArr2);
        z.b(iArr3, aaVar2.b, iArr3);
        z.a(org.bouncycastle.d.c.c.e(6, iArr3, 0), iArr3);
        z.a(org.bouncycastle.d.c.c.b(6, iArr4, 0, iArr), iArr);
        aa aaVar4 = new aa(iArr4);
        z.d(iArr2, aaVar4.b);
        z.d(aaVar4.b, iArr3, aaVar4.b);
        z.d(aaVar4.b, iArr3, aaVar4.b);
        aa aaVar5 = new aa(iArr3);
        z.d(iArr3, aaVar4.b, aaVar5.b);
        z.b(aaVar5.b, iArr2, aaVar5.b);
        z.d(aaVar5.b, iArr, aaVar5.b);
        aa aaVar6 = new aa(iArr2);
        z.e(aaVar.b, aaVar6.b);
        if (!zI) {
            z.b(aaVar6.b, aaVar3.b, aaVar6.b);
        }
        return new ab(dVarD, aaVar4, aaVar5, new org.bouncycastle.d.a.g[]{aaVar6}, this.f);
    }
}
