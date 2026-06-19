package org.bouncycastle.p107d.p108a.p109a.p111b;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.b.b */
/* JADX INFO: loaded from: classes.dex */
final class C1230b implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4759a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4760b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1229a f4761c;

    C1230b(C1229a c1229a, int i, int[] iArr) {
        this.f4761c = c1229a;
        this.f4759a = i;
        this.f4760b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4759a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4759a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 8; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4760b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4760b[(i2 + 8) + i5] & i4);
            }
            i2 += 16;
        }
        return this.f4761c.mo2908a((AbstractC1386g) new C1232d(iArr), (AbstractC1386g) new C1232d(iArr2), false);
    }
}
