package org.bouncycastle.p083b.p089e;

import android.R;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.bc */
/* JADX INFO: loaded from: classes.dex */
public final class C0921bc implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private static final byte[][] f3817a = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, -128, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, 127, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, -128, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, 127, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};

    /* JADX INFO: renamed from: g */
    private int[] f3823g;

    /* JADX INFO: renamed from: h */
    private int[] f3824h;

    /* JADX INFO: renamed from: b */
    private boolean f3818b = false;

    /* JADX INFO: renamed from: c */
    private int[] f3819c = new int[256];

    /* JADX INFO: renamed from: d */
    private int[] f3820d = new int[256];

    /* JADX INFO: renamed from: e */
    private int[] f3821e = new int[256];

    /* JADX INFO: renamed from: f */
    private int[] f3822f = new int[256];

    /* JADX INFO: renamed from: i */
    private int f3825i = 0;

    /* JADX INFO: renamed from: j */
    private byte[] f3826j = null;

    /* JADX INFO: renamed from: a */
    private static int m2282a(int i) {
        int i2 = (i >>> 24) & 255;
        int i3 = (((i2 & 128) != 0 ? 333 : 0) ^ (i2 << 1)) & 255;
        int i4 = (((i2 & 1) != 0 ? 166 : 0) ^ (i2 >>> 1)) ^ i3;
        return ((i4 << 8) ^ ((i3 << 16) ^ ((i << 8) ^ (i4 << 24)))) ^ i2;
    }

    /* JADX INFO: renamed from: a */
    private static int m2283a(int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = m2282a(i2);
        }
        int iM2282a = i2 ^ i;
        for (int i4 = 0; i4 < 4; i4++) {
            iM2282a = m2282a(iM2282a);
        }
        return iM2282a;
    }

    /* JADX INFO: renamed from: a */
    private static int m2285a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    private static void m2286a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: b */
    private static int m2288b(int i) {
        return ((i & 1) != 0 ? 180 : 0) ^ (i >> 1);
    }

    /* JADX INFO: renamed from: b */
    private void m2289b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2285a = m2285a(bArr, i) ^ this.f3823g[0];
        int iM2285a2 = this.f3823g[1] ^ m2285a(bArr, i + 4);
        int iM2285a3 = m2285a(bArr, i + 8) ^ this.f3823g[2];
        int iM2285a4 = this.f3823g[3] ^ m2285a(bArr, i + 12);
        int i3 = 8;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int iM2296h = m2296h(iM2285a);
            int iM2297i = m2297i(iM2285a2);
            int i5 = i3 + 1;
            int i6 = iM2285a3 ^ (this.f3823g[i3] + (iM2296h + iM2297i));
            iM2285a3 = (i6 << 31) | (i6 >>> 1);
            int i7 = (iM2285a4 << 1) | (iM2285a4 >>> 31);
            int i8 = (iM2297i * 2) + iM2296h;
            int i9 = i5 + 1;
            iM2285a4 = (i8 + this.f3823g[i5]) ^ i7;
            int iM2296h2 = m2296h(iM2285a3);
            int iM2297i2 = m2297i(iM2285a4);
            int i10 = i9 + 1;
            int i11 = iM2285a ^ (this.f3823g[i9] + (iM2296h2 + iM2297i2));
            iM2285a = (i11 << 31) | (i11 >>> 1);
            int i12 = (iM2297i2 * 2) + iM2296h2;
            i3 = i10 + 1;
            iM2285a2 = ((iM2285a2 >>> 31) | (iM2285a2 << 1)) ^ (i12 + this.f3823g[i10]);
        }
        m2286a(this.f3823g[4] ^ iM2285a3, bArr2, i2);
        m2286a(this.f3823g[5] ^ iM2285a4, bArr2, i2 + 4);
        m2286a(this.f3823g[6] ^ iM2285a, bArr2, i2 + 8);
        m2286a(this.f3823g[7] ^ iM2285a2, bArr2, i2 + 12);
    }

    /* JADX INFO: renamed from: c */
    private static int m2290c(int i) {
        return ((i & 1) != 0 ? 90 : 0) ^ (((i & 2) != 0 ? 180 : 0) ^ (i >> 2));
    }

    /* JADX INFO: renamed from: c */
    private void m2291c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2285a = m2285a(bArr, i) ^ this.f3823g[4];
        int iM2285a2 = m2285a(bArr, i + 4) ^ this.f3823g[5];
        int iM2285a3 = this.f3823g[6] ^ m2285a(bArr, i + 8);
        int iM2285a4 = m2285a(bArr, i + 12) ^ this.f3823g[7];
        int i3 = 39;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int iM2296h = m2296h(iM2285a);
            int iM2297i = m2297i(iM2285a2);
            int i5 = i3 - 1;
            int i6 = (this.f3823g[i3] + ((iM2297i * 2) + iM2296h)) ^ iM2285a4;
            int i7 = iM2296h + iM2297i;
            int i8 = i5 - 1;
            iM2285a3 = ((iM2285a3 >>> 31) | (iM2285a3 << 1)) ^ (i7 + this.f3823g[i5]);
            iM2285a4 = (i6 >>> 1) | (i6 << 31);
            int iM2296h2 = m2296h(iM2285a3);
            int iM2297i2 = m2297i(iM2285a4);
            int i9 = i8 - 1;
            int i10 = iM2285a2 ^ (this.f3823g[i8] + ((iM2297i2 * 2) + iM2296h2));
            int i11 = iM2297i2 + iM2296h2;
            i3 = i9 - 1;
            iM2285a = ((iM2285a >>> 31) | (iM2285a << 1)) ^ (i11 + this.f3823g[i9]);
            iM2285a2 = (i10 << 31) | (i10 >>> 1);
        }
        m2286a(this.f3823g[0] ^ iM2285a3, bArr2, i2);
        m2286a(this.f3823g[1] ^ iM2285a4, bArr2, i2 + 4);
        m2286a(this.f3823g[2] ^ iM2285a, bArr2, i2 + 8);
        m2286a(this.f3823g[3] ^ iM2285a2, bArr2, i2 + 12);
    }

    /* JADX INFO: renamed from: d */
    private static int m2292d(int i) {
        return (m2288b(i) ^ i) ^ m2290c(i);
    }

    /* JADX INFO: renamed from: e */
    private static int m2293e(int i) {
        return (i >>> 8) & 255;
    }

    /* JADX INFO: renamed from: f */
    private static int m2294f(int i) {
        return (i >>> 16) & 255;
    }

    /* JADX INFO: renamed from: g */
    private static int m2295g(int i) {
        return (i >>> 24) & 255;
    }

    /* JADX INFO: renamed from: h */
    private int m2296h(int i) {
        return ((this.f3824h[((i & 255) * 2) + 0] ^ this.f3824h[(((i >>> 8) & 255) * 2) + 1]) ^ this.f3824h[(((i >>> 16) & 255) * 2) + 512]) ^ this.f3824h[(((i >>> 24) & 255) * 2) + 513];
    }

    /* JADX INFO: renamed from: i */
    private int m2297i(int i) {
        return ((this.f3824h[(((i >>> 24) & 255) * 2) + 0] ^ this.f3824h[((i & 255) * 2) + 1]) ^ this.f3824h[(((i >>> 8) & 255) * 2) + 512]) ^ this.f3824h[(((i >>> 16) & 255) * 2) + 513];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3826j == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f3818b) {
            m2289b(bArr, i, bArr2, i2);
            return 16;
        }
        m2291c(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "Twofish";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + interfaceC1003i.getClass().getName());
        }
        this.f3818b = z;
        this.f3826j = ((C1076ba) interfaceC1003i).m2603a();
        this.f3825i = this.f3826j.length / 8;
        m2287a(this.f3826j);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
        if (this.f3826j != null) {
            m2287a(this.f3826j);
        }
    }

    public C0921bc() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i = 0; i < 256; i++) {
            int i2 = f3817a[0][i] & 255;
            iArr[0] = i2;
            iArr2[0] = (m2290c(i2) ^ i2) & 255;
            iArr3[0] = m2292d(i2) & 255;
            int i3 = f3817a[1][i] & 255;
            iArr[1] = i3;
            iArr2[1] = (m2290c(i3) ^ i3) & 255;
            iArr3[1] = m2292d(i3) & 255;
            this.f3819c[i] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.f3820d[i] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.f3821e[i] = iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16) | (iArr3[1] << 24);
            this.f3822f[i] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2287a(byte[] bArr) {
        int iM2295g;
        int iM2294f;
        int iM2293e;
        int i;
        int iM2295g2;
        int iM2294f2;
        int iM2293e2;
        int i2;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.f3823g = new int[40];
        if (this.f3825i <= 0) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (this.f3825i > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int i3 = 0; i3 < this.f3825i; i3++) {
            int i4 = i3 * 8;
            iArr[i3] = m2285a(bArr, i4);
            iArr2[i3] = m2285a(bArr, i4 + 4);
            iArr3[(this.f3825i - 1) - i3] = m2283a(iArr[i3], iArr2[i3]);
        }
        for (int i5 = 0; i5 < 20; i5++) {
            int i6 = 33686018 * i5;
            int iM2284a = m2284a(i6, iArr);
            int iM2284a2 = m2284a(i6 + R.attr.cacheColorHint, iArr2);
            int i7 = (iM2284a2 >>> 24) | (iM2284a2 << 8);
            int i8 = iM2284a + i7;
            this.f3823g[i5 * 2] = i8;
            int i9 = i7 + i8;
            this.f3823g[(i5 * 2) + 1] = (i9 >>> 23) | (i9 << 9);
        }
        int i10 = iArr3[0];
        int i11 = iArr3[1];
        int i12 = iArr3[2];
        int i13 = iArr3[3];
        this.f3824h = new int[1024];
        for (int i14 = 0; i14 < 256; i14++) {
            switch (this.f3825i & 3) {
                case 0:
                    i2 = (f3817a[1][i14] & 255) ^ (i13 & 255);
                    iM2293e2 = (f3817a[0][i14] & 255) ^ m2293e(i13);
                    iM2294f2 = m2294f(i13) ^ (f3817a[0][i14] & 255);
                    iM2295g2 = (f3817a[1][i14] & 255) ^ m2295g(i13);
                    i = (f3817a[1][i2] & 255) ^ (i12 & 255);
                    iM2293e = (f3817a[1][iM2293e2] & 255) ^ m2293e(i12);
                    iM2294f = (f3817a[0][iM2294f2] & 255) ^ m2294f(i12);
                    iM2295g = (f3817a[0][iM2295g2] & 255) ^ m2295g(i12);
                    this.f3824h[i14 * 2] = this.f3819c[(f3817a[0][(f3817a[0][i] & 255) ^ (i11 & 255)] & 255) ^ (i10 & 255)];
                    this.f3824h[(i14 * 2) + 1] = this.f3820d[(f3817a[0][(f3817a[1][iM2293e] & 255) ^ m2293e(i11)] & 255) ^ m2293e(i10)];
                    this.f3824h[(i14 * 2) + 512] = this.f3821e[(f3817a[1][(f3817a[0][iM2294f] & 255) ^ m2294f(i11)] & 255) ^ m2294f(i10)];
                    this.f3824h[(i14 * 2) + 513] = this.f3822f[(f3817a[1][(f3817a[1][iM2295g] & 255) ^ m2295g(i11)] & 255) ^ m2295g(i10)];
                    break;
                case 1:
                    this.f3824h[i14 * 2] = this.f3819c[(f3817a[0][i14] & 255) ^ (i10 & 255)];
                    this.f3824h[(i14 * 2) + 1] = this.f3820d[(f3817a[0][i14] & 255) ^ m2293e(i10)];
                    this.f3824h[(i14 * 2) + 512] = this.f3821e[(f3817a[1][i14] & 255) ^ m2294f(i10)];
                    this.f3824h[(i14 * 2) + 513] = this.f3822f[(f3817a[1][i14] & 255) ^ m2295g(i10)];
                    break;
                case 2:
                    iM2295g = i14;
                    iM2294f = i14;
                    iM2293e = i14;
                    i = i14;
                    this.f3824h[i14 * 2] = this.f3819c[(f3817a[0][(f3817a[0][i] & 255) ^ (i11 & 255)] & 255) ^ (i10 & 255)];
                    this.f3824h[(i14 * 2) + 1] = this.f3820d[(f3817a[0][(f3817a[1][iM2293e] & 255) ^ m2293e(i11)] & 255) ^ m2293e(i10)];
                    this.f3824h[(i14 * 2) + 512] = this.f3821e[(f3817a[1][(f3817a[0][iM2294f] & 255) ^ m2294f(i11)] & 255) ^ m2294f(i10)];
                    this.f3824h[(i14 * 2) + 513] = this.f3822f[(f3817a[1][(f3817a[1][iM2295g] & 255) ^ m2295g(i11)] & 255) ^ m2295g(i10)];
                    break;
                case 3:
                    iM2295g2 = i14;
                    iM2294f2 = i14;
                    iM2293e2 = i14;
                    i2 = i14;
                    i = (f3817a[1][i2] & 255) ^ (i12 & 255);
                    iM2293e = (f3817a[1][iM2293e2] & 255) ^ m2293e(i12);
                    iM2294f = (f3817a[0][iM2294f2] & 255) ^ m2294f(i12);
                    iM2295g = (f3817a[0][iM2295g2] & 255) ^ m2295g(i12);
                    this.f3824h[i14 * 2] = this.f3819c[(f3817a[0][(f3817a[0][i] & 255) ^ (i11 & 255)] & 255) ^ (i10 & 255)];
                    this.f3824h[(i14 * 2) + 1] = this.f3820d[(f3817a[0][(f3817a[1][iM2293e] & 255) ^ m2293e(i11)] & 255) ^ m2293e(i10)];
                    this.f3824h[(i14 * 2) + 512] = this.f3821e[(f3817a[1][(f3817a[0][iM2294f] & 255) ^ m2294f(i11)] & 255) ^ m2294f(i10)];
                    this.f3824h[(i14 * 2) + 513] = this.f3822f[(f3817a[1][(f3817a[1][iM2295g] & 255) ^ m2295g(i11)] & 255) ^ m2295g(i10)];
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    private int m2284a(int i, int[] iArr) {
        int i2 = i & 255;
        int iM2293e = m2293e(i);
        int iM2294f = m2294f(i);
        int iM2295g = m2295g(i);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        switch (this.f3825i & 3) {
            case 0:
                i2 = (f3817a[1][i2] & 255) ^ (i6 & 255);
                iM2293e = (f3817a[0][iM2293e] & 255) ^ m2293e(i6);
                iM2294f = (f3817a[0][iM2294f] & 255) ^ m2294f(i6);
                iM2295g = (f3817a[1][iM2295g] & 255) ^ m2295g(i6);
                i2 = (f3817a[1][i2] & 255) ^ (i5 & 255);
                iM2293e = (f3817a[1][iM2293e] & 255) ^ m2293e(i5);
                iM2294f = (f3817a[0][iM2294f] & 255) ^ m2294f(i5);
                iM2295g = (f3817a[0][iM2295g] & 255) ^ m2295g(i5);
                return (this.f3821e[(f3817a[1][(f3817a[0][iM2294f] & 255) ^ m2294f(i4)] & 255) ^ m2294f(i3)] ^ (this.f3820d[(f3817a[0][(f3817a[1][iM2293e] & 255) ^ m2293e(i4)] & 255) ^ m2293e(i3)] ^ this.f3819c[(f3817a[0][(f3817a[0][i2] & 255) ^ (i4 & 255)] & 255) ^ (i3 & 255)])) ^ this.f3822f[(f3817a[1][(f3817a[1][iM2295g] & 255) ^ m2295g(i4)] & 255) ^ m2295g(i3)];
            case 1:
                return (this.f3821e[(f3817a[1][iM2294f] & 255) ^ m2294f(i3)] ^ (this.f3820d[(f3817a[0][iM2293e] & 255) ^ m2293e(i3)] ^ this.f3819c[(f3817a[0][i2] & 255) ^ (i3 & 255)])) ^ this.f3822f[(f3817a[1][iM2295g] & 255) ^ m2295g(i3)];
            case 2:
                return (this.f3821e[(f3817a[1][(f3817a[0][iM2294f] & 255) ^ m2294f(i4)] & 255) ^ m2294f(i3)] ^ (this.f3820d[(f3817a[0][(f3817a[1][iM2293e] & 255) ^ m2293e(i4)] & 255) ^ m2293e(i3)] ^ this.f3819c[(f3817a[0][(f3817a[0][i2] & 255) ^ (i4 & 255)] & 255) ^ (i3 & 255)])) ^ this.f3822f[(f3817a[1][(f3817a[1][iM2295g] & 255) ^ m2295g(i4)] & 255) ^ m2295g(i3)];
            case 3:
                i2 = (f3817a[1][i2] & 255) ^ (i5 & 255);
                iM2293e = (f3817a[1][iM2293e] & 255) ^ m2293e(i5);
                iM2294f = (f3817a[0][iM2294f] & 255) ^ m2294f(i5);
                iM2295g = (f3817a[0][iM2295g] & 255) ^ m2295g(i5);
                return (this.f3821e[(f3817a[1][(f3817a[0][iM2294f] & 255) ^ m2294f(i4)] & 255) ^ m2294f(i3)] ^ (this.f3820d[(f3817a[0][(f3817a[1][iM2293e] & 255) ^ m2293e(i4)] & 255) ^ m2293e(i3)] ^ this.f3819c[(f3817a[0][(f3817a[0][i2] & 255) ^ (i4 & 255)] & 255) ^ (i3 & 255)])) ^ this.f3822f[(f3817a[1][(f3817a[1][iM2295g] & 255) ^ m2295g(i4)] & 255) ^ m2295g(i3)];
            default:
                return 0;
        }
    }
}
