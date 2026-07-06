package a.c;

/* JADX INFO: compiled from: DcerpcBind.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    private static final String[] h = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};
    private b i;
    private int j;
    private int k;

    @Override // a.c.g
    public final e a() {
        if (this.g != 0) {
            int i = this.g;
            return new e(i < 4 ? h[i] : "0x" + a.i.e.a(i, 4));
        }
        return null;
    }

    public a() {
    }

    a(b bVar, f fVar) {
        this.i = bVar;
        this.j = fVar.c();
        this.k = fVar.b();
        this.b = 11;
        this.c = 3;
    }

    @Override // a.c.g
    public final int b() {
        return 0;
    }

    @Override // a.c.g
    public final void a(a.c.b.a aVar) {
        aVar.f(this.j);
        aVar.f(this.k);
        aVar.g(0);
        aVar.e(1);
        aVar.e(0);
        aVar.f(0);
        aVar.f(0);
        aVar.e(1);
        aVar.e(0);
        this.i.c().e(aVar);
        aVar.f(this.i.d());
        aVar.f(this.i.e());
        a.e(aVar);
        aVar.g(2);
    }

    @Override // a.c.g
    public final void b(a.c.b.a aVar) {
        aVar.c();
        aVar.c();
        aVar.d();
        aVar.c(aVar.c());
        aVar.d(4);
        aVar.b();
        aVar.d(4);
        this.g = aVar.c();
        aVar.c();
        aVar.c(20);
    }
}
