package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j$a extends j {
    protected j$a(d dVar, g gVar, g gVar2) {
        super(dVar, gVar, gVar2);
    }

    protected j$a(d dVar, g gVar, g gVar2, g[] gVarArr) {
        super(dVar, gVar, gVar2, gVarArr);
    }

    @Override // org.bouncycastle.d.a.j
    protected final boolean a() {
        g gVarA;
        g gVar;
        d dVarD = d();
        g gVar2 = this.c;
        g gVarG = dVarD.g();
        g gVarH = dVarD.h();
        int iK = dVarD.k();
        if (iK != 6) {
            g gVar3 = this.d;
            g gVarC = gVar3.a(gVar2).c(gVar3);
            switch (iK) {
                case 0:
                    break;
                case 1:
                    g gVar4 = this.e[0];
                    if (!gVar4.i()) {
                        g gVarC2 = gVar4.c(gVar4.e());
                        gVarC = gVarC.c(gVar4);
                        gVarG = gVarG.c(gVar4);
                        gVarH = gVarH.c(gVarC2);
                    }
                    break;
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
            return gVarC.equals(gVar2.a(gVarG).c(gVar2.e()).a(gVarH));
        }
        g gVar5 = this.e[0];
        boolean zI = gVar5.i();
        if (gVar2.j()) {
            g gVarE = this.d.e();
            if (!zI) {
                gVarH = gVarH.c(gVar5.e());
            }
            return gVarE.equals(gVarH);
        }
        g gVar6 = this.d;
        g gVarE2 = gVar2.e();
        if (zI) {
            g gVarA2 = gVar6.e().a(gVar6).a(gVarG);
            gVarA = gVarE2.e().a(gVarH);
            gVar = gVarA2;
        } else {
            g gVarE3 = gVar5.e();
            g gVarE4 = gVarE3.e();
            g gVarB = gVar6.a(gVar5).b(gVar6, gVarG, gVarE3);
            gVarA = gVarE2.a(gVarH, gVarE4);
            gVar = gVarB;
        }
        return gVar.c(gVarE2).equals(gVarA);
    }

    @Override // org.bouncycastle.d.a.j
    public final j b(g gVar) {
        if (p()) {
            return this;
        }
        switch (f()) {
            case 5:
                g gVarK = k();
                return d().a(gVarK, l().a(gVarK).d(gVar).a(gVarK.c(gVar)), m(), this.f);
            case 6:
                g gVarK2 = k();
                g gVarL = l();
                g gVar2 = m()[0];
                g gVarC = gVarK2.c(gVar.e());
                return d().a(gVarC, gVarL.a(gVarK2).a(gVarC), new g[]{gVar2.c(gVar)}, this.f);
            default:
                return super.b(gVar);
        }
    }

    @Override // org.bouncycastle.d.a.j
    protected final boolean b() {
        BigInteger bigIntegerJ = this.b.j();
        if (c.e.equals(bigIntegerJ)) {
            return ((g$a) o().g().a(this.b.g())).m() == 0;
        }
        if (!c.g.equals(bigIntegerJ)) {
            return super.b();
        }
        j jVarO = o();
        g gVarG = jVarO.g();
        g gVarA = ((d$a) this.b).a(gVarG.a(this.b.g()));
        if (gVarA == null) {
            return false;
        }
        g gVarA2 = gVarG.c(gVarA).a(jVarO.h()).a(this.b.g());
        return ((g$a) gVarA2).m() == 0 || ((g$a) gVarA2.a(gVarG)).m() == 0;
    }

    public final j$a c(int i) {
        if (p()) {
            return this;
        }
        d dVarD = d();
        int iK = dVarD.k();
        g gVar = this.c;
        switch (iK) {
            case 0:
            case 5:
                return (j$a) dVarD.a(gVar.a(i), this.d.a(i), this.f);
            case 1:
            case 6:
                return (j$a) dVarD.a(gVar.a(i), this.d.a(i), new g[]{this.e[0].a(i)}, this.f);
            case 2:
            case 3:
            case 4:
            default:
                throw new IllegalStateException("unsupported coordinate system");
        }
    }

    @Override // org.bouncycastle.d.a.j
    public final j c(g gVar) {
        if (p()) {
            return this;
        }
        switch (f()) {
            case 5:
            case 6:
                g gVarK = k();
                return d().a(gVarK, l().a(gVarK).c(gVar).a(gVarK), m(), this.f);
            default:
                return super.c(gVar);
        }
    }

    @Override // org.bouncycastle.d.a.j
    public final j c(j jVar) {
        return jVar.p() ? this : b(jVar.s());
    }
}
