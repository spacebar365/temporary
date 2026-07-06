package org.bouncycastle.e.a;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    private final org.bouncycastle.a.m a;
    private final int b;
    private final org.bouncycastle.a.z.a c;

    public i(int i, org.bouncycastle.a.z.a aVar) {
        this.a = new org.bouncycastle.a.m(0L);
        this.b = i;
        this.c = aVar;
    }

    private i(v vVar) {
        this.a = org.bouncycastle.a.m.a(vVar.a(0));
        this.b = org.bouncycastle.a.m.a(vVar.a(1)).b().intValue();
        this.c = org.bouncycastle.a.z.a.a(vVar.a(2));
    }

    public static i a(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(v.a(obj));
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public final org.bouncycastle.a.z.a b() {
        return this.c;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(new org.bouncycastle.a.m(this.b));
        gVar.a(this.c);
        return new bi(gVar);
    }
}
