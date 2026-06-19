package org.bouncycastle.p118e.p120b.p128g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.n */
/* JADX INFO: loaded from: classes.dex */
final class C1477n {

    /* JADX INFO: renamed from: a */
    private final byte[][] f5349a;

    protected C1477n(C1476m c1476m, byte[][] bArr) {
        if (c1476m == null) {
            throw new NullPointerException("params == null");
        }
        if (C1464aa.m3845b(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != c1476m.m3908d()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != c1476m.m3906b()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f5349a = C1464aa.m3843a(bArr);
    }

    /* JADX INFO: renamed from: a */
    protected final byte[][] m3909a() {
        return C1464aa.m3843a(this.f5349a);
    }
}
