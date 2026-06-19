package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.df */
/* JADX INFO: loaded from: classes.dex */
final class C1321df implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4895a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4896b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1320de f4897c;

    C1321df(C1320de c1320de, int i, long[] jArr) {
        this.f4897c = c1320de;
        this.f4895a = i;
        this.f4896b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4895a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[5];
        long[] jArr2 = new long[5];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4895a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 5; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4896b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4896b[(i2 + 5) + i4] & j);
            }
            i2 += 10;
        }
        return this.f4897c.mo2908a((AbstractC1386g) new C1319dd(jArr), (AbstractC1386g) new C1319dd(jArr2), false);
    }
}
