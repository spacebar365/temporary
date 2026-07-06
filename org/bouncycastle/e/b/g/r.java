package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private final w a;
    private final x b;
    private final int c;
    private final int d;

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    protected final x c() {
        return this.b;
    }

    protected final org.bouncycastle.b.r d() {
        return this.b.a();
    }

    public final int e() {
        return this.b.b();
    }

    public r(int i, int i2, org.bouncycastle.b.r rVar) {
        this.c = i;
        this.d = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        if (i / i2 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        this.b = new x(i / i2, rVar);
        this.a = d.a(this.b.a().a(), this.b.b(), this.b.c(), this.b.e().a().d(), this.c, i2);
    }
}
