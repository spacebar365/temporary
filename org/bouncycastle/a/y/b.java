package org.bouncycastle.a.y;

import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {
    private x a;

    private b(x xVar) {
        this.a = xVar;
    }

    public static b a(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(x.a(obj));
        }
        return null;
    }

    public final boolean a() {
        return this.a.c() > 1;
    }

    public final a b() {
        if (this.a.c() == 0) {
            return null;
        }
        return a.a(this.a.a(0));
    }

    public final a[] c() {
        a[] aVarArr = new a[this.a.c()];
        for (int i = 0; i != aVarArr.length; i++) {
            aVarArr[i] = a.a(this.a.a(i));
        }
        return aVarArr;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        return this.a;
    }
}
