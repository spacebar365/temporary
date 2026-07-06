package org.bouncycastle.a.f;

import java.math.BigInteger;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {
    int a = 1024;
    m b;
    m c;
    m d;

    public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.b = new m(bigInteger);
        this.c = new m(bigInteger2);
        this.d = new m(bigInteger3);
    }

    public final BigInteger a() {
        return this.b.c();
    }

    public final BigInteger b() {
        return this.c.c();
    }

    public final BigInteger c() {
        return this.d.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(new m(this.a));
        gVar.a(this.b);
        gVar.a(this.c);
        gVar.a(this.d);
        return new bi(gVar);
    }
}
