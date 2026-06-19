package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1063ao extends C1061am {

    /* JADX INFO: renamed from: b */
    private BigInteger f4391b;

    public C1063ao(BigInteger bigInteger, C1062an c1062an) {
        super(true, c1062an);
        this.f4391b = bigInteger;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2582c() {
        return this.f4391b;
    }

    @Override // org.bouncycastle.p083b.p097k.C1061am
    public final boolean equals(Object obj) {
        if ((obj instanceof C1063ao) && ((C1063ao) obj).f4391b.equals(this.f4391b)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // org.bouncycastle.p083b.p097k.C1061am
    public final int hashCode() {
        return this.f4391b.hashCode();
    }
}
