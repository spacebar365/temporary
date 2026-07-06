package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g$b {
    public static final BigInteger a = a.i;
    protected int[] b;

    public d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.b = c.a(bigInteger);
    }

    protected d(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return org.bouncycastle.d.c.d.a(this.b, ((d) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 4);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.d.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.d.b(this.b);
    }

    public d() {
        this.b = new int[4];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        int[] iArr = this.b;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                org.bouncycastle.f.g.a(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[4];
        c.a(this.b, ((d) gVar).b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[4];
        c.a(this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[4];
        c.d(this.b, ((d) gVar).b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[4];
        c.b(this.b, ((d) gVar).b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[4];
        org.bouncycastle.d.c.b.a(c.a, ((d) gVar).b, iArr);
        c.b(iArr, this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[4];
        c.b(this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[4];
        c.d(this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[4];
        org.bouncycastle.d.c.b.a(c.a, this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.d.b(iArr) || org.bouncycastle.d.c.d.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        c.d(iArr, iArr2);
        c.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        c.a(iArr2, 2, iArr3);
        c.b(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        c.a(iArr3, 4, iArr4);
        c.b(iArr4, iArr3, iArr4);
        c.a(iArr4, 2, iArr3);
        c.b(iArr3, iArr2, iArr3);
        c.a(iArr3, 10, iArr2);
        c.b(iArr2, iArr3, iArr2);
        c.a(iArr2, 10, iArr4);
        c.b(iArr4, iArr3, iArr4);
        c.d(iArr4, iArr3);
        c.b(iArr3, iArr, iArr3);
        c.a(iArr3, 95, iArr3);
        c.d(iArr3, iArr4);
        if (org.bouncycastle.d.c.d.a(iArr, iArr4)) {
            return new d(iArr3);
        }
        return null;
    }
}
