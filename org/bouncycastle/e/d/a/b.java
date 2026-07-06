package org.bouncycastle.e.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private int a;
    private int b;

    private int b(int i, int i2) {
        int iA;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = a(i);
            i2 = -i2;
            iA = 1;
        } else {
            iA = 1;
        }
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                iA = a(iA, i);
            }
            i = a(i, i);
            i2 >>>= 1;
        }
        return iA;
    }

    private static String d(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    public final int a() {
        return this.a;
    }

    public final int a(int i) {
        return b(i, (1 << this.a) - 2);
    }

    public final int a(int i, int i2) {
        return j.a(i, i2, this.b);
    }

    public final boolean b(int i) {
        return this.a == 31 ? i >= 0 : i >= 0 && i < (1 << this.a);
    }

    public final String c(int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.a) {
            String strConcat = (((byte) i) & 1) == 0 ? "0".concat(String.valueOf(str)) : "1".concat(String.valueOf(str));
            i >>>= 1;
            i2++;
            str = strConcat;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "Finite Field GF(2^" + this.a + ") = GF(2)[X]/<" + d(this.b) + "> ";
    }

    public b(byte[] bArr) {
        this.a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.b = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        if (!j.b(this.b)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.a = j.a(this.b);
    }

    public final byte[] b() {
        int i = this.b;
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }
}
