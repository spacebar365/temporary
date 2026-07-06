package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
public class j$c extends j$a {
    public j$c(d dVar, g gVar, g gVar2, boolean z) {
        super(dVar, gVar, gVar2);
        if ((gVar == null) != (gVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        if (gVar != null) {
            g$c.b(this.c, this.d);
            if (dVar != null) {
                g$c.b(this.c, this.b.g());
            }
        }
        this.f = z;
    }

    j$c(d dVar, g gVar, g gVar2, g[] gVarArr, boolean z) {
        super(dVar, gVar, gVar2, gVarArr);
        this.f = z;
    }

    @Override // org.bouncycastle.d.a.j
    public final j b(j jVar) {
        g gVarC;
        g gVarC2;
        g gVarC3;
        g gVarC4;
        g gVarC5;
        g gVarA;
        g gVarC6;
        if (p()) {
            return jVar;
        }
        if (jVar.p()) {
            return this;
        }
        d dVarD = d();
        int iK = dVarD.k();
        g gVar = this.c;
        g gVar2 = jVar.c;
        switch (iK) {
            case 0:
                g gVar3 = this.d;
                g gVar4 = jVar.d;
                g gVarA2 = gVar.a(gVar2);
                g gVarA3 = gVar3.a(gVar4);
                if (gVarA2.j()) {
                    return gVarA3.j() ? t() : dVarD.e();
                }
                g gVarD = gVarA3.d(gVarA2);
                g gVarA4 = gVarD.e().a(gVarD).a(gVarA2).a(dVarD.g());
                return new j$c(dVarD, gVarA4, gVarD.c(gVar.a(gVarA4)).a(gVarA4).a(gVar3), this.f);
            case 1:
                g gVar5 = this.d;
                g gVar6 = this.e[0];
                g gVar7 = jVar.d;
                g gVar8 = jVar.e[0];
                boolean zI = gVar8.i();
                g gVarA5 = gVar6.c(gVar7).a(zI ? gVar5 : gVar5.c(gVar8));
                g gVarA6 = gVar6.c(gVar2).a(zI ? gVar : gVar.c(gVar8));
                if (gVarA6.j()) {
                    return gVarA5.j() ? t() : dVarD.e();
                }
                g gVarE = gVarA6.e();
                g gVarC7 = gVarE.c(gVarA6);
                g gVarC8 = zI ? gVar6 : gVar6.c(gVar8);
                g gVarA7 = gVarA5.a(gVarA6);
                g gVarA8 = gVarA7.b(gVarA5, gVarE, dVarD.g()).c(gVarC8).a(gVarC7);
                g gVarC9 = gVarA6.c(gVarA8);
                if (!zI) {
                    gVarE = gVarE.c(gVar8);
                }
                return new j$c(dVarD, gVarC9, gVarA5.b(gVar, gVarA6, gVar5).b(gVarE, gVarA7, gVarA8), new g[]{gVarC7.c(gVarC8)}, this.f);
            case 6:
                if (gVar.j()) {
                    return gVar2.j() ? dVarD.e() : jVar.b(this);
                }
                g gVar9 = this.d;
                g gVar10 = this.e[0];
                g gVar11 = jVar.d;
                g gVar12 = jVar.e[0];
                boolean zI2 = gVar10.i();
                if (zI2) {
                    gVarC = gVar11;
                    gVarC2 = gVar2;
                } else {
                    gVarC2 = gVar2.c(gVar10);
                    gVarC = gVar11.c(gVar10);
                }
                boolean zI3 = gVar12.i();
                if (zI3) {
                    gVarC3 = gVar9;
                    gVarC4 = gVar;
                } else {
                    gVarC4 = gVar.c(gVar12);
                    gVarC3 = gVar9.c(gVar12);
                }
                g gVarA9 = gVarC3.a(gVarC);
                g gVarA10 = gVarC4.a(gVarC2);
                if (gVarA10.j()) {
                    return gVarA9.j() ? t() : dVarD.e();
                }
                if (gVar2.j()) {
                    j jVarO = o();
                    g gVarI = jVarO.i();
                    g gVarJ = jVarO.j();
                    g gVarD2 = gVarJ.a(gVar11).d(gVarI);
                    gVarC5 = gVarD2.e().a(gVarD2).a(gVarI).a(dVarD.g());
                    if (gVarC5.j()) {
                        return new j$c(dVarD, gVarC5, dVarD.h().g(), this.f);
                    }
                    gVarA = gVarD2.c(gVarI.a(gVarC5)).a(gVarC5).a(gVarJ).d(gVarC5).a(gVarC5);
                    gVarC6 = dVarD.a(c.d);
                } else {
                    g gVarE2 = gVarA10.e();
                    g gVarC10 = gVarA9.c(gVarC4);
                    g gVarC11 = gVarA9.c(gVarC2);
                    gVarC5 = gVarC10.c(gVarC11);
                    if (gVarC5.j()) {
                        return new j$c(dVarD, gVarC5, dVarD.h().g(), this.f);
                    }
                    g gVarC12 = gVarA9.c(gVarE2);
                    if (!zI3) {
                        gVarC12 = gVarC12.c(gVar12);
                    }
                    gVarA = gVarC11.a(gVarE2).a(gVarC12, gVar9.a(gVar10));
                    gVarC6 = !zI2 ? gVarC12.c(gVar10) : gVarC12;
                }
                return new j$c(dVarD, gVarC5, gVarA, new g[]{gVarC6}, this.f);
            default:
                throw new IllegalStateException("unsupported coordinate system");
        }
    }

    @Override // org.bouncycastle.d.a.j
    public final j d(j jVar) {
        if (p()) {
            return jVar;
        }
        if (jVar.p()) {
            return t();
        }
        d dVarD = d();
        g gVar = this.c;
        if (gVar.j()) {
            return jVar;
        }
        switch (dVarD.k()) {
            case 6:
                g gVar2 = jVar.c;
                g gVar3 = jVar.e[0];
                if (gVar2.j() || !gVar3.i()) {
                    return t().b(jVar);
                }
                g gVar4 = this.d;
                g gVar5 = this.e[0];
                g gVar6 = jVar.d;
                g gVarE = gVar.e();
                g gVarE2 = gVar4.e();
                g gVarE3 = gVar5.e();
                g gVarA = dVarD.g().c(gVarE3).a(gVarE2).a(gVar4.c(gVar5));
                g gVarC = gVar6.c();
                g gVarB = dVarD.g().a(gVarC).c(gVarE3).a(gVarE2).b(gVarA, gVarE, gVarE3);
                g gVarC2 = gVar2.c(gVarE3);
                g gVarE4 = gVarC2.a(gVarA).e();
                if (gVarE4.j()) {
                    return gVarB.j() ? jVar.t() : dVarD.e();
                }
                if (gVarB.j()) {
                    return new j$c(dVarD, gVarB, dVarD.h().g(), this.f);
                }
                g gVarC3 = gVarB.e().c(gVarC2);
                g gVarC4 = gVarB.c(gVarE4).c(gVarE3);
                return new j$c(dVarD, gVarC3, gVarB.a(gVarE4).e().b(gVarA, gVarC, gVarC4), new g[]{gVarC4}, this.f);
            default:
                return t().b(jVar);
        }
    }

    @Override // org.bouncycastle.d.a.j
    protected final j e() {
        return new j$c(null, g(), h(), false);
    }

    @Override // org.bouncycastle.d.a.j
    public final g j() {
        int iF = f();
        switch (iF) {
            case 5:
            case 6:
                g gVar = this.c;
                g gVar2 = this.d;
                if (p() || gVar.j()) {
                    return gVar2;
                }
                g gVarC = gVar2.a(gVar).c(gVar);
                if (6 != iF) {
                    return gVarC;
                }
                g gVar3 = this.e[0];
                return !gVar3.i() ? gVarC.d(gVar3) : gVarC;
            default:
                return this.d;
        }
    }

    @Override // org.bouncycastle.d.a.j
    protected final boolean r() {
        g gVarK = k();
        if (gVarK.j()) {
            return false;
        }
        g gVarL = l();
        switch (f()) {
            case 5:
            case 6:
                return gVarL.k() != gVarK.k();
            default:
                return gVarL.d(gVarK).k();
        }
    }

    @Override // org.bouncycastle.d.a.j
    public final j s() {
        if (p()) {
            return this;
        }
        g gVar = this.c;
        if (gVar.j()) {
            return this;
        }
        switch (f()) {
            case 0:
                return new j$c(this.b, gVar, this.d.a(gVar), this.f);
            case 1:
                return new j$c(this.b, gVar, this.d.a(gVar), new g[]{this.e[0]}, this.f);
            case 2:
            case 3:
            case 4:
            default:
                throw new IllegalStateException("unsupported coordinate system");
            case 5:
                return new j$c(this.b, gVar, this.d.c(), this.f);
            case 6:
                g gVar2 = this.d;
                g gVar3 = this.e[0];
                return new j$c(this.b, gVar, gVar2.a(gVar3), new g[]{gVar3}, this.f);
        }
    }

    @Override // org.bouncycastle.d.a.j
    public final j t() {
        g gVarA;
        if (p()) {
            return this;
        }
        d dVarD = d();
        g gVar = this.c;
        if (gVar.j()) {
            return dVarD.e();
        }
        switch (dVarD.k()) {
            case 0:
                g gVarA2 = this.d.d(gVar).a(gVar);
                g gVarA3 = gVarA2.e().a(gVarA2).a(dVarD.g());
                return new j$c(dVarD, gVarA3, gVar.a(gVarA3, gVarA2.c()), this.f);
            case 1:
                g gVarC = this.d;
                g gVar2 = this.e[0];
                boolean zI = gVar2.i();
                g gVarC2 = zI ? gVar : gVar.c(gVar2);
                if (!zI) {
                    gVarC = gVarC.c(gVar2);
                }
                g gVarE = gVar.e();
                g gVarA4 = gVarE.a(gVarC);
                g gVarE2 = gVarC2.e();
                g gVarA5 = gVarA4.a(gVarC2);
                g gVarB = gVarA5.b(gVarA4, gVarE2, dVarD.g());
                return new j$c(dVarD, gVarC2.c(gVarB), gVarE.e().b(gVarC2, gVarB, gVarA5), new g[]{gVarC2.c(gVarE2)}, this.f);
            case 6:
                g gVar3 = this.d;
                g gVar4 = this.e[0];
                boolean zI2 = gVar4.i();
                g gVarC3 = zI2 ? gVar3 : gVar3.c(gVar4);
                g gVarE3 = zI2 ? gVar4 : gVar4.e();
                g gVarG = dVarD.g();
                g gVarC4 = zI2 ? gVarG : gVarG.c(gVarE3);
                g gVarA6 = gVar3.e().a(gVarC3).a(gVarC4);
                if (gVarA6.j()) {
                    return new j$c(dVarD, gVarA6, dVarD.h().g(), this.f);
                }
                g gVarE4 = gVarA6.e();
                g gVarC5 = zI2 ? gVarA6 : gVarA6.c(gVarE3);
                g gVarH = dVarD.h();
                if (gVarH.h() < (dVarD.a() >> 1)) {
                    g gVarE5 = gVar3.a(gVar).e();
                    g gVarA7 = gVarE5.a(gVarA6).a(gVarE3).c(gVarE5).a(gVarH.i() ? gVarC4.a(gVarE3).e() : gVarC4.a(gVarH, gVarE3.e())).a(gVarE4);
                    if (gVarG.j()) {
                        gVarA = gVarA7.a(gVarC5);
                    } else {
                        if (!gVarG.i()) {
                            gVarA7 = gVarA7.a(gVarG.c().c(gVarC5));
                        }
                        gVarA = gVarA7;
                    }
                } else {
                    gVarA = (zI2 ? gVar : gVar.c(gVar4)).a(gVarA6, gVarC3).a(gVarE4).a(gVarC5);
                }
                return new j$c(dVarD, gVarE4, gVarA, new g[]{gVarC5}, this.f);
            default:
                throw new IllegalStateException("unsupported coordinate system");
        }
    }
}
