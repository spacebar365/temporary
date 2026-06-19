package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0835l extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3499a;

    /* JADX INFO: renamed from: b */
    private int f3500b;

    /* JADX INFO: renamed from: c */
    private int f3501c;

    /* JADX INFO: renamed from: d */
    private int f3502d;

    /* JADX INFO: renamed from: e */
    private int[] f3503e;

    /* JADX INFO: renamed from: f */
    private int f3504f;

    public C0835l() {
        this.f3503e = new int[16];
        mo1931c();
    }

    public C0835l(C0835l c0835l) {
        super(c0835l);
        this.f3503e = new int[16];
        m2044a(c0835l);
    }

    /* JADX INFO: renamed from: a */
    private static int m2041a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2042a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2043a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2044a(C0835l c0835l) {
        super.m2016a((AbstractC0831h) c0835l);
        this.f3499a = c0835l.f3499a;
        this.f3500b = c0835l.f3500b;
        this.f3501c = c0835l.f3501c;
        this.f3502d = c0835l.f3502d;
        System.arraycopy(c0835l.f3503e, 0, this.f3503e, 0, c0835l.f3503e.length);
        this.f3504f = c0835l.f3504f;
    }

    /* JADX INFO: renamed from: b */
    private static int m2045b(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        m2043a(this.f3499a, bArr, i);
        m2043a(this.f3500b, bArr, i + 4);
        m2043a(this.f3501c, bArr, i + 8);
        m2043a(this.f3502d, bArr, i + 12);
        mo1931c();
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "MD4";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3504f > 14) {
            mo1942g();
        }
        this.f3503e[14] = (int) ((-1) & j);
        this.f3503e[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2044a((C0835l) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int[] iArr = this.f3503e;
        int i2 = this.f3504f;
        this.f3504f = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f3504f == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3499a = 1732584193;
        this.f3500b = -271733879;
        this.f3501c = -1732584194;
        this.f3502d = 271733878;
        this.f3504f = 0;
        for (int i = 0; i != this.f3503e.length; i++) {
            this.f3503e[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0835l(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        int i = this.f3499a;
        int i2 = this.f3500b;
        int i3 = this.f3501c;
        int i4 = this.f3502d;
        int iM2041a = m2041a(i + m2042a(i2, i3, i4) + this.f3503e[0], 3);
        int iM2041a2 = m2041a(i4 + m2042a(iM2041a, i2, i3) + this.f3503e[1], 7);
        int iM2041a3 = m2041a(i3 + m2042a(iM2041a2, iM2041a, i2) + this.f3503e[2], 11);
        int iM2041a4 = m2041a(i2 + m2042a(iM2041a3, iM2041a2, iM2041a) + this.f3503e[3], 19);
        int iM2041a5 = m2041a(iM2041a + m2042a(iM2041a4, iM2041a3, iM2041a2) + this.f3503e[4], 3);
        int iM2041a6 = m2041a(iM2041a2 + m2042a(iM2041a5, iM2041a4, iM2041a3) + this.f3503e[5], 7);
        int iM2041a7 = m2041a(iM2041a3 + m2042a(iM2041a6, iM2041a5, iM2041a4) + this.f3503e[6], 11);
        int iM2041a8 = m2041a(iM2041a4 + m2042a(iM2041a7, iM2041a6, iM2041a5) + this.f3503e[7], 19);
        int iM2041a9 = m2041a(iM2041a5 + m2042a(iM2041a8, iM2041a7, iM2041a6) + this.f3503e[8], 3);
        int iM2041a10 = m2041a(iM2041a6 + m2042a(iM2041a9, iM2041a8, iM2041a7) + this.f3503e[9], 7);
        int iM2041a11 = m2041a(iM2041a7 + m2042a(iM2041a10, iM2041a9, iM2041a8) + this.f3503e[10], 11);
        int iM2041a12 = m2041a(iM2041a8 + m2042a(iM2041a11, iM2041a10, iM2041a9) + this.f3503e[11], 19);
        int iM2041a13 = m2041a(iM2041a9 + m2042a(iM2041a12, iM2041a11, iM2041a10) + this.f3503e[12], 3);
        int iM2041a14 = m2041a(iM2041a10 + m2042a(iM2041a13, iM2041a12, iM2041a11) + this.f3503e[13], 7);
        int iM2041a15 = m2041a(iM2041a11 + m2042a(iM2041a14, iM2041a13, iM2041a12) + this.f3503e[14], 11);
        int iM2041a16 = m2041a(iM2041a12 + m2042a(iM2041a15, iM2041a14, iM2041a13) + this.f3503e[15], 19);
        int iM2041a17 = m2041a(iM2041a13 + m2045b(iM2041a16, iM2041a15, iM2041a14) + this.f3503e[0] + 1518500249, 3);
        int iM2041a18 = m2041a(iM2041a14 + m2045b(iM2041a17, iM2041a16, iM2041a15) + this.f3503e[4] + 1518500249, 5);
        int iM2041a19 = m2041a(iM2041a15 + m2045b(iM2041a18, iM2041a17, iM2041a16) + this.f3503e[8] + 1518500249, 9);
        int iM2041a20 = m2041a(iM2041a16 + m2045b(iM2041a19, iM2041a18, iM2041a17) + this.f3503e[12] + 1518500249, 13);
        int iM2041a21 = m2041a(iM2041a17 + m2045b(iM2041a20, iM2041a19, iM2041a18) + this.f3503e[1] + 1518500249, 3);
        int iM2041a22 = m2041a(iM2041a18 + m2045b(iM2041a21, iM2041a20, iM2041a19) + this.f3503e[5] + 1518500249, 5);
        int iM2041a23 = m2041a(iM2041a19 + m2045b(iM2041a22, iM2041a21, iM2041a20) + this.f3503e[9] + 1518500249, 9);
        int iM2041a24 = m2041a(iM2041a20 + m2045b(iM2041a23, iM2041a22, iM2041a21) + this.f3503e[13] + 1518500249, 13);
        int iM2041a25 = m2041a(iM2041a21 + m2045b(iM2041a24, iM2041a23, iM2041a22) + this.f3503e[2] + 1518500249, 3);
        int iM2041a26 = m2041a(iM2041a22 + m2045b(iM2041a25, iM2041a24, iM2041a23) + this.f3503e[6] + 1518500249, 5);
        int iM2041a27 = m2041a(iM2041a23 + m2045b(iM2041a26, iM2041a25, iM2041a24) + this.f3503e[10] + 1518500249, 9);
        int iM2041a28 = m2041a(iM2041a24 + m2045b(iM2041a27, iM2041a26, iM2041a25) + this.f3503e[14] + 1518500249, 13);
        int iM2041a29 = m2041a(iM2041a25 + m2045b(iM2041a28, iM2041a27, iM2041a26) + this.f3503e[3] + 1518500249, 3);
        int iM2041a30 = m2041a(iM2041a26 + m2045b(iM2041a29, iM2041a28, iM2041a27) + this.f3503e[7] + 1518500249, 5);
        int iM2041a31 = m2041a(iM2041a27 + m2045b(iM2041a30, iM2041a29, iM2041a28) + this.f3503e[11] + 1518500249, 9);
        int iM2041a32 = m2041a(iM2041a28 + m2045b(iM2041a31, iM2041a30, iM2041a29) + this.f3503e[15] + 1518500249, 13);
        int iM2041a33 = m2041a(iM2041a29 + ((iM2041a32 ^ iM2041a31) ^ iM2041a30) + this.f3503e[0] + 1859775393, 3);
        int iM2041a34 = m2041a(iM2041a30 + ((iM2041a33 ^ iM2041a32) ^ iM2041a31) + this.f3503e[8] + 1859775393, 9);
        int iM2041a35 = m2041a(iM2041a31 + ((iM2041a34 ^ iM2041a33) ^ iM2041a32) + this.f3503e[4] + 1859775393, 11);
        int iM2041a36 = m2041a(iM2041a32 + ((iM2041a35 ^ iM2041a34) ^ iM2041a33) + this.f3503e[12] + 1859775393, 15);
        int iM2041a37 = m2041a(iM2041a33 + ((iM2041a36 ^ iM2041a35) ^ iM2041a34) + this.f3503e[2] + 1859775393, 3);
        int iM2041a38 = m2041a(iM2041a34 + ((iM2041a37 ^ iM2041a36) ^ iM2041a35) + this.f3503e[10] + 1859775393, 9);
        int iM2041a39 = m2041a(iM2041a35 + ((iM2041a38 ^ iM2041a37) ^ iM2041a36) + this.f3503e[6] + 1859775393, 11);
        int iM2041a40 = m2041a(iM2041a36 + ((iM2041a39 ^ iM2041a38) ^ iM2041a37) + this.f3503e[14] + 1859775393, 15);
        int iM2041a41 = m2041a(iM2041a37 + ((iM2041a40 ^ iM2041a39) ^ iM2041a38) + this.f3503e[1] + 1859775393, 3);
        int iM2041a42 = m2041a(iM2041a38 + ((iM2041a41 ^ iM2041a40) ^ iM2041a39) + this.f3503e[9] + 1859775393, 9);
        int iM2041a43 = m2041a(iM2041a39 + ((iM2041a42 ^ iM2041a41) ^ iM2041a40) + this.f3503e[5] + 1859775393, 11);
        int iM2041a44 = m2041a(iM2041a40 + ((iM2041a43 ^ iM2041a42) ^ iM2041a41) + this.f3503e[13] + 1859775393, 15);
        int iM2041a45 = m2041a(iM2041a41 + ((iM2041a44 ^ iM2041a43) ^ iM2041a42) + this.f3503e[3] + 1859775393, 3);
        int iM2041a46 = m2041a(iM2041a42 + ((iM2041a45 ^ iM2041a44) ^ iM2041a43) + this.f3503e[11] + 1859775393, 9);
        int iM2041a47 = m2041a(iM2041a43 + ((iM2041a46 ^ iM2041a45) ^ iM2041a44) + this.f3503e[7] + 1859775393, 11);
        int iM2041a48 = m2041a(iM2041a44 + ((iM2041a47 ^ iM2041a46) ^ iM2041a45) + this.f3503e[15] + 1859775393, 15);
        this.f3499a = iM2041a45 + this.f3499a;
        this.f3500b += iM2041a48;
        this.f3501c += iM2041a47;
        this.f3502d += iM2041a46;
        this.f3504f = 0;
        for (int i5 = 0; i5 != this.f3503e.length; i5++) {
            this.f3503e[i5] = 0;
        }
    }
}
