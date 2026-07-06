package org.bouncycastle.d.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class cc implements org.bouncycastle.d.a.h {
    final /* synthetic */ int a;
    final /* synthetic */ long[] b;
    final /* synthetic */ cb c;

    cc(cb cbVar, int i, long[] jArr) {
        this.c = cbVar;
        this.a = i;
        this.b = jArr;
    }

    @Override // org.bouncycastle.d.a.h
    public final int a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.a.h
    public final org.bouncycastle.d.a.j a(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 3; i4++) {
                jArr[i4] = jArr[i4] ^ (this.b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.b[(i2 + 3) + i4] & j);
            }
            i2 += 6;
        }
        return this.c.a((org.bouncycastle.d.a.g) new bx(jArr), (org.bouncycastle.d.a.g) new bx(jArr2), false);
    }
}
