package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends org.bouncycastle.b.x {
    private y a;

    public aa(y yVar, SecureRandom secureRandom) {
        super(secureRandom, yVar.c().bitLength());
        this.a = yVar;
    }

    public final y c() {
        return this.a;
    }
}
