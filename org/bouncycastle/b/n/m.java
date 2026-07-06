package org.bouncycastle.b.n;

import org.bouncycastle.b.al;
import org.bouncycastle.b.k.bm;

/* JADX INFO: loaded from: classes.dex */
public final class m implements al {
    private org.bouncycastle.b.r a;
    private org.bouncycastle.b.a b;
    private int c = 188;
    private int d;
    private byte[] e;
    private byte[] f;
    private int g;
    private boolean h;
    private byte[] i;
    private byte[] j;
    private byte[] k;

    public m(org.bouncycastle.b.a aVar, org.bouncycastle.b.r rVar) {
        this.b = aVar;
        this.a = rVar;
    }

    private boolean a(byte[] bArr, byte[] bArr2) {
        boolean z;
        if (this.g > this.f.length) {
            z = this.f.length <= bArr2.length;
            for (int i = 0; i != this.f.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    z = false;
                }
            }
        } else {
            z = this.g == bArr2.length;
            for (int i2 = 0; i2 != bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
        }
        return z;
    }

    private static void b(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private boolean c(byte[] bArr) {
        this.g = 0;
        b(this.f);
        b(bArr);
        return false;
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte b) {
        this.a.a(b);
        if (this.g < this.f.length) {
            this.f[this.g] = b;
        }
        this.g++;
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.g < this.f.length) {
            a(bArr[i]);
            i++;
            i2--;
        }
        this.a.a(bArr, i, i2);
        this.g += i2;
    }

    @Override // org.bouncycastle.b.ak
    public final boolean a(byte[] bArr) {
        byte[] bArrA;
        int i;
        if (this.j == null) {
            try {
                bArrA = this.b.a(bArr, 0, bArr.length);
            } catch (Exception e) {
                return false;
            }
        } else {
            if (!org.bouncycastle.f.a.a(this.j, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrA = this.k;
            this.j = null;
            this.k = null;
        }
        if (((bArrA[0] & 192) ^ 64) == 0 && ((bArrA[bArrA.length - 1] & 15) ^ 12) == 0) {
            if (((bArrA[bArrA.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                int i2 = ((bArrA[bArrA.length - 2] & 255) << 8) | (bArrA[bArrA.length - 1] & 255);
                Integer numA = n.a(this.a);
                if (numA == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int iIntValue = numA.intValue();
                if (i2 != iIntValue && (iIntValue != 15052 || i2 != 16588)) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer ".concat(String.valueOf(i2)));
                }
                i = 2;
            }
            int i3 = 0;
            while (i3 != bArrA.length && ((bArrA[i3] & 15) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            byte[] bArr2 = new byte[this.a.b()];
            int length = (bArrA.length - i) - bArr2.length;
            if (length - i4 <= 0) {
                return c(bArrA);
            }
            if ((bArrA[0] & 32) == 0) {
                this.h = true;
                if (this.g > length - i4) {
                    return c(bArrA);
                }
                this.a.c();
                this.a.a(bArrA, i4, length - i4);
                this.a.a(bArr2, 0);
                boolean z = true;
                for (int i5 = 0; i5 != bArr2.length; i5++) {
                    int i6 = length + i5;
                    bArrA[i6] = (byte) (bArrA[i6] ^ bArr2[i5]);
                    if (bArrA[length + i5] != 0) {
                        z = false;
                    }
                }
                if (!z) {
                    return c(bArrA);
                }
                this.i = new byte[length - i4];
                System.arraycopy(bArrA, i4, this.i, 0, this.i.length);
            } else {
                this.h = false;
                this.a.a(bArr2, 0);
                boolean z2 = true;
                for (int i7 = 0; i7 != bArr2.length; i7++) {
                    int i8 = length + i7;
                    bArrA[i8] = (byte) (bArrA[i8] ^ bArr2[i7]);
                    if (bArrA[length + i7] != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return c(bArrA);
                }
                this.i = new byte[length - i4];
                System.arraycopy(bArrA, i4, this.i, 0, this.i.length);
            }
            if (this.g != 0 && !a(this.f, this.i)) {
                return c(bArrA);
            }
            b(this.f);
            b(bArrA);
            this.g = 0;
            return true;
        }
        return c(bArrA);
    }

    @Override // org.bouncycastle.b.ak
    public final byte[] a() {
        int i;
        int length;
        byte b;
        int i2;
        int iB = this.a.b();
        if (this.c == 188) {
            i = 8;
            length = (this.e.length - iB) - 1;
            this.a.a(this.e, length);
            this.e[this.e.length - 1] = -68;
        } else {
            i = 16;
            length = (this.e.length - iB) - 2;
            this.a.a(this.e, length);
            this.e[this.e.length - 2] = (byte) (this.c >>> 8);
            this.e[this.e.length - 1] = (byte) this.c;
        }
        int i3 = ((i + ((iB + this.g) * 8)) + 4) - this.d;
        if (i3 > 0) {
            int i4 = this.g - ((i3 + 7) / 8);
            b = 96;
            int i5 = length - i4;
            System.arraycopy(this.f, 0, this.e, i5, i4);
            this.i = new byte[i4];
            i2 = i5;
        } else {
            b = 64;
            int i6 = length - this.g;
            System.arraycopy(this.f, 0, this.e, i6, this.g);
            this.i = new byte[this.g];
            i2 = i6;
        }
        if (i2 - 1 > 0) {
            for (int i7 = i2 - 1; i7 != 0; i7--) {
                this.e[i7] = -69;
            }
            byte[] bArr = this.e;
            int i8 = i2 - 1;
            bArr[i8] = (byte) (bArr[i8] ^ 1);
            this.e[0] = 11;
            byte[] bArr2 = this.e;
            bArr2[0] = (byte) (bArr2[0] | b);
        } else {
            this.e[0] = 10;
            byte[] bArr3 = this.e;
            bArr3[0] = (byte) (bArr3[0] | b);
        }
        byte[] bArrA = this.b.a(this.e, 0, this.e.length);
        this.h = (b & 32) == 0;
        System.arraycopy(this.f, 0, this.i, 0, this.i.length);
        this.g = 0;
        b(this.f);
        b(this.e);
        return bArrA;
    }

    @Override // org.bouncycastle.b.ak
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        bm bmVar = (bm) iVar;
        this.b.a(z, bmVar);
        this.d = bmVar.b().bitLength();
        this.e = new byte[(this.d + 7) / 8];
        if (this.c == 188) {
            this.f = new byte[(this.e.length - this.a.b()) - 2];
        } else {
            this.f = new byte[(this.e.length - this.a.b()) - 3];
        }
        this.a.c();
        this.g = 0;
        b(this.f);
        if (this.i != null) {
            b(this.i);
        }
        this.i = null;
        this.h = false;
        if (this.j != null) {
            this.j = null;
            b(this.k);
            this.k = null;
        }
    }
}
