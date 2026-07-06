package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    private final w a;
    private final k b;
    private final int c;
    private final int d;

    public x(int i, org.bouncycastle.b.r rVar) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (rVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = new k(new m(rVar));
        this.c = i;
        this.d = g();
        this.a = e.a(a().a(), b(), c(), this.b.a().d(), i);
    }

    private int g() {
        for (int i = 2; i <= this.c; i++) {
            if ((this.c - i) % 2 == 0) {
                return i;
            }
        }
        throw new IllegalStateException("should never happen...");
    }

    protected final org.bouncycastle.b.r a() {
        return this.b.a().a();
    }

    public final int b() {
        return this.b.a().b();
    }

    public final int c() {
        return this.b.a().c();
    }

    public final int d() {
        return this.c;
    }

    final k e() {
        return this.b;
    }

    final int f() {
        return this.d;
    }
}
