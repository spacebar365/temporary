package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bj */
/* JADX INFO: loaded from: classes.dex */
final class C1271bj implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4833a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4834b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1270bi f4835c;

    C1271bj(C1270bi c1270bi, int i, long[] jArr) {
        this.f4835c = c1270bi;
        this.f4833a = i;
        this.f4834b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4833a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4833a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 2; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4834b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4834b[(i2 + 2) + i4] & j);
            }
            i2 += 4;
        }
        return this.f4835c.mo2908a((AbstractC1386g) new C1269bh(jArr), (AbstractC1386g) new C1269bh(jArr2), false);
    }
}
