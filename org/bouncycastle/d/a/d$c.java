package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
public class d$c {
    protected int a;
    protected org.bouncycastle.d.a.b.a b;
    protected i c;
    final /* synthetic */ d d;

    d$c(d dVar, int i, org.bouncycastle.d.a.b.a aVar, i iVar) {
        this.d = dVar;
        this.a = i;
        this.b = aVar;
        this.c = iVar;
    }

    public final d$c a(org.bouncycastle.d.a.b.a aVar) {
        this.b = aVar;
        return this;
    }

    public final d a() {
        if (!this.d.a(this.a)) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        d dVarC = this.d.c();
        if (dVarC == this.d) {
            throw new IllegalStateException("implementation returned current curve");
        }
        synchronized (dVarC) {
            dVarC.f = this.a;
            dVarC.g = this.b;
            dVarC.h = this.c;
        }
        return dVarC;
    }
}
