package org.bouncycastle.e.b.a;

import org.bouncycastle.e.d.a.h;
import org.bouncycastle.e.d.a.i;
import org.bouncycastle.e.d.a.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {
    private int b;
    private int c;
    private org.bouncycastle.e.d.a.b d;
    private i e;
    private org.bouncycastle.e.d.a.a f;
    private h g;
    private h h;
    private org.bouncycastle.e.d.a.a i;
    private i[] j;

    public f(int i, int i2, org.bouncycastle.e.d.a.b bVar, i iVar, h hVar, h hVar2, org.bouncycastle.e.d.a.a aVar) {
        super(true);
        this.c = i2;
        this.b = i;
        this.d = bVar;
        this.e = iVar;
        this.f = aVar;
        this.g = hVar;
        this.h = hVar2;
        this.i = org.bouncycastle.e.d.a.c.a(bVar, iVar);
        this.j = new k(bVar, iVar).a();
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final org.bouncycastle.e.d.a.b d() {
        return this.d;
    }

    public final i e() {
        return this.e;
    }

    public final org.bouncycastle.e.d.a.a f() {
        return this.f;
    }

    public final h g() {
        return this.g;
    }

    public final h h() {
        return this.h;
    }
}
