package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class m {
    private final w a;
    private final org.bouncycastle.b.r b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    protected final org.bouncycastle.b.r a() {
        return this.b;
    }

    protected final int b() {
        return this.c;
    }

    protected final int c() {
        return this.d;
    }

    protected final int d() {
        return this.e;
    }

    protected m(org.bouncycastle.b.r rVar) {
        if (rVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = rVar;
        if (rVar == null) {
            throw new NullPointerException("digest == null");
        }
        String strA = rVar.a();
        this.c = strA.equals("SHAKE128") ? 32 : strA.equals("SHAKE256") ? 64 : rVar.b();
        this.d = 16;
        this.f = (int) Math.ceil(((double) (this.c * 8)) / ((double) aa.a(this.d)));
        this.g = (aa.a(this.f * (this.d - 1)) / aa.a(this.d)) + 1;
        this.e = this.f + this.g;
        this.a = l.a(rVar.a(), this.c, this.d, this.e);
        if (this.a == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + rVar.a());
        }
    }
}
