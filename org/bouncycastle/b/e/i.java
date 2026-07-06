package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {
    protected int[] c = new int[48];
    protected int[] d = new int[48];
    protected int[] e = new int[192];
    protected int[] f = new int[192];
    private int[] g = new int[8];

    @Override // org.bouncycastle.b.e.h, org.bouncycastle.b.e
    public final String a() {
        return "CAST6";
    }

    @Override // org.bouncycastle.b.e.h
    protected final void a(byte[] bArr) {
        int i = 1518500249;
        int i2 = 19;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                this.f[(i3 * 8) + i4] = i;
                i += 1859775393;
                this.e[(i3 * 8) + i4] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i5 = 0; i5 < 8; i5++) {
            this.g[i5] = a(bArr2, i5 * 4);
        }
        for (int i6 = 0; i6 < 12; i6++) {
            int i7 = i6 * 2 * 8;
            int[] iArr = this.g;
            iArr[6] = iArr[6] ^ a(this.g[7], this.f[i7], this.e[i7]);
            int[] iArr2 = this.g;
            iArr2[5] = iArr2[5] ^ b(this.g[6], this.f[i7 + 1], this.e[i7 + 1]);
            int[] iArr3 = this.g;
            iArr3[4] = iArr3[4] ^ c(this.g[5], this.f[i7 + 2], this.e[i7 + 2]);
            int[] iArr4 = this.g;
            iArr4[3] = iArr4[3] ^ a(this.g[4], this.f[i7 + 3], this.e[i7 + 3]);
            int[] iArr5 = this.g;
            iArr5[2] = iArr5[2] ^ b(this.g[3], this.f[i7 + 4], this.e[i7 + 4]);
            int[] iArr6 = this.g;
            iArr6[1] = iArr6[1] ^ c(this.g[2], this.f[i7 + 5], this.e[i7 + 5]);
            int[] iArr7 = this.g;
            iArr7[0] = iArr7[0] ^ a(this.g[1], this.f[i7 + 6], this.e[i7 + 6]);
            int[] iArr8 = this.g;
            iArr8[7] = b(this.g[0], this.f[i7 + 7], this.e[i7 + 7]) ^ iArr8[7];
            int i8 = ((i6 * 2) + 1) * 8;
            int[] iArr9 = this.g;
            iArr9[6] = iArr9[6] ^ a(this.g[7], this.f[i8], this.e[i8]);
            int[] iArr10 = this.g;
            iArr10[5] = iArr10[5] ^ b(this.g[6], this.f[i8 + 1], this.e[i8 + 1]);
            int[] iArr11 = this.g;
            iArr11[4] = iArr11[4] ^ c(this.g[5], this.f[i8 + 2], this.e[i8 + 2]);
            int[] iArr12 = this.g;
            iArr12[3] = iArr12[3] ^ a(this.g[4], this.f[i8 + 3], this.e[i8 + 3]);
            int[] iArr13 = this.g;
            iArr13[2] = iArr13[2] ^ b(this.g[3], this.f[i8 + 4], this.e[i8 + 4]);
            int[] iArr14 = this.g;
            iArr14[1] = iArr14[1] ^ c(this.g[2], this.f[i8 + 5], this.e[i8 + 5]);
            int[] iArr15 = this.g;
            iArr15[0] = iArr15[0] ^ a(this.g[1], this.f[i8 + 6], this.e[i8 + 6]);
            int[] iArr16 = this.g;
            iArr16[7] = b(this.g[0], this.f[i8 + 7], this.e[i8 + 7]) ^ iArr16[7];
            this.c[i6 * 4] = this.g[0] & 31;
            this.c[(i6 * 4) + 1] = this.g[2] & 31;
            this.c[(i6 * 4) + 2] = this.g[4] & 31;
            this.c[(i6 * 4) + 3] = this.g[6] & 31;
            this.d[i6 * 4] = this.g[7];
            this.d[(i6 * 4) + 1] = this.g[5];
            this.d[(i6 * 4) + 2] = this.g[3];
            this.d[(i6 * 4) + 3] = this.g[1];
        }
    }

    @Override // org.bouncycastle.b.e.h, org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e.h, org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e.h
    protected final int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        int iA3 = a(bArr, i + 8);
        int iA4 = a(bArr, i + 12);
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = i3 * 4;
            iA3 ^= a(iA4, this.d[i4], this.c[i4]);
            iA2 ^= b(iA3, this.d[i4 + 1], this.c[i4 + 1]);
            iA ^= c(iA2, this.d[i4 + 2], this.c[i4 + 2]);
            iA4 ^= a(iA, this.d[i4 + 3], this.c[i4 + 3]);
        }
        for (int i5 = 6; i5 < 12; i5++) {
            int i6 = i5 * 4;
            iA4 ^= a(iA, this.d[i6 + 3], this.c[i6 + 3]);
            iA ^= c(iA2, this.d[i6 + 2], this.c[i6 + 2]);
            iA2 ^= b(iA3, this.d[i6 + 1], this.c[i6 + 1]);
            iA3 ^= a(iA4, this.d[i6], this.c[i6]);
        }
        iArr[0] = iA;
        iArr[1] = iA2;
        iArr[2] = iA3;
        iArr[3] = iA4;
        a(iArr[0], bArr2, i2);
        a(iArr[1], bArr2, i2 + 4);
        a(iArr[2], bArr2, i2 + 8);
        a(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.b.e.h
    protected final int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        int iA3 = a(bArr, i + 8);
        int iA4 = a(bArr, i + 12);
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = (11 - i3) * 4;
            iA3 ^= a(iA4, this.d[i4], this.c[i4]);
            iA2 ^= b(iA3, this.d[i4 + 1], this.c[i4 + 1]);
            iA ^= c(iA2, this.d[i4 + 2], this.c[i4 + 2]);
            iA4 ^= a(iA, this.d[i4 + 3], this.c[i4 + 3]);
        }
        for (int i5 = 6; i5 < 12; i5++) {
            int i6 = (11 - i5) * 4;
            iA4 ^= a(iA, this.d[i6 + 3], this.c[i6 + 3]);
            iA ^= c(iA2, this.d[i6 + 2], this.c[i6 + 2]);
            iA2 ^= b(iA3, this.d[i6 + 1], this.c[i6 + 1]);
            iA3 ^= a(iA4, this.d[i6], this.c[i6]);
        }
        iArr[0] = iA;
        iArr[1] = iA2;
        iArr[2] = iA3;
        iArr[3] = iA4;
        a(iArr[0], bArr2, i2);
        a(iArr[1], bArr2, i2 + 4);
        a(iArr[2], bArr2, i2 + 8);
        a(iArr[3], bArr2, i2 + 12);
        return 16;
    }
}
