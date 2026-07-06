package org.bouncycastle.a.s;

import java.util.Enumeration;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class k extends org.bouncycastle.a.o implements n {
    private h bO;
    private g bP;

    public k(h hVar, g gVar) {
        this.bO = hVar;
        this.bP = gVar;
    }

    private k(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        org.bouncycastle.a.v vVarA = org.bouncycastle.a.v.a((Object) ((org.bouncycastle.a.f) enumerationC.nextElement()).i());
        if (vVarA.a(0).equals(B)) {
            this.bO = new h(B, l.a(vVarA.a(1)));
        } else {
            this.bO = h.a(vVarA);
        }
        this.bP = g.a(enumerationC.nextElement());
    }

    public static k a(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final h a() {
        return this.bO;
    }

    public final g b() {
        return this.bP;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.bO);
        gVar.a(this.bP);
        return new bi(gVar);
    }
}
