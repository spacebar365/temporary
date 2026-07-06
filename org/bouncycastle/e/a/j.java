package org.bouncycastle.e.a;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    private final org.bouncycastle.a.m a;
    private final int b;
    private final int c;
    private final org.bouncycastle.a.z.a d;

    public j(int i, int i2, org.bouncycastle.a.z.a aVar) {
        this.a = new org.bouncycastle.a.m(0L);
        this.b = i;
        this.c = i2;
        this.d = aVar;
    }

    private j(v vVar) {
        this.a = org.bouncycastle.a.m.a(vVar.a(0));
        this.b = org.bouncycastle.a.m.a(vVar.a(1)).b().intValue();
        this.c = org.bouncycastle.a.m.a(vVar.a(2)).b().intValue();
        this.d = org.bouncycastle.a.z.a.a(vVar.a(3));
    }

    public static j a(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(v.a(obj));
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final org.bouncycastle.a.z.a c() {
        return this.d;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(new org.bouncycastle.a.m(this.b));
        gVar.a(new org.bouncycastle.a.m(this.c));
        gVar.a(this.d);
        return new bi(gVar);
    }
}
