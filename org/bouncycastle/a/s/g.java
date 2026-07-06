package org.bouncycastle.a.s;

/* JADX INFO: loaded from: classes.dex */
public final class g extends org.bouncycastle.a.o {
    private org.bouncycastle.a.z.a a;

    public g(org.bouncycastle.a.p pVar) {
        this.a = new org.bouncycastle.a.z.a(pVar);
    }

    public g(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.a = new org.bouncycastle.a.z.a(pVar, fVar);
    }

    private g(org.bouncycastle.a.v vVar) {
        this.a = org.bouncycastle.a.z.a.a(vVar);
    }

    public static g a(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.p a() {
        return this.a.a();
    }

    public final org.bouncycastle.a.f b() {
        return this.a.b();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a.i();
    }
}
