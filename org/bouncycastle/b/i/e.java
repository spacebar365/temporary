package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.an;

/* JADX INFO: loaded from: classes.dex */
public final class e extends org.bouncycastle.b.f {
    private int g;

    public e(org.bouncycastle.b.e eVar) {
        if (eVar instanceof an) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.d = eVar;
        this.g = eVar.b();
        this.a = new byte[this.g * 2];
        this.b = 0;
    }

    @Override // org.bouncycastle.b.f
    public final int a(int i) {
        int i2 = this.b + i;
        int length = i2 % this.a.length;
        return length == 0 ? i2 - this.a.length : i2 - length;
    }

    @Override // org.bouncycastle.b.f
    public final int a(byte[] bArr, int i) {
        if (this.b + i > bArr.length) {
            throw new ac("output buffer to small in doFinal");
        }
        int iB = this.d.b();
        int i2 = this.b - iB;
        byte[] bArr2 = new byte[iB];
        if (this.c) {
            if (this.b < iB) {
                throw new org.bouncycastle.b.o("need at least one block of input for CTS");
            }
            this.d.a(this.a, 0, bArr2, 0);
            if (this.b > iB) {
                for (int i3 = this.b; i3 != this.a.length; i3++) {
                    this.a[i3] = bArr2[i3 - iB];
                }
                for (int i4 = iB; i4 != this.b; i4++) {
                    byte[] bArr3 = this.a;
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr2[i4 - iB]);
                }
                if (this.d instanceof b) {
                    ((b) this.d).d().a(this.a, iB, bArr, i);
                } else {
                    this.d.a(this.a, iB, bArr, i);
                }
                System.arraycopy(bArr2, 0, bArr, i + iB, i2);
            } else {
                System.arraycopy(bArr2, 0, bArr, i, iB);
            }
        } else {
            if (this.b < iB) {
                throw new org.bouncycastle.b.o("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[iB];
            if (this.b > iB) {
                if (this.d instanceof b) {
                    ((b) this.d).d().a(this.a, 0, bArr2, 0);
                } else {
                    this.d.a(this.a, 0, bArr2, 0);
                }
                for (int i5 = iB; i5 != this.b; i5++) {
                    bArr4[i5 - iB] = (byte) (bArr2[i5 - iB] ^ this.a[i5]);
                }
                System.arraycopy(this.a, iB, bArr2, 0, i2);
                this.d.a(bArr2, 0, bArr, i);
                System.arraycopy(bArr4, 0, bArr, i + iB, i2);
            } else {
                this.d.a(this.a, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, iB);
            }
        }
        int i6 = this.b;
        c();
        return i6;
    }

    @Override // org.bouncycastle.b.f
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iA;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iB = b();
        int iA2 = a(i2);
        if (iA2 > 0 && iA2 + i3 > bArr2.length) {
            throw new ac("output buffer too short");
        }
        int length = this.a.length - this.b;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.a, this.b, length);
            iA = this.d.a(this.a, 0, bArr2, i3) + 0;
            byte[] bArr3 = this.a;
            System.arraycopy(bArr3, iB, bArr3, 0, iB);
            this.b = iB;
            i2 -= length;
            i += length;
            while (i2 > iB) {
                System.arraycopy(bArr, i, this.a, this.b, iB);
                iA += this.d.a(this.a, 0, bArr2, i3 + iA);
                byte[] bArr4 = this.a;
                System.arraycopy(bArr4, iB, bArr4, 0, iB);
                i2 -= iB;
                i += iB;
            }
        } else {
            iA = 0;
        }
        System.arraycopy(bArr, i, this.a, this.b, i2);
        this.b += i2;
        return iA;
    }

    @Override // org.bouncycastle.b.f
    public final int b(int i) {
        return this.b + i;
    }
}
