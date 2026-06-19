package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.b.k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1107j extends C1103f {

    /* JADX INFO: renamed from: b */
    private BigInteger f4471b;

    public C1107j(BigInteger bigInteger, C1106i c1106i) {
        super(true, c1106i);
        this.f4471b = bigInteger;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2671c() {
        return this.f4471b;
    }

    @Override // org.bouncycastle.p083b.p097k.C1103f
    public final int hashCode() {
        return this.f4471b.hashCode() ^ super.hashCode();
    }

    @Override // org.bouncycastle.p083b.p097k.C1103f
    public final boolean equals(Object obj) {
        if (obj instanceof C1107j) {
            return ((C1107j) obj).f4471b.equals(this.f4471b) && super.equals(obj);
        }
        return false;
    }
}
