package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class y implements org.bouncycastle.d.a.c {
    private org.bouncycastle.d.a.d a;
    private byte[] b;
    private org.bouncycastle.d.a.j i;
    private BigInteger j;
    private BigInteger k;
    private BigInteger l;

    public y(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(dVar, jVar, bigInteger, bigInteger2, null);
    }

    public y(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.l = null;
        if (dVar == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.a = dVar;
        this.i = a(dVar, jVar);
        this.j = bigInteger;
        this.k = bigInteger2;
        this.b = org.bouncycastle.f.a.b(bArr);
    }

    static org.bouncycastle.d.a.j a(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Point has null value");
        }
        org.bouncycastle.d.a.j jVarO = org.bouncycastle.d.a.b.a(dVar, jVar).o();
        if (jVarO.p()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (jVarO.q()) {
            return jVarO;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public final org.bouncycastle.d.a.d a() {
        return this.a;
    }

    public final org.bouncycastle.d.a.j b() {
        return this.i;
    }

    public final BigInteger c() {
        return this.j;
    }

    public final BigInteger d() {
        return this.k;
    }

    public final synchronized BigInteger e() {
        if (this.l == null) {
            this.l = this.k.modInverse(this.j);
        }
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.a(yVar.a) && this.i.a(yVar.i) && this.j.equals(yVar.j) && this.k.equals(yVar.k);
    }

    public final byte[] f() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 37) ^ this.i.hashCode()) * 37) ^ this.j.hashCode()) * 37) ^ this.k.hashCode();
    }
}
