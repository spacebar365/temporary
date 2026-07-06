package org.bouncycastle.a.s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.au;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.x;

/* JADX INFO: loaded from: classes.dex */
public final class p extends org.bouncycastle.a.o {
    private org.bouncycastle.a.m a;
    private org.bouncycastle.a.z.a b;
    private org.bouncycastle.a.q c;
    private x d;
    private org.bouncycastle.a.c e;

    public p(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.f fVar) {
        this(aVar, fVar, null, null);
    }

    public p(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.f fVar, x xVar) {
        this(aVar, fVar, xVar, null);
    }

    public p(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.f fVar, x xVar, byte[] bArr) {
        this.a = new org.bouncycastle.a.m(bArr != null ? org.bouncycastle.f.b.b : org.bouncycastle.f.b.a);
        this.b = aVar;
        this.c = new be(fVar);
        this.d = xVar;
        this.e = bArr == null ? null : new au(bArr);
    }

    public static p a(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj != null) {
            return new p(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final x a() {
        return this.d;
    }

    public final org.bouncycastle.a.z.a b() {
        return this.b;
    }

    public final org.bouncycastle.a.f c() {
        return org.bouncycastle.a.u.b(this.c.c());
    }

    public final boolean d() {
        return this.e != null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        gVar.a(this.c);
        if (this.d != null) {
            gVar.a(new bn(false, 0, this.d));
        }
        if (this.e != null) {
            gVar.a(new bn(false, 1, this.e));
        }
        return new bi(gVar);
    }

    private p(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        this.a = org.bouncycastle.a.m.a(enumerationC.nextElement());
        BigInteger bigIntegerB = this.a.b();
        if (bigIntegerB.compareTo(org.bouncycastle.f.b.a) < 0 || bigIntegerB.compareTo(org.bouncycastle.f.b.b) > 0) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        int iIntValue = bigIntegerB.intValue();
        this.b = org.bouncycastle.a.z.a.a(enumerationC.nextElement());
        this.c = org.bouncycastle.a.q.a(enumerationC.nextElement());
        int i = -1;
        while (enumerationC.hasMoreElements()) {
            ab abVar = (ab) enumerationC.nextElement();
            int iB = abVar.b();
            if (iB <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            switch (iB) {
                case 0:
                    this.d = x.a(abVar);
                    i = iB;
                    break;
                case 1:
                    if (iIntValue <= 0) {
                        throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                    }
                    this.e = au.a(abVar, false);
                    i = iB;
                    break;
                default:
                    throw new IllegalArgumentException("unknown optional field in private key info");
            }
        }
    }
}
