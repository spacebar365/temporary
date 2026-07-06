package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class u extends h {
    static final int[] a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int[] j;
    private int k;

    public u() {
        this.j = new int[64];
        c();
    }

    public u(u uVar) {
        super(uVar);
        this.j = new int[64];
        a(uVar);
    }

    private static int a(int i) {
        return (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19))) ^ ((i >>> 22) | (i << 10));
    }

    private static int a(int i, int i2, int i3) {
        return (i & i2) ^ ((i ^ (-1)) & i3);
    }

    private void a(u uVar) {
        super.a((h) uVar);
        this.b = uVar.b;
        this.c = uVar.c;
        this.d = uVar.d;
        this.e = uVar.e;
        this.f = uVar.f;
        this.g = uVar.g;
        this.h = uVar.h;
        this.i = uVar.i;
        System.arraycopy(uVar.j, 0, this.j, 0, uVar.j.length);
        this.k = uVar.k;
    }

    private static int b(int i) {
        return (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21))) ^ ((i >>> 25) | (i << 7));
    }

    private static int b(int i, int i2, int i3) {
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    private static int c(int i) {
        return (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14))) ^ (i >>> 3);
    }

    private static int d(int i) {
        return (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13))) ^ (i >>> 10);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        org.bouncycastle.f.g.a(this.b, bArr, i);
        org.bouncycastle.f.g.a(this.c, bArr, i + 4);
        org.bouncycastle.f.g.a(this.d, bArr, i + 8);
        org.bouncycastle.f.g.a(this.e, bArr, i + 12);
        org.bouncycastle.f.g.a(this.f, bArr, i + 16);
        org.bouncycastle.f.g.a(this.g, bArr, i + 20);
        org.bouncycastle.f.g.a(this.h, bArr, i + 24);
        org.bouncycastle.f.g.a(this.i, bArr, i + 28);
        c();
        return 32;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.b.b.h
    protected final void a(long j) {
        if (this.k > 14) {
            g();
        }
        this.j[14] = (int) (j >>> 32);
        this.j[15] = (int) ((-1) & j);
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        a((u) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 32;
    }

    @Override // org.bouncycastle.b.b.h
    protected final void b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.j[this.k] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        int i5 = this.k + 1;
        this.k = i5;
        if (i5 == 16) {
            g();
        }
    }

    @Override // org.bouncycastle.b.b.h, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.b = 1779033703;
        this.c = -1150833019;
        this.d = 1013904242;
        this.e = -1521486534;
        this.f = 1359893119;
        this.g = -1694144372;
        this.h = 528734635;
        this.i = 1541459225;
        this.k = 0;
        for (int i = 0; i != this.j.length; i++) {
            this.j[i] = 0;
        }
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new u(this);
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.j;
            iArr[i] = d(iArr[i - 2]) + this.j[i - 7] + c(this.j[i - 15]) + this.j[i - 16];
        }
        int iA = this.b;
        int iA2 = this.c;
        int iA3 = this.d;
        int iA4 = this.e;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        int i5 = this.i;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iB = i5 + b(i2) + a(i2, i3, i4) + a[i6] + this.j[i6];
            int i8 = iA4 + iB;
            int iA5 = iB + a(iA) + b(iA, iA2, iA3);
            int i9 = i6 + 1;
            int iB2 = i4 + b(i8) + a(i8, i2, i3) + a[i9] + this.j[i9];
            int i10 = iA3 + iB2;
            int iA6 = iB2 + a(iA5) + b(iA5, iA, iA2);
            int i11 = i9 + 1;
            int iB3 = i3 + b(i10) + a(i10, i8, i2) + a[i11] + this.j[i11];
            int i12 = iA2 + iB3;
            int iA7 = iB3 + a(iA6) + b(iA6, iA5, iA);
            int i13 = i11 + 1;
            int iB4 = i2 + b(i12) + a(i12, i10, i8) + a[i13] + this.j[i13];
            int i14 = iA + iB4;
            int iA8 = iB4 + a(iA7) + b(iA7, iA6, iA5);
            int i15 = i13 + 1;
            int iB5 = i8 + b(i14) + a(i14, i12, i10) + a[i15] + this.j[i15];
            i5 = iA5 + iB5;
            iA4 = iB5 + a(iA8) + b(iA8, iA7, iA6);
            int i16 = i15 + 1;
            int iB6 = i10 + b(i5) + a(i5, i14, i12) + a[i16] + this.j[i16];
            i4 = iA6 + iB6;
            iA3 = iB6 + a(iA4) + b(iA4, iA8, iA7);
            int i17 = i16 + 1;
            int iB7 = i12 + b(i4) + a(i4, i5, i14) + a[i17] + this.j[i17];
            i3 = iA7 + iB7;
            iA2 = iB7 + a(iA3) + b(iA3, iA4, iA8);
            int i18 = i17 + 1;
            int iB8 = i14 + b(i3) + a(i3, i4, i5) + a[i18] + this.j[i18];
            i2 = iA8 + iB8;
            iA = iB8 + a(iA2) + b(iA2, iA3, iA4);
            i6 = i18 + 1;
        }
        this.b += iA;
        this.c += iA2;
        this.d += iA3;
        this.e += iA4;
        this.f += i2;
        this.g += i3;
        this.h += i4;
        this.i += i5;
        this.k = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.j[i19] = 0;
        }
    }
}
