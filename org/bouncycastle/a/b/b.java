package org.bouncycastle.a.b;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {
    private final org.bouncycastle.a.z.a a;
    private final q b;

    private b(v vVar) {
        this.a = org.bouncycastle.a.z.a.a(vVar.a(0));
        this.b = q.a(vVar.a(1));
    }

    public b(org.bouncycastle.a.z.a aVar, byte[] bArr) {
        this.a = aVar;
        this.b = new be(bArr);
    }

    public static b a(Object obj) {
        if (obj != null) {
            return new b(v.a(obj));
        }
        return null;
    }

    public final q a() {
        return this.b;
    }

    public final org.bouncycastle.a.z.a b() {
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
