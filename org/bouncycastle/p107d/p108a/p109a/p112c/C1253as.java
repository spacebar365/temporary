package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.as */
/* JADX INFO: loaded from: classes.dex */
final class C1253as implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4803a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4804b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1252ar f4805c;

    C1253as(C1252ar c1252ar, int i, int[] iArr) {
        this.f4805c = c1252ar;
        this.f4803a = i;
        this.f4804b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4803a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4803a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 8; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4804b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4804b[(i2 + 8) + i5] & i4);
            }
            i2 += 16;
        }
        return this.f4805c.mo2908a((AbstractC1386g) new C1255au(iArr), (AbstractC1386g) new C1255au(iArr2), false);
    }
}
