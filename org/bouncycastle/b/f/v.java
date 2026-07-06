package org.bouncycastle.b.f;

import org.bouncycastle.b.ad;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class v extends ad {
    private org.bouncycastle.b.r d;
    private int e;
    private int f;

    public v(org.bouncycastle.b.r rVar) {
        this.d = rVar;
        this.e = rVar.b();
        this.f = ((org.bouncycastle.b.u) rVar).d();
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i) {
        int i2 = i / 8;
        return new ba(b(1, i2), 0, i2);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrB = b(1, i3);
        return new be(new ba(bArrB, 0, i3), b(2, i4), 0, i4);
    }

    @Override // org.bouncycastle.b.ad
    public final org.bouncycastle.b.i b(int i) {
        int i2 = i / 8;
        return new ba(b(3, i2), 0, i2);
    }

    private byte[] b(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = new byte[this.f];
        byte[] bArr4 = new byte[i2];
        for (int i3 = 0; i3 != bArr3.length; i3++) {
            bArr3[i3] = (byte) i;
        }
        if (this.b == null || this.b.length == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr5 = new byte[this.f * (((this.b.length + this.f) - 1) / this.f)];
            for (int i4 = 0; i4 != bArr5.length; i4++) {
                byte[] bArr6 = this.b;
                bArr5[i4] = bArr6[i4 % bArr6.length];
            }
            bArr = bArr5;
        }
        if (this.a == null || this.a.length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr7 = new byte[this.f * (((this.a.length + this.f) - 1) / this.f)];
            for (int i5 = 0; i5 != bArr7.length; i5++) {
                byte[] bArr8 = this.a;
                bArr7[i5] = bArr8[i5 % bArr8.length];
            }
            bArr2 = bArr7;
        }
        byte[] bArr9 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        byte[] bArr10 = new byte[this.f];
        int i6 = ((this.e + i2) - 1) / this.e;
        byte[] bArr11 = new byte[this.e];
        for (int i7 = 1; i7 <= i6; i7++) {
            this.d.a(bArr3, 0, bArr3.length);
            this.d.a(bArr9, 0, bArr9.length);
            this.d.a(bArr11, 0);
            for (int i8 = 1; i8 < this.c; i8++) {
                this.d.a(bArr11, 0, bArr11.length);
                this.d.a(bArr11, 0);
            }
            for (int i9 = 0; i9 != bArr10.length; i9++) {
                bArr10[i9] = bArr11[i9 % bArr11.length];
            }
            for (int i10 = 0; i10 != bArr9.length / this.f; i10++) {
                int i11 = i10 * this.f;
                int i12 = (bArr10[bArr10.length - 1] & 255) + (bArr9[(bArr10.length + i11) - 1] & 255) + 1;
                bArr9[(bArr10.length + i11) - 1] = (byte) i12;
                int i13 = i12 >>> 8;
                for (int length = bArr10.length - 2; length >= 0; length--) {
                    int i14 = i13 + (bArr10[length] & 255) + (bArr9[i11 + length] & 255);
                    bArr9[i11 + length] = (byte) i14;
                    i13 = i14 >>> 8;
                }
            }
            if (i7 == i6) {
                System.arraycopy(bArr11, 0, bArr4, (i7 - 1) * this.e, bArr4.length - ((i7 - 1) * this.e));
            } else {
                System.arraycopy(bArr11, 0, bArr4, (i7 - 1) * this.e, bArr11.length);
            }
        }
        return bArr4;
    }
}
