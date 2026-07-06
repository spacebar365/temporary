package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class be implements org.bouncycastle.b.i {
    private byte[] a;
    private org.bouncycastle.b.i b;

    public be(org.bouncycastle.b.i iVar, byte[] bArr) {
        this(iVar, bArr, 0, bArr.length);
    }

    public be(org.bouncycastle.b.i iVar, byte[] bArr, int i, int i2) {
        this.a = new byte[i2];
        this.b = iVar;
        System.arraycopy(bArr, i, this.a, 0, i2);
    }

    public final byte[] a() {
        return this.a;
    }

    public final org.bouncycastle.b.i b() {
        return this.b;
    }
}
