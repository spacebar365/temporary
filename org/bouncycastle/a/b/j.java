package org.bouncycastle.a.b;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    private final org.bouncycastle.a.z.a a;
    private final org.bouncycastle.a.s.h b;
    private final q c;

    private j(v vVar) {
        this.a = org.bouncycastle.a.z.a.a(vVar.a(0));
        this.b = org.bouncycastle.a.s.h.a(vVar.a(1));
        this.c = q.a(vVar.a(2));
    }

    public j(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.s.h hVar, byte[] bArr) {
        this.a = aVar;
        this.b = hVar;
        this.c = new be(org.bouncycastle.f.a.b(bArr));
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

    public final org.bouncycastle.a.z.a a() {
        return this.a;
    }

    public final org.bouncycastle.a.s.h b() {
        return this.b;
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.c.c());
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        gVar.a(this.c);
        return new bi(gVar);
    }
}
