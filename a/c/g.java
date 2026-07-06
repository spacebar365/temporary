package a.c;

/* JADX INFO: compiled from: DcerpcMessage.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a.c.b.d implements c {
    protected int b = -1;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;

    public abstract void a(a.c.b.a aVar);

    public abstract int b();

    public abstract void b(a.c.b.a aVar);

    public final boolean c() {
        return (this.c & 2) == 2;
    }

    public e a() {
        if (this.g != 0) {
            return new e(this.g);
        }
        return null;
    }

    final void c(a.c.b.a aVar) {
        aVar.e(5);
        aVar.e(0);
        aVar.e(this.b);
        aVar.e(this.c);
        aVar.g(16);
        aVar.f(this.d);
        aVar.f(0);
        aVar.g(this.e);
    }

    final void d(a.c.b.a aVar) throws a.c.b.b {
        if (aVar.b() != 5 || aVar.b() != 0) {
            throw new a.c.b.b("DCERPC version not supported");
        }
        this.b = aVar.b();
        this.c = aVar.b();
        if (aVar.d() != 16) {
            throw new a.c.b.b("Data representation not supported");
        }
        this.d = aVar.c();
        if (aVar.c() != 0) {
            throw new a.c.b.b("DCERPC authentication not supported");
        }
        this.e = aVar.d();
    }

    @Override // a.c.b.d
    public final void f(a.c.b.a aVar) throws a.c.b.b {
        d(aVar);
        if (this.b != 12 && this.b != 2 && this.b != 3 && this.b != 13) {
            throw new a.c.b.b("Unexpected ptype: " + this.b);
        }
        if (this.b == 2 || this.b == 3) {
            this.f = aVar.d();
            aVar.c();
            aVar.c();
        }
        if (this.b == 3 || this.b == 13) {
            this.g = aVar.d();
        } else {
            b(aVar);
        }
    }

    @Override // a.c.b.d
    public final void e(a.c.b.a aVar) {
        int i;
        int i2 = aVar.c;
        aVar.c(16);
        if (this.b == 0) {
            i = aVar.c;
            aVar.g(0);
            aVar.f(0);
            aVar.f(b());
        } else {
            i = 0;
        }
        a(aVar);
        this.d = aVar.c - i2;
        if (this.b == 0) {
            aVar.c = i;
            this.f = this.d - i;
            aVar.g(this.f);
        }
        aVar.c = i2;
        c(aVar);
        aVar.c = this.d + i2;
    }
}
