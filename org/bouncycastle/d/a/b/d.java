package org.bouncycastle.d.a.b;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    protected final BigInteger a;
    protected final BigInteger b;
    protected final BigInteger c;
    protected final BigInteger d;
    protected final BigInteger e;
    protected final BigInteger f;
    protected final BigInteger g;
    protected final BigInteger h;
    protected final int i;

    public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigIntegerArr[0];
        this.d = bigIntegerArr[1];
        this.e = bigIntegerArr2[0];
        this.f = bigIntegerArr2[1];
        this.g = bigInteger3;
        this.h = bigInteger4;
        this.i = i;
    }

    private static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.c;
    }

    public final BigInteger c() {
        return this.d;
    }

    public final BigInteger d() {
        return this.e;
    }

    public final BigInteger e() {
        return this.f;
    }

    public final BigInteger f() {
        return this.g;
    }

    public final BigInteger g() {
        return this.h;
    }

    public final int h() {
        return this.i;
    }
}
