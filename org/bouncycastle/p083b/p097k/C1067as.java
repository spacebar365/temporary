package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.as */
/* JADX INFO: loaded from: classes.dex */
public final class C1067as implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private BigInteger f4395a;

    /* JADX INFO: renamed from: b */
    private BigInteger f4396b;

    /* JADX INFO: renamed from: c */
    private BigInteger f4397c;

    public C1067as(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f4395a = bigInteger;
        this.f4396b = bigInteger2;
        this.f4397c = bigInteger3;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2586a() {
        return this.f4395a;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2587b() {
        return this.f4396b;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2588c() {
        return this.f4397c;
    }

    public final int hashCode() {
        return (this.f4395a.hashCode() ^ this.f4396b.hashCode()) ^ this.f4397c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1067as)) {
            return false;
        }
        C1067as c1067as = (C1067as) obj;
        return c1067as.f4395a.equals(this.f4395a) && c1067as.f4396b.equals(this.f4396b) && c1067as.f4397c.equals(this.f4397c);
    }
}
