package org.bouncycastle.a;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
final class ce extends v {
    private byte[] b;

    ce(byte[] bArr) {
        this.b = bArr;
    }

    private void f() {
        cd cdVar = new cd(this.b);
        while (cdVar.hasMoreElements()) {
            this.a.addElement(cdVar.nextElement());
        }
        this.b = null;
    }

    @Override // org.bouncycastle.a.v
    public final synchronized f a(int i) {
        if (this.b != null) {
            f();
        }
        return super.a(i);
    }

    @Override // org.bouncycastle.a.v, org.bouncycastle.a.u
    final void a(s sVar) {
        if (this.b != null) {
            sVar.a(48, this.b);
        } else {
            super.h().a(sVar);
        }
    }

    @Override // org.bouncycastle.a.v
    public final synchronized Enumeration c() {
        return this.b == null ? super.c() : new cd(this.b);
    }

    @Override // org.bouncycastle.a.v
    public final synchronized int d() {
        if (this.b != null) {
            f();
        }
        return super.d();
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return this.b != null ? ch.a(this.b.length) + 1 + this.b.length : super.h().e();
    }

    @Override // org.bouncycastle.a.v, org.bouncycastle.a.u
    final u g() {
        if (this.b != null) {
            f();
        }
        return super.g();
    }

    @Override // org.bouncycastle.a.v, org.bouncycastle.a.u
    final u h() {
        if (this.b != null) {
            f();
        }
        return super.h();
    }
}
