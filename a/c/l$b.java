package a.c;

/* JADX INFO: compiled from: rpc.java */
/* JADX INFO: loaded from: classes.dex */
public class l$b extends a.c.b.d {
    public byte a;
    public byte b;
    public byte[] c;
    public int[] d;

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        aVar.d(4);
        byte b = this.b;
        aVar.g(b);
        aVar.e(this.a);
        aVar.e(this.b);
        int i = aVar.c;
        aVar.c(6);
        int i2 = aVar.c;
        aVar.c(b * 4);
        a.c.b.a aVarA = aVar.a(i);
        for (int i3 = 0; i3 < 6; i3++) {
            aVarA.e(this.c[i3]);
        }
        a.c.b.a aVarA2 = aVarA.a(i2);
        for (int i4 = 0; i4 < b; i4++) {
            aVarA2.g(this.d[i4]);
        }
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) throws a.c.b.b {
        aVar.d(4);
        int iD = aVar.d();
        this.a = (byte) aVar.b();
        this.b = (byte) aVar.b();
        int i = aVar.c;
        aVar.c(6);
        int i2 = aVar.c;
        aVar.c(iD * 4);
        if (this.c == null) {
            this.c = new byte[6];
        }
        a.c.b.a aVarA = aVar.a(i);
        for (int i3 = 0; i3 < 6; i3++) {
            this.c[i3] = (byte) aVarA.b();
        }
        if (this.d == null) {
            if (iD < 0 || iD > 65535) {
                throw new a.c.b.b("invalid array conformance");
            }
            this.d = new int[iD];
        }
        a.c.b.a aVarA2 = aVarA.a(i2);
        for (int i4 = 0; i4 < iD; i4++) {
            this.d[i4] = aVarA2.d();
        }
    }
}
