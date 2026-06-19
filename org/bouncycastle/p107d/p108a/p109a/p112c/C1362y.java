package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.y */
/* JADX INFO: loaded from: classes.dex */
final class C1362y implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4960a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4961b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1361x f4962c;

    C1362y(C1361x c1361x, int i, int[] iArr) {
        this.f4962c = c1361x;
        this.f4960a = i;
        this.f4961b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4960a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4960a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 6; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4961b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4961b[(i2 + 6) + i5] & i4);
            }
            i2 += 12;
        }
        return this.f4962c.mo2908a((AbstractC1386g) new C1235aa(iArr), (AbstractC1386g) new C1235aa(iArr2), false);
    }
}
