package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class au extends g$b {
    public static final BigInteger a = ar.i;
    protected int[] b;

    public au(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.b = at.a(bigInteger);
    }

    protected au(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.h.c(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof au) {
            return org.bouncycastle.d.c.h.c(this.b, ((au) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 8);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.h.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.h.b(this.b);
    }

    public au() {
        this.b = new int[8];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        at.a(this.b, ((au) gVar).b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[8];
        at.a(this.b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        at.d(this.b, ((au) gVar).b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        at.b(this.b, ((au) gVar).b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        org.bouncycastle.d.c.b.a(at.a, ((au) gVar).b, iArr);
        at.b(iArr, this.b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[8];
        at.b(this.b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[8];
        at.d(this.b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[8];
        org.bouncycastle.d.c.b.a(at.a, this.b, iArr);
        return new au(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.h.b(iArr) || org.bouncycastle.d.c.h.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        at.d(iArr, iArr2);
        at.b(iArr2, iArr, iArr2);
        at.a(iArr2, 2, iArr3);
        at.b(iArr3, iArr2, iArr3);
        at.a(iArr3, 4, iArr2);
        at.b(iArr2, iArr3, iArr2);
        at.a(iArr2, 8, iArr3);
        at.b(iArr3, iArr2, iArr3);
        at.a(iArr3, 16, iArr2);
        at.b(iArr2, iArr3, iArr2);
        at.a(iArr2, 32, iArr2);
        at.b(iArr2, iArr, iArr2);
        at.a(iArr2, 96, iArr2);
        at.b(iArr2, iArr, iArr2);
        at.a(iArr2, 94, iArr2);
        at.d(iArr2, iArr3);
        if (org.bouncycastle.d.c.h.c(iArr, iArr3)) {
            return new au(iArr2);
        }
        return null;
    }
}
