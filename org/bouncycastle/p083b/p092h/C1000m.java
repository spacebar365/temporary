package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.h.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1000m implements InterfaceC1183z {

    /* JADX INFO: renamed from: c */
    protected long f4147c;

    /* JADX INFO: renamed from: d */
    protected long f4148d;

    /* JADX INFO: renamed from: e */
    protected long f4149e;

    /* JADX INFO: renamed from: f */
    protected long f4150f;

    /* JADX INFO: renamed from: g */
    protected long f4151g;

    /* JADX INFO: renamed from: h */
    protected long f4152h;

    /* JADX INFO: renamed from: i */
    protected long f4153i = 0;

    /* JADX INFO: renamed from: j */
    protected int f4154j = 0;

    /* JADX INFO: renamed from: k */
    protected int f4155k = 0;

    /* JADX INFO: renamed from: a */
    protected final int f4145a = 2;

    /* JADX INFO: renamed from: b */
    protected final int f4146b = 4;

    public C1000m() {
    }

    public C1000m(byte b) {
    }

    /* JADX INFO: renamed from: a */
    private static long m2468a(long j, int i) {
        return (j << i) | (j >>> (-i));
    }

    /* JADX INFO: renamed from: a */
    private void m2469a(int i) {
        long jM2468a = this.f4149e;
        long jM2468a2 = this.f4150f;
        long jM2468a3 = this.f4151g;
        long jM2468a4 = this.f4152h;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jM2468a + jM2468a2;
            long j2 = jM2468a3 + jM2468a4;
            long jM2468a5 = m2468a(jM2468a2, 13) ^ j;
            long jM2468a6 = m2468a(jM2468a4, 16) ^ j2;
            long j3 = j2 + jM2468a5;
            jM2468a = m2468a(j, 32) + jM2468a6;
            jM2468a2 = m2468a(jM2468a5, 17) ^ j3;
            jM2468a4 = m2468a(jM2468a6, 21) ^ jM2468a;
            jM2468a3 = m2468a(j3, 32);
        }
        this.f4149e = jM2468a;
        this.f4150f = jM2468a2;
        this.f4151g = jM2468a3;
        this.f4152h = jM2468a4;
    }

    /* JADX INFO: renamed from: d */
    private void m2470d() {
        this.f4155k++;
        this.f4152h ^= this.f4153i;
        m2469a(this.f4145a);
        this.f4149e ^= this.f4153i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return "SipHash-" + this.f4145a + "-" + this.f4146b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4153i >>>= 8;
        this.f4153i |= (((long) b) & 255) << 56;
        int i = this.f4154j + 1;
        this.f4154j = i;
        if (i == 8) {
            m2470d();
            this.f4154j = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        if (bArrM2603a.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f4147c = AbstractC1556g.m4153d(bArrM2603a, 0);
        this.f4148d = AbstractC1556g.m4153d(bArrM2603a, 8);
        mo2452c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = i2 & (-8);
        if (this.f4154j == 0) {
            while (i3 < i4) {
                this.f4153i = AbstractC1556g.m4153d(bArr, i + i3);
                m2470d();
                i3 += 8;
            }
            while (i3 < i2) {
                this.f4153i >>>= 8;
                this.f4153i |= (((long) bArr[i + i3]) & 255) << 56;
                i3++;
            }
            this.f4154j = i2 - i4;
            return;
        }
        int i5 = this.f4154j << 3;
        while (i3 < i4) {
            long jM4153d = AbstractC1556g.m4153d(bArr, i + i3);
            this.f4153i = (jM4153d << i5) | (this.f4153i >>> (-i5));
            m2470d();
            this.f4153i = jM4153d;
            i3 += 8;
        }
        while (i3 < i2) {
            this.f4153i >>>= 8;
            this.f4153i |= (((long) bArr[i + i3]) & 255) << 56;
            int i6 = this.f4154j + 1;
            this.f4154j = i6;
            if (i6 == 8) {
                m2470d();
                this.f4154j = 0;
            }
            i3++;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4149e = this.f4147c ^ 8317987319222330741L;
        this.f4150f = this.f4148d ^ 7237128888997146477L;
        this.f4151g = this.f4147c ^ 7816392313619706465L;
        this.f4152h = this.f4148d ^ 8387220255154660723L;
        this.f4153i = 0L;
        this.f4154j = 0;
        this.f4155k = 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        this.f4153i >>>= (7 - this.f4154j) << 3;
        this.f4153i >>>= 8;
        this.f4153i |= (((long) ((this.f4155k << 3) + this.f4154j)) & 255) << 56;
        m2470d();
        this.f4151g ^= 255;
        m2469a(this.f4146b);
        long j = ((this.f4149e ^ this.f4150f) ^ this.f4151g) ^ this.f4152h;
        mo2452c();
        AbstractC1556g.m4148b(j, bArr, i);
        return 8;
    }
}
