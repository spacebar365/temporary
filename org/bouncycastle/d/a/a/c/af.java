package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class af extends g$b {
    public static final BigInteger a = ac.i;
    private static final int[] i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    protected int[] b;

    public af(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.b = ae.a(bigInteger);
    }

    protected af(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.g.c(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof af) {
            return org.bouncycastle.d.c.g.b(this.b, ((af) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 7);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.g.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.g.b(this.b);
    }

    public af() {
        this.b = new int[7];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        ae.a(this.b, ((af) gVar).b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[7];
        ae.a(this.b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        ae.d(this.b, ((af) gVar).b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        ae.b(this.b, ((af) gVar).b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        org.bouncycastle.d.c.b.a(ae.a, ((af) gVar).b, iArr);
        ae.b(iArr, this.b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[7];
        ae.b(this.b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[7];
        ae.d(this.b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[7];
        org.bouncycastle.d.c.b.a(ae.a, this.b, iArr);
        return new af(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.g.b(iArr) || org.bouncycastle.d.c.g.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        ae.d(iArr, iArr2);
        ae.b(iArr2, iArr, iArr2);
        ae.d(iArr2, iArr2);
        ae.b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        ae.d(iArr2, iArr3);
        ae.b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        ae.a(iArr3, 4, iArr4);
        ae.b(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        ae.a(iArr4, 3, iArr5);
        ae.b(iArr5, iArr2, iArr5);
        ae.a(iArr5, 8, iArr5);
        ae.b(iArr5, iArr4, iArr5);
        ae.a(iArr5, 4, iArr4);
        ae.b(iArr4, iArr3, iArr4);
        ae.a(iArr4, 19, iArr3);
        ae.b(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        ae.a(iArr3, 42, iArr6);
        ae.b(iArr6, iArr3, iArr6);
        ae.a(iArr6, 23, iArr3);
        ae.b(iArr3, iArr4, iArr3);
        ae.a(iArr3, 84, iArr4);
        ae.b(iArr4, iArr6, iArr4);
        ae.a(iArr4, 20, iArr4);
        ae.b(iArr4, iArr5, iArr4);
        ae.a(iArr4, 3, iArr4);
        ae.b(iArr4, iArr, iArr4);
        ae.a(iArr4, 2, iArr4);
        ae.b(iArr4, iArr, iArr4);
        ae.a(iArr4, 4, iArr4);
        ae.b(iArr4, iArr2, iArr4);
        ae.d(iArr4, iArr4);
        ae.d(iArr4, iArr6);
        if (org.bouncycastle.d.c.g.b(iArr, iArr6)) {
            return new af(iArr4);
        }
        ae.b(iArr4, i, iArr4);
        ae.d(iArr4, iArr6);
        if (org.bouncycastle.d.c.g.b(iArr, iArr6)) {
            return new af(iArr4);
        }
        return null;
    }
}
