package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0844u extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    static final int[] f3565a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: b */
    private int f3566b;

    /* JADX INFO: renamed from: c */
    private int f3567c;

    /* JADX INFO: renamed from: d */
    private int f3568d;

    /* JADX INFO: renamed from: e */
    private int f3569e;

    /* JADX INFO: renamed from: f */
    private int f3570f;

    /* JADX INFO: renamed from: g */
    private int f3571g;

    /* JADX INFO: renamed from: h */
    private int f3572h;

    /* JADX INFO: renamed from: i */
    private int f3573i;

    /* JADX INFO: renamed from: j */
    private int[] f3574j;

    /* JADX INFO: renamed from: k */
    private int f3575k;

    public C0844u() {
        this.f3574j = new int[64];
        mo1931c();
    }

    public C0844u(C0844u c0844u) {
        super(c0844u);
        this.f3574j = new int[64];
        m2100a(c0844u);
    }

    /* JADX INFO: renamed from: a */
    private static int m2098a(int i) {
        return (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19))) ^ ((i >>> 22) | (i << 10));
    }

    /* JADX INFO: renamed from: a */
    private static int m2099a(int i, int i2, int i3) {
        return (i & i2) ^ ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private void m2100a(C0844u c0844u) {
        super.m2016a((AbstractC0831h) c0844u);
        this.f3566b = c0844u.f3566b;
        this.f3567c = c0844u.f3567c;
        this.f3568d = c0844u.f3568d;
        this.f3569e = c0844u.f3569e;
        this.f3570f = c0844u.f3570f;
        this.f3571g = c0844u.f3571g;
        this.f3572h = c0844u.f3572h;
        this.f3573i = c0844u.f3573i;
        System.arraycopy(c0844u.f3574j, 0, this.f3574j, 0, c0844u.f3574j.length);
        this.f3575k = c0844u.f3575k;
    }

    /* JADX INFO: renamed from: b */
    private static int m2101b(int i) {
        return (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21))) ^ ((i >>> 25) | (i << 7));
    }

    /* JADX INFO: renamed from: b */
    private static int m2102b(int i, int i2, int i3) {
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    /* JADX INFO: renamed from: c */
    private static int m2103c(int i) {
        return (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14))) ^ (i >>> 3);
    }

    /* JADX INFO: renamed from: d */
    private static int m2104d(int i) {
        return (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13))) ^ (i >>> 10);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        AbstractC1556g.m4136a(this.f3566b, bArr, i);
        AbstractC1556g.m4136a(this.f3567c, bArr, i + 4);
        AbstractC1556g.m4136a(this.f3568d, bArr, i + 8);
        AbstractC1556g.m4136a(this.f3569e, bArr, i + 12);
        AbstractC1556g.m4136a(this.f3570f, bArr, i + 16);
        AbstractC1556g.m4136a(this.f3571g, bArr, i + 20);
        AbstractC1556g.m4136a(this.f3572h, bArr, i + 24);
        AbstractC1556g.m4136a(this.f3573i, bArr, i + 28);
        mo1931c();
        return 32;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3575k > 14) {
            mo1942g();
        }
        this.f3574j[14] = (int) (j >>> 32);
        this.f3574j[15] = (int) ((-1) & j);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2100a((C0844u) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 32;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.f3574j[this.f3575k] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        int i5 = this.f3575k + 1;
        this.f3575k = i5;
        if (i5 == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3566b = 1779033703;
        this.f3567c = -1150833019;
        this.f3568d = 1013904242;
        this.f3569e = -1521486534;
        this.f3570f = 1359893119;
        this.f3571g = -1694144372;
        this.f3572h = 528734635;
        this.f3573i = 1541459225;
        this.f3575k = 0;
        for (int i = 0; i != this.f3574j.length; i++) {
            this.f3574j[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0844u(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f3574j;
            iArr[i] = m2104d(iArr[i - 2]) + this.f3574j[i - 7] + m2103c(this.f3574j[i - 15]) + this.f3574j[i - 16];
        }
        int iM2098a = this.f3566b;
        int iM2098a2 = this.f3567c;
        int iM2098a3 = this.f3568d;
        int iM2098a4 = this.f3569e;
        int i2 = this.f3570f;
        int i3 = this.f3571g;
        int i4 = this.f3572h;
        int i5 = this.f3573i;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iM2101b = i5 + m2101b(i2) + m2099a(i2, i3, i4) + f3565a[i6] + this.f3574j[i6];
            int i8 = iM2098a4 + iM2101b;
            int iM2098a5 = iM2101b + m2098a(iM2098a) + m2102b(iM2098a, iM2098a2, iM2098a3);
            int i9 = i6 + 1;
            int iM2101b2 = i4 + m2101b(i8) + m2099a(i8, i2, i3) + f3565a[i9] + this.f3574j[i9];
            int i10 = iM2098a3 + iM2101b2;
            int iM2098a6 = iM2101b2 + m2098a(iM2098a5) + m2102b(iM2098a5, iM2098a, iM2098a2);
            int i11 = i9 + 1;
            int iM2101b3 = i3 + m2101b(i10) + m2099a(i10, i8, i2) + f3565a[i11] + this.f3574j[i11];
            int i12 = iM2098a2 + iM2101b3;
            int iM2098a7 = iM2101b3 + m2098a(iM2098a6) + m2102b(iM2098a6, iM2098a5, iM2098a);
            int i13 = i11 + 1;
            int iM2101b4 = i2 + m2101b(i12) + m2099a(i12, i10, i8) + f3565a[i13] + this.f3574j[i13];
            int i14 = iM2098a + iM2101b4;
            int iM2098a8 = iM2101b4 + m2098a(iM2098a7) + m2102b(iM2098a7, iM2098a6, iM2098a5);
            int i15 = i13 + 1;
            int iM2101b5 = i8 + m2101b(i14) + m2099a(i14, i12, i10) + f3565a[i15] + this.f3574j[i15];
            i5 = iM2098a5 + iM2101b5;
            iM2098a4 = iM2101b5 + m2098a(iM2098a8) + m2102b(iM2098a8, iM2098a7, iM2098a6);
            int i16 = i15 + 1;
            int iM2101b6 = i10 + m2101b(i5) + m2099a(i5, i14, i12) + f3565a[i16] + this.f3574j[i16];
            i4 = iM2098a6 + iM2101b6;
            iM2098a3 = iM2101b6 + m2098a(iM2098a4) + m2102b(iM2098a4, iM2098a8, iM2098a7);
            int i17 = i16 + 1;
            int iM2101b7 = i12 + m2101b(i4) + m2099a(i4, i5, i14) + f3565a[i17] + this.f3574j[i17];
            i3 = iM2098a7 + iM2101b7;
            iM2098a2 = iM2101b7 + m2098a(iM2098a3) + m2102b(iM2098a3, iM2098a4, iM2098a8);
            int i18 = i17 + 1;
            int iM2101b8 = i14 + m2101b(i3) + m2099a(i3, i4, i5) + f3565a[i18] + this.f3574j[i18];
            i2 = iM2098a8 + iM2101b8;
            iM2098a = iM2101b8 + m2098a(iM2098a2) + m2102b(iM2098a2, iM2098a3, iM2098a4);
            i6 = i18 + 1;
        }
        this.f3566b += iM2098a;
        this.f3567c += iM2098a2;
        this.f3568d += iM2098a3;
        this.f3569e += iM2098a4;
        this.f3570f += i2;
        this.f3571g += i3;
        this.f3572h += i4;
        this.f3573i += i5;
        this.f3575k = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.f3574j[i19] = 0;
        }
    }
}
