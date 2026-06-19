package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dy */
/* JADX INFO: loaded from: classes.dex */
final class C1340dy implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4920a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4921b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1339dx f4922c;

    C1340dy(C1339dx c1339dx, int i, long[] jArr) {
        this.f4922c = c1339dx;
        this.f4920a = i;
        this.f4921b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4920a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4920a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 9; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4921b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4921b[(i2 + 9) + i4] & j);
            }
            i2 += 18;
        }
        return this.f4922c.mo2908a((AbstractC1386g) new C1335dt(jArr), (AbstractC1386g) new C1335dt(jArr2), false);
    }
}
