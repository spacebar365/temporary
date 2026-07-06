package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends g$b {
    public static final BigInteger a = x.i;
    protected int[] b;

    public aa(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.b = z.a(bigInteger);
    }

    protected aa(int[] iArr) {
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
        if (obj instanceof aa) {
            return org.bouncycastle.d.c.f.b(this.b, ((aa) obj).b);
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

    public aa() {
        this.b = new int[6];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        z.a(this.b, ((aa) gVar).b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[6];
        z.a(this.b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        z.d(this.b, ((aa) gVar).b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        z.b(this.b, ((aa) gVar).b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[6];
        org.bouncycastle.d.c.b.a(z.a, ((aa) gVar).b, iArr);
        z.b(iArr, this.b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[6];
        z.b(this.b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[6];
        z.d(this.b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[6];
        org.bouncycastle.d.c.b.a(z.a, this.b, iArr);
        return new aa(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.f.b(iArr) || org.bouncycastle.d.c.f.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        z.d(iArr, iArr2);
        z.b(iArr2, iArr, iArr2);
        z.a(iArr2, 2, iArr3);
        z.b(iArr3, iArr2, iArr3);
        z.a(iArr3, 4, iArr2);
        z.b(iArr2, iArr3, iArr2);
        z.a(iArr2, 8, iArr3);
        z.b(iArr3, iArr2, iArr3);
        z.a(iArr3, 16, iArr2);
        z.b(iArr2, iArr3, iArr2);
        z.a(iArr2, 32, iArr3);
        z.b(iArr3, iArr2, iArr3);
        z.a(iArr3, 64, iArr2);
        z.b(iArr2, iArr3, iArr2);
        z.a(iArr2, 62, iArr2);
        z.d(iArr2, iArr3);
        if (org.bouncycastle.d.c.f.b(iArr, iArr3)) {
            return new aa(iArr2);
        }
        return null;
    }
}
