package org.bouncycastle.d.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class t implements org.bouncycastle.d.a.h {
    final /* synthetic */ int a;
    final /* synthetic */ int[] b;
    final /* synthetic */ s c;

    t(s sVar, int i, int[] iArr) {
        this.c = sVar;
        this.a = i;
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.h
    public final int a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.a.h
    public final org.bouncycastle.d.a.j a(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 6; i5++) {
                iArr[i5] = iArr[i5] ^ (this.b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.b[(i2 + 6) + i5] & i4);
            }
            i2 += 12;
        }
        return this.c.a((org.bouncycastle.d.a.g) new v(iArr), (org.bouncycastle.d.a.g) new v(iArr2), false);
    }
}
