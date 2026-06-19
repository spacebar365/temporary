package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.h.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0999l implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0890e f4123a;

    /* JADX INFO: renamed from: b */
    private final byte[] f4124b;

    /* JADX INFO: renamed from: c */
    private int f4125c;

    /* JADX INFO: renamed from: d */
    private int f4126d;

    /* JADX INFO: renamed from: e */
    private int f4127e;

    /* JADX INFO: renamed from: f */
    private int f4128f;

    /* JADX INFO: renamed from: g */
    private int f4129g;

    /* JADX INFO: renamed from: h */
    private int f4130h;

    /* JADX INFO: renamed from: i */
    private int f4131i;

    /* JADX INFO: renamed from: j */
    private int f4132j;

    /* JADX INFO: renamed from: k */
    private int f4133k;

    /* JADX INFO: renamed from: l */
    private int f4134l;

    /* JADX INFO: renamed from: m */
    private int f4135m;

    /* JADX INFO: renamed from: n */
    private int f4136n;

    /* JADX INFO: renamed from: o */
    private int f4137o;

    /* JADX INFO: renamed from: p */
    private final byte[] f4138p;

    /* JADX INFO: renamed from: q */
    private int f4139q;

    /* JADX INFO: renamed from: r */
    private int f4140r;

    /* JADX INFO: renamed from: s */
    private int f4141s;

    /* JADX INFO: renamed from: t */
    private int f4142t;

    /* JADX INFO: renamed from: u */
    private int f4143u;

    /* JADX INFO: renamed from: v */
    private int f4144v;

    public C0999l() {
        this.f4124b = new byte[1];
        this.f4138p = new byte[16];
        this.f4139q = 0;
        this.f4123a = null;
    }

    public C0999l(InterfaceC0890e interfaceC0890e) {
        this.f4124b = new byte[1];
        this.f4138p = new byte[16];
        this.f4139q = 0;
        if (interfaceC0890e.mo2125b() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.f4123a = interfaceC0890e;
    }

    /* JADX INFO: renamed from: a */
    private static final long m2466a(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    /* JADX INFO: renamed from: d */
    private void m2467d() {
        if (this.f4139q < 16) {
            this.f4138p[this.f4139q] = 1;
            int i = this.f4139q;
            while (true) {
                i++;
                if (i >= 16) {
                    break;
                } else {
                    this.f4138p[i] = 0;
                }
            }
        }
        long jM4152c = 4294967295L & ((long) AbstractC1556g.m4152c(this.f4138p, 0));
        long jM4152c2 = 4294967295L & ((long) AbstractC1556g.m4152c(this.f4138p, 4));
        long jM4152c3 = 4294967295L & ((long) AbstractC1556g.m4152c(this.f4138p, 8));
        long jM4152c4 = 4294967295L & ((long) AbstractC1556g.m4152c(this.f4138p, 12));
        this.f4140r = (int) (((long) this.f4140r) + (67108863 & jM4152c));
        this.f4141s = (int) ((((jM4152c | (jM4152c2 << 32)) >>> 26) & 67108863) + ((long) this.f4141s));
        this.f4142t = (int) (((long) this.f4142t) + (((jM4152c2 | (jM4152c3 << 32)) >>> 20) & 67108863));
        this.f4143u = (int) (((long) this.f4143u) + ((((jM4152c4 << 32) | jM4152c3) >>> 14) & 67108863));
        this.f4144v = (int) (((long) this.f4144v) + (jM4152c4 >>> 8));
        if (this.f4139q == 16) {
            this.f4144v += 16777216;
        }
        long jM2466a = m2466a(this.f4140r, this.f4125c) + m2466a(this.f4141s, this.f4133k) + m2466a(this.f4142t, this.f4132j) + m2466a(this.f4143u, this.f4131i) + m2466a(this.f4144v, this.f4130h);
        long jM2466a2 = m2466a(this.f4140r, this.f4126d) + m2466a(this.f4141s, this.f4125c) + m2466a(this.f4142t, this.f4133k) + m2466a(this.f4143u, this.f4132j) + m2466a(this.f4144v, this.f4131i);
        long jM2466a3 = m2466a(this.f4140r, this.f4127e) + m2466a(this.f4141s, this.f4126d) + m2466a(this.f4142t, this.f4125c) + m2466a(this.f4143u, this.f4133k) + m2466a(this.f4144v, this.f4132j);
        long jM2466a4 = m2466a(this.f4140r, this.f4128f) + m2466a(this.f4141s, this.f4127e) + m2466a(this.f4142t, this.f4126d) + m2466a(this.f4143u, this.f4125c) + m2466a(this.f4144v, this.f4133k);
        long jM2466a5 = m2466a(this.f4140r, this.f4129g) + m2466a(this.f4141s, this.f4128f) + m2466a(this.f4142t, this.f4127e) + m2466a(this.f4143u, this.f4126d) + m2466a(this.f4144v, this.f4125c);
        this.f4140r = ((int) jM2466a) & 67108863;
        long j = (jM2466a >>> 26) + jM2466a2;
        this.f4141s = ((int) j) & 67108863;
        long j2 = (j >>> 26) + jM2466a3;
        this.f4142t = ((int) j2) & 67108863;
        long j3 = (j2 >>> 26) + jM2466a4;
        this.f4143u = ((int) j3) & 67108863;
        long j4 = (j3 >>> 26) + jM2466a5;
        this.f4144v = ((int) j4) & 67108863;
        this.f4140r = (((int) (j4 >>> 26)) * 5) + this.f4140r;
        this.f4141s += this.f4140r >>> 26;
        this.f4140r &= 67108863;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        if (i + 16 > bArr.length) {
            throw new C0803ac("Output buffer is too short.");
        }
        if (this.f4139q > 0) {
            m2467d();
        }
        this.f4141s += this.f4140r >>> 26;
        this.f4140r &= 67108863;
        this.f4142t += this.f4141s >>> 26;
        this.f4141s &= 67108863;
        this.f4143u += this.f4142t >>> 26;
        this.f4142t &= 67108863;
        this.f4144v += this.f4143u >>> 26;
        this.f4143u &= 67108863;
        this.f4140r += (this.f4144v >>> 26) * 5;
        this.f4144v &= 67108863;
        this.f4141s += this.f4140r >>> 26;
        this.f4140r &= 67108863;
        int i2 = this.f4140r + 5;
        int i3 = (i2 >>> 26) + this.f4141s;
        int i4 = (i3 >>> 26) + this.f4142t;
        int i5 = (i4 >>> 26) + this.f4143u;
        int i6 = ((i5 >>> 26) + this.f4144v) - 67108864;
        int i7 = (i6 >>> 31) - 1;
        int i8 = i7 ^ (-1);
        this.f4140r = (i2 & 67108863 & i7) | (this.f4140r & i8);
        this.f4141s = (this.f4141s & i8) | (i3 & 67108863 & i7);
        this.f4142t = (this.f4142t & i8) | (i4 & 67108863 & i7);
        this.f4143u = (this.f4143u & i8) | (i5 & 67108863 & i7);
        this.f4144v = (this.f4144v & i8) | (i6 & i7);
        long j = (((long) (this.f4140r | (this.f4141s << 26))) & 4294967295L) + (((long) this.f4134l) & 4294967295L);
        long j2 = (((long) ((this.f4141s >>> 6) | (this.f4142t << 20))) & 4294967295L) + (((long) this.f4135m) & 4294967295L);
        long j3 = (((long) ((this.f4142t >>> 12) | (this.f4143u << 14))) & 4294967295L) + (((long) this.f4136n) & 4294967295L);
        long j4 = (((long) ((this.f4143u >>> 18) | (this.f4144v << 8))) & 4294967295L) + (((long) this.f4137o) & 4294967295L);
        AbstractC1556g.m4147b((int) j, bArr, i);
        long j5 = (j >>> 32) + j2;
        AbstractC1556g.m4147b((int) j5, bArr, i + 4);
        long j6 = (j5 >>> 32) + j3;
        AbstractC1556g.m4147b((int) j6, bArr, i + 8);
        AbstractC1556g.m4147b((int) ((j6 >>> 32) + j4), bArr, i + 12);
        mo2452c();
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4123a == null ? "Poly1305" : "Poly1305-" + this.f4123a.mo2123a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4124b[0] = b;
        mo2450a(this.f4124b, 0, 1);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            if (this.f4139q == 16) {
                m2467d();
                this.f4139q = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.f4139q);
            System.arraycopy(bArr, i3 + i, this.f4138p, this.f4139q, iMin);
            i3 += iMin;
            this.f4139q = iMin + this.f4139q;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4139q = 0;
        this.f4144v = 0;
        this.f4143u = 0;
        this.f4142t = 0;
        this.f4141s = 0;
        this.f4140r = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2612b;
        int i;
        byte[] bArr;
        byte[] bArrM2611a = null;
        if (this.f4123a == null) {
            interfaceC1003iM2612b = interfaceC1003i;
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            bArrM2611a = c1080be.m2611a();
            interfaceC1003iM2612b = c1080be.m2612b();
        }
        if (!(interfaceC1003iM2612b instanceof C1076ba)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003iM2612b).m2603a();
        if (bArrM2603a.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        if (this.f4123a != null && (bArrM2611a == null || bArrM2611a.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iM4152c = AbstractC1556g.m4152c(bArrM2603a, 0);
        int iM4152c2 = AbstractC1556g.m4152c(bArrM2603a, 4);
        int iM4152c3 = AbstractC1556g.m4152c(bArrM2603a, 8);
        int iM4152c4 = AbstractC1556g.m4152c(bArrM2603a, 12);
        this.f4125c = 67108863 & iM4152c;
        this.f4126d = ((iM4152c >>> 26) | (iM4152c2 << 6)) & 67108611;
        this.f4127e = ((iM4152c2 >>> 20) | (iM4152c3 << 12)) & 67092735;
        this.f4128f = ((iM4152c3 >>> 14) | (iM4152c4 << 18)) & 66076671;
        this.f4129g = (iM4152c4 >>> 8) & 1048575;
        this.f4130h = this.f4126d * 5;
        this.f4131i = this.f4127e * 5;
        this.f4132j = this.f4128f * 5;
        this.f4133k = this.f4129g * 5;
        if (this.f4123a == null) {
            i = 16;
            bArr = bArrM2603a;
        } else {
            byte[] bArr2 = new byte[16];
            this.f4123a.mo2124a(true, new C1076ba(bArrM2603a, 16, 16));
            this.f4123a.mo2122a(bArrM2611a, 0, bArr2, 0);
            i = 0;
            bArr = bArr2;
        }
        this.f4134l = AbstractC1556g.m4152c(bArr, i + 0);
        this.f4135m = AbstractC1556g.m4152c(bArr, i + 4);
        this.f4136n = AbstractC1556g.m4152c(bArr, i + 8);
        this.f4137o = AbstractC1556g.m4152c(bArr, i + 12);
        mo2452c();
    }
}
