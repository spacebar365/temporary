package org.bouncycastle.a.aa;

import org.bouncycastle.a.be;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends org.bouncycastle.a.o {
    private static ai b = new ai();
    protected org.bouncycastle.d.a.g a;

    public ag(org.bouncycastle.d.a.g gVar) {
        this.a = gVar;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return new be(ai.a(this.a.a(), (this.a.b() + 7) / 8));
    }
}
