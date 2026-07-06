package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class al extends org.bouncycastle.b.x {
    private an a;

    public final an c() {
        return this.a;
    }

    public al(SecureRandom secureRandom, an anVar) {
        super(secureRandom, anVar.c() != 0 ? anVar.c() : anVar.a().bitLength());
        this.a = anVar;
    }
}
