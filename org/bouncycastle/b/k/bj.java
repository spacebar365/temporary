package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class bj implements org.bouncycastle.b.i {
    private byte[] a;
    private int b;

    public bj(byte[] bArr, int i) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        this.a = new byte[bArr.length];
        this.b = i;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
    }

    public final byte[] a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
