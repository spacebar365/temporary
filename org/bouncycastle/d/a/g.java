package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements c {
    public abstract BigInteger a();

    public g a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this = this.e();
        }
        return this;
    }

    public abstract g a(g gVar);

    public g a(g gVar, g gVar2) {
        return e().a(gVar.c(gVar2));
    }

    public g a(g gVar, g gVar2, g gVar3) {
        return c(gVar).b(gVar2.c(gVar3));
    }

    public abstract int b();

    public abstract g b(g gVar);

    public g b(g gVar, g gVar2, g gVar3) {
        return c(gVar).a(gVar2.c(gVar3));
    }

    public abstract g c();

    public abstract g c(g gVar);

    public abstract g d();

    public abstract g d(g gVar);

    public abstract g e();

    public abstract g f();

    public abstract g g();

    public int h() {
        return a().bitLength();
    }

    public boolean i() {
        return h() == 1;
    }

    public boolean j() {
        return a().signum() == 0;
    }

    public boolean k() {
        return a().testBit(0);
    }

    public final byte[] l() {
        return org.bouncycastle.f.b.a((b() + 7) / 8, a());
    }

    public String toString() {
        return a().toString(16);
    }
}
