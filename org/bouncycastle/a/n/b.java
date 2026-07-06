package org.bouncycastle.a.n;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {
    q a;

    private b(v vVar) {
        if (vVar.d() == 1) {
            this.a = (q) vVar.a(0);
        } else {
            this.a = null;
        }
    }

    public b(byte[] bArr) {
        this.a = new be(bArr);
    }

    public static b a(Object obj) {
        if (obj != null) {
            return new b(v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        if (this.a != null) {
            return org.bouncycastle.f.a.b(this.a.c());
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(this.a);
        }
        return new bi(gVar);
    }
}
