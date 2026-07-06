package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class v {
    private final BigInteger a;
    private final int b;

    public v(BigInteger bigInteger, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.a = bigInteger;
        this.b = i;
    }

    private BigInteger c() {
        return this.a.shiftRight(this.b);
    }

    public final v a(BigInteger bigInteger) {
        return new v(this.a.subtract(bigInteger.shiftLeft(this.b)), this.b);
    }

    public final int b() {
        return this.b;
    }

    public final int b(BigInteger bigInteger) {
        return this.a.compareTo(bigInteger.shiftLeft(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && this.b == vVar.b;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b;
    }

    public final String toString() {
        if (this.b == 0) {
            return this.a.toString();
        }
        BigInteger bigIntegerC = c();
        BigInteger bigIntegerSubtract = this.a.subtract(bigIntegerC.shiftLeft(this.b));
        if (this.a.signum() == -1) {
            bigIntegerSubtract = c.d.shiftLeft(this.b).subtract(bigIntegerSubtract);
        }
        if (bigIntegerC.signum() == -1 && !bigIntegerSubtract.equals(c.c)) {
            bigIntegerC = bigIntegerC.add(c.d);
        }
        String string = bigIntegerC.toString();
        char[] cArr = new char[this.b];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i = this.b - length;
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

    public final v a(v vVar) {
        if (this.b != vVar.b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
        return new v(this.a.add(vVar.a), this.b);
    }

    public final v b(v vVar) {
        return a(new v(vVar.a.negate(), vVar.b));
    }

    public final BigInteger a() {
        v vVar = new v(c.d, 1);
        int i = this.b;
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i != vVar.b) {
            vVar = new v(vVar.a.shiftLeft(i - vVar.b), i);
        }
        return a(vVar).c();
    }
}
