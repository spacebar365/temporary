package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class i extends o {
    private final int a;
    private final int b;
    private final int c;

    private i(i$a i_a) {
        super(i_a);
        this.a = i$a.a(i_a);
        this.b = i$a.b(i_a);
        this.c = i$a.c(i_a);
    }

    /* synthetic */ i(i$a i_a, byte b) {
        this(i_a);
    }

    @Override // org.bouncycastle.e.b.g.o
    protected final byte[] a() {
        byte[] bArrA = super.a();
        org.bouncycastle.f.g.a(this.a, bArrA, 16);
        org.bouncycastle.f.g.a(this.b, bArrA, 20);
        org.bouncycastle.f.g.a(this.c, bArrA, 24);
        return bArrA;
    }

    protected final int b() {
        return this.a;
    }

    protected final int c() {
        return this.b;
    }

    protected final int d() {
        return this.c;
    }
}
