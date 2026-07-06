package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class x extends j {
    public x() {
    }

    public x(x xVar) {
        super(xVar);
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
        org.bouncycastle.f.g.a(this.g, bArr, i + 48);
        org.bouncycastle.f.g.a(this.h, bArr, i + 56);
        c();
        return 64;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        a((j) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 64;
    }

    @Override // org.bouncycastle.b.b.j, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.a = 7640891576956012808L;
        this.b = -4942790177534073029L;
        this.c = 4354685564936845355L;
        this.d = -6534734903238641935L;
        this.e = 5840696475078001361L;
        this.f = -7276294671716946913L;
        this.g = 2270897969802886507L;
        this.h = 6620516959819538809L;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new x(this);
    }
}
