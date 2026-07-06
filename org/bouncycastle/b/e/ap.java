package org.bouncycastle.b.e;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class ap implements org.bouncycastle.b.e {
    private int h;
    private long i;
    private int j;
    private int k;
    private long[][] l;
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private byte[] r;
    private byte[] s;
    private static final byte[] c = {0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, -32, 14, 52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, 33, 15, -31, 36, 18, -16, -126, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 61, -70, 43, 121, 10, 21, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, -53, 95, -80, -100, -87, 81, -96, 127, 12, -10, 111, 23, -60, 73, -20, -40, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, -68, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, 13, 99, -116, -128, -64, -9, 112, 7};
    private static final byte[] d = {0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, 127, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, -128, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, 127, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, -128, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1};
    private static final byte[] e = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] f = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] g = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    static byte[][] a = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};
    static byte[][] b = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};

    public ap() {
        this((byte) 0);
    }

    private ap(byte b2) {
        this.h = 32;
        this.i = 4294967295L;
        this.r = a[0];
        this.s = b[0];
        this.k = 128;
    }

    private static byte a(int i) {
        if (i != 0) {
            return d[(c[i] & 255) + 25];
        }
        return (byte) 0;
    }

    private long a(long j, int i) {
        return ((j >>> i) | (j << (this.h - i))) & this.i;
    }

    private long a(long j, byte[] bArr) {
        long j2 = 0;
        for (int i = 0; i < this.h; i += 8) {
            j2 |= ((long) (bArr[(int) ((j >> i) & 255)] & 255)) << i;
        }
        return j2;
    }

    private void a(byte[] bArr) {
        this.n = a(this.n, bArr[1]);
        this.o = a(this.o, bArr[2]);
        this.p = a(this.p, bArr[3]);
    }

    private void a(byte[] bArr, int i) {
        this.m = bArr[i] & 255;
        this.n = bArr[r0] & 255;
        this.o = bArr[r1] & 255;
        int i2 = i + 1 + 1 + 1 + 1;
        this.p = bArr[r0] & 255;
        for (int i3 = 8; i3 != this.h; i3 += 8) {
            int i4 = i2 + 1;
            this.m |= ((long) (bArr[i2] & 255)) << i3;
            int i5 = i4 + 1;
            this.n |= ((long) (bArr[i4] & 255)) << i3;
            int i6 = i5 + 1;
            this.o |= ((long) (bArr[i5] & 255)) << i3;
            i2 = i6 + 1;
            this.p |= ((long) (bArr[i6] & 255)) << i3;
        }
    }

    private void a(long[] jArr) {
        this.m ^= jArr[0];
        this.n ^= jArr[1];
        this.o ^= jArr[2];
        this.p ^= jArr[3];
    }

    private static byte b(int i) {
        if (i != 0) {
            return d[(c[i] & 255) + 1];
        }
        return (byte) 0;
    }

    private void b(byte[] bArr) {
        this.m = a(this.m, bArr);
        this.n = a(this.n, bArr);
        this.o = a(this.o, bArr);
        this.p = a(this.p, bArr);
    }

    private void b(byte[] bArr, int i) {
        for (int i2 = 0; i2 != this.h; i2 += 8) {
            int i3 = i + 1;
            bArr[i] = (byte) (this.m >> i2);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (this.n >> i2);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (this.o >> i2);
            i = i5 + 1;
            bArr[i5] = (byte) (this.p >> i2);
        }
    }

    private static byte c(int i) {
        if (i >= 0) {
            return d[i + 199];
        }
        return (byte) 0;
    }

    private static byte d(int i) {
        if (i >= 0) {
            return d[i + 104];
        }
        return (byte) 0;
    }

    private static byte e(int i) {
        if (i >= 0) {
            return d[i + 238];
        }
        return (byte) 0;
    }

    private static byte f(int i) {
        if (i >= 0) {
            return d[i + 223];
        }
        return (byte) 0;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.l == null) {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        if ((this.h / 2) + i > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if ((this.h / 2) + i2 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        if (this.q) {
            a(bArr, i);
            a(this.l);
            b(bArr2, i2);
        } else {
            a(bArr, i);
            b(this.l);
            b(bArr2, i2);
        }
        return this.h / 2;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "Rijndael";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.h / 2;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        int i;
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + iVar.getClass().getName());
        }
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        int length = bArrA.length * 8;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, 4);
        switch (length) {
            case 128:
                i = 4;
                break;
            case 160:
                i = 5;
                break;
            case 192:
                i = 6;
                break;
            case 224:
                i = 7;
                break;
            case 256:
                i = 8;
                break;
            default:
                throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
        }
        if (length >= this.k) {
            this.j = i + 6;
        } else {
            this.j = (this.h / 8) + 6;
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < bArrA.length) {
            bArr[i3 % 4][i3 / 4] = bArrA[i2];
            i3++;
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i && i4 < (this.j + 1) * (this.h / 8); i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                long[] jArr2 = jArr[i4 / (this.h / 8)];
                jArr2[i6] = jArr2[i6] | (((long) (bArr[i6][i5] & 255)) << ((i4 * 8) % this.h));
            }
            i4++;
        }
        int i7 = 0;
        int i8 = i4;
        while (i8 < (this.j + 1) * (this.h / 8)) {
            for (int i9 = 0; i9 < 4; i9++) {
                byte[] bArr2 = bArr[i9];
                bArr2[0] = (byte) (bArr2[0] ^ e[bArr[(i9 + 1) % 4][i - 1] & 255]);
            }
            byte[] bArr3 = bArr[0];
            int i10 = i7 + 1;
            bArr3[0] = (byte) (g[i7] ^ bArr3[0]);
            if (i <= 6) {
                for (int i11 = 1; i11 < i; i11++) {
                    for (int i12 = 0; i12 < 4; i12++) {
                        byte[] bArr4 = bArr[i12];
                        bArr4[i11] = (byte) (bArr4[i11] ^ bArr[i12][i11 - 1]);
                    }
                }
            } else {
                int i13 = 1;
                while (true) {
                    int i14 = i13;
                    if (i14 < 4) {
                        for (int i15 = 0; i15 < 4; i15++) {
                            byte[] bArr5 = bArr[i15];
                            bArr5[i14] = (byte) (bArr5[i14] ^ bArr[i15][i14 - 1]);
                        }
                        i13 = i14 + 1;
                    } else {
                        for (int i16 = 0; i16 < 4; i16++) {
                            byte[] bArr6 = bArr[i16];
                            bArr6[4] = (byte) (bArr6[4] ^ e[bArr[i16][3] & 255]);
                        }
                        for (int i17 = 5; i17 < i; i17++) {
                            for (int i18 = 0; i18 < 4; i18++) {
                                byte[] bArr7 = bArr[i18];
                                bArr7[i17] = (byte) (bArr7[i17] ^ bArr[i18][i17 - 1]);
                            }
                        }
                    }
                }
            }
            for (int i19 = 0; i19 < i && i8 < (this.j + 1) * (this.h / 8); i19++) {
                for (int i20 = 0; i20 < 4; i20++) {
                    long[] jArr3 = jArr[i8 / (this.h / 8)];
                    jArr3[i20] = jArr3[i20] | (((long) (bArr[i20][i19] & 255)) << ((i8 * 8) % this.h));
                }
                i8++;
            }
            i7 = i10;
        }
        this.l = jArr;
        this.q = z;
    }

    private void a(long[][] jArr) {
        a(jArr[0]);
        for (int i = 1; i < this.j; i++) {
            b(e);
            a(this.r);
            int i2 = 0;
            long jA = 0;
            long j = 0;
            long jA2 = 0;
            long jA3 = 0;
            while (i2 < this.h) {
                int i3 = (int) ((this.m >> i2) & 255);
                int i4 = (int) ((this.n >> i2) & 255);
                int i5 = (int) ((this.o >> i2) & 255);
                int i6 = (int) ((this.p >> i2) & 255);
                jA3 |= ((long) ((((a(i3) ^ b(i4)) ^ i5) ^ i6) & 255)) << i2;
                jA2 |= ((long) ((((a(i4) ^ b(i5)) ^ i6) ^ i3) & 255)) << i2;
                long jA4 = (((long) ((((a(i5) ^ b(i6)) ^ i3) ^ i4) & 255)) << i2) | j;
                jA |= ((long) ((((a(i6) ^ b(i3)) ^ i4) ^ i5) & 255)) << i2;
                i2 += 8;
                j = jA4;
            }
            this.m = jA3;
            this.n = jA2;
            this.o = j;
            this.p = jA;
            a(jArr[i]);
        }
        b(e);
        a(this.r);
        a(jArr[this.j]);
    }

    private void b(long[][] jArr) {
        a(jArr[this.j]);
        b(f);
        a(this.s);
        for (int i = this.j - 1; i > 0; i--) {
            a(jArr[i]);
            int i2 = 0;
            long jF = 0;
            long j = 0;
            long jF2 = 0;
            long jF3 = 0;
            while (i2 < this.h) {
                int i3 = (int) ((this.m >> i2) & 255);
                int i4 = (int) ((this.n >> i2) & 255);
                int i5 = (int) ((this.o >> i2) & 255);
                int i6 = (int) ((this.p >> i2) & 255);
                int i7 = i3 != 0 ? c[i3 & 255] & 255 : -1;
                int i8 = i4 != 0 ? c[i4 & 255] & 255 : -1;
                int i9 = i5 != 0 ? c[i5 & 255] & 255 : -1;
                int i10 = i6 != 0 ? c[i6 & 255] & 255 : -1;
                jF3 |= ((long) ((((f(i7) ^ d(i8)) ^ e(i9)) ^ c(i10)) & 255)) << i2;
                jF2 |= ((long) ((((f(i8) ^ d(i9)) ^ e(i10)) ^ c(i7)) & 255)) << i2;
                long jF4 = (((long) ((((f(i9) ^ d(i10)) ^ e(i7)) ^ c(i8)) & 255)) << i2) | j;
                jF |= ((long) ((((f(i10) ^ d(i7)) ^ e(i8)) ^ c(i9)) & 255)) << i2;
                i2 += 8;
                j = jF4;
            }
            this.m = jF3;
            this.n = jF2;
            this.o = j;
            this.p = jF;
            b(f);
            a(this.s);
        }
        a(jArr[0]);
    }
}
