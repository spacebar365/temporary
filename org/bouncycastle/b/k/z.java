package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class z extends ac {
    private final org.bouncycastle.a.p a;
    private final org.bouncycastle.a.p b;
    private final org.bouncycastle.a.p i;

    public z(y yVar, org.bouncycastle.a.p pVar, org.bouncycastle.a.p pVar2, org.bouncycastle.a.p pVar3) {
        super(pVar, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.f());
        if (!pVar.equals(((ac) yVar).j())) {
            throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.a = pVar;
        this.b = pVar2;
        this.i = pVar3;
    }

    public final org.bouncycastle.a.p g() {
        return this.a;
    }

    public final org.bouncycastle.a.p h() {
        return this.b;
    }

    public final org.bouncycastle.a.p i() {
        return this.i;
    }
}
