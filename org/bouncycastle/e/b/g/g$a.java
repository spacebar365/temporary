package org.bouncycastle.e.b.g;

/* JADX INFO: Access modifiers changed from: protected */
/* JADX INFO: loaded from: classes.dex */
public class g$a extends o$a<g$a> {
    private int a;
    private int b;

    protected g$a() {
        super(2);
        this.a = 0;
        this.b = 0;
    }

    static /* synthetic */ int a(g$a g_a) {
        return g_a.a;
    }

    static /* synthetic */ int b(g$a g_a) {
        return g_a.b;
    }

    protected final g$a a(int i) {
        this.a = i;
        return this;
    }

    @Override // org.bouncycastle.e.b.g.o$a
    protected final o a() {
        return new g(this, (byte) 0);
    }

    protected final g$a b(int i) {
        this.b = i;
        return this;
    }

    @Override // org.bouncycastle.e.b.g.o$a
    protected final /* bridge */ /* synthetic */ o$a b() {
        return this;
    }
}
