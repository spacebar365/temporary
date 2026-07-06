package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.g$a;

/* JADX INFO: loaded from: classes.dex */
public final class dl extends g$a {
    protected long[] a;

    public dl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.a = dk.a(bigInteger);
    }

    protected dl(long[] jArr) {
        this.a = jArr;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return 409;
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
        return 4090087 ^ org.bouncycastle.f.a.a(this.a, 7);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.k.a(this.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.a[0] & 1) != 0;
    }

    public dl() {
        this.a = new long[7];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        long[] jArr = this.a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        long[] jArr = this.a;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                org.bouncycastle.f.g.a(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        long[] jArr = this.a;
        long[] jArr2 = ((dl) gVar).a;
        return new dl(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        long[] jArr = this.a;
        return new dl(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        long[] jArr = new long[7];
        dk.a(this.a, ((dl) gVar).a, jArr);
        return new dl(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g gVar3) {
        long[] jArr = this.a;
        long[] jArr2 = ((dl) gVar).a;
        long[] jArr3 = ((dl) gVar2).a;
        long[] jArr4 = ((dl) gVar3).a;
        long[] jArr5 = new long[13];
        dk.b(jArr, jArr2, jArr5);
        dk.b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        dk.b(jArr5, jArr6);
        return new dl(jArr6);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        long[] jArr = new long[7];
        dk.c(this.a, jArr);
        return new dl(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2) {
        long[] jArr = this.a;
        long[] jArr2 = ((dl) gVar).a;
        long[] jArr3 = ((dl) gVar2).a;
        long[] jArr4 = new long[13];
        dk.d(jArr, jArr4);
        dk.b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[7];
        dk.b(jArr4, jArr5);
        return new dl(jArr5);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[7];
        dk.a(this.a, i, jArr);
        return new dl(jArr);
    }

    @Override // org.bouncycastle.d.a.g$a
    public final int m() {
        return ((int) this.a[0]) & 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        long[] jArr = new long[7];
        dk.a(this.a, jArr);
        return new dl(jArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        long[] jArr = this.a;
        long jA = org.bouncycastle.d.c.a.a(jArr[0]);
        long jA2 = org.bouncycastle.d.c.a.a(jArr[1]);
        long j = (4294967295L & jA) | (jA2 << 32);
        long j2 = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = org.bouncycastle.d.c.a.a(jArr[2]);
        long jA4 = org.bouncycastle.d.c.a.a(jArr[3]);
        long j3 = (4294967295L & jA3) | (jA4 << 32);
        long j4 = (jA3 >>> 32) | (jA4 & (-4294967296L));
        long jA5 = org.bouncycastle.d.c.a.a(jArr[4]);
        long jA6 = org.bouncycastle.d.c.a.a(jArr[5]);
        long j5 = (4294967295L & jA5) | (jA6 << 32);
        long j6 = (jA5 >>> 32) | (jA6 & (-4294967296L));
        long jA7 = org.bouncycastle.d.c.a.a(jArr[6]);
        long j7 = 4294967295L & jA7;
        long j8 = jA7 >>> 32;
        return new dl(new long[]{j ^ (j2 << 44), ((j4 << 44) ^ j3) ^ (j2 >>> 20), ((j6 << 44) ^ j5) ^ (j4 >>> 20), (((j8 << 44) ^ j7) ^ (j6 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j8 >>> 20) ^ (j4 << 13)), (j6 << 13) ^ (j4 >>> 51), (j8 << 13) ^ (j6 >>> 51)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = ((dl) obj).a;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
