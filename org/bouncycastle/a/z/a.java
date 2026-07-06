package org.bouncycastle.a.z;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class a extends org.bouncycastle.a.o {
    private org.bouncycastle.a.p a;
    private org.bouncycastle.a.f b;

    public a(org.bouncycastle.a.p pVar) {
        this.a = pVar;
    }

    public a(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.a = pVar;
        this.b = fVar;
    }

    private a(org.bouncycastle.a.v vVar) {
        if (vVar.d() <= 0 || vVar.d() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        this.a = org.bouncycastle.a.p.a(vVar.a(0));
        if (vVar.d() == 2) {
            this.b = vVar.a(1);
        } else {
            this.b = null;
        }
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public static a a(ab abVar) {
        return a(org.bouncycastle.a.v.a(abVar, true));
    }

    public final org.bouncycastle.a.p a() {
        return this.a;
    }

    public final org.bouncycastle.a.f b() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        if (this.b != null) {
            gVar.a(this.b);
        }
        return new bi(gVar);
    }
}
