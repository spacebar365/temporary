package org.bouncycastle.b.h;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class m implements z {
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i = 0;
    protected int j = 0;
    protected int k = 0;
    protected final int a = 2;
    protected final int b = 4;

    public m() {
    }

    public m(byte b) {
    }

    private static long a(long j, int i) {
        return (j << i) | (j >>> (-i));
    }

    private void a(int i) {
        long jA = this.e;
        long jA2 = this.f;
        long jA3 = this.g;
        long jA4 = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jA + jA2;
            long j2 = jA3 + jA4;
            long jA5 = a(jA2, 13) ^ j;
            long jA6 = a(jA4, 16) ^ j2;
            long j3 = j2 + jA5;
            jA = a(j, 32) + jA6;
            jA2 = a(jA5, 17) ^ j3;
            jA4 = a(jA6, 21) ^ jA;
            jA3 = a(j3, 32);
        }
        this.e = jA;
        this.f = jA2;
        this.g = jA3;
        this.h = jA4;
    }

    private void d() {
        this.k++;
        this.h ^= this.i;
        a(this.a);
        this.e ^= this.i;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return "SipHash-" + this.a + "-" + this.b;
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.i >>>= 8;
        this.i |= (((long) b) & 255) << 56;
        int i = this.j + 1;
        this.j = i;
        if (i == 8) {
            d();
            this.j = 0;
        }
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof ba)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] bArrA = ((ba) iVar).a();
        if (bArrA.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.c = org.bouncycastle.f.g.d(bArrA, 0);
        this.d = org.bouncycastle.f.g.d(bArrA, 8);
        c();
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = i2 & (-8);
        if (this.j == 0) {
            while (i3 < i4) {
                this.i = org.bouncycastle.f.g.d(bArr, i + i3);
                d();
                i3 += 8;
            }
            while (i3 < i2) {
                this.i >>>= 8;
                this.i |= (((long) bArr[i + i3]) & 255) << 56;
                i3++;
            }
            this.j = i2 - i4;
            return;
        }
        int i5 = this.j << 3;
        while (i3 < i4) {
            long jD = org.bouncycastle.f.g.d(bArr, i + i3);
            this.i = (jD << i5) | (this.i >>> (-i5));
            d();
            this.i = jD;
            i3 += 8;
        }
        while (i3 < i2) {
            this.i >>>= 8;
            this.i |= (((long) bArr[i + i3]) & 255) << 56;
            int i6 = this.j + 1;
            this.j = i6;
            if (i6 == 8) {
                d();
                this.j = 0;
            }
            i3++;
        }
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.e = this.c ^ 8317987319222330741L;
        this.f = this.d ^ 7237128888997146477L;
        this.g = this.c ^ 7816392313619706465L;
        this.h = this.d ^ 8387220255154660723L;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        this.i >>>= (7 - this.j) << 3;
        this.i >>>= 8;
        this.i |= (((long) ((this.k << 3) + this.j)) & 255) << 56;
        d();
        this.g ^= 255;
        a(this.b);
        long j = ((this.e ^ this.f) ^ this.g) ^ this.h;
        c();
        org.bouncycastle.f.g.b(j, bArr, i);
        return 8;
    }
}
