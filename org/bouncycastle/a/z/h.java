package org.bouncycastle.a.z;

import java.util.Enumeration;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class h extends org.bouncycastle.a.o {
    v a;
    a b;
    au c;
    boolean d = false;
    int e;

    public static h a(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final v a() {
        return this.a;
    }

    public final a c() {
        return this.b;
    }

    public final au d() {
        return this.c;
    }

    @Override // org.bouncycastle.a.o
    public final int hashCode() {
        if (!this.d) {
            this.e = super.hashCode();
            this.d = true;
        }
        return this.e;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        gVar.a(this.c);
        return new bi(gVar);
    }

    private h(org.bouncycastle.a.v vVar) {
        if (vVar.d() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        org.bouncycastle.a.f fVarA = vVar.a(0);
        this.a = fVarA instanceof v ? (v) fVarA : fVarA != null ? new v(org.bouncycastle.a.v.a(fVarA)) : null;
        this.b = a.a(vVar.a(1));
        this.c = au.a(vVar.a(2));
    }

    public final Enumeration b() {
        v vVar = this.a;
        return vVar.f == null ? new v$b(vVar, (byte) 0) : new v$c(vVar, vVar.f.c());
    }

    public final int e() {
        v vVar = this.a;
        if (vVar.a == null) {
            return 1;
        }
        return vVar.a.b().intValue() + 1;
    }

    public final org.bouncycastle.a.y.c f() {
        return this.a.c;
    }

    public final x g() {
        return this.a.d;
    }

    public final x h() {
        return this.a.e;
    }
}
