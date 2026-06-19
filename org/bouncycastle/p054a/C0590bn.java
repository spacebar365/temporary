package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.bn */
/* JADX INFO: loaded from: classes.dex */
public final class C0590bn extends AbstractC0539ab {

    /* JADX INFO: renamed from: e */
    private static final byte[] f2122e = new byte[0];

    public C0590bn(InterfaceC0618f interfaceC0618f) {
        super(true, 0, interfaceC0618f);
    }

    public C0590bn(boolean z, int i, InterfaceC0618f interfaceC0618f) {
        super(z, i, interfaceC0618f);
    }

    @Override // org.bouncycastle.p054a.AbstractC0539ab, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        if (this.f1997b) {
            c0660s.m1604a(160, this.f1996a, f2122e);
            return;
        }
        AbstractC0686u abstractC0686uMo1400g = this.f1999d.mo1358i().mo1400g();
        if (!this.f1998c) {
            c0660s.m1603a(abstractC0686uMo1400g.mo1336a() ? 160 : 128, this.f1996a);
            c0660s.m1606a(abstractC0686uMo1400g);
        } else {
            c0660s.m1603a(160, this.f1996a);
            c0660s.m1602a(abstractC0686uMo1400g.mo1341e());
            c0660s.mo1459a((InterfaceC0618f) abstractC0686uMo1400g);
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        if (this.f1997b || this.f1998c) {
            return true;
        }
        return this.f1999d.mo1358i().mo1400g().mo1336a();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        if (this.f1997b) {
            return C0612ch.m1490b(this.f1996a) + 1;
        }
        int iMo1341e = this.f1999d.mo1358i().mo1400g().mo1341e();
        return this.f1998c ? iMo1341e + C0612ch.m1490b(this.f1996a) + C0612ch.m1488a(iMo1341e) : (iMo1341e - 1) + C0612ch.m1490b(this.f1996a);
    }
}
