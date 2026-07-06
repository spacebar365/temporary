package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class bv extends b {
    private final byte[] b;

    public bv(byte[] bArr, int i) {
        super(false);
        this.b = new byte[56];
        System.arraycopy(bArr, i, this.b, 0, 56);
    }

    public final void a(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 56);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }
}
