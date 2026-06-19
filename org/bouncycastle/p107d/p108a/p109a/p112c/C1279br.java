package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.br */
/* JADX INFO: loaded from: classes.dex */
final class C1279br implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4843a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4844b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1278bq f4845c;

    C1279br(C1278bq c1278bq, int i, long[] jArr) {
        this.f4845c = c1278bq;
        this.f4843a = i;
        this.f4844b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4843a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4843a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 3; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4844b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4844b[(i2 + 3) + i4] & j);
            }
            i2 += 6;
        }
        return this.f4845c.mo2908a((AbstractC1386g) new C1277bp(jArr), (AbstractC1386g) new C1277bp(jArr2), false);
    }
}
