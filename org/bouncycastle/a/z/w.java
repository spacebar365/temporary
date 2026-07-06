package org.bouncycastle.a.z;

import java.math.BigInteger;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.au;

/* JADX INFO: loaded from: classes.dex */
public final class w extends org.bouncycastle.a.o {
    org.bouncycastle.a.v a;
    org.bouncycastle.a.m b;
    org.bouncycastle.a.m c;
    a d;
    org.bouncycastle.a.y.c e;
    x f;
    x g;
    org.bouncycastle.a.y.c h;
    u i;
    au j;
    au k;
    n l;

    private w(org.bouncycastle.a.v vVar) {
        int i;
        boolean z;
        boolean z2;
        this.a = vVar;
        if (vVar.a(0) instanceof ab) {
            this.b = org.bouncycastle.a.m.a((ab) vVar.a(0), true);
            i = 0;
        } else {
            this.b = new org.bouncycastle.a.m(0L);
            i = -1;
        }
        if (this.b.b().equals(BigInteger.valueOf(0L))) {
            z = false;
            z2 = true;
        } else if (this.b.b().equals(BigInteger.valueOf(1L))) {
            z = true;
            z2 = false;
        } else {
            if (!this.b.b().equals(BigInteger.valueOf(2L))) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        this.c = org.bouncycastle.a.m.a(vVar.a(i + 1));
        this.d = a.a(vVar.a(i + 2));
        this.e = org.bouncycastle.a.y.c.a(vVar.a(i + 3));
        org.bouncycastle.a.v vVar2 = (org.bouncycastle.a.v) vVar.a(i + 4);
        this.f = x.a(vVar2.a(0));
        this.g = x.a(vVar2.a(1));
        this.h = org.bouncycastle.a.y.c.a(vVar.a(i + 5));
        this.i = u.a(vVar.a(i + 6));
        int iD = (vVar.d() - (i + 6)) - 1;
        if (iD != 0 && z2) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        for (int i2 = iD; i2 > 0; i2--) {
            ab abVar = (ab) vVar.a(i + 6 + i2);
            switch (abVar.b()) {
                case 1:
                    this.j = au.a(abVar, false);
                    break;
                case 2:
                    this.k = au.a(abVar, false);
                    break;
                case 3:
                    if (z) {
                        throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                    }
                    this.l = n.a(org.bouncycastle.a.v.a(abVar, true));
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + abVar.b());
            }
        }
    }

    public static w a(Object obj) {
        if (obj instanceof w) {
            return (w) obj;
        }
        if (obj != null) {
            return new w(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final a a() {
        return this.d;
    }

    public final au b() {
        return this.j;
    }

    public final au c() {
        return this.k;
    }

    public final n d() {
        return this.l;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }
}
