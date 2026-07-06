package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class ci extends g$a {
    protected long[] a;

    public ci(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.a = ch.a(bigInteger);
    }

    protected ci(long[] jArr) {
        this.a = jArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.h.c(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return 193;
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
        if (obj instanceof ci) {
            return org.bouncycastle.d.c.h.a(this.a, ((ci) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1930015 ^ org.bouncycastle.f.a.a(this.a, 4);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.h.a(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.h.b(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.a[0] & 1) != 0;
    }

    public ci() {
        this.a = new long[4];
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = this.a;
        long[] jArr2 = ((ci) gVar).a;
        return new ci(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = this.a;
        return new ci(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[4];
        ch.a(this.a, ((ci) gVar).a, jArr);
        return new ci(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((ci) gVar).a;
        long[] jArr3 = ((ci) gVar2).a;
        long[] jArr4 = ((ci) gVar3).a;
        long[] jArr5 = new long[8];
        ch.b(jArr, jArr2, jArr5);
        ch.b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        ch.b(jArr5, jArr6);
        return new ci(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[4];
        ch.c(this.a, jArr);
        return new ci(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((ci) gVar).a;
        long[] jArr3 = ((ci) gVar2).a;
        long[] jArr4 = new long[8];
        ch.d(jArr, jArr4);
        ch.b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[4];
        ch.b(jArr4, jArr5);
        return new ci(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[4];
        ch.a(this.a, i, jArr);
        return new ci(jArr);
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        return ((int) this.a[0]) & 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[4];
        ch.a(this.a, jArr);
        return new ci(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = this.a;
        long jA = org.bouncycastle.d.c.a.a(jArr[0]);
        long jA2 = org.bouncycastle.d.c.a.a(jArr[1]);
        long j = (4294967295L & jA) | (jA2 << 32);
        long j2 = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = org.bouncycastle.d.c.a.a(jArr[2]);
        long j3 = (4294967295L & jA3) ^ (jArr[3] << 32);
        long j4 = jA3 >>> 32;
        return new ci(new long[]{j ^ (j2 << 8), (((j4 << 8) ^ j3) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ ((j4 >>> 56) ^ (j4 << 33)), j4 >>> 31});
    }
}
