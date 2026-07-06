package org.bouncycastle.e.d.a;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    private int[][] c;
    private int d;

    public a(int i, int[][] iArr) {
        if (iArr[0].length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.b = i;
        this.a = iArr.length;
        this.d = iArr[0].length;
        int i2 = (i & 31) == 0 ? -1 : (1 << r0) - 1;
        for (int i3 = 0; i3 < this.a; i3++) {
            int[] iArr2 = iArr[i3];
            int i4 = this.d - 1;
            iArr2[i4] = iArr2[i4] & i2;
        }
        this.c = iArr;
    }

    public a(a aVar) {
        this.b = aVar.c();
        this.a = aVar.b();
        this.d = aVar.d;
        this.c = new int[aVar.c.length][];
        for (int i = 0; i < this.c.length; i++) {
            this.c[i] = d.a(aVar.c[i]);
        }
    }

    public a(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.a = f.a(bArr, 0);
        this.b = f.a(bArr, 4);
        int i = ((this.b + 7) >>> 3) * this.a;
        if (this.a <= 0 || i != bArr.length - 8) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.d = (this.b + 31) >>> 5;
        this.c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.a, this.d);
        int i2 = this.b >> 5;
        int i3 = this.b & 31;
        int i4 = 8;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                this.c[i5][i6] = f.a(bArr, i4);
                i6++;
                i4 += 4;
            }
            int i7 = 0;
            while (i7 < i3) {
                int[] iArr = this.c[i5];
                iArr[i2] = ((bArr[i4] & 255) << i7) ^ iArr[i2];
                i7 += 8;
                i4++;
            }
        }
    }

    public final byte[] a() {
        byte[] bArr = new byte[(((this.b + 7) >>> 3) * this.a) + 8];
        f.a(this.a, bArr, 0);
        f.a(this.b, bArr, 4);
        int i = this.b >>> 5;
        int i2 = this.b & 31;
        int i3 = 8;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = 0;
            while (i5 < i) {
                f.a(this.c[i4][i5], bArr, i3);
                i5++;
                i3 += 4;
            }
            int i6 = 0;
            while (i6 < i2) {
                bArr[i3] = (byte) ((this.c[i4][i] >>> i6) & 255);
                i6 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a || this.b != aVar.b || this.d != aVar.d) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (!d.a(this.c[i], aVar.c[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iB = this.d + (((this.a * 31) + this.b) * 31);
        for (int i = 0; i < this.a; i++) {
            iB = (iB * 31) + org.bouncycastle.f.a.b(this.c[i]);
        }
        return iB;
    }

    public final String toString() {
        int i = this.b & 31;
        int i2 = i == 0 ? this.d : this.d - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.c[i3][this.d - 1];
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
