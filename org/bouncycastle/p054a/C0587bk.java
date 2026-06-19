package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.bk */
/* JADX INFO: loaded from: classes.dex */
public final class C0587bk extends AbstractC0747x {

    /* JADX INFO: renamed from: a */
    private int f2119a;

    public C0587bk() {
        this.f2119a = -1;
    }

    public C0587bk(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f);
        this.f2119a = -1;
    }

    public C0587bk(C0625g c0625g) {
        super(c0625g, true);
        this.f2119a = -1;
    }

    C0587bk(C0625g c0625g, byte b) {
        super(c0625g, false);
        this.f2119a = -1;
    }

    /* JADX INFO: renamed from: d */
    private int m1463d() {
        int i;
        if (this.f2119a < 0) {
            int iMo1341e = 0;
            Enumeration enumerationB = m1747b();
            while (true) {
                i = iMo1341e;
                if (!enumerationB.hasMoreElements()) {
                    break;
                }
                iMo1341e = ((InterfaceC0618f) enumerationB.nextElement()).mo1358i().mo1400g().mo1341e() + i;
            }
            this.f2119a = i;
        }
        return this.f2119a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0747x, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        C0660s c0660sMo1460b = c0660s.mo1460b();
        int iM1463d = m1463d();
        c0660s.mo1608b(49);
        c0660s.m1602a(iM1463d);
        Enumeration enumerationB = m1747b();
        while (enumerationB.hasMoreElements()) {
            c0660sMo1460b.mo1459a((InterfaceC0618f) enumerationB.nextElement());
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iM1463d = m1463d();
        return iM1463d + C0612ch.m1488a(iM1463d) + 1;
    }
}
