package org.bouncycastle.b.b;

import org.bouncycastle.b.k.bo;

/* JADX INFO: loaded from: classes.dex */
public final class ab implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    private ac a;

    public ab(ab abVar) {
        this.a = new ac(abVar.a);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        return this.a.a(bArr, i);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        this.a.a((org.bouncycastle.f.e) ((ab) eVar).a);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.a.a();
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.a.c();
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new ab(this);
    }

    public ab(int i, int i2) {
        this.a = new ac(i, i2);
        this.a.a((bo) null);
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "Skein-" + (this.a.a.b() * 8) + "-" + (this.a.a() * 8);
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return this.a.a.b();
    }
}
