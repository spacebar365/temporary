package org.bouncycastle.a.aa;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class a extends org.bouncycastle.a.o {
    private final org.bouncycastle.a.m a;
    private final org.bouncycastle.a.m b;
    private final org.bouncycastle.a.m c;
    private final org.bouncycastle.a.m d;
    private final c e;

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, c cVar) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.a = new org.bouncycastle.a.m(bigInteger);
        this.b = new org.bouncycastle.a.m(bigInteger2);
        this.c = new org.bouncycastle.a.m(bigInteger3);
        if (bigInteger4 != null) {
            this.d = new org.bouncycastle.a.m(bigInteger4);
        } else {
            this.d = null;
        }
        this.e = cVar;
    }

    private a(org.bouncycastle.a.v vVar) {
        if (vVar.d() < 3 || vVar.d() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        Enumeration enumerationC = vVar.c();
        this.a = org.bouncycastle.a.m.a(enumerationC.nextElement());
        this.b = org.bouncycastle.a.m.a(enumerationC.nextElement());
        this.c = org.bouncycastle.a.m.a(enumerationC.nextElement());
        org.bouncycastle.a.f fVarA = a(enumerationC);
        if (fVarA == null || !(fVarA instanceof org.bouncycastle.a.m)) {
            this.d = null;
        } else {
            this.d = org.bouncycastle.a.m.a(fVarA);
            fVarA = a(enumerationC);
        }
        if (fVarA != null) {
            this.e = c.a(fVarA.i());
        } else {
            this.e = null;
        }
    }

    public static a a(Object obj) {
        if (obj != null) {
            return new a(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    private static org.bouncycastle.a.f a(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (org.bouncycastle.a.f) enumeration.nextElement();
        }
        return null;
    }

    public final BigInteger a() {
        return this.a.c();
    }

    public final BigInteger b() {
        return this.b.c();
    }

    public final BigInteger c() {
        return this.c.c();
    }

    public final BigInteger d() {
        if (this.d == null) {
            return null;
        }
        return this.d.c();
    }

    public final c e() {
        return this.e;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        gVar.a(this.c);
        if (this.d != null) {
            gVar.a(this.d);
        }
        if (this.e != null) {
            gVar.a(this.e);
        }
        return new bi(gVar);
    }
}
