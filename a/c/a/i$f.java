package a.c.a;

/* JADX INFO: compiled from: netdfs.java */
/* JADX INFO: loaded from: classes.dex */
public class i$f extends a.c.g {
    public int h;
    public String i;
    public int j = 200;
    public int k = 65535;
    public i$c l;
    public a.c.b.c m;

    @Override // a.c.g
    public final int b() {
        return 21;
    }

    public i$f(String str, i$c i_c, a.c.b.c cVar) {
        this.i = str;
        this.l = i_c;
        this.m = cVar;
    }

    @Override // a.c.g
    public final void a(a.c.b.a aVar) {
        aVar.a(this.i);
        aVar.g(this.j);
        aVar.g(this.k);
        aVar.a(this.l);
        if (this.l != null) {
            this.l.e(aVar);
        }
        aVar.a(this.m);
        if (this.m != null) {
            this.m.e(aVar);
        }
    }

    @Override // a.c.g
    public final void b(a.c.b.a aVar) {
        if (aVar.d() != 0) {
            if (this.l == null) {
                this.l = new i$c();
            }
            this.l.f(aVar);
        }
        if (aVar.d() != 0) {
            this.m.f(aVar);
        }
        this.h = aVar.d();
    }
}
