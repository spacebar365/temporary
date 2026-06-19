package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.t */
/* JADX INFO: loaded from: classes.dex */
final class C1357t implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4950a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4951b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1356s f4952c;

    C1357t(C1356s c1356s, int i, int[] iArr) {
        this.f4952c = c1356s;
        this.f4950a = i;
        this.f4951b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4950a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4950a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 6; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4951b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4951b[(i2 + 6) + i5] & i4);
            }
            i2 += 12;
        }
        return this.f4952c.mo2908a((AbstractC1386g) new C1359v(iArr), (AbstractC1386g) new C1359v(iArr2), false);
    }
}
