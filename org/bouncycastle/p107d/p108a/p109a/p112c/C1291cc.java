package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.cc */
/* JADX INFO: loaded from: classes.dex */
final class C1291cc implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4860a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long[] f4861b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1290cb f4862c;

    C1291cc(C1290cb c1290cb, int i, long[] jArr) {
        this.f4862c = c1290cb;
        this.f4860a = i;
        this.f4861b = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f4860a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4860a; i3++) {
            long j = ((i3 ^ i) - 1) >> 31;
            for (int i4 = 0; i4 < 3; i4++) {
                jArr[i4] = jArr[i4] ^ (this.f4861b[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (this.f4861b[(i2 + 3) + i4] & j);
            }
            i2 += 6;
        }
        return this.f4862c.mo2908a((AbstractC1386g) new C1285bx(jArr), (AbstractC1386g) new C1285bx(jArr2), false);
    }
}
