package org.bouncycastle.b.b;

import android.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class a implements org.bouncycastle.b.u {
    private static final long[] a = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] b = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    private static int c = 12;
    private int d;
    private int e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private int j;
    private long[] k;
    private long[] l;
    private long m;
    private long n;
    private long o;

    public a() {
        this(512);
    }

    public a(int i) {
        this.d = 64;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0;
        this.k = new long[16];
        this.l = null;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.i = new byte[128];
        this.e = 0;
        this.d = i / 8;
        e();
    }

    public a(a aVar) {
        this.d = 64;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0;
        this.k = new long[16];
        this.l = null;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.j = aVar.j;
        this.i = org.bouncycastle.f.a.b(aVar.i);
        this.e = aVar.e;
        this.h = org.bouncycastle.f.a.b(aVar.h);
        this.d = aVar.d;
        this.l = org.bouncycastle.f.a.b(aVar.l);
        this.g = org.bouncycastle.f.a.b(aVar.g);
        this.f = org.bouncycastle.f.a.b(aVar.f);
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
    }

    private static long a(long j, int i) {
        return (j >>> i) | (j << (64 - i));
    }

    private void a(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.k;
        jArr[i] = jArr[i] + this.k[i2] + j;
        long[] jArr2 = this.k;
        jArr2[i4] = a(jArr2[i4] ^ this.k[i], 32);
        long[] jArr3 = this.k;
        jArr3[i3] = jArr3[i3] + this.k[i4];
        long[] jArr4 = this.k;
        jArr4[i2] = a(jArr4[i2] ^ this.k[i3], 24);
        long[] jArr5 = this.k;
        jArr5[i] = jArr5[i] + this.k[i2] + j2;
        long[] jArr6 = this.k;
        jArr6[i4] = a(jArr6[i4] ^ this.k[i], 16);
        long[] jArr7 = this.k;
        jArr7[i3] = jArr7[i3] + this.k[i4];
        long[] jArr8 = this.k;
        jArr8[i2] = a(jArr8[i2] ^ this.k[i3], 63);
    }

    private void b(byte[] bArr, int i) {
        f();
        long[] jArr = new long[16];
        for (int i2 = 0; i2 < 16; i2++) {
            jArr[i2] = org.bouncycastle.f.g.d(bArr, (i2 * 8) + i);
        }
        for (int i3 = 0; i3 < c; i3++) {
            a(jArr[b[i3][0]], jArr[b[i3][1]], 0, 4, 8, 12);
            a(jArr[b[i3][2]], jArr[b[i3][3]], 1, 5, 9, 13);
            a(jArr[b[i3][4]], jArr[b[i3][5]], 2, 6, 10, 14);
            a(jArr[b[i3][6]], jArr[b[i3][7]], 3, 7, 11, 15);
            a(jArr[b[i3][8]], jArr[b[i3][9]], 0, 5, 10, 15);
            a(jArr[b[i3][10]], jArr[b[i3][11]], 1, 6, 11, 12);
            a(jArr[b[i3][12]], jArr[b[i3][13]], 2, 7, 8, 13);
            a(jArr[b[i3][14]], jArr[b[i3][15]], 3, 4, 9, 14);
        }
        for (int i4 = 0; i4 < this.l.length; i4++) {
            long[] jArr2 = this.l;
            jArr2[i4] = (jArr2[i4] ^ this.k[i4]) ^ this.k[i4 + 8];
        }
    }

    private void e() {
        if (this.l == null) {
            this.l = new long[8];
            this.l[0] = a[0] ^ ((long) ((this.d | (this.e << 8)) | R$attr.theme));
            this.l[1] = a[1];
            this.l[2] = a[2];
            this.l[3] = a[3];
            this.l[4] = a[4];
            this.l[5] = a[5];
            if (this.f != null) {
                long[] jArr = this.l;
                jArr[4] = jArr[4] ^ org.bouncycastle.f.g.d(this.f, 0);
                long[] jArr2 = this.l;
                jArr2[5] = jArr2[5] ^ org.bouncycastle.f.g.d(this.f, 8);
            }
            this.l[6] = a[6];
            this.l[7] = a[7];
            if (this.g != null) {
                long[] jArr3 = this.l;
                jArr3[6] = jArr3[6] ^ org.bouncycastle.f.g.d(this.g, 0);
                long[] jArr4 = this.l;
                jArr4[7] = jArr4[7] ^ org.bouncycastle.f.g.d(this.g, 8);
            }
        }
    }

    private void f() {
        System.arraycopy(this.l, 0, this.k, 0, this.l.length);
        System.arraycopy(a, 0, this.k, this.l.length, 4);
        this.k[12] = this.m ^ a[4];
        this.k[13] = this.n ^ a[5];
        this.k[14] = this.o ^ a[6];
        this.k[15] = a[7];
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        this.o = -1L;
        this.m += (long) this.j;
        if (this.j > 0 && this.m == 0) {
            this.n++;
        }
        b(this.i, 0);
        org.bouncycastle.f.a.a(this.i, (byte) 0);
        org.bouncycastle.f.a.a(this.k);
        for (int i2 = 0; i2 < this.l.length && i2 * 8 < this.d; i2++) {
            byte[] bArrB = org.bouncycastle.f.g.b(this.l[i2]);
            if (i2 * 8 < this.d - 8) {
                System.arraycopy(bArrB, 0, bArr, (i2 * 8) + i, 8);
            } else {
                System.arraycopy(bArrB, 0, bArr, (i2 * 8) + i, this.d - (i2 * 8));
            }
        }
        org.bouncycastle.f.a.a(this.l);
        c();
        return this.d;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b2) {
        if (128 - this.j != 0) {
            this.i[this.j] = b2;
            this.j++;
            return;
        }
        this.m += 128;
        if (this.m == 0) {
            this.n++;
        }
        b(this.i, 0);
        org.bouncycastle.f.a.a(this.i, (byte) 0);
        this.i[0] = b2;
        this.j = 1;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.j != 0) {
            i3 = 128 - this.j;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.i, this.j, i2);
                this.j += i2;
                return;
            }
            System.arraycopy(bArr, i, this.i, this.j, i3);
            this.m += 128;
            if (this.m == 0) {
                this.n++;
            }
            b(this.i, 0);
            this.j = 0;
            org.bouncycastle.f.a.a(this.i, (byte) 0);
        } else {
            i3 = 0;
        }
        int i4 = (i + i2) - 128;
        int i5 = i3 + i;
        while (i5 < i4) {
            this.m += 128;
            if (this.m == 0) {
                this.n++;
            }
            b(bArr, i5);
            i5 += 128;
        }
        System.arraycopy(bArr, i5, this.i, 0, (i + i2) - i5);
        this.j = ((i + i2) - i5) + this.j;
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.d;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.j = 0;
        this.o = 0L;
        this.m = 0L;
        this.n = 0L;
        this.l = null;
        org.bouncycastle.f.a.a(this.i, (byte) 0);
        if (this.h != null) {
            System.arraycopy(this.h, 0, this.i, 0, this.h.length);
            this.j = 128;
        }
        e();
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 128;
    }
}
