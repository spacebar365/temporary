package org.bouncycastle.a.y;

import java.util.Enumeration;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.e;
import org.bouncycastle.a.f;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o implements e {
    private static d a = org.bouncycastle.a.y.a.b.K;
    private boolean b;
    private int c;
    private d d;
    private b[] e;

    private c(v vVar) {
        this(a, vVar);
    }

    private c(d dVar, v vVar) {
        this.d = dVar;
        this.e = new b[vVar.d()];
        int i = 0;
        Enumeration enumerationC = vVar.c();
        while (enumerationC.hasMoreElements()) {
            this.e[i] = b.a(enumerationC.nextElement());
            i++;
        }
    }

    private c(d dVar, c cVar) {
        this.e = cVar.e;
        this.d = dVar;
    }

    public static c a(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(v.a(obj));
        }
        return null;
    }

    public static c a(ab abVar) {
        return a(v.a(abVar, true));
    }

    public static c a(d dVar, Object obj) {
        if (obj instanceof c) {
            return new c(dVar, (c) obj);
        }
        if (obj != null) {
            return new c(dVar, v.a(obj));
        }
        return null;
    }

    public final b[] a() {
        b[] bVarArr = new b[this.e.length];
        System.arraycopy(this.e, 0, bVarArr, 0, bVarArr.length);
        return bVarArr;
    }

    @Override // org.bouncycastle.a.o
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) && !(obj instanceof v)) {
            return false;
        }
        if (i().equals(((f) obj).i())) {
            return true;
        }
        try {
            return this.d.a(this, new c(v.a((Object) ((f) obj).i())));
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.a.o
    public final int hashCode() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        this.c = this.d.a(this);
        return this.c;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        return new bi(this.e);
    }

    public final String toString() {
        return this.d.b(this);
    }
}
