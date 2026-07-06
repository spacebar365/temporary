package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j$b extends j {
    protected j$b(d dVar, g gVar, g gVar2) {
        super(dVar, gVar, gVar2);
    }

    protected j$b(d dVar, g gVar, g gVar2, g[] gVarArr) {
        super(dVar, gVar, gVar2, gVarArr);
    }

    @Override // org.bouncycastle.d.a.j
    protected final boolean a() {
        g gVar = this.c;
        g gVar2 = this.d;
        g gVarG = this.b.g();
        g gVarH = this.b.h();
        g gVarE = gVar2.e();
        switch (f()) {
            case 0:
                break;
            case 1:
                g gVar3 = this.e[0];
                if (!gVar3.i()) {
                    g gVarE2 = gVar3.e();
                    g gVarC = gVar3.c(gVarE2);
                    gVarE = gVarE.c(gVar3);
                    gVarG = gVarG.c(gVarE2);
                    gVarH = gVarH.c(gVarC);
                }
                break;
            case 2:
            case 3:
            case 4:
                g gVar4 = this.e[0];
                if (!gVar4.i()) {
                    g gVarE3 = gVar4.e();
                    g gVarE4 = gVarE3.e();
                    g gVarC2 = gVarE3.c(gVarE4);
                    gVarG = gVarG.c(gVarE4);
                    gVarH = gVarH.c(gVarC2);
                }
                break;
            default:
                throw new IllegalStateException("unsupported coordinate system");
        }
        return gVarE.equals(gVar.e().a(gVarG).c(gVar).a(gVarH));
    }

    @Override // org.bouncycastle.d.a.j
    public final j c(j jVar) {
        return jVar.p() ? this : b(jVar.s());
    }

    @Override // org.bouncycastle.d.a.j
    protected final boolean r() {
        return h().k();
    }
}
