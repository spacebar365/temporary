package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C0553ap extends AbstractC0539ab {
    public C0553ap(boolean z, int i, InterfaceC0618f interfaceC0618f) {
        super(z, i, interfaceC0618f);
    }

    @Override // org.bouncycastle.p054a.AbstractC0539ab, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        Enumeration enumerationM1747b;
        c0660s.m1603a(160, this.f1996a);
        c0660s.mo1608b(128);
        if (!this.f1997b) {
            if (this.f1998c) {
                c0660s.mo1459a(this.f1999d);
            } else {
                if (this.f1999d instanceof AbstractC0655q) {
                    enumerationM1747b = this.f1999d instanceof C0545ah ? ((C0545ah) this.f1999d).m1411f() : new C0545ah(((AbstractC0655q) this.f1999d).mo1410c()).m1411f();
                } else if (this.f1999d instanceof AbstractC0723v) {
                    enumerationM1747b = ((AbstractC0723v) this.f1999d).mo1483c();
                } else {
                    if (!(this.f1999d instanceof AbstractC0747x)) {
                        throw new C0629i("not implemented: " + this.f1999d.getClass().getName());
                    }
                    enumerationM1747b = ((AbstractC0747x) this.f1999d).m1747b();
                }
                while (enumerationM1747b.hasMoreElements()) {
                    c0660s.mo1459a((InterfaceC0618f) enumerationM1747b.nextElement());
                }
            }
        }
        c0660s.mo1608b(0);
        c0660s.mo1608b(0);
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
        int iMo1341e = this.f1999d.mo1358i().mo1341e();
        return this.f1998c ? iMo1341e + C0612ch.m1490b(this.f1996a) + C0612ch.m1488a(iMo1341e) : (iMo1341e - 1) + C0612ch.m1490b(this.f1996a);
    }
}
