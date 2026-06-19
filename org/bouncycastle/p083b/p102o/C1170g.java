package org.bouncycastle.p083b.p102o;

import java.math.BigInteger;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.o.g */
/* JADX INFO: loaded from: classes.dex */
final class C1170g {

    /* JADX INFO: renamed from: a */
    private final byte[] f4666a;

    /* JADX INFO: renamed from: b */
    private int f4667b = 0;

    public C1170g(byte[] bArr) {
        this.f4666a = bArr;
    }

    public C1170g(byte[] bArr, byte[] bArr2) {
        this.f4666a = bArr2;
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.f4667b += bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m2807a() {
        if (this.f4667b + 4 > this.f4666a.length) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        byte[] bArr = this.f4666a;
        int i = this.f4667b;
        this.f4667b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f4666a;
        int i3 = this.f4667b;
        this.f4667b = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f4666a;
        int i5 = this.f4667b;
        this.f4667b = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.f4666a;
        int i7 = this.f4667b;
        this.f4667b = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2808b() {
        int iM2807a = m2807a();
        if (iM2807a == 0) {
            return new byte[0];
        }
        if (this.f4667b + iM2807a > this.f4666a.length) {
            throw new IllegalArgumentException("not enough data for string");
        }
        byte[] bArr = this.f4666a;
        int i = this.f4667b;
        int i2 = iM2807a + this.f4667b;
        this.f4667b = i2;
        return C1535a.m4090c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m2809c() {
        int iM2807a = m2807a();
        if (iM2807a == 0) {
            return new byte[0];
        }
        if (this.f4667b + iM2807a > this.f4666a.length) {
            throw new IllegalArgumentException("not enough data for string");
        }
        byte[] bArr = this.f4666a;
        int i = this.f4667b;
        int i2 = (iM2807a - (this.f4666a[(this.f4667b + iM2807a) - 1] & 255)) + this.f4667b;
        this.f4667b = i2;
        return C1535a.m4090c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m2810d() {
        int iM2807a = m2807a();
        if (this.f4667b + iM2807a > this.f4666a.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        byte[] bArr = new byte[iM2807a];
        System.arraycopy(this.f4666a, this.f4667b, bArr, 0, bArr.length);
        this.f4667b = iM2807a + this.f4667b;
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2811e() {
        return this.f4667b < this.f4666a.length;
    }
}
