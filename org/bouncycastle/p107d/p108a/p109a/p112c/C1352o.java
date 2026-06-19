package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.o */
/* JADX INFO: loaded from: classes.dex */
final class C1352o implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4940a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4941b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1351n f4942c;

    C1352o(C1351n c1351n, int i, int[] iArr) {
        this.f4942c = c1351n;
        this.f4940a = i;
        this.f4941b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4940a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4940a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 5; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4941b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4941b[(i2 + 5) + i5] & i4);
            }
            i2 += 10;
        }
        return this.f4942c.mo2908a((AbstractC1386g) new C1354q(iArr), (AbstractC1386g) new C1354q(iArr2), false);
    }
}
