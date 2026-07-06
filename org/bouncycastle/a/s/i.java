package org.bouncycastle.a.s;

import java.math.BigInteger;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class i extends org.bouncycastle.a.o {
    private static final BigInteger d = BigInteger.valueOf(1);
    org.bouncycastle.a.z.j a;
    byte[] b;
    BigInteger c;

    public i(org.bouncycastle.a.z.j jVar, byte[] bArr, int i) {
        this.a = jVar;
        this.b = org.bouncycastle.f.a.b(bArr);
        this.c = BigInteger.valueOf(i);
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

    public final org.bouncycastle.a.z.j a() {
        return this.a;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final BigInteger c() {
        return this.c;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(new be(this.b));
        if (!this.c.equals(d)) {
            gVar.a(new org.bouncycastle.a.m(this.c));
        }
        return new bi(gVar);
    }

    private i(org.bouncycastle.a.v vVar) {
        org.bouncycastle.a.f fVarA = vVar.a(0);
        this.a = fVarA instanceof org.bouncycastle.a.z.j ? (org.bouncycastle.a.z.j) fVarA : fVarA != null ? new org.bouncycastle.a.z.j(org.bouncycastle.a.v.a(fVarA)) : null;
        this.b = org.bouncycastle.f.a.b(org.bouncycastle.a.q.a(vVar.a(1)).c());
        if (vVar.d() == 3) {
            this.c = org.bouncycastle.a.m.a(vVar.a(2)).b();
        } else {
            this.c = d;
        }
    }
}
