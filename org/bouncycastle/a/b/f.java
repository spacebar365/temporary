package org.bouncycastle.a.b;

import java.util.Iterator;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;
import org.bouncycastle.f.a$a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o implements org.bouncycastle.f.d<org.bouncycastle.a.f> {
    private final org.bouncycastle.a.f[] a;

    private f(v vVar) {
        this.a = new org.bouncycastle.a.f[vVar.d()];
        for (int i = 0; i != this.a.length; i++) {
            this.a[i] = e.a(vVar.a(i));
        }
    }

    public f(e[] eVarArr) {
        this.a = new org.bouncycastle.a.f[eVarArr.length];
        System.arraycopy(eVarArr, 0, this.a, 0, eVarArr.length);
    }

    public static f a(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(v.a(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        return new bi(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<org.bouncycastle.a.f> iterator() {
        return new a$a(this.a);
    }
}
