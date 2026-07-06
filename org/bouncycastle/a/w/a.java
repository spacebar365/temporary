package org.bouncycastle.a.w;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    private int a;
    private int b;
    private int c;
    private int d;

    private a(v vVar) {
        this.a = m.a(vVar.a(0)).c().intValue();
        if (vVar.a(1) instanceof m) {
            this.b = ((m) vVar.a(1)).c().intValue();
        } else {
            if (!(vVar.a(1) instanceof v)) {
                throw new IllegalArgumentException("object parse error");
            }
            v vVarA = v.a(vVar.a(1));
            this.b = m.a(vVarA.a(0)).c().intValue();
            this.c = m.a(vVarA.a(1)).c().intValue();
            this.d = m.a(vVarA.a(2)).c().intValue();
        }
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(v.a(obj));
        }
        return null;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(new m(this.a));
        if (this.c == 0) {
            gVar.a(new m(this.b));
        } else {
            g gVar2 = new g();
            gVar2.a(new m(this.b));
            gVar2.a(new m(this.c));
            gVar2.a(new m(this.d));
            gVar.a(new bi(gVar2));
        }
        return new bi(gVar);
    }
}
