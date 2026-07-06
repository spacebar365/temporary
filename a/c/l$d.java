package a.c;

/* JADX INFO: compiled from: rpc.java */
/* JADX INFO: loaded from: classes.dex */
public class l$d extends a.c.b.d {
    public int b;
    public short c;
    public short d;
    public byte e;
    public byte f;
    public byte[] g;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.b);
        aVar.f(this.c);
        aVar.f(this.d);
        aVar.e(this.e);
        aVar.e(this.f);
        int i = aVar.c;
        aVar.c(6);
        a.c.b.a aVarA = aVar.a(i);
        for (int i2 = 0; i2 < 6; i2++) {
            aVarA.e(this.g[i2]);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        this.b = aVar.d();
        this.c = (short) aVar.c();
        this.d = (short) aVar.c();
        this.e = (byte) aVar.b();
        this.f = (byte) aVar.b();
        int i = aVar.c;
        aVar.c(6);
        if (this.g == null) {
            this.g = new byte[6];
        }
        a.c.b.a aVarA = aVar.a(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.g[i2] = (byte) aVarA.b();
        }
    }
}
