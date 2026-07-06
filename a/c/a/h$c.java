package a.c.a;

import a.c.l$c;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$c extends a.c.b.d {
    public int a;
    public a.c.b.e b;
    public l$c c;
    public int d;
    public int e;
    public h$e f;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.a);
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.g(this.d);
        aVar.g(this.e);
        aVar.a(this.f);
        if (this.b != null) {
            aVar = aVar.e;
            this.b.e(aVar);
        }
        if (this.c != null) {
            aVar = aVar.e;
            this.c.e(aVar);
        }
        if (this.f != null) {
            this.f.e(aVar.e);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        a.c.b.a aVar2;
        aVar.d(4);
        this.a = aVar.d();
        int iD = aVar.d();
        int iD2 = aVar.d();
        this.d = aVar.d();
        this.e = aVar.d();
        int iD3 = aVar.d();
        if (iD != 0) {
            aVar2 = aVar.e;
            this.b.f(aVar2);
        } else {
            aVar2 = aVar;
        }
        if (iD2 != 0) {
            if (this.c == null) {
                this.c = new l$c();
            }
            aVar2 = aVar2.e;
            this.c.f(aVar2);
        }
        if (iD3 != 0) {
            if (this.f == null) {
                this.f = new h$e();
            }
            this.f.f(aVar2.e);
        }
    }
}
