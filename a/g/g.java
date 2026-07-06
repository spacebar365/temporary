package a.g;

/* JADX INFO: compiled from: DirFileEntryEnumIterator2.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends h {
    private static final org.c.b a = org.c.c.a((Class<?>) g.class);
    private byte[] b;
    private a.d.e.b.b c;

    public g(ay ayVar, a.aa aaVar, String str) {
        super(ayVar, aaVar, str);
    }

    @Override // a.g.h
    protected final j[] b() {
        j[] jVarArrE = this.c.e();
        if (jVarArrE == null) {
            return new j[0];
        }
        return jVarArrE;
    }

    @Override // a.g.h
    protected final j a() throws ad {
        ay ayVarF = f();
        a.d.e.a.e eVar = new a.d.e.a.e(ayVarF.a(), i().a().b());
        eVar.n(1);
        a.d.e.b.a aVar = new a.d.e.b.a(ayVarF.a());
        aVar.a(h());
        eVar.a((a.d.e.b) aVar);
        try {
            this.b = ((a.d.e.a.f) ayVarF.a(eVar, new u[0])).h();
            this.c = aVar.L();
            j jVarA = a(false);
            if (jVarA == null) {
                j();
                return jVarA;
            }
            return jVarA;
        } catch (ad e) {
            a.d.e.a.f fVar = (a.d.e.a.f) eVar.L();
            if (fVar != null && fVar.D() && fVar.A() == 0) {
                try {
                    ayVarF.a(new a.d.e.a.c(ayVarF.a(), fVar.h()), new u[0]);
                } catch (ad e2) {
                    e.addSuppressed(e2);
                }
            }
            a.d.e.b.b bVarL = aVar.L();
            if (bVarL != null && bVarL.D() && bVarL.A() == -1073741809) {
                j();
                return null;
            }
            throw e;
        }
    }

    @Override // a.g.h
    protected final boolean c() throws ad {
        j[] jVarArrE = this.c.e();
        ay ayVarF = f();
        a.d.e.b.a aVar = new a.d.e.b.a(ayVarF.a(), this.b);
        aVar.a(h());
        aVar.k(jVarArrE[jVarArrE.length - 1].c());
        aVar.k();
        try {
            a.d.e.b.b bVar = (a.d.e.b.b) ayVarF.a(aVar, new u[0]);
            if (bVar.A() == -2147483642) {
                return false;
            }
            this.c = bVar;
            return true;
        } catch (ad e) {
            if (e.b() == -2147483642) {
                a.b("End of listing", e);
                return false;
            }
            throw e;
        }
    }

    @Override // a.g.h
    protected final boolean d() {
        return false;
    }

    @Override // a.g.h
    protected final void e() {
        try {
            ay ayVarF = f();
            if (this.b != null && ayVarF.f()) {
                ayVarF.a(new a.d.e.a.c(ayVarF.a(), this.b), new u[0]);
            }
        } finally {
            this.b = null;
        }
    }
}
