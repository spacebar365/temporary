package a.c.a;

/* JADX INFO: compiled from: srvsvc.java */
/* JADX INFO: loaded from: classes.dex */
public class j$c extends a.c.b.d {
    public String a;
    public int b;
    public String c;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.a((Object) this.a);
        aVar.g(this.b);
        aVar.a((Object) this.c);
        if (this.a != null) {
            aVar = aVar.e;
            aVar.a(this.a);
        }
        if (this.c != null) {
            aVar.e.a(this.c);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        int iD = aVar.d();
        this.b = aVar.d();
        int iD2 = aVar.d();
        if (iD != 0) {
            aVar = aVar.e;
            this.a = aVar.e();
        }
        if (iD2 != 0) {
            this.c = aVar.e.e();
        }
    }
}
