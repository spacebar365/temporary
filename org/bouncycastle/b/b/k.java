package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    private static final byte[] g = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    private byte[] a;
    private int b;
    private byte[] c;
    private int d;
    private byte[] e;
    private int f;

    public k() {
        this.a = new byte[48];
        this.c = new byte[16];
        this.e = new byte[16];
        c();
    }

    public k(k kVar) {
        this.a = new byte[48];
        this.c = new byte[16];
        this.e = new byte[16];
        a(kVar);
    }

    private void a(k kVar) {
        System.arraycopy(kVar.a, 0, this.a, 0, kVar.a.length);
        this.b = kVar.b;
        System.arraycopy(kVar.c, 0, this.c, 0, kVar.c.length);
        this.d = kVar.d;
        System.arraycopy(kVar.e, 0, this.e, 0, kVar.e.length);
        this.f = kVar.f;
    }

    private void a(byte[] bArr) {
        byte b = this.e[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.e;
            bArr2[i] = (byte) (g[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            b = this.e[i];
        }
    }

    private void b(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            this.a[i + 16] = bArr[i];
            this.a[i + 32] = (byte) (bArr[i] ^ this.a[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr2 = this.a;
                byte b = (byte) (g[i2] ^ bArr2[i4]);
                bArr2[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        byte length = (byte) (this.c.length - this.d);
        for (int i2 = this.d; i2 < this.c.length; i2++) {
            this.c[i2] = length;
        }
        a(this.c);
        b(this.c);
        b(this.e);
        System.arraycopy(this.a, this.b, bArr, i, 16);
        c();
        return 16;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "MD2";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        byte[] bArr = this.c;
        int i = this.d;
        this.d = i + 1;
        bArr[i] = b;
        if (this.d == 16) {
            a(this.c);
            b(this.c);
            this.d = 0;
        }
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        a((k) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        while (this.d != 0 && i2 > 0) {
            a(bArr[i]);
            i++;
            i2--;
        }
        int i3 = i2;
        int i4 = i;
        while (i3 > 16) {
            System.arraycopy(bArr, i4, this.c, 0, 16);
            a(this.c);
            b(this.c);
            i3 -= 16;
            i4 += 16;
        }
        while (i3 > 0) {
            a(bArr[i4]);
            i4++;
            i3--;
        }
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.b = 0;
        for (int i = 0; i != this.a.length; i++) {
            this.a[i] = 0;
        }
        this.d = 0;
        for (int i2 = 0; i2 != this.c.length; i2++) {
            this.c[i2] = 0;
        }
        this.f = 0;
        for (int i3 = 0; i3 != this.e.length; i3++) {
            this.e[i3] = 0;
        }
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 16;
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new k(this);
    }
}
