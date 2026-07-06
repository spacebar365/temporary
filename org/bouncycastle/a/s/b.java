package org.bouncycastle.a.s;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class b extends org.bouncycastle.a.o {
    private org.bouncycastle.a.p a;
    private org.bouncycastle.a.f b;

    public b(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.a = pVar;
        this.b = fVar;
    }

    private b(org.bouncycastle.a.v vVar) {
        this.a = (org.bouncycastle.a.p) vVar.a(0);
        this.b = ((bn) vVar.a(1)).j();
    }

    public static b a(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(org.bouncycastle.a.v.a(obj));
        }
        return null;
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
        gVar.a(new bn(this.b));
        return new bi(gVar);
    }
}
