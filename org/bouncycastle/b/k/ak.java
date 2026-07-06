package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class ak extends b {
    private final byte[] b;

    public ak(byte[] bArr, int i) {
        super(false);
        this.b = new byte[57];
        System.arraycopy(bArr, i, this.b, 0, 57);
    }

    public final void a(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 57);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }
}
