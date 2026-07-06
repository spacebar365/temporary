package a.c.a;

import a.c.l$b;
import a.c.l$c;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$k extends a.c.b.d {
    public l$c a;
    public l$b b;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.f(this.a.b);
        aVar.f(this.a.c);
        aVar.a(this.a.d);
        aVar.a(this.b);
        if (this.a.d != null) {
            a.c.b.a aVar2 = aVar.e;
            int i = this.a.b / 2;
            aVar2.g(this.a.c / 2);
            aVar2.g(0);
            aVar2.g(i);
            int i2 = aVar2.c;
            aVar2.c(i * 2);
            aVar = aVar2.a(i2);
            for (int i3 = 0; i3 < i; i3++) {
                aVar.f(this.a.d[i3]);
            }
        }
        if (this.b != null) {
            this.b.e(aVar.e);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) throws a.c.b.b {
        aVar.d(4);
        aVar.d(4);
        if (this.a == null) {
            this.a = new l$c();
        }
        this.a.b = (short) aVar.c();
        this.a.c = (short) aVar.c();
        int iD = aVar.d();
        int iD2 = aVar.d();
        if (iD != 0) {
            a.c.b.a aVar2 = aVar.e;
            int iD3 = aVar2.d();
            aVar2.d();
            int iD4 = aVar2.d();
            int i = aVar2.c;
            aVar2.c(iD4 * 2);
            if (this.a.d == null) {
                if (iD3 < 0 || iD3 > 65535) {
                    throw new a.c.b.b("invalid array conformance");
                }
                this.a.d = new short[iD3];
            }
            aVar = aVar2.a(i);
            for (int i2 = 0; i2 < iD4; i2++) {
                this.a.d[i2] = (short) aVar.c();
            }
        }
        if (iD2 != 0) {
            if (this.b == null) {
                this.b = new l$b();
            }
            this.b.f(aVar.e);
        }
    }
}
