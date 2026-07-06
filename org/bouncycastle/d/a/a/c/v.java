package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class v extends g$b {
    public static final BigInteger a = s.i;
    protected int[] b;

    public v(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.b = u.a(bigInteger);
    }

    protected v(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.f.c(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return org.bouncycastle.d.c.f.b(this.b, ((v) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 6);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.f.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.f.b(this.b);
    }

    public v() {
        this.b = new int[6];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        u.a(this.b, ((v) gVar).b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[6];
        u.a(this.b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        u.d(this.b, ((v) gVar).b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        u.b(this.b, ((v) gVar).b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        org.bouncycastle.d.c.b.a(u.a, ((v) gVar).b, iArr);
        u.b(iArr, this.b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[6];
        u.b(this.b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[6];
        u.d(this.b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[6];
        org.bouncycastle.d.c.b.a(u.a, this.b, iArr);
        return new v(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.f.b(iArr) || org.bouncycastle.d.c.f.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        u.d(iArr, iArr2);
        u.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        u.d(iArr2, iArr3);
        u.b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        u.a(iArr3, 3, iArr4);
        u.b(iArr4, iArr3, iArr4);
        u.a(iArr4, 2, iArr4);
        u.b(iArr4, iArr2, iArr4);
        u.a(iArr4, 8, iArr2);
        u.b(iArr2, iArr4, iArr2);
        u.a(iArr2, 3, iArr4);
        u.b(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        u.a(iArr4, 16, iArr5);
        u.b(iArr5, iArr2, iArr5);
        u.a(iArr5, 35, iArr2);
        u.b(iArr2, iArr5, iArr2);
        u.a(iArr2, 70, iArr5);
        u.b(iArr5, iArr2, iArr5);
        u.a(iArr5, 19, iArr2);
        u.b(iArr2, iArr4, iArr2);
        u.a(iArr2, 20, iArr2);
        u.b(iArr2, iArr4, iArr2);
        u.a(iArr2, 4, iArr2);
        u.b(iArr2, iArr3, iArr2);
        u.a(iArr2, 6, iArr2);
        u.b(iArr2, iArr3, iArr2);
        u.d(iArr2, iArr2);
        u.d(iArr2, iArr3);
        if (org.bouncycastle.d.c.f.b(iArr, iArr3)) {
            return new v(iArr2);
        }
        return null;
    }
}
