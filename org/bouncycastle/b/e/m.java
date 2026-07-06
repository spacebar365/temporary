package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class m extends au {
    public static void a(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int iA = iArr[4];
        int iA2 = iArr[5];
        int iA3 = iArr[6];
        int iA4 = iArr[7];
        int i6 = iArr[8];
        int i7 = iArr[9];
        int i8 = iArr[10];
        int i9 = iArr[11];
        int iA5 = iArr[12];
        int iA6 = iArr[13];
        int iA7 = iArr[14];
        int iA8 = iArr[15];
        while (i > 0) {
            int i10 = i2 + iA;
            int iA9 = a(iA5 ^ i10, 16);
            int i11 = i6 + iA9;
            int iA10 = a(iA ^ i11, 12);
            int i12 = i10 + iA10;
            int iA11 = a(iA9 ^ i12, 8);
            int i13 = i11 + iA11;
            int iA12 = a(iA10 ^ i13, 7);
            int i14 = i3 + iA2;
            int iA13 = a(iA6 ^ i14, 16);
            int i15 = i7 + iA13;
            int iA14 = a(iA2 ^ i15, 12);
            int i16 = i14 + iA14;
            int iA15 = a(iA13 ^ i16, 8);
            int i17 = i15 + iA15;
            int iA16 = a(iA14 ^ i17, 7);
            int i18 = i4 + iA3;
            int iA17 = a(iA7 ^ i18, 16);
            int i19 = i8 + iA17;
            int iA18 = a(iA3 ^ i19, 12);
            int i20 = i18 + iA18;
            int iA19 = a(iA17 ^ i20, 8);
            int i21 = i19 + iA19;
            int iA20 = a(iA18 ^ i21, 7);
            int i22 = i5 + iA4;
            int iA21 = a(iA8 ^ i22, 16);
            int i23 = i9 + iA21;
            int iA22 = a(iA4 ^ i23, 12);
            int i24 = i22 + iA22;
            int iA23 = a(iA21 ^ i24, 8);
            int i25 = i23 + iA23;
            int iA24 = a(iA22 ^ i25, 7);
            int i26 = i12 + iA16;
            int iA25 = a(iA23 ^ i26, 16);
            int i27 = i21 + iA25;
            int iA26 = a(iA16 ^ i27, 12);
            i2 = i26 + iA26;
            iA8 = a(iA25 ^ i2, 8);
            i8 = i27 + iA8;
            iA2 = a(iA26 ^ i8, 7);
            int i28 = i16 + iA20;
            int iA27 = a(iA11 ^ i28, 16);
            int i29 = i25 + iA27;
            int iA28 = a(iA20 ^ i29, 12);
            i3 = i28 + iA28;
            iA5 = a(iA27 ^ i3, 8);
            i9 = i29 + iA5;
            iA3 = a(iA28 ^ i9, 7);
            int i30 = i20 + iA24;
            int iA29 = a(iA15 ^ i30, 16);
            int i31 = i13 + iA29;
            int iA30 = a(iA24 ^ i31, 12);
            i4 = i30 + iA30;
            iA6 = a(iA29 ^ i4, 8);
            i6 = i31 + iA6;
            iA4 = a(iA30 ^ i6, 7);
            int i32 = i24 + iA12;
            int iA31 = a(iA19 ^ i32, 16);
            int i33 = i17 + iA31;
            int iA32 = a(iA12 ^ i33, 12);
            i5 = i32 + iA32;
            iA7 = a(iA31 ^ i5, 8);
            i7 = i33 + iA7;
            iA = a(iA32 ^ i7, 7);
            i -= 2;
        }
        iArr2[0] = i2 + iArr[0];
        iArr2[1] = i3 + iArr[1];
        iArr2[2] = i4 + iArr[2];
        iArr2[3] = i5 + iArr[3];
        iArr2[4] = iA + iArr[4];
        iArr2[5] = iA2 + iArr[5];
        iArr2[6] = iA3 + iArr[6];
        iArr2[7] = iA4 + iArr[7];
        iArr2[8] = i6 + iArr[8];
        iArr2[9] = i7 + iArr[9];
        iArr2[10] = i8 + iArr[10];
        iArr2[11] = i9 + iArr[11];
        iArr2[12] = iA5 + iArr[12];
        iArr2[13] = iA6 + iArr[13];
        iArr2[14] = iA7 + iArr[14];
        iArr2[15] = iA8 + iArr[15];
    }

    @Override // org.bouncycastle.b.e.au, org.bouncycastle.b.ao
    public final String a() {
        return "ChaCha" + this.c;
    }

    @Override // org.bouncycastle.b.e.au
    protected final void a(byte[] bArr) {
        a(this.c, this.d, this.e);
        org.bouncycastle.f.g.a(this.e, bArr, 0);
    }

    @Override // org.bouncycastle.b.e.au
    protected final void a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(a() + " requires 128 bit or 256 bit key");
            }
            a(bArr.length, this.d);
            org.bouncycastle.f.g.a(bArr, 0, this.d, 4, 4);
            org.bouncycastle.f.g.a(bArr, bArr.length - 16, this.d, 8, 4);
        }
        org.bouncycastle.f.g.a(bArr2, 0, this.d, 14, 2);
    }

    @Override // org.bouncycastle.b.e.au
    protected final void d() {
        int[] iArr = this.d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            int[] iArr2 = this.d;
            iArr2[13] = iArr2[13] + 1;
        }
    }

    @Override // org.bouncycastle.b.e.au
    protected final void e() {
        int[] iArr = this.d;
        this.d[13] = 0;
        iArr[12] = 0;
    }
}
