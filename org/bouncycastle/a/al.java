package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class al extends v {
    public al() {
    }

    public al(f fVar) {
        super(fVar);
    }

    public al(g gVar) {
        super(gVar);
    }

    @Override // org.bouncycastle.a.v, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        sVar.b(48);
        sVar.b(128);
        Enumeration enumerationC = c();
        while (enumerationC.hasMoreElements()) {
            sVar.a((f) enumerationC.nextElement());
        }
        sVar.b(0);
        sVar.b(0);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int iE = 0;
        Enumeration enumerationC = c();
        while (true) {
            int i = iE;
            if (!enumerationC.hasMoreElements()) {
                return i + 2 + 2;
            }
            iE = ((f) enumerationC.nextElement()).i().e() + i;
        }
    }
}
