package org.bouncycastle.a.s;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.bw;
import org.bouncycastle.a.by;
import org.bouncycastle.a.x;

/* JADX INFO: loaded from: classes.dex */
public final class v extends org.bouncycastle.a.o {
    private org.bouncycastle.a.p a;
    private org.bouncycastle.a.f b;
    private x c;

    public v(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar, x xVar) {
        this.a = pVar;
        this.b = fVar;
        this.c = xVar;
    }

    private v(org.bouncycastle.a.v vVar) {
        this.a = (org.bouncycastle.a.p) vVar.a(0);
        this.b = ((ab) vVar.a(1)).j();
        if (vVar.d() == 3) {
            this.c = (x) vVar.a(2);
        }
    }

    public static v a(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj != null) {
            return new v(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.p a() {
        return this.a;
    }

    public final org.bouncycastle.a.f b() {
        return this.b;
    }

    public final x c() {
        return this.c;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(new by(true, 0, this.b));
        if (this.c != null) {
            gVar.a(this.c);
        }
        return new bw(gVar);
    }
}
