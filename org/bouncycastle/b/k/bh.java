package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class bh implements org.bouncycastle.b.i {
    private byte[] a;
    private org.bouncycastle.b.i b;

    public bh(org.bouncycastle.b.i iVar, byte[] bArr) {
        this(iVar, bArr, bArr.length);
    }

    private bh(org.bouncycastle.b.i iVar, byte[] bArr, int i) {
        this.a = new byte[i];
        this.b = iVar;
        System.arraycopy(bArr, 0, this.a, 0, i);
    }

    public final byte[] a() {
        return this.a;
    }

    public final org.bouncycastle.b.i b() {
        return this.b;
    }
}
