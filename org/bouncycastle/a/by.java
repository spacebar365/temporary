package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class by extends ab {
    private static final byte[] e = new byte[0];

    public by(boolean z, int i, f fVar) {
        super(z, i, fVar);
    }

    @Override // org.bouncycastle.a.ab, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        if (this.b) {
            sVar.a(160, this.a, e);
            return;
        }
        u uVarH = this.d.i().h();
        if (!this.c) {
            sVar.a(uVarH.a() ? 160 : 128, this.a);
            sVar.a(uVarH);
        } else {
            sVar.a(160, this.a);
            sVar.a(uVarH.e());
            sVar.a((f) uVarH);
        }
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        if (this.b || this.c) {
            return true;
        }
        return this.d.i().h().a();
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        if (this.b) {
            return ch.b(this.a) + 1;
        }
        int iE = this.d.i().h().e();
        return this.c ? iE + ch.b(this.a) + ch.a(iE) : (iE - 1) + ch.b(this.a);
    }
}
