package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.b */
/* JADX INFO: loaded from: classes.dex */
final class C1261b implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4820a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4821b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1234a f4822c;

    C1261b(C1234a c1234a, int i, int[] iArr) {
        this.f4822c = c1234a;
        this.f4820a = i;
        this.f4821b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4820a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4820a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 4; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4821b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4821b[(i2 + 4) + i5] & i4);
            }
            i2 += 8;
        }
        return this.f4822c.mo2908a((AbstractC1386g) new C1315d(iArr), (AbstractC1386g) new C1315d(iArr2), false);
    }
}
