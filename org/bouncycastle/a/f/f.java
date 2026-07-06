package org.bouncycastle.a.f;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o {
    private p a;
    private p b;
    private p c;

    public f(p pVar, p pVar2) {
        this.a = pVar;
        this.b = pVar2;
        this.c = null;
    }

    public f(p pVar, p pVar2, p pVar3) {
        this.a = pVar;
        this.b = pVar2;
        this.c = pVar3;
    }

    public f(v vVar) {
        this.a = (p) vVar.a(0);
        this.b = (p) vVar.a(1);
        if (vVar.d() > 2) {
            this.c = (p) vVar.a(2);
        }
    }

    public static f a(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(v.a(obj));
        }
        return null;
    }

    public final p a() {
        return this.a;
    }

    public final p b() {
        return this.b;
    }

    public final p c() {
        return this.c;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(this.a);
        gVar.a(this.b);
        if (this.c != null) {
            gVar.a(this.c);
        }
        return new bi(gVar);
    }
}
