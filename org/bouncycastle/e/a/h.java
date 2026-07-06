package org.bouncycastle.e.a;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o {
    private final org.bouncycastle.a.m a;
    private final org.bouncycastle.a.z.a b;

    private h(v vVar) {
        this.a = org.bouncycastle.a.m.a(vVar.a(0));
        this.b = org.bouncycastle.a.z.a.a(vVar.a(1));
    }

    public h(org.bouncycastle.a.z.a aVar) {
        this.a = new org.bouncycastle.a.m(0L);
        this.b = aVar;
    }

    public static final h a(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.z.a a() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
