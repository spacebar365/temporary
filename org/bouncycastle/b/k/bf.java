package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class bf implements org.bouncycastle.b.i {
    private SecureRandom a;
    private org.bouncycastle.b.i b;

    public bf(org.bouncycastle.b.i iVar, SecureRandom secureRandom) {
        this.a = secureRandom;
        this.b = iVar;
    }

    public final SecureRandom a() {
        return this.a;
    }

    public final org.bouncycastle.b.i b() {
        return this.b;
    }
}
