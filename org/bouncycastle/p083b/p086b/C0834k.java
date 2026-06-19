package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0834k implements InterfaceC1178u, InterfaceC1554e {

    /* JADX INFO: renamed from: g */
    private static final byte[] f3492g = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* JADX INFO: renamed from: a */
    private byte[] f3493a;

    /* JADX INFO: renamed from: b */
    private int f3494b;

    /* JADX INFO: renamed from: c */
    private byte[] f3495c;

    /* JADX INFO: renamed from: d */
    private int f3496d;

    /* JADX INFO: renamed from: e */
    private byte[] f3497e;

    /* JADX INFO: renamed from: f */
    private int f3498f;

    public C0834k() {
        this.f3493a = new byte[48];
        this.f3495c = new byte[16];
        this.f3497e = new byte[16];
        mo1931c();
    }

    public C0834k(C0834k c0834k) {
        this.f3493a = new byte[48];
        this.f3495c = new byte[16];
        this.f3497e = new byte[16];
        m2038a(c0834k);
    }

    /* JADX INFO: renamed from: a */
    private void m2038a(C0834k c0834k) {
        System.arraycopy(c0834k.f3493a, 0, this.f3493a, 0, c0834k.f3493a.length);
        this.f3494b = c0834k.f3494b;
        System.arraycopy(c0834k.f3495c, 0, this.f3495c, 0, c0834k.f3495c.length);
        this.f3496d = c0834k.f3496d;
        System.arraycopy(c0834k.f3497e, 0, this.f3497e, 0, c0834k.f3497e.length);
        this.f3498f = c0834k.f3498f;
    }

    /* JADX INFO: renamed from: a */
    private void m2039a(byte[] bArr) {
        byte b = this.f3497e[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f3497e;
            bArr2[i] = (byte) (f3492g[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            b = this.f3497e[i];
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2040b(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            this.f3493a[i + 16] = bArr[i];
            this.f3493a[i + 32] = (byte) (bArr[i] ^ this.f3493a[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr2 = this.f3493a;
                byte b = (byte) (f3492g[i2] ^ bArr2[i4]);
                bArr2[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        byte length = (byte) (this.f3495c.length - this.f3496d);
        for (int i2 = this.f3496d; i2 < this.f3495c.length; i2++) {
            this.f3495c[i2] = length;
        }
        m2039a(this.f3495c);
        m2040b(this.f3495c);
        m2040b(this.f3497e);
        System.arraycopy(this.f3493a, this.f3494b, bArr, i, 16);
        mo1931c();
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "MD2";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        byte[] bArr = this.f3495c;
        int i = this.f3496d;
        this.f3496d = i + 1;
        bArr[i] = b;
        if (this.f3496d == 16) {
            m2039a(this.f3495c);
            m2040b(this.f3495c);
            this.f3496d = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2038a((C0834k) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        while (this.f3496d != 0 && i2 > 0) {
            mo1928a(bArr[i]);
            i++;
            i2--;
        }
        int i3 = i2;
        int i4 = i;
        while (i3 > 16) {
            System.arraycopy(bArr, i4, this.f3495c, 0, 16);
            m2039a(this.f3495c);
            m2040b(this.f3495c);
            i3 -= 16;
            i4 += 16;
        }
        while (i3 > 0) {
            mo1928a(bArr[i4]);
            i4++;
            i3--;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3494b = 0;
        for (int i = 0; i != this.f3493a.length; i++) {
            this.f3493a[i] = 0;
        }
        this.f3496d = 0;
        for (int i2 = 0; i2 != this.f3495c.length; i2++) {
            this.f3495c[i2] = 0;
        }
        this.f3498f = 0;
        for (int i3 = 0; i3 != this.f3497e.length; i3++) {
            this.f3497e[i3] = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 16;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0834k(this);
    }
}
