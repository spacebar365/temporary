package org.bouncycastle.a.s;

import java.util.Enumeration;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.al;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.x;

/* JADX INFO: loaded from: classes.dex */
public final class w extends org.bouncycastle.a.o implements n {
    private org.bouncycastle.a.m bO;
    private x bP;
    private c bQ;
    private x bR;
    private x bS;
    private x bT;

    public w(org.bouncycastle.a.m mVar, x xVar, c cVar, x xVar2, x xVar3) {
        this.bO = mVar;
        this.bP = xVar;
        this.bQ = cVar;
        this.bR = xVar2;
        this.bS = null;
        this.bT = xVar3;
    }

    private w(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        this.bO = (org.bouncycastle.a.m) enumerationC.nextElement();
        this.bP = (x) enumerationC.nextElement();
        this.bQ = c.a(enumerationC.nextElement());
        while (enumerationC.hasMoreElements()) {
            org.bouncycastle.a.u uVar = (org.bouncycastle.a.u) enumerationC.nextElement();
            if (uVar instanceof ab) {
                ab abVar = (ab) uVar;
                switch (abVar.b()) {
                    case 0:
                        this.bR = x.a(abVar);
                        break;
                    case 1:
                        this.bS = x.a(abVar);
                        break;
                    default:
                        throw new IllegalArgumentException("unknown tag value " + abVar.b());
                }
            } else {
                this.bT = (x) uVar;
            }
        }
    }

    public static w a(Object obj) {
        if (obj != null) {
            return new w(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final x a() {
        return this.bR;
    }

    public final x b() {
        return this.bS;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.bO);
        gVar.a(this.bP);
        gVar.a(this.bQ);
        if (this.bR != null) {
            gVar.a(new bn(false, 0, this.bR));
        }
        if (this.bS != null) {
            gVar.a(new bn(false, 1, this.bS));
        }
        gVar.a(this.bT);
        return new al(gVar);
    }
}
