package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    private final int a;
    private final long b;
    private final int c;
    private final int d;

    protected o(o$a o_a) {
        this.a = o$a.a(o_a);
        this.b = o$a.b(o_a);
        this.c = o$a.c(o_a);
        this.d = o$a.d(o_a);
    }

    protected byte[] a() {
        byte[] bArr = new byte[32];
        org.bouncycastle.f.g.a(this.a, bArr, 0);
        org.bouncycastle.f.g.a(this.b, bArr, 4);
        org.bouncycastle.f.g.a(this.c, bArr, 12);
        org.bouncycastle.f.g.a(this.d, bArr, 28);
        return bArr;
    }

    protected final int e() {
        return this.a;
    }

    protected final long f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }
}
