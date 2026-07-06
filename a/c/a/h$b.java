package a.c.a;

import a.c.l$a;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$b extends a.c.g {
    public int h;
    public l$a i;
    public h$g j;
    public h$f k;
    public h$i l;
    public short m = 1;
    public int n;

    @Override // a.c.g
    public final int b() {
        return 15;
    }

    public h$b(l$a l_a, h$g h_g, h$f h_f, h$i h_i, int i) {
        this.i = l_a;
        this.j = h_g;
        this.k = h_f;
        this.l = h_i;
        this.n = i;
    }

    @Override // a.c.g
    public final void a(a.c.b.a aVar) {
        this.i.e(aVar);
        this.j.e(aVar);
        this.l.e(aVar);
        aVar.f(this.m);
        aVar.g(this.n);
    }

    @Override // a.c.g
    public final void b(a.c.b.a aVar) {
        if (aVar.d() != 0) {
            if (this.k == null) {
                this.k = new h$f();
            }
            this.k.f(aVar);
        }
        this.l.f(aVar);
        this.n = aVar.d();
        this.h = aVar.d();
    }
}
