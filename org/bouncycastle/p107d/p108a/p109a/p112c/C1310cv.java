package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.cv */
/* JADX INFO: loaded from: classes.dex */
final class C1310cv implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4882a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4883b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1309cu f4884c;

    C1310cv(C1309cu c1309cu, int i, long[] jArr) {
        this.f4884c = c1309cu;
        this.f4882a = i;
        this.f4883b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4882a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4882a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 4; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4883b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4883b[(i2 + 4) + i4] & j);
            }
            i2 += 8;
        }
        return this.f4884c.mo2908a((AbstractC1386g) new C1305cq(jArr), (AbstractC1386g) new C1305cq(jArr2), false);
    }
}
