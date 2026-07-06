package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class be extends g$b {
    public static final BigInteger a = bb.i;
    protected int[] b;

    public be(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.b = bd.a(bigInteger);
    }

    protected be(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.c.d(17, this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof be) {
            return org.bouncycastle.d.c.c.b(17, this.b, ((be) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 17);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.c.b(17, this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.c.c(17, this.b);
    }

    public be() {
        this.b = new int[17];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[17];
        bd.a(this.b, ((be) gVar).b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[17];
        bd.a(this.b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[17];
        bd.c(this.b, ((be) gVar).b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[17];
        bd.b(this.b, ((be) gVar).b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[17];
        org.bouncycastle.d.c.b.a(bd.a, ((be) gVar).b, iArr);
        bd.b(iArr, this.b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[17];
        bd.b(this.b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[17];
        bd.c(this.b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[17];
        org.bouncycastle.d.c.b.a(bd.a, this.b, iArr);
        return new be(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.c.c(17, iArr) || org.bouncycastle.d.c.c.b(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        bd.a(iArr, 519, iArr2);
        bd.c(iArr2, iArr3);
        if (org.bouncycastle.d.c.c.b(17, iArr, iArr3)) {
            return new be(iArr2);
        }
        return null;
    }
}
