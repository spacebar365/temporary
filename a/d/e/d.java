package a.d.e;

import a.h;

/* JADX INFO: compiled from: ServerMessageBlock2Response.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends b implements a.d.d {
    private boolean a;
    private boolean b;
    private Long c;
    private boolean d;
    private Exception e;
    private boolean f;

    public d(h hVar) {
        super(hVar);
    }

    @Override // a.d.d
    public final a.d.d k() {
        return (a.d.d) K();
    }

    @Override // a.d.e.b, a.d.b, a.i.a.e
    public final void e_() {
        super.e_();
        this.a = false;
    }

    @Override // a.i.a.e
    public final void F() {
        if (m_() && A() == 259) {
            synchronized (this) {
                notifyAll();
            }
        } else {
            this.a = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override // a.i.a.e
    public final void a(Exception exc) {
        this.b = true;
        this.e = exc;
        this.a = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // a.i.a.e
    public final void G() {
        this.b = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // a.i.a.e
    public final void E() {
        this.a = false;
    }

    @Override // a.i.a.e
    public final boolean D() {
        return this.a;
    }

    @Override // a.i.a.e
    public final boolean P() {
        return this.b;
    }

    public final boolean n() {
        return (C() & 8) != 0;
    }

    @Override // a.i.a.e
    public final Long S() {
        return this.c;
    }

    @Override // a.i.a.e
    public final void a(Long l) {
        this.c = l;
    }

    public final boolean o() {
        return this.f;
    }

    public final void p() {
        this.f = true;
    }

    @Override // a.i.a.e
    public final Exception O() {
        return this.e;
    }

    @Override // a.i.a.e
    public final int z() {
        return A();
    }

    @Override // a.i.a.e
    public final boolean N() {
        return this.d;
    }

    @Override // a.i.a.e
    public final int t() {
        return v();
    }

    @Override // a.d.e.b
    protected final void a(byte[] bArr, int i, int i2) throws a.d.g {
        if (w()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            b(bArr2);
        }
        if (!b(bArr, i, i2)) {
            throw new a.d.g("Signature verification failed for " + getClass().getName());
        }
        this.f = false;
        F();
    }

    public final boolean b(byte[] bArr, int i, int i2) {
        f fVarY = y();
        if (fVarY == null || m_()) {
            return true;
        }
        if (!q().i() && A() != 0) {
            return true;
        }
        boolean zB = fVarY.b(bArr, i, i2);
        this.d = zB;
        return !zB;
    }

    public void b(a.d.c cVar) {
        a.d.d dVar = (a.d.d) K();
        if (dVar != null) {
            dVar.b(cVar);
        }
    }
}
