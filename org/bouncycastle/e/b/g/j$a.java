package org.bouncycastle.e.b.g;

/* JADX INFO: Access modifiers changed from: protected */
/* JADX INFO: loaded from: classes.dex */
public class j$a extends o$a<j$a> {
    private int a;
    private int b;
    private int c;

    protected j$a() {
        super(0);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    static /* synthetic */ int a(j$a j_a) {
        return j_a.a;
    }

    static /* synthetic */ int b(j$a j_a) {
        return j_a.b;
    }

    static /* synthetic */ int c(j$a j_a) {
        return j_a.c;
    }

    protected final j$a a(int i) {
        this.a = i;
        return this;
    }

    @Override // org.bouncycastle.e.b.g.o$a
    protected final o a() {
        return new j(this, (byte) 0);
    }

    protected final j$a b(int i) {
        this.b = i;
        return this;
    }

    @Override // org.bouncycastle.e.b.g.o$a
    protected final /* bridge */ /* synthetic */ o$a b() {
        return this;
    }

    protected final j$a c(int i) {
        this.c = i;
        return this;
    }
}
