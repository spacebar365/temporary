package org.bouncycastle.a.r;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    m a;
    m b;

    public a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = new m(bigInteger);
        this.b = new m(bigInteger2);
    }

    private a(v vVar) {
        Enumeration enumerationC = vVar.c();
        this.a = (m) enumerationC.nextElement();
        this.b = (m) enumerationC.nextElement();
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(v.a(obj));
        }
        return null;
    }

    public final BigInteger a() {
        return this.a.c();
    }

    public final BigInteger b() {
        return this.b.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
