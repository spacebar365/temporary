package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class bh extends g$a {
    protected long[] a;

    public bh(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.a = bg.a(bigInteger);
    }

    protected bh(long[] jArr) {
        this.a = jArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return 113;
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
        return 113009 ^ org.bouncycastle.f.a.a(this.a, 2);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.d.a(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.a[0] & 1) != 0;
    }

    public bh() {
        this.a = new long[2];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        long[] jArr = this.a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[1] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        long[] jArr = this.a;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                org.bouncycastle.f.g.a(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = this.a;
        long[] jArr2 = ((bh) gVar).a;
        return new bh(new long[]{jArr[0] ^ jArr2[0], jArr2[1] ^ jArr[1]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = this.a;
        return new bh(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[2];
        bg.a(this.a, ((bh) gVar).a, jArr);
        return new bh(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((bh) gVar).a;
        long[] jArr3 = ((bh) gVar2).a;
        long[] jArr4 = ((bh) gVar3).a;
        long[] jArr5 = new long[4];
        bg.b(jArr, jArr2, jArr5);
        bg.b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[2];
        bg.b(jArr5, jArr6);
        return new bh(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[2];
        bg.c(this.a, jArr);
        return new bh(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((bh) gVar).a;
        long[] jArr3 = ((bh) gVar2).a;
        long[] jArr4 = new long[4];
        bg.d(jArr, jArr4);
        bg.b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[2];
        bg.b(jArr4, jArr5);
        return new bh(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[2];
        bg.a(this.a, i, jArr);
        return new bh(jArr);
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        return ((int) this.a[0]) & 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[2];
        bg.a(this.a, jArr);
        return new bh(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = this.a;
        long jA = org.bouncycastle.d.c.a.a(jArr[0]);
        long jA2 = org.bouncycastle.d.c.a.a(jArr[1]);
        long j = (4294967295L & jA) | (jA2 << 32);
        long j2 = (jA >>> 32) | (jA2 & (-4294967296L));
        return new bh(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = ((bh) obj).a;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
