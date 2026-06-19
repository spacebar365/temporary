package org.bouncycastle.p118e.p140d.p141a;

import java.lang.reflect.Array;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1524a extends AbstractC1530g {

    /* JADX INFO: renamed from: c */
    private int[][] f5460c;

    /* JADX INFO: renamed from: d */
    private int f5461d;

    public C1524a(int i, int[][] iArr) {
        if (iArr[0].length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.f5472b = i;
        this.f5471a = iArr.length;
        this.f5461d = iArr[0].length;
        int i2 = (i & 31) == 0 ? -1 : (1 << r0) - 1;
        for (int i3 = 0; i3 < this.f5471a; i3++) {
            int[] iArr2 = iArr[i3];
            int i4 = this.f5461d - 1;
            iArr2[i4] = iArr2[i4] & i2;
        }
        this.f5460c = iArr;
    }

    public C1524a(C1524a c1524a) {
        this.f5472b = c1524a.m4040c();
        this.f5471a = c1524a.m4039b();
        this.f5461d = c1524a.f5461d;
        this.f5460c = new int[c1524a.f5460c.length][];
        for (int i = 0; i < this.f5460c.length; i++) {
            this.f5460c[i] = C1527d.m4034a(c1524a.f5460c[i]);
        }
    }

    public C1524a(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f5471a = C1529f.m4036a(bArr, 0);
        this.f5472b = C1529f.m4036a(bArr, 4);
        int i = ((this.f5472b + 7) >>> 3) * this.f5471a;
        if (this.f5471a <= 0 || i != bArr.length - 8) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f5461d = (this.f5472b + 31) >>> 5;
        this.f5460c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.f5471a, this.f5461d);
        int i2 = this.f5472b >> 5;
        int i3 = this.f5472b & 31;
        int i4 = 8;
        for (int i5 = 0; i5 < this.f5471a; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                this.f5460c[i5][i6] = C1529f.m4036a(bArr, i4);
                i6++;
                i4 += 4;
            }
            int i7 = 0;
            while (i7 < i3) {
                int[] iArr = this.f5460c[i5];
                iArr[i2] = ((bArr[i4] & 255) << i7) ^ iArr[i2];
                i7 += 8;
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m4023a() {
        byte[] bArr = new byte[(((this.f5472b + 7) >>> 3) * this.f5471a) + 8];
        C1529f.m4038a(this.f5471a, bArr, 0);
        C1529f.m4038a(this.f5472b, bArr, 4);
        int i = this.f5472b >>> 5;
        int i2 = this.f5472b & 31;
        int i3 = 8;
        for (int i4 = 0; i4 < this.f5471a; i4++) {
            int i5 = 0;
            while (i5 < i) {
                C1529f.m4038a(this.f5460c[i4][i5], bArr, i3);
                i5++;
                i3 += 4;
            }
            int i6 = 0;
            while (i6 < i2) {
                bArr[i3] = (byte) ((this.f5460c[i4][i] >>> i6) & 255);
                i6 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1524a)) {
            return false;
        }
        C1524a c1524a = (C1524a) obj;
        if (this.f5471a != c1524a.f5471a || this.f5472b != c1524a.f5472b || this.f5461d != c1524a.f5461d) {
            return false;
        }
        for (int i = 0; i < this.f5471a; i++) {
            if (!C1527d.m4033a(this.f5460c[i], c1524a.f5460c[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iM4082b = this.f5461d + (((this.f5471a * 31) + this.f5472b) * 31);
        for (int i = 0; i < this.f5471a; i++) {
            iM4082b = (iM4082b * 31) + C1535a.m4082b(this.f5460c[i]);
        }
        return iM4082b;
    }

    public final String toString() {
        int i = this.f5472b & 31;
        int i2 = i == 0 ? this.f5461d : this.f5461d - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f5471a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.f5460c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.f5460c[i3][this.f5461d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
