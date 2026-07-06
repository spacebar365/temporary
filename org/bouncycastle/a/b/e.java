package org.bouncycastle.a.b;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.a.az;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bo;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {
    private final BigInteger a;
    private final String b;
    private final org.bouncycastle.a.k c;
    private final org.bouncycastle.a.k d;
    private final q e;
    private final String f;

    public e(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr) {
        this.a = bigInteger;
        this.b = str;
        this.c = new az(date);
        this.d = new az(date2);
        this.e = new be(org.bouncycastle.f.a.b(bArr));
        this.f = null;
    }

    private e(v vVar) {
        this.a = m.a(vVar.a(0)).b();
        this.b = bo.a(vVar.a(1)).b();
        this.c = org.bouncycastle.a.k.a(vVar.a(2));
        this.d = org.bouncycastle.a.k.a(vVar.a(3));
        this.e = q.a(vVar.a(4));
        this.f = vVar.d() == 6 ? bo.a(vVar.a(5)).b() : null;
    }

    public static e a(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.k a() {
        return this.c;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.e.c());
    }

    public final String c() {
        return this.b;
    }

    public final org.bouncycastle.a.k d() {
        return this.d;
    }

    public final BigInteger e() {
        return this.a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new m(this.a));
        gVar.a(new bo(this.b));
        gVar.a(this.c);
        gVar.a(this.d);
        gVar.a(this.e);
        if (this.f != null) {
            gVar.a(new bo(this.f));
        }
        return new bi(gVar);
    }
}
