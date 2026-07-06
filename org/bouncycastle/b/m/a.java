package org.bouncycastle.b.m;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    private final SecureRandom a;
    private final boolean b;

    public a(SecureRandom secureRandom, boolean z) {
        this.a = secureRandom;
        this.b = z;
    }

    static /* synthetic */ SecureRandom a(a aVar) {
        return aVar.a;
    }

    @Override // org.bouncycastle.b.m.e
    public final d a(int i) {
        return new b(this, i);
    }
}
