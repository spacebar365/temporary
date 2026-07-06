package org.bouncycastle.a.z;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.ad;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class v extends org.bouncycastle.a.o {
    org.bouncycastle.a.m a;
    a b;
    org.bouncycastle.a.y.c c;
    x d;
    x e;
    org.bouncycastle.a.v f;
    n g;

    public v(org.bouncycastle.a.v vVar) {
        int i = 0;
        if (vVar.d() < 3 || vVar.d() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        if (vVar.a(0) instanceof org.bouncycastle.a.m) {
            this.a = org.bouncycastle.a.m.a(vVar.a(0));
            i = 1;
        } else {
            this.a = null;
        }
        int i2 = i + 1;
        this.b = a.a(vVar.a(i));
        int i3 = i2 + 1;
        this.c = org.bouncycastle.a.y.c.a(vVar.a(i2));
        int i4 = i3 + 1;
        this.d = x.a(vVar.a(i3));
        if (i4 < vVar.d() && ((vVar.a(i4) instanceof ad) || (vVar.a(i4) instanceof org.bouncycastle.a.k) || (vVar.a(i4) instanceof x))) {
            this.e = x.a(vVar.a(i4));
            i4++;
        }
        if (i4 < vVar.d() && !(vVar.a(i4) instanceof ab)) {
            this.f = org.bouncycastle.a.v.a(vVar.a(i4));
            i4++;
        }
        if (i4 >= vVar.d() || !(vVar.a(i4) instanceof ab)) {
            return;
        }
        this.g = n.a(org.bouncycastle.a.v.a((ab) vVar.a(i4), true));
    }

    public final a a() {
        return this.b;
    }

    public final n b() {
        return this.g;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(this.a);
        }
        gVar.a(this.b);
        gVar.a(this.c);
        gVar.a(this.d);
        if (this.e != null) {
            gVar.a(this.e);
        }
        if (this.f != null) {
            gVar.a(this.f);
        }
        if (this.g != null) {
            gVar.a(new bn(this.g));
        }
        return new bi(gVar);
    }
}
