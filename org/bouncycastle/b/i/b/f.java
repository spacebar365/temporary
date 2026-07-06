package org.bouncycastle.b.i.b;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {
    private long[][] a;

    @Override // org.bouncycastle.b.i.b.a
    public final void a(long[] jArr) {
        if (this.a == null) {
            this.a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else {
            long[] jArr2 = this.a[1];
            if (((jArr2[1] ^ jArr[1]) | (0 | (jArr[0] ^ jArr2[0]))) == 0) {
                return;
            }
        }
        b.a(jArr, this.a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[] jArr3 = this.a[i >> 1];
            long[] jArr4 = this.a[i];
            long j = jArr3[0];
            long j2 = jArr3[1];
            jArr4[0] = ((j2 >> 63) & 135) ^ (j << 1);
            jArr4[1] = (j >>> 63) | (j2 << 1);
            b.a(this.a[i], this.a[1], this.a[i + 1]);
        }
    }

    @Override // org.bouncycastle.b.i.b.a
    public final void b(long[] jArr) {
        long[] jArr2 = new long[2];
        b.a(this.a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i = 14; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = j2 >>> 56;
            jArr2[0] = (j3 << 7) ^ ((((j << 8) ^ j3) ^ (j3 << 1)) ^ (j3 << 2));
            jArr2[1] = (j >>> 56) | (j2 << 8);
            b.a(this.a[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        b.a(jArr2, jArr);
    }
}
