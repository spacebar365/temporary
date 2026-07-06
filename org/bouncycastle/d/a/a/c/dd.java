package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends g$a {
    protected long[] a;

    public dd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.a = dc.a(bigInteger);
    }

    protected dd(long[] jArr) {
        this.a = jArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return 283;
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
        return 2831275 ^ org.bouncycastle.f.a.a(this.a, 5);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.i.a(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        return dc.a(this.a);
    }

    public dd() {
        this.a = new long[5];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        long[] jArr = this.a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        long[] jArr = this.a;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                org.bouncycastle.f.g.a(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[5];
        dc.a(this.a, ((dd) gVar).a, jArr);
        return new dd(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = new long[5];
        dc.a(this.a, jArr);
        return new dd(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[5];
        dc.b(this.a, ((dd) gVar).a, jArr);
        return new dd(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((dd) gVar).a;
        long[] jArr3 = ((dd) gVar2).a;
        long[] jArr4 = ((dd) gVar3).a;
        long[] jArr5 = new long[9];
        dc.c(jArr, jArr2, jArr5);
        dc.c(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        dc.c(jArr5, jArr6);
        return new dd(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[5];
        dc.e(this.a, jArr);
        return new dd(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((dd) gVar).a;
        long[] jArr3 = ((dd) gVar2).a;
        long[] jArr4 = new long[9];
        dc.f(jArr, jArr4);
        dc.c(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[5];
        dc.c(jArr4, jArr5);
        return new dd(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[5];
        dc.a(this.a, i, jArr);
        return new dd(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[5];
        dc.b(this.a, jArr);
        return new dd(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = new long[5];
        dc.d(this.a, jArr);
        return new dd(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = ((dd) obj).a;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
