package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class aq extends j$b {
    public aq(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public aq(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    aq(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new aq(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new aq(this.b, this.c, this.d.d(), this.e, this.f);
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
        ap apVar = (ap) this.c;
        ap apVar2 = (ap) this.d;
        ap apVar3 = (ap) jVar.i();
        ap apVar4 = (ap) jVar.j();
        ap apVar5 = (ap) this.e[0];
        ap apVar6 = (ap) jVar.a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zI = apVar5.i();
        if (zI) {
            int[] iArr9 = apVar3.b;
            iArr = apVar4.b;
            iArr2 = iArr9;
        } else {
            ao.d(apVar5.b, iArr7);
            ao.b(iArr7, apVar3.b, iArr6);
            ao.b(iArr7, apVar5.b, iArr7);
            ao.b(iArr7, apVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = apVar6.i();
        if (zI2) {
            int[] iArr10 = apVar.b;
            iArr3 = apVar2.b;
            iArr4 = iArr10;
        } else {
            ao.d(apVar6.b, iArr8);
            ao.b(iArr8, apVar.b, iArr5);
            ao.b(iArr8, apVar6.b, iArr8);
            ao.b(iArr8, apVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[8];
        ao.d(iArr4, iArr2, iArr11);
        ao.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.h.b(iArr11)) {
            return org.bouncycastle.d.c.h.b(iArr6) ? t() : dVarD.e();
        }
        ao.d(iArr11, iArr7);
        int[] iArr12 = new int[8];
        ao.b(iArr7, iArr11, iArr12);
        ao.b(iArr7, iArr4, iArr7);
        ao.b(iArr12, iArr12);
        org.bouncycastle.d.c.h.d(iArr3, iArr12, iArr5);
        ao.a(org.bouncycastle.d.c.h.b(iArr7, iArr7, iArr12), iArr12);
        ap apVar7 = new ap(iArr8);
        ao.d(iArr6, apVar7.b);
        ao.d(apVar7.b, iArr12, apVar7.b);
        ap apVar8 = new ap(iArr12);
        ao.d(iArr7, apVar7.b, apVar8.b);
        ao.c(apVar8.b, iArr6, iArr5);
        ao.c(iArr5, apVar8.b);
        ap apVar9 = new ap(iArr11);
        if (!zI) {
            ao.b(apVar9.b, apVar5.b, apVar9.b);
        }
        if (!zI2) {
            ao.b(apVar9.b, apVar6.b, apVar9.b);
        }
        return new aq(dVarD, apVar7, apVar8, new org.bouncycastle.d.a.g[]{apVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        ap apVar = (ap) this.d;
        if (apVar.j()) {
            return dVarD.e();
        }
        ap apVar2 = (ap) this.c;
        ap apVar3 = (ap) this.e[0];
        int[] iArr = new int[8];
        ao.d(apVar.b, iArr);
        int[] iArr2 = new int[8];
        ao.d(iArr, iArr2);
        int[] iArr3 = new int[8];
        ao.d(apVar2.b, iArr3);
        ao.a(org.bouncycastle.d.c.h.b(iArr3, iArr3, iArr3), iArr3);
        ao.b(iArr, apVar2.b, iArr);
        ao.a(org.bouncycastle.d.c.c.e(8, iArr, 0), iArr);
        int[] iArr4 = new int[8];
        ao.a(org.bouncycastle.d.c.c.b(8, iArr2, 0, iArr4), iArr4);
        ap apVar4 = new ap(iArr2);
        ao.d(iArr3, apVar4.b);
        ao.d(apVar4.b, iArr, apVar4.b);
        ao.d(apVar4.b, iArr, apVar4.b);
        ap apVar5 = new ap(iArr);
        ao.d(iArr, apVar4.b, apVar5.b);
        ao.b(apVar5.b, iArr3, apVar5.b);
        ao.d(apVar5.b, iArr4, apVar5.b);
        ap apVar6 = new ap(iArr3);
        ao.e(apVar.b, apVar6.b);
        if (!apVar3.i()) {
            ao.b(apVar6.b, apVar3.b, apVar6.b);
        }
        return new aq(dVarD, apVar4, apVar5, new org.bouncycastle.d.a.g[]{apVar6}, this.f);
    }
}
