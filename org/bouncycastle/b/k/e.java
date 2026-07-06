package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class e extends org.bouncycastle.b.x {
    private i a;

    public final i c() {
        return this.a;
    }

    public e(SecureRandom secureRandom, i iVar) {
        super(secureRandom, iVar.f() != 0 ? iVar.f() : iVar.a().bitLength());
        this.a = iVar;
    }
}
