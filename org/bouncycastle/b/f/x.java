package org.bouncycastle.b.f;

import org.bouncycastle.b.ad;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class x extends ad {
    private org.bouncycastle.b.z d;
    private byte[] e;

    public x(org.bouncycastle.b.r rVar) {
        this.d = new org.bouncycastle.b.h.g(rVar);
        this.e = new byte[this.d.b()];
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i) {
        int i2 = i / 8;
        return new ba(org.bouncycastle.f.a.c(c(i2), 0, i2), 0, i2);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrC = c(i3 + i4);
        return new be(new ba(bArrC, 0, i3), bArrC, i3, i4);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i b(int i) {
        return a(i);
    }

    public x() {
        this(new org.bouncycastle.b.b.s());
    }

    private byte[] c(int i) {
        int iB = this.d.b();
        int i2 = ((i + iB) - 1) / iB;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i2 * iB];
        this.d.a(new ba(this.a));
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = 3;
            while (true) {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != 0) {
                    break;
                }
                i5--;
            }
            byte[] bArr3 = this.b;
            int i6 = this.c;
            if (i6 == 0) {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
            if (bArr3 != null) {
                this.d.a(bArr3, 0, bArr3.length);
            }
            this.d.a(bArr, 0, 4);
            this.d.a(this.e, 0);
            System.arraycopy(this.e, 0, bArr2, i4, this.e.length);
            for (int i7 = 1; i7 < i6; i7++) {
                this.d.a(this.e, 0, this.e.length);
                this.d.a(this.e, 0);
                for (int i8 = 0; i8 != this.e.length; i8++) {
                    int i9 = i4 + i8;
                    bArr2[i9] = (byte) (bArr2[i9] ^ this.e[i8]);
                }
            }
            i3++;
            i4 += iB;
        }
        return bArr2;
    }
}
