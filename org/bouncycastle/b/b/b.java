package org.bouncycastle.b.b;

import android.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class b implements org.bouncycastle.b.u {
    private static final int[] a = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] b = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};
    private int c;
    private int d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private int i;
    private int[] j;
    private int[] k;
    private int l;
    private int m;
    private int n;

    public b() {
        this(256);
    }

    public b(int i) {
        this.c = 32;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = new int[16];
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.h = new byte[64];
        this.d = 0;
        this.c = i / 8;
        e();
    }

    public b(b bVar) {
        this.c = 32;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = new int[16];
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.i = bVar.i;
        this.h = org.bouncycastle.f.a.b(bVar.h);
        this.d = bVar.d;
        this.g = org.bouncycastle.f.a.b(bVar.g);
        this.c = bVar.c;
        this.k = org.bouncycastle.f.a.c(bVar.k);
        this.f = org.bouncycastle.f.a.b(bVar.f);
    }

    private static int a(int i, int i2) {
        return (i >>> i2) | (i << (32 - i2));
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.j;
        iArr[i3] = iArr[i3] + this.j[i4] + i;
        int[] iArr2 = this.j;
        iArr2[i6] = a(iArr2[i6] ^ this.j[i3], 16);
        int[] iArr3 = this.j;
        iArr3[i5] = iArr3[i5] + this.j[i6];
        int[] iArr4 = this.j;
        iArr4[i4] = a(iArr4[i4] ^ this.j[i5], 12);
        int[] iArr5 = this.j;
        iArr5[i3] = iArr5[i3] + this.j[i4] + i2;
        int[] iArr6 = this.j;
        iArr6[i6] = a(iArr6[i6] ^ this.j[i3], 8);
        int[] iArr7 = this.j;
        iArr7[i5] = iArr7[i5] + this.j[i6];
        int[] iArr8 = this.j;
        iArr8[i4] = a(iArr8[i4] ^ this.j[i5], 7);
    }

    private void b(byte[] bArr, int i) {
        f();
        int[] iArr = new int[16];
        for (int i2 = 0; i2 < 16; i2++) {
            iArr[i2] = org.bouncycastle.f.g.c(bArr, (i2 * 4) + i);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 10) {
                break;
            }
            a(iArr[b[i4][0]], iArr[b[i4][1]], 0, 4, 8, 12);
            a(iArr[b[i4][2]], iArr[b[i4][3]], 1, 5, 9, 13);
            a(iArr[b[i4][4]], iArr[b[i4][5]], 2, 6, 10, 14);
            a(iArr[b[i4][6]], iArr[b[i4][7]], 3, 7, 11, 15);
            a(iArr[b[i4][8]], iArr[b[i4][9]], 0, 5, 10, 15);
            a(iArr[b[i4][10]], iArr[b[i4][11]], 1, 6, 11, 12);
            a(iArr[b[i4][12]], iArr[b[i4][13]], 2, 7, 8, 13);
            a(iArr[b[i4][14]], iArr[b[i4][15]], 3, 4, 9, 14);
            i3 = i4 + 1;
        }
        for (int i5 = 0; i5 < this.k.length; i5++) {
            int[] iArr2 = this.k;
            iArr2[i5] = (iArr2[i5] ^ this.j[i5]) ^ this.j[i5 + 8];
        }
    }

    private void e() {
        if (this.k == null) {
            this.k = new int[8];
            this.k[0] = a[0] ^ ((this.c | (this.d << 8)) | R$attr.theme);
            this.k[1] = a[1];
            this.k[2] = a[2];
            this.k[3] = a[3];
            this.k[4] = a[4];
            this.k[5] = a[5];
            if (this.e != null) {
                int[] iArr = this.k;
                iArr[4] = iArr[4] ^ org.bouncycastle.f.g.c(this.e, 0);
                int[] iArr2 = this.k;
                iArr2[5] = iArr2[5] ^ org.bouncycastle.f.g.c(this.e, 4);
            }
            this.k[6] = a[6];
            this.k[7] = a[7];
            if (this.f != null) {
                int[] iArr3 = this.k;
                iArr3[6] = iArr3[6] ^ org.bouncycastle.f.g.c(this.f, 0);
                int[] iArr4 = this.k;
                iArr4[7] = iArr4[7] ^ org.bouncycastle.f.g.c(this.f, 4);
            }
        }
    }

    private void f() {
        System.arraycopy(this.k, 0, this.j, 0, this.k.length);
        System.arraycopy(a, 0, this.j, this.k.length, 4);
        this.j[12] = this.l ^ a[4];
        this.j[13] = this.m ^ a[5];
        this.j[14] = this.n ^ a[6];
        this.j[15] = a[7];
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b2) {
        if (64 - this.i != 0) {
            this.h[this.i] = b2;
            this.i++;
            return;
        }
        this.l += 64;
        if (this.l == 0) {
            this.m++;
        }
        b(this.h, 0);
        org.bouncycastle.f.a.a(this.h, (byte) 0);
        this.h[0] = b2;
        this.i = 1;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.i != 0) {
            i3 = 64 - this.i;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.h, this.i, i2);
                this.i += i2;
                return;
            }
            System.arraycopy(bArr, i, this.h, this.i, i3);
            this.l += 64;
            if (this.l == 0) {
                this.m++;
            }
            b(this.h, 0);
            this.i = 0;
            org.bouncycastle.f.a.a(this.h, (byte) 0);
        } else {
            i3 = 0;
        }
        int i4 = (i + i2) - 64;
        int i5 = i3 + i;
        while (i5 < i4) {
            this.l += 64;
            if (this.l == 0) {
                this.m++;
            }
            b(bArr, i5);
            i5 += 64;
        }
        System.arraycopy(bArr, i5, this.h, 0, (i + i2) - i5);
        this.i = ((i + i2) - i5) + this.i;
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.c;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.i = 0;
        this.n = 0;
        this.l = 0;
        this.m = 0;
        this.k = null;
        org.bouncycastle.f.a.a(this.h, (byte) 0);
        if (this.g != null) {
            System.arraycopy(this.g, 0, this.h, 0, this.g.length);
            this.i = 64;
        }
        e();
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 64;
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        this.n = -1;
        this.l += this.i;
        if (this.l < 0 && this.i > (-this.l)) {
            this.m++;
        }
        b(this.h, 0);
        org.bouncycastle.f.a.a(this.h, (byte) 0);
        org.bouncycastle.f.a.a(this.j);
        for (int i2 = 0; i2 < this.k.length && i2 * 4 < this.c; i2++) {
            byte[] bArr2 = new byte[4];
            org.bouncycastle.f.g.b(this.k[i2], bArr2, 0);
            if (i2 * 4 < this.c - 4) {
                System.arraycopy(bArr2, 0, bArr, (i2 * 4) + i, 4);
            } else {
                System.arraycopy(bArr2, 0, bArr, (i2 * 4) + i, this.c - (i2 * 4));
            }
        }
        org.bouncycastle.f.a.a(this.k);
        c();
        return this.c;
    }
}
