package a.c.a;

/* JADX INFO: compiled from: srvsvc.java */
/* JADX INFO: loaded from: classes.dex */
public class j$a extends a.c.g {
    public int h;
    public String i;
    public a.c.b.d k;
    public int j = 1;
    public int l = -1;
    public int m = 0;
    public int n = 0;

    @Override // a.c.g
    public final int b() {
        return 15;
    }

    public j$a(String str, a.c.b.d dVar) {
        this.i = str;
        this.k = dVar;
    }

    @Override // a.c.g
    public final void a(a.c.b.a aVar) {
        aVar.a((Object) this.i);
        if (this.i != null) {
            aVar.a(this.i);
        }
        aVar.g(this.j);
        aVar.g(this.j);
        aVar.a(this.k);
        if (this.k != null) {
            aVar = aVar.e;
            this.k.e(aVar);
        }
        aVar.g(this.l);
        aVar.g(this.n);
    }

    @Override // a.c.g
    public final void b(a.c.b.a aVar) {
        this.j = aVar.d();
        aVar.d();
        if (aVar.d() != 0) {
            if (this.k == null) {
                this.k = new j$d();
            }
            aVar = aVar.e;
            this.k.f(aVar);
        }
        this.m = aVar.d();
        this.n = aVar.d();
        this.h = aVar.d();
    }
}
