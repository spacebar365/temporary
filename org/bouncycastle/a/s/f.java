package org.bouncycastle.a.s;

import java.util.Enumeration;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class f extends org.bouncycastle.a.o {
    private org.bouncycastle.a.z.a a;
    private org.bouncycastle.a.q b;

    private f(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        this.a = org.bouncycastle.a.z.a.a(enumerationC.nextElement());
        this.b = org.bouncycastle.a.q.a(enumerationC.nextElement());
    }

    public f(org.bouncycastle.a.z.a aVar, byte[] bArr) {
        this.a = aVar;
        this.b = new be(bArr);
    }

    public static f a(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.z.a a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
