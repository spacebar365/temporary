package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bc */
/* JADX INFO: loaded from: classes.dex */
final class C1264bc implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4825a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4826b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1263bb f4827c;

    C1264bc(C1263bb c1263bb, int i, int[] iArr) {
        this.f4827c = c1263bb;
        this.f4825a = i;
        this.f4826b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4825a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4825a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 17; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4826b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4826b[(i2 + 17) + i5] & i4);
            }
            i2 += 34;
        }
        return this.f4827c.mo2908a((AbstractC1386g) new C1266be(iArr), (AbstractC1386g) new C1266be(iArr2), false);
    }
}
