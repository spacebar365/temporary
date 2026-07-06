package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class o extends org.bouncycastle.b.x {
    private r a;

    public o(SecureRandom secureRandom, r rVar) {
        super(secureRandom, rVar.a().bitLength() - 1);
        this.a = rVar;
    }

    public final r c() {
        return this.a;
    }
}
