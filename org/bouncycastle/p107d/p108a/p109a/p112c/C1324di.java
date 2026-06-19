package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.di */
/* JADX INFO: loaded from: classes.dex */
final class C1324di implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4899a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4900b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1323dh f4901c;

    C1324di(C1323dh c1323dh, int i, long[] jArr) {
        this.f4901c = c1323dh;
        this.f4899a = i;
        this.f4900b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4899a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[5];
        long[] jArr2 = new long[5];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4899a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 5; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4900b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4900b[(i2 + 5) + i4] & j);
            }
            i2 += 10;
        }
        return this.f4901c.mo2908a((AbstractC1386g) new C1319dd(jArr), (AbstractC1386g) new C1319dd(jArr2), false);
    }
}
