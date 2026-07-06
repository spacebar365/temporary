package a.c.a;

import a.c.l$b;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$h extends a.c.b.d {
    public l$b a;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.a(this.a);
        if (this.a != null) {
            this.a.e(aVar.e);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        if (aVar.d() != 0) {
            if (this.a == null) {
                this.a = new l$b();
            }
            this.a.f(aVar.e);
        }
    }
}
