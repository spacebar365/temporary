package org.bouncycastle.e.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private int[] a;

    public h(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iA = f.a(bArr, 0);
        int iA2 = e.a(iA - 1);
        if (bArr.length != (iA * iA2) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[iA];
        for (int i = 0; i < iA; i++) {
            this.a[i] = f.a(bArr, (i * iA2) + 4, iA2);
        }
        if (!a(this.a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    private static boolean a(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] >= length || zArr[iArr[i]]) {
                return false;
            }
            zArr[iArr[i]] = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return d.a(this.a, ((h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final String toString() {
        String str = "[" + this.a[0];
        for (int i = 1; i < this.a.length; i++) {
            str = str + ", " + this.a[i];
        }
        return str + "]";
    }

    public final byte[] a() {
        int length = this.a.length;
        int iA = e.a(length - 1);
        byte[] bArr = new byte[(length * iA) + 4];
        f.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            int i2 = this.a[i];
            int i3 = (i * iA) + 4;
            for (int i4 = iA - 1; i4 >= 0; i4--) {
                bArr[i3 + i4] = (byte) (i2 >>> (i4 * 8));
            }
        }
        return bArr;
    }
}
