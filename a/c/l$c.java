package a.c;

/* JADX INFO: compiled from: rpc.java */
/* JADX INFO: loaded from: classes.dex */
public class l$c extends a.c.b.d {
    public short b;
    public short c;
    public short[] d;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.f(this.b);
        aVar.f(this.c);
        aVar.a(this.d);
        if (this.d != null) {
            a.c.b.a aVar2 = aVar.e;
            int i = this.b / 2;
            aVar2.g(this.c / 2);
            aVar2.g(0);
            aVar2.g(i);
            int i2 = aVar2.c;
            aVar2.c(i * 2);
            a.c.b.a aVarA = aVar2.a(i2);
            for (int i3 = 0; i3 < i; i3++) {
                aVarA.f(this.d[i3]);
            }
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        this.b = (short) aVar.c();
        this.c = (short) aVar.c();
        if (aVar.d() != 0) {
            a.c.b.a aVar2 = aVar.e;
            int iD = aVar2.d();
            aVar2.d();
            int iD2 = aVar2.d();
            int i = aVar2.c;
            aVar2.c(iD2 * 2);
            if (this.d == null) {
                if (iD < 0 || iD > 65535) {
                    throw new a.c.b.b("invalid array conformance");
                }
                this.d = new short[iD];
            }
            a.c.b.a aVarA = aVar2.a(i);
            for (int i2 = 0; i2 < iD2; i2++) {
                this.d[i2] = (short) aVarA.c();
            }
        }
    }
}
