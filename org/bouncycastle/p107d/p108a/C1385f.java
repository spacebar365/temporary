package org.bouncycastle.p107d.p108a;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;

/* JADX INFO: renamed from: org.bouncycastle.d.a.f */
/* JADX INFO: loaded from: classes.dex */
final class C1385f implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f5064a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f5065b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long[] f5066c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int[] f5067d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AbstractC1381d.d f5068e;

    C1385f(AbstractC1381d.d dVar, int i, int i2, long[] jArr, int[] iArr) {
        this.f5068e = dVar;
        this.f5064a = i;
        this.f5065b = i2;
        this.f5066c = jArr;
        this.f5067d = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f5064a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[this.f5065b];
        long[] jArr2 = new long[this.f5065b];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5064a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < this.f5065b; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f5066c[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f5066c[(this.f5065b + i2) + i4] & j);
            }
            i2 += this.f5065b * 2;
        }
        return this.f5068e.mo2908a((AbstractC1386g) new AbstractC1386g.c(this.f5068e.f5016i, this.f5067d, new C1397r(jArr)), (AbstractC1386g) new AbstractC1386g.c(this.f5068e.f5016i, this.f5067d, new C1397r(jArr2)), false);
    }
}
