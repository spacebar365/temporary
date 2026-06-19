package org.p150c.p151a;

import java.util.Queue;
import org.p150c.InterfaceC1612b;
import org.p150c.p152b.C1617e;

/* JADX INFO: renamed from: org.c.a.a */
/* JADX INFO: compiled from: EventRecodingLogger.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1608a implements InterfaceC1612b {

    /* JADX INFO: renamed from: a */
    String f6279a;

    /* JADX INFO: renamed from: b */
    C1617e f6280b;

    /* JADX INFO: renamed from: c */
    Queue<C1611d> f6281c;

    public C1608a(C1617e c1617e, Queue<C1611d> queue) {
        this.f6280b = c1617e;
        this.f6279a = c1617e.mo4531a();
        this.f6281c = queue;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: a */
    public final String mo4531a() {
        return this.f6279a;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: b */
    public final boolean mo4536b() {
        return true;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: a */
    public final void mo4532a(String str) {
        m4530a(EnumC1609b.TRACE, str, null);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: a */
    public final void mo4533a(String str, Throwable th) {
        m4530a(EnumC1609b.TRACE, str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: c */
    public final boolean mo4539c() {
        return true;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: b */
    public final void mo4534b(String str) {
        m4530a(EnumC1609b.TRACE, str, null);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: b */
    public final void mo4535b(String str, Throwable th) {
        m4530a(EnumC1609b.DEBUG, str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: d */
    public final boolean mo4542d() {
        return true;
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: c */
    public final void mo4537c(String str) {
        m4530a(EnumC1609b.INFO, str, null);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: c */
    public final void mo4538c(String str, Throwable th) {
        m4530a(EnumC1609b.INFO, str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: d */
    public final void mo4540d(String str) {
        m4530a(EnumC1609b.WARN, str, null);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: d */
    public final void mo4541d(String str, Throwable th) {
        m4530a(EnumC1609b.WARN, str, th);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: e */
    public final void mo4543e(String str) {
        m4530a(EnumC1609b.ERROR, str, null);
    }

    @Override // org.p150c.InterfaceC1612b
    /* JADX INFO: renamed from: e */
    public final void mo4544e(String str, Throwable th) {
        m4530a(EnumC1609b.ERROR, str, th);
    }

    /* JADX INFO: renamed from: a */
    private void m4530a(EnumC1609b enumC1609b, String str, Throwable th) {
        C1611d c1611d = new C1611d();
        c1611d.f6297h = System.currentTimeMillis();
        c1611d.f6290a = enumC1609b;
        c1611d.f6293d = this.f6280b;
        c1611d.f6292c = this.f6279a;
        c1611d.f6291b = null;
        c1611d.f6295f = str;
        c1611d.f6296g = null;
        c1611d.f6298i = th;
        c1611d.f6294e = Thread.currentThread().getName();
        this.f6281c.add(c1611d);
    }
}
