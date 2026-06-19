package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0843t extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    static final int[] f3554a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: b */
    private int f3555b;

    /* JADX INFO: renamed from: c */
    private int f3556c;

    /* JADX INFO: renamed from: d */
    private int f3557d;

    /* JADX INFO: renamed from: e */
    private int f3558e;

    /* JADX INFO: renamed from: f */
    private int f3559f;

    /* JADX INFO: renamed from: g */
    private int f3560g;

    /* JADX INFO: renamed from: h */
    private int f3561h;

    /* JADX INFO: renamed from: i */
    private int f3562i;

    /* JADX INFO: renamed from: j */
    private int[] f3563j;

    /* JADX INFO: renamed from: k */
    private int f3564k;

    public C0843t() {
        this.f3563j = new int[64];
        mo1931c();
    }

    public C0843t(C0843t c0843t) {
        super(c0843t);
        this.f3563j = new int[64];
        m2093a(c0843t);
    }

    /* JADX INFO: renamed from: a */
    private static int m2091a(int i) {
        return (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19))) ^ ((i >>> 22) | (i << 10));
    }

    /* JADX INFO: renamed from: a */
    private static int m2092a(int i, int i2, int i3) {
        return (i & i2) ^ ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private void m2093a(C0843t c0843t) {
        super.m2016a((AbstractC0831h) c0843t);
        this.f3555b = c0843t.f3555b;
        this.f3556c = c0843t.f3556c;
        this.f3557d = c0843t.f3557d;
        this.f3558e = c0843t.f3558e;
        this.f3559f = c0843t.f3559f;
        this.f3560g = c0843t.f3560g;
        this.f3561h = c0843t.f3561h;
        this.f3562i = c0843t.f3562i;
        System.arraycopy(c0843t.f3563j, 0, this.f3563j, 0, c0843t.f3563j.length);
        this.f3564k = c0843t.f3564k;
    }

    /* JADX INFO: renamed from: b */
    private static int m2094b(int i) {
        return (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21))) ^ ((i >>> 25) | (i << 7));
    }

    /* JADX INFO: renamed from: b */
    private static int m2095b(int i, int i2, int i3) {
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    /* JADX INFO: renamed from: c */
    private static int m2096c(int i) {
        return (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14))) ^ (i >>> 3);
    }

    /* JADX INFO: renamed from: d */
    private static int m2097d(int i) {
        return (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13))) ^ (i >>> 10);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        AbstractC1556g.m4136a(this.f3555b, bArr, i);
        AbstractC1556g.m4136a(this.f3556c, bArr, i + 4);
        AbstractC1556g.m4136a(this.f3557d, bArr, i + 8);
        AbstractC1556g.m4136a(this.f3558e, bArr, i + 12);
        AbstractC1556g.m4136a(this.f3559f, bArr, i + 16);
        AbstractC1556g.m4136a(this.f3560g, bArr, i + 20);
        AbstractC1556g.m4136a(this.f3561h, bArr, i + 24);
        mo1931c();
        return 28;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA-224";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3564k > 14) {
            mo1942g();
        }
        this.f3563j[14] = (int) (j >>> 32);
        this.f3563j[15] = (int) ((-1) & j);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2093a((C0843t) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 28;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.f3563j[this.f3564k] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        int i5 = this.f3564k + 1;
        this.f3564k = i5;
        if (i5 == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3555b = -1056596264;
        this.f3556c = 914150663;
        this.f3557d = 812702999;
        this.f3558e = -150054599;
        this.f3559f = -4191439;
        this.f3560g = 1750603025;
        this.f3561h = 1694076839;
        this.f3562i = -1090891868;
        this.f3564k = 0;
        for (int i = 0; i != this.f3563j.length; i++) {
            this.f3563j[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0843t(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f3563j;
            iArr[i] = m2097d(iArr[i - 2]) + this.f3563j[i - 7] + m2096c(this.f3563j[i - 15]) + this.f3563j[i - 16];
        }
        int iM2091a = this.f3555b;
        int iM2091a2 = this.f3556c;
        int iM2091a3 = this.f3557d;
        int iM2091a4 = this.f3558e;
        int i2 = this.f3559f;
        int i3 = this.f3560g;
        int i4 = this.f3561h;
        int i5 = this.f3562i;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iM2094b = i5 + m2094b(i2) + m2092a(i2, i3, i4) + f3554a[i6] + this.f3563j[i6];
            int i8 = iM2091a4 + iM2094b;
            int iM2091a5 = iM2094b + m2091a(iM2091a) + m2095b(iM2091a, iM2091a2, iM2091a3);
            int i9 = i6 + 1;
            int iM2094b2 = i4 + m2094b(i8) + m2092a(i8, i2, i3) + f3554a[i9] + this.f3563j[i9];
            int i10 = iM2091a3 + iM2094b2;
            int iM2091a6 = iM2094b2 + m2091a(iM2091a5) + m2095b(iM2091a5, iM2091a, iM2091a2);
            int i11 = i9 + 1;
            int iM2094b3 = i3 + m2094b(i10) + m2092a(i10, i8, i2) + f3554a[i11] + this.f3563j[i11];
            int i12 = iM2091a2 + iM2094b3;
            int iM2091a7 = iM2094b3 + m2091a(iM2091a6) + m2095b(iM2091a6, iM2091a5, iM2091a);
            int i13 = i11 + 1;
            int iM2094b4 = i2 + m2094b(i12) + m2092a(i12, i10, i8) + f3554a[i13] + this.f3563j[i13];
            int i14 = iM2091a + iM2094b4;
            int iM2091a8 = iM2094b4 + m2091a(iM2091a7) + m2095b(iM2091a7, iM2091a6, iM2091a5);
            int i15 = i13 + 1;
            int iM2094b5 = i8 + m2094b(i14) + m2092a(i14, i12, i10) + f3554a[i15] + this.f3563j[i15];
            i5 = iM2091a5 + iM2094b5;
            iM2091a4 = iM2094b5 + m2091a(iM2091a8) + m2095b(iM2091a8, iM2091a7, iM2091a6);
            int i16 = i15 + 1;
            int iM2094b6 = i10 + m2094b(i5) + m2092a(i5, i14, i12) + f3554a[i16] + this.f3563j[i16];
            i4 = iM2091a6 + iM2094b6;
            iM2091a3 = iM2094b6 + m2091a(iM2091a4) + m2095b(iM2091a4, iM2091a8, iM2091a7);
            int i17 = i16 + 1;
            int iM2094b7 = i12 + m2094b(i4) + m2092a(i4, i5, i14) + f3554a[i17] + this.f3563j[i17];
            i3 = iM2091a7 + iM2094b7;
            iM2091a2 = iM2094b7 + m2091a(iM2091a3) + m2095b(iM2091a3, iM2091a4, iM2091a8);
            int i18 = i17 + 1;
            int iM2094b8 = i14 + m2094b(i3) + m2092a(i3, i4, i5) + f3554a[i18] + this.f3563j[i18];
            i2 = iM2091a8 + iM2094b8;
            iM2091a = iM2094b8 + m2091a(iM2091a2) + m2095b(iM2091a2, iM2091a3, iM2091a4);
            i6 = i18 + 1;
        }
        this.f3555b += iM2091a;
        this.f3556c += iM2091a2;
        this.f3557d += iM2091a3;
        this.f3558e += iM2091a4;
        this.f3559f += i2;
        this.f3560g += i3;
        this.f3561h += i4;
        this.f3562i += i5;
        this.f3564k = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.f3563j[i19] = 0;
        }
    }
}
