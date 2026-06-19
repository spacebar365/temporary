package org.bouncycastle.p107d.p108a.p113b;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1375d {

    /* JADX INFO: renamed from: a */
    protected final BigInteger f4985a;

    /* JADX INFO: renamed from: b */
    protected final BigInteger f4986b;

    /* JADX INFO: renamed from: c */
    protected final BigInteger f4987c;

    /* JADX INFO: renamed from: d */
    protected final BigInteger f4988d;

    /* JADX INFO: renamed from: e */
    protected final BigInteger f4989e;

    /* JADX INFO: renamed from: f */
    protected final BigInteger f4990f;

    /* JADX INFO: renamed from: g */
    protected final BigInteger f4991g;

    /* JADX INFO: renamed from: h */
    protected final BigInteger f4992h;

    /* JADX INFO: renamed from: i */
    protected final int f4993i;

    public C1375d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        m3284a(bigIntegerArr, "v1");
        m3284a(bigIntegerArr2, "v2");
        this.f4985a = bigInteger;
        this.f4986b = bigInteger2;
        this.f4987c = bigIntegerArr[0];
        this.f4988d = bigIntegerArr[1];
        this.f4989e = bigIntegerArr2[0];
        this.f4990f = bigIntegerArr2[1];
        this.f4991g = bigInteger3;
        this.f4992h = bigInteger4;
        this.f4993i = i;
    }

    /* JADX INFO: renamed from: a */
    private static void m3284a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m3285a() {
        return this.f4985a;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m3286b() {
        return this.f4987c;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m3287c() {
        return this.f4988d;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m3288d() {
        return this.f4989e;
    }

    /* JADX INFO: renamed from: e */
    public final BigInteger m3289e() {
        return this.f4990f;
    }

    /* JADX INFO: renamed from: f */
    public final BigInteger m3290f() {
        return this.f4991g;
    }

    /* JADX INFO: renamed from: g */
    public final BigInteger m3291g() {
        return this.f4992h;
    }

    /* JADX INFO: renamed from: h */
    public final int m3292h() {
        return this.f4993i;
    }
}
