package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class an extends x {
    public an() {
    }

    public an(f fVar) {
        super(fVar);
    }

    public an(g gVar) {
        super(gVar, false);
    }

    public an(f[] fVarArr) {
        super(fVarArr);
    }

    @Override // org.bouncycastle.a.x, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        sVar.b(49);
        sVar.b(128);
        Enumeration enumerationB = b();
        while (enumerationB.hasMoreElements()) {
            sVar.a((f) enumerationB.nextElement());
        }
        sVar.b(0);
        sVar.b(0);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int iE = 0;
        Enumeration enumerationB = b();
        while (true) {
            int i = iE;
            if (!enumerationB.hasMoreElements()) {
                return i + 2 + 2;
            }
            iE = ((f) enumerationB.nextElement()).i().e() + i;
        }
    }
}
