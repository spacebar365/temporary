package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.a.v */
/* JADX INFO: loaded from: classes.dex */
final class C1401v {

    /* JADX INFO: renamed from: a */
    private final BigInteger f5101a;

    /* JADX INFO: renamed from: b */
    private final int f5102b;

    public C1401v(BigInteger bigInteger, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f5101a = bigInteger;
        this.f5102b = i;
    }

    /* JADX INFO: renamed from: c */
    private BigInteger m3525c() {
        return this.f5101a.shiftRight(this.f5102b);
    }

    /* JADX INFO: renamed from: a */
    public final C1401v m3527a(BigInteger bigInteger) {
        return new C1401v(this.f5101a.subtract(bigInteger.shiftLeft(this.f5102b)), this.f5102b);
    }

    /* JADX INFO: renamed from: b */
    public final int m3529b() {
        return this.f5102b;
    }

    /* JADX INFO: renamed from: b */
    public final int m3530b(BigInteger bigInteger) {
        return this.f5101a.compareTo(bigInteger.shiftLeft(this.f5102b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1401v)) {
            return false;
        }
        C1401v c1401v = (C1401v) obj;
        return this.f5101a.equals(c1401v.f5101a) && this.f5102b == c1401v.f5102b;
    }

    public final int hashCode() {
        return this.f5101a.hashCode() ^ this.f5102b;
    }

    public final String toString() {
        if (this.f5102b == 0) {
            return this.f5101a.toString();
        }
        BigInteger bigIntegerM3525c = m3525c();
        BigInteger bigIntegerSubtract = this.f5101a.subtract(bigIntegerM3525c.shiftLeft(this.f5102b));
        if (this.f5101a.signum() == -1) {
            bigIntegerSubtract = InterfaceC1376c.f4995d.shiftLeft(this.f5102b).subtract(bigIntegerSubtract);
        }
        if (bigIntegerM3525c.signum() == -1 && !bigIntegerSubtract.equals(InterfaceC1376c.f4994c)) {
            bigIntegerM3525c = bigIntegerM3525c.add(InterfaceC1376c.f4995d);
        }
        String string = bigIntegerM3525c.toString();
        char[] cArr = new char[this.f5102b];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i = this.f5102b - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = string2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C1401v m3528a(C1401v c1401v) {
        if (this.f5102b != c1401v.f5102b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
        return new C1401v(this.f5101a.add(c1401v.f5101a), this.f5102b);
    }

    /* JADX INFO: renamed from: b */
    public final C1401v m3531b(C1401v c1401v) {
        return m3528a(new C1401v(c1401v.f5101a.negate(), c1401v.f5102b));
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m3526a() {
        C1401v c1401v = new C1401v(InterfaceC1376c.f4995d, 1);
        int i = this.f5102b;
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i != c1401v.f5102b) {
            c1401v = new C1401v(c1401v.f5101a.shiftLeft(i - c1401v.f5102b), i);
        }
        return m3528a(c1401v).m3525c();
    }
}
