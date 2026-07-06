package org.bouncycastle.a.f;

import java.util.Enumeration;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {
    private q a;
    private p b;

    private c(v vVar) {
        Enumeration enumerationC = vVar.c();
        this.a = (q) enumerationC.nextElement();
        this.b = (p) enumerationC.nextElement();
    }

    public c(byte[] bArr, p pVar) {
        this.a = new be(bArr);
        this.b = pVar;
    }

    public static c a(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(v.a(obj));
        }
        return null;
    }

    public final p a() {
        return this.b;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.a.c());
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
