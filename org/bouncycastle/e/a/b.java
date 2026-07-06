package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {
    private final int a;
    private final int b;
    private final org.bouncycastle.e.d.a.a c;
    private final org.bouncycastle.a.z.a d;

    public b(int i, int i2, org.bouncycastle.e.d.a.a aVar, org.bouncycastle.a.z.a aVar2) {
        this.a = i;
        this.b = i2;
        this.c = new org.bouncycastle.e.d.a.a(aVar.a());
        this.d = aVar2;
    }

    private b(v vVar) {
        this.a = ((org.bouncycastle.a.m) vVar.a(0)).b().intValue();
        this.b = ((org.bouncycastle.a.m) vVar.a(1)).b().intValue();
        this.c = new org.bouncycastle.e.d.a.a(((q) vVar.a(2)).c());
        this.d = org.bouncycastle.a.z.a.a(vVar.a(3));
    }

    public static b a(Object obj) {
        if (obj != null) {
            return new b(v.a(obj));
        }
        return null;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final org.bouncycastle.e.d.a.a c() {
        return this.c;
    }

    public final org.bouncycastle.a.z.a d() {
        return this.d;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(this.a));
        gVar.a(new org.bouncycastle.a.m(this.b));
        gVar.a(new be(this.c.a()));
        gVar.a(this.d);
        return new bi(gVar);
    }
}
