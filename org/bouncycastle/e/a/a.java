package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private org.bouncycastle.a.z.a f;

    public a(int i, int i2, org.bouncycastle.e.d.a.b bVar, org.bouncycastle.e.d.a.i iVar, org.bouncycastle.e.d.a.h hVar, org.bouncycastle.a.z.a aVar) {
        this.a = i;
        this.b = i2;
        this.c = bVar.b();
        this.d = iVar.b();
        this.e = hVar.a();
        this.f = aVar;
    }

    private a(v vVar) {
        this.a = ((org.bouncycastle.a.m) vVar.a(0)).b().intValue();
        this.b = ((org.bouncycastle.a.m) vVar.a(1)).b().intValue();
        this.c = ((q) vVar.a(2)).c();
        this.d = ((q) vVar.a(3)).c();
        this.e = ((q) vVar.a(4)).c();
        this.f = org.bouncycastle.a.z.a.a(vVar.a(5));
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

    public final org.bouncycastle.e.d.a.b c() {
        return new org.bouncycastle.e.d.a.b(this.c);
    }

    public final org.bouncycastle.e.d.a.i d() {
        return new org.bouncycastle.e.d.a.i(c(), this.d);
    }

    public final org.bouncycastle.e.d.a.h e() {
        return new org.bouncycastle.e.d.a.h(this.e);
    }

    public final org.bouncycastle.a.z.a f() {
        return this.f;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(this.a));
        gVar.a(new org.bouncycastle.a.m(this.b));
        gVar.a(new be(this.c));
        gVar.a(new be(this.d));
        gVar.a(new be(this.e));
        gVar.a(this.f);
        return new bi(gVar);
    }
}
