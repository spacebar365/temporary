package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class be extends q {
    public be(f fVar) {
        super(fVar.i().a("DER"));
    }

    public be(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.a.q, org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(4, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length) + 1 + this.a.length;
    }
}
