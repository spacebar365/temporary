package org.bouncycastle.p083b.p093i.p095b;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: org.bouncycastle.b.i.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1016f implements InterfaceC1011a {

    /* JADX INFO: renamed from: a */
    private long[][] f4178a;

    @Override // org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a
    /* JADX INFO: renamed from: a */
    public final void mo2492a(long[] jArr) {
        if (this.f4178a == null) {
            this.f4178a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else {
            long[] jArr2 = this.f4178a[1];
            if (((jArr2[1] ^ jArr[1]) | (0 | (jArr[0] ^ jArr2[0]))) == 0) {
                return;
            }
        }
        C1012b.m2494a(jArr, this.f4178a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[] jArr3 = this.f4178a[i >> 1];
            long[] jArr4 = this.f4178a[i];
            long j = jArr3[0];
            long j2 = jArr3[1];
            jArr4[0] = ((j2 >> 63) & 135) ^ (j << 1);
            jArr4[1] = (j >>> 63) | (j2 << 1);
            C1012b.m2495a(this.f4178a[i], this.f4178a[1], this.f4178a[i + 1]);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.p095b.InterfaceC1011a
    /* JADX INFO: renamed from: b */
    public final void mo2493b(long[] jArr) {
        long[] jArr2 = new long[2];
        C1012b.m2494a(this.f4178a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i = 14; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = j2 >>> 56;
            jArr2[0] = (j3 << 7) ^ ((((j << 8) ^ j3) ^ (j3 << 1)) ^ (j3 << 2));
            jArr2[1] = (j >>> 56) | (j2 << 8);
            C1012b.m2495a(this.f4178a[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        C1012b.m2494a(jArr2, jArr);
    }
}
