package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dq */
/* JADX INFO: loaded from: classes.dex */
final class C1332dq implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4908a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4909b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1331dp f4910c;

    C1332dq(C1331dp c1331dp, int i, long[] jArr) {
        this.f4910c = c1331dp;
        this.f4908a = i;
        this.f4909b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4908a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[7];
        long[] jArr2 = new long[7];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4908a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 7; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4909b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4909b[(i2 + 7) + i4] & j);
            }
            i2 += 14;
        }
        return this.f4910c.mo2908a((AbstractC1386g) new C1327dl(jArr), (AbstractC1386g) new C1327dl(jArr2), false);
    }
}
