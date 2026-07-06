package org.bouncycastle.a.z;

import java.math.BigInteger;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class c extends org.bouncycastle.a.o {
    org.bouncycastle.a.d a;
    org.bouncycastle.a.m b;

    private c(org.bouncycastle.a.v vVar) {
        this.a = org.bouncycastle.a.d.a(false);
        this.b = null;
        if (vVar.d() == 0) {
            this.a = null;
            this.b = null;
            return;
        }
        if (vVar.a(0) instanceof org.bouncycastle.a.d) {
            this.a = org.bouncycastle.a.d.a(vVar.a(0));
        } else {
            this.a = null;
            this.b = org.bouncycastle.a.m.a(vVar.a(0));
        }
        if (vVar.d() > 1) {
            if (this.a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.b = org.bouncycastle.a.m.a(vVar.a(1));
        }
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final boolean a() {
        return this.a != null && this.a.b();
    }

    public final BigInteger b() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(this.a);
        }
        if (this.b != null) {
            gVar.a(this.b);
        }
        return new bi(gVar);
    }

    public final String toString() {
        return this.b == null ? this.a == null ? "BasicConstraints: isCa(false)" : "BasicConstraints: isCa(" + a() + ")" : "BasicConstraints: isCa(" + a() + "), pathLenConstraint = " + this.b.b();
    }
}
