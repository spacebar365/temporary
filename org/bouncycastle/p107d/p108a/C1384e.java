package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.a.e */
/* JADX INFO: loaded from: classes.dex */
final class C1384e implements InterfaceC1387h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f5060a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f5061b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ byte[] f5062c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC1381d f5063d;

    C1384e(AbstractC1381d abstractC1381d, int i, int i2, byte[] bArr) {
        this.f5063d = abstractC1381d;
        this.f5060a = i;
        this.f5061b = i2;
        this.f5062c = bArr;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final int mo2913a() {
        return this.f5060a;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1387h
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2914a(int i) {
        byte[] bArr = new byte[this.f5061b];
        byte[] bArr2 = new byte[this.f5061b];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5060a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < this.f5061b; i5++) {
                bArr[i5] = (byte) (bArr[i5] ^ (this.f5062c[i2 + i5] & i4));
                bArr2[i5] = (byte) (bArr2[i5] ^ (this.f5062c[(this.f5061b + i2) + i5] & i4));
            }
            i2 += this.f5061b * 2;
        }
        return this.f5063d.mo2908a(this.f5063d.mo2906a(new BigInteger(1, bArr)), this.f5063d.mo2906a(new BigInteger(1, bArr2)), false);
    }
}
