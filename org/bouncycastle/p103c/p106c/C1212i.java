package org.bouncycastle.p103c.p106c;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: org.bouncycastle.c.c.i */
/* JADX INFO: loaded from: classes.dex */
public class C1212i implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private BigInteger f4716a;

    /* JADX INFO: renamed from: b */
    private BigInteger f4717b;

    public C1212i(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f4716a = bigInteger;
        this.f4717b = bigInteger2;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m2877a() {
        return this.f4716a;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2878b() {
        return this.f4717b;
    }
}
