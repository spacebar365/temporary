package org.bouncycastle.p107d.p108a.p109a.p110a;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.a.b */
/* JADX INFO: loaded from: classes.dex */
final class C1225b implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4749a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4750b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1224a f4751c;

    C1225b(C1224a c1224a, int i, int[] iArr) {
        this.f4751c = c1224a;
        this.f4749a = i;
        this.f4750b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4749a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4749a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 8; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4750b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4750b[(i2 + 8) + i5] & i4);
            }
            i2 += 16;
        }
        return this.f4751c.mo2908a((AbstractC1386g) new C1227d(iArr), (AbstractC1386g) new C1227d(iArr2), false);
    }
}
