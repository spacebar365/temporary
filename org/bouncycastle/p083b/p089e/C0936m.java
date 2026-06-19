package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.e.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0936m extends C0912au {
    /* JADX INFO: renamed from: a */
    public static void m2346a(int i, int[] iArr, int[] iArr2) {
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
            int iA9 = m2223a(iA5 ^ i10, 16);
            int i11 = i6 + iA9;
            int iA10 = m2223a(iA ^ i11, 12);
            int i12 = i10 + iA10;
            int iA11 = m2223a(iA9 ^ i12, 8);
            int i13 = i11 + iA11;
            int iA12 = m2223a(iA10 ^ i13, 7);
            int i14 = i3 + iA2;
            int iA13 = m2223a(iA6 ^ i14, 16);
            int i15 = i7 + iA13;
            int iA14 = m2223a(iA2 ^ i15, 12);
            int i16 = i14 + iA14;
            int iA15 = m2223a(iA13 ^ i16, 8);
            int i17 = i15 + iA15;
            int iA16 = m2223a(iA14 ^ i17, 7);
            int i18 = i4 + iA3;
            int iA17 = m2223a(iA7 ^ i18, 16);
            int i19 = i8 + iA17;
            int iA18 = m2223a(iA3 ^ i19, 12);
            int i20 = i18 + iA18;
            int iA19 = m2223a(iA17 ^ i20, 8);
            int i21 = i19 + iA19;
            int iA20 = m2223a(iA18 ^ i21, 7);
            int i22 = i5 + iA4;
            int iA21 = m2223a(iA8 ^ i22, 16);
            int i23 = i9 + iA21;
            int iA22 = m2223a(iA4 ^ i23, 12);
            int i24 = i22 + iA22;
            int iA23 = m2223a(iA21 ^ i24, 8);
            int i25 = i23 + iA23;
            int iA24 = m2223a(iA22 ^ i25, 7);
            int i26 = i12 + iA16;
            int iA25 = m2223a(iA23 ^ i26, 16);
            int i27 = i21 + iA25;
            int iA26 = m2223a(iA16 ^ i27, 12);
            i2 = i26 + iA26;
            iA8 = m2223a(iA25 ^ i2, 8);
            i8 = i27 + iA8;
            iA2 = m2223a(iA26 ^ i8, 7);
            int i28 = i16 + iA20;
            int iA27 = m2223a(iA11 ^ i28, 16);
            int i29 = i25 + iA27;
            int iA28 = m2223a(iA20 ^ i29, 12);
            i3 = i28 + iA28;
            iA5 = m2223a(iA27 ^ i3, 8);
            i9 = i29 + iA5;
            iA3 = m2223a(iA28 ^ i9, 7);
            int i30 = i20 + iA24;
            int iA29 = m2223a(iA15 ^ i30, 16);
            int i31 = i13 + iA29;
            int iA30 = m2223a(iA24 ^ i31, 12);
            i4 = i30 + iA30;
            iA6 = m2223a(iA29 ^ i4, 8);
            i6 = i31 + iA6;
            iA4 = m2223a(iA30 ^ i6, 7);
            int i32 = i24 + iA12;
            int iA31 = m2223a(iA19 ^ i32, 16);
            int i33 = i17 + iA31;
            int iA32 = m2223a(iA12 ^ i33, 12);
            i5 = i32 + iA32;
            iA7 = m2223a(iA31 ^ i5, 8);
            i7 = i33 + iA7;
            iA = m2223a(iA32 ^ i7, 7);
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

    @Override // org.bouncycastle.p083b.p089e.C0912au, org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "ChaCha" + this.f3774c;
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: a */
    protected final void mo2226a(byte[] bArr) {
        m2346a(this.f3774c, this.f3775d, this.f3776e);
        AbstractC1556g.m4140a(this.f3776e, bArr, 0);
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: a */
    protected final void mo2227a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(mo1911a() + " requires 128 bit or 256 bit key");
            }
            m2224a(bArr.length, this.f3775d);
            AbstractC1556g.m4138a(bArr, 0, this.f3775d, 4, 4);
            AbstractC1556g.m4138a(bArr, bArr.length - 16, this.f3775d, 8, 4);
        }
        AbstractC1556g.m4138a(bArr2, 0, this.f3775d, 14, 2);
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: d */
    protected final void mo2229d() {
        int[] iArr = this.f3775d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            int[] iArr2 = this.f3775d;
            iArr2[13] = iArr2[13] + 1;
        }
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: e */
    protected final void mo2230e() {
        int[] iArr = this.f3775d;
        this.f3775d[13] = 0;
        iArr[12] = 0;
    }
}
