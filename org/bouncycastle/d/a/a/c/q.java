package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class q extends g$b {
    public static final BigInteger a = n.i;
    protected int[] b;

    public q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.b = p.a(bigInteger);
    }

    protected q(int[] iArr) {
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
        if (obj instanceof q) {
            return org.bouncycastle.d.c.e.a(this.b, ((q) obj).b);
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

    public q() {
        this.b = new int[5];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        p.a(this.b, ((q) gVar).b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[5];
        p.a(this.b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        p.d(this.b, ((q) gVar).b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        p.b(this.b, ((q) gVar).b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[5];
        org.bouncycastle.d.c.b.a(p.a, ((q) gVar).b, iArr);
        p.b(iArr, this.b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[5];
        p.b(this.b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[5];
        p.d(this.b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[5];
        org.bouncycastle.d.c.b.a(p.a, this.b, iArr);
        return new q(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.e.b(iArr) || org.bouncycastle.d.c.e.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        p.d(iArr, iArr2);
        p.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        p.d(iArr2, iArr3);
        p.b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        p.d(iArr3, iArr4);
        p.b(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        p.a(iArr4, 3, iArr5);
        p.b(iArr5, iArr3, iArr5);
        p.a(iArr5, 7, iArr4);
        p.b(iArr4, iArr5, iArr4);
        p.a(iArr4, 3, iArr5);
        p.b(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        p.a(iArr5, 14, iArr6);
        p.b(iArr6, iArr4, iArr6);
        p.a(iArr6, 31, iArr4);
        p.b(iArr4, iArr6, iArr4);
        p.a(iArr4, 62, iArr6);
        p.b(iArr6, iArr4, iArr6);
        p.a(iArr6, 3, iArr4);
        p.b(iArr4, iArr3, iArr4);
        p.a(iArr4, 18, iArr4);
        p.b(iArr4, iArr5, iArr4);
        p.a(iArr4, 2, iArr4);
        p.b(iArr4, iArr, iArr4);
        p.a(iArr4, 3, iArr4);
        p.b(iArr4, iArr2, iArr4);
        p.a(iArr4, 6, iArr4);
        p.b(iArr4, iArr3, iArr4);
        p.a(iArr4, 2, iArr4);
        p.b(iArr4, iArr, iArr4);
        p.d(iArr4, iArr2);
        if (org.bouncycastle.d.c.e.a(iArr, iArr2)) {
            return new q(iArr4);
        }
        return null;
    }
}
