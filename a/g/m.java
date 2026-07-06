package a.g;

/* JADX INFO: compiled from: NetServerEnumIterator.java */
/* JADX INFO: loaded from: classes.dex */
public class m implements a.f<j> {
    private static final org.c.b a = org.c.c.a((Class<?>) m.class);
    private final a.d.d.b.a b;
    private final a.d.d.b.b c;
    private final a.aa d;
    private final ay e;
    private final a.t f = null;
    private final boolean g;
    private int h;
    private j i;

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return d();
    }

    public m(ae aeVar, ay ayVar) throws Exception {
        this.d = aeVar;
        a.ab abVarA = aeVar.a();
        this.g = abVarA.i() == 2;
        if (abVarA.f().getHost().isEmpty()) {
            this.b = new a.d.d.b.a(ayVar.a(), ayVar.k(), Integer.MIN_VALUE);
            this.c = new a.d.d.b.b(ayVar.a());
        } else if (this.g) {
            this.b = new a.d.d.b.a(ayVar.a(), abVarA.f().getHost(), -1);
            this.c = new a.d.d.b.b(ayVar.a());
        } else {
            throw new ad("The requested list operations is invalid: " + abVarA.f());
        }
        this.e = ayVar.h();
        try {
            this.e.a(this.b, this.c, new u[0]);
            a();
            j jVarB = b();
            if (jVarB == null) {
                e();
            }
            this.i = jVarB;
        } catch (Exception e) {
            this.e.i();
            throw e;
        }
    }

    private void a() throws ad {
        int iZ = this.c.Z();
        if (iZ == 2184) {
            throw new bc();
        }
        if (iZ != 0 && iZ != 234) {
            throw new ad(iZ, true);
        }
    }

    private j b() throws ad {
        while (true) {
            int iAa = this.c.Z() == 234 ? this.c.aa() - 1 : this.c.aa();
            while (this.h < iAa) {
                j jVar = this.c.ab()[this.h];
                this.h++;
                if (c()) {
                    return jVar;
                }
            }
            if (!this.g || this.c.Z() != 234) {
                break;
            }
            this.b.a(0, this.c.q());
            this.c.e_();
            this.b.Y();
            this.e.a(this.b, this.c, new u[0]);
            a();
            this.h = 0;
        }
        return null;
    }

    private final boolean c() {
        if (this.f == null) {
            return true;
        }
        try {
            return this.f.a();
        } catch (a.d e) {
            a.e("Failed to apply name filter", e);
            return false;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.i != null;
    }

    private j d() {
        j jVar = this.i;
        try {
            j jVarB = b();
            if (jVarB == null) {
                e();
            } else {
                this.i = jVarB;
            }
        } catch (a.d e) {
            a.d("Enumeration failed", e);
            this.i = null;
        }
        return jVar;
    }

    @Override // a.f, java.lang.AutoCloseable
    public void close() {
        if (this.i != null) {
            e();
        }
    }

    private void e() {
        this.e.i();
        this.i = null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
