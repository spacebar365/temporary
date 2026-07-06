package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class j extends o {
    private final int a;
    private final int b;
    private final int c;

    private j(j$a j_a) {
        super(j_a);
        this.a = j$a.a(j_a);
        this.b = j$a.b(j_a);
        this.c = j$a.c(j_a);
    }

    /* synthetic */ j(j$a j_a, byte b) {
        this(j_a);
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
