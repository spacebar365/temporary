package org.bouncycastle.e.b.g;

import org.bouncycastle.b.aq;

/* JADX INFO: loaded from: classes.dex */
final class h {
    private final org.bouncycastle.b.r a;
    private final int b;

    protected h(org.bouncycastle.b.r rVar, int i) {
        if (rVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.a = rVar;
        this.b = i;
    }

    private byte[] a(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrA = aa.a(i, this.b);
        this.a.a(bArrA, 0, bArrA.length);
        this.a.a(bArr, 0, bArr.length);
        this.a.a(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.b];
        if (this.a instanceof aq) {
            ((aq) this.a).b(bArr3, 0, this.b);
        } else {
            this.a.a(bArr3, 0);
        }
        return bArr3;
    }

    protected final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != this.b) {
            throw new IllegalArgumentException("wrong in length");
        }
        return a(0, bArr, bArr2);
    }

    protected final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != this.b * 2) {
            throw new IllegalArgumentException("wrong in length");
        }
        return a(1, bArr, bArr2);
    }

    protected final byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("wrong address length");
        }
        return a(3, bArr, bArr2);
    }
}
