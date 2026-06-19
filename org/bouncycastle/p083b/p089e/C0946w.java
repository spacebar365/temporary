package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0946w implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private static final byte[] f3954a = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, 33, -127, 28, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, 127, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, 112, 14, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, 50, 117, 25, 61, -1, 53, -118, 126, 109, 84, -58, -128, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, -80, -68, -36, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, 30, 0, 98, 68, 26, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};

    /* JADX INFO: renamed from: b */
    private static final byte[] f3955b = {-91, 45, 50, -113, 14, 48, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, 112, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, 127, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, -68, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, 61, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, -128, -112, -48, 36, 52, -53, -19, -12, -50, -103, 16, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};

    /* JADX INFO: renamed from: g */
    private boolean f3960g;

    /* JADX INFO: renamed from: c */
    private final byte[] f3956c = {-108, 32, -123, 16, -62, -64, 1, -5, 1, -64, -62, 16, -123, 32, -108, 1};

    /* JADX INFO: renamed from: d */
    private int f3957d = 32;

    /* JADX INFO: renamed from: e */
    private int f3958e = this.f3957d / 2;

    /* JADX INFO: renamed from: f */
    private byte[][] f3959f = null;

    /* JADX INFO: renamed from: h */
    private byte[][] f3961h = m2386d();

    /* JADX INFO: renamed from: a */
    private byte[] m2380a(byte[] bArr, byte[] bArr2) {
        byte[] bArrM4078a = C1535a.m4078a(bArr, bArr.length);
        m2383b(bArrM4078a, bArr2);
        m2379a(bArrM4078a);
        m2381b(bArrM4078a);
        return bArrM4078a;
    }

    /* JADX INFO: renamed from: b */
    private void m2381b(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            m2384c(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2383b(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2384c(byte[] bArr) {
        byte bM2385d = m2385d(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = bM2385d;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3959f == null) {
            throw new IllegalStateException("GOST3412_2015 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        m2382b(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "GOST3412_2015";
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

    /* JADX INFO: renamed from: d */
    private static byte[][] m2386d() {
        byte[][] bArr = new byte[256][];
        for (int i = 0; i < 256; i++) {
            bArr[i] = new byte[256];
            for (int i2 = 0; i2 < 256; i2++) {
                byte[] bArr2 = bArr[i];
                byte b = (byte) i;
                byte b2 = 0;
                byte b3 = 0;
                byte b4 = (byte) i2;
                while (b2 < 8 && b != 0 && b4 != 0) {
                    if ((b4 & 1) != 0) {
                        b3 = (byte) (b3 ^ b);
                    }
                    byte b5 = (byte) (b << 1);
                    if (((byte) (b & 128)) != 0) {
                        b5 = (byte) (b5 ^ 195);
                    }
                    b4 = (byte) (b4 >> 1);
                    b2 = (byte) (b2 + 1);
                    b = b5;
                }
                bArr2[i2] = b3;
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            if (interfaceC1003i != null) {
                throw new IllegalArgumentException("invalid parameter passed to GOST3412_2015 init - " + interfaceC1003i.getClass().getName());
            }
            return;
        }
        this.f3960g = z;
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (bArrM2603a.length != this.f3957d) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.f3959f = new byte[10][];
        for (int i = 0; i < 10; i++) {
            this.f3959f[i] = new byte[this.f3958e];
        }
        byte[] bArr = new byte[this.f3958e];
        byte[] bArr2 = new byte[this.f3958e];
        for (int i2 = 0; i2 < this.f3958e; i2++) {
            byte[] bArr3 = this.f3959f[0];
            byte b = bArrM2603a[i2];
            bArr[i2] = b;
            bArr3[i2] = b;
            byte[] bArr4 = this.f3959f[1];
            byte b2 = bArrM2603a[this.f3958e + i2];
            bArr2[i2] = b2;
            bArr4[i2] = b2;
        }
        byte[] bArr5 = new byte[this.f3958e];
        for (int i3 = 1; i3 < 5; i3++) {
            for (int i4 = 1; i4 <= 8; i4++) {
                C1535a.m4094d(bArr5);
                bArr5[15] = (byte) (((i3 - 1) * 8) + i4);
                m2381b(bArr5);
                byte[] bArrM2380a = m2380a(bArr5, bArr);
                m2383b(bArrM2380a, bArr2);
                System.arraycopy(bArr, 0, bArr2, 0, this.f3958e);
                System.arraycopy(bArrM2380a, 0, bArr, 0, this.f3958e);
            }
            System.arraycopy(bArr, 0, this.f3959f[i3 * 2], 0, this.f3958e);
            System.arraycopy(bArr2, 0, this.f3959f[(i3 * 2) + 1], 0, this.f3958e);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2382b(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArrM4078a = new byte[16];
        System.arraycopy(bArr, i, bArrM4078a, 0, 16);
        if (this.f3960g) {
            for (int i3 = 0; i3 < 9; i3++) {
                bArrM4078a = C1535a.m4078a(m2380a(this.f3959f[i3], bArrM4078a), 16);
            }
            m2383b(bArrM4078a, this.f3959f[9]);
        } else {
            for (int i4 = 9; i4 > 0; i4--) {
                byte[] bArr3 = this.f3959f[i4];
                byte[] bArrM4078a2 = C1535a.m4078a(bArr3, bArr3.length);
                m2383b(bArrM4078a2, bArrM4078a);
                for (int i5 = 0; i5 < 16; i5++) {
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(bArrM4078a2, 1, bArr4, 0, 15);
                    bArr4[15] = bArrM4078a2[0];
                    byte bM2385d = m2385d(bArr4);
                    System.arraycopy(bArrM4078a2, 1, bArrM4078a2, 0, 15);
                    bArrM4078a2[15] = bM2385d;
                }
                for (int i6 = 0; i6 < bArrM4078a2.length; i6++) {
                    bArrM4078a2[i6] = f3955b[bArrM4078a2[i6] & 255];
                }
                bArrM4078a = C1535a.m4078a(bArrM4078a2, 16);
            }
            m2383b(bArrM4078a, this.f3959f[0]);
        }
        System.arraycopy(bArrM4078a, 0, bArr2, i2, 16);
    }

    /* JADX INFO: renamed from: a */
    private static void m2379a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = f3954a[bArr[i] & 255];
        }
    }

    /* JADX INFO: renamed from: d */
    private byte m2385d(byte[] bArr) {
        byte b = bArr[15];
        for (int i = 14; i >= 0; i--) {
            b = (byte) (b ^ this.f3961h[bArr[i] & 255][this.f3956c[i] & 255]);
        }
        return b;
    }
}
