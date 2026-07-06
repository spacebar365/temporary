package org.bouncycastle.a.s;

import org.bouncycastle.a.al;

/* JADX INFO: loaded from: classes.dex */
public final class o extends org.bouncycastle.a.o implements n {
    private c bO;
    private i bP;

    public o(c cVar, i iVar) {
        this.bP = null;
        this.bO = cVar;
        this.bP = iVar;
    }

    private o(org.bouncycastle.a.v vVar) {
        this.bP = null;
        if (org.bouncycastle.a.m.a(vVar.a(0)).b().intValue() != 3) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        this.bO = c.a(vVar.a(1));
        if (vVar.d() == 3) {
            this.bP = i.a(vVar.a(2));
        }
    }

    public static o a(Object obj) {
        if (obj != null) {
            return new o(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final c a() {
        return this.bO;
    }

    public final i b() {
        return this.bP;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(3L));
        gVar.a(this.bO);
        if (this.bP != null) {
            gVar.a(this.bP);
        }
        return new al(gVar);
    }
}
