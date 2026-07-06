package org.bouncycastle.b.f;

import org.bouncycastle.b.ad;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class u extends ad {
    private org.bouncycastle.b.r d = new org.bouncycastle.b.b.m();

    private byte[] c(int i) {
        byte[] bArr = new byte[this.d.b()];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            this.d.a(this.a, 0, this.a.length);
            this.d.a(this.b, 0, this.b.length);
            this.d.a(bArr, 0);
            int length = i > bArr.length ? bArr.length : i;
            System.arraycopy(bArr, 0, bArr2, i2, length);
            i2 += length;
            i -= length;
            if (i == 0) {
                return bArr2;
            }
            this.d.c();
            this.d.a(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i) {
        int i2 = i / 8;
        return new ba(c(i2), 0, i2);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrC = c(i3 + i4);
        return new be(new ba(bArrC, 0, i3), bArrC, i3, i4);
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        super.a(bArr, bArr2, 1);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i b(int i) {
        return a(i);
    }
}
