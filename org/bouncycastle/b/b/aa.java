package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends h {
    private static final int[] e = new int[64];
    private int[] a;
    private int[] b;
    private int c;
    private int[] d;

    static {
        for (int i = 0; i < 16; i++) {
            e[i] = (2043430169 << i) | (2043430169 >>> (32 - i));
        }
        for (int i2 = 16; i2 < 64; i2++) {
            int i3 = i2 % 32;
            e[i2] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public aa() {
        this.a = new int[8];
        this.b = new int[16];
        this.d = new int[68];
        c();
    }

    public aa(aa aaVar) {
        super(aaVar);
        this.a = new int[8];
        this.b = new int[16];
        this.d = new int[68];
        a(aaVar);
    }

    private static int a(int i) {
        return (((i << 9) | (i >>> 23)) ^ i) ^ ((i << 17) | (i >>> 15));
    }

    private static int a(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    private void a(aa aaVar) {
        System.arraycopy(aaVar.a, 0, this.a, 0, this.a.length);
        System.arraycopy(aaVar.b, 0, this.b, 0, this.b.length);
        this.c = aaVar.c;
    }

    private static int b(int i) {
        return (((i << 15) | (i >>> 17)) ^ i) ^ ((i << 23) | (i >>> 9));
    }

    private static int b(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "SM3";
    }

    @Override // org.bouncycastle.b.b.h
    protected final void a(long j) {
        if (this.c > 14) {
            this.b[this.c] = 0;
            this.c++;
            g();
        }
        while (this.c < 14) {
            this.b[this.c] = 0;
            this.c++;
        }
        int[] iArr = this.b;
        int i = this.c;
        this.c = i + 1;
        iArr[i] = (int) (j >>> 32);
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = (int) j;
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        aa aaVar = (aa) eVar;
        super.a((h) aaVar);
        a(aaVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 32;
    }

    @Override // org.bouncycastle.b.b.h
    protected final void b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.b[this.c] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        this.c++;
        if (this.c >= 16) {
            g();
        }
    }

    @Override // org.bouncycastle.b.b.h, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.a[0] = 1937774191;
        this.a[1] = 1226093241;
        this.a[2] = 388252375;
        this.a[3] = -628488704;
        this.a[4] = -1452330820;
        this.a[5] = 372324522;
        this.a[6] = -477237683;
        this.a[7] = -1325724082;
        this.c = 0;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new aa(this);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        for (int i2 : this.a) {
            org.bouncycastle.f.g.a(i2, bArr, i);
            i += 4;
        }
        c();
        return 32;
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        for (int i = 0; i < 16; i++) {
            this.d[i] = this.b[i];
        }
        for (int i2 = 16; i2 < 68; i2++) {
            int i3 = this.d[i2 - 3];
            int i4 = this.d[i2 - 13];
            int i5 = (i4 >>> 25) | (i4 << 7);
            int[] iArr = this.d;
            iArr[i2] = (b(((i3 >>> 17) | (i3 << 15)) ^ (iArr[i2 - 16] ^ this.d[i2 - 9])) ^ i5) ^ this.d[i2 - 6];
        }
        int i6 = this.a[0];
        int i7 = this.a[1];
        int i8 = this.a[2];
        int i9 = this.a[3];
        int i10 = this.a[4];
        int i11 = this.a[5];
        int i12 = this.a[6];
        int i13 = this.a[7];
        int i14 = 0;
        while (i14 < 16) {
            int i15 = (i6 << 12) | (i6 >>> 20);
            int i16 = i15 + i10 + e[i14];
            int i17 = (i16 >>> 25) | (i16 << 7);
            int i18 = this.d[i14];
            int i19 = (this.d[i14 + 4] ^ i18) + (i15 ^ i17) + i9 + ((i6 ^ i7) ^ i8);
            int i20 = i13 + ((i10 ^ i11) ^ i12) + i17 + i18;
            int i21 = (i7 << 9) | (i7 >>> 23);
            int i22 = (i11 << 19) | (i11 >>> 13);
            int iA = a(i20);
            i14++;
            i13 = i12;
            i11 = i10;
            i9 = i8;
            i7 = i6;
            i12 = i22;
            i8 = i21;
            i10 = iA;
            i6 = i19;
        }
        int i23 = 16;
        int i24 = i11;
        int i25 = i9;
        int i26 = i7;
        while (i23 < 64) {
            int i27 = (i6 << 12) | (i6 >>> 20);
            int i28 = i27 + i10 + e[i23];
            int i29 = (i28 >>> 25) | (i28 << 7);
            int i30 = this.d[i23];
            int iA2 = (this.d[i23 + 4] ^ i30) + (i27 ^ i29) + i25 + a(i6, i26, i8);
            int iB = i13 + b(i10, i24, i12) + i29 + i30;
            int i31 = (i26 << 9) | (i26 >>> 23);
            int i32 = (i24 << 19) | (i24 >>> 13);
            int iA3 = a(iB);
            i23++;
            i13 = i12;
            i24 = i10;
            i25 = i8;
            i26 = i6;
            i12 = i32;
            i8 = i31;
            i10 = iA3;
            i6 = iA2;
        }
        int[] iArr2 = this.a;
        iArr2[0] = iArr2[0] ^ i6;
        int[] iArr3 = this.a;
        iArr3[1] = iArr3[1] ^ i26;
        int[] iArr4 = this.a;
        iArr4[2] = iArr4[2] ^ i8;
        int[] iArr5 = this.a;
        iArr5[3] = iArr5[3] ^ i25;
        int[] iArr6 = this.a;
        iArr6[4] = i10 ^ iArr6[4];
        int[] iArr7 = this.a;
        iArr7[5] = i24 ^ iArr7[5];
        int[] iArr8 = this.a;
        iArr8[6] = i12 ^ iArr8[6];
        int[] iArr9 = this.a;
        iArr9[7] = i13 ^ iArr9[7];
        this.c = 0;
    }
}
