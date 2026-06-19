package org.p150c.p152b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.p150c.InterfaceC1612b;
import org.p150c.p151a.C1608a;
import org.p150c.p151a.C1611d;
import org.p150c.p151a.InterfaceC1610c;

/* JADX INFO: renamed from: org.c.b.e */
/* JADX INFO: compiled from: SubstituteLogger.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1617e implements InterfaceC1612b {

    /* JADX INFO: renamed from: a */
    private final String f6301a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC1612b f6302b;

    /* JADX INFO: renamed from: c */
    private Boolean f6303c;

    /* JADX INFO: renamed from: d */
    private Method f6304d;

    /* JADX INFO: renamed from: e */
    private C1608a f6305e;

    /* JADX INFO: renamed from: f */
    private Queue<C1611d> f6306f;

    /* JADX INFO: renamed from: g */
    private final boolean f6307g;

    public C1617e(String str, Queue<C1611d> queue, boolean z) {
        this.f6301a = str;
        this.f6306f = queue;
        this.f6307g = z;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: a */
    public final String mo4531a() {
        return this.f6301a;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: b */
    public final boolean mo4536b() {
        return m4546h().mo4536b();
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: a */
    public final void mo4532a(String str) {
        m4546h().mo4532a(str);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: a */
    public final void mo4533a(String str, Throwable th) {
        m4546h().mo4533a(str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: c */
    public final boolean mo4539c() {
        return m4546h().mo4539c();
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: b */
    public final void mo4534b(String str) {
        m4546h().mo4534b(str);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: b */
    public final void mo4535b(String str, Throwable th) {
        m4546h().mo4535b(str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: d */
    public final boolean mo4542d() {
        return m4546h().mo4542d();
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: c */
    public final void mo4537c(String str) {
        m4546h().mo4537c(str);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: c */
    public final void mo4538c(String str, Throwable th) {
        m4546h().mo4538c(str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: d */
    public final void mo4540d(String str) {
        m4546h().mo4540d(str);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: d */
    public final void mo4541d(String str, Throwable th) {
        m4546h().mo4541d(str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: e */
    public final void mo4543e(String str) {
        m4546h().mo4543e(str);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: e */
    public final void mo4544e(String str, Throwable th) {
        m4546h().mo4544e(str, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6301a.equals(((C1617e) obj).f6301a);
    }

    public final int hashCode() {
        return this.f6301a.hashCode();
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC1612b m4546h() {
        if (this.f6302b != null) {
            return this.f6302b;
        }
        if (this.f6307g) {
            return C1614b.f6299a;
        }
        return m4547i();
    }

    /* JADX INFO: renamed from: i */
    private InterfaceC1612b m4547i() {
        if (this.f6305e == null) {
            this.f6305e = new C1608a(this, this.f6306f);
        }
        return this.f6305e;
    }

    /* JADX INFO: renamed from: a */
    public final void m4549a(InterfaceC1612b interfaceC1612b) {
        this.f6302b = interfaceC1612b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4550e() {
        if (this.f6303c != null) {
            return this.f6303c.booleanValue();
        }
        try {
            this.f6304d = this.f6302b.getClass().getMethod("log", InterfaceC1610c.class);
            this.f6303c = Boolean.TRUE;
        } catch (NoSuchMethodException e) {
            this.f6303c = Boolean.FALSE;
        }
        return this.f6303c.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m4548a(InterfaceC1610c interfaceC1610c) {
        if (m4550e()) {
            try {
                this.f6304d.invoke(this.f6302b, interfaceC1610c);
            } catch (IllegalAccessException e) {
            } catch (IllegalArgumentException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4551f() {
        return this.f6302b == null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4552g() {
        return this.f6302b instanceof C1614b;
    }
}
