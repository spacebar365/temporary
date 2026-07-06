package a.c;

/* JADX INFO: compiled from: rpc.java */
/* JADX INFO: loaded from: classes.dex */
public class l$a extends a.c.b.d {
    public int a;
    public l$d b;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.a);
        if (this.b == null) {
            throw new a.c.b.b("ref pointer cannot be null");
        }
        aVar.g(this.b.b);
        aVar.f(this.b.c);
        aVar.f(this.b.d);
        aVar.e(this.b.e);
        aVar.e(this.b.f);
        int i = aVar.c;
        aVar.c(6);
        a.c.b.a aVarA = aVar.a(i);
        for (int i2 = 0; i2 < 6; i2++) {
            aVarA.e(this.b.g[i2]);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        this.a = aVar.d();
        aVar.d(4);
        if (this.b == null) {
            this.b = new l$d();
        }
        this.b.b = aVar.d();
        this.b.c = (short) aVar.c();
        this.b.d = (short) aVar.c();
        this.b.e = (byte) aVar.b();
        this.b.f = (byte) aVar.b();
        int i = aVar.c;
        aVar.c(6);
        if (this.b.g == null) {
            this.b.g = new byte[6];
        }
        a.c.b.a aVarA = aVar.a(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.b.g[i2] = (byte) aVarA.b();
        }
    }
}
