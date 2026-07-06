package org.bouncycastle.a.s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class d extends org.bouncycastle.a.o {
    org.bouncycastle.a.m a;
    org.bouncycastle.a.m b;
    org.bouncycastle.a.m c;

    public d(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.a = new org.bouncycastle.a.m(bigInteger);
        this.b = new org.bouncycastle.a.m(bigInteger2);
        if (i != 0) {
            this.c = new org.bouncycastle.a.m(i);
        } else {
            this.c = null;
        }
    }

    private d(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        this.a = org.bouncycastle.a.m.a(enumerationC.nextElement());
        this.b = org.bouncycastle.a.m.a(enumerationC.nextElement());
        if (enumerationC.hasMoreElements()) {
            this.c = (org.bouncycastle.a.m) enumerationC.nextElement();
        } else {
            this.c = null;
        }
    }

    public static d a(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(org.bouncycastle.a.v.a(obj));
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
        if (this.c == null) {
            return null;
        }
        return this.c.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        if (c() != null) {
            gVar.a(this.c);
        }
        return new bi(gVar);
    }
}
