package a.b;

import a.ae;
import a.g.au;
import a.g.s;
import a.h;
import a.i;
import a.l;
import a.o;
import a.w;
import java.net.URLStreamHandler;

/* JADX INFO: compiled from: BaseContext.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private final h a;
    private final a.b f;
    private final l b = new a.g.c();
    private final w c = new a.g.w();
    private final a.g.l d = new a.g.l(this);
    private final o e = new a.e.e(this);
    private final ae g = new au();
    private final a.g.b h = new s();

    public b(h hVar) {
        this.a = hVar;
        this.f = new a.g.a(this.a);
    }

    @Override // a.c
    public final ae d() {
        return this.g;
    }

    @Override // a.c
    public final h a() {
        return this.a;
    }

    @Override // a.c
    public final l e() {
        return this.b;
    }

    @Override // a.c
    public final o b() {
        return this.e;
    }

    @Override // a.c
    public final a.b c() {
        return this.f;
    }

    @Override // a.c
    public final URLStreamHandler h() {
        return this.d;
    }

    @Override // a.c
    public final w f() {
        return this.c;
    }

    @Override // a.b.a
    protected final i k() {
        return this.h;
    }

    @Override // a.b.a
    public final boolean l() {
        return super.l() | this.g.a();
    }
}
