package org.bouncycastle.a.z;

/* JADX INFO: loaded from: classes.dex */
public class v$a extends org.bouncycastle.a.o {
    org.bouncycastle.a.v a;
    n b;

    private v$a(org.bouncycastle.a.v vVar) {
        if (vVar.d() < 2 || vVar.d() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        this.a = vVar;
    }

    public static v$a a(Object obj) {
        if (obj instanceof v$a) {
            return (v$a) obj;
        }
        if (obj != null) {
            return new v$a(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.m a() {
        return org.bouncycastle.a.m.a(this.a.a(0));
    }

    public final x b() {
        return x.a(this.a.a(1));
    }

    public final n c() {
        if (this.b == null && this.a.d() == 3) {
            this.b = n.a(this.a.a(2));
        }
        return this.b;
    }

    public final boolean d() {
        return this.a.d() == 3;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }
}
