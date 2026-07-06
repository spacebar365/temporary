package org.bouncycastle.e.b.g;

/* JADX INFO: Access modifiers changed from: protected */
/* JADX INFO: loaded from: classes.dex */
public class i$a extends o$a<i$a> {
    private int a;
    private int b;
    private int c;

    protected i$a() {
        super(1);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    static /* synthetic */ int a(i$a i_a) {
        return i_a.a;
    }

    static /* synthetic */ int b(i$a i_a) {
        return i_a.b;
    }

    static /* synthetic */ int c(i$a i_a) {
        return i_a.c;
    }

    protected final i$a a(int i) {
        this.a = i;
        return this;
    }

    @Override // org.bouncycastle.e.b.g.o$a
    protected final o a() {
        return new i(this, (byte) 0);
    }

    protected final i$a b(int i) {
        this.b = i;
        return this;
    }

    @Override // org.bouncycastle.e.b.g.o$a
    protected final /* bridge */ /* synthetic */ o$a b() {
        return this;
    }

    protected final i$a c(int i) {
        this.c = i;
        return this;
    }
}
