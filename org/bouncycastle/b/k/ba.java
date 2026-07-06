package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public class ba implements org.bouncycastle.b.i {
    private byte[] a;

    public ba(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ba(byte[] bArr, int i, int i2) {
        this.a = new byte[i2];
        System.arraycopy(bArr, i, this.a, 0, i2);
    }

    public final byte[] a() {
        return this.a;
    }
}
