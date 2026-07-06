package org.c.a;

import java.util.Queue;
import org.c.b.e;

/* JADX INFO: compiled from: EventRecodingLogger.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements org.c.b {
    String a;
    e b;
    Queue<d> c;

    public a(e eVar, Queue<d> queue) {
        this.b = eVar;
        this.a = eVar.a();
        this.c = queue;
    }

    @Override // org.c.b
    public final String a() {
        return this.a;
    }

    @Override // org.c.b
    public final boolean b() {
        return true;
    }

    @Override // org.c.b
    public final void a(String str) {
        a(b.e, str, null);
    }

    @Override // org.c.b
    public final void a(String str, Throwable th) {
        a(b.e, str, th);
    }

    @Override // org.c.b
    public final boolean c() {
        return true;
    }

    @Override // org.c.b
    public final void b(String str) {
        a(b.e, str, null);
    }

    @Override // org.c.b
    public final void b(String str, Throwable th) {
        a(b.d, str, th);
    }

    @Override // org.c.b
    public final boolean d() {
        return true;
    }

    @Override // org.c.b
    public final void c(String str) {
        a(b.c, str, null);
    }

    @Override // org.c.b
    public final void c(String str, Throwable th) {
        a(b.c, str, th);
    }

    @Override // org.c.b
    public final void d(String str) {
        a(b.b, str, null);
    }

    @Override // org.c.b
    public final void d(String str, Throwable th) {
        a(b.b, str, th);
    }

    @Override // org.c.b
    public final void e(String str) {
        a(b.a, str, null);
    }

    @Override // org.c.b
    public final void e(String str, Throwable th) {
        a(b.a, str, th);
    }

    private void a(b bVar, String str, Throwable th) {
        d dVar = new d();
        dVar.h = System.currentTimeMillis();
        dVar.a = bVar;
        dVar.d = this.b;
        dVar.c = this.a;
        dVar.b = null;
        dVar.f = str;
        dVar.g = null;
        dVar.i = th;
        dVar.e = Thread.currentThread().getName();
        this.c.add(dVar);
    }
}
