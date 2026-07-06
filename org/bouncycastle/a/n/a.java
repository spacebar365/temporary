package org.bouncycastle.a.n;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    m a;
    q b;

    private a(v vVar) {
        this.b = (q) vVar.a(0);
        this.a = (m) vVar.a(1);
    }

    public a(byte[] bArr, int i) {
        this.b = new be(org.bouncycastle.f.a.b(bArr));
        this.a = new m(i);
    }

    public static a a(Object obj) {
        if (obj != null) {
            return new a(v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.b.c());
    }

    public final int b() {
        return this.a.b().intValue();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.b);
        gVar.a(this.a);
        return new bi(gVar);
    }
}
