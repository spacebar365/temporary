package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.an */
/* JADX INFO: loaded from: classes.dex */
public final class C1062an implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private BigInteger f4388a;

    /* JADX INFO: renamed from: b */
    private BigInteger f4389b;

    /* JADX INFO: renamed from: c */
    private int f4390c;

    public C1062an(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public C1062an(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f4388a = bigInteger2;
        this.f4389b = bigInteger;
        this.f4390c = i;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2579a() {
        return this.f4389b;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2580b() {
        return this.f4388a;
    }

    /* JADX INFO: renamed from: c */
    public final int m2581c() {
        return this.f4390c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1062an)) {
            return false;
        }
        C1062an c1062an = (C1062an) obj;
        return c1062an.f4389b.equals(this.f4389b) && c1062an.f4388a.equals(this.f4388a) && c1062an.f4390c == this.f4390c;
    }

    public final int hashCode() {
        return (this.f4389b.hashCode() ^ this.f4388a.hashCode()) + this.f4390c;
    }
}
