package org.bouncycastle.a.s;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.al;
import org.bouncycastle.a.ap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends org.bouncycastle.a.o {
    org.bouncycastle.a.v a;

    public e(org.bouncycastle.a.p pVar, org.bouncycastle.a.z.a aVar, org.bouncycastle.a.f fVar) {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(pVar);
        gVar.a(aVar.i());
        gVar.a(new ap(false, 0, fVar));
        this.a = new al(gVar);
    }

    private e(org.bouncycastle.a.v vVar) {
        if (((org.bouncycastle.a.m) vVar.a(0)).b().intValue() != 0) {
            throw new IllegalArgumentException("sequence not version 0");
        }
        this.a = org.bouncycastle.a.v.a(vVar.a(1));
    }

    public static e a(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.z.a a() {
        return org.bouncycastle.a.z.a.a(this.a.a(1));
    }

    public final org.bouncycastle.a.q b() {
        if (this.a.d() == 3) {
            return org.bouncycastle.a.q.a(ab.a(this.a.a(2)), false);
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(0L));
        gVar.a(this.a);
        return new al(gVar);
    }
}
