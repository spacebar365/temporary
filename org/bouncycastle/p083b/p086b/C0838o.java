package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0838o extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3512a;

    /* JADX INFO: renamed from: b */
    private int f3513b;

    /* JADX INFO: renamed from: c */
    private int f3514c;

    /* JADX INFO: renamed from: d */
    private int f3515d;

    /* JADX INFO: renamed from: e */
    private int[] f3516e;

    /* JADX INFO: renamed from: f */
    private int f3517f;

    public C0838o() {
        this.f3516e = new int[16];
        mo1931c();
    }

    public C0838o(C0838o c0838o) {
        super(c0838o);
        this.f3516e = new int[16];
        m2056a(c0838o);
    }

    /* JADX INFO: renamed from: a */
    private static int m2052a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2053a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2055a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2056a(C0838o c0838o) {
        super.m2016a((AbstractC0831h) c0838o);
        this.f3512a = c0838o.f3512a;
        this.f3513b = c0838o.f3513b;
        this.f3514c = c0838o.f3514c;
        this.f3515d = c0838o.f3515d;
        System.arraycopy(c0838o.f3516e, 0, this.f3516e, 0, c0838o.f3516e.length);
        this.f3517f = c0838o.f3517f;
    }

    /* JADX INFO: renamed from: b */
    private static int m2057b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    /* JADX INFO: renamed from: b */
    private static int m2058b(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a(m2053a(i2, i3, i4) + i + i5 + 1518500249, i6);
    }

    /* JADX INFO: renamed from: d */
    private static int m2060d(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a(((m2057b(i2, i3, i4) + i) + i5) - 1894007588, i6);
    }

    /* JADX INFO: renamed from: f */
    private static int m2062f(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a(m2053a(i2, i3, i4) + i + i5 + 1836072691, i6);
    }

    /* JADX INFO: renamed from: h */
    private static int m2064h(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a(m2057b(i2, i3, i4) + i + i5 + 1352829926, i6);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        m2055a(this.f3512a, bArr, i);
        m2055a(this.f3513b, bArr, i + 4);
        m2055a(this.f3514c, bArr, i + 8);
        m2055a(this.f3515d, bArr, i + 12);
        mo1931c();
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3517f > 14) {
            mo1942g();
        }
        this.f3516e[14] = (int) ((-1) & j);
        this.f3516e[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2056a((C0838o) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int[] iArr = this.f3516e;
        int i2 = this.f3517f;
        this.f3517f = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f3517f == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3512a = 1732584193;
        this.f3513b = -271733879;
        this.f3514c = -1732584194;
        this.f3515d = 271733878;
        this.f3517f = 0;
        for (int i = 0; i != this.f3516e.length; i++) {
            this.f3516e[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0838o(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        int i = this.f3512a;
        int i2 = this.f3513b;
        int i3 = this.f3514c;
        int i4 = this.f3515d;
        int iM2054a = m2054a(i, i2, i3, i4, this.f3516e[0], 11);
        int iM2054a2 = m2054a(i4, iM2054a, i2, i3, this.f3516e[1], 14);
        int iM2054a3 = m2054a(i3, iM2054a2, iM2054a, i2, this.f3516e[2], 15);
        int iM2054a4 = m2054a(i2, iM2054a3, iM2054a2, iM2054a, this.f3516e[3], 12);
        int iM2054a5 = m2054a(iM2054a, iM2054a4, iM2054a3, iM2054a2, this.f3516e[4], 5);
        int iM2054a6 = m2054a(iM2054a2, iM2054a5, iM2054a4, iM2054a3, this.f3516e[5], 8);
        int iM2054a7 = m2054a(iM2054a3, iM2054a6, iM2054a5, iM2054a4, this.f3516e[6], 7);
        int iM2054a8 = m2054a(iM2054a4, iM2054a7, iM2054a6, iM2054a5, this.f3516e[7], 9);
        int iM2054a9 = m2054a(iM2054a5, iM2054a8, iM2054a7, iM2054a6, this.f3516e[8], 11);
        int iM2054a10 = m2054a(iM2054a6, iM2054a9, iM2054a8, iM2054a7, this.f3516e[9], 13);
        int iM2054a11 = m2054a(iM2054a7, iM2054a10, iM2054a9, iM2054a8, this.f3516e[10], 14);
        int iM2054a12 = m2054a(iM2054a8, iM2054a11, iM2054a10, iM2054a9, this.f3516e[11], 15);
        int iM2054a13 = m2054a(iM2054a9, iM2054a12, iM2054a11, iM2054a10, this.f3516e[12], 6);
        int iM2054a14 = m2054a(iM2054a10, iM2054a13, iM2054a12, iM2054a11, this.f3516e[13], 7);
        int iM2054a15 = m2054a(iM2054a11, iM2054a14, iM2054a13, iM2054a12, this.f3516e[14], 9);
        int iM2054a16 = m2054a(iM2054a12, iM2054a15, iM2054a14, iM2054a13, this.f3516e[15], 8);
        int iM2058b = m2058b(iM2054a13, iM2054a16, iM2054a15, iM2054a14, this.f3516e[7], 7);
        int iM2058b2 = m2058b(iM2054a14, iM2058b, iM2054a16, iM2054a15, this.f3516e[4], 6);
        int iM2058b3 = m2058b(iM2054a15, iM2058b2, iM2058b, iM2054a16, this.f3516e[13], 8);
        int iM2058b4 = m2058b(iM2054a16, iM2058b3, iM2058b2, iM2058b, this.f3516e[1], 13);
        int iM2058b5 = m2058b(iM2058b, iM2058b4, iM2058b3, iM2058b2, this.f3516e[10], 11);
        int iM2058b6 = m2058b(iM2058b2, iM2058b5, iM2058b4, iM2058b3, this.f3516e[6], 9);
        int iM2058b7 = m2058b(iM2058b3, iM2058b6, iM2058b5, iM2058b4, this.f3516e[15], 7);
        int iM2058b8 = m2058b(iM2058b4, iM2058b7, iM2058b6, iM2058b5, this.f3516e[3], 15);
        int iM2058b9 = m2058b(iM2058b5, iM2058b8, iM2058b7, iM2058b6, this.f3516e[12], 7);
        int iM2058b10 = m2058b(iM2058b6, iM2058b9, iM2058b8, iM2058b7, this.f3516e[0], 12);
        int iM2058b11 = m2058b(iM2058b7, iM2058b10, iM2058b9, iM2058b8, this.f3516e[9], 15);
        int iM2058b12 = m2058b(iM2058b8, iM2058b11, iM2058b10, iM2058b9, this.f3516e[5], 9);
        int iM2058b13 = m2058b(iM2058b9, iM2058b12, iM2058b11, iM2058b10, this.f3516e[2], 11);
        int iM2058b14 = m2058b(iM2058b10, iM2058b13, iM2058b12, iM2058b11, this.f3516e[14], 7);
        int iM2058b15 = m2058b(iM2058b11, iM2058b14, iM2058b13, iM2058b12, this.f3516e[11], 13);
        int iM2058b16 = m2058b(iM2058b12, iM2058b15, iM2058b14, iM2058b13, this.f3516e[8], 12);
        int iM2059c = m2059c(iM2058b13, iM2058b16, iM2058b15, iM2058b14, this.f3516e[3], 11);
        int iM2059c2 = m2059c(iM2058b14, iM2059c, iM2058b16, iM2058b15, this.f3516e[10], 13);
        int iM2059c3 = m2059c(iM2058b15, iM2059c2, iM2059c, iM2058b16, this.f3516e[14], 6);
        int iM2059c4 = m2059c(iM2058b16, iM2059c3, iM2059c2, iM2059c, this.f3516e[4], 7);
        int iM2059c5 = m2059c(iM2059c, iM2059c4, iM2059c3, iM2059c2, this.f3516e[9], 14);
        int iM2059c6 = m2059c(iM2059c2, iM2059c5, iM2059c4, iM2059c3, this.f3516e[15], 9);
        int iM2059c7 = m2059c(iM2059c3, iM2059c6, iM2059c5, iM2059c4, this.f3516e[8], 13);
        int iM2059c8 = m2059c(iM2059c4, iM2059c7, iM2059c6, iM2059c5, this.f3516e[1], 15);
        int iM2059c9 = m2059c(iM2059c5, iM2059c8, iM2059c7, iM2059c6, this.f3516e[2], 14);
        int iM2059c10 = m2059c(iM2059c6, iM2059c9, iM2059c8, iM2059c7, this.f3516e[7], 8);
        int iM2059c11 = m2059c(iM2059c7, iM2059c10, iM2059c9, iM2059c8, this.f3516e[0], 13);
        int iM2059c12 = m2059c(iM2059c8, iM2059c11, iM2059c10, iM2059c9, this.f3516e[6], 6);
        int iM2059c13 = m2059c(iM2059c9, iM2059c12, iM2059c11, iM2059c10, this.f3516e[13], 5);
        int iM2059c14 = m2059c(iM2059c10, iM2059c13, iM2059c12, iM2059c11, this.f3516e[11], 12);
        int iM2059c15 = m2059c(iM2059c11, iM2059c14, iM2059c13, iM2059c12, this.f3516e[5], 7);
        int iM2059c16 = m2059c(iM2059c12, iM2059c15, iM2059c14, iM2059c13, this.f3516e[12], 5);
        int iM2060d = m2060d(iM2059c13, iM2059c16, iM2059c15, iM2059c14, this.f3516e[1], 11);
        int iM2060d2 = m2060d(iM2059c14, iM2060d, iM2059c16, iM2059c15, this.f3516e[9], 12);
        int iM2060d3 = m2060d(iM2059c15, iM2060d2, iM2060d, iM2059c16, this.f3516e[11], 14);
        int iM2060d4 = m2060d(iM2059c16, iM2060d3, iM2060d2, iM2060d, this.f3516e[10], 15);
        int iM2060d5 = m2060d(iM2060d, iM2060d4, iM2060d3, iM2060d2, this.f3516e[0], 14);
        int iM2060d6 = m2060d(iM2060d2, iM2060d5, iM2060d4, iM2060d3, this.f3516e[8], 15);
        int iM2060d7 = m2060d(iM2060d3, iM2060d6, iM2060d5, iM2060d4, this.f3516e[12], 9);
        int iM2060d8 = m2060d(iM2060d4, iM2060d7, iM2060d6, iM2060d5, this.f3516e[4], 8);
        int iM2060d9 = m2060d(iM2060d5, iM2060d8, iM2060d7, iM2060d6, this.f3516e[13], 9);
        int iM2060d10 = m2060d(iM2060d6, iM2060d9, iM2060d8, iM2060d7, this.f3516e[3], 14);
        int iM2060d11 = m2060d(iM2060d7, iM2060d10, iM2060d9, iM2060d8, this.f3516e[7], 5);
        int iM2060d12 = m2060d(iM2060d8, iM2060d11, iM2060d10, iM2060d9, this.f3516e[15], 6);
        int iM2060d13 = m2060d(iM2060d9, iM2060d12, iM2060d11, iM2060d10, this.f3516e[14], 8);
        int iM2060d14 = m2060d(iM2060d10, iM2060d13, iM2060d12, iM2060d11, this.f3516e[5], 6);
        int iM2060d15 = m2060d(iM2060d11, iM2060d14, iM2060d13, iM2060d12, this.f3516e[6], 5);
        int iM2060d16 = m2060d(iM2060d12, iM2060d15, iM2060d14, iM2060d13, this.f3516e[2], 12);
        int iM2064h = m2064h(i, i2, i3, i4, this.f3516e[5], 8);
        int iM2064h2 = m2064h(i4, iM2064h, i2, i3, this.f3516e[14], 9);
        int iM2064h3 = m2064h(i3, iM2064h2, iM2064h, i2, this.f3516e[7], 9);
        int iM2064h4 = m2064h(i2, iM2064h3, iM2064h2, iM2064h, this.f3516e[0], 11);
        int iM2064h5 = m2064h(iM2064h, iM2064h4, iM2064h3, iM2064h2, this.f3516e[9], 13);
        int iM2064h6 = m2064h(iM2064h2, iM2064h5, iM2064h4, iM2064h3, this.f3516e[2], 15);
        int iM2064h7 = m2064h(iM2064h3, iM2064h6, iM2064h5, iM2064h4, this.f3516e[11], 15);
        int iM2064h8 = m2064h(iM2064h4, iM2064h7, iM2064h6, iM2064h5, this.f3516e[4], 5);
        int iM2064h9 = m2064h(iM2064h5, iM2064h8, iM2064h7, iM2064h6, this.f3516e[13], 7);
        int iM2064h10 = m2064h(iM2064h6, iM2064h9, iM2064h8, iM2064h7, this.f3516e[6], 7);
        int iM2064h11 = m2064h(iM2064h7, iM2064h10, iM2064h9, iM2064h8, this.f3516e[15], 8);
        int iM2064h12 = m2064h(iM2064h8, iM2064h11, iM2064h10, iM2064h9, this.f3516e[8], 11);
        int iM2064h13 = m2064h(iM2064h9, iM2064h12, iM2064h11, iM2064h10, this.f3516e[1], 14);
        int iM2064h14 = m2064h(iM2064h10, iM2064h13, iM2064h12, iM2064h11, this.f3516e[10], 14);
        int iM2064h15 = m2064h(iM2064h11, iM2064h14, iM2064h13, iM2064h12, this.f3516e[3], 12);
        int iM2064h16 = m2064h(iM2064h12, iM2064h15, iM2064h14, iM2064h13, this.f3516e[12], 6);
        int iM2063g = m2063g(iM2064h13, iM2064h16, iM2064h15, iM2064h14, this.f3516e[6], 9);
        int iM2063g2 = m2063g(iM2064h14, iM2063g, iM2064h16, iM2064h15, this.f3516e[11], 13);
        int iM2063g3 = m2063g(iM2064h15, iM2063g2, iM2063g, iM2064h16, this.f3516e[3], 15);
        int iM2063g4 = m2063g(iM2064h16, iM2063g3, iM2063g2, iM2063g, this.f3516e[7], 7);
        int iM2063g5 = m2063g(iM2063g, iM2063g4, iM2063g3, iM2063g2, this.f3516e[0], 12);
        int iM2063g6 = m2063g(iM2063g2, iM2063g5, iM2063g4, iM2063g3, this.f3516e[13], 8);
        int iM2063g7 = m2063g(iM2063g3, iM2063g6, iM2063g5, iM2063g4, this.f3516e[5], 9);
        int iM2063g8 = m2063g(iM2063g4, iM2063g7, iM2063g6, iM2063g5, this.f3516e[10], 11);
        int iM2063g9 = m2063g(iM2063g5, iM2063g8, iM2063g7, iM2063g6, this.f3516e[14], 7);
        int iM2063g10 = m2063g(iM2063g6, iM2063g9, iM2063g8, iM2063g7, this.f3516e[15], 7);
        int iM2063g11 = m2063g(iM2063g7, iM2063g10, iM2063g9, iM2063g8, this.f3516e[8], 12);
        int iM2063g12 = m2063g(iM2063g8, iM2063g11, iM2063g10, iM2063g9, this.f3516e[12], 7);
        int iM2063g13 = m2063g(iM2063g9, iM2063g12, iM2063g11, iM2063g10, this.f3516e[4], 6);
        int iM2063g14 = m2063g(iM2063g10, iM2063g13, iM2063g12, iM2063g11, this.f3516e[9], 15);
        int iM2063g15 = m2063g(iM2063g11, iM2063g14, iM2063g13, iM2063g12, this.f3516e[1], 13);
        int iM2063g16 = m2063g(iM2063g12, iM2063g15, iM2063g14, iM2063g13, this.f3516e[2], 11);
        int iM2062f = m2062f(iM2063g13, iM2063g16, iM2063g15, iM2063g14, this.f3516e[15], 9);
        int iM2062f2 = m2062f(iM2063g14, iM2062f, iM2063g16, iM2063g15, this.f3516e[5], 7);
        int iM2062f3 = m2062f(iM2063g15, iM2062f2, iM2062f, iM2063g16, this.f3516e[1], 15);
        int iM2062f4 = m2062f(iM2063g16, iM2062f3, iM2062f2, iM2062f, this.f3516e[3], 11);
        int iM2062f5 = m2062f(iM2062f, iM2062f4, iM2062f3, iM2062f2, this.f3516e[7], 8);
        int iM2062f6 = m2062f(iM2062f2, iM2062f5, iM2062f4, iM2062f3, this.f3516e[14], 6);
        int iM2062f7 = m2062f(iM2062f3, iM2062f6, iM2062f5, iM2062f4, this.f3516e[6], 6);
        int iM2062f8 = m2062f(iM2062f4, iM2062f7, iM2062f6, iM2062f5, this.f3516e[9], 14);
        int iM2062f9 = m2062f(iM2062f5, iM2062f8, iM2062f7, iM2062f6, this.f3516e[11], 12);
        int iM2062f10 = m2062f(iM2062f6, iM2062f9, iM2062f8, iM2062f7, this.f3516e[8], 13);
        int iM2062f11 = m2062f(iM2062f7, iM2062f10, iM2062f9, iM2062f8, this.f3516e[12], 5);
        int iM2062f12 = m2062f(iM2062f8, iM2062f11, iM2062f10, iM2062f9, this.f3516e[2], 14);
        int iM2062f13 = m2062f(iM2062f9, iM2062f12, iM2062f11, iM2062f10, this.f3516e[10], 13);
        int iM2062f14 = m2062f(iM2062f10, iM2062f13, iM2062f12, iM2062f11, this.f3516e[0], 13);
        int iM2062f15 = m2062f(iM2062f11, iM2062f14, iM2062f13, iM2062f12, this.f3516e[4], 7);
        int iM2062f16 = m2062f(iM2062f12, iM2062f15, iM2062f14, iM2062f13, this.f3516e[13], 5);
        int iM2061e = m2061e(iM2062f13, iM2062f16, iM2062f15, iM2062f14, this.f3516e[8], 15);
        int iM2061e2 = m2061e(iM2062f14, iM2061e, iM2062f16, iM2062f15, this.f3516e[6], 5);
        int iM2061e3 = m2061e(iM2062f15, iM2061e2, iM2061e, iM2062f16, this.f3516e[4], 8);
        int iM2061e4 = m2061e(iM2062f16, iM2061e3, iM2061e2, iM2061e, this.f3516e[1], 11);
        int iM2061e5 = m2061e(iM2061e, iM2061e4, iM2061e3, iM2061e2, this.f3516e[3], 14);
        int iM2061e6 = m2061e(iM2061e2, iM2061e5, iM2061e4, iM2061e3, this.f3516e[11], 14);
        int iM2061e7 = m2061e(iM2061e3, iM2061e6, iM2061e5, iM2061e4, this.f3516e[15], 6);
        int iM2061e8 = m2061e(iM2061e4, iM2061e7, iM2061e6, iM2061e5, this.f3516e[0], 14);
        int iM2061e9 = m2061e(iM2061e5, iM2061e8, iM2061e7, iM2061e6, this.f3516e[5], 6);
        int iM2061e10 = m2061e(iM2061e6, iM2061e9, iM2061e8, iM2061e7, this.f3516e[12], 9);
        int iM2061e11 = m2061e(iM2061e7, iM2061e10, iM2061e9, iM2061e8, this.f3516e[2], 12);
        int iM2061e12 = m2061e(iM2061e8, iM2061e11, iM2061e10, iM2061e9, this.f3516e[13], 9);
        int iM2061e13 = m2061e(iM2061e9, iM2061e12, iM2061e11, iM2061e10, this.f3516e[9], 12);
        int iM2061e14 = m2061e(iM2061e10, iM2061e13, iM2061e12, iM2061e11, this.f3516e[7], 5);
        int iM2061e15 = m2061e(iM2061e11, iM2061e14, iM2061e13, iM2061e12, this.f3516e[10], 15);
        int iM2061e16 = m2061e(iM2061e12, iM2061e15, iM2061e14, iM2061e13, this.f3516e[14], 8);
        int i5 = this.f3513b + iM2060d15 + iM2061e14;
        this.f3513b = this.f3514c + iM2060d14 + iM2061e13;
        this.f3514c = iM2061e16 + this.f3515d + iM2060d13;
        this.f3515d = this.f3512a + iM2060d16 + iM2061e15;
        this.f3512a = i5;
        this.f3517f = 0;
        for (int i6 = 0; i6 != this.f3516e.length; i6++) {
            this.f3516e[i6] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m2054a(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a(((i2 ^ i3) ^ i4) + i + i5, i6);
    }

    /* JADX INFO: renamed from: c */
    private static int m2059c(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a((((i3 ^ (-1)) | i2) ^ i4) + i + i5 + 1859775393, i6);
    }

    /* JADX INFO: renamed from: e */
    private static int m2061e(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a(((i2 ^ i3) ^ i4) + i + i5, i6);
    }

    /* JADX INFO: renamed from: g */
    private static int m2063g(int i, int i2, int i3, int i4, int i5, int i6) {
        return m2052a((((i3 ^ (-1)) | i2) ^ i4) + i + i5 + 1548603684, i6);
    }
}
