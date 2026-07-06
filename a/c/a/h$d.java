package a.c.a;

import a.c.l$a;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$d extends a.c.g {
    public int h;
    public String i;
    public h$c j;
    public int k = 2048;
    public l$a l;

    @Override // a.c.g
    public final int b() {
        return 44;
    }

    public h$d(String str, h$c h_c, l$a l_a) {
        this.i = str;
        this.j = h_c;
        this.l = l_a;
    }

    @Override // a.c.g
    public final void a(a.c.b.a aVar) {
        aVar.a((Object) this.i);
        if (this.i != null) {
            aVar.a(this.i);
        }
        this.j.e(aVar);
        aVar.g(this.k);
    }

    @Override // a.c.g
    public final void b(a.c.b.a aVar) {
        this.l.f(aVar);
        this.h = aVar.d();
    }
}
