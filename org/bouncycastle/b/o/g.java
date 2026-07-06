package org.bouncycastle.b.o;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class g {
    private final byte[] a;
    private int b = 0;

    public g(byte[] bArr) {
        this.a = bArr;
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.a = bArr2;
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.b += bArr.length;
    }

    public final int a() {
        if (this.b + 4 > this.a.length) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.a;
        int i5 = this.b;
        this.b = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.a;
        int i7 = this.b;
        this.b = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    public final byte[] b() {
        int iA = a();
        if (iA == 0) {
            return new byte[0];
        }
        if (this.b + iA > this.a.length) {
            throw new IllegalArgumentException("not enough data for string");
        }
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = iA + this.b;
        this.b = i2;
        return org.bouncycastle.f.a.c(bArr, i, i2);
    }

    public final byte[] c() {
        int iA = a();
        if (iA == 0) {
            return new byte[0];
        }
        if (this.b + iA > this.a.length) {
            throw new IllegalArgumentException("not enough data for string");
        }
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = (iA - (this.a[(this.b + iA) - 1] & 255)) + this.b;
        this.b = i2;
        return org.bouncycastle.f.a.c(bArr, i, i2);
    }

    public final BigInteger d() {
        int iA = a();
        if (this.b + iA > this.a.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        byte[] bArr = new byte[iA];
        System.arraycopy(this.a, this.b, bArr, 0, bArr.length);
        this.b = iA + this.b;
        return new BigInteger(1, bArr);
    }

    public final boolean e() {
        return this.b < this.a.length;
    }
}
