package org.bouncycastle.a.s;

import java.math.BigInteger;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class u extends org.bouncycastle.a.o {
    public static final org.bouncycastle.a.z.a a = new org.bouncycastle.a.z.a(org.bouncycastle.a.r.b.i, bc.a);
    public static final org.bouncycastle.a.z.a b = new org.bouncycastle.a.z.a(n.j_, a);
    public static final org.bouncycastle.a.m c = new org.bouncycastle.a.m(20);
    public static final org.bouncycastle.a.m d = new org.bouncycastle.a.m(1);
    private org.bouncycastle.a.z.a e;
    private org.bouncycastle.a.z.a f;
    private org.bouncycastle.a.m g;
    private org.bouncycastle.a.m h;

    public u() {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
    }

    private u(org.bouncycastle.a.v vVar) {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == vVar.d()) {
                return;
            }
            ab abVar = (ab) vVar.a(i2);
            switch (abVar.b()) {
                case 0:
                    this.e = org.bouncycastle.a.z.a.a(abVar);
                    break;
                case 1:
                    this.f = org.bouncycastle.a.z.a.a(abVar);
                    break;
                case 2:
                    this.g = org.bouncycastle.a.m.a(abVar, true);
                    break;
                case 3:
                    this.h = org.bouncycastle.a.m.a(abVar, true);
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag");
            }
            i = i2 + 1;
        }
    }

    public u(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.z.a aVar2, org.bouncycastle.a.m mVar, org.bouncycastle.a.m mVar2) {
        this.e = aVar;
        this.f = aVar2;
        this.g = mVar;
        this.h = mVar2;
    }

    public static u a(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj != null) {
            return new u(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.z.a a() {
        return this.e;
    }

    public final org.bouncycastle.a.z.a b() {
        return this.f;
    }

    public final BigInteger c() {
        return this.g.b();
    }

    public final BigInteger d() {
        return this.h.b();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (!this.e.equals(a)) {
            gVar.a(new bn(true, 0, this.e));
        }
        if (!this.f.equals(b)) {
            gVar.a(new bn(true, 1, this.f));
        }
        if (!this.g.equals(c)) {
            gVar.a(new bn(true, 2, this.g));
        }
        if (!this.h.equals(d)) {
            gVar.a(new bn(true, 3, this.h));
        }
        return new bi(gVar);
    }
}
