package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class bx extends g$a {
    protected long[] a;

    public bx(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.a = bw.a(bigInteger);
    }

    protected bx(long[] jArr) {
        this.a = jArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.f.c(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return 163;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        return a(gVar);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        return this;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        return c(gVar.f());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bx) {
            return org.bouncycastle.d.c.f.a(this.a, ((bx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 163763 ^ org.bouncycastle.f.a.a(this.a, 3);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.f.a(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.f.b(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        return bw.a(this.a);
    }

    public bx() {
        this.a = new long[3];
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[3];
        bw.a(this.a, ((bx) gVar).a, jArr);
        return new bx(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = new long[3];
        bw.a(this.a, jArr);
        return new bx(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[3];
        bw.b(this.a, ((bx) gVar).a, jArr);
        return new bx(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((bx) gVar).a;
        long[] jArr3 = ((bx) gVar2).a;
        long[] jArr4 = ((bx) gVar3).a;
        long[] jArr5 = new long[6];
        bw.c(jArr, jArr2, jArr5);
        bw.c(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        bw.c(jArr5, jArr6);
        return new bx(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[3];
        bw.e(this.a, jArr);
        return new bx(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((bx) gVar).a;
        long[] jArr3 = ((bx) gVar2).a;
        long[] jArr4 = new long[6];
        bw.f(jArr, jArr4);
        bw.c(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[3];
        bw.c(jArr4, jArr5);
        return new bx(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[3];
        bw.a(this.a, i, jArr);
        return new bx(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[3];
        bw.b(this.a, jArr);
        return new bx(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = new long[3];
        bw.d(this.a, jArr);
        return new bx(jArr);
    }
}
