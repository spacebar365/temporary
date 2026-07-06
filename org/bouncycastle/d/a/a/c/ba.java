package org.bouncycastle.d.a.a.c;

import org.bouncycastle.d.a.j$b;

/* JADX INFO: loaded from: classes.dex */
public final class ba extends j$b {
    public ba(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        this(dVar, gVar, gVar2, false);
    }

    public ba(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    ba(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j d(org.bouncycastle.d.a.j jVar) {
        return this == jVar ? u() : !p() ? jVar.p() ? t() : !this.d.j() ? t().b(jVar) : jVar : jVar;
    }

    @Override // org.bouncycastle.d.a.j
    protected final org.bouncycastle.d.a.j e() {
        return new ba(null, g(), h());
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j s() {
        return p() ? this : new ba(this.b, this.c, this.d.d(), this.e, this.f);
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
        az azVar = (az) this.c;
        az azVar2 = (az) this.d;
        az azVar3 = (az) jVar.i();
        az azVar4 = (az) jVar.j();
        az azVar5 = (az) this.e[0];
        az azVar6 = (az) jVar.a(0);
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean zI = azVar5.i();
        if (zI) {
            int[] iArr9 = azVar3.b;
            iArr = azVar4.b;
            iArr2 = iArr9;
        } else {
            ay.d(azVar5.b, iArr7);
            ay.c(iArr7, azVar3.b, iArr6);
            ay.c(iArr7, azVar5.b, iArr7);
            ay.c(iArr7, azVar4.b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zI2 = azVar6.i();
        if (zI2) {
            int[] iArr10 = azVar.b;
            iArr3 = azVar2.b;
            iArr4 = iArr10;
        } else {
            ay.d(azVar6.b, iArr8);
            ay.c(iArr8, azVar.b, iArr5);
            ay.c(iArr8, azVar6.b, iArr8);
            ay.c(iArr8, azVar2.b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[12];
        ay.d(iArr4, iArr2, iArr11);
        int[] iArr12 = new int[12];
        ay.d(iArr3, iArr, iArr12);
        if (org.bouncycastle.d.c.c.c(12, iArr11)) {
            return org.bouncycastle.d.c.c.c(12, iArr12) ? t() : dVarD.e();
        }
        ay.d(iArr11, iArr7);
        int[] iArr13 = new int[12];
        ay.c(iArr7, iArr11, iArr13);
        ay.c(iArr7, iArr4, iArr7);
        ay.b(iArr13, iArr13);
        org.bouncycastle.d.c.j.a(iArr3, iArr13, iArr5);
        ay.a(org.bouncycastle.d.c.c.b(12, iArr7, iArr7, iArr13), iArr13);
        az azVar7 = new az(iArr8);
        ay.d(iArr12, azVar7.b);
        ay.d(azVar7.b, iArr13, azVar7.b);
        az azVar8 = new az(iArr13);
        ay.d(iArr7, azVar7.b, azVar8.b);
        org.bouncycastle.d.c.j.a(azVar8.b, iArr12, iArr6);
        ay.b(iArr5, iArr6, iArr5);
        ay.c(iArr5, azVar8.b);
        az azVar9 = new az(iArr11);
        if (!zI) {
            ay.c(azVar9.b, azVar5.b, azVar9.b);
        }
        if (!zI2) {
            ay.c(azVar9.b, azVar6.b, azVar9.b);
        }
        return new ba(dVarD, azVar7, azVar8, new org.bouncycastle.d.a.g[]{azVar9}, this.f);
    }

    @Override // org.bouncycastle.d.a.j
    public final org.bouncycastle.d.a.j t() {
        if (p()) {
            return this;
        }
        org.bouncycastle.d.a.d dVarD = d();
        az azVar = (az) this.d;
        if (azVar.j()) {
            return dVarD.e();
        }
        az azVar2 = (az) this.c;
        az azVar3 = (az) this.e[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        ay.d(azVar.b, iArr3);
        int[] iArr4 = new int[12];
        ay.d(iArr3, iArr4);
        boolean zI = azVar3.i();
        int[] iArr5 = azVar3.b;
        if (!zI) {
            ay.d(azVar3.b, iArr2);
            iArr5 = iArr2;
        }
        ay.d(azVar2.b, iArr5, iArr);
        ay.a(azVar2.b, iArr5, iArr2);
        ay.c(iArr2, iArr, iArr2);
        ay.a(org.bouncycastle.d.c.c.b(12, iArr2, iArr2, iArr2), iArr2);
        ay.c(iArr3, azVar2.b, iArr3);
        ay.a(org.bouncycastle.d.c.c.e(12, iArr3, 0), iArr3);
        ay.a(org.bouncycastle.d.c.c.b(12, iArr4, 0, iArr), iArr);
        az azVar4 = new az(iArr4);
        ay.d(iArr2, azVar4.b);
        ay.d(azVar4.b, iArr3, azVar4.b);
        ay.d(azVar4.b, iArr3, azVar4.b);
        az azVar5 = new az(iArr3);
        ay.d(iArr3, azVar4.b, azVar5.b);
        ay.c(azVar5.b, iArr2, azVar5.b);
        ay.d(azVar5.b, iArr, azVar5.b);
        az azVar6 = new az(iArr2);
        ay.e(azVar.b, azVar6.b);
        if (!zI) {
            ay.c(azVar6.b, azVar3.b, azVar6.b);
        }
        return new ba(dVarD, azVar4, azVar5, new org.bouncycastle.d.a.g[]{azVar6}, this.f);
    }
}
