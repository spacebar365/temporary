package org.bouncycastle.a.z;

import java.util.Enumeration;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class j extends org.bouncycastle.a.o {
    private byte[] a;
    private a b;

    public j(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        this.b = a.a(enumerationC.nextElement());
        this.a = org.bouncycastle.a.q.a(enumerationC.nextElement()).c();
    }

    public j(a aVar, byte[] bArr) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = aVar;
    }

    public final a a() {
        return this.b;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.a);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.b);
        gVar.a(new be(this.a));
        return new bi(gVar);
    }
}
