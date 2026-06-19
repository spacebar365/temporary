package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.bx */
/* JADX INFO: loaded from: classes.dex */
public final class C0600bx extends AbstractC0747x {

    /* JADX INFO: renamed from: a */
    private int f2129a;

    public C0600bx() {
        this.f2129a = -1;
    }

    public C0600bx(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f);
        this.f2129a = -1;
    }

    public C0600bx(C0625g c0625g) {
        super(c0625g, false);
        this.f2129a = -1;
    }

    public C0600bx(InterfaceC0618f[] interfaceC0618fArr) {
        super(interfaceC0618fArr);
        this.f2129a = -1;
    }

    /* JADX INFO: renamed from: d */
    private int m1466d() {
        int i;
        if (this.f2129a < 0) {
            int iMo1341e = 0;
            Enumeration enumerationB = m1747b();
            while (true) {
                i = iMo1341e;
                if (!enumerationB.hasMoreElements()) {
                    break;
                }
                iMo1341e = ((InterfaceC0618f) enumerationB.nextElement()).mo1358i().mo1401h().mo1341e() + i;
            }
            this.f2129a = i;
        }
        return this.f2129a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0747x, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        C0660s c0660sMo1461c = c0660s.mo1461c();
        int iM1466d = m1466d();
        c0660s.mo1608b(49);
        c0660s.m1602a(iM1466d);
        Enumeration enumerationB = m1747b();
        while (enumerationB.hasMoreElements()) {
            c0660sMo1461c.mo1459a((InterfaceC0618f) enumerationB.nextElement());
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iM1466d = m1466d();
        return iM1466d + C0612ch.m1488a(iM1466d) + 1;
    }
}
