package org.bouncycastle.b.f;

import java.security.SecureRandom;
import org.bouncycastle.b.k.br;

/* JADX INFO: loaded from: classes.dex */
public final class ab implements org.bouncycastle.b.c {
    private SecureRandom a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        br brVar = new br(this.a);
        return new org.bouncycastle.b.b(brVar.c(), brVar);
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = xVar.a();
    }
}
