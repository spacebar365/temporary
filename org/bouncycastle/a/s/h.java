package org.bouncycastle.a.s;

/* JADX INFO: loaded from: classes.dex */
public final class h extends org.bouncycastle.a.o {
    private org.bouncycastle.a.z.a a;

    public h(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.a = new org.bouncycastle.a.z.a(pVar, fVar);
    }

    private h(org.bouncycastle.a.v vVar) {
        this.a = org.bouncycastle.a.z.a.a(vVar);
    }

    public static h a(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(org.bouncycastle.a.v.a(obj));
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
