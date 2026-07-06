package org.bouncycastle.b.f;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f implements org.bouncycastle.b.c {
    private org.bouncycastle.b.k.e a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        e eVar = e.a;
        org.bouncycastle.b.k.i iVarC = this.a.c();
        BigInteger bigIntegerA = e.a(iVarC, this.a.a());
        return new org.bouncycastle.b.b(new org.bouncycastle.b.k.k(e.a(iVarC, bigIntegerA), iVarC), new org.bouncycastle.b.k.j(bigIntegerA, iVarC));
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = (org.bouncycastle.b.k.e) xVar;
    }
}
