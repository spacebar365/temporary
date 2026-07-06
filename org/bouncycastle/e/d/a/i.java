package org.bouncycastle.e.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private b a;
    private int b;
    private int[] c;

    public i(b bVar, int i) {
        this.a = bVar;
        this.b = i;
        this.c = new int[i + 1];
        this.c[i] = 1;
    }

    public i(b bVar, byte[] bArr) {
        this.a = bVar;
        int i = 8;
        int i2 = 1;
        while (bVar.a() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[bArr.length / i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                int[] iArr = this.c;
                iArr[i4] = ((bArr[i3] & 255) << i5) ^ iArr[i4];
                i5 += 8;
                i3++;
            }
            if (!this.a.b(this.c[i4])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
        }
        if (this.c.length != 1 && this.c[this.c.length - 1] == 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        c();
    }

    public i(i iVar) {
        this.a = iVar.a;
        this.b = iVar.b;
        this.c = d.a(iVar.c);
    }

    private static int a(int[] iArr) {
        int iB = b(iArr);
        if (iB == -1) {
            return 0;
        }
        return iArr[iB];
    }

    private int[] a(int[] iArr, int i) {
        int iB = b(iArr);
        if (iB == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[iB + 1];
        while (iB >= 0) {
            iArr2[iB] = this.a.a(iArr[iB], i);
            iB--;
        }
        return iArr2;
    }

    private static int b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private static int[] b(int[] iArr, int i) {
        int iB = b(iArr);
        if (iB == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iB + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, iB + 1);
        return iArr2;
    }

    private void c() {
        this.b = this.c.length - 1;
        while (this.b >= 0 && this.c[this.b] == 0) {
            this.b--;
        }
    }

    public final int a() {
        int length = this.c.length - 1;
        if (this.c[length] == 0) {
            return -1;
        }
        return length;
    }

    public final int a(int i) {
        if (i < 0 || i > this.b) {
            return 0;
        }
        return this.c[i];
    }

    public final void a(i iVar) {
        this.c = a(this.c, iVar.c);
        c();
    }

    public final int b(int i) {
        int iA = this.c[this.b];
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            iA = this.a.a(iA, i) ^ this.c[i2];
        }
        return iA;
    }

    public final byte[] b() {
        int i = 8;
        int i2 = 1;
        while (this.a.a() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[i2 * this.c.length];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final i c(int i) {
        if (!this.a.b(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new i(this.a, a(this.c, i));
    }

    public final void d(int i) {
        if (!this.a.b(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.c = a(this.c, i);
        c();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        for (int i = 0; i < this.c.length; i++) {
            iHashCode = (iHashCode * 31) + this.c[i];
        }
        return iHashCode;
    }

    public final String toString() {
        String str = " Polynomial over " + this.a.toString() + ": \n";
        for (int i = 0; i < this.c.length; i++) {
            str = str + this.a.c(this.c[i]) + "Y^" + i + "+";
        }
        return str + ";";
    }

    public i(b bVar, int[] iArr) {
        int[] iArrA;
        this.a = bVar;
        int iB = b(iArr);
        if (iB == -1) {
            iArrA = new int[1];
        } else if (iArr.length == iB + 1) {
            iArrA = d.a(iArr);
        } else {
            iArrA = new int[iB + 1];
            System.arraycopy(iArr, 0, iArrA, 0, iB + 1);
        }
        this.c = iArrA;
        c();
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = iArr3[length] ^ iArr[length];
        }
        return iArr3;
    }

    public final i b(i iVar) {
        int[] iArr = this.c;
        int[] iArr2 = iVar.c;
        int iB = b(iArr2);
        if (iB == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int[] iArrA = new int[iArr.length];
        int iA = this.a.a(a(iArr2));
        System.arraycopy(iArr, 0, iArrA, 0, iArrA.length);
        while (iB <= b(iArrA)) {
            iArrA = a(a(b(iArr2, b(iArrA) - iB), this.a.a(a(iArrA), iA)), iArrA);
        }
        return new i(this.a, iArrA);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a.equals(iVar.a) && this.b == iVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = iVar.c;
            int iB = b(iArr);
            if (iB == b(iArr2)) {
                int i = 0;
                while (true) {
                    if (i > iB) {
                        z = true;
                        break;
                    }
                    if (iArr[i] != iArr2[i]) {
                        z = false;
                        break;
                    }
                    i++;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
