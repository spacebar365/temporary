package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class w extends j$b {
    public w(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public w(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    w(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new w(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new w(this.b, this.c, this.d.d(), this.e, this.f);
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
        v vVar = (v) this.c;
        v vVar2 = (v) this.d;
        v vVar3 = (v) jVar.i();
        v vVar4 = (v) jVar.j();
        v vVar5 = (v) this.e[0];
        v vVar6 = (v) jVar.a(0);
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zI = vVar5.i();
        if (zI) {
            int[] iArr9 = vVar3.b;
            iArr = vVar4.b;
            iArr2 = iArr9;
        } else {
            u.d(vVar5.b, iArr7);
            u.b(iArr7, vVar3.b, iArr6);
            u.b(iArr7, vVar5.b, iArr7);
            u.b(iArr7, vVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = vVar6.i();
        if (zI2) {
            int[] iArr10 = vVar.b;
            iArr3 = vVar2.b;
            iArr4 = iArr10;
        } else {
            u.d(vVar6.b, iArr8);
            u.b(iArr8, vVar.b, iArr5);
            u.b(iArr8, vVar6.b, iArr8);
            u.b(iArr8, vVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[6];
        u.d(iArr4, iArr2, iArr11);
        u.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.f.b(iArr11)) {
            return org.bouncycastle.d.c.f.b(iArr6) ? t() : dVarD.e();
        }
        u.d(iArr11, iArr7);
        int[] iArr12 = new int[6];
        u.b(iArr7, iArr11, iArr12);
        u.b(iArr7, iArr4, iArr7);
        u.b(iArr12, iArr12);
        org.bouncycastle.d.c.f.d(iArr3, iArr12, iArr5);
        u.a(org.bouncycastle.d.c.f.b(iArr7, iArr7, iArr12), iArr12);
        v vVar7 = new v(iArr8);
        u.d(iArr6, vVar7.b);
        u.d(vVar7.b, iArr12, vVar7.b);
        v vVar8 = new v(iArr12);
        u.d(iArr7, vVar7.b, vVar8.b);
        u.c(vVar8.b, iArr6, iArr5);
        u.c(iArr5, vVar8.b);
        v vVar9 = new v(iArr11);
        if (!zI) {
            u.b(vVar9.b, vVar5.b, vVar9.b);
        }
        if (!zI2) {
            u.b(vVar9.b, vVar6.b, vVar9.b);
        }
        return new w(dVarD, vVar7, vVar8, new org.bouncycastle.d.a.g[]{vVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        v vVar = (v) this.d;
        if (vVar.j()) {
            return dVarD.e();
        }
        v vVar2 = (v) this.c;
        v vVar3 = (v) this.e[0];
        int[] iArr = new int[6];
        u.d(vVar.b, iArr);
        int[] iArr2 = new int[6];
        u.d(iArr, iArr2);
        int[] iArr3 = new int[6];
        u.d(vVar2.b, iArr3);
        u.a(org.bouncycastle.d.c.f.b(iArr3, iArr3, iArr3), iArr3);
        u.b(iArr, vVar2.b, iArr);
        u.a(org.bouncycastle.d.c.c.e(6, iArr, 0), iArr);
        int[] iArr4 = new int[6];
        u.a(org.bouncycastle.d.c.c.b(6, iArr2, 0, iArr4), iArr4);
        v vVar4 = new v(iArr2);
        u.d(iArr3, vVar4.b);
        u.d(vVar4.b, iArr, vVar4.b);
        u.d(vVar4.b, iArr, vVar4.b);
        v vVar5 = new v(iArr);
        u.d(iArr, vVar4.b, vVar5.b);
        u.b(vVar5.b, iArr3, vVar5.b);
        u.d(vVar5.b, iArr4, vVar5.b);
        v vVar6 = new v(iArr3);
        u.e(vVar.b, vVar6.b);
        if (!vVar3.i()) {
            u.b(vVar6.b, vVar3.b, vVar6.b);
        }
        return new w(dVarD, vVar4, vVar5, new org.bouncycastle.d.a.g[]{vVar6}, this.f);
    }
}
