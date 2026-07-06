package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class y extends j {
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;

    public y(y yVar) {
        super(yVar);
        this.j = yVar.j;
        a((org.bouncycastle.f.e) yVar);
    }

    private static void a(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(4, i3);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            } else {
                bArr[i2 + iMin] = (byte) (i >>> ((3 - iMin) * 8));
            }
        }
    }

    private static void a(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            a((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                a((int) (4294967295L & j), bArr, i + 4, i2 - 4);
            }
        }
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        a(this.a, bArr, i, this.j);
        a(this.b, bArr, i + 8, this.j - 8);
        a(this.c, bArr, i + 16, this.j - 16);
        a(this.d, bArr, i + 24, this.j - 24);
        a(this.e, bArr, i + 32, this.j - 32);
        a(this.f, bArr, i + 40, this.j - 40);
        a(this.g, bArr, i + 48, this.j - 48);
        a(this.h, bArr, i + 56, this.j - 56);
        c();
        return this.j;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "SHA-512/" + Integer.toString(this.j * 8);
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        y yVar = (y) eVar;
        if (this.j != yVar.j) {
            throw new org.bouncycastle.f.f("digestLength inappropriate in other");
        }
        super.a((j) yVar);
        this.k = yVar.k;
        this.l = yVar.l;
        this.m = yVar.m;
        this.n = yVar.n;
        this.o = yVar.o;
        this.p = yVar.p;
        this.q = yVar.q;
        this.r = yVar.r;
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.j;
    }

    @Override // org.bouncycastle.b.b.j, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.a = this.k;
        this.b = this.l;
        this.c = this.m;
        this.d = this.n;
        this.e = this.o;
        this.f = this.p;
        this.g = this.q;
        this.h = this.r;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new y(this);
    }

    public y(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        this.j = i / 8;
        int i2 = this.j * 8;
        this.a = -3482333909917012819L;
        this.b = 2216346199247487646L;
        this.c = -7364697282686394994L;
        this.d = 65953792586715988L;
        this.e = -816286391624063116L;
        this.f = 4512832404995164602L;
        this.g = -5033199132376557362L;
        this.h = -124578254951840548L;
        a((byte) 83);
        a((byte) 72);
        a((byte) 65);
        a((byte) 45);
        a((byte) 53);
        a((byte) 49);
        a((byte) 50);
        a((byte) 47);
        if (i2 > 100) {
            a((byte) ((i2 / 100) + 48));
            int i3 = i2 % 100;
            a((byte) ((i3 / 10) + 48));
            i2 = i3 % 10;
        } else if (i2 > 10) {
            a((byte) ((i2 / 10) + 48));
            i2 %= 10;
        }
        a((byte) (i2 + 48));
        f();
        this.k = this.a;
        this.l = this.b;
        this.m = this.c;
        this.n = this.d;
        this.o = this.e;
        this.p = this.f;
        this.q = this.g;
        this.r = this.h;
        c();
    }
}
