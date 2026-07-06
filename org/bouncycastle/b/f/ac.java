package org.bouncycastle.b.f;

import java.security.SecureRandom;
import org.bouncycastle.b.k.bu;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements org.bouncycastle.b.c {
    private SecureRandom a;

    @Override // org.bouncycastle.b.c
    public final org.bouncycastle.b.b a() {
        bu buVar = new bu(this.a);
        return new org.bouncycastle.b.b(buVar.c(), buVar);
    }

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = xVar.a();
    }
}
