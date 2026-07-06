package org.bouncycastle.a.z;

import java.util.Enumeration;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class b extends org.bouncycastle.a.o {
    org.bouncycastle.a.q a;
    p b;
    org.bouncycastle.a.m c;

    private b(org.bouncycastle.a.v vVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        Enumeration enumerationC = vVar.c();
        while (enumerationC.hasMoreElements()) {
            ab abVarA = bn.a(enumerationC.nextElement());
            switch (abVarA.b()) {
                case 0:
                    this.a = org.bouncycastle.a.q.a(abVarA, false);
                    break;
                case 1:
                    this.b = p.a(abVarA);
                    break;
                case 2:
                    this.c = org.bouncycastle.a.m.a(abVarA, false);
                    break;
                default:
                    throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    public static b a(Object obj) {
        if (obj != null) {
            return new b(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        if (this.a != null) {
            return this.a.c();
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(new bn(false, 0, this.a));
        }
        if (this.b != null) {
            gVar.a(new bn(false, 1, this.b));
        }
        if (this.c != null) {
            gVar.a(new bn(false, 2, this.c));
        }
        return new bi(gVar);
    }

    public final String toString() {
        return "AuthorityKeyIdentifier: KeyID(" + (this.a != null ? org.bouncycastle.f.a.f.a(this.a.c()) : "null") + ")";
    }
}
