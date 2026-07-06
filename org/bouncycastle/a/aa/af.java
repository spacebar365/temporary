package org.bouncycastle.a.aa;

import org.bouncycastle.a.be;

/* JADX INFO: loaded from: classes.dex */
public final class af extends org.bouncycastle.a.o {
    private final org.bouncycastle.a.q a;
    private org.bouncycastle.d.a.d b;
    private org.bouncycastle.d.a.j c;

    public af(org.bouncycastle.d.a.d dVar, org.bouncycastle.a.q qVar) {
        this(dVar, qVar.c());
    }

    public af(org.bouncycastle.d.a.d dVar, byte[] bArr) {
        this.b = dVar;
        this.a = new be(org.bouncycastle.f.a.b(bArr));
    }

    public af(org.bouncycastle.d.a.j jVar) {
        this(jVar, false);
    }

    public af(org.bouncycastle.d.a.j jVar, boolean z) {
        this.c = jVar.o();
        this.a = new be(jVar.a(z));
    }

    public final synchronized org.bouncycastle.d.a.j a() {
        if (this.c == null) {
            this.c = this.b.a(this.a.c()).o();
        }
        return this.c;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }
}
