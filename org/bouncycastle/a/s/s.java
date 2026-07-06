package org.bouncycastle.a.s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class s extends org.bouncycastle.a.o {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private org.bouncycastle.a.v j;

    public s(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.j = null;
        this.a = BigInteger.valueOf(0L);
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.f = bigInteger5;
        this.g = bigInteger6;
        this.h = bigInteger7;
        this.i = bigInteger8;
    }

    private s(org.bouncycastle.a.v vVar) {
        this.j = null;
        Enumeration enumerationC = vVar.c();
        BigInteger bigIntegerB = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        if (bigIntegerB.intValue() != 0 && bigIntegerB.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.a = bigIntegerB;
        this.b = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.c = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.d = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.e = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.f = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.g = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.h = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        this.i = ((org.bouncycastle.a.m) enumerationC.nextElement()).b();
        if (enumerationC.hasMoreElements()) {
            this.j = (org.bouncycastle.a.v) enumerationC.nextElement();
        }
    }

    public static s a(Object obj) {
        if (obj instanceof s) {
            return (s) obj;
        }
        if (obj != null) {
            return new s(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final BigInteger a() {
        return this.b;
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

    public final BigInteger h() {
        return this.i;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(this.a));
        gVar.a(new org.bouncycastle.a.m(this.b));
        gVar.a(new org.bouncycastle.a.m(this.c));
        gVar.a(new org.bouncycastle.a.m(this.d));
        gVar.a(new org.bouncycastle.a.m(this.e));
        gVar.a(new org.bouncycastle.a.m(this.f));
        gVar.a(new org.bouncycastle.a.m(this.g));
        gVar.a(new org.bouncycastle.a.m(this.h));
        gVar.a(new org.bouncycastle.a.m(this.i));
        if (this.j != null) {
            gVar.a(this.j);
        }
        return new bi(gVar);
    }
}
