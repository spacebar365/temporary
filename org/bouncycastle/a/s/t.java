package org.bouncycastle.a.s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class t extends org.bouncycastle.a.o {
    private BigInteger a;
    private BigInteger b;

    public t(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    private t(org.bouncycastle.a.v vVar) {
        if (vVar.d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        Enumeration enumerationC = vVar.c();
        this.a = org.bouncycastle.a.m.a(enumerationC.nextElement()).c();
        this.b = org.bouncycastle.a.m.a(enumerationC.nextElement()).c();
    }

    public static t a(Object obj) {
        if (obj != null) {
            return new t(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(this.a));
        gVar.a(new org.bouncycastle.a.m(this.b));
        return new bi(gVar);
    }
}
