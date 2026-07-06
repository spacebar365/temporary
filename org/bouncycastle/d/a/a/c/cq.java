package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class cq extends g$a {
    protected long[] a;

    public cq(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.a = cp.a(bigInteger);
    }

    protected cq(long[] jArr) {
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
        return 233;
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
        if (obj instanceof cq) {
            return org.bouncycastle.d.c.h.a(this.a, ((cq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 2330074 ^ org.bouncycastle.f.a.a(this.a, 4);
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

    public cq() {
        this.a = new long[4];
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = this.a;
        long[] jArr2 = ((cq) gVar).a;
        return new cq(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = this.a;
        return new cq(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[4];
        cp.a(this.a, ((cq) gVar).a, jArr);
        return new cq(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((cq) gVar).a;
        long[] jArr3 = ((cq) gVar2).a;
        long[] jArr4 = ((cq) gVar3).a;
        long[] jArr5 = new long[8];
        cp.b(jArr, jArr2, jArr5);
        cp.b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        cp.b(jArr5, jArr6);
        return new cq(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[4];
        cp.c(this.a, jArr);
        return new cq(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((cq) gVar).a;
        long[] jArr3 = ((cq) gVar2).a;
        long[] jArr4 = new long[8];
        cp.d(jArr, jArr4);
        cp.b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[4];
        cp.b(jArr4, jArr5);
        return new cq(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[4];
        cp.a(this.a, i, jArr);
        return new cq(jArr);
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        long[] jArr = this.a;
        return ((int) ((jArr[2] >>> 31) ^ jArr[0])) & 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[4];
        cp.a(this.a, jArr);
        return new cq(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.a;
        long jA = org.bouncycastle.d.c.a.a(jArr2[0]);
        long jA2 = org.bouncycastle.d.c.a.a(jArr2[1]);
        long j = (4294967295L & jA) | (jA2 << 32);
        long j2 = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = org.bouncycastle.d.c.a.a(jArr2[2]);
        long jA4 = org.bouncycastle.d.c.a.a(jArr2[3]);
        long j3 = (4294967295L & jA3) | (jA4 << 32);
        long j4 = (jA3 >>> 32) | (jA4 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i] >>> 6;
            int i3 = iArr[i] & 63;
            jArr3[i2] = jArr3[i2] ^ (j7 << i3);
            int i4 = i2 + 1;
            jArr3[i4] = jArr3[i4] ^ ((j6 << i3) | (j7 >>> (-i3)));
            int i5 = i2 + 2;
            jArr3[i5] = jArr3[i5] ^ ((j5 << i3) | (j6 >>> (-i3)));
            int i6 = i2 + 3;
            jArr3[i6] = jArr3[i6] ^ (j5 >>> (-i3));
        }
        cp.b(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new cq(jArr);
    }
}
