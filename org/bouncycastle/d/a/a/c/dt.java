package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class dt extends g$a {
    protected long[] a;

    public dt(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.a = ds.a(bigInteger);
    }

    protected dt(long[] jArr) {
        this.a = jArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return 571;
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

    public final int hashCode() {
        return 5711052 ^ org.bouncycastle.f.a.a(this.a, 9);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.m.a(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        return ds.b(this.a);
    }

    public dt() {
        this.a = new long[9];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        long[] jArr = this.a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        long[] jArr = this.a;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                org.bouncycastle.f.g.a(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[9];
        ds.a(this.a, ((dt) gVar).a, jArr);
        return new dt(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = new long[9];
        ds.a(this.a, jArr);
        return new dt(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[9];
        ds.c(this.a, ((dt) gVar).a, jArr);
        return new dt(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((dt) gVar).a;
        long[] jArr3 = ((dt) gVar2).a;
        long[] jArr4 = ((dt) gVar3).a;
        long[] jArr5 = new long[18];
        ds.d(jArr, jArr2, jArr5);
        ds.d(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        ds.c(jArr5, jArr6);
        return new dt(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[9];
        ds.e(this.a, jArr);
        return new dt(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((dt) gVar).a;
        long[] jArr3 = ((dt) gVar2).a;
        long[] jArr4 = new long[18];
        ds.f(jArr, jArr4);
        ds.d(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        ds.c(jArr4, jArr5);
        return new dt(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[9];
        ds.a(this.a, i, jArr);
        return new dt(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[9];
        ds.b(this.a, jArr);
        return new dt(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = new long[9];
        ds.d(this.a, jArr);
        return new dt(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dt)) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = ((dt) obj).a;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
