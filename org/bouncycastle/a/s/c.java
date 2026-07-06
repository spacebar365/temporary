package org.bouncycastle.a.s;

import java.util.Enumeration;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.al;
import org.bouncycastle.a.ap;
import org.bouncycastle.a.bw;

/* JADX INFO: loaded from: classes.dex */
public final class c extends org.bouncycastle.a.o implements n {
    private org.bouncycastle.a.p bO;
    private org.bouncycastle.a.f bP;
    private boolean bQ;

    public c(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.bQ = true;
        this.bO = pVar;
        this.bP = fVar;
    }

    private c(org.bouncycastle.a.v vVar) {
        this.bQ = true;
        Enumeration enumerationC = vVar.c();
        this.bO = (org.bouncycastle.a.p) enumerationC.nextElement();
        if (enumerationC.hasMoreElements()) {
            this.bP = ((ab) enumerationC.nextElement()).j();
        }
        this.bQ = vVar instanceof al;
    }

    public static c a(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.p a() {
        return this.bO;
    }

    public final org.bouncycastle.a.f b() {
        return this.bP;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.bO);
        if (this.bP != null) {
            gVar.a(new ap(true, 0, this.bP));
        }
        return this.bQ ? new al(gVar) : new bw(gVar);
    }
}
