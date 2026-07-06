package org.bouncycastle.b.f;

import java.math.BigInteger;
import org.bouncycastle.b.k.al;
import org.bouncycastle.b.k.an;
import org.bouncycastle.b.k.ao;
import org.bouncycastle.b.k.ap;

/* JADX INFO: loaded from: classes.dex */
public final class o implements org.bouncycastle.b.c {
    private al a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        e eVar = e.a;
        an anVarC = this.a.c();
        org.bouncycastle.b.k.i iVar = new org.bouncycastle.b.k.i(anVarC.a(), anVarC.b(), anVarC.c());
        BigInteger bigIntegerA = e.a(iVar, this.a.a());
        return new org.bouncycastle.b.b(new ap(e.a(iVar, bigIntegerA), anVarC), new ao(bigIntegerA, anVarC));
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = (al) xVar;
    }
}
