package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.e.at */
/* JADX INFO: loaded from: classes.dex */
public final class C0911at implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private static final byte[] f3766a = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* JADX INFO: renamed from: b */
    private static final int[] f3767b = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* JADX INFO: renamed from: c */
    private static final int[] f3768c = {-1548633402, 1453994832, 1736282519, -1301273892};

    /* JADX INFO: renamed from: d */
    private final int[] f3769d = new int[4];

    /* JADX INFO: renamed from: e */
    private int[] f3770e;

    /* JADX INFO: renamed from: a */
    private static int m2218a(int i) {
        return ((f3766a[(i >> 24) & 255] & 255) << 24) | ((f3766a[(i >> 16) & 255] & 255) << 16) | ((f3766a[(i >> 8) & 255] & 255) << 8) | (f3766a[i & 255] & 255);
    }

    /* JADX INFO: renamed from: a */
    private static int m2219a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX INFO: renamed from: a */
    private static int[] m2220a(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {AbstractC1556g.m4135a(bArr, 0), AbstractC1556g.m4135a(bArr, 4), AbstractC1556g.m4135a(bArr, 8), AbstractC1556g.m4135a(bArr, 12)};
        int[] iArr3 = {iArr2[0] ^ f3768c[0], iArr2[1] ^ f3768c[1], iArr2[2] ^ f3768c[2], iArr2[3] ^ f3768c[3]};
        if (z) {
            iArr[0] = iArr3[0] ^ m2221b(((iArr3[1] ^ iArr3[2]) ^ iArr3[3]) ^ f3767b[0]);
            iArr[1] = iArr3[1] ^ m2221b(((iArr3[2] ^ iArr3[3]) ^ iArr[0]) ^ f3767b[1]);
            iArr[2] = iArr3[2] ^ m2221b(((iArr3[3] ^ iArr[0]) ^ iArr[1]) ^ f3767b[2]);
            iArr[3] = iArr3[3] ^ m2221b(((iArr[0] ^ iArr[1]) ^ iArr[2]) ^ f3767b[3]);
            for (int i = 4; i < 32; i++) {
                iArr[i] = iArr[i - 4] ^ m2221b(((iArr[i - 3] ^ iArr[i - 2]) ^ iArr[i - 1]) ^ f3767b[i]);
            }
        } else {
            iArr[31] = iArr3[0] ^ m2221b(((iArr3[1] ^ iArr3[2]) ^ iArr3[3]) ^ f3767b[0]);
            iArr[30] = iArr3[1] ^ m2221b(((iArr3[2] ^ iArr3[3]) ^ iArr[31]) ^ f3767b[1]);
            iArr[29] = iArr3[2] ^ m2221b(((iArr3[3] ^ iArr[31]) ^ iArr[30]) ^ f3767b[2]);
            iArr[28] = iArr3[3] ^ m2221b(((iArr[31] ^ iArr[30]) ^ iArr[29]) ^ f3767b[3]);
            for (int i2 = 27; i2 >= 0; i2--) {
                iArr[i2] = iArr[i2 + 4] ^ m2221b(((iArr[i2 + 3] ^ iArr[i2 + 2]) ^ iArr[i2 + 1]) ^ f3767b[31 - i2]);
            }
        }
        return iArr;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "SM4";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + interfaceC1003i.getClass().getName());
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (bArrM2603a.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.f3770e = m2220a(z, bArrM2603a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    /* JADX INFO: renamed from: b */
    private static int m2221b(int i) {
        int iM2218a = m2218a(i);
        return m2219a(iM2218a, 23) ^ (m2219a(iM2218a, 13) ^ iM2218a);
    }

    /* JADX INFO: renamed from: c */
    private static int m2222c(int i) {
        int iM2218a = m2218a(i);
        return m2219a(iM2218a, 24) ^ (((m2219a(iM2218a, 2) ^ iM2218a) ^ m2219a(iM2218a, 10)) ^ m2219a(iM2218a, 18));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3770e == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        this.f3769d[0] = AbstractC1556g.m4135a(bArr, i);
        this.f3769d[1] = AbstractC1556g.m4135a(bArr, i + 4);
        this.f3769d[2] = AbstractC1556g.m4135a(bArr, i + 8);
        this.f3769d[3] = AbstractC1556g.m4135a(bArr, i + 12);
        for (int i3 = 0; i3 < 32; i3 += 4) {
            int[] iArr = this.f3769d;
            int[] iArr2 = this.f3769d;
            iArr[0] = m2222c((iArr2[3] ^ (iArr2[1] ^ iArr2[2])) ^ this.f3770e[i3]) ^ iArr2[0];
            int[] iArr3 = this.f3769d;
            int[] iArr4 = this.f3769d;
            iArr3[1] = m2222c((iArr4[0] ^ (iArr4[2] ^ iArr4[3])) ^ this.f3770e[i3 + 1]) ^ iArr4[1];
            int[] iArr5 = this.f3769d;
            int[] iArr6 = this.f3769d;
            iArr5[2] = m2222c((iArr6[1] ^ (iArr6[3] ^ iArr6[0])) ^ this.f3770e[i3 + 2]) ^ iArr6[2];
            int[] iArr7 = this.f3769d;
            int[] iArr8 = this.f3769d;
            iArr7[3] = m2222c((iArr8[2] ^ (iArr8[0] ^ iArr8[1])) ^ this.f3770e[i3 + 3]) ^ iArr8[3];
        }
        AbstractC1556g.m4136a(this.f3769d[3], bArr2, i2);
        AbstractC1556g.m4136a(this.f3769d[2], bArr2, i2 + 4);
        AbstractC1556g.m4136a(this.f3769d[1], bArr2, i2 + 8);
        AbstractC1556g.m4136a(this.f3769d[0], bArr2, i2 + 12);
        return 16;
    }
}
