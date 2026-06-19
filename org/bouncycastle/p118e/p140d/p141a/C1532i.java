package org.bouncycastle.p118e.p140d.p141a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1532i {

    /* JADX INFO: renamed from: a */
    private C1525b f5474a;

    /* JADX INFO: renamed from: b */
    private int f5475b;

    /* JADX INFO: renamed from: c */
    private int[] f5476c;

    public C1532i(C1525b c1525b, int i) {
        this.f5474a = c1525b;
        this.f5475b = i;
        this.f5476c = new int[i + 1];
        this.f5476c[i] = 1;
    }

    public C1532i(C1525b c1525b, byte[] bArr) {
        this.f5474a = c1525b;
        int i = 8;
        int i2 = 1;
        while (c1525b.m4026a() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f5476c = new int[bArr.length / i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f5476c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                int[] iArr = this.f5476c;
                iArr[i4] = ((bArr[i3] & 255) << i5) ^ iArr[i4];
                i5 += 8;
                i3++;
            }
            if (!this.f5474a.m4029b(this.f5476c[i4])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
        }
        if (this.f5476c.length != 1 && this.f5476c[this.f5476c.length - 1] == 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        m4048c();
    }

    public C1532i(C1532i c1532i) {
        this.f5474a = c1532i.f5474a;
        this.f5475b = c1532i.f5475b;
        this.f5476c = C1527d.m4034a(c1532i.f5476c);
    }

    /* JADX INFO: renamed from: a */
    private static int m4043a(int[] iArr) {
        int iM4046b = m4046b(iArr);
        if (iM4046b == -1) {
            return 0;
        }
        return iArr[iM4046b];
    }

    /* JADX INFO: renamed from: a */
    private int[] m4044a(int[] iArr, int i) {
        int iM4046b = m4046b(iArr);
        if (iM4046b == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return C1527d.m4034a(iArr);
        }
        int[] iArr2 = new int[iM4046b + 1];
        while (iM4046b >= 0) {
            iArr2[iM4046b] = this.f5474a.m4028a(iArr[iM4046b], i);
            iM4046b--;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    private static int m4046b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    private static int[] m4047b(int[] iArr, int i) {
        int iM4046b = m4046b(iArr);
        if (iM4046b == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iM4046b + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, iM4046b + 1);
        return iArr2;
    }

    /* JADX INFO: renamed from: c */
    private void m4048c() {
        this.f5475b = this.f5476c.length - 1;
        while (this.f5475b >= 0 && this.f5476c[this.f5475b] == 0) {
            this.f5475b--;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4049a() {
        int length = this.f5476c.length - 1;
        if (this.f5476c[length] == 0) {
            return -1;
        }
        return length;
    }

    /* JADX INFO: renamed from: a */
    public final int m4050a(int i) {
        if (i < 0 || i > this.f5475b) {
            return 0;
        }
        return this.f5476c[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m4051a(C1532i c1532i) {
        this.f5476c = m4045a(this.f5476c, c1532i.f5476c);
        m4048c();
    }

    /* JADX INFO: renamed from: b */
    public final int m4052b(int i) {
        int iM4028a = this.f5476c[this.f5475b];
        for (int i2 = this.f5475b - 1; i2 >= 0; i2--) {
            iM4028a = this.f5474a.m4028a(iM4028a, i) ^ this.f5476c[i2];
        }
        return iM4028a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4054b() {
        int i = 8;
        int i2 = 1;
        while (this.f5474a.m4026a() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[i2 * this.f5476c.length];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f5476c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f5476c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public final C1532i m4055c(int i) {
        if (!this.f5474a.m4029b(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new C1532i(this.f5474a, m4044a(this.f5476c, i));
    }

    /* JADX INFO: renamed from: d */
    public final void m4056d(int i) {
        if (!this.f5474a.m4029b(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.f5476c = m4044a(this.f5476c, i);
        m4048c();
    }

    public final int hashCode() {
        int iHashCode = this.f5474a.hashCode();
        for (int i = 0; i < this.f5476c.length; i++) {
            iHashCode = (iHashCode * 31) + this.f5476c[i];
        }
        return iHashCode;
    }

    public final String toString() {
        String str = " Polynomial over " + this.f5474a.toString() + ": \n";
        for (int i = 0; i < this.f5476c.length; i++) {
            str = str + this.f5474a.m4031c(this.f5476c[i]) + "Y^" + i + "+";
        }
        return str + ";";
    }

    public C1532i(C1525b c1525b, int[] iArr) {
        int[] iArrM4034a;
        this.f5474a = c1525b;
        int iM4046b = m4046b(iArr);
        if (iM4046b == -1) {
            iArrM4034a = new int[1];
        } else if (iArr.length == iM4046b + 1) {
            iArrM4034a = C1527d.m4034a(iArr);
        } else {
            iArrM4034a = new int[iM4046b + 1];
            System.arraycopy(iArr, 0, iArrM4034a, 0, iM4046b + 1);
        }
        this.f5476c = iArrM4034a;
        m4048c();
    }

    /* JADX INFO: renamed from: a */
    private static int[] m4045a(int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: b */
    public final C1532i m4053b(C1532i c1532i) {
        int[] iArr = this.f5476c;
        int[] iArr2 = c1532i.f5476c;
        int iM4046b = m4046b(iArr2);
        if (iM4046b == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int[] iArrM4045a = new int[iArr.length];
        int iM4027a = this.f5474a.m4027a(m4043a(iArr2));
        System.arraycopy(iArr, 0, iArrM4045a, 0, iArrM4045a.length);
        while (iM4046b <= m4046b(iArrM4045a)) {
            iArrM4045a = m4045a(m4044a(m4047b(iArr2, m4046b(iArrM4045a) - iM4046b), this.f5474a.m4028a(m4043a(iArrM4045a), iM4027a)), iArrM4045a);
        }
        return new C1532i(this.f5474a, iArrM4045a);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == null || !(obj instanceof C1532i)) {
            return false;
        }
        C1532i c1532i = (C1532i) obj;
        if (this.f5474a.equals(c1532i.f5474a) && this.f5475b == c1532i.f5475b) {
            int[] iArr = this.f5476c;
            int[] iArr2 = c1532i.f5476c;
            int iM4046b = m4046b(iArr);
            if (iM4046b == m4046b(iArr2)) {
                int i = 0;
                while (true) {
                    if (i > iM4046b) {
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
