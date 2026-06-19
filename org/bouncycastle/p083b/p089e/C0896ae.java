package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1084bi;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C0896ae implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private static byte[] f3688a = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, -128, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, 127, -63, -83};

    /* JADX INFO: renamed from: b */
    private int[] f3689b;

    /* JADX INFO: renamed from: c */
    private boolean f3690c;

    /* JADX INFO: renamed from: a */
    private static int m2161a(int i, int i2) {
        int i3 = 65535 & i;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    /* JADX INFO: renamed from: a */
    private static int[] m2162a(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = 0;
            int i4 = length;
            int i5 = iArr[length - 1];
            while (true) {
                int i6 = i3 + 1;
                i5 = f3688a[(iArr[i3] + i5) & 255] & 255;
                int i7 = i4 + 1;
                iArr[i4] = i5;
                if (i7 >= 128) {
                    break;
                }
                i3 = i6;
                i4 = i7;
            }
        }
        int i8 = (i + 7) >> 3;
        int i9 = f3688a[iArr[128 - i8] & (255 >> ((-i) & 7))] & 255;
        iArr[128 - i8] = i9;
        for (int i10 = (128 - i8) - 1; i10 >= 0; i10--) {
            i9 = f3688a[i9 ^ iArr[i10 + i8]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            iArr2[i11] = iArr[i11 * 2] + (iArr[(i11 * 2) + 1] << 8);
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    private void m2163b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2161a = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iM2161a2 = (bArr[i + 4] & 255) + ((bArr[i + 5] & 255) << 8);
        int iM2161a3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iM2161a4 = (bArr[i + 0] & 255) + ((bArr[i + 1] & 255) << 8);
        for (int i3 = 0; i3 <= 16; i3 += 4) {
            iM2161a4 = m2161a(iM2161a4 + ((iM2161a ^ (-1)) & iM2161a3) + (iM2161a2 & iM2161a) + this.f3689b[i3], 1);
            iM2161a3 = m2161a(iM2161a3 + ((iM2161a4 ^ (-1)) & iM2161a2) + (iM2161a & iM2161a4) + this.f3689b[i3 + 1], 2);
            iM2161a2 = m2161a(iM2161a2 + ((iM2161a3 ^ (-1)) & iM2161a) + (iM2161a4 & iM2161a3) + this.f3689b[i3 + 2], 3);
            iM2161a = m2161a(iM2161a + ((iM2161a2 ^ (-1)) & iM2161a4) + (iM2161a3 & iM2161a2) + this.f3689b[i3 + 3], 5);
        }
        int iM2161a5 = iM2161a4 + this.f3689b[iM2161a & 63];
        int iM2161a6 = iM2161a3 + this.f3689b[iM2161a5 & 63];
        int iM2161a7 = iM2161a2 + this.f3689b[iM2161a6 & 63];
        int iM2161a8 = iM2161a + this.f3689b[iM2161a7 & 63];
        for (int i4 = 20; i4 <= 40; i4 += 4) {
            iM2161a5 = m2161a(iM2161a5 + ((iM2161a8 ^ (-1)) & iM2161a6) + (iM2161a7 & iM2161a8) + this.f3689b[i4], 1);
            iM2161a6 = m2161a(iM2161a6 + ((iM2161a5 ^ (-1)) & iM2161a7) + (iM2161a8 & iM2161a5) + this.f3689b[i4 + 1], 2);
            iM2161a7 = m2161a(iM2161a7 + ((iM2161a6 ^ (-1)) & iM2161a8) + (iM2161a5 & iM2161a6) + this.f3689b[i4 + 2], 3);
            iM2161a8 = m2161a(iM2161a8 + ((iM2161a7 ^ (-1)) & iM2161a5) + (iM2161a6 & iM2161a7) + this.f3689b[i4 + 3], 5);
        }
        int iM2161a9 = iM2161a5 + this.f3689b[iM2161a8 & 63];
        int iM2161a10 = iM2161a6 + this.f3689b[iM2161a9 & 63];
        int iM2161a11 = iM2161a7 + this.f3689b[iM2161a10 & 63];
        int iM2161a12 = iM2161a8 + this.f3689b[iM2161a11 & 63];
        for (int i5 = 44; i5 < 64; i5 += 4) {
            iM2161a9 = m2161a(iM2161a9 + ((iM2161a12 ^ (-1)) & iM2161a10) + (iM2161a11 & iM2161a12) + this.f3689b[i5], 1);
            iM2161a10 = m2161a(iM2161a10 + ((iM2161a9 ^ (-1)) & iM2161a11) + (iM2161a12 & iM2161a9) + this.f3689b[i5 + 1], 2);
            iM2161a11 = m2161a(iM2161a11 + ((iM2161a10 ^ (-1)) & iM2161a12) + (iM2161a9 & iM2161a10) + this.f3689b[i5 + 2], 3);
            iM2161a12 = m2161a(iM2161a12 + ((iM2161a11 ^ (-1)) & iM2161a9) + (iM2161a10 & iM2161a11) + this.f3689b[i5 + 3], 5);
        }
        bArr2[i2 + 0] = (byte) iM2161a9;
        bArr2[i2 + 1] = (byte) (iM2161a9 >> 8);
        bArr2[i2 + 2] = (byte) iM2161a10;
        bArr2[i2 + 3] = (byte) (iM2161a10 >> 8);
        bArr2[i2 + 4] = (byte) iM2161a11;
        bArr2[i2 + 5] = (byte) (iM2161a11 >> 8);
        bArr2[i2 + 6] = (byte) iM2161a12;
        bArr2[i2 + 7] = (byte) (iM2161a12 >> 8);
    }

    /* JADX INFO: renamed from: c */
    private void m2164c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2161a = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iM2161a2 = (bArr[i + 4] & 255) + ((bArr[i + 5] & 255) << 8);
        int iM2161a3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iM2161a4 = (bArr[i + 0] & 255) + ((bArr[i + 1] & 255) << 8);
        for (int i3 = 60; i3 >= 44; i3 -= 4) {
            iM2161a = m2161a(iM2161a, 11) - ((((iM2161a2 ^ (-1)) & iM2161a4) + (iM2161a3 & iM2161a2)) + this.f3689b[i3 + 3]);
            iM2161a2 = m2161a(iM2161a2, 13) - ((((iM2161a3 ^ (-1)) & iM2161a) + (iM2161a4 & iM2161a3)) + this.f3689b[i3 + 2]);
            iM2161a3 = m2161a(iM2161a3, 14) - ((((iM2161a4 ^ (-1)) & iM2161a2) + (iM2161a & iM2161a4)) + this.f3689b[i3 + 1]);
            iM2161a4 = m2161a(iM2161a4, 15) - ((((iM2161a ^ (-1)) & iM2161a3) + (iM2161a2 & iM2161a)) + this.f3689b[i3]);
        }
        int iM2161a5 = iM2161a - this.f3689b[iM2161a2 & 63];
        int iM2161a6 = iM2161a2 - this.f3689b[iM2161a3 & 63];
        int iM2161a7 = iM2161a3 - this.f3689b[iM2161a4 & 63];
        int iM2161a8 = iM2161a4 - this.f3689b[iM2161a5 & 63];
        for (int i4 = 40; i4 >= 20; i4 -= 4) {
            iM2161a5 = m2161a(iM2161a5, 11) - ((((iM2161a6 ^ (-1)) & iM2161a8) + (iM2161a7 & iM2161a6)) + this.f3689b[i4 + 3]);
            iM2161a6 = m2161a(iM2161a6, 13) - ((((iM2161a7 ^ (-1)) & iM2161a5) + (iM2161a8 & iM2161a7)) + this.f3689b[i4 + 2]);
            iM2161a7 = m2161a(iM2161a7, 14) - ((((iM2161a8 ^ (-1)) & iM2161a6) + (iM2161a5 & iM2161a8)) + this.f3689b[i4 + 1]);
            iM2161a8 = m2161a(iM2161a8, 15) - ((((iM2161a5 ^ (-1)) & iM2161a7) + (iM2161a6 & iM2161a5)) + this.f3689b[i4]);
        }
        int iM2161a9 = iM2161a5 - this.f3689b[iM2161a6 & 63];
        int iM2161a10 = iM2161a6 - this.f3689b[iM2161a7 & 63];
        int iM2161a11 = iM2161a7 - this.f3689b[iM2161a8 & 63];
        int iM2161a12 = iM2161a8 - this.f3689b[iM2161a9 & 63];
        for (int i5 = 16; i5 >= 0; i5 -= 4) {
            iM2161a9 = m2161a(iM2161a9, 11) - ((((iM2161a10 ^ (-1)) & iM2161a12) + (iM2161a11 & iM2161a10)) + this.f3689b[i5 + 3]);
            iM2161a10 = m2161a(iM2161a10, 13) - ((((iM2161a11 ^ (-1)) & iM2161a9) + (iM2161a12 & iM2161a11)) + this.f3689b[i5 + 2]);
            iM2161a11 = m2161a(iM2161a11, 14) - ((((iM2161a12 ^ (-1)) & iM2161a10) + (iM2161a9 & iM2161a12)) + this.f3689b[i5 + 1]);
            iM2161a12 = m2161a(iM2161a12, 15) - ((((iM2161a9 ^ (-1)) & iM2161a11) + (iM2161a10 & iM2161a9)) + this.f3689b[i5]);
        }
        bArr2[i2 + 0] = (byte) iM2161a12;
        bArr2[i2 + 1] = (byte) (iM2161a12 >> 8);
        bArr2[i2 + 2] = (byte) iM2161a11;
        bArr2[i2 + 3] = (byte) (iM2161a11 >> 8);
        bArr2[i2 + 4] = (byte) iM2161a10;
        bArr2[i2 + 5] = (byte) (iM2161a10 >> 8);
        bArr2[i2 + 6] = (byte) iM2161a9;
        bArr2[i2 + 7] = (byte) (iM2161a9 >> 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3689b == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f3690c) {
            m2163b(bArr, i, bArr2, i2);
            return 8;
        }
        m2164c(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "RC2";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3690c = z;
        if (interfaceC1003i instanceof C1084bi) {
            C1084bi c1084bi = (C1084bi) interfaceC1003i;
            this.f3689b = m2162a(c1084bi.m2603a(), c1084bi.m2619b());
        } else {
            if (!(interfaceC1003i instanceof C1076ba)) {
                throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + interfaceC1003i.getClass().getName());
            }
            byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
            this.f3689b = m2162a(bArrM2603a, bArrM2603a.length * 8);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }
}
