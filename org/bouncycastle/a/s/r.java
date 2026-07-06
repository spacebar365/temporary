package org.bouncycastle.a.s;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class r extends org.bouncycastle.a.o {
    public static final org.bouncycastle.a.z.a a = new org.bouncycastle.a.z.a(org.bouncycastle.a.r.b.i, bc.a);
    public static final org.bouncycastle.a.z.a b = new org.bouncycastle.a.z.a(n.j_, a);
    public static final org.bouncycastle.a.z.a c = new org.bouncycastle.a.z.a(n.k_, new be(new byte[0]));
    private org.bouncycastle.a.z.a d;
    private org.bouncycastle.a.z.a e;
    private org.bouncycastle.a.z.a f;

    public r() {
        this.d = a;
        this.e = b;
        this.f = c;
    }

    private r(org.bouncycastle.a.v vVar) {
        this.d = a;
        this.e = b;
        this.f = c;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == vVar.d()) {
                return;
            }
            ab abVar = (ab) vVar.a(i2);
            switch (abVar.b()) {
                case 0:
                    this.d = org.bouncycastle.a.z.a.a(abVar);
                    break;
                case 1:
                    this.e = org.bouncycastle.a.z.a.a(abVar);
                    break;
                case 2:
                    this.f = org.bouncycastle.a.z.a.a(abVar);
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag");
            }
            i = i2 + 1;
        }
    }

    public r(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.z.a aVar2, org.bouncycastle.a.z.a aVar3) {
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
    }

    public static r a(Object obj) {
        if (obj != null) {
            return new r(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.z.a a() {
        return this.d;
    }

    public final org.bouncycastle.a.z.a b() {
        return this.e;
    }

    public final org.bouncycastle.a.z.a c() {
        return this.f;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (!this.d.equals(a)) {
            gVar.a(new bn(true, 0, this.d));
        }
        if (!this.e.equals(b)) {
            gVar.a(new bn(true, 1, this.e));
        }
        if (!this.f.equals(c)) {
            gVar.a(new bn(true, 2, this.f));
        }
        return new bi(gVar);
    }
}
