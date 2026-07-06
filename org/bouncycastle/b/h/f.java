package org.bouncycastle.b.h;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.bg;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements z {
    private int a = 8;
    private int b = 4;
    private boolean f = true;
    private int[] g = null;
    private byte[] h = null;
    private byte[] i = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private byte[] e = new byte[this.a];
    private byte[] d = new byte[this.a];
    private int c = 0;

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    private static byte[] a(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    private static int[] a(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = b(bArr, i * 4);
        }
        return iArr;
    }

    private static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        while (this.c < this.a) {
            this.d[this.c] = 0;
            this.c++;
        }
        byte[] bArrA = new byte[this.d.length];
        System.arraycopy(this.d, 0, bArrA, 0, this.e.length);
        if (this.f) {
            this.f = false;
        } else {
            bArrA = a(this.d, 0, this.e);
        }
        a(this.g, bArrA, this.e);
        System.arraycopy(this.e, (this.e.length / 2) - this.b, bArr, i, this.b);
        c();
        return this.b;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        if (this.c == this.d.length) {
            byte[] bArrA = new byte[this.d.length];
            System.arraycopy(this.d, 0, bArrA, 0, this.e.length);
            if (this.f) {
                this.f = false;
                if (this.h != null) {
                    bArrA = a(this.d, 0, this.h);
                }
            } else {
                bArrA = a(this.d, 0, this.e);
            }
            a(this.g, bArrA, this.e);
            this.c = 0;
        }
        byte[] bArr = this.d;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        c();
        this.d = new byte[this.a];
        this.h = null;
        if (iVar instanceof bg) {
            bg bgVar = (bg) iVar;
            System.arraycopy(bgVar.a(), 0, this.i, 0, bgVar.a().length);
            if (bgVar.b() != null) {
                this.g = a(((ba) bgVar.b()).a());
                return;
            }
            return;
        }
        if (iVar instanceof ba) {
            this.g = a(((ba) iVar).a());
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + iVar.getClass().getName());
            }
            be beVar = (be) iVar;
            this.g = a(((ba) beVar.b()).a());
            System.arraycopy(beVar.a(), 0, this.e, 0, this.e.length);
            this.h = beVar.a();
        }
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i5 = this.a - this.c;
        if (i2 > i5) {
            System.arraycopy(bArr, i, this.d, this.c, i5);
            byte[] bArrA = new byte[this.d.length];
            System.arraycopy(this.d, 0, bArrA, 0, this.e.length);
            if (this.f) {
                this.f = false;
                if (this.h != null) {
                    bArrA = a(this.d, 0, this.h);
                }
            } else {
                bArrA = a(this.d, 0, this.e);
            }
            a(this.g, bArrA, this.e);
            this.c = 0;
            i3 = i2 - i5;
            i4 = i5 + i;
            while (i3 > this.a) {
                a(this.g, a(bArr, i4, this.e), this.e);
                i3 -= this.a;
                i4 += this.a;
            }
        } else {
            i3 = i2;
            i4 = i;
        }
        System.arraycopy(bArr, i4, this.d, this.c, i3);
        this.c = i3 + this.c;
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        for (int i = 0; i < this.d.length; i++) {
            this.d[i] = 0;
        }
        this.c = 0;
        this.f = true;
    }

    private void a(int[] iArr, byte[] bArr, byte[] bArr2) {
        int iB = b(bArr, 0);
        int iB2 = b(bArr, 4);
        int i = 0;
        while (i < 2) {
            int i2 = 0;
            int i3 = iB2;
            while (i2 < 8) {
                int i4 = iArr[i2] + iB;
                int i5 = (this.i[((i4 >> 28) & 15) + 112] << 28) + (this.i[((i4 >> 0) & 15) + 0] << 0) + (this.i[((i4 >> 4) & 15) + 16] << 4) + (this.i[((i4 >> 8) & 15) + 32] << 8) + (this.i[((i4 >> 12) & 15) + 48] << 12) + (this.i[((i4 >> 16) & 15) + 64] << 16) + (this.i[((i4 >> 20) & 15) + 80] << 20) + (this.i[((i4 >> 24) & 15) + 96] << 24);
                int i6 = ((i5 >>> 21) | (i5 << 11)) ^ i3;
                i2++;
                i3 = iB;
                iB = i6;
            }
            i++;
            iB2 = i3;
        }
        a(iB, bArr2, 0);
        a(iB2, bArr2, 4);
    }
}
