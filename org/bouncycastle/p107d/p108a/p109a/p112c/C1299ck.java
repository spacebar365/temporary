package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ck */
/* JADX INFO: loaded from: classes.dex */
final class C1299ck implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4869a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4870b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1298cj f4871c;

    C1299ck(C1298cj c1298cj, int i, long[] jArr) {
        this.f4871c = c1298cj;
        this.f4869a = i;
        this.f4870b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4869a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4869a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 4; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4870b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4870b[(i2 + 4) + i4] & j);
            }
            i2 += 8;
        }
        return this.f4871c.mo2908a((AbstractC1386g) new C1297ci(jArr), (AbstractC1386g) new C1297ci(jArr2), false);
    }
}
