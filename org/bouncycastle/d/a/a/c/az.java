package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class az extends g$b {
    public static final BigInteger a = aw.i;
    protected int[] b;

    public az(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.b = ay.a(bigInteger);
    }

    protected az(int[] iArr) {
        this.b = iArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.c.d(12, this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof az) {
            return org.bouncycastle.d.c.c.b(12, this.b, ((az) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 12);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.c.b(12, this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.c.c(12, this.b);
    }

    public az() {
        this.b = new int[12];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[12];
        ay.a(this.b, ((az) gVar).b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[12];
        ay.a(this.b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[12];
        ay.d(this.b, ((az) gVar).b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[12];
        ay.c(this.b, ((az) gVar).b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[12];
        org.bouncycastle.d.c.b.a(ay.a, ((az) gVar).b, iArr);
        ay.c(iArr, this.b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[12];
        ay.b(this.b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[12];
        ay.d(this.b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[12];
        org.bouncycastle.d.c.b.a(ay.a, this.b, iArr);
        return new az(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.c.c(12, iArr) || org.bouncycastle.d.c.c.b(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        ay.d(iArr, iArr2);
        ay.c(iArr2, iArr, iArr2);
        ay.a(iArr2, 2, iArr3);
        ay.c(iArr3, iArr2, iArr3);
        ay.d(iArr3, iArr3);
        ay.c(iArr3, iArr, iArr3);
        ay.a(iArr3, 5, iArr4);
        ay.c(iArr4, iArr3, iArr4);
        ay.a(iArr4, 5, iArr5);
        ay.c(iArr5, iArr3, iArr5);
        ay.a(iArr5, 15, iArr3);
        ay.c(iArr3, iArr5, iArr3);
        ay.a(iArr3, 2, iArr4);
        ay.c(iArr2, iArr4, iArr2);
        ay.a(iArr4, 28, iArr4);
        ay.c(iArr3, iArr4, iArr3);
        ay.a(iArr3, 60, iArr4);
        ay.c(iArr4, iArr3, iArr4);
        ay.a(iArr4, 120, iArr3);
        ay.c(iArr3, iArr4, iArr3);
        ay.a(iArr3, 15, iArr3);
        ay.c(iArr3, iArr5, iArr3);
        ay.a(iArr3, 33, iArr3);
        ay.c(iArr3, iArr2, iArr3);
        ay.a(iArr3, 64, iArr3);
        ay.c(iArr3, iArr, iArr3);
        ay.a(iArr3, 30, iArr2);
        ay.d(iArr2, iArr3);
        if (org.bouncycastle.d.c.c.b(12, iArr, iArr3)) {
            return new az(iArr2);
        }
        return null;
    }
}
