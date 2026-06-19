package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0840q extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3525a;

    /* JADX INFO: renamed from: b */
    private int f3526b;

    /* JADX INFO: renamed from: c */
    private int f3527c;

    /* JADX INFO: renamed from: d */
    private int f3528d;

    /* JADX INFO: renamed from: e */
    private int f3529e;

    /* JADX INFO: renamed from: f */
    private int f3530f;

    /* JADX INFO: renamed from: g */
    private int f3531g;

    /* JADX INFO: renamed from: h */
    private int f3532h;

    /* JADX INFO: renamed from: i */
    private int[] f3533i;

    /* JADX INFO: renamed from: j */
    private int f3534j;

    public C0840q() {
        this.f3533i = new int[16];
        mo1931c();
    }

    public C0840q(C0840q c0840q) {
        super(c0840q);
        this.f3533i = new int[16];
        m2074a(c0840q);
    }

    /* JADX INFO: renamed from: a */
    private static int m2070a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2071a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2073a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2074a(C0840q c0840q) {
        super.m2016a((AbstractC0831h) c0840q);
        this.f3525a = c0840q.f3525a;
        this.f3526b = c0840q.f3526b;
        this.f3527c = c0840q.f3527c;
        this.f3528d = c0840q.f3528d;
        this.f3529e = c0840q.f3529e;
        this.f3530f = c0840q.f3530f;
        this.f3531g = c0840q.f3531g;
        this.f3532h = c0840q.f3532h;
        System.arraycopy(c0840q.f3533i, 0, this.f3533i, 0, c0840q.f3533i.length);
        this.f3534j = c0840q.f3534j;
    }

    /* JADX INFO: renamed from: b */
    private static int m2075b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    /* JADX INFO: renamed from: b */
    private static int m2076b(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a(m2071a(i2, i3, i4) + i + i5 + 1518500249, i6);
    }

    /* JADX INFO: renamed from: d */
    private static int m2078d(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a(((m2075b(i2, i3, i4) + i) + i5) - 1894007588, i6);
    }

    /* JADX INFO: renamed from: f */
    private static int m2080f(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a(m2071a(i2, i3, i4) + i + i5 + 1836072691, i6);
    }

    /* JADX INFO: renamed from: h */
    private static int m2082h(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a(m2075b(i2, i3, i4) + i + i5 + 1352829926, i6);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        m2073a(this.f3525a, bArr, i);
        m2073a(this.f3526b, bArr, i + 4);
        m2073a(this.f3527c, bArr, i + 8);
        m2073a(this.f3528d, bArr, i + 12);
        m2073a(this.f3529e, bArr, i + 16);
        m2073a(this.f3530f, bArr, i + 20);
        m2073a(this.f3531g, bArr, i + 24);
        m2073a(this.f3532h, bArr, i + 28);
        mo1931c();
        return 32;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "RIPEMD256";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3534j > 14) {
            mo1942g();
        }
        this.f3533i[14] = (int) ((-1) & j);
        this.f3533i[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2074a((C0840q) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 32;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int[] iArr = this.f3533i;
        int i2 = this.f3534j;
        this.f3534j = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f3534j == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3525a = 1732584193;
        this.f3526b = -271733879;
        this.f3527c = -1732584194;
        this.f3528d = 271733878;
        this.f3529e = 1985229328;
        this.f3530f = -19088744;
        this.f3531g = -1985229329;
        this.f3532h = 19088743;
        this.f3534j = 0;
        for (int i = 0; i != this.f3533i.length; i++) {
            this.f3533i[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0840q(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        int i = this.f3525a;
        int i2 = this.f3526b;
        int i3 = this.f3527c;
        int i4 = this.f3528d;
        int i5 = this.f3529e;
        int i6 = this.f3530f;
        int i7 = this.f3531g;
        int i8 = this.f3532h;
        int iM2072a = m2072a(i, i2, i3, i4, this.f3533i[0], 11);
        int iM2072a2 = m2072a(i4, iM2072a, i2, i3, this.f3533i[1], 14);
        int iM2072a3 = m2072a(i3, iM2072a2, iM2072a, i2, this.f3533i[2], 15);
        int iM2072a4 = m2072a(i2, iM2072a3, iM2072a2, iM2072a, this.f3533i[3], 12);
        int iM2072a5 = m2072a(iM2072a, iM2072a4, iM2072a3, iM2072a2, this.f3533i[4], 5);
        int iM2072a6 = m2072a(iM2072a2, iM2072a5, iM2072a4, iM2072a3, this.f3533i[5], 8);
        int iM2072a7 = m2072a(iM2072a3, iM2072a6, iM2072a5, iM2072a4, this.f3533i[6], 7);
        int iM2072a8 = m2072a(iM2072a4, iM2072a7, iM2072a6, iM2072a5, this.f3533i[7], 9);
        int iM2072a9 = m2072a(iM2072a5, iM2072a8, iM2072a7, iM2072a6, this.f3533i[8], 11);
        int iM2072a10 = m2072a(iM2072a6, iM2072a9, iM2072a8, iM2072a7, this.f3533i[9], 13);
        int iM2072a11 = m2072a(iM2072a7, iM2072a10, iM2072a9, iM2072a8, this.f3533i[10], 14);
        int iM2072a12 = m2072a(iM2072a8, iM2072a11, iM2072a10, iM2072a9, this.f3533i[11], 15);
        int iM2072a13 = m2072a(iM2072a9, iM2072a12, iM2072a11, iM2072a10, this.f3533i[12], 6);
        int iM2072a14 = m2072a(iM2072a10, iM2072a13, iM2072a12, iM2072a11, this.f3533i[13], 7);
        int iM2072a15 = m2072a(iM2072a11, iM2072a14, iM2072a13, iM2072a12, this.f3533i[14], 9);
        int iM2072a16 = m2072a(iM2072a12, iM2072a15, iM2072a14, iM2072a13, this.f3533i[15], 8);
        int iM2082h = m2082h(i5, i6, i7, i8, this.f3533i[5], 8);
        int iM2082h2 = m2082h(i8, iM2082h, i6, i7, this.f3533i[14], 9);
        int iM2082h3 = m2082h(i7, iM2082h2, iM2082h, i6, this.f3533i[7], 9);
        int iM2082h4 = m2082h(i6, iM2082h3, iM2082h2, iM2082h, this.f3533i[0], 11);
        int iM2082h5 = m2082h(iM2082h, iM2082h4, iM2082h3, iM2082h2, this.f3533i[9], 13);
        int iM2082h6 = m2082h(iM2082h2, iM2082h5, iM2082h4, iM2082h3, this.f3533i[2], 15);
        int iM2082h7 = m2082h(iM2082h3, iM2082h6, iM2082h5, iM2082h4, this.f3533i[11], 15);
        int iM2082h8 = m2082h(iM2082h4, iM2082h7, iM2082h6, iM2082h5, this.f3533i[4], 5);
        int iM2082h9 = m2082h(iM2082h5, iM2082h8, iM2082h7, iM2082h6, this.f3533i[13], 7);
        int iM2082h10 = m2082h(iM2082h6, iM2082h9, iM2082h8, iM2082h7, this.f3533i[6], 7);
        int iM2082h11 = m2082h(iM2082h7, iM2082h10, iM2082h9, iM2082h8, this.f3533i[15], 8);
        int iM2082h12 = m2082h(iM2082h8, iM2082h11, iM2082h10, iM2082h9, this.f3533i[8], 11);
        int iM2082h13 = m2082h(iM2082h9, iM2082h12, iM2082h11, iM2082h10, this.f3533i[1], 14);
        int iM2082h14 = m2082h(iM2082h10, iM2082h13, iM2082h12, iM2082h11, this.f3533i[10], 14);
        int iM2082h15 = m2082h(iM2082h11, iM2082h14, iM2082h13, iM2082h12, this.f3533i[3], 12);
        int iM2082h16 = m2082h(iM2082h12, iM2082h15, iM2082h14, iM2082h13, this.f3533i[12], 6);
        int iM2076b = m2076b(iM2082h13, iM2072a16, iM2072a15, iM2072a14, this.f3533i[7], 7);
        int iM2076b2 = m2076b(iM2072a14, iM2076b, iM2072a16, iM2072a15, this.f3533i[4], 6);
        int iM2076b3 = m2076b(iM2072a15, iM2076b2, iM2076b, iM2072a16, this.f3533i[13], 8);
        int iM2076b4 = m2076b(iM2072a16, iM2076b3, iM2076b2, iM2076b, this.f3533i[1], 13);
        int iM2076b5 = m2076b(iM2076b, iM2076b4, iM2076b3, iM2076b2, this.f3533i[10], 11);
        int iM2076b6 = m2076b(iM2076b2, iM2076b5, iM2076b4, iM2076b3, this.f3533i[6], 9);
        int iM2076b7 = m2076b(iM2076b3, iM2076b6, iM2076b5, iM2076b4, this.f3533i[15], 7);
        int iM2076b8 = m2076b(iM2076b4, iM2076b7, iM2076b6, iM2076b5, this.f3533i[3], 15);
        int iM2076b9 = m2076b(iM2076b5, iM2076b8, iM2076b7, iM2076b6, this.f3533i[12], 7);
        int iM2076b10 = m2076b(iM2076b6, iM2076b9, iM2076b8, iM2076b7, this.f3533i[0], 12);
        int iM2076b11 = m2076b(iM2076b7, iM2076b10, iM2076b9, iM2076b8, this.f3533i[9], 15);
        int iM2076b12 = m2076b(iM2076b8, iM2076b11, iM2076b10, iM2076b9, this.f3533i[5], 9);
        int iM2076b13 = m2076b(iM2076b9, iM2076b12, iM2076b11, iM2076b10, this.f3533i[2], 11);
        int iM2076b14 = m2076b(iM2076b10, iM2076b13, iM2076b12, iM2076b11, this.f3533i[14], 7);
        int iM2076b15 = m2076b(iM2076b11, iM2076b14, iM2076b13, iM2076b12, this.f3533i[11], 13);
        int iM2076b16 = m2076b(iM2076b12, iM2076b15, iM2076b14, iM2076b13, this.f3533i[8], 12);
        int iM2081g = m2081g(iM2072a13, iM2082h16, iM2082h15, iM2082h14, this.f3533i[6], 9);
        int iM2081g2 = m2081g(iM2082h14, iM2081g, iM2082h16, iM2082h15, this.f3533i[11], 13);
        int iM2081g3 = m2081g(iM2082h15, iM2081g2, iM2081g, iM2082h16, this.f3533i[3], 15);
        int iM2081g4 = m2081g(iM2082h16, iM2081g3, iM2081g2, iM2081g, this.f3533i[7], 7);
        int iM2081g5 = m2081g(iM2081g, iM2081g4, iM2081g3, iM2081g2, this.f3533i[0], 12);
        int iM2081g6 = m2081g(iM2081g2, iM2081g5, iM2081g4, iM2081g3, this.f3533i[13], 8);
        int iM2081g7 = m2081g(iM2081g3, iM2081g6, iM2081g5, iM2081g4, this.f3533i[5], 9);
        int iM2081g8 = m2081g(iM2081g4, iM2081g7, iM2081g6, iM2081g5, this.f3533i[10], 11);
        int iM2081g9 = m2081g(iM2081g5, iM2081g8, iM2081g7, iM2081g6, this.f3533i[14], 7);
        int iM2081g10 = m2081g(iM2081g6, iM2081g9, iM2081g8, iM2081g7, this.f3533i[15], 7);
        int iM2081g11 = m2081g(iM2081g7, iM2081g10, iM2081g9, iM2081g8, this.f3533i[8], 12);
        int iM2081g12 = m2081g(iM2081g8, iM2081g11, iM2081g10, iM2081g9, this.f3533i[12], 7);
        int iM2081g13 = m2081g(iM2081g9, iM2081g12, iM2081g11, iM2081g10, this.f3533i[4], 6);
        int iM2081g14 = m2081g(iM2081g10, iM2081g13, iM2081g12, iM2081g11, this.f3533i[9], 15);
        int iM2081g15 = m2081g(iM2081g11, iM2081g14, iM2081g13, iM2081g12, this.f3533i[1], 13);
        int iM2081g16 = m2081g(iM2081g12, iM2081g15, iM2081g14, iM2081g13, this.f3533i[2], 11);
        int iM2077c = m2077c(iM2076b13, iM2081g16, iM2076b15, iM2076b14, this.f3533i[3], 11);
        int iM2077c2 = m2077c(iM2076b14, iM2077c, iM2081g16, iM2076b15, this.f3533i[10], 13);
        int iM2077c3 = m2077c(iM2076b15, iM2077c2, iM2077c, iM2081g16, this.f3533i[14], 6);
        int iM2077c4 = m2077c(iM2081g16, iM2077c3, iM2077c2, iM2077c, this.f3533i[4], 7);
        int iM2077c5 = m2077c(iM2077c, iM2077c4, iM2077c3, iM2077c2, this.f3533i[9], 14);
        int iM2077c6 = m2077c(iM2077c2, iM2077c5, iM2077c4, iM2077c3, this.f3533i[15], 9);
        int iM2077c7 = m2077c(iM2077c3, iM2077c6, iM2077c5, iM2077c4, this.f3533i[8], 13);
        int iM2077c8 = m2077c(iM2077c4, iM2077c7, iM2077c6, iM2077c5, this.f3533i[1], 15);
        int iM2077c9 = m2077c(iM2077c5, iM2077c8, iM2077c7, iM2077c6, this.f3533i[2], 14);
        int iM2077c10 = m2077c(iM2077c6, iM2077c9, iM2077c8, iM2077c7, this.f3533i[7], 8);
        int iM2077c11 = m2077c(iM2077c7, iM2077c10, iM2077c9, iM2077c8, this.f3533i[0], 13);
        int iM2077c12 = m2077c(iM2077c8, iM2077c11, iM2077c10, iM2077c9, this.f3533i[6], 6);
        int iM2077c13 = m2077c(iM2077c9, iM2077c12, iM2077c11, iM2077c10, this.f3533i[13], 5);
        int iM2077c14 = m2077c(iM2077c10, iM2077c13, iM2077c12, iM2077c11, this.f3533i[11], 12);
        int iM2077c15 = m2077c(iM2077c11, iM2077c14, iM2077c13, iM2077c12, this.f3533i[5], 7);
        int iM2077c16 = m2077c(iM2077c12, iM2077c15, iM2077c14, iM2077c13, this.f3533i[12], 5);
        int iM2080f = m2080f(iM2081g13, iM2076b16, iM2081g15, iM2081g14, this.f3533i[15], 9);
        int iM2080f2 = m2080f(iM2081g14, iM2080f, iM2076b16, iM2081g15, this.f3533i[5], 7);
        int iM2080f3 = m2080f(iM2081g15, iM2080f2, iM2080f, iM2076b16, this.f3533i[1], 15);
        int iM2080f4 = m2080f(iM2076b16, iM2080f3, iM2080f2, iM2080f, this.f3533i[3], 11);
        int iM2080f5 = m2080f(iM2080f, iM2080f4, iM2080f3, iM2080f2, this.f3533i[7], 8);
        int iM2080f6 = m2080f(iM2080f2, iM2080f5, iM2080f4, iM2080f3, this.f3533i[14], 6);
        int iM2080f7 = m2080f(iM2080f3, iM2080f6, iM2080f5, iM2080f4, this.f3533i[6], 6);
        int iM2080f8 = m2080f(iM2080f4, iM2080f7, iM2080f6, iM2080f5, this.f3533i[9], 14);
        int iM2080f9 = m2080f(iM2080f5, iM2080f8, iM2080f7, iM2080f6, this.f3533i[11], 12);
        int iM2080f10 = m2080f(iM2080f6, iM2080f9, iM2080f8, iM2080f7, this.f3533i[8], 13);
        int iM2080f11 = m2080f(iM2080f7, iM2080f10, iM2080f9, iM2080f8, this.f3533i[12], 5);
        int iM2080f12 = m2080f(iM2080f8, iM2080f11, iM2080f10, iM2080f9, this.f3533i[2], 14);
        int iM2080f13 = m2080f(iM2080f9, iM2080f12, iM2080f11, iM2080f10, this.f3533i[10], 13);
        int iM2080f14 = m2080f(iM2080f10, iM2080f13, iM2080f12, iM2080f11, this.f3533i[0], 13);
        int iM2080f15 = m2080f(iM2080f11, iM2080f14, iM2080f13, iM2080f12, this.f3533i[4], 7);
        int iM2080f16 = m2080f(iM2080f12, iM2080f15, iM2080f14, iM2080f13, this.f3533i[13], 5);
        int iM2078d = m2078d(iM2077c13, iM2077c16, iM2080f15, iM2077c14, this.f3533i[1], 11);
        int iM2078d2 = m2078d(iM2077c14, iM2078d, iM2077c16, iM2080f15, this.f3533i[9], 12);
        int iM2078d3 = m2078d(iM2080f15, iM2078d2, iM2078d, iM2077c16, this.f3533i[11], 14);
        int iM2078d4 = m2078d(iM2077c16, iM2078d3, iM2078d2, iM2078d, this.f3533i[10], 15);
        int iM2078d5 = m2078d(iM2078d, iM2078d4, iM2078d3, iM2078d2, this.f3533i[0], 14);
        int iM2078d6 = m2078d(iM2078d2, iM2078d5, iM2078d4, iM2078d3, this.f3533i[8], 15);
        int iM2078d7 = m2078d(iM2078d3, iM2078d6, iM2078d5, iM2078d4, this.f3533i[12], 9);
        int iM2078d8 = m2078d(iM2078d4, iM2078d7, iM2078d6, iM2078d5, this.f3533i[4], 8);
        int iM2078d9 = m2078d(iM2078d5, iM2078d8, iM2078d7, iM2078d6, this.f3533i[13], 9);
        int iM2078d10 = m2078d(iM2078d6, iM2078d9, iM2078d8, iM2078d7, this.f3533i[3], 14);
        int iM2078d11 = m2078d(iM2078d7, iM2078d10, iM2078d9, iM2078d8, this.f3533i[7], 5);
        int iM2078d12 = m2078d(iM2078d8, iM2078d11, iM2078d10, iM2078d9, this.f3533i[15], 6);
        int iM2078d13 = m2078d(iM2078d9, iM2078d12, iM2078d11, iM2078d10, this.f3533i[14], 8);
        int iM2078d14 = m2078d(iM2078d10, iM2078d13, iM2078d12, iM2078d11, this.f3533i[5], 6);
        int iM2078d15 = m2078d(iM2078d11, iM2078d14, iM2078d13, iM2078d12, this.f3533i[6], 5);
        int iM2078d16 = m2078d(iM2078d12, iM2078d15, iM2078d14, iM2078d13, this.f3533i[2], 12);
        int iM2079e = m2079e(iM2080f13, iM2080f16, iM2077c15, iM2080f14, this.f3533i[8], 15);
        int iM2079e2 = m2079e(iM2080f14, iM2079e, iM2080f16, iM2077c15, this.f3533i[6], 5);
        int iM2079e3 = m2079e(iM2077c15, iM2079e2, iM2079e, iM2080f16, this.f3533i[4], 8);
        int iM2079e4 = m2079e(iM2080f16, iM2079e3, iM2079e2, iM2079e, this.f3533i[1], 11);
        int iM2079e5 = m2079e(iM2079e, iM2079e4, iM2079e3, iM2079e2, this.f3533i[3], 14);
        int iM2079e6 = m2079e(iM2079e2, iM2079e5, iM2079e4, iM2079e3, this.f3533i[11], 14);
        int iM2079e7 = m2079e(iM2079e3, iM2079e6, iM2079e5, iM2079e4, this.f3533i[15], 6);
        int iM2079e8 = m2079e(iM2079e4, iM2079e7, iM2079e6, iM2079e5, this.f3533i[0], 14);
        int iM2079e9 = m2079e(iM2079e5, iM2079e8, iM2079e7, iM2079e6, this.f3533i[5], 6);
        int iM2079e10 = m2079e(iM2079e6, iM2079e9, iM2079e8, iM2079e7, this.f3533i[12], 9);
        int iM2079e11 = m2079e(iM2079e7, iM2079e10, iM2079e9, iM2079e8, this.f3533i[2], 12);
        int iM2079e12 = m2079e(iM2079e8, iM2079e11, iM2079e10, iM2079e9, this.f3533i[13], 9);
        int iM2079e13 = m2079e(iM2079e9, iM2079e12, iM2079e11, iM2079e10, this.f3533i[9], 12);
        int iM2079e14 = m2079e(iM2079e10, iM2079e13, iM2079e12, iM2079e11, this.f3533i[7], 5);
        int iM2079e15 = m2079e(iM2079e11, iM2079e14, iM2079e13, iM2079e12, this.f3533i[10], 15);
        int iM2079e16 = m2079e(iM2079e12, iM2079e15, iM2079e14, iM2079e13, this.f3533i[14], 8);
        this.f3525a += iM2078d13;
        this.f3526b = iM2078d16 + this.f3526b;
        this.f3527c += iM2078d15;
        this.f3528d += iM2079e14;
        this.f3529e += iM2079e13;
        this.f3530f += iM2079e16;
        this.f3531g += iM2079e15;
        this.f3532h += iM2078d14;
        this.f3534j = 0;
        for (int i9 = 0; i9 != this.f3533i.length; i9++) {
            this.f3533i[i9] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m2072a(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a(((i2 ^ i3) ^ i4) + i + i5, i6);
    }

    /* JADX INFO: renamed from: c */
    private static int m2077c(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a((((i3 ^ (-1)) | i2) ^ i4) + i + i5 + 1859775393, i6);
    }

    /* JADX INFO: renamed from: e */
    private static int m2079e(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a(((i2 ^ i3) ^ i4) + i + i5, i6);
    }

    /* JADX INFO: renamed from: g */
    private static int m2081g(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2070a((((i3 ^ (-1)) | i2) ^ i4) + i + i5 + 1548603684, i6);
    }
}
