package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class aq extends org.bouncycastle.b.x {
    private as a;

    public aq(SecureRandom secureRandom, as asVar) {
        super(secureRandom, asVar.a().bitLength() - 1);
        this.a = asVar;
    }

    public final as c() {
        return this.a;
    }
}
