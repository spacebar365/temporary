package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class av extends j$b {
    public av(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public av(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    av(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new av(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new av(this.b, this.c, this.d.d(), this.e, this.f);
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
        au auVar = (au) this.c;
        au auVar2 = (au) this.d;
        au auVar3 = (au) jVar.i();
        au auVar4 = (au) jVar.j();
        au auVar5 = (au) this.e[0];
        au auVar6 = (au) jVar.a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zI = auVar5.i();
        if (zI) {
            int[] iArr9 = auVar3.b;
            iArr = auVar4.b;
            iArr2 = iArr9;
        } else {
            at.d(auVar5.b, iArr7);
            at.b(iArr7, auVar3.b, iArr6);
            at.b(iArr7, auVar5.b, iArr7);
            at.b(iArr7, auVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = auVar6.i();
        if (zI2) {
            int[] iArr10 = auVar.b;
            iArr3 = auVar2.b;
            iArr4 = iArr10;
        } else {
            at.d(auVar6.b, iArr8);
            at.b(iArr8, auVar.b, iArr5);
            at.b(iArr8, auVar6.b, iArr8);
            at.b(iArr8, auVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[8];
        at.d(iArr4, iArr2, iArr11);
        at.d(iArr3, iArr, iArr6);
        if (org.bouncycastle.d.c.h.b(iArr11)) {
            return org.bouncycastle.d.c.h.b(iArr6) ? t() : dVarD.e();
        }
        at.d(iArr11, iArr7);
        int[] iArr12 = new int[8];
        at.b(iArr7, iArr11, iArr12);
        at.b(iArr7, iArr4, iArr7);
        at.b(iArr12, iArr12);
        org.bouncycastle.d.c.h.d(iArr3, iArr12, iArr5);
        at.a(org.bouncycastle.d.c.h.b(iArr7, iArr7, iArr12), iArr12);
        au auVar7 = new au(iArr8);
        at.d(iArr6, auVar7.b);
        at.d(auVar7.b, iArr12, auVar7.b);
        au auVar8 = new au(iArr12);
        at.d(iArr7, auVar7.b, auVar8.b);
        at.c(auVar8.b, iArr6, iArr5);
        at.c(iArr5, auVar8.b);
        au auVar9 = new au(iArr11);
        if (!zI) {
            at.b(auVar9.b, auVar5.b, auVar9.b);
        }
        if (!zI2) {
            at.b(auVar9.b, auVar6.b, auVar9.b);
        }
        return new av(dVarD, auVar7, auVar8, new org.bouncycastle.d.a.g[]{auVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        au auVar = (au) this.d;
        if (auVar.j()) {
            return dVarD.e();
        }
        au auVar2 = (au) this.c;
        au auVar3 = (au) this.e[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        at.d(auVar.b, iArr3);
        int[] iArr4 = new int[8];
        at.d(iArr3, iArr4);
        boolean zI = auVar3.i();
        int[] iArr5 = auVar3.b;
        if (!zI) {
            at.d(auVar3.b, iArr2);
            iArr5 = iArr2;
        }
        at.d(auVar2.b, iArr5, iArr);
        at.a(auVar2.b, iArr5, iArr2);
        at.b(iArr2, iArr, iArr2);
        at.a(org.bouncycastle.d.c.h.b(iArr2, iArr2, iArr2), iArr2);
        at.b(iArr3, auVar2.b, iArr3);
        at.a(org.bouncycastle.d.c.c.e(8, iArr3, 0), iArr3);
        at.a(org.bouncycastle.d.c.c.b(8, iArr4, 0, iArr), iArr);
        au auVar4 = new au(iArr4);
        at.d(iArr2, auVar4.b);
        at.d(auVar4.b, iArr3, auVar4.b);
        at.d(auVar4.b, iArr3, auVar4.b);
        au auVar5 = new au(iArr3);
        at.d(iArr3, auVar4.b, auVar5.b);
        at.b(auVar5.b, iArr2, auVar5.b);
        at.d(auVar5.b, iArr, auVar5.b);
        au auVar6 = new au(iArr2);
        at.e(auVar.b, auVar6.b);
        if (!zI) {
            at.b(auVar6.b, auVar3.b, auVar6.b);
        }
        return new av(dVarD, auVar4, auVar5, new org.bouncycastle.d.a.g[]{auVar6}, this.f);
    }
}
