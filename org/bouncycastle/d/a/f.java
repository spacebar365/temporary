package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
final class f implements h {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long[] c;
    final /* synthetic */ int[] d;
    final /* synthetic */ d$d e;

    f(d$d d_d, int i, int i2, long[] jArr, int[] iArr) {
        this.e = d_d;
        this.a = i;
        this.b = i2;
        this.c = jArr;
        this.d = iArr;
    }

    @Override // org.bouncycastle.d.a.h
    public final int a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.a.h
    public final j a(int i) {
        long[] jArr = new long[this.b];
        long[] jArr2 = new long[this.b];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < this.b; i4++) {
                jArr[i4] = jArr[i4] ^ (this.c[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.c[(this.b + i2) + i4] & j);
            }
            i2 += this.b * 2;
        }
        return this.e.a((g) new g$c(d$d.a(this.e), this.d, new r(jArr)), (g) new g$c(d$d.a(this.e), this.d, new r(jArr2)), false);
    }
}
