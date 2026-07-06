package org.bouncycastle.a.w;

import java.math.BigInteger;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.g;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {
    BigInteger a;
    a b;
    m c;
    q d;
    m e;
    q f;

    private b(v vVar) {
        int i = 0;
        this.a = BigInteger.valueOf(0L);
        if (vVar.a(0) instanceof ab) {
            ab abVar = (ab) vVar.a(0);
            if (!abVar.c() || abVar.b() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.a = m.a((Object) abVar.d()).b();
            i = 1;
        }
        this.b = a.a(vVar.a(i));
        int i2 = i + 1;
        this.c = m.a(vVar.a(i2));
        int i3 = i2 + 1;
        this.d = q.a(vVar.a(i3));
        int i4 = i3 + 1;
        this.e = m.a(vVar.a(i4));
        this.f = q.a(vVar.a(i4 + 1));
    }

    public static b a(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(v.a(obj));
        }
        return null;
    }

    public final a a() {
        return this.b;
    }

    public final BigInteger b() {
        return this.c.b();
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.d.c());
    }

    public final BigInteger d() {
        return this.e.b();
    }

    public final byte[] e() {
        return org.bouncycastle.f.a.b(this.f.c());
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        if (this.a.compareTo(BigInteger.valueOf(0L)) != 0) {
            gVar.a(new bn(true, 0, new m(this.a)));
        }
        gVar.a(this.b);
        gVar.a(this.c);
        gVar.a(this.d);
        gVar.a(this.e);
        gVar.a(this.f);
        return new bi(gVar);
    }
}
