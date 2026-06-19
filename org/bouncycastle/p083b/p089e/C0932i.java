package org.bouncycastle.p083b.p089e;

/* JADX INFO: renamed from: org.bouncycastle.b.e.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0932i extends C0931h {

    /* JADX INFO: renamed from: c */
    protected int[] f3868c = new int[48];

    /* JADX INFO: renamed from: d */
    protected int[] f3869d = new int[48];

    /* JADX INFO: renamed from: e */
    protected int[] f3870e = new int[192];

    /* JADX INFO: renamed from: f */
    protected int[] f3871f = new int[192];

    /* JADX INFO: renamed from: g */
    private int[] f3872g = new int[8];

    @Override // org.bouncycastle.p083b.p089e.C0931h, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "CAST6";
    }

    @Override // org.bouncycastle.p083b.p089e.C0931h
    /* JADX INFO: renamed from: a */
    protected final void mo2330a(byte[] bArr) {
        int i = 1518500249;
        int i2 = 19;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                this.f3871f[(i3 * 8) + i4] = i;
                i += 1859775393;
                this.f3870e[(i3 * 8) + i4] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i5 = 0; i5 < 8; i5++) {
            this.f3872g[i5] = m2324a(bArr2, i5 * 4);
        }
        for (int i6 = 0; i6 < 12; i6++) {
            int i7 = i6 * 2 * 8;
            int[] iArr = this.f3872g;
            iArr[6] = iArr[6] ^ m2323a(this.f3872g[7], this.f3871f[i7], this.f3870e[i7]);
            int[] iArr2 = this.f3872g;
            iArr2[5] = iArr2[5] ^ m2328b(this.f3872g[6], this.f3871f[i7 + 1], this.f3870e[i7 + 1]);
            int[] iArr3 = this.f3872g;
            iArr3[4] = iArr3[4] ^ m2329c(this.f3872g[5], this.f3871f[i7 + 2], this.f3870e[i7 + 2]);
            int[] iArr4 = this.f3872g;
            iArr4[3] = iArr4[3] ^ m2323a(this.f3872g[4], this.f3871f[i7 + 3], this.f3870e[i7 + 3]);
            int[] iArr5 = this.f3872g;
            iArr5[2] = iArr5[2] ^ m2328b(this.f3872g[3], this.f3871f[i7 + 4], this.f3870e[i7 + 4]);
            int[] iArr6 = this.f3872g;
            iArr6[1] = iArr6[1] ^ m2329c(this.f3872g[2], this.f3871f[i7 + 5], this.f3870e[i7 + 5]);
            int[] iArr7 = this.f3872g;
            iArr7[0] = iArr7[0] ^ m2323a(this.f3872g[1], this.f3871f[i7 + 6], this.f3870e[i7 + 6]);
            int[] iArr8 = this.f3872g;
            iArr8[7] = m2328b(this.f3872g[0], this.f3871f[i7 + 7], this.f3870e[i7 + 7]) ^ iArr8[7];
            int i8 = ((i6 * 2) + 1) * 8;
            int[] iArr9 = this.f3872g;
            iArr9[6] = iArr9[6] ^ m2323a(this.f3872g[7], this.f3871f[i8], this.f3870e[i8]);
            int[] iArr10 = this.f3872g;
            iArr10[5] = iArr10[5] ^ m2328b(this.f3872g[6], this.f3871f[i8 + 1], this.f3870e[i8 + 1]);
            int[] iArr11 = this.f3872g;
            iArr11[4] = iArr11[4] ^ m2329c(this.f3872g[5], this.f3871f[i8 + 2], this.f3870e[i8 + 2]);
            int[] iArr12 = this.f3872g;
            iArr12[3] = iArr12[3] ^ m2323a(this.f3872g[4], this.f3871f[i8 + 3], this.f3870e[i8 + 3]);
            int[] iArr13 = this.f3872g;
            iArr13[2] = iArr13[2] ^ m2328b(this.f3872g[3], this.f3871f[i8 + 4], this.f3870e[i8 + 4]);
            int[] iArr14 = this.f3872g;
            iArr14[1] = iArr14[1] ^ m2329c(this.f3872g[2], this.f3871f[i8 + 5], this.f3870e[i8 + 5]);
            int[] iArr15 = this.f3872g;
            iArr15[0] = iArr15[0] ^ m2323a(this.f3872g[1], this.f3871f[i8 + 6], this.f3870e[i8 + 6]);
            int[] iArr16 = this.f3872g;
            iArr16[7] = m2328b(this.f3872g[0], this.f3871f[i8 + 7], this.f3870e[i8 + 7]) ^ iArr16[7];
            this.f3868c[i6 * 4] = this.f3872g[0] & 31;
            this.f3868c[(i6 * 4) + 1] = this.f3872g[2] & 31;
            this.f3868c[(i6 * 4) + 2] = this.f3872g[4] & 31;
            this.f3868c[(i6 * 4) + 3] = this.f3872g[6] & 31;
            this.f3869d[i6 * 4] = this.f3872g[7];
            this.f3869d[(i6 * 4) + 1] = this.f3872g[5];
            this.f3869d[(i6 * 4) + 2] = this.f3872g[3];
            this.f3869d[(i6 * 4) + 3] = this.f3872g[1];
        }
    }

    @Override // org.bouncycastle.p083b.p089e.C0931h, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.p089e.C0931h, org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    @Override // org.bouncycastle.p083b.p089e.C0931h
    /* JADX INFO: renamed from: b */
    protected final int mo2331b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        int iA = m2324a(bArr, i);
        int iA2 = m2324a(bArr, i + 4);
        int iA3 = m2324a(bArr, i + 8);
        int iA4 = m2324a(bArr, i + 12);
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = i3 * 4;
            iA3 ^= m2323a(iA4, this.f3869d[i4], this.f3868c[i4]);
            iA2 ^= m2328b(iA3, this.f3869d[i4 + 1], this.f3868c[i4 + 1]);
            iA ^= m2329c(iA2, this.f3869d[i4 + 2], this.f3868c[i4 + 2]);
            iA4 ^= m2323a(iA, this.f3869d[i4 + 3], this.f3868c[i4 + 3]);
        }
        for (int i5 = 6; i5 < 12; i5++) {
            int i6 = i5 * 4;
            iA4 ^= m2323a(iA, this.f3869d[i6 + 3], this.f3868c[i6 + 3]);
            iA ^= m2329c(iA2, this.f3869d[i6 + 2], this.f3868c[i6 + 2]);
            iA2 ^= m2328b(iA3, this.f3869d[i6 + 1], this.f3868c[i6 + 1]);
            iA3 ^= m2323a(iA4, this.f3869d[i6], this.f3868c[i6]);
        }
        iArr[0] = iA;
        iArr[1] = iA2;
        iArr[2] = iA3;
        iArr[3] = iA4;
        m2326a(iArr[0], bArr2, i2);
        m2326a(iArr[1], bArr2, i2 + 4);
        m2326a(iArr[2], bArr2, i2 + 8);
        m2326a(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.p083b.p089e.C0931h
    /* JADX INFO: renamed from: c */
    protected final int mo2332c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        int iA = m2324a(bArr, i);
        int iA2 = m2324a(bArr, i + 4);
        int iA3 = m2324a(bArr, i + 8);
        int iA4 = m2324a(bArr, i + 12);
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = (11 - i3) * 4;
            iA3 ^= m2323a(iA4, this.f3869d[i4], this.f3868c[i4]);
            iA2 ^= m2328b(iA3, this.f3869d[i4 + 1], this.f3868c[i4 + 1]);
            iA ^= m2329c(iA2, this.f3869d[i4 + 2], this.f3868c[i4 + 2]);
            iA4 ^= m2323a(iA, this.f3869d[i4 + 3], this.f3868c[i4 + 3]);
        }
        for (int i5 = 6; i5 < 12; i5++) {
            int i6 = (11 - i5) * 4;
            iA4 ^= m2323a(iA, this.f3869d[i6 + 3], this.f3868c[i6 + 3]);
            iA ^= m2329c(iA2, this.f3869d[i6 + 2], this.f3868c[i6 + 2]);
            iA2 ^= m2328b(iA3, this.f3869d[i6 + 1], this.f3868c[i6 + 1]);
            iA3 ^= m2323a(iA4, this.f3869d[i6], this.f3868c[i6]);
        }
        iArr[0] = iA;
        iArr[1] = iA2;
        iArr[2] = iA3;
        iArr[3] = iA4;
        m2326a(iArr[0], bArr2, i2);
        m2326a(iArr[1], bArr2, i2 + 4);
        m2326a(iArr[2], bArr2, i2 + 8);
        m2326a(iArr[3], bArr2, i2 + 12);
        return 16;
    }
}
