package org.bouncycastle.b.f;

import java.security.SecureRandom;
import org.bouncycastle.b.k.ag;

/* JADX INFO: loaded from: classes.dex */
public final class m implements org.bouncycastle.b.c {
    private SecureRandom a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        ag agVar = new ag(this.a);
        return new org.bouncycastle.b.b(agVar.c(), agVar);
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = xVar.a();
    }
}
