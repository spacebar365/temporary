package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bm */
/* JADX INFO: loaded from: classes.dex */
final class C1274bm implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4837a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4838b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1273bl f4839c;

    C1274bm(C1273bl c1273bl, int i, long[] jArr) {
        this.f4839c = c1273bl;
        this.f4837a = i;
        this.f4838b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4837a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4837a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 2; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4838b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4838b[(i2 + 2) + i4] & j);
            }
            i2 += 4;
        }
        return this.f4839c.mo2908a((AbstractC1386g) new C1269bh(jArr), (AbstractC1386g) new C1269bh(jArr2), false);
    }
}
