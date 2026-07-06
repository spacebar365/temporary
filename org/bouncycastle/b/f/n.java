package org.bouncycastle.b.f;

import java.security.SecureRandom;
import org.bouncycastle.b.k.aj;

/* JADX INFO: loaded from: classes.dex */
public final class n implements org.bouncycastle.b.c {
    private SecureRandom a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        aj ajVar = new aj(this.a);
        return new org.bouncycastle.b.b(ajVar.c(), ajVar);
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = xVar.a();
    }
}
