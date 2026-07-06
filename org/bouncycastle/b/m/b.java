package org.bouncycastle.b.m;

/* JADX INFO: loaded from: classes.dex */
final class b implements d {
    final /* synthetic */ int a;
    final /* synthetic */ a b;

    b(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // org.bouncycastle.b.m.d
    public final byte[] a() {
        if (!(a.a(this.b) instanceof g) && !(a.a(this.b) instanceof j)) {
            return a.a(this.b).generateSeed((this.a + 7) / 8);
        }
        byte[] bArr = new byte[(this.a + 7) / 8];
        a.a(this.b).nextBytes(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.b.m.d
    public final int b() {
        return this.a;
    }
}
