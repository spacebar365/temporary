package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;

    public c(int i, int i2, org.bouncycastle.e.d.a.b bVar, org.bouncycastle.e.d.a.i iVar, org.bouncycastle.e.d.a.h hVar, org.bouncycastle.e.d.a.h hVar2, org.bouncycastle.e.d.a.a aVar) {
        this.a = i;
        this.b = i2;
        this.c = bVar.b();
        this.d = iVar.b();
        this.e = aVar.a();
        this.f = hVar.a();
        this.g = hVar2.a();
    }

    private c(v vVar) {
        this.a = ((org.bouncycastle.a.m) vVar.a(0)).b().intValue();
        this.b = ((org.bouncycastle.a.m) vVar.a(1)).b().intValue();
        this.c = ((q) vVar.a(2)).c();
        this.d = ((q) vVar.a(3)).c();
        this.f = ((q) vVar.a(4)).c();
        this.g = ((q) vVar.a(5)).c();
        this.e = ((q) vVar.a(6)).c();
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

    public final org.bouncycastle.e.d.a.a e() {
        return new org.bouncycastle.e.d.a.a(this.e);
    }

    public final org.bouncycastle.e.d.a.h f() {
        return new org.bouncycastle.e.d.a.h(this.f);
    }

    public final org.bouncycastle.e.d.a.h g() {
        return new org.bouncycastle.e.d.a.h(this.g);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(this.a));
        gVar.a(new org.bouncycastle.a.m(this.b));
        gVar.a(new be(this.c));
        gVar.a(new be(this.d));
        gVar.a(new be(this.f));
        gVar.a(new be(this.g));
        gVar.a(new be(this.e));
        return new bi(gVar);
    }
}
