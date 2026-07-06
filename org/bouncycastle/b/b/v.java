package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class v extends j {
    public v() {
    }

    public v(v vVar) {
        super(vVar);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        org.bouncycastle.f.g.a(this.a, bArr, i);
        org.bouncycastle.f.g.a(this.b, bArr, i + 8);
        org.bouncycastle.f.g.a(this.c, bArr, i + 16);
        org.bouncycastle.f.g.a(this.d, bArr, i + 24);
        org.bouncycastle.f.g.a(this.e, bArr, i + 32);
        org.bouncycastle.f.g.a(this.f, bArr, i + 40);
        c();
        return 48;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "SHA-384";
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        super.a((j) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 48;
    }

    @Override // org.bouncycastle.b.b.j, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.a = -3766243637369397544L;
        this.b = 7105036623409894663L;
        this.c = -7973340178411365097L;
        this.d = 1526699215303891257L;
        this.e = 7436329637833083697L;
        this.f = -8163818279084223215L;
        this.g = -2662702644619276377L;
        this.h = 5167115440072839076L;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new v(this);
    }
}
