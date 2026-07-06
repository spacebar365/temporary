package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class w implements org.bouncycastle.b.e {
    private static final byte[] a = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, 33, -127, 28, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, 127, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, 112, 14, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, 50, 117, 25, 61, -1, 53, -118, 126, 109, 84, -58, -128, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, -80, -68, -36, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, 30, 0, 98, 68, 26, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};
    private static final byte[] b = {-91, 45, 50, -113, 14, 48, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, 112, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, 127, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, -68, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, 61, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, -128, -112, -48, 36, 52, -53, -19, -12, -50, -103, 16, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};
    private boolean g;
    private final byte[] c = {-108, 32, -123, 16, -62, -64, 1, -5, 1, -64, -62, 16, -123, 32, -108, 1};
    private int d = 32;
    private int e = this.d / 2;
    private byte[][] f = null;
    private byte[][] h = d();

    private byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = org.bouncycastle.f.a.a(bArr, bArr.length);
        b(bArrA, bArr2);
        a(bArrA);
        b(bArrA);
        return bArrA;
    }

    private void b(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            c(bArr);
        }
    }

    private static void b(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private void c(byte[] bArr) {
        byte bD = d(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = bD;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f == null) {
            throw new IllegalStateException("GOST3412_2015 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        b(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "GOST3412_2015";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    private static byte[][] d() {
        byte[][] bArr = new byte[256][];
        for (int i = 0; i < 256; i++) {
            bArr[i] = new byte[256];
            for (int i2 = 0; i2 < 256; i2++) {
                byte[] bArr2 = bArr[i];
                byte b2 = (byte) i;
                byte b3 = 0;
                byte b4 = 0;
                byte b5 = (byte) i2;
                while (b3 < 8 && b2 != 0 && b5 != 0) {
                    if ((b5 & 1) != 0) {
                        b4 = (byte) (b4 ^ b2);
                    }
                    byte b6 = (byte) (b2 << 1);
                    if (((byte) (b2 & 128)) != 0) {
                        b6 = (byte) (b6 ^ 195);
                    }
                    b5 = (byte) (b5 >> 1);
                    b3 = (byte) (b3 + 1);
                    b2 = b6;
                }
                bArr2[i2] = b4;
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            if (iVar != null) {
                throw new IllegalArgumentException("invalid parameter passed to GOST3412_2015 init - " + iVar.getClass().getName());
            }
            return;
        }
        this.g = z;
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        if (bArrA.length != this.d) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.f = new byte[10][];
        for (int i = 0; i < 10; i++) {
            this.f[i] = new byte[this.e];
        }
        byte[] bArr = new byte[this.e];
        byte[] bArr2 = new byte[this.e];
        for (int i2 = 0; i2 < this.e; i2++) {
            byte[] bArr3 = this.f[0];
            byte b2 = bArrA[i2];
            bArr[i2] = b2;
            bArr3[i2] = b2;
            byte[] bArr4 = this.f[1];
            byte b3 = bArrA[this.e + i2];
            bArr2[i2] = b3;
            bArr4[i2] = b3;
        }
        byte[] bArr5 = new byte[this.e];
        for (int i3 = 1; i3 < 5; i3++) {
            for (int i4 = 1; i4 <= 8; i4++) {
                org.bouncycastle.f.a.d(bArr5);
                bArr5[15] = (byte) (((i3 - 1) * 8) + i4);
                b(bArr5);
                byte[] bArrA2 = a(bArr5, bArr);
                b(bArrA2, bArr2);
                System.arraycopy(bArr, 0, bArr2, 0, this.e);
                System.arraycopy(bArrA2, 0, bArr, 0, this.e);
            }
            System.arraycopy(bArr, 0, this.f[i3 * 2], 0, this.e);
            System.arraycopy(bArr2, 0, this.f[(i3 * 2) + 1], 0, this.e);
        }
    }

    private void b(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArrA = new byte[16];
        System.arraycopy(bArr, i, bArrA, 0, 16);
        if (this.g) {
            for (int i3 = 0; i3 < 9; i3++) {
                bArrA = org.bouncycastle.f.a.a(a(this.f[i3], bArrA), 16);
            }
            b(bArrA, this.f[9]);
        } else {
            for (int i4 = 9; i4 > 0; i4--) {
                byte[] bArr3 = this.f[i4];
                byte[] bArrA2 = org.bouncycastle.f.a.a(bArr3, bArr3.length);
                b(bArrA2, bArrA);
                for (int i5 = 0; i5 < 16; i5++) {
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(bArrA2, 1, bArr4, 0, 15);
                    bArr4[15] = bArrA2[0];
                    byte bD = d(bArr4);
                    System.arraycopy(bArrA2, 1, bArrA2, 0, 15);
                    bArrA2[15] = bD;
                }
                for (int i6 = 0; i6 < bArrA2.length; i6++) {
                    bArrA2[i6] = b[bArrA2[i6] & 255];
                }
                bArrA = org.bouncycastle.f.a.a(bArrA2, 16);
            }
            b(bArrA, this.f[0]);
        }
        System.arraycopy(bArrA, 0, bArr2, i2, 16);
    }

    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = a[bArr[i] & 255];
        }
    }

    private byte d(byte[] bArr) {
        byte b2 = bArr[15];
        for (int i = 14; i >= 0; i--) {
            b2 = (byte) (b2 ^ this.h[bArr[i] & 255][this.c[i] & 255]);
        }
        return b2;
    }
}
