package a.c.a;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$f extends a.c.b.d {
    public int a;
    public h$k[] b;
    public int c;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.a);
        aVar.a(this.b);
        aVar.g(this.c);
        if (this.b != null) {
            a.c.b.a aVar2 = aVar.e;
            int i = this.a;
            aVar2.g(i);
            int i2 = aVar2.c;
            aVar2.c(i * 12);
            a.c.b.a aVarA = aVar2.a(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.b[i3].e(aVarA);
            }
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        this.a = aVar.d();
        int iD = aVar.d();
        this.c = aVar.d();
        if (iD != 0) {
            a.c.b.a aVar2 = aVar.e;
            int iD2 = aVar2.d();
            int i = aVar2.c;
            aVar2.c(iD2 * 12);
            if (this.b == null) {
                if (iD2 < 0 || iD2 > 65535) {
                    throw new a.c.b.b("invalid array conformance");
                }
                this.b = new h$k[iD2];
            }
            a.c.b.a aVarA = aVar2.a(i);
            for (int i2 = 0; i2 < iD2; i2++) {
                if (this.b[i2] == null) {
                    this.b[i2] = new h$k();
                }
                this.b[i2].f(aVarA);
            }
        }
    }
}
