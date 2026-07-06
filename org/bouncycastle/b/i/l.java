package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class l implements a {
    private org.bouncycastle.b.e a;
    private org.bouncycastle.b.i.a.c b;
    private org.bouncycastle.b.i.a.b c;
    private boolean d;
    private boolean e;
    private int f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private byte[] q;
    private int r;
    private int s;
    private long t;
    private byte[] u;
    private int v;
    private long w;
    private long x;

    public l(org.bouncycastle.b.e eVar) {
        this(eVar, (byte) 0);
    }

    private l(org.bouncycastle.b.e eVar, byte b) {
        if (eVar.b() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        org.bouncycastle.b.i.a.e eVar2 = new org.bouncycastle.b.i.a.e();
        this.a = eVar;
        this.b = eVar2;
    }

    private void a(boolean z) {
        this.a.c();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = org.bouncycastle.f.a.b(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        if (this.l != null) {
            org.bouncycastle.f.a.a(this.l, (byte) 0);
        }
        if (z) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
        } else if (this.i != null) {
            a(this.i, 0, this.i.length);
        }
    }

    private void a(byte[] bArr) {
        if (this.r == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.r--;
        int i = (this.q[15] & 255) + 1;
        this.q[15] = (byte) i;
        int i2 = (i >>> 8) + (this.q[14] & 255);
        this.q[14] = (byte) i2;
        int i3 = (i2 >>> 8) + (this.q[13] & 255);
        this.q[13] = (byte) i3;
        this.q[12] = (byte) ((i3 >>> 8) + (this.q[12] & 255));
        this.a.a(this.q, 0, bArr, 0);
    }

    private void a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new ac("Output buffer too short");
        }
        if (this.t == 0) {
            d();
        }
        byte[] bArr3 = new byte[16];
        a(bArr3);
        if (this.d) {
            org.bouncycastle.b.i.a.d.a(bArr3, bArr, i);
            a(this.n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            b(this.n, bArr, i);
            org.bouncycastle.b.i.a.d.a(bArr3, bArr, i, bArr2, i2);
        }
        this.t += 16;
    }

    private void a(byte[] bArr, byte[] bArr2) {
        org.bouncycastle.b.i.a.d.a(bArr, bArr2);
        this.b.b(bArr);
    }

    private void a(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            a(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void a(byte[] bArr, byte[] bArr2, int i, int i2) {
        org.bouncycastle.b.i.a.d.a(bArr, bArr2, i, i2);
        this.b.b(bArr);
    }

    private void b(byte[] bArr, byte[] bArr2, int i) {
        org.bouncycastle.b.i.a.d.a(bArr, bArr2, i);
        this.b.b(bArr);
    }

    private void d() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        if (this.v > 0) {
            a(this.p, this.u, 0, this.v);
            this.x += (long) this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    private void e() {
        if (this.e) {
            return;
        }
        if (!this.d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(int i) {
        int i2 = this.s + i;
        if (!this.d) {
            if (i2 < this.f) {
                return 0;
            }
            i2 -= this.f;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        e();
        if (bArr.length - i < i2) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        if (this.d) {
            if (this.s != 0) {
                while (true) {
                    int i5 = i;
                    if (i2 <= 0) {
                        i4 = 0;
                        i = i5;
                        break;
                    }
                    i2--;
                    i = i5 + 1;
                    this.l[this.s] = bArr[i5];
                    int i6 = this.s + 1;
                    this.s = i6;
                    if (i6 == 16) {
                        a(this.l, 0, bArr2, i3);
                        this.s = 0;
                        i4 = 16;
                        break;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i2 >= 16) {
                a(bArr, i, bArr2, i3 + i4);
                i += 16;
                i2 -= 16;
                i4 += 16;
            }
            if (i2 > 0) {
                System.arraycopy(bArr, i, this.l, 0, i2);
                this.s = i2;
            }
        } else {
            i4 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                this.l[this.s] = bArr[i + i7];
                int i8 = this.s + 1;
                this.s = i8;
                if (i8 == this.l.length) {
                    a(this.l, 0, bArr2, i3 + i4);
                    System.arraycopy(this.l, 16, this.l, 0, this.f);
                    this.s = this.f;
                    i4 += 16;
                }
            }
        }
        return i4;
    }

    @Override // org.bouncycastle.b.i.a
    public final org.bouncycastle.b.e a() {
        return this.a;
    }

    public final void a(byte b) {
        e();
        this.u[this.v] = b;
        int i = this.v + 1;
        this.v = i;
        if (i == 16) {
            a(this.o, this.u);
            this.v = 0;
            this.w += 16;
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        byte[] bArrA;
        ba baVarA;
        this.d = z;
        this.m = null;
        this.e = true;
        if (iVar instanceof org.bouncycastle.b.k.a) {
            org.bouncycastle.b.k.a aVar = (org.bouncycastle.b.k.a) iVar;
            byte[] bArrD = aVar.d();
            this.i = aVar.c();
            int iB = aVar.b();
            if (iB < 32 || iB > 128 || iB % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iB)));
            }
            this.f = iB / 8;
            baVarA = aVar.a();
            bArrA = bArrD;
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            be beVar = (be) iVar;
            bArrA = beVar.a();
            this.i = null;
            this.f = 16;
            baVarA = (ba) beVar.b();
        }
        this.l = new byte[z ? 16 : this.f + 16];
        if (bArrA == null || bArrA.length <= 0) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && this.h != null && org.bouncycastle.f.a.a(this.h, bArrA)) {
            if (baVarA == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            if (this.g != null && org.bouncycastle.f.a.a(this.g, baVarA.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.h = bArrA;
        if (baVarA != null) {
            this.g = baVarA.a();
        }
        if (baVarA != null) {
            this.a.a(true, baVarA);
            this.j = new byte[16];
            this.a.a(this.j, 0, this.j, 0);
            this.b.a(this.j);
            this.c = null;
        } else if (this.j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        this.k = new byte[16];
        if (this.h.length == 12) {
            System.arraycopy(this.h, 0, this.k, 0, this.h.length);
            this.k[15] = 1;
        } else {
            a(this.k, this.h, this.h.length);
            byte[] bArr = new byte[16];
            org.bouncycastle.f.g.a(((long) this.h.length) * 8, bArr, 8);
            a(this.k, bArr);
        }
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = org.bouncycastle.f.a.b(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        if (this.i != null) {
            a(this.i, 0, this.i.length);
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(byte[] bArr, int i, int i2) {
        e();
        for (int i3 = 0; i3 < i2; i3++) {
            this.u[this.v] = bArr[i + i3];
            int i4 = this.v + 1;
            this.v = i4;
            if (i4 == 16) {
                a(this.o, this.u);
                this.v = 0;
                this.w += 16;
            }
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final int b(int i) {
        int i2 = this.s + i;
        if (this.d) {
            return i2 + this.f;
        }
        if (i2 < this.f) {
            return 0;
        }
        return i2 - this.f;
    }

    @Override // org.bouncycastle.b.i.a
    public final byte[] b() {
        return this.m == null ? new byte[this.f] : org.bouncycastle.f.a.b(this.m);
    }

    public final void c() {
        a(true);
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        e();
        if (this.t == 0) {
            d();
        }
        int i2 = this.s;
        if (this.d) {
            if (bArr.length - i < this.f + i2) {
                throw new ac("Output buffer too short");
            }
        } else {
            if (i2 < this.f) {
                throw new org.bouncycastle.b.v("data too short");
            }
            i2 -= this.f;
            if (bArr.length - i < i2) {
                throw new ac("Output buffer too short");
            }
        }
        if (i2 > 0) {
            byte[] bArr2 = this.l;
            byte[] bArr3 = new byte[16];
            a(bArr3);
            if (this.d) {
                org.bouncycastle.b.i.a.d.b(bArr2, bArr3, i2);
                a(this.n, bArr2, 0, i2);
            } else {
                a(this.n, bArr2, 0, i2);
                org.bouncycastle.b.i.a.d.b(bArr2, bArr3, i2);
            }
            System.arraycopy(bArr2, 0, bArr, i, i2);
            this.t += (long) i2;
        }
        this.w += (long) this.v;
        if (this.w > this.x) {
            if (this.v > 0) {
                a(this.o, this.u, 0, this.v);
            }
            if (this.x > 0) {
                org.bouncycastle.b.i.a.d.a(this.o, this.p);
            }
            long j = ((this.t * 8) + 127) >>> 7;
            byte[] bArr4 = new byte[16];
            if (this.c == null) {
                this.c = new org.bouncycastle.b.i.a.a();
                this.c.a(this.j);
            }
            this.c.a(j, bArr4);
            byte[] bArr5 = this.o;
            long[] jArrA = org.bouncycastle.b.i.a.d.a(bArr5);
            org.bouncycastle.b.i.a.d.a(jArrA, org.bouncycastle.b.i.a.d.a(bArr4));
            org.bouncycastle.f.g.a(jArrA, bArr5, 0);
            org.bouncycastle.b.i.a.d.a(this.n, this.o);
        }
        byte[] bArr6 = new byte[16];
        org.bouncycastle.f.g.a(this.w * 8, bArr6, 0);
        org.bouncycastle.f.g.a(this.t * 8, bArr6, 8);
        a(this.n, bArr6);
        byte[] bArr7 = new byte[16];
        this.a.a(this.k, 0, bArr7, 0);
        org.bouncycastle.b.i.a.d.a(bArr7, this.n);
        this.m = new byte[this.f];
        System.arraycopy(bArr7, 0, this.m, 0, this.f);
        if (this.d) {
            System.arraycopy(this.m, 0, bArr, this.s + i, this.f);
            i2 += this.f;
        } else {
            byte[] bArr8 = new byte[this.f];
            System.arraycopy(this.l, i2, bArr8, 0, this.f);
            if (!org.bouncycastle.f.a.b(this.m, bArr8)) {
                throw new org.bouncycastle.b.v("mac check in GCM failed");
            }
        }
        a(false);
        return i2;
    }
}
