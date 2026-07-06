package org.bouncycastle.d.a.a.b;

import org.bouncycastle.d.a.g;
import org.bouncycastle.d.a.h;
import org.bouncycastle.d.a.j;

/* JADX INFO: loaded from: classes.dex */
final class b implements h {
    final /* synthetic */ int a;
    final /* synthetic */ int[] b;
    final /* synthetic */ a c;

    b(a aVar, int i, int[] iArr) {
        this.c = aVar;
        this.a = i;
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.h
    public final int a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.a.h
    public final j a(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 8; i5++) {
                iArr[i5] = iArr[i5] ^ (this.b[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (this.b[(i2 + 8) + i5] & i4);
            }
            i2 += 16;
        }
        return this.c.a((g) new d(iArr), (g) new d(iArr2), false);
    }
}
