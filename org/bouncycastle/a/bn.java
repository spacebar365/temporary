package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bn extends ab {
    private static final byte[] e = new byte[0];

    public bn(f fVar) {
        super(true, 0, fVar);
    }

    public bn(boolean z, int i, f fVar) {
        super(z, i, fVar);
    }

    @Override // org.bouncycastle.a.ab, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        if (this.b) {
            sVar.a(160, this.a, e);
            return;
        }
        u uVarG = this.d.i().g();
        if (!this.c) {
            sVar.a(uVarG.a() ? 160 : 128, this.a);
            sVar.a(uVarG);
        } else {
            sVar.a(160, this.a);
            sVar.a(uVarG.e());
            sVar.a((f) uVarG);
        }
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
        int iE = this.d.i().g().e();
        return this.c ? iE + ch.b(this.a) + ch.a(iE) : (iE - 1) + ch.b(this.a);
    }
}
