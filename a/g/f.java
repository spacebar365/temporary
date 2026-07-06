package a.g;

/* JADX INFO: compiled from: DirFileEntryEnumIterator1.java */
/* JADX INFO: loaded from: classes.dex */
class f extends h {
    private static final org.c.b a = org.c.c.a((Class<?>) f.class);
    private a.d.d.d.c b;
    private a.d.d.d.b c;

    public f(ay ayVar, a.aa aaVar, String str) {
        super(ayVar, aaVar, str);
    }

    @Override // a.g.h
    protected final j a() throws ad {
        a.ab abVarA = i().a();
        String strB = abVarA.b();
        if (abVarA.f().getPath().lastIndexOf(47) != r1.length() - 1) {
            throw new ad(abVarA.f() + " directory must end with '/'");
        }
        if (strB.lastIndexOf(92) != strB.length() - 1) {
            throw new ad(strB + " UNC must end with '\\'");
        }
        ay ayVarF = f();
        this.c = new a.d.d.d.b(ayVarF.a());
        try {
            ayVarF.a(new a.d.d.d.a(ayVarF.a(), strB, h(), g(), ayVarF.a().ah(), ayVarF.a().ai()), this.c, new u[0]);
            this.b = new a.d.d.d.c(ayVarF.a(), this.c.q(), this.c.ae(), this.c.ad(), ayVarF.a().ah(), ayVarF.a().ai());
            this.c.b((byte) 2);
            j jVarA = a(false);
            if (jVarA == null) {
                j();
                return jVarA;
            }
            return jVarA;
        } catch (ad e) {
            if (this.c != null && this.c.D() && e.b() == -1073741809) {
                j();
                return null;
            }
            throw e;
        }
    }

    @Override // a.g.h
    protected final j[] b() {
        return this.c.ab();
    }

    @Override // a.g.h
    protected final boolean c() throws ad {
        this.b.a(this.c.ae(), this.c.ad());
        this.c.e_();
        try {
            f().a(this.b, this.c, new u[0]);
            return this.c.Z() != -2147483642;
        } catch (ad e) {
            if (e.b() == -2147483642) {
                a.b("No more entries", e);
                return false;
            }
            throw e;
        }
    }

    @Override // a.g.h
    protected final boolean d() {
        return this.c.ac();
    }

    @Override // a.g.h
    protected final void e() {
        try {
            ay ayVarF = f();
            if (this.c != null) {
                ayVarF.a(new a.d.d.a.e(ayVarF.a(), this.c.q()), new a.d.d.a.c(ayVarF.a()), new u[0]);
            }
        } catch (ad e) {
            a.b("SmbComFindClose2 failed", e);
        }
    }
}
