package org.bouncycastle.d.a.a.a;

import java.math.BigInteger;
import org.bouncycastle.d.a.g;
import org.bouncycastle.d.a.g$b;
import org.bouncycastle.d.c.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g$b {
    public static final BigInteger a = a.i;
    private static final int[] i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    protected int[] b;

    public d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.b = c.a(bigInteger);
    }

    protected d(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return h.c(this.b);
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
            return h.c(this.b, ((d) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 8);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return h.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return h.b(this.b);
    }

    public d() {
        this.b = new int[8];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar) {
        int[] iArr = new int[8];
        c.a(this.b, ((d) gVar).b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g c() {
        int[] iArr = new int[8];
        c.a(this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g b(g gVar) {
        int[] iArr = new int[8];
        c.d(this.b, ((d) gVar).b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g c(g gVar) {
        int[] iArr = new int[8];
        c.b(this.b, ((d) gVar).b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g d(g gVar) {
        int[] iArr = new int[8];
        org.bouncycastle.d.c.b.a(c.a, ((d) gVar).b, iArr);
        c.b(iArr, this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g d() {
        int[] iArr = new int[8];
        c.b(this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g e() {
        int[] iArr = new int[8];
        c.d(this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g f() {
        int[] iArr = new int[8];
        org.bouncycastle.d.c.b.a(c.a, this.b, iArr);
        return new d(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final g g() {
        int[] iArr = this.b;
        if (h.b(iArr) || h.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        c.d(iArr, iArr2);
        c.b(iArr2, iArr, iArr2);
        c.d(iArr2, iArr2);
        c.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        c.d(iArr2, iArr3);
        c.b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        c.a(iArr3, 3, iArr4);
        c.b(iArr4, iArr2, iArr4);
        c.a(iArr4, 4, iArr2);
        c.b(iArr2, iArr3, iArr2);
        c.a(iArr2, 4, iArr4);
        c.b(iArr4, iArr3, iArr4);
        c.a(iArr4, 15, iArr3);
        c.b(iArr3, iArr4, iArr3);
        c.a(iArr3, 30, iArr4);
        c.b(iArr4, iArr3, iArr4);
        c.a(iArr4, 60, iArr3);
        c.b(iArr3, iArr4, iArr3);
        c.a(iArr3, 11, iArr4);
        c.b(iArr4, iArr2, iArr4);
        c.a(iArr4, 120, iArr2);
        c.b(iArr2, iArr3, iArr2);
        c.d(iArr2, iArr2);
        c.d(iArr2, iArr3);
        if (h.c(iArr, iArr3)) {
            return new d(iArr2);
        }
        c.b(iArr2, i, iArr2);
        c.d(iArr2, iArr3);
        if (h.c(iArr, iArr3)) {
            return new d(iArr2);
        }
        return null;
    }
}
