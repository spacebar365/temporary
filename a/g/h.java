package a.g;

/* JADX INFO: compiled from: DirFileEntryEnumIteratorBase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements a.f<j> {
    private static final org.c.b a = org.c.c.a((Class<?>) h.class);
    private final ay b;
    private final a.aa d;
    private final String e;
    private j g;
    private int h;
    private boolean i = false;
    private final a.t c = null;
    private final int f = 22;

    protected abstract j a();

    protected abstract j[] b();

    protected abstract boolean c();

    protected abstract boolean d();

    protected abstract void e();

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return k();
    }

    public h(ay ayVar, a.aa aaVar, String str) throws Exception {
        this.d = aaVar;
        this.e = str;
        this.b = ayVar.h();
        try {
            this.g = a();
            if (this.g == null) {
                j();
            }
        } catch (Exception e) {
            j();
            throw e;
        }
    }

    public final ay f() {
        return this.b;
    }

    public final int g() {
        return this.f;
    }

    public final String h() {
        return this.e;
    }

    public final a.aa i() {
        return this.d;
    }

    private final boolean a(j jVar) {
        int iHashCode;
        String strA = jVar.a();
        if (strA.length() < 3 && (((iHashCode = strA.hashCode()) == ae.a || iHashCode == ae.b) && (strA.equals(".") || strA.equals("..")))) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        try {
            return this.c.a();
        } catch (a.d e) {
            a.e("Failed to apply name filter", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final a.g.j a(boolean r5) {
        /*
            r4 = this;
            r1 = 0
        L1:
            a.g.j[] r2 = r4.b()
        L5:
            int r0 = r4.h
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            int r0 = r4.h
            r0 = r2[r0]
            int r3 = r4.h
            int r3 = r3 + 1
            r4.h = r3
            boolean r3 = r4.a(r0)
            if (r3 == 0) goto L5
        L1a:
            return r0
        L1b:
            if (r5 != 0) goto L33
            boolean r0 = r4.d()
            if (r0 != 0) goto L33
            boolean r0 = r4.c()
            if (r0 != 0) goto L2e
            r4.j()
            r0 = r1
            goto L1a
        L2e:
            r0 = 0
            r4.h = r0
            r5 = 1
            goto L1
        L33:
            r0 = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.h.a(boolean):a.g.j");
    }

    protected final synchronized void j() {
        if (!this.i) {
            this.i = true;
            try {
                e();
            } finally {
                this.g = null;
                this.b.i();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.g != null;
    }

    private j k() {
        j jVar = this.g;
        try {
            j jVarA = a(false);
            if (jVarA == null) {
                j();
            } else {
                this.g = jVarA;
            }
        } catch (a.d e) {
            a.d("Enumeration failed", e);
            this.g = null;
            try {
                j();
            } catch (a.d e2) {
                a.b("Failed to close enum", e);
            }
        }
        return jVar;
    }

    @Override // a.f, java.lang.AutoCloseable
    public void close() {
        if (this.g != null) {
            j();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
