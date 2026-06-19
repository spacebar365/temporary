package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ai */
/* JADX INFO: loaded from: classes.dex */
final class C1243ai implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4783a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f4784b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1242ah f4785c;

    C1243ai(C1242ah c1242ah, int i, int[] iArr) {
        this.f4785c = c1242ah;
        this.f4783a = i;
        this.f4784b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4783a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4783a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 7; i5++) {
                iArr[i5] = iArr[i5] ^ (this.f4784b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.f4784b[(i2 + 7) + i5] & i4);
            }
            i2 += 14;
        }
        return this.f4785c.mo2908a((AbstractC1386g) new C1245ak(iArr), (AbstractC1386g) new C1245ak(iArr2), false);
    }
}
