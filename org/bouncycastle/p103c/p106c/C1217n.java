package org.bouncycastle.p103c.p106c;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.c.c.n */
/* JADX INFO: loaded from: classes.dex */
public class C1217n {

    /* JADX INFO: renamed from: a */
    private BigInteger f4728a;

    /* JADX INFO: renamed from: b */
    private BigInteger f4729b;

    /* JADX INFO: renamed from: c */
    private BigInteger f4730c;

    public C1217n(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f4728a = bigInteger;
        this.f4729b = bigInteger2;
        this.f4730c = bigInteger3;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2886a() {
        return this.f4728a;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2887b() {
        return this.f4729b;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2888c() {
        return this.f4730c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1217n)) {
            return false;
        }
        C1217n c1217n = (C1217n) obj;
        return this.f4730c.equals(c1217n.f4730c) && this.f4728a.equals(c1217n.f4728a) && this.f4729b.equals(c1217n.f4729b);
    }

    public int hashCode() {
        return (this.f4730c.hashCode() ^ this.f4728a.hashCode()) ^ this.f4729b.hashCode();
    }
}
