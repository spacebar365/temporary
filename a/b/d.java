package a.b;

import a.ae;
import a.g.l;
import a.h;
import a.i;
import a.o;
import a.w;
import java.net.URLStreamHandler;

/* JADX INFO: compiled from: CIFSContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements a.c {
    private final a.c a;
    private l b;

    public d(a.c cVar) {
        this.a = cVar;
    }

    @Override // a.c
    public final h a() {
        return this.a.a();
    }

    @Override // a.c
    public final a.l e() {
        return this.a.e();
    }

    @Override // a.c
    public i g() {
        return this.a.g();
    }

    @Override // a.c
    public final URLStreamHandler h() {
        if (this.b == null) {
            this.b = new l(this);
        }
        return this.b;
    }

    @Override // a.c
    public final w f() {
        return this.a.f();
    }

    @Override // a.c
    public final a.c a(i iVar) {
        return this.a.a(iVar);
    }

    @Override // a.c
    public final a.c i() {
        return this.a.i();
    }

    @Override // a.c
    public final a.c j() {
        return this.a.j();
    }

    @Override // a.c
    public boolean a(String str, Throwable th) {
        return this.a.a(str, th);
    }

    @Override // a.c
    public final o b() {
        return this.a.b();
    }

    @Override // a.c
    public final a.b c() {
        return this.a.c();
    }

    @Override // a.c
    public final ae d() {
        return this.a.d();
    }
}
