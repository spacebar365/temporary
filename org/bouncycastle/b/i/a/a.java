package org.bouncycastle.b.i.a;

import org.bouncycastle.f.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private long[] a;

    @Override // org.bouncycastle.b.i.a.b
    public final void a(byte[] bArr) {
        this.a = d.a(bArr);
    }

    @Override // org.bouncycastle.b.i.a.b
    public final void a(long j, byte[] bArr) {
        long[] jArr = {Long.MIN_VALUE, 0};
        if (j > 0) {
            long[] jArrB = org.bouncycastle.f.a.b(this.a);
            do {
                if ((1 & j) != 0) {
                    d.a(jArr, jArrB);
                }
                long[] jArr2 = new long[4];
                org.bouncycastle.d.c.a.b(jArrB[0], jArr2, 0);
                org.bouncycastle.d.c.a.b(jArrB[1], jArr2, 2);
                long j2 = jArr2[0];
                long j3 = jArr2[1];
                long j4 = jArr2[2];
                long j5 = jArr2[3];
                long j6 = j3 ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
                long j7 = ((j5 << 57) ^ ((j5 << 63) ^ (j5 << 62))) ^ j4;
                jArrB[0] = j2 ^ ((((j7 >>> 1) ^ j7) ^ (j7 >>> 2)) ^ (j7 >>> 7));
                jArrB[1] = ((j7 << 57) ^ ((j7 << 63) ^ (j7 << 62))) ^ j6;
                j >>>= 1;
            } while (j > 0);
        }
        g.a(jArr, bArr, 0);
    }
}
