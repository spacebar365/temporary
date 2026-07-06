package org.bouncycastle.b.h;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class l implements z {
    private final org.bouncycastle.b.e a;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final byte[] p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public l() {
        this.b = new byte[1];
        this.p = new byte[16];
        this.q = 0;
        this.a = null;
    }

    public l(org.bouncycastle.b.e eVar) {
        this.b = new byte[1];
        this.p = new byte[16];
        this.q = 0;
        if (eVar.b() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.a = eVar;
    }

    private static final long a(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    private void d() {
        if (this.q < 16) {
            this.p[this.q] = 1;
            int i = this.q;
            while (true) {
                i++;
                if (i >= 16) {
                    break;
                } else {
                    this.p[i] = 0;
                }
            }
        }
        long jC = 4294967295L & ((long) org.bouncycastle.f.g.c(this.p, 0));
        long jC2 = 4294967295L & ((long) org.bouncycastle.f.g.c(this.p, 4));
        long jC3 = 4294967295L & ((long) org.bouncycastle.f.g.c(this.p, 8));
        long jC4 = 4294967295L & ((long) org.bouncycastle.f.g.c(this.p, 12));
        this.r = (int) (((long) this.r) + (67108863 & jC));
        this.s = (int) ((((jC | (jC2 << 32)) >>> 26) & 67108863) + ((long) this.s));
        this.t = (int) (((long) this.t) + (((jC2 | (jC3 << 32)) >>> 20) & 67108863));
        this.u = (int) (((long) this.u) + ((((jC4 << 32) | jC3) >>> 14) & 67108863));
        this.v = (int) (((long) this.v) + (jC4 >>> 8));
        if (this.q == 16) {
            this.v += 16777216;
        }
        long jA = a(this.r, this.c) + a(this.s, this.k) + a(this.t, this.j) + a(this.u, this.i) + a(this.v, this.h);
        long jA2 = a(this.r, this.d) + a(this.s, this.c) + a(this.t, this.k) + a(this.u, this.j) + a(this.v, this.i);
        long jA3 = a(this.r, this.e) + a(this.s, this.d) + a(this.t, this.c) + a(this.u, this.k) + a(this.v, this.j);
        long jA4 = a(this.r, this.f) + a(this.s, this.e) + a(this.t, this.d) + a(this.u, this.c) + a(this.v, this.k);
        long jA5 = a(this.r, this.g) + a(this.s, this.f) + a(this.t, this.e) + a(this.u, this.d) + a(this.v, this.c);
        this.r = ((int) jA) & 67108863;
        long j = (jA >>> 26) + jA2;
        this.s = ((int) j) & 67108863;
        long j2 = (j >>> 26) + jA3;
        this.t = ((int) j2) & 67108863;
        long j3 = (j2 >>> 26) + jA4;
        this.u = ((int) j3) & 67108863;
        long j4 = (j3 >>> 26) + jA5;
        this.v = ((int) j4) & 67108863;
        this.r = (((int) (j4 >>> 26)) * 5) + this.r;
        this.s += this.r >>> 26;
        this.r &= 67108863;
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        if (i + 16 > bArr.length) {
            throw new ac("Output buffer is too short.");
        }
        if (this.q > 0) {
            d();
        }
        this.s += this.r >>> 26;
        this.r &= 67108863;
        this.t += this.s >>> 26;
        this.s &= 67108863;
        this.u += this.t >>> 26;
        this.t &= 67108863;
        this.v += this.u >>> 26;
        this.u &= 67108863;
        this.r += (this.v >>> 26) * 5;
        this.v &= 67108863;
        this.s += this.r >>> 26;
        this.r &= 67108863;
        int i2 = this.r + 5;
        int i3 = (i2 >>> 26) + this.s;
        int i4 = (i3 >>> 26) + this.t;
        int i5 = (i4 >>> 26) + this.u;
        int i6 = ((i5 >>> 26) + this.v) - 67108864;
        int i7 = (i6 >>> 31) - 1;
        int i8 = i7 ^ (-1);
        this.r = (i2 & 67108863 & i7) | (this.r & i8);
        this.s = (this.s & i8) | (i3 & 67108863 & i7);
        this.t = (this.t & i8) | (i4 & 67108863 & i7);
        this.u = (this.u & i8) | (i5 & 67108863 & i7);
        this.v = (this.v & i8) | (i6 & i7);
        long j = (((long) (this.r | (this.s << 26))) & 4294967295L) + (((long) this.l) & 4294967295L);
        long j2 = (((long) ((this.s >>> 6) | (this.t << 20))) & 4294967295L) + (((long) this.m) & 4294967295L);
        long j3 = (((long) ((this.t >>> 12) | (this.u << 14))) & 4294967295L) + (((long) this.n) & 4294967295L);
        long j4 = (((long) ((this.u >>> 18) | (this.v << 8))) & 4294967295L) + (((long) this.o) & 4294967295L);
        org.bouncycastle.f.g.b((int) j, bArr, i);
        long j5 = (j >>> 32) + j2;
        org.bouncycastle.f.g.b((int) j5, bArr, i + 4);
        long j6 = (j5 >>> 32) + j3;
        org.bouncycastle.f.g.b((int) j6, bArr, i + 8);
        org.bouncycastle.f.g.b((int) ((j6 >>> 32) + j4), bArr, i + 12);
        c();
        return 16;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.a == null ? "Poly1305" : "Poly1305-" + this.a.a();
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.b[0] = b;
        a(this.b, 0, 1);
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            if (this.q == 16) {
                d();
                this.q = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.q);
            System.arraycopy(bArr, i3 + i, this.p, this.q, iMin);
            i3 += iMin;
            this.q = iMin + this.q;
        }
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.q = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        this.s = 0;
        this.r = 0;
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        int i;
        byte[] bArr;
        byte[] bArrA = null;
        if (this.a == null) {
            iVarB = iVar;
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            be beVar = (be) iVar;
            bArrA = beVar.a();
            iVarB = beVar.b();
        }
        if (!(iVarB instanceof ba)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        byte[] bArrA2 = ((ba) iVarB).a();
        if (bArrA2.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        if (this.a != null && (bArrA == null || bArrA.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iC = org.bouncycastle.f.g.c(bArrA2, 0);
        int iC2 = org.bouncycastle.f.g.c(bArrA2, 4);
        int iC3 = org.bouncycastle.f.g.c(bArrA2, 8);
        int iC4 = org.bouncycastle.f.g.c(bArrA2, 12);
        this.c = 67108863 & iC;
        this.d = ((iC >>> 26) | (iC2 << 6)) & 67108611;
        this.e = ((iC2 >>> 20) | (iC3 << 12)) & 67092735;
        this.f = ((iC3 >>> 14) | (iC4 << 18)) & 66076671;
        this.g = (iC4 >>> 8) & 1048575;
        this.h = this.d * 5;
        this.i = this.e * 5;
        this.j = this.f * 5;
        this.k = this.g * 5;
        if (this.a == null) {
            i = 16;
            bArr = bArrA2;
        } else {
            byte[] bArr2 = new byte[16];
            this.a.a(true, new ba(bArrA2, 16, 16));
            this.a.a(bArrA, 0, bArr2, 0);
            i = 0;
            bArr = bArr2;
        }
        this.l = org.bouncycastle.f.g.c(bArr, i + 0);
        this.m = org.bouncycastle.f.g.c(bArr, i + 4);
        this.n = org.bouncycastle.f.g.c(bArr, i + 8);
        this.o = org.bouncycastle.f.g.c(bArr, i + 12);
        c();
    }
}
