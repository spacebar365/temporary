package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    private static final byte[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public g() {
        super(a);
    }

    public g(g gVar) {
        super(a);
        a(gVar);
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "GOST3411-2012-512";
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 64;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new g(this);
    }
}
