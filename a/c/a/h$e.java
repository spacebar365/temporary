package a.c.a;

/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public class h$e extends a.c.b.d {
    public int a;
    public short b;
    public byte c;
    public byte d;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        aVar.g(this.a);
        aVar.f(this.b);
        aVar.e(this.c);
        aVar.e(this.d);
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) {
        aVar.d(4);
        this.a = aVar.d();
        this.b = (short) aVar.c();
        this.c = (byte) aVar.b();
        this.d = (byte) aVar.b();
    }
}
