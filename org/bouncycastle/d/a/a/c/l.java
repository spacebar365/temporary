package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g$b {
    public static final BigInteger a = i.i;
    protected int[] b;

    public l(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.b = k.a(bigInteger);
    }

    protected l(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.e.c(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return org.bouncycastle.d.c.e.a(this.b, ((l) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 5);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.e.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.e.b(this.b);
    }

    public l() {
        this.b = new int[5];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        k.a(this.b, ((l) gVar).b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[5];
        k.a(this.b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        k.d(this.b, ((l) gVar).b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        k.b(this.b, ((l) gVar).b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        org.bouncycastle.d.c.b.a(k.a, ((l) gVar).b, iArr);
        k.b(iArr, this.b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[5];
        k.b(this.b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[5];
        k.d(this.b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[5];
        org.bouncycastle.d.c.b.a(k.a, this.b, iArr);
        return new l(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.e.b(iArr) || org.bouncycastle.d.c.e.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        k.d(iArr, iArr2);
        k.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        k.a(iArr2, 2, iArr3);
        k.b(iArr3, iArr2, iArr3);
        k.a(iArr3, 4, iArr2);
        k.b(iArr2, iArr3, iArr2);
        k.a(iArr2, 8, iArr3);
        k.b(iArr3, iArr2, iArr3);
        k.a(iArr3, 16, iArr2);
        k.b(iArr2, iArr3, iArr2);
        k.a(iArr2, 32, iArr3);
        k.b(iArr3, iArr2, iArr3);
        k.a(iArr3, 64, iArr2);
        k.b(iArr2, iArr3, iArr2);
        k.d(iArr2, iArr3);
        k.b(iArr3, iArr, iArr3);
        k.a(iArr3, 29, iArr3);
        k.d(iArr3, iArr2);
        if (org.bouncycastle.d.c.e.a(iArr, iArr2)) {
            return new l(iArr3);
        }
        return null;
    }
}
