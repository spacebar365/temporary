package org.bouncycastle.d.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class cs implements org.bouncycastle.d.a.h {
    final /* synthetic */ int a;
    final /* synthetic */ long[] b;
    final /* synthetic */ cr c;

    cs(cr crVar, int i, long[] jArr) {
        this.c = crVar;
        this.a = i;
        this.b = jArr;
    }

    @Override // org.bouncycastle.d.a.h
    public final int a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.a.h
    public final org.bouncycastle.d.a.j a(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 4; i4++) {
                jArr[i4] = jArr[i4] ^ (this.b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.b[(i2 + 4) + i4] & j);
            }
            i2 += 8;
        }
        return this.c.a((org.bouncycastle.d.a.g) new cq(jArr), (org.bouncycastle.d.a.g) new cq(jArr2), false);
    }
}
