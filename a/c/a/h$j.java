package a.c.a;

import a.c.l$c;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$j extends a.c.b.d {
    public short a;
    public l$c b;
    public int c;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.f(this.a);
        aVar.f(this.b.b);
        aVar.f(this.b.c);
        aVar.a(this.b.d);
        aVar.g(this.c);
        if (this.b.d != null) {
            a.c.b.a aVar2 = aVar.e;
            int i = this.b.b / 2;
            aVar2.g(this.b.c / 2);
            aVar2.g(0);
            aVar2.g(i);
            int i2 = aVar2.c;
            aVar2.c(i * 2);
            a.c.b.a aVarA = aVar2.a(i2);
            for (int i3 = 0; i3 < i; i3++) {
                aVarA.f(this.b.d[i3]);
            }
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) throws a.c.b.b {
        aVar.d(4);
        this.a = (short) aVar.c();
        aVar.d(4);
        if (this.b == null) {
            this.b = new l$c();
        }
        this.b.b = (short) aVar.c();
        this.b.c = (short) aVar.c();
        int iD = aVar.d();
        this.c = aVar.d();
        if (iD != 0) {
            a.c.b.a aVar2 = aVar.e;
            int iD2 = aVar2.d();
            aVar2.d();
            int iD3 = aVar2.d();
            int i = aVar2.c;
            aVar2.c(iD3 * 2);
            if (this.b.d == null) {
                if (iD2 < 0 || iD2 > 65535) {
                    throw new a.c.b.b("invalid array conformance");
                }
                this.b.d = new short[iD2];
            }
            a.c.b.a aVarA = aVar2.a(i);
            for (int i2 = 0; i2 < iD3; i2++) {
                this.b.d[i2] = (short) aVarA.c();
            }
        }
    }
}
