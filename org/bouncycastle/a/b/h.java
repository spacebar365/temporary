package org.bouncycastle.a.b;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.a.az;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bo;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o {
    private final BigInteger a;
    private final org.bouncycastle.a.z.a b;
    private final org.bouncycastle.a.k c;
    private final org.bouncycastle.a.k d;
    private final f e;
    private final String f;

    private h(v vVar) {
        this.a = m.a(vVar.a(0)).b();
        this.b = org.bouncycastle.a.z.a.a(vVar.a(1));
        this.c = org.bouncycastle.a.k.a(vVar.a(2));
        this.d = org.bouncycastle.a.k.a(vVar.a(3));
        this.e = f.a(vVar.a(4));
        this.f = vVar.d() == 6 ? bo.a(vVar.a(5)).b() : null;
    }

    public h(org.bouncycastle.a.z.a aVar, Date date, Date date2, f fVar) {
        this.a = BigInteger.valueOf(1L);
        this.b = aVar;
        this.c = new az(date);
        this.d = new az(date2);
        this.e = fVar;
        this.f = null;
    }

    public static h a(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.k a() {
        return this.c;
    }

    public final org.bouncycastle.a.z.a b() {
        return this.b;
    }

    public final org.bouncycastle.a.k c() {
        return this.d;
    }

    public final f d() {
        return this.e;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new m(this.a));
        gVar.a(this.b);
        gVar.a(this.c);
        gVar.a(this.d);
        gVar.a(this.e);
        if (this.f != null) {
            gVar.a(new bo(this.f));
        }
        return new bi(gVar);
    }
}
