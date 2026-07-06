package org.bouncycastle.a.b;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {
    private final org.bouncycastle.a.s.f a;
    private final org.bouncycastle.a.z.g[] b;

    public c(org.bouncycastle.a.s.f fVar, org.bouncycastle.a.z.g[] gVarArr) {
        this.a = fVar;
        this.b = new org.bouncycastle.a.z.g[gVarArr.length];
        System.arraycopy(gVarArr, 0, this.b, 0, gVarArr.length);
    }

    private c(v vVar) {
        this.a = org.bouncycastle.a.s.f.a(vVar.a(0));
        v vVarA = v.a(vVar.a(1));
        this.b = new org.bouncycastle.a.z.g[vVarA.d()];
        for (int i = 0; i != this.b.length; i++) {
            this.b[i] = org.bouncycastle.a.z.g.a(vVarA.a(i));
        }
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.z.g[] a() {
        org.bouncycastle.a.z.g[] gVarArr = new org.bouncycastle.a.z.g[this.b.length];
        System.arraycopy(this.b, 0, gVarArr, 0, this.b.length);
        return gVarArr;
    }

    public final org.bouncycastle.a.s.f b() {
        return this.a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(new bi(this.b));
        return new bi(gVar);
    }
}
