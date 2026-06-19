package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bz */
/* JADX INFO: loaded from: classes.dex */
final class C1287bz implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4853a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4854b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1286by f4855c;

    C1287bz(C1286by c1286by, int i, long[] jArr) {
        this.f4855c = c1286by;
        this.f4853a = i;
        this.f4854b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4853a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4853a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 3; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4854b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4854b[(i2 + 3) + i4] & j);
            }
            i2 += 6;
        }
        return this.f4855c.mo2908a((AbstractC1386g) new C1285bx(jArr), (AbstractC1386g) new C1285bx(jArr2), false);
    }
}
