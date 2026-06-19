package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.al */
/* JADX INFO: loaded from: classes.dex */
public final class C0549al extends AbstractC0723v {
    public C0549al() {
    }

    public C0549al(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f);
    }

    public C0549al(C0625g c0625g) {
        super(c0625g);
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        c0660s.mo1608b(48);
        c0660s.mo1608b(128);
        Enumeration enumerationC = mo1483c();
        while (enumerationC.hasMoreElements()) {
            c0660s.mo1459a((InterfaceC0618f) enumerationC.nextElement());
        }
        c0660s.mo1608b(0);
        c0660s.mo1608b(0);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iMo1341e = 0;
        Enumeration enumerationC = mo1483c();
        while (true) {
            int i = iMo1341e;
            if (!enumerationC.hasMoreElements()) {
                return i + 2 + 2;
            }
            iMo1341e = ((InterfaceC0618f) enumerationC.nextElement()).mo1358i().mo1341e() + i;
        }
    }
}
