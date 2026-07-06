package org.bouncycastle.b.i.a;

import java.lang.reflect.Array;
import org.bouncycastle.f.g;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {
    private byte[] a;
    private long[][] b;

    @Override // org.bouncycastle.b.i.a.c
    public final void b(byte[] bArr) {
        long[] jArr = this.b[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.b[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        g.a(j, bArr, 0);
        g.a(j2, bArr, 8);
    }

    @Override // org.bouncycastle.b.i.a.c
    public final void a(byte[] bArr) {
        if (this.b == null) {
            this.b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (org.bouncycastle.f.a.a(this.a, bArr)) {
            return;
        }
        this.a = org.bouncycastle.f.a.b(bArr);
        g.a(this.a, 0, this.b[1]);
        long[] jArr = this.b[1];
        long[] jArr2 = this.b[1];
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 << 57;
        jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
        jArr2[1] = (j << 57) | (j2 >>> 7);
        for (int i = 2; i < 256; i += 2) {
            long[] jArr3 = this.b[i >> 1];
            long[] jArr4 = this.b[i];
            long j4 = jArr3[0];
            long j5 = jArr3[1];
            long j6 = j4 >> 63;
            jArr4[0] = ((j4 ^ ((-2233785415175766016L) & j6)) << 1) | (j5 >>> 63);
            jArr4[1] = (j5 << 1) | (-j6);
            long[] jArr5 = this.b[i];
            long[] jArr6 = this.b[1];
            long[] jArr7 = this.b[i + 1];
            jArr7[0] = jArr5[0] ^ jArr6[0];
            jArr7[1] = jArr5[1] ^ jArr6[1];
        }
    }
}
