package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab extends u implements ac {
    int a;
    boolean b = false;
    boolean c;
    f d;

    public ab(boolean z, int i, f fVar) {
        this.c = true;
        this.d = null;
        if (fVar instanceof e) {
            this.c = true;
        } else {
            this.c = z;
        }
        this.a = i;
        if (this.c) {
            this.d = fVar;
        } else {
            fVar.i();
            this.d = fVar;
        }
    }

    public static ab a(Object obj) {
        if (obj == null || (obj instanceof ab)) {
            return (ab) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return a((Object) b((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
        }
    }

    public static ab a(ab abVar) {
        return (ab) abVar.j();
    }

    @Override // org.bouncycastle.a.u
    abstract void a(s sVar);

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (!(uVar instanceof ab)) {
            return false;
        }
        ab abVar = (ab) uVar;
        if (this.a != abVar.a || this.b != abVar.b || this.c != abVar.c) {
            return false;
        }
        if (this.d == null) {
            if (abVar.d != null) {
                return false;
            }
        } else if (!this.d.i().equals(abVar.d.i())) {
            return false;
        }
        return true;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return i();
    }

    public final boolean f() {
        return this.b;
    }

    @Override // org.bouncycastle.a.u
    final u g() {
        return new bn(this.c, this.a, this.d);
    }

    @Override // org.bouncycastle.a.u
    final u h() {
        return new by(this.c, this.a, this.d);
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        int i = this.a;
        return this.d != null ? i ^ this.d.hashCode() : i;
    }

    public final u j() {
        if (this.d != null) {
            return this.d.i();
        }
        return null;
    }

    public String toString() {
        return "[" + this.a + "]" + this.d;
    }
}
