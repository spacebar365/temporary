package org.bouncycastle.p083b.p093i.p095b;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: org.bouncycastle.b.i.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1017g implements InterfaceC1011a {

    /* JADX INFO: renamed from: a */
    private long[][] f4179a;

    @Override // org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a
    /* JADX INFO: renamed from: a */
    public final void mo2492a(long[] jArr) {
        if (this.f4179a == null) {
            this.f4179a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 4);
        } else {
            long[] jArr2 = this.f4179a[1];
            if (((jArr2[3] ^ jArr[3]) | (((0 | (jArr[0] ^ jArr2[0])) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0) {
                return;
            }
        }
        C1013c.m2496a(jArr, this.f4179a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[] jArr3 = this.f4179a[i >> 1];
            long[] jArr4 = this.f4179a[i];
            long j = jArr3[0];
            long j2 = jArr3[1];
            long j3 = jArr3[2];
            long j4 = jArr3[3];
            jArr4[0] = ((j4 >> 63) & 1061) ^ (j << 1);
            jArr4[1] = (j >>> 63) | (j2 << 1);
            jArr4[2] = (j3 << 1) | (j2 >>> 63);
            jArr4[3] = (j4 << 1) | (j3 >>> 63);
            C1013c.m2497a(this.f4179a[i], this.f4179a[1], this.f4179a[i + 1]);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a
    /* JADX INFO: renamed from: b */
    public final void mo2493b(long[] jArr) {
        long[] jArr2 = new long[4];
        C1013c.m2496a(this.f4179a[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i = 30; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = jArr2[2];
            long j4 = jArr2[3];
            long j5 = j4 >>> 56;
            jArr2[0] = (j5 << 10) ^ ((((j << 8) ^ j5) ^ (j5 << 2)) ^ (j5 << 5));
            jArr2[1] = (j >>> 56) | (j2 << 8);
            jArr2[2] = (j2 >>> 56) | (j3 << 8);
            jArr2[3] = (j4 << 8) | (j3 >>> 56);
            C1013c.m2497a(this.f4179a[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        C1013c.m2496a(jArr2, jArr);
    }
}
