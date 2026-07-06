package a.d.e;

import a.d.e.d;
import a.h;

/* JADX INFO: compiled from: ServerMessageBlock2Request.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<T extends d> extends b implements a.d.c, a.d.e<T> {
    private T a;
    private Integer b;

    protected abstract T c(a.c cVar);

    @Override // a.d.e
    public final /* synthetic */ a.d.d a(a.c cVar) {
        return b(cVar);
    }

    public c(h hVar, int i) {
        super(hVar, i);
    }

    @Override // a.i.a.c
    public final boolean I() {
        return false;
    }

    @Override // a.d.c
    public final boolean a_() {
        return u() != 0;
    }

    @Override // a.d.c
    public final boolean a(a.d.c cVar) {
        return q().b(getClass().getSimpleName()) && q().b(cVar.getClass().getSimpleName());
    }

    @Override // a.i.a.c
    public final void d(int i) {
        g(i);
    }

    @Override // a.d.c
    public final Integer i() {
        return this.b;
    }

    public final T b(a.c cVar) {
        T t = (T) c(cVar);
        t.a(y());
        a((a.d.d) t);
        c cVar2 = (c) super.K();
        if (cVar2 instanceof c) {
            t.b(cVar2.b(cVar));
        }
        return t;
    }

    @Override // a.d.c
    public final void a_(int i) {
        f(i);
    }

    @Override // a.d.e.b, a.d.b
    public final int b(byte[] bArr, int i) {
        int iB = super.b(bArr, i);
        int iL_ = l_();
        int iQ = Q();
        if (iL_ != iQ) {
            throw new IllegalStateException(String.format("Wrong size calculation have %d expect %d", Integer.valueOf(iL_), Integer.valueOf(iQ)));
        }
        return iB;
    }

    @Override // a.d.e.b
    public final T L() {
        return this.a;
    }

    @Override // a.d.e.b, a.d.b
    public final void a(a.d.d dVar) {
        if (dVar != null && !(dVar instanceof b)) {
            throw new IllegalArgumentException("Incompatible response");
        }
        this.a = (T) dVar;
    }

    @Override // a.d.c
    public final a.d.c n_() {
        c cVar = (c) super.K();
        if (cVar != null) {
            super.b((b) null);
            cVar.H();
        }
        return cVar;
    }

    @Override // a.d.e.b
    public final /* bridge */ /* synthetic */ b K() {
        return (c) super.K();
    }

    @Override // a.d.e.b, a.d.b
    public final /* bridge */ /* synthetic */ a.d.d f_() {
        return this.a;
    }

    @Override // a.d.c
    public final /* synthetic */ a.d.c f() {
        return (c) super.K();
    }

    @Override // a.i.a.c
    public final /* bridge */ /* synthetic */ a.i.a.e V() {
        return this.a;
    }

    @Override // a.i.a.c
    public final /* synthetic */ a.i.a.c s() {
        return (c) super.K();
    }
}
