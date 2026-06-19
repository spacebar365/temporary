package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.p097k.C1106i;

/* JADX INFO: renamed from: org.bouncycastle.b.f.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0960g {

    /* JADX INFO: renamed from: d */
    private static final BigInteger f4003d = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a */
    private int f4004a;

    /* JADX INFO: renamed from: b */
    private int f4005b;

    /* JADX INFO: renamed from: c */
    private SecureRandom f4006c;

    /* JADX INFO: renamed from: a */
    public final C1106i m2419a() {
        BigInteger[] bigIntegerArrM2422a = C0961h.m2422a(this.f4004a, this.f4005b, this.f4006c);
        BigInteger bigInteger = bigIntegerArrM2422a[0];
        return new C1106i(bigInteger, C0961h.m2421a(bigInteger, this.f4006c), bigIntegerArrM2422a[1], f4003d, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2420a(int i, int i2, SecureRandom secureRandom) {
        this.f4004a = i;
        this.f4005b = i2;
        this.f4006c = secureRandom;
    }
}
