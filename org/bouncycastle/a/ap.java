package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class ap extends ab {
    public ap(boolean z, int i, f fVar) {
        super(z, i, fVar);
    }

    @Override // org.bouncycastle.a.ab, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        Enumeration enumerationB;
        sVar.a(160, this.a);
        sVar.b(128);
        if (!this.b) {
            if (this.c) {
                sVar.a(this.d);
            } else {
                if (this.d instanceof q) {
                    enumerationB = this.d instanceof ah ? ((ah) this.d).f() : new ah(((q) this.d).c()).f();
                } else if (this.d instanceof v) {
                    enumerationB = ((v) this.d).c();
                } else {
                    if (!(this.d instanceof x)) {
                        throw new i("not implemented: " + this.d.getClass().getName());
                    }
                    enumerationB = ((x) this.d).b();
                }
                while (enumerationB.hasMoreElements()) {
                    sVar.a((f) enumerationB.nextElement());
                }
            }
        }
        sVar.b(0);
        sVar.b(0);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        if (this.b || this.c) {
            return true;
        }
        return this.d.i().g().a();
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        if (this.b) {
            return ch.b(this.a) + 1;
        }
        int iE = this.d.i().e();
        return this.c ? iE + ch.b(this.a) + ch.a(iE) : (iE - 1) + ch.b(this.a);
    }
}
