package org.c.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: compiled from: SubstituteLogger.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements org.c.b {
    private final String a;
    private volatile org.c.b b;
    private Boolean c;
    private Method d;
    private org.c.a.a e;
    private Queue<org.c.a.d> f;
    private final boolean g;

    public e(String str, Queue<org.c.a.d> queue, boolean z) {
        this.a = str;
        this.f = queue;
        this.g = z;
    }

    @Override // org.c.b
    public final String a() {
        return this.a;
    }

    @Override // org.c.b
    public final boolean b() {
        return h().b();
    }

    @Override // org.c.b
    public final void a(String str) {
        h().a(str);
    }

    @Override // org.c.b
    public final void a(String str, Throwable th) {
        h().a(str, th);
    }

    @Override // org.c.b
    public final boolean c() {
        return h().c();
    }

    @Override // org.c.b
    public final void b(String str) {
        h().b(str);
    }

    @Override // org.c.b
    public final void b(String str, Throwable th) {
        h().b(str, th);
    }

    @Override // org.c.b
    public final boolean d() {
        return h().d();
    }

    @Override // org.c.b
    public final void c(String str) {
        h().c(str);
    }

    @Override // org.c.b
    public final void c(String str, Throwable th) {
        h().c(str, th);
    }

    @Override // org.c.b
    public final void d(String str) {
        h().d(str);
    }

    @Override // org.c.b
    public final void d(String str, Throwable th) {
        h().d(str, th);
    }

    @Override // org.c.b
    public final void e(String str) {
        h().e(str);
    }

    @Override // org.c.b
    public final void e(String str, Throwable th) {
        h().e(str, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private org.c.b h() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return b.a;
        }
        return i();
    }

    private org.c.b i() {
        if (this.e == null) {
            this.e = new org.c.a.a(this, this.f);
        }
        return this.e;
    }

    public final void a(org.c.b bVar) {
        this.b = bVar;
    }

    public final boolean e() {
        if (this.c != null) {
            return this.c.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", org.c.a.c.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException e) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final void a(org.c.a.c cVar) {
        if (e()) {
            try {
                this.d.invoke(this.b, cVar);
            } catch (IllegalAccessException e) {
            } catch (IllegalArgumentException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    public final boolean f() {
        return this.b == null;
    }

    public final boolean g() {
        return this.b instanceof b;
    }
}
