package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.i */
/* JADX INFO: loaded from: classes.dex */
public class C1106i implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private BigInteger f4464a;

    /* JADX INFO: renamed from: b */
    private BigInteger f4465b;

    /* JADX INFO: renamed from: c */
    private BigInteger f4466c;

    /* JADX INFO: renamed from: d */
    private BigInteger f4467d;

    /* JADX INFO: renamed from: e */
    private int f4468e;

    /* JADX INFO: renamed from: f */
    private int f4469f;

    /* JADX INFO: renamed from: g */
    private C1111n f4470g;

    public C1106i(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public C1106i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, C1111n c1111n) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength()) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f4464a = bigInteger2;
        this.f4465b = bigInteger;
        this.f4466c = bigInteger3;
        this.f4468e = i;
        this.f4469f = i2;
        this.f4467d = bigInteger4;
        this.f4470g = c1111n;
    }

    public C1106i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C1111n c1111n) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, c1111n);
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2664a() {
        return this.f4465b;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2665b() {
        return this.f4464a;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2666c() {
        return this.f4466c;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m2667d() {
        return this.f4467d;
    }

    /* JADX INFO: renamed from: e */
    public final int m2668e() {
        return this.f4468e;
    }

    /* JADX INFO: renamed from: f */
    public final int m2669f() {
        return this.f4469f;
    }

    /* JADX INFO: renamed from: g */
    public final C1111n m2670g() {
        return this.f4470g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1106i(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        int i2 = 160;
        if (i != 0 && i < 160) {
            i2 = i;
        }
        this(bigInteger, bigInteger2, null, i2, i, null, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1106i)) {
            return false;
        }
        C1106i c1106i = (C1106i) obj;
        if (this.f4466c != null) {
            if (!this.f4466c.equals(c1106i.f4466c)) {
                return false;
            }
        } else if (c1106i.f4466c != null) {
            return false;
        }
        return c1106i.f4465b.equals(this.f4465b) && c1106i.f4464a.equals(this.f4464a);
    }

    public int hashCode() {
        return (this.f4466c != null ? this.f4466c.hashCode() : 0) ^ (this.f4464a.hashCode() ^ this.f4465b.hashCode());
    }
}
