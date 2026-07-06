package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class ap extends g$b {
    public static final BigInteger a = am.i;
    protected int[] b;

    public ap(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.b = ao.a(bigInteger);
    }

    protected ap(int[] iArr) {
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
        if (obj instanceof ap) {
            return org.bouncycastle.d.c.h.c(this.b, ((ap) obj).b);
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

    public ap() {
        this.b = new int[8];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        ao.a(this.b, ((ap) gVar).b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[8];
        ao.a(this.b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        ao.d(this.b, ((ap) gVar).b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        ao.b(this.b, ((ap) gVar).b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[8];
        org.bouncycastle.d.c.b.a(ao.a, ((ap) gVar).b, iArr);
        ao.b(iArr, this.b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[8];
        ao.b(this.b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[8];
        ao.d(this.b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[8];
        org.bouncycastle.d.c.b.a(ao.a, this.b, iArr);
        return new ap(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.h.b(iArr) || org.bouncycastle.d.c.h.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        ao.d(iArr, iArr2);
        ao.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        ao.d(iArr2, iArr3);
        ao.b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        ao.a(iArr3, 3, iArr4);
        ao.b(iArr4, iArr3, iArr4);
        ao.a(iArr4, 3, iArr4);
        ao.b(iArr4, iArr3, iArr4);
        ao.a(iArr4, 2, iArr4);
        ao.b(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        ao.a(iArr4, 11, iArr5);
        ao.b(iArr5, iArr4, iArr5);
        ao.a(iArr5, 22, iArr4);
        ao.b(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        ao.a(iArr4, 44, iArr6);
        ao.b(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        ao.a(iArr6, 88, iArr7);
        ao.b(iArr7, iArr6, iArr7);
        ao.a(iArr7, 44, iArr6);
        ao.b(iArr6, iArr4, iArr6);
        ao.a(iArr6, 3, iArr4);
        ao.b(iArr4, iArr3, iArr4);
        ao.a(iArr4, 23, iArr4);
        ao.b(iArr4, iArr5, iArr4);
        ao.a(iArr4, 6, iArr4);
        ao.b(iArr4, iArr2, iArr4);
        ao.a(iArr4, 2, iArr4);
        ao.d(iArr4, iArr2);
        if (org.bouncycastle.d.c.h.c(iArr, iArr2)) {
            return new ap(iArr4);
        }
        return null;
    }
}
