package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    private static final byte[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public f() {
        super(a);
    }

    public f(f fVar) {
        super(a);
        a(fVar);
    }

    @Override // org.bouncycastle.b.b.e, org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.a(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "GOST3411-2012-256";
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 32;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new f(this);
    }
}
