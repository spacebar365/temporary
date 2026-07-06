package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class ab implements org.bouncycastle.b.e {
    private int[] a = null;

    private static int a(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        int i5 = i;
        while (i3 != 1) {
            int i6 = i5 / i3;
            i5 %= i3;
            int i7 = (i4 + (i6 * i2)) & 65535;
            if (i5 == 1) {
                return i7;
            }
            int i8 = i3 / i5;
            i3 %= i5;
            i2 = (i2 + (i8 * i7)) & 65535;
            i4 = i7;
        }
        return (1 - i2) & 65535;
    }

    private static int a(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 < i6 ? 1 : 0) + (i5 - i6);
        }
        return i3 & 65535;
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    private static void a(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 2);
        int iA3 = a(bArr, i + 4);
        int iA4 = a(bArr, i + 6);
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i4 >= 8) {
                int i6 = i5 + 1;
                a(a(iA, iArr[i5]), bArr2, i2);
                int i7 = i6 + 1;
                a(iArr[i6] + iA3, bArr2, i2 + 2);
                a(iArr[i7] + iA2, bArr2, i2 + 4);
                a(a(iA4, iArr[i7 + 1]), bArr2, i2 + 6);
                return;
            }
            int i8 = i5 + 1;
            int iA5 = a(iA, iArr[i5]);
            int i9 = i8 + 1;
            int i10 = (iArr[i8] + iA2) & 65535;
            int i11 = i9 + 1;
            int i12 = (iA3 + iArr[i9]) & 65535;
            int i13 = i11 + 1;
            int iA6 = a(iA4, iArr[i11]);
            int i14 = i13 + 1;
            int iA7 = a(i12 ^ iA5, iArr[i13]);
            i3 = i14 + 1;
            int iA8 = a(((i10 ^ iA6) + iA7) & 65535, iArr[i14]);
            int i15 = (iA7 + iA8) & 65535;
            iA = iA5 ^ iA8;
            iA4 = iA6 ^ i15;
            iA2 = iA8 ^ i12;
            iA3 = i15 ^ i10;
            i4++;
        }
    }

    private static int[] a(byte[] bArr) {
        int[] iArr = new int[52];
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        for (int i = 0; i < 8; i++) {
            iArr[i] = a(bArr, i * 2);
        }
        for (int i2 = 8; i2 < 52; i2++) {
            if ((i2 & 7) < 6) {
                iArr[i2] = (((iArr[i2 - 7] & 127) << 9) | (iArr[i2 - 6] >> 7)) & 65535;
            } else if ((i2 & 7) == 6) {
                iArr[i2] = (((iArr[i2 - 7] & 127) << 9) | (iArr[i2 - 14] >> 7)) & 65535;
            } else {
                iArr[i2] = (((iArr[i2 - 15] & 127) << 9) | (iArr[i2 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.a == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        a(this.a, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "IDEA";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        int[] iArrA;
        int i = 48;
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + iVar.getClass().getName());
        }
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        if (z) {
            iArrA = a(bArrA);
        } else {
            int[] iArrA2 = a(bArrA);
            iArrA = new int[52];
            int iA = a(iArrA2[0]);
            int i2 = (0 - iArrA2[1]) & 65535;
            int i3 = (0 - iArrA2[2]) & 65535;
            int i4 = 4;
            iArrA[51] = a(iArrA2[3]);
            iArrA[50] = i3;
            iArrA[49] = i2;
            iArrA[48] = iA;
            for (int i5 = 1; i5 < 8; i5++) {
                int i6 = i4 + 1;
                int i7 = iArrA2[i4];
                int i8 = i6 + 1;
                int i9 = i - 1;
                iArrA[i9] = iArrA2[i6];
                int i10 = i9 - 1;
                iArrA[i10] = i7;
                int i11 = i8 + 1;
                int iA2 = a(iArrA2[i8]);
                int i12 = i11 + 1;
                int i13 = (0 - iArrA2[i11]) & 65535;
                int i14 = i12 + 1;
                int i15 = (0 - iArrA2[i12]) & 65535;
                i4 = i14 + 1;
                int i16 = i10 - 1;
                iArrA[i16] = a(iArrA2[i14]);
                int i17 = i16 - 1;
                iArrA[i17] = i13;
                int i18 = i17 - 1;
                iArrA[i18] = i15;
                i = i18 - 1;
                iArrA[i] = iA2;
            }
            int i19 = i4 + 1;
            int i20 = iArrA2[i4];
            int i21 = i19 + 1;
            int i22 = i - 1;
            iArrA[i22] = iArrA2[i19];
            int i23 = i22 - 1;
            iArrA[i23] = i20;
            int i24 = i21 + 1;
            int iA3 = a(iArrA2[i21]);
            int i25 = i24 + 1;
            int i26 = (0 - iArrA2[i24]) & 65535;
            int i27 = i25 + 1;
            int i28 = (0 - iArrA2[i25]) & 65535;
            int i29 = i23 - 1;
            iArrA[i29] = a(iArrA2[i27]);
            int i30 = i29 - 1;
            iArrA[i30] = i28;
            int i31 = i30 - 1;
            iArrA[i31] = i26;
            iArrA[i31 - 1] = iA3;
        }
        this.a = iArrA;
    }
}
