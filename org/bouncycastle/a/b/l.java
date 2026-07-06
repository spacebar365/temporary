package org.bouncycastle.a.b;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {
    private final org.bouncycastle.a.z.a a;
    private final v b;
    private final org.bouncycastle.a.c c;

    private l(v vVar) {
        int i;
        this.a = org.bouncycastle.a.z.a.a(vVar.a(0));
        if (vVar.a(1) instanceof ab) {
            i = 2;
            this.b = v.a((Object) ab.a(vVar.a(1)).j());
        } else {
            this.b = null;
            i = 1;
        }
        this.c = au.a(vVar.a(i));
    }

    public l(org.bouncycastle.a.z.a aVar, byte[] bArr) {
        this.a = aVar;
        this.b = null;
        this.c = new au(org.bouncycastle.f.a.b(bArr));
    }

    public l(org.bouncycastle.a.z.a aVar, org.bouncycastle.a.z.g[] gVarArr, byte[] bArr) {
        this.a = aVar;
        this.b = new bi(gVarArr);
        this.c = new au(org.bouncycastle.f.a.b(bArr));
    }

    public static l a(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.c a() {
        return new au(org.bouncycastle.f.a.b(this.c.d()), this.c.f());
    }

    public final org.bouncycastle.a.z.a b() {
        return this.a;
    }

    public final org.bouncycastle.a.z.g[] c() {
        if (this.b == null) {
            return null;
        }
        org.bouncycastle.a.z.g[] gVarArr = new org.bouncycastle.a.z.g[this.b.d()];
        for (int i = 0; i != gVarArr.length; i++) {
            gVarArr[i] = org.bouncycastle.a.z.g.a(this.b.a(i));
        }
        return gVarArr;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        if (this.b != null) {
            gVar.a(new bn(this.b));
        }
        gVar.a(this.c);
        return new bi(gVar);
    }
}
