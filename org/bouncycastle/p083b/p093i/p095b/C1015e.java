package org.bouncycastle.p083b.p093i.p095b;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: org.bouncycastle.b.i.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1015e implements InterfaceC1011a {

    /* JADX INFO: renamed from: a */
    private long[][] f4177a;

    @Override // org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a
    /* JADX INFO: renamed from: a */
    public final void mo2492a(long[] jArr) {
        if (this.f4177a == null) {
            this.f4177a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 8);
        } else {
            long[] jArr2 = this.f4177a[1];
            if (((jArr2[7] ^ jArr[7]) | (((((((0 | (jArr[0] ^ jArr2[0])) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0) {
                return;
            }
        }
        C1014d.m2498a(jArr, this.f4177a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[] jArr3 = this.f4177a[i >> 1];
            long[] jArr4 = this.f4177a[i];
            long j = jArr3[0];
            long j2 = jArr3[1];
            long j3 = jArr3[2];
            long j4 = jArr3[3];
            long j5 = jArr3[4];
            long j6 = jArr3[5];
            long j7 = jArr3[6];
            long j8 = jArr3[7];
            jArr4[0] = ((j8 >> 63) & 293) ^ (j << 1);
            jArr4[1] = (j >>> 63) | (j2 << 1);
            jArr4[2] = (j3 << 1) | (j2 >>> 63);
            jArr4[3] = (j4 << 1) | (j3 >>> 63);
            jArr4[4] = (j5 << 1) | (j4 >>> 63);
            jArr4[5] = (j6 << 1) | (j5 >>> 63);
            jArr4[6] = (j7 << 1) | (j6 >>> 63);
            jArr4[7] = (j8 << 1) | (j7 >>> 63);
            C1014d.m2499a(this.f4177a[i], this.f4177a[1], this.f4177a[i + 1]);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a
    /* JADX INFO: renamed from: b */
    public final void mo2493b(long[] jArr) {
        long[] jArr2 = new long[8];
        C1014d.m2498a(this.f4177a[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i = 62; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = jArr2[2];
            long j4 = jArr2[3];
            long j5 = jArr2[4];
            long j6 = jArr2[5];
            long j7 = jArr2[6];
            long j8 = jArr2[7];
            long j9 = j8 >>> 56;
            jArr2[0] = (j9 << 8) ^ ((((j << 8) ^ j9) ^ (j9 << 2)) ^ (j9 << 5));
            jArr2[1] = (j >>> 56) | (j2 << 8);
            jArr2[2] = (j2 >>> 56) | (j3 << 8);
            jArr2[3] = (j4 << 8) | (j3 >>> 56);
            jArr2[4] = (j5 << 8) | (j4 >>> 56);
            jArr2[5] = (j6 << 8) | (j5 >>> 56);
            jArr2[6] = (j7 << 8) | (j6 >>> 56);
            jArr2[7] = (j8 << 8) | (j7 >>> 56);
            C1014d.m2499a(this.f4177a[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        C1014d.m2498a(jArr2, jArr);
    }
}
