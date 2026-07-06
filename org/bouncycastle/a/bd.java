package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class bd extends u implements aa {
    private final byte[] a;

    bd(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(18, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof bd) {
            return org.bouncycastle.f.a.a(this.a, ((bd) uVar).a);
        }
        return false;
    }

    @Override // org.bouncycastle.a.aa
    public final String b() {
        return org.bouncycastle.f.k.b(this.a);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length) + 1 + this.a.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return org.bouncycastle.f.a.a(this.a);
    }

    public final String toString() {
        return b();
    }
}
