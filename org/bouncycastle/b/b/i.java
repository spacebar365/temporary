package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public class i implements org.bouncycastle.b.u {
    private static long[] g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected long[] a;
    protected byte[] b;
    protected int c;
    protected int d;
    protected int e;
    protected boolean f;

    public i() {
        this(288);
    }

    public i(int i) {
        this.a = new long[25];
        this.b = new byte[192];
        a(i);
    }

    public i(i iVar) {
        this.a = new long[25];
        this.b = new byte[192];
        System.arraycopy(iVar.a, 0, this.a, 0, iVar.a.length);
        System.arraycopy(iVar.b, 0, this.b, 0, iVar.b.length);
        this.c = iVar.c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f = iVar.f;
    }

    private void a(int i) {
        switch (i) {
            case 128:
            case 224:
            case 256:
            case 288:
            case 384:
            case 512:
                b(1600 - (i << 1));
                return;
            default:
                throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    private void b(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.c = i;
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.a[i2] = 0;
        }
        org.bouncycastle.f.a.a(this.b, (byte) 0);
        this.d = 0;
        this.f = false;
        this.e = (1600 - i) / 2;
    }

    private void b(byte[] bArr, int i) {
        int i2 = this.c >> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.a;
            jArr[i3] = jArr[i3] ^ org.bouncycastle.f.g.d(bArr, i);
            i += 8;
        }
        g();
    }

    private void b(byte[] bArr, int i, int i2) {
        if (this.d % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i3 = this.d >> 3;
        int i4 = this.c >> 3;
        int i5 = 0;
        while (i5 < i2) {
            if (i3 != 0 || i5 > i2 - i4) {
                int iMin = Math.min(i4 - i3, i2 - i5);
                System.arraycopy(bArr, i + i5, this.b, i3, iMin);
                i3 += iMin;
                i5 += iMin;
                if (i3 == i4) {
                    b(this.b, 0);
                    i3 = 0;
                }
            } else {
                do {
                    b(bArr, i + i5);
                    i5 += i4;
                } while (i5 <= i2 - i4);
            }
        }
        this.d = i3 << 3;
    }

    private void e() {
        byte[] bArr = this.b;
        int i = this.d >> 3;
        bArr[i] = (byte) (bArr[i] | ((byte) (1 << (this.d & 7))));
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == this.c) {
            b(this.b, 0);
            this.d = 0;
        }
        int i3 = this.d >> 6;
        int i4 = this.d & 63;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            long[] jArr = this.a;
            jArr[i5] = jArr[i5] ^ org.bouncycastle.f.g.d(this.b, i6);
            i5++;
            i6 += 8;
        }
        if (i4 > 0) {
            long j = (1 << i4) - 1;
            long[] jArr2 = this.a;
            jArr2[i3] = (j & org.bouncycastle.f.g.d(this.b, i6)) ^ jArr2[i3];
        }
        long[] jArr3 = this.a;
        int i7 = (this.c - 1) >> 6;
        jArr3[i7] = jArr3[i7] ^ Long.MIN_VALUE;
        g();
        f();
        this.d = this.c;
        this.f = true;
    }

    private void f() {
        org.bouncycastle.f.g.a(this.a, this.c >> 6, this.b, 0);
    }

    private void g() {
        long[] jArr = this.a;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        long j25 = jArr[24];
        for (int i = 0; i < 24; i++) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << 1) | (j27 >>> (-1))) ^ j30;
            long j32 = ((j28 << 1) | (j28 >>> (-1))) ^ j26;
            long j33 = j27 ^ ((j29 << 1) | (j29 >>> (-1)));
            long j34 = j28 ^ ((j30 >>> (-1)) | (j30 << 1));
            long j35 = ((j26 >>> (-1)) | (j26 << 1)) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j5 ^ j35;
            long j57 = j10 ^ j35;
            long j58 = j15 ^ j35;
            long j59 = j20 ^ j35;
            long j60 = j25 ^ j35;
            long j61 = (j41 << 1) | (j41 >>> 63);
            long j62 = (j42 >>> 20) | (j42 << 44);
            long j63 = (j57 >>> 44) | (j57 << 20);
            long j64 = (j50 >>> 3) | (j50 << 61);
            long j65 = (j58 << 39) | (j58 >>> 25);
            long j66 = (j40 >>> 46) | (j40 << 18);
            long j67 = (j46 << 62) | (j46 >>> 2);
            long j68 = (j48 << 43) | (j48 >>> 21);
            long j69 = (j53 >>> 39) | (j53 << 25);
            long j70 = (j59 >>> 56) | (j59 << 8);
            long j71 = (j55 >>> 8) | (j55 << 56);
            long j72 = (j39 << 41) | (j39 >>> 23);
            long j73 = (j56 << 27) | (j56 >>> 37);
            long j74 = (j60 >>> 50) | (j60 << 14);
            long j75 = (j45 << 2) | (j45 >>> 62);
            long j76 = (j52 << 55) | (j52 >>> 9);
            long j77 = (j44 << 45) | (j44 >>> 19);
            long j78 = (j37 << 36) | (j37 >>> 28);
            long j79 = (j51 << 28) | (j51 >>> 36);
            long j80 = (j54 >>> 43) | (j54 << 21);
            long j81 = (j49 << 15) | (j49 >>> 49);
            long j82 = (j43 << 10) | (j43 >>> 54);
            long j83 = (j47 << 6) | (j47 >>> 58);
            long j84 = (j38 << 3) | (j38 >>> 61);
            long j85 = j36 ^ (((-1) ^ j62) & j68);
            j2 = j62 ^ (((-1) ^ j68) & j80);
            j3 = j68 ^ (((-1) ^ j80) & j74);
            j4 = j80 ^ (((-1) ^ j74) & j36);
            j5 = j74 ^ (((-1) ^ j36) & j62);
            j6 = j79 ^ (((-1) ^ j63) & j84);
            j7 = j63 ^ (((-1) ^ j84) & j77);
            j8 = j84 ^ (((-1) ^ j77) & j64);
            j9 = j77 ^ (((-1) ^ j64) & j79);
            j10 = j64 ^ (((-1) ^ j79) & j63);
            j11 = j61 ^ (((-1) ^ j83) & j69);
            j12 = j83 ^ (((-1) ^ j69) & j70);
            j13 = j69 ^ (((-1) ^ j70) & j66);
            j14 = j70 ^ (((-1) ^ j66) & j61);
            j15 = j66 ^ (((-1) ^ j61) & j83);
            j16 = j73 ^ (((-1) ^ j78) & j82);
            j17 = j78 ^ (((-1) ^ j82) & j81);
            j18 = j82 ^ (((-1) ^ j81) & j71);
            j19 = j81 ^ (((-1) ^ j71) & j73);
            j20 = j71 ^ (((-1) ^ j73) & j78);
            j21 = j67 ^ (((-1) ^ j76) & j65);
            j22 = j76 ^ (((-1) ^ j65) & j72);
            j23 = j65 ^ (((-1) ^ j72) & j75);
            j24 = j72 ^ (((-1) ^ j75) & j67);
            j25 = (((-1) ^ j67) & j76) ^ j75;
            j = g[i] ^ j85;
        }
        jArr[0] = j;
        jArr[1] = j2;
        jArr[2] = j3;
        jArr[3] = j4;
        jArr[4] = j5;
        jArr[5] = j6;
        jArr[6] = j7;
        jArr[7] = j8;
        jArr[8] = j9;
        jArr[9] = j10;
        jArr[10] = j11;
        jArr[11] = j12;
        jArr[12] = j13;
        jArr[13] = j14;
        jArr[14] = j15;
        jArr[15] = j16;
        jArr[16] = j17;
        jArr[17] = j18;
        jArr[18] = j19;
        jArr[19] = j20;
        jArr[20] = j21;
        jArr[21] = j22;
        jArr[22] = j23;
        jArr[23] = j24;
        jArr[24] = j25;
    }

    @Override // org.bouncycastle.b.r
    public String a() {
        return "Keccak-" + this.e;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        b(new byte[]{b}, 0, 1);
    }

    protected final void a(int i, int i2) {
        if (i2 <= 0 || i2 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        if (this.d % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.b[this.d >> 3] = (byte) (((1 << i2) - 1) & i);
        this.d += i2;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    protected final void a(byte[] bArr, int i, long j) {
        long j2 = 0;
        if (!this.f) {
            e();
        }
        if (j % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j2 < j) {
            if (this.d == 0) {
                g();
                f();
                this.d = this.c;
            }
            int iMin = (int) Math.min(this.d, j - j2);
            System.arraycopy(this.b, (this.c - this.d) / 8, bArr, ((int) (j2 / 8)) + i, iMin / 8);
            this.d -= iMin;
            j2 += (long) iMin;
        }
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.e / 8;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        a(this.e);
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return this.c / 8;
    }

    @Override // org.bouncycastle.b.r
    public int a(byte[] bArr, int i) {
        a(bArr, i, this.e);
        c();
        return this.e / 8;
    }
}
