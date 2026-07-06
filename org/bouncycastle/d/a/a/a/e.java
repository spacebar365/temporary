package org.bouncycastle.d.a.a.a;

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

    private d a(d dVar, int[] iArr) {
        d dVar2 = (d) d().g();
        if (dVar.i()) {
            return dVar2;
        }
        d dVar3 = new d();
        if (iArr == null) {
            iArr = dVar3.b;
            c.d(dVar.b, iArr);
        }
        c.d(iArr, dVar3.b);
        c.b(dVar3.b, dVar2.b, dVar3.b);
        return dVar3;
    }

    private d v() {
        d dVar = (d) this.e[1];
        if (dVar != null) {
            return dVar;
        }
        g[] gVarArr = this.e;
        d dVarA = a((d) this.e[0], (int[]) null);
        gVarArr[1] = dVarA;
        return dVarA;
    }

    @Override // org.bouncycastle.d.a.j
    public final g a(int i) {
        return i == 1 ? v() : super.a(i);
    }

    @Override // org.bouncycastle.d.a.j
    public final j d(j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? b(false).b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final j e() {
        return new e(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final j s() {
        return p() ? this : new e(d(), this.c, this.d.d(), this.e, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final j t() {
        if (p()) {
            return this;
        }
        return this.d.j() ? d().e() : b(true);
    }

    @Override // org.bouncycastle.d.a.j
    public final j u() {
        return (p() || this.d.j()) ? this : b(false).b(this);
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
        d dVar3 = (d) this.e[0];
        d dVar4 = (d) jVar.i();
        d dVar5 = (d) jVar.j();
        d dVar6 = (d) jVar.a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zI = dVar3.i();
        if (zI) {
            int[] iArr9 = dVar4.b;
            iArr = dVar5.b;
            iArr2 = iArr9;
        } else {
            c.d(dVar3.b, iArr7);
            c.b(iArr7, dVar4.b, iArr6);
            c.b(iArr7, dVar3.b, iArr7);
            c.b(iArr7, dVar5.b, iArr7);
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
        int[] iArr12 = new int[8];
        c.d(iArr11, iArr12);
        int[] iArr13 = new int[8];
        c.b(iArr12, iArr11, iArr13);
        c.b(iArr12, iArr4, iArr7);
        c.b(iArr13, iArr13);
        h.d(iArr3, iArr13, iArr5);
        c.a(h.b(iArr7, iArr7, iArr13), iArr13);
        d dVar7 = new d(iArr8);
        c.d(iArr6, dVar7.b);
        c.d(dVar7.b, iArr13, dVar7.b);
        d dVar8 = new d(iArr13);
        c.d(iArr7, dVar7.b, dVar8.b);
        c.c(dVar8.b, iArr6, iArr5);
        c.c(iArr5, dVar8.b);
        d dVar9 = new d(iArr11);
        if (!zI) {
            c.b(dVar9.b, dVar3.b, dVar9.b);
        }
        if (!zI2) {
            c.b(dVar9.b, dVar6.b, dVar9.b);
        }
        return new e(dVarD, dVar7, dVar8, new g[]{dVar9, a(dVar9, (zI && zI2) ? iArr12 : null)}, this.f);
    }

    private e b(boolean z) {
        d dVar;
        d dVar2 = (d) this.c;
        d dVar3 = (d) this.d;
        d dVar4 = (d) this.e[0];
        d dVarV = v();
        int[] iArr = new int[8];
        c.d(dVar2.b, iArr);
        c.a(h.b(iArr, iArr, iArr) + h.a(dVarV.b, iArr), iArr);
        int[] iArr2 = new int[8];
        c.e(dVar3.b, iArr2);
        int[] iArr3 = new int[8];
        c.b(iArr2, dVar3.b, iArr3);
        int[] iArr4 = new int[8];
        c.b(iArr3, dVar2.b, iArr4);
        c.e(iArr4, iArr4);
        int[] iArr5 = new int[8];
        c.d(iArr3, iArr5);
        c.e(iArr5, iArr5);
        d dVar5 = new d(iArr3);
        c.d(iArr, dVar5.b);
        c.d(dVar5.b, iArr4, dVar5.b);
        c.d(dVar5.b, iArr4, dVar5.b);
        d dVar6 = new d(iArr4);
        c.d(iArr4, dVar5.b, dVar6.b);
        c.b(dVar6.b, iArr, dVar6.b);
        c.d(dVar6.b, iArr5, dVar6.b);
        d dVar7 = new d(iArr2);
        if (!h.a(dVar4.b)) {
            c.b(dVar7.b, dVar4.b, dVar7.b);
        }
        if (z) {
            d dVar8 = new d(iArr5);
            c.b(dVar8.b, dVarV.b, dVar8.b);
            c.e(dVar8.b, dVar8.b);
            dVar = dVar8;
        } else {
            dVar = null;
        }
        return new e(d(), dVar5, dVar6, new g[]{dVar7, dVar}, this.f);
    }
}
