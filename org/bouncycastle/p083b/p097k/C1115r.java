package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.r */
/* JADX INFO: loaded from: classes.dex */
public class C1115r implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private BigInteger f4489a;

    /* JADX INFO: renamed from: b */
    private BigInteger f4490b;

    /* JADX INFO: renamed from: c */
    private BigInteger f4491c;

    /* JADX INFO: renamed from: d */
    private C1118u f4492d;

    public C1115r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f4489a = bigInteger3;
        this.f4491c = bigInteger;
        this.f4490b = bigInteger2;
    }

    public C1115r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C1118u c1118u) {
        this.f4489a = bigInteger3;
        this.f4491c = bigInteger;
        this.f4490b = bigInteger2;
        this.f4492d = c1118u;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2686a() {
        return this.f4491c;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2687b() {
        return this.f4490b;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2688c() {
        return this.f4489a;
    }

    /* JADX INFO: renamed from: d */
    public final C1118u m2689d() {
        return this.f4492d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1115r)) {
            return false;
        }
        C1115r c1115r = (C1115r) obj;
        return c1115r.f4491c.equals(this.f4491c) && c1115r.f4490b.equals(this.f4490b) && c1115r.f4489a.equals(this.f4489a);
    }

    public int hashCode() {
        return (this.f4491c.hashCode() ^ this.f4490b.hashCode()) ^ this.f4489a.hashCode();
    }
}
