package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class ae implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    private static final int[] a = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};
    private static final long[] b = new long[256];
    private static final long[] c = new long[256];
    private static final long[] d = new long[256];
    private static final long[] e = new long[256];
    private static final long[] f = new long[256];
    private static final long[] g = new long[256];
    private static final long[] h = new long[256];
    private static final long[] i = new long[256];
    private static final short[] s;
    private final long[] j;
    private byte[] k;
    private int l;
    private short[] m;
    private long[] n;
    private long[] o;
    private long[] p;
    private long[] q;
    private long[] r;

    static {
        short[] sArr = new short[32];
        s = sArr;
        sArr[31] = 8;
    }

    public ae() {
        this.j = new long[11];
        this.k = new byte[64];
        this.l = 0;
        this.m = new short[32];
        this.n = new long[8];
        this.o = new long[8];
        this.p = new long[8];
        this.q = new long[8];
        this.r = new long[8];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 256) {
                break;
            }
            int i4 = a[i3];
            int iA = a(i4 << 1);
            int iA2 = a(iA << 1);
            int i5 = iA2 ^ i4;
            int iA3 = a(iA2 << 1);
            int i6 = iA3 ^ i4;
            b[i3] = a(i4, i4, iA2, i4, iA3, i5, iA, i6);
            c[i3] = a(i6, i4, i4, iA2, i4, iA3, i5, iA);
            d[i3] = a(iA, i6, i4, i4, iA2, i4, iA3, i5);
            e[i3] = a(i5, iA, i6, i4, i4, iA2, i4, iA3);
            f[i3] = a(iA3, i5, iA, i6, i4, i4, iA2, i4);
            g[i3] = a(i4, iA3, i5, iA, i6, i4, i4, iA2);
            h[i3] = a(iA2, i4, iA3, i5, iA, i6, i4, i4);
            i[i3] = a(i4, iA2, i4, iA3, i5, iA, i6, i4);
            i2 = i3 + 1;
        }
        this.j[0] = 0;
        for (int i7 = 1; i7 <= 10; i7++) {
            int i8 = (i7 - 1) * 8;
            this.j[i7] = (((((((b[i8] & (-72057594037927936L)) ^ (c[i8 + 1] & 71776119061217280L)) ^ (d[i8 + 2] & 280375465082880L)) ^ (e[i8 + 3] & 1095216660480L)) ^ (f[i8 + 4] & 4278190080L)) ^ (g[i8 + 5] & 16711680)) ^ (h[i8 + 6] & 65280)) ^ (i[i8 + 7] & 255);
        }
    }

    public ae(ae aeVar) {
        this.j = new long[11];
        this.k = new byte[64];
        this.l = 0;
        this.m = new short[32];
        this.n = new long[8];
        this.o = new long[8];
        this.p = new long[8];
        this.q = new long[8];
        this.r = new long[8];
        a(aeVar);
    }

    private static int a(int i2) {
        return ((long) i2) >= 256 ? i2 ^ 285 : i2;
    }

    private static long a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return (((((((((long) i2) << 56) ^ (((long) i3) << 48)) ^ (((long) i4) << 40)) ^ (((long) i5) << 32)) ^ (((long) i6) << 24)) ^ (((long) i7) << 16)) ^ (((long) i8) << 8)) ^ ((long) i9);
    }

    private static long b(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 0]) & 255) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8) | (((long) bArr[i2 + 7]) & 255);
    }

    private void f() {
        for (int i2 = 0; i2 < this.r.length; i2++) {
            this.q[i2] = b(this.k, i2 * 8);
        }
        g();
        this.l = 0;
        org.bouncycastle.f.a.a(this.k, (byte) 0);
    }

    private void g() {
        for (int i2 = 0; i2 < 8; i2++) {
            long[] jArr = this.r;
            long j = this.q[i2];
            long[] jArr2 = this.o;
            long j2 = this.n[i2];
            jArr2[i2] = j2;
            jArr[i2] = j ^ j2;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3;
            if (i4 > 10) {
                break;
            }
            for (int i5 = 0; i5 < 8; i5++) {
                this.p[i5] = 0;
                long[] jArr3 = this.p;
                jArr3[i5] = jArr3[i5] ^ b[((int) (this.o[(i5 + 0) & 7] >>> 56)) & 255];
                long[] jArr4 = this.p;
                jArr4[i5] = jArr4[i5] ^ c[((int) (this.o[(i5 - 1) & 7] >>> 48)) & 255];
                long[] jArr5 = this.p;
                jArr5[i5] = jArr5[i5] ^ d[((int) (this.o[(i5 - 2) & 7] >>> 40)) & 255];
                long[] jArr6 = this.p;
                jArr6[i5] = jArr6[i5] ^ e[((int) (this.o[(i5 - 3) & 7] >>> 32)) & 255];
                long[] jArr7 = this.p;
                jArr7[i5] = jArr7[i5] ^ f[((int) (this.o[(i5 - 4) & 7] >>> 24)) & 255];
                long[] jArr8 = this.p;
                jArr8[i5] = jArr8[i5] ^ g[((int) (this.o[(i5 - 5) & 7] >>> 16)) & 255];
                long[] jArr9 = this.p;
                jArr9[i5] = jArr9[i5] ^ h[((int) (this.o[(i5 - 6) & 7] >>> 8)) & 255];
                long[] jArr10 = this.p;
                jArr10[i5] = jArr10[i5] ^ i[((int) this.o[(i5 - 7) & 7]) & 255];
            }
            System.arraycopy(this.p, 0, this.o, 0, this.o.length);
            long[] jArr11 = this.o;
            jArr11[0] = jArr11[0] ^ this.j[i4];
            for (int i6 = 0; i6 < 8; i6++) {
                this.p[i6] = this.o[i6];
                long[] jArr12 = this.p;
                jArr12[i6] = jArr12[i6] ^ b[((int) (this.r[(i6 + 0) & 7] >>> 56)) & 255];
                long[] jArr13 = this.p;
                jArr13[i6] = jArr13[i6] ^ c[((int) (this.r[(i6 - 1) & 7] >>> 48)) & 255];
                long[] jArr14 = this.p;
                jArr14[i6] = jArr14[i6] ^ d[((int) (this.r[(i6 - 2) & 7] >>> 40)) & 255];
                long[] jArr15 = this.p;
                jArr15[i6] = jArr15[i6] ^ e[((int) (this.r[(i6 - 3) & 7] >>> 32)) & 255];
                long[] jArr16 = this.p;
                jArr16[i6] = jArr16[i6] ^ f[((int) (this.r[(i6 - 4) & 7] >>> 24)) & 255];
                long[] jArr17 = this.p;
                jArr17[i6] = jArr17[i6] ^ g[((int) (this.r[(i6 - 5) & 7] >>> 16)) & 255];
                long[] jArr18 = this.p;
                jArr18[i6] = jArr18[i6] ^ h[((int) (this.r[(i6 - 6) & 7] >>> 8)) & 255];
                long[] jArr19 = this.p;
                jArr19[i6] = jArr19[i6] ^ i[((int) this.r[(i6 - 7) & 7]) & 255];
            }
            System.arraycopy(this.p, 0, this.r, 0, this.r.length);
            i3 = i4 + 1;
        }
        for (int i7 = 0; i7 < 8; i7++) {
            long[] jArr20 = this.n;
            jArr20[i7] = jArr20[i7] ^ (this.r[i7] ^ this.q[i7]);
        }
    }

    private void h() {
        int i2 = 0;
        for (int length = this.m.length - 1; length >= 0; length--) {
            int i3 = (this.m[length] & 255) + s[length] + i2;
            i2 = i3 >>> 8;
            this.m[length] = (short) (i3 & 255);
        }
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b2) {
        this.k[this.l] = b2;
        this.l++;
        if (this.l == this.k.length) {
            f();
        }
        h();
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        ae aeVar = (ae) eVar;
        System.arraycopy(aeVar.j, 0, this.j, 0, this.j.length);
        System.arraycopy(aeVar.k, 0, this.k, 0, this.k.length);
        this.l = aeVar.l;
        System.arraycopy(aeVar.m, 0, this.m, 0, this.m.length);
        System.arraycopy(aeVar.n, 0, this.n, 0, this.n.length);
        System.arraycopy(aeVar.o, 0, this.o, 0, this.o.length);
        System.arraycopy(aeVar.p, 0, this.p, 0, this.p.length);
        System.arraycopy(aeVar.q, 0, this.q, 0, this.q.length);
        System.arraycopy(aeVar.r, 0, this.r, 0, this.r.length);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            a(bArr[i2]);
            i2++;
            i3--;
        }
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 64;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.l = 0;
        org.bouncycastle.f.a.a(this.m);
        org.bouncycastle.f.a.a(this.k, (byte) 0);
        org.bouncycastle.f.a.a(this.n);
        org.bouncycastle.f.a.a(this.o);
        org.bouncycastle.f.a.a(this.p);
        org.bouncycastle.f.a.a(this.q);
        org.bouncycastle.f.a.a(this.r);
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 64;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new ae(this);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[32];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr2[i3] = (byte) (this.m[i3] & 255);
        }
        byte[] bArr3 = this.k;
        int i4 = this.l;
        this.l = i4 + 1;
        bArr3[i4] = (byte) (bArr3[i4] | 128);
        if (this.l == this.k.length) {
            f();
        }
        if (this.l > 32) {
            while (this.l != 0) {
                a((byte) 0);
            }
        }
        while (this.l <= 32) {
            a((byte) 0);
        }
        System.arraycopy(bArr2, 0, this.k, 32, 32);
        f();
        for (int i5 = 0; i5 < 8; i5++) {
            long j = this.n[i5];
            int i6 = i2 + (i5 * 8);
            for (int i7 = 0; i7 < 8; i7++) {
                bArr[i6 + i7] = (byte) ((j >> (56 - (i7 * 8))) & 255);
            }
        }
        c();
        return 64;
    }
}
