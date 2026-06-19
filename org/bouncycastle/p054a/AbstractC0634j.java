package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0634j extends AbstractC0686u {

    /* JADX INFO: renamed from: a */
    protected C0653p f2340a;

    /* JADX INFO: renamed from: b */
    protected C0640m f2341b;

    /* JADX INFO: renamed from: c */
    protected AbstractC0686u f2342c;

    /* JADX INFO: renamed from: d */
    protected int f2343d;

    /* JADX INFO: renamed from: e */
    protected AbstractC0686u f2344e;

    /* JADX INFO: renamed from: a */
    private static AbstractC0686u m1534a(C0625g c0625g, int i) {
        if (c0625g.m1519a() <= i) {
            throw new IllegalArgumentException("too few objects in input vector");
        }
        return c0625g.m1520a(i).mo1358i();
    }

    /* JADX INFO: renamed from: a */
    private void m1535a(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid encoding value: ".concat(String.valueOf(i)));
        }
        this.f2343d = i;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return true;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof AbstractC0634j)) {
            return false;
        }
        if (this == abstractC0686u) {
            return true;
        }
        AbstractC0634j abstractC0634j = (AbstractC0634j) abstractC0686u;
        if (this.f2340a != null && (abstractC0634j.f2340a == null || !abstractC0634j.f2340a.equals(this.f2340a))) {
            return false;
        }
        if (this.f2341b != null && (abstractC0634j.f2341b == null || !abstractC0634j.f2341b.equals(this.f2341b))) {
            return false;
        }
        if (this.f2342c == null || (abstractC0634j.f2342c != null && abstractC0634j.f2342c.equals(this.f2342c))) {
            return this.f2344e.equals(abstractC0634j.f2344e);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0686u m1536b() {
        return this.f2342c;
    }

    /* JADX INFO: renamed from: c */
    public final C0653p m1537c() {
        return this.f2340a;
    }

    /* JADX INFO: renamed from: d */
    public final int m1538d() {
        return this.f2343d;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    int mo1341e() {
        return mo1578k().length;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0686u m1539f() {
        return this.f2344e;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        return this instanceof C0559av ? this : new C0559av(this.f2340a, this.f2341b, this.f2342c, this.f2343d, this.f2344e);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        int iHashCode = this.f2340a != null ? this.f2340a.hashCode() : 0;
        if (this.f2341b != null) {
            iHashCode ^= this.f2341b.hashCode();
        }
        if (this.f2342c != null) {
            iHashCode ^= this.f2342c.hashCode();
        }
        return iHashCode ^ this.f2344e.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final C0640m m1540j() {
        return this.f2341b;
    }

    public AbstractC0634j(C0625g c0625g) {
        int i = 1;
        AbstractC0686u abstractC0686uM1534a = m1534a(c0625g, 0);
        if (abstractC0686uM1534a instanceof C0653p) {
            this.f2340a = (C0653p) abstractC0686uM1534a;
            abstractC0686uM1534a = m1534a(c0625g, 1);
        } else {
            i = 0;
        }
        if (abstractC0686uM1534a instanceof C0640m) {
            this.f2341b = (C0640m) abstractC0686uM1534a;
            i++;
            abstractC0686uM1534a = m1534a(c0625g, i);
        }
        if (!(abstractC0686uM1534a instanceof AbstractC0539ab)) {
            this.f2342c = abstractC0686uM1534a;
            i++;
            abstractC0686uM1534a = m1534a(c0625g, i);
        }
        if (c0625g.m1519a() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(abstractC0686uM1534a instanceof AbstractC0539ab)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0686uM1534a;
        m1535a(abstractC0539ab.f1996a);
        this.f2344e = abstractC0539ab.m1402j();
    }

    public AbstractC0634j(C0653p c0653p, C0640m c0640m, AbstractC0686u abstractC0686u, int i, AbstractC0686u abstractC0686u2) {
        this.f2340a = c0653p;
        this.f2341b = c0640m;
        this.f2342c = abstractC0686u;
        m1535a(i);
        this.f2344e = abstractC0686u2.mo1358i();
    }
}
