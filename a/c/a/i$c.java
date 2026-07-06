package a.c.a;

/* JADX INFO: compiled from: netdfs.java */
/* JADX INFO: loaded from: classes.dex */
public class i$c extends a.c.b.d {
    public int a;
    public a.c.b.d b;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.a);
        aVar.g(this.a);
        aVar.a(this.b);
        if (this.b != null) {
            this.b.e(aVar.e);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        this.a = aVar.d();
        aVar.d();
        if (aVar.d() != 0) {
            if (this.b == null) {
                this.b = new i$a();
            }
            this.b.f(aVar.e);
        }
    }
}
