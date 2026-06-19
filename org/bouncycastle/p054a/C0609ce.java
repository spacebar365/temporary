package org.bouncycastle.p054a;

import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.ce */
/* JADX INFO: loaded from: classes.dex */
final class C0609ce extends AbstractC0723v {

    /* JADX INFO: renamed from: b */
    private byte[] f2169b;

    C0609ce(byte[] bArr) {
        this.f2169b = bArr;
    }

    /* JADX INFO: renamed from: f */
    private void m1481f() {
        C0608cd c0608cd = new C0608cd(this.f2169b);
        while (c0608cd.hasMoreElements()) {
            this.f2909a.addElement(c0608cd.nextElement());
        }
        this.f2169b = null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC0618f mo1482a(int i) {
        if (this.f2169b != null) {
            m1481f();
        }
        return super.mo1482a(i);
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        if (this.f2169b != null) {
            c0660s.m1605a(48, this.f2169b);
        } else {
            super.mo1401h().mo1335a(c0660s);
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v
    /* JADX INFO: renamed from: c */
    public final synchronized Enumeration mo1483c() {
        return this.f2169b == null ? super.mo1483c() : new C0608cd(this.f2169b);
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v
    /* JADX INFO: renamed from: d */
    public final synchronized int mo1484d() {
        if (this.f2169b != null) {
            m1481f();
        }
        return super.mo1484d();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return this.f2169b != null ? C0612ch.m1488a(this.f2169b.length) + 1 + this.f2169b.length : super.mo1401h().mo1341e();
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        if (this.f2169b != null) {
            m1481f();
        }
        return super.mo1400g();
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: h */
    final AbstractC0686u mo1401h() {
        if (this.f2169b != null) {
            m1481f();
        }
        return super.mo1401h();
    }
}
