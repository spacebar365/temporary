package org.bouncycastle.a.b;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    private final p a;
    private final q b;

    public k(p pVar, byte[] bArr) {
        this.a = pVar;
        this.b = new be(org.bouncycastle.f.a.b(bArr));
    }

    private k(v vVar) {
        this.a = p.a(vVar.a(0));
        this.b = q.a(vVar.a(1));
    }

    public static k a(Object obj) {
        if (obj != null) {
            return new k(v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.b.c());
    }

    public final p b() {
        return this.a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
