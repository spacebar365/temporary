package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C1064ap extends C1061am {

    /* JADX INFO: renamed from: b */
    private BigInteger f4392b;

    public C1064ap(BigInteger bigInteger, C1062an c1062an) {
        super(false, c1062an);
        this.f4392b = bigInteger;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2583c() {
        return this.f4392b;
    }

    @Override // org.bouncycastle.p083b.p097k.C1061am
    public final int hashCode() {
        return this.f4392b.hashCode() ^ super.hashCode();
    }

    @Override // org.bouncycastle.p083b.p097k.C1061am
    public final boolean equals(Object obj) {
        if (obj instanceof C1064ap) {
            return ((C1064ap) obj).f4392b.equals(this.f4392b) && super.equals(obj);
        }
        return false;
    }
}
