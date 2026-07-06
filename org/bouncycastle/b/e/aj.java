package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class aj implements org.bouncycastle.b.e {
    private int[] a = null;
    private boolean b;

    private static int a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private static int a(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private static void a(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    private void a(byte[] bArr) {
        int[] iArr = new int[((bArr.length + 4) - 1) / 4];
        for (int length = bArr.length - 1; length >= 0; length--) {
            iArr[length / 4] = (iArr[length / 4] << 8) + (bArr[length] & 255);
        }
        this.a = new int[44];
        this.a[0] = -1209970333;
        for (int i = 1; i < this.a.length; i++) {
            this.a[i] = r1[i - 1] - 1640531527;
        }
        int length2 = iArr.length > this.a.length ? iArr.length * 3 : this.a.length * 3;
        int i2 = 0;
        int length3 = 0;
        int length4 = 0;
        int iA = 0;
        int iA2 = 0;
        while (i2 < length2) {
            int[] iArr2 = this.a;
            iA2 = a(iA2 + iArr2[length4] + iA, 3);
            iArr2[length4] = iA2;
            iA = a(iArr[length3] + iA2 + iA, iA + iA2);
            iArr[length3] = iA;
            length4 = (length4 + 1) % this.a.length;
            i2++;
            length3 = (length3 + 1) % iArr.length;
        }
    }

    private static int b(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 1;
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        int iA3 = a(bArr, i + 8);
        int iA4 = a(bArr, i + 12);
        int i4 = this.a[0] + iA2;
        int i5 = this.a[1] + iA4;
        int i6 = iA;
        while (i3 <= 20) {
            int iA5 = a(((i4 * 2) + 1) * i4, 5);
            int iA6 = a(((i5 * 2) + 1) * i5, 5);
            int iA7 = this.a[i3 * 2] + a(i6 ^ iA5, iA6);
            int iA8 = this.a[(i3 * 2) + 1] + a(iA3 ^ iA6, iA5);
            i3++;
            iA3 = i5;
            i6 = i4;
            i4 = iA8;
            i5 = iA7;
        }
        int i7 = this.a[42] + i6;
        int i8 = iA3 + this.a[43];
        a(i7, bArr2, i2);
        a(i4, bArr2, i2 + 4);
        a(i8, bArr2, i2 + 8);
        a(i5, bArr2, i2 + 12);
        return 16;
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        int iA3 = a(bArr, i + 8);
        int iA4 = a(bArr, i + 12);
        int i3 = iA3 - this.a[43];
        int i4 = iA - this.a[42];
        int i5 = iA2;
        int i6 = 20;
        while (i6 > 0) {
            int iA5 = a(((i4 * 2) + 1) * i4, 5);
            int iA6 = a(((i3 * 2) + 1) * i3, 5);
            int iB = b(i5 - this.a[(i6 * 2) + 1], iA5) ^ iA6;
            int iB2 = iA5 ^ b(iA4 - this.a[i6 * 2], iA6);
            i6--;
            i5 = i4;
            iA4 = i3;
            i4 = iB2;
            i3 = iB;
        }
        int i7 = iA4 - this.a[1];
        int i8 = i5 - this.a[0];
        a(i4, bArr2, i2);
        a(i8, bArr2, i2 + 4);
        a(i3, bArr2, i2 + 8);
        a(i7, bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.a == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        return this.b ? b(bArr, i, bArr2, i2) : c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "RC6";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + iVar.getClass().getName());
        }
        this.b = z;
        a(((org.bouncycastle.b.k.ba) iVar).a());
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }
}
