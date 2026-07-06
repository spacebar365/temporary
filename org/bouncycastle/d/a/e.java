package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class e implements h {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ d d;

    e(d dVar, int i, int i2, byte[] bArr) {
        this.d = dVar;
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // org.bouncycastle.d.a.h
    public final int a() {
        return this.a;
    }

    @Override // org.bouncycastle.d.a.h
    public final j a(int i) {
        byte[] bArr = new byte[this.b];
        byte[] bArr2 = new byte[this.b];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < this.b; i5++) {
                bArr[i5] = (byte) (bArr[i5] ^ (this.c[i2 + i5] & i4));
                bArr2[i5] = (byte) (bArr2[i5] ^ (this.c[(this.b + i2) + i5] & i4));
            }
            i2 += this.b * 2;
        }
        return this.d.a(this.d.a(new BigInteger(1, bArr)), this.d.a(new BigInteger(1, bArr2)), false);
    }
}
