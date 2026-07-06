package a.c.a;

/* JADX INFO: compiled from: netdfs.java */
/* JADX INFO: loaded from: classes.dex */
public class i$b extends a.c.b.d {
    public int a;
    public i$e[] b;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.a);
        aVar.a(this.b);
        if (this.b != null) {
            a.c.b.a aVar2 = aVar.e;
            int i = this.a;
            aVar2.g(i);
            int i2 = aVar2.c;
            aVar2.c(i * 4);
            a.c.b.a aVarA = aVar2.a(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.b[i3].e(aVarA);
            }
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) throws a.c.b.b {
        aVar.d(4);
        this.a = aVar.d();
        if (aVar.d() != 0) {
            a.c.b.a aVar2 = aVar.e;
            int iD = aVar2.d();
            int i = aVar2.c;
            aVar2.c(iD * 4);
            if (this.b == null) {
                if (iD < 0 || iD > 65535) {
                    throw new a.c.b.b("invalid array conformance");
                }
                this.b = new i$e[iD];
            }
            a.c.b.a aVarA = aVar2.a(i);
            for (int i2 = 0; i2 < iD; i2++) {
                if (this.b[i2] == null) {
                    this.b[i2] = new i$e();
                }
                this.b[i2].f(aVarA);
            }
        }
    }
}
