package org.bouncycastle.b.f;

import org.bouncycastle.b.ad;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class w extends ad {
    private org.bouncycastle.b.r d;

    public w(org.bouncycastle.b.r rVar) {
        this.d = rVar;
    }

    private byte[] a() {
        byte[] bArr = new byte[this.d.b()];
        this.d.a(this.a, 0, this.a.length);
        this.d.a(this.b, 0, this.b.length);
        this.d.a(bArr, 0);
        for (int i = 1; i < this.c; i++) {
            this.d.a(bArr, 0, bArr.length);
            this.d.a(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i) {
        int i2 = i / 8;
        if (i2 > this.d.b()) {
            throw new IllegalArgumentException("Can't generate a derived key " + i2 + " bytes long.");
        }
        return new ba(a(), 0, i2);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        if (i3 + i4 > this.d.b()) {
            throw new IllegalArgumentException("Can't generate a derived key " + (i3 + i4) + " bytes long.");
        }
        byte[] bArrA = a();
        return new be(new ba(bArrA, 0, i3), bArrA, i3, i4);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i b(int i) {
        return a(i);
    }
}
