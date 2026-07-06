package org.bouncycastle.e.b.a;

import org.bouncycastle.e.d.a.h;
import org.bouncycastle.e.d.a.i;
import org.bouncycastle.e.d.a.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    private int b;
    private int c;
    private org.bouncycastle.e.d.a.b d;
    private i e;
    private h f;
    private org.bouncycastle.e.d.a.a g;
    private i[] h;

    private b(int i, int i2, org.bouncycastle.e.d.a.b bVar, i iVar, org.bouncycastle.e.d.a.a aVar, h hVar, String str) {
        super(true, str);
        this.b = i;
        this.c = i2;
        this.d = bVar;
        this.e = iVar;
        this.g = aVar;
        this.f = hVar;
        this.h = new k(bVar, iVar).a();
    }

    public b(int i, int i2, org.bouncycastle.e.d.a.b bVar, i iVar, h hVar, String str) {
        this(i, i2, bVar, iVar, org.bouncycastle.e.d.a.c.a(bVar, iVar), hVar, str);
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final org.bouncycastle.e.d.a.b e() {
        return this.d;
    }

    public final i f() {
        return this.e;
    }

    public final h g() {
        return this.f;
    }

    public final org.bouncycastle.e.d.a.a h() {
        return this.g;
    }
}
