package org.bouncycastle.a.z;

import org.bouncycastle.a.au;

/* JADX INFO: loaded from: classes.dex */
public final class g extends org.bouncycastle.a.o {
    org.bouncycastle.a.v a;
    w b;
    a c;
    au d;

    private g(org.bouncycastle.a.v vVar) {
        this.a = vVar;
        if (vVar.d() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.b = w.a(vVar.a(0));
        this.c = a.a(vVar.a(1));
        this.d = au.a(vVar.a(2));
    }

    public static g a(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final w a() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }

    public final a j() {
        return this.c;
    }

    public final au l() {
        return this.d;
    }

    public final int b() {
        return this.b.b.b().intValue() + 1;
    }

    public final org.bouncycastle.a.m c() {
        return this.b.c;
    }

    public final org.bouncycastle.a.y.c d() {
        return this.b.e;
    }

    public final x e() {
        return this.b.f;
    }

    public final x f() {
        return this.b.g;
    }

    public final org.bouncycastle.a.y.c g() {
        return this.b.h;
    }

    public final u h() {
        return this.b.i;
    }
}
