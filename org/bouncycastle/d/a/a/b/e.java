package org.bouncycastle.d.a.a.b;

import org.bouncycastle.d.a.g;
import org.bouncycastle.d.a.j;
import org.bouncycastle.d.a.j$b;
import org.bouncycastle.d.c.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j$b {
    public e(org.bouncycastle.d.a.d dVar, g gVar, g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public e(org.bouncycastle.d.a.d dVar, g gVar, g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    e(org.bouncycastle.d.a.d dVar, g gVar, g gVar2, g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final j d(j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final j e() {
        return new e(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final j s() {
        return p() ? this : new e(this.b, this.c, this.d.d(), this.e, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final j u() {
        return (p() || this.d.j()) ? this : t().b(this);
    }

    @Override // org.bouncycastle.d.a.j
    public final j b(j jVar) {
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
        d dVar = (d) this.c;
        d dVar2 = (d) this.d;
        d dVar3 = (d) jVar.i();
        d dVar4 = (d) jVar.j();
        d dVar5 = (d) this.e[0];
        d dVar6 = (d) jVar.a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zI = dVar5.i();
        if (zI) {
            int[] iArr9 = dVar3.b;
            iArr = dVar4.b;
            iArr2 = iArr9;
        } else {
            c.d(dVar5.b, iArr7);
            c.b(iArr7, dVar3.b, iArr6);
            c.b(iArr7, dVar5.b, iArr7);
            c.b(iArr7, dVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = dVar6.i();
        if (zI2) {
            int[] iArr10 = dVar.b;
            iArr3 = dVar2.b;
            iArr4 = iArr10;
        } else {
            c.d(dVar6.b, iArr8);
            c.b(iArr8, dVar.b, iArr5);
            c.b(iArr8, dVar6.b, iArr8);
            c.b(iArr8, dVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[8];
        c.d(iArr4, iArr2, iArr11);
        c.d(iArr3, iArr, iArr6);
        if (h.b(iArr11)) {
            return h.b(iArr6) ? t() : dVarD.e();
        }
        c.d(iArr11, iArr7);
        int[] iArr12 = new int[8];
        c.b(iArr7, iArr11, iArr12);
        c.b(iArr7, iArr4, iArr7);
        c.b(iArr12, iArr12);
        h.d(iArr3, iArr12, iArr5);
        c.a(h.b(iArr7, iArr7, iArr12), iArr12);
        d dVar7 = new d(iArr8);
        c.d(iArr6, dVar7.b);
        c.d(dVar7.b, iArr12, dVar7.b);
        d dVar8 = new d(iArr12);
        c.d(iArr7, dVar7.b, dVar8.b);
        c.c(dVar8.b, iArr6, iArr5);
        c.c(iArr5, dVar8.b);
        d dVar9 = new d(iArr11);
        if (!zI) {
            c.b(dVar9.b, dVar5.b, dVar9.b);
        }
        if (!zI2) {
            c.b(dVar9.b, dVar6.b, dVar9.b);
        }
        return new e(dVarD, dVar7, dVar8, new g[]{dVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        d dVar = (d) this.d;
        if (dVar.j()) {
            return dVarD.e();
        }
        d dVar2 = (d) this.c;
        d dVar3 = (d) this.e[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        c.d(dVar.b, iArr3);
        int[] iArr4 = new int[8];
        c.d(iArr3, iArr4);
        boolean zI = dVar3.i();
        int[] iArr5 = dVar3.b;
        if (!zI) {
            c.d(dVar3.b, iArr2);
            iArr5 = iArr2;
        }
        c.d(dVar2.b, iArr5, iArr);
        c.a(dVar2.b, iArr5, iArr2);
        c.b(iArr2, iArr, iArr2);
        c.a(h.b(iArr2, iArr2, iArr2), iArr2);
        c.b(iArr3, dVar2.b, iArr3);
        c.a(org.bouncycastle.d.c.c.e(8, iArr3, 0), iArr3);
        c.a(org.bouncycastle.d.c.c.b(8, iArr4, 0, iArr), iArr);
        d dVar4 = new d(iArr4);
        c.d(iArr2, dVar4.b);
        c.d(dVar4.b, iArr3, dVar4.b);
        c.d(dVar4.b, iArr3, dVar4.b);
        d dVar5 = new d(iArr3);
        c.d(iArr3, dVar4.b, dVar5.b);
        c.b(dVar5.b, iArr2, dVar5.b);
        c.d(dVar5.b, iArr, dVar5.b);
        d dVar6 = new d(iArr2);
        c.e(dVar.b, dVar6.b);
        if (!zI) {
            c.b(dVar6.b, dVar3.b, dVar6.b);
        }
        return new e(dVarD, dVar4, dVar5, new g[]{dVar6}, this.f);
    }
}
