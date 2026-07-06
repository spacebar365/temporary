package org.bouncycastle.a.b;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o {
    private final org.bouncycastle.a.f a;
    private final i b;

    public g(b bVar, i iVar) {
        this.a = bVar;
        this.b = iVar;
    }

    private g(v vVar) {
        if (vVar.d() != 2) {
            throw new IllegalArgumentException("malformed sequence");
        }
        org.bouncycastle.a.f fVarA = vVar.a(0);
        if ((fVarA instanceof b) || (fVarA instanceof h)) {
            this.a = fVarA;
        } else {
            v vVarA = v.a(fVarA);
            if (vVarA.d() == 2) {
                this.a = b.a(vVarA);
            } else {
                this.a = h.a(vVarA);
            }
        }
        this.b = i.a(vVar.a(1));
    }

    public static g a(Object obj) {
        if (obj != null) {
            return new g(v.a(obj));
        }
        return null;
    }

    public final i a() {
        return this.b;
    }

    public final org.bouncycastle.a.f b() {
        return this.a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
