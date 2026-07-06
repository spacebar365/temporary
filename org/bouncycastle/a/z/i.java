package org.bouncycastle.a.z;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class i extends org.bouncycastle.a.o {
    org.bouncycastle.a.m a;
    org.bouncycastle.a.m b;
    org.bouncycastle.a.m c;

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = new org.bouncycastle.a.m(bigInteger);
        this.b = new org.bouncycastle.a.m(bigInteger2);
        this.c = new org.bouncycastle.a.m(bigInteger3);
    }

    private i(org.bouncycastle.a.v vVar) {
        if (vVar.d() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        Enumeration enumerationC = vVar.c();
        this.a = org.bouncycastle.a.m.a(enumerationC.nextElement());
        this.b = org.bouncycastle.a.m.a(enumerationC.nextElement());
        this.c = org.bouncycastle.a.m.a(enumerationC.nextElement());
    }

    public static i a(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(org.bouncycastle.a.v.a(obj));
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

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        gVar.a(this.c);
        return new bi(gVar);
    }
}
