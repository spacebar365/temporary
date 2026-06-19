package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.an */
/* JADX INFO: loaded from: classes.dex */
public final class C0551an extends AbstractC0747x {
    public C0551an() {
    }

    public C0551an(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f);
    }

    public C0551an(C0625g c0625g) {
        super(c0625g, false);
    }

    public C0551an(InterfaceC0618f[] interfaceC0618fArr) {
        super(interfaceC0618fArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0747x, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        c0660s.mo1608b(49);
        c0660s.mo1608b(128);
        Enumeration enumerationB = m1747b();
        while (enumerationB.hasMoreElements()) {
            c0660s.mo1459a((InterfaceC0618f) enumerationB.nextElement());
        }
        c0660s.mo1608b(0);
        c0660s.mo1608b(0);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iMo1341e = 0;
        Enumeration enumerationB = m1747b();
        while (true) {
            int i = iMo1341e;
            if (!enumerationB.hasMoreElements()) {
                return i + 2 + 2;
            }
            iMo1341e = ((InterfaceC0618f) enumerationB.nextElement()).mo1358i().mo1341e() + i;
        }
    }
}
