package org.bouncycastle.p118e.p140d.p141a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1525b {

    /* JADX INFO: renamed from: a */
    private int f5462a;

    /* JADX INFO: renamed from: b */
    private int f5463b;

    /* JADX INFO: renamed from: b */
    private int m4024b(int i, int i2) {
        int iM4028a;
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
            i = m4027a(i);
            i2 = -i2;
            iM4028a = 1;
        } else {
            iM4028a = 1;
        }
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                iM4028a = m4028a(iM4028a, i);
            }
            i = m4028a(i, i);
            i2 >>>= 1;
        }
        return iM4028a;
    }

    /* JADX INFO: renamed from: d */
    private static String m4025d(int i) {
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

    /* JADX INFO: renamed from: a */
    public final int m4026a() {
        return this.f5462a;
    }

    /* JADX INFO: renamed from: a */
    public final int m4027a(int i) {
        return m4024b(i, (1 << this.f5462a) - 2);
    }

    /* JADX INFO: renamed from: a */
    public final int m4028a(int i, int i2) {
        return C1533j.m4059a(i, i2, this.f5463b);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4029b(int i) {
        return this.f5462a == 31 ? i >= 0 : i >= 0 && i < (1 << this.f5462a);
    }

    /* JADX INFO: renamed from: c */
    public final String m4031c(int i) {
        String str = "";
        int i2 = 0;
        while (i2 < this.f5462a) {
            String strConcat = (((byte) i) & 1) == 0 ? "0".concat(String.valueOf(str)) : "1".concat(String.valueOf(str));
            i >>>= 1;
            i2++;
            str = strConcat;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1525b)) {
            return false;
        }
        C1525b c1525b = (C1525b) obj;
        return this.f5462a == c1525b.f5462a && this.f5463b == c1525b.f5463b;
    }

    public final int hashCode() {
        return this.f5463b;
    }

    public final String toString() {
        return "Finite Field GF(2^" + this.f5462a + ") = GF(2)[X]/<" + m4025d(this.f5463b) + "> ";
    }

    public C1525b(byte[] bArr) {
        this.f5462a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f5463b = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        if (!C1533j.m4060b(this.f5463b)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f5462a = C1533j.m4057a(this.f5463b);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4030b() {
        int i = this.f5463b;
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }
}
