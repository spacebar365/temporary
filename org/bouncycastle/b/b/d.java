package org.bouncycastle.b.b;

import java.lang.reflect.Array;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.bg;

/* JADX INFO: loaded from: classes.dex */
public final class d implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    private static final byte[] s = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    byte[] a;
    short[] b;
    short[] c;
    byte[] d;
    byte[] e;
    byte[] f;
    byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[][] l;
    private byte[] m;
    private int n;
    private long o;
    private org.bouncycastle.b.e p;
    private byte[] q;
    private byte[] r;

    public d() {
        this.h = new byte[32];
        this.i = new byte[32];
        this.j = new byte[32];
        this.k = new byte[32];
        this.l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.m = new byte[32];
        this.p = new org.bouncycastle.b.e.u();
        this.r = new byte[32];
        this.a = new byte[8];
        this.b = new short[16];
        this.c = new short[16];
        this.d = new byte[32];
        this.e = new byte[32];
        this.f = new byte[32];
        this.g = new byte[32];
        this.q = org.bouncycastle.b.e.u.a("D-A");
        this.p.a(true, new bg(null, this.q));
        c();
    }

    public d(d dVar) {
        this.h = new byte[32];
        this.i = new byte[32];
        this.j = new byte[32];
        this.k = new byte[32];
        this.l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.m = new byte[32];
        this.p = new org.bouncycastle.b.e.u();
        this.r = new byte[32];
        this.a = new byte[8];
        this.b = new short[16];
        this.c = new short[16];
        this.d = new byte[32];
        this.e = new byte[32];
        this.f = new byte[32];
        this.g = new byte[32];
        a(dVar);
    }

    public d(byte[] bArr) {
        this.h = new byte[32];
        this.i = new byte[32];
        this.j = new byte[32];
        this.k = new byte[32];
        this.l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.m = new byte[32];
        this.p = new org.bouncycastle.b.e.u();
        this.r = new byte[32];
        this.a = new byte[8];
        this.b = new short[16];
        this.c = new short[16];
        this.d = new byte[32];
        this.e = new byte[32];
        this.f = new byte[32];
        this.g = new byte[32];
        this.q = org.bouncycastle.f.a.b(bArr);
        this.p.a(true, new bg(null, this.q));
        c();
    }

    private void a(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.p.a(true, new ba(bArr));
        this.p.a(bArr3, i2, bArr2, i);
    }

    private byte[] a(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.r[i * 4] = bArr[i];
            this.r[(i * 4) + 1] = bArr[i + 8];
            this.r[(i * 4) + 2] = bArr[i + 16];
            this.r[(i * 4) + 3] = bArr[i + 24];
        }
        return this.r;
    }

    private byte[] b(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.a[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.a, 0, bArr, 24, 8);
        return bArr;
    }

    private void d(byte[] bArr) {
        System.arraycopy(bArr, 0, this.j, 0, 32);
        System.arraycopy(this.h, 0, this.e, 0, 32);
        System.arraycopy(this.j, 0, this.f, 0, 32);
        for (int i = 0; i < 32; i++) {
            this.g[i] = (byte) (this.e[i] ^ this.f[i]);
        }
        a(a(this.g), this.d, 0, this.h, 0);
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 >= 4) {
                break;
            }
            byte[] bArrB = b(this.e);
            for (int i4 = 0; i4 < 32; i4++) {
                this.e[i4] = (byte) (bArrB[i4] ^ this.l[i3][i4]);
            }
            this.f = b(b(this.f));
            for (int i5 = 0; i5 < 32; i5++) {
                this.g[i5] = (byte) (this.e[i5] ^ this.f[i5]);
            }
            a(a(this.g), this.d, i3 * 8, this.h, i3 * 8);
            i2 = i3 + 1;
        }
        for (int i6 = 0; i6 < 12; i6++) {
            c(this.d);
        }
        for (int i7 = 0; i7 < 32; i7++) {
            byte[] bArr2 = this.d;
            bArr2[i7] = (byte) (bArr2[i7] ^ this.j[i7]);
        }
        c(this.d);
        for (int i8 = 0; i8 < 32; i8++) {
            this.d[i8] = (byte) (this.h[i8] ^ this.d[i8]);
        }
        for (int i9 = 0; i9 < 61; i9++) {
            c(this.d);
        }
        System.arraycopy(this.d, 0, this.h, 0, this.h.length);
    }

    private void e(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 == this.k.length) {
                return;
            }
            int i4 = (this.k[i2] & 255) + (bArr[i2] & 255) + i3;
            this.k[i2] = (byte) i4;
            i = i4 >>> 8;
            i2++;
        }
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        byte[] bArr = this.m;
        int i = this.n;
        this.n = i + 1;
        bArr[i] = b;
        if (this.n == this.m.length) {
            e(this.m);
            d(this.m);
            this.n = 0;
        }
        this.o++;
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        d dVar = (d) eVar;
        this.q = dVar.q;
        this.p.a(true, new bg(null, this.q));
        c();
        System.arraycopy(dVar.h, 0, this.h, 0, dVar.h.length);
        System.arraycopy(dVar.i, 0, this.i, 0, dVar.i.length);
        System.arraycopy(dVar.j, 0, this.j, 0, dVar.j.length);
        System.arraycopy(dVar.k, 0, this.k, 0, dVar.k.length);
        System.arraycopy(dVar.l[1], 0, this.l[1], 0, dVar.l[1].length);
        System.arraycopy(dVar.l[2], 0, this.l[2], 0, dVar.l[2].length);
        System.arraycopy(dVar.l[3], 0, this.l[3], 0, dVar.l[3].length);
        System.arraycopy(dVar.m, 0, this.m, 0, dVar.m.length);
        this.n = dVar.n;
        this.o = dVar.o;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        while (this.n != 0 && i2 > 0) {
            a(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.m.length) {
            System.arraycopy(bArr, i, this.m, 0, this.m.length);
            e(this.m);
            d(this.m);
            i += this.m.length;
            i2 -= this.m.length;
            this.o += (long) this.m.length;
        }
        while (i2 > 0) {
            a(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 32;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.o = 0L;
        this.n = 0;
        for (int i = 0; i < this.h.length; i++) {
            this.h[i] = 0;
        }
        for (int i2 = 0; i2 < this.i.length; i2++) {
            this.i[i2] = 0;
        }
        for (int i3 = 0; i3 < this.j.length; i3++) {
            this.j[i3] = 0;
        }
        for (int i4 = 0; i4 < this.l[1].length; i4++) {
            this.l[1][i4] = 0;
        }
        for (int i5 = 0; i5 < this.l[3].length; i5++) {
            this.l[3][i5] = 0;
        }
        for (int i6 = 0; i6 < this.k.length; i6++) {
            this.k[i6] = 0;
        }
        for (int i7 = 0; i7 < this.m.length; i7++) {
            this.m[i7] = 0;
        }
        System.arraycopy(s, 0, this.l[2], 0, s.length);
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 32;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new d(this);
    }

    private void c(byte[] bArr) {
        short[] sArr = this.b;
        for (int i = 0; i < bArr.length / 2; i++) {
            sArr[i] = (short) (((bArr[(i * 2) + 1] << 8) & 65280) | (bArr[i * 2] & 255));
        }
        this.c[15] = (short) (((((this.b[0] ^ this.b[1]) ^ this.b[2]) ^ this.b[3]) ^ this.b[12]) ^ this.b[15]);
        System.arraycopy(this.b, 1, this.c, 0, 15);
        short[] sArr2 = this.c;
        for (int i2 = 0; i2 < bArr.length / 2; i2++) {
            bArr[(i2 * 2) + 1] = (byte) (sArr2[i2] >> 8);
            bArr[i2 * 2] = (byte) sArr2[i2];
        }
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        org.bouncycastle.f.g.b(this.o * 8, this.i, 0);
        while (this.n != 0) {
            a((byte) 0);
        }
        d(this.i);
        d(this.k);
        System.arraycopy(this.h, 0, bArr, i, this.h.length);
        c();
        return 32;
    }
}
