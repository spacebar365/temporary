package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.C1555f;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0848y extends AbstractC0833j {

    /* JADX INFO: renamed from: j */
    private int f3576j;

    /* JADX INFO: renamed from: k */
    private long f3577k;

    /* JADX INFO: renamed from: l */
    private long f3578l;

    /* JADX INFO: renamed from: m */
    private long f3579m;

    /* JADX INFO: renamed from: n */
    private long f3580n;

    /* JADX INFO: renamed from: o */
    private long f3581o;

    /* JADX INFO: renamed from: p */
    private long f3582p;

    /* JADX INFO: renamed from: q */
    private long f3583q;

    /* JADX INFO: renamed from: r */
    private long f3584r;

    public C0848y(C0848y c0848y) {
        super(c0848y);
        this.f3576j = c0848y.f3576j;
        mo1939a((InterfaceC1554e) c0848y);
    }

    /* JADX INFO: renamed from: a */
    private static void m2105a(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(4, i3);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            } else {
                bArr[i2 + iMin] = (byte) (i >>> ((3 - iMin) * 8));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2106a(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            m2105a((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                m2105a((int) (4294967295L & j), bArr, i + 4, i2 - 4);
            }
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2037f();
        m2106a(this.f3478a, bArr, i, this.f3576j);
        m2106a(this.f3479b, bArr, i + 8, this.f3576j - 8);
        m2106a(this.f3480c, bArr, i + 16, this.f3576j - 16);
        m2106a(this.f3481d, bArr, i + 24, this.f3576j - 24);
        m2106a(this.f3482e, bArr, i + 32, this.f3576j - 32);
        m2106a(this.f3483f, bArr, i + 40, this.f3576j - 40);
        m2106a(this.f3484g, bArr, i + 48, this.f3576j - 48);
        m2106a(this.f3485h, bArr, i + 56, this.f3576j - 56);
        mo1931c();
        return this.f3576j;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA-512/" + Integer.toString(this.f3576j * 8);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        C0848y c0848y = (C0848y) interfaceC1554e;
        if (this.f3576j != c0848y.f3576j) {
            throw new C1555f("digestLength inappropriate in other");
        }
        super.m2036a((AbstractC0833j) c0848y);
        this.f3577k = c0848y.f3577k;
        this.f3578l = c0848y.f3578l;
        this.f3579m = c0848y.f3579m;
        this.f3580n = c0848y.f3580n;
        this.f3581o = c0848y.f3581o;
        this.f3582p = c0848y.f3582p;
        this.f3583q = c0848y.f3583q;
        this.f3584r = c0848y.f3584r;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return this.f3576j;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0833j, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3478a = this.f3577k;
        this.f3479b = this.f3578l;
        this.f3480c = this.f3579m;
        this.f3481d = this.f3580n;
        this.f3482e = this.f3581o;
        this.f3483f = this.f3582p;
        this.f3484g = this.f3583q;
        this.f3485h = this.f3584r;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0848y(this);
    }

    public C0848y(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        this.f3576j = i / 8;
        int i2 = this.f3576j * 8;
        this.f3478a = -3482333909917012819L;
        this.f3479b = 2216346199247487646L;
        this.f3480c = -7364697282686394994L;
        this.f3481d = 65953792586715988L;
        this.f3482e = -816286391624063116L;
        this.f3483f = 4512832404995164602L;
        this.f3484g = -5033199132376557362L;
        this.f3485h = -124578254951840548L;
        mo1928a((byte) 83);
        mo1928a((byte) 72);
        mo1928a((byte) 65);
        mo1928a((byte) 45);
        mo1928a((byte) 53);
        mo1928a((byte) 49);
        mo1928a((byte) 50);
        mo1928a((byte) 47);
        if (i2 > 100) {
            mo1928a((byte) ((i2 / 100) + 48));
            int i3 = i2 % 100;
            mo1928a((byte) ((i3 / 10) + 48));
            i2 = i3 % 10;
        } else if (i2 > 10) {
            mo1928a((byte) ((i2 / 10) + 48));
            i2 %= 10;
        }
        mo1928a((byte) (i2 + 48));
        m2037f();
        this.f3577k = this.f3478a;
        this.f3578l = this.f3479b;
        this.f3579m = this.f3480c;
        this.f3580n = this.f3481d;
        this.f3581o = this.f3482e;
        this.f3582p = this.f3483f;
        this.f3583q = this.f3484g;
        this.f3584r = this.f3485h;
        mo1931c();
    }
}
