package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class g extends o {
    private final int a;
    private final int b;
    private final int c;

    private g(g$a g_a) {
        super(g_a);
        this.a = 0;
        this.b = g$a.a(g_a);
        this.c = g$a.b(g_a);
    }

    /* synthetic */ g(g$a g_a, byte b) {
        this(g_a);
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
        return this.b;
    }

    protected final int c() {
        return this.c;
    }
}
