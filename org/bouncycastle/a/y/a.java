package org.bouncycastle.a.y;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.f;
import org.bouncycastle.a.g;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    private p a;
    private f b;

    private a(v vVar) {
        this.a = (p) vVar.a(0);
        this.b = vVar.a(1);
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(v.a(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public final p a() {
        return this.a;
    }

    public final f b() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
