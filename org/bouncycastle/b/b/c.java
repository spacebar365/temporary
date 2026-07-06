package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    private static final byte[] k = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, -68, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};
    private static final byte[] l = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, -68, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, 127, -118, 39, -57, -64, 41, -41};
    private static final byte[] m = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, -68, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] n = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, -68, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, 97};
    private int a;
    private int b;
    private int c;
    private int d;
    private long[] e;
    private long[] f;
    private long[] g;
    private long h;
    private int i;
    private byte[] j;

    public c(int i) {
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.a = i >>> 3;
        if (i > 256) {
            this.c = 16;
            this.d = 14;
        } else {
            this.c = 8;
            this.d = 10;
        }
        this.b = this.c << 3;
        this.e = new long[this.c];
        this.e[0] = this.b;
        this.f = new long[this.c];
        this.g = new long[this.c];
        this.j = new byte[this.b];
    }

    public c(c cVar) {
        a(cVar);
    }

    private static long a(int i, long j) {
        return (j >>> i) | (j << (-i));
    }

    private static long a(long j) {
        long j2 = ((9187201950435737471L & j) << 1) ^ ((((-9187201950435737472L) & j) >>> 7) * 29);
        long jA = a(8, j) ^ j;
        long jA2 = (jA ^ a(16, jA)) ^ a(48, j);
        long j3 = (jA2 ^ j) ^ j2;
        return a(48, j2) ^ ((jA2 ^ a(32, (((j3 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j3) << 2) ^ ((((-9187201950435737472L) & j3) >>> 6) * 29)))) ^ a(40, j2));
    }

    private void a(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.d = cVar.d;
        if (this.c <= 0 || this.c != cVar.c) {
            this.c = cVar.c;
            this.e = org.bouncycastle.f.a.b(cVar.e);
            this.f = new long[this.c];
            this.g = new long[this.c];
            this.j = org.bouncycastle.f.a.b(cVar.j);
        } else {
            System.arraycopy(cVar.e, 0, this.e, 0, this.c);
            System.arraycopy(cVar.j, 0, this.j, 0, this.b);
        }
        this.h = cVar.h;
        this.i = cVar.i;
    }

    private void a(long[] jArr) {
        for (int i = 0; i < this.d; i++) {
            long j = i;
            for (int i2 = 0; i2 < this.c; i2++) {
                jArr[i2] = jArr[i2] ^ j;
                j += 16;
            }
            d(jArr);
            e(jArr);
            c(jArr);
        }
    }

    private void b(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.c; i2++) {
            long jD = org.bouncycastle.f.g.d(bArr, i);
            i += 8;
            this.f[i2] = this.e[i2] ^ jD;
            this.g[i2] = jD;
        }
        a(this.f);
        b(this.g);
        for (int i3 = 0; i3 < this.c; i3++) {
            long[] jArr = this.e;
            jArr[i3] = jArr[i3] ^ (this.f[i3] ^ this.g[i3]);
        }
    }

    private void b(long[] jArr) {
        for (int i = 0; i < this.d; i++) {
            long j = 67818912035696883L | (((long) (((this.c - 1) << 4) ^ i)) << 56);
            for (int i2 = 0; i2 < this.c; i2++) {
                jArr[i2] = jArr[i2] + j;
                j -= 1152921504606846976L;
            }
            d(jArr);
            e(jArr);
            c(jArr);
        }
    }

    private void c(long[] jArr) {
        for (int i = 0; i < this.c; i++) {
            jArr[i] = a(jArr[i]);
        }
    }

    private void d(long[] jArr) {
        switch (this.c) {
            case 8:
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = jArr[4];
                long j6 = jArr[5];
                long j7 = jArr[6];
                long j8 = jArr[7];
                long j9 = (j ^ j5) & (-4294967296L);
                long j10 = j ^ j9;
                long j11 = j5 ^ j9;
                long j12 = (j2 ^ j6) & 72057594021150720L;
                long j13 = j2 ^ j12;
                long j14 = j6 ^ j12;
                long j15 = (j3 ^ j7) & 281474976645120L;
                long j16 = j3 ^ j15;
                long j17 = j7 ^ j15;
                long j18 = (j4 ^ j8) & 1099511627520L;
                long j19 = j4 ^ j18;
                long j20 = j8 ^ j18;
                long j21 = (j10 ^ j16) & (-281470681808896L);
                long j22 = j10 ^ j21;
                long j23 = j16 ^ j21;
                long j24 = (j13 ^ j19) & 72056494543077120L;
                long j25 = j13 ^ j24;
                long j26 = j19 ^ j24;
                long j27 = (j11 ^ j17) & (-281470681808896L);
                long j28 = j11 ^ j27;
                long j29 = j17 ^ j27;
                long j30 = (j14 ^ j20) & 72056494543077120L;
                long j31 = j14 ^ j30;
                long j32 = j20 ^ j30;
                long j33 = (j22 ^ j25) & (-71777214294589696L);
                long j34 = j22 ^ j33;
                long j35 = j25 ^ j33;
                long j36 = (j23 ^ j26) & (-71777214294589696L);
                long j37 = j23 ^ j36;
                long j38 = j26 ^ j36;
                long j39 = (j28 ^ j31) & (-71777214294589696L);
                long j40 = j28 ^ j39;
                long j41 = j31 ^ j39;
                long j42 = (j29 ^ j32) & (-71777214294589696L);
                jArr[0] = j34;
                jArr[1] = j35;
                jArr[2] = j37;
                jArr[3] = j38;
                jArr[4] = j40;
                jArr[5] = j41;
                jArr[6] = j29 ^ j42;
                jArr[7] = j32 ^ j42;
                return;
            case 16:
                long j43 = jArr[0];
                long j44 = jArr[1];
                long j45 = jArr[2];
                long j46 = jArr[3];
                long j47 = jArr[4];
                long j48 = jArr[5];
                long j49 = jArr[6];
                long j50 = jArr[7];
                long j51 = jArr[8];
                long j52 = jArr[9];
                long j53 = jArr[10];
                long j54 = jArr[11];
                long j55 = jArr[12];
                long j56 = jArr[13];
                long j57 = jArr[14];
                long j58 = jArr[15];
                long j59 = (j43 ^ j51) & (-72057594037927936L);
                long j60 = j43 ^ j59;
                long j61 = j51 ^ j59;
                long j62 = (j44 ^ j52) & (-72057594037927936L);
                long j63 = j44 ^ j62;
                long j64 = j52 ^ j62;
                long j65 = (j45 ^ j53) & (-281474976710656L);
                long j66 = j45 ^ j65;
                long j67 = j53 ^ j65;
                long j68 = (j46 ^ j54) & (-1099511627776L);
                long j69 = j46 ^ j68;
                long j70 = j54 ^ j68;
                long j71 = (j47 ^ j55) & (-4294967296L);
                long j72 = j47 ^ j71;
                long j73 = j55 ^ j71;
                long j74 = (j48 ^ j56) & 72057594021150720L;
                long j75 = j48 ^ j74;
                long j76 = j56 ^ j74;
                long j77 = (j49 ^ j57) & 72057594037862400L;
                long j78 = j49 ^ j77;
                long j79 = j57 ^ j77;
                long j80 = (j50 ^ j58) & 72057594037927680L;
                long j81 = j50 ^ j80;
                long j82 = j58 ^ j80;
                long j83 = (j60 ^ j72) & 72057589742960640L;
                long j84 = j60 ^ j83;
                long j85 = j72 ^ j83;
                long j86 = (j63 ^ j75) & (-16777216);
                long j87 = j63 ^ j86;
                long j88 = j75 ^ j86;
                long j89 = (j66 ^ j78) & (-71776119061282816L);
                long j90 = j66 ^ j89;
                long j91 = j78 ^ j89;
                long j92 = (j69 ^ j81) & (-72056494526300416L);
                long j93 = j69 ^ j92;
                long j94 = j81 ^ j92;
                long j95 = (j61 ^ j73) & 72057589742960640L;
                long j96 = j61 ^ j95;
                long j97 = j73 ^ j95;
                long j98 = (j64 ^ j76) & (-16777216);
                long j99 = j64 ^ j98;
                long j100 = j76 ^ j98;
                long j101 = (j67 ^ j79) & (-71776119061282816L);
                long j102 = j67 ^ j101;
                long j103 = j79 ^ j101;
                long j104 = (j70 ^ j82) & (-72056494526300416L);
                long j105 = j70 ^ j104;
                long j106 = j82 ^ j104;
                long j107 = (j84 ^ j90) & (-281470681808896L);
                long j108 = j84 ^ j107;
                long j109 = j90 ^ j107;
                long j110 = (j87 ^ j93) & 72056494543077120L;
                long j111 = j87 ^ j110;
                long j112 = j93 ^ j110;
                long j113 = (j85 ^ j91) & (-281470681808896L);
                long j114 = j85 ^ j113;
                long j115 = j91 ^ j113;
                long j116 = (j88 ^ j94) & 72056494543077120L;
                long j117 = j88 ^ j116;
                long j118 = j94 ^ j116;
                long j119 = (j96 ^ j102) & (-281470681808896L);
                long j120 = j96 ^ j119;
                long j121 = j102 ^ j119;
                long j122 = (j99 ^ j105) & 72056494543077120L;
                long j123 = j99 ^ j122;
                long j124 = j105 ^ j122;
                long j125 = (j97 ^ j103) & (-281470681808896L);
                long j126 = j97 ^ j125;
                long j127 = j103 ^ j125;
                long j128 = (j100 ^ j106) & 72056494543077120L;
                long j129 = j100 ^ j128;
                long j130 = j106 ^ j128;
                long j131 = (j108 ^ j111) & (-71777214294589696L);
                long j132 = j108 ^ j131;
                long j133 = j111 ^ j131;
                long j134 = (j109 ^ j112) & (-71777214294589696L);
                long j135 = j109 ^ j134;
                long j136 = j112 ^ j134;
                long j137 = (j114 ^ j117) & (-71777214294589696L);
                long j138 = j114 ^ j137;
                long j139 = j117 ^ j137;
                long j140 = (j115 ^ j118) & (-71777214294589696L);
                long j141 = j115 ^ j140;
                long j142 = j118 ^ j140;
                long j143 = (j120 ^ j123) & (-71777214294589696L);
                long j144 = j120 ^ j143;
                long j145 = j123 ^ j143;
                long j146 = (j121 ^ j124) & (-71777214294589696L);
                long j147 = j121 ^ j146;
                long j148 = j124 ^ j146;
                long j149 = (j126 ^ j129) & (-71777214294589696L);
                long j150 = j126 ^ j149;
                long j151 = j129 ^ j149;
                long j152 = (j127 ^ j130) & (-71777214294589696L);
                jArr[0] = j132;
                jArr[1] = j133;
                jArr[2] = j135;
                jArr[3] = j136;
                jArr[4] = j138;
                jArr[5] = j139;
                jArr[6] = j141;
                jArr[7] = j142;
                jArr[8] = j144;
                jArr[9] = j145;
                jArr[10] = j147;
                jArr[11] = j148;
                jArr[12] = j150;
                jArr[13] = j151;
                jArr[14] = j127 ^ j152;
                jArr[15] = j130 ^ j152;
                return;
            default:
                throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        }
    }

    private void e(long[] jArr) {
        for (int i = 0; i < this.c; i++) {
            long j = jArr[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte b = k[i2 & 255];
            byte b2 = l[(i2 >>> 8) & 255];
            byte b3 = m[(i2 >>> 16) & 255];
            int i4 = (n[i2 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
            byte b4 = k[i3 & 255];
            byte b5 = l[(i3 >>> 8) & 255];
            byte b6 = m[(i3 >>> 16) & 255];
            jArr[i] = (((long) ((n[i3 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16)))) << 32) | (((long) i4) & 4294967295L);
        }
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        int i2 = this.i;
        byte[] bArr2 = this.j;
        int i3 = this.i;
        this.i = i3 + 1;
        bArr2[i3] = -128;
        int i4 = this.b - 12;
        if (this.i > i4) {
            while (this.i < this.b) {
                byte[] bArr3 = this.j;
                int i5 = this.i;
                this.i = i5 + 1;
                bArr3[i5] = 0;
            }
            this.i = 0;
            b(this.j, 0);
        }
        while (this.i < i4) {
            byte[] bArr4 = this.j;
            int i6 = this.i;
            this.i = i6 + 1;
            bArr4[i6] = 0;
        }
        long j = (((this.h & 4294967295L) * ((long) this.b)) + ((long) i2)) << 3;
        org.bouncycastle.f.g.b((int) j, this.j, this.i);
        this.i += 4;
        org.bouncycastle.f.g.b((j >>> 32) + (((this.h >>> 32) * ((long) this.b)) << 3), this.j, this.i);
        b(this.j, 0);
        System.arraycopy(this.e, 0, this.f, 0, this.c);
        a(this.f);
        for (int i7 = 0; i7 < this.c; i7++) {
            long[] jArr = this.e;
            jArr[i7] = jArr[i7] ^ this.f[i7];
        }
        for (int i8 = this.c - (this.a >>> 3); i8 < this.c; i8++) {
            org.bouncycastle.f.g.b(this.e[i8], bArr, i);
            i += 8;
        }
        c();
        return this.a;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        byte[] bArr = this.j;
        int i = this.i;
        this.i = i + 1;
        bArr[i] = b;
        if (this.i == this.b) {
            b(this.j, 0);
            this.i = 0;
            this.h++;
        }
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        a((c) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        while (this.i != 0 && i2 > 0) {
            a(bArr[i]);
            i2--;
            i++;
        }
        if (i2 > 0) {
            while (i2 >= this.b) {
                b(bArr, i);
                i += this.b;
                i2 -= this.b;
                this.h++;
            }
            while (i2 > 0) {
                a(bArr[i]);
                i2--;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.a;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        org.bouncycastle.f.a.a(this.e);
        this.e[0] = this.b;
        this.h = 0L;
        this.i = 0;
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return this.b;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new c(this);
    }
}
