package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C0824ae implements InterfaceC1178u, InterfaceC1554e {

    /* JADX INFO: renamed from: a */
    private static final int[] f3387a = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};

    /* JADX INFO: renamed from: b */
    private static final long[] f3388b = new long[256];

    /* JADX INFO: renamed from: c */
    private static final long[] f3389c = new long[256];

    /* JADX INFO: renamed from: d */
    private static final long[] f3390d = new long[256];

    /* JADX INFO: renamed from: e */
    private static final long[] f3391e = new long[256];

    /* JADX INFO: renamed from: f */
    private static final long[] f3392f = new long[256];

    /* JADX INFO: renamed from: g */
    private static final long[] f3393g = new long[256];

    /* JADX INFO: renamed from: h */
    private static final long[] f3394h = new long[256];

    /* JADX INFO: renamed from: i */
    private static final long[] f3395i = new long[256];

    /* JADX INFO: renamed from: s */
    private static final short[] f3396s;

    /* JADX INFO: renamed from: j */
    private final long[] f3397j;

    /* JADX INFO: renamed from: k */
    private byte[] f3398k;

    /* JADX INFO: renamed from: l */
    private int f3399l;

    /* JADX INFO: renamed from: m */
    private short[] f3400m;

    /* JADX INFO: renamed from: n */
    private long[] f3401n;

    /* JADX INFO: renamed from: o */
    private long[] f3402o;

    /* JADX INFO: renamed from: p */
    private long[] f3403p;

    /* JADX INFO: renamed from: q */
    private long[] f3404q;

    /* JADX INFO: renamed from: r */
    private long[] f3405r;

    static {
        short[] sArr = new short[32];
        f3396s = sArr;
        sArr[31] = 8;
    }

    public C0824ae() {
        this.f3397j = new long[11];
        this.f3398k = new byte[64];
        this.f3399l = 0;
        this.f3400m = new short[32];
        this.f3401n = new long[8];
        this.f3402o = new long[8];
        this.f3403p = new long[8];
        this.f3404q = new long[8];
        this.f3405r = new long[8];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 256) {
                break;
            }
            int i3 = f3387a[i2];
            int iM1983a = m1983a(i3 << 1);
            int iM1983a2 = m1983a(iM1983a << 1);
            int i4 = iM1983a2 ^ i3;
            int iM1983a3 = m1983a(iM1983a2 << 1);
            int i5 = iM1983a3 ^ i3;
            f3388b[i2] = m1984a(i3, i3, iM1983a2, i3, iM1983a3, i4, iM1983a, i5);
            f3389c[i2] = m1984a(i5, i3, i3, iM1983a2, i3, iM1983a3, i4, iM1983a);
            f3390d[i2] = m1984a(iM1983a, i5, i3, i3, iM1983a2, i3, iM1983a3, i4);
            f3391e[i2] = m1984a(i4, iM1983a, i5, i3, i3, iM1983a2, i3, iM1983a3);
            f3392f[i2] = m1984a(iM1983a3, i4, iM1983a, i5, i3, i3, iM1983a2, i3);
            f3393g[i2] = m1984a(i3, iM1983a3, i4, iM1983a, i5, i3, i3, iM1983a2);
            f3394h[i2] = m1984a(iM1983a2, i3, iM1983a3, i4, iM1983a, i5, i3, i3);
            f3395i[i2] = m1984a(i3, iM1983a2, i3, iM1983a3, i4, iM1983a, i5, i3);
            i = i2 + 1;
        }
        this.f3397j[0] = 0;
        for (int i6 = 1; i6 <= 10; i6++) {
            int i7 = (i6 - 1) * 8;
            this.f3397j[i6] = (((((((f3388b[i7] & (-72057594037927936L)) ^ (f3389c[i7 + 1] & 71776119061217280L)) ^ (f3390d[i7 + 2] & 280375465082880L)) ^ (f3391e[i7 + 3] & 1095216660480L)) ^ (f3392f[i7 + 4] & 4278190080L)) ^ (f3393g[i7 + 5] & 16711680)) ^ (f3394h[i7 + 6] & 65280)) ^ (f3395i[i7 + 7] & 255);
        }
    }

    public C0824ae(C0824ae c0824ae) {
        this.f3397j = new long[11];
        this.f3398k = new byte[64];
        this.f3399l = 0;
        this.f3400m = new short[32];
        this.f3401n = new long[8];
        this.f3402o = new long[8];
        this.f3403p = new long[8];
        this.f3404q = new long[8];
        this.f3405r = new long[8];
        mo1939a(c0824ae);
    }

    /* JADX INFO: renamed from: a */
    private static int m1983a(int i) {
        return ((long) i) >= 256 ? i ^ 285 : i;
    }

    /* JADX INFO: renamed from: a */
    private static long m1984a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((((long) i) << 56) ^ (((long) i2) << 48)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
    }

    /* JADX INFO: renamed from: b */
    private static long m1985b(byte[] bArr, int i) {
        return ((((long) bArr[i + 0]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
    }

    /* JADX INFO: renamed from: f */
    private void m1986f() {
        for (int i = 0; i < this.f3405r.length; i++) {
            this.f3404q[i] = m1985b(this.f3398k, i * 8);
        }
        m1987g();
        this.f3399l = 0;
        C1535a.m4071a(this.f3398k, (byte) 0);
    }

    /* JADX INFO: renamed from: g */
    private void m1987g() {
        for (int i = 0; i < 8; i++) {
            long[] jArr = this.f3405r;
            long j = this.f3404q[i];
            long[] jArr2 = this.f3402o;
            long j2 = this.f3401n[i];
            jArr2[i] = j2;
            jArr[i] = j ^ j2;
        }
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 > 10) {
                break;
            }
            for (int i4 = 0; i4 < 8; i4++) {
                this.f3403p[i4] = 0;
                long[] jArr3 = this.f3403p;
                jArr3[i4] = jArr3[i4] ^ f3388b[((int) (this.f3402o[(i4 + 0) & 7] >>> 56)) & 255];
                long[] jArr4 = this.f3403p;
                jArr4[i4] = jArr4[i4] ^ f3389c[((int) (this.f3402o[(i4 - 1) & 7] >>> 48)) & 255];
                long[] jArr5 = this.f3403p;
                jArr5[i4] = jArr5[i4] ^ f3390d[((int) (this.f3402o[(i4 - 2) & 7] >>> 40)) & 255];
                long[] jArr6 = this.f3403p;
                jArr6[i4] = jArr6[i4] ^ f3391e[((int) (this.f3402o[(i4 - 3) & 7] >>> 32)) & 255];
                long[] jArr7 = this.f3403p;
                jArr7[i4] = jArr7[i4] ^ f3392f[((int) (this.f3402o[(i4 - 4) & 7] >>> 24)) & 255];
                long[] jArr8 = this.f3403p;
                jArr8[i4] = jArr8[i4] ^ f3393g[((int) (this.f3402o[(i4 - 5) & 7] >>> 16)) & 255];
                long[] jArr9 = this.f3403p;
                jArr9[i4] = jArr9[i4] ^ f3394h[((int) (this.f3402o[(i4 - 6) & 7] >>> 8)) & 255];
                long[] jArr10 = this.f3403p;
                jArr10[i4] = jArr10[i4] ^ f3395i[((int) this.f3402o[(i4 - 7) & 7]) & 255];
            }
            System.arraycopy(this.f3403p, 0, this.f3402o, 0, this.f3402o.length);
            long[] jArr11 = this.f3402o;
            jArr11[0] = jArr11[0] ^ this.f3397j[i3];
            for (int i5 = 0; i5 < 8; i5++) {
                this.f3403p[i5] = this.f3402o[i5];
                long[] jArr12 = this.f3403p;
                jArr12[i5] = jArr12[i5] ^ f3388b[((int) (this.f3405r[(i5 + 0) & 7] >>> 56)) & 255];
                long[] jArr13 = this.f3403p;
                jArr13[i5] = jArr13[i5] ^ f3389c[((int) (this.f3405r[(i5 - 1) & 7] >>> 48)) & 255];
                long[] jArr14 = this.f3403p;
                jArr14[i5] = jArr14[i5] ^ f3390d[((int) (this.f3405r[(i5 - 2) & 7] >>> 40)) & 255];
                long[] jArr15 = this.f3403p;
                jArr15[i5] = jArr15[i5] ^ f3391e[((int) (this.f3405r[(i5 - 3) & 7] >>> 32)) & 255];
                long[] jArr16 = this.f3403p;
                jArr16[i5] = jArr16[i5] ^ f3392f[((int) (this.f3405r[(i5 - 4) & 7] >>> 24)) & 255];
                long[] jArr17 = this.f3403p;
                jArr17[i5] = jArr17[i5] ^ f3393g[((int) (this.f3405r[(i5 - 5) & 7] >>> 16)) & 255];
                long[] jArr18 = this.f3403p;
                jArr18[i5] = jArr18[i5] ^ f3394h[((int) (this.f3405r[(i5 - 6) & 7] >>> 8)) & 255];
                long[] jArr19 = this.f3403p;
                jArr19[i5] = jArr19[i5] ^ f3395i[((int) this.f3405r[(i5 - 7) & 7]) & 255];
            }
            System.arraycopy(this.f3403p, 0, this.f3405r, 0, this.f3405r.length);
            i2 = i3 + 1;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            long[] jArr20 = this.f3401n;
            jArr20[i6] = jArr20[i6] ^ (this.f3405r[i6] ^ this.f3404q[i6]);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m1988h() {
        int i = 0;
        for (int length = this.f3400m.length - 1; length >= 0; length--) {
            int i2 = (this.f3400m[length] & 255) + f3396s[length] + i;
            i = i2 >>> 8;
            this.f3400m[length] = (short) (i2 & 255);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        this.f3398k[this.f3399l] = b;
        this.f3399l++;
        if (this.f3399l == this.f3398k.length) {
            m1986f();
        }
        m1988h();
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        C0824ae c0824ae = (C0824ae) interfaceC1554e;
        System.arraycopy(c0824ae.f3397j, 0, this.f3397j, 0, this.f3397j.length);
        System.arraycopy(c0824ae.f3398k, 0, this.f3398k, 0, this.f3398k.length);
        this.f3399l = c0824ae.f3399l;
        System.arraycopy(c0824ae.f3400m, 0, this.f3400m, 0, this.f3400m.length);
        System.arraycopy(c0824ae.f3401n, 0, this.f3401n, 0, this.f3401n.length);
        System.arraycopy(c0824ae.f3402o, 0, this.f3402o, 0, this.f3402o.length);
        System.arraycopy(c0824ae.f3403p, 0, this.f3403p, 0, this.f3403p.length);
        System.arraycopy(c0824ae.f3404q, 0, this.f3404q, 0, this.f3404q.length);
        System.arraycopy(c0824ae.f3405r, 0, this.f3405r, 0, this.f3405r.length);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            mo1928a(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 64;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3399l = 0;
        C1535a.m4074a(this.f3400m);
        C1535a.m4071a(this.f3398k, (byte) 0);
        C1535a.m4073a(this.f3401n);
        C1535a.m4073a(this.f3402o);
        C1535a.m4073a(this.f3403p);
        C1535a.m4073a(this.f3404q);
        C1535a.m4073a(this.f3405r);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 64;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0824ae(this);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr2[i2] = (byte) (this.f3400m[i2] & 255);
        }
        byte[] bArr3 = this.f3398k;
        int i3 = this.f3399l;
        this.f3399l = i3 + 1;
        bArr3[i3] = (byte) (bArr3[i3] | 128);
        if (this.f3399l == this.f3398k.length) {
            m1986f();
        }
        if (this.f3399l > 32) {
            while (this.f3399l != 0) {
                mo1928a((byte) 0);
            }
        }
        while (this.f3399l <= 32) {
            mo1928a((byte) 0);
        }
        System.arraycopy(bArr2, 0, this.f3398k, 32, 32);
        m1986f();
        for (int i4 = 0; i4 < 8; i4++) {
            long j = this.f3401n[i4];
            int i5 = i + (i4 * 8);
            for (int i6 = 0; i6 < 8; i6++) {
                bArr[i5 + i6] = (byte) ((j >> (56 - (i6 * 8))) & 255);
            }
        }
        mo1931c();
        return 64;
    }
}
