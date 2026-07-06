package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends u {
    protected p a;
    protected m b;
    protected u c;
    protected int d;
    protected u e;

    private static u a(g gVar, int i) {
        if (gVar.a() <= i) {
            throw new IllegalArgumentException("too few objects in input vector");
        }
        return gVar.a(i).i();
    }

    private void a(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid encoding value: ".concat(String.valueOf(i)));
        }
        this.d = i;
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return true;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (!(uVar instanceof j)) {
            return false;
        }
        if (this == uVar) {
            return true;
        }
        j jVar = (j) uVar;
        if (this.a != null && (jVar.a == null || !jVar.a.equals(this.a))) {
            return false;
        }
        if (this.b != null && (jVar.b == null || !jVar.b.equals(this.b))) {
            return false;
        }
        if (this.c == null || (jVar.c != null && jVar.c.equals(this.c))) {
            return this.e.equals(jVar.e);
        }
        return false;
    }

    public final u b() {
        return this.c;
    }

    public final p c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    @Override // org.bouncycastle.a.u
    int e() {
        return k().length;
    }

    public final u f() {
        return this.e;
    }

    @Override // org.bouncycastle.a.u
    final u g() {
        return this instanceof av ? this : new av(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        int iHashCode = this.a != null ? this.a.hashCode() : 0;
        if (this.b != null) {
            iHashCode ^= this.b.hashCode();
        }
        if (this.c != null) {
            iHashCode ^= this.c.hashCode();
        }
        return iHashCode ^ this.e.hashCode();
    }

    public final m j() {
        return this.b;
    }

    public j(g gVar) {
        int i = 1;
        u uVarA = a(gVar, 0);
        if (uVarA instanceof p) {
            this.a = (p) uVarA;
            uVarA = a(gVar, 1);
        } else {
            i = 0;
        }
        if (uVarA instanceof m) {
            this.b = (m) uVarA;
            i++;
            uVarA = a(gVar, i);
        }
        if (!(uVarA instanceof ab)) {
            this.c = uVarA;
            i++;
            uVarA = a(gVar, i);
        }
        if (gVar.a() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(uVarA instanceof ab)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        ab abVar = (ab) uVarA;
        a(abVar.a);
        this.e = abVar.j();
    }

    public j(p pVar, m mVar, u uVar, int i, u uVar2) {
        this.a = pVar;
        this.b = mVar;
        this.c = uVar;
        a(i);
        this.e = uVar2.i();
    }
}
