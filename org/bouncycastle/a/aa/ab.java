package org.bouncycastle.a.aa;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends org.bouncycastle.a.o implements org.bouncycastle.a.e {
    private org.bouncycastle.a.u a;

    public ab(ad adVar) {
        this.a = null;
        this.a = adVar.i();
    }

    public ab(org.bouncycastle.a.n nVar) {
        this.a = null;
        this.a = nVar;
    }

    public ab(org.bouncycastle.a.p pVar) {
        this.a = null;
        this.a = pVar;
    }

    private ab(org.bouncycastle.a.u uVar) {
        this.a = null;
        this.a = uVar;
    }

    public static ab a(Object obj) {
        if (obj == null || (obj instanceof ab)) {
            return (ab) obj;
        }
        if (obj instanceof org.bouncycastle.a.u) {
            return new ab((org.bouncycastle.a.u) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new ab(org.bouncycastle.a.u.b((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
        }
    }

    public final boolean a() {
        return this.a instanceof org.bouncycastle.a.p;
    }

    public final boolean b() {
        return this.a instanceof org.bouncycastle.a.n;
    }

    public final org.bouncycastle.a.u c() {
        return this.a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }
}
