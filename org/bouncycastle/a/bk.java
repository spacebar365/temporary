package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class bk extends x {
    private int a;

    public bk() {
        this.a = -1;
    }

    public bk(f fVar) {
        super(fVar);
        this.a = -1;
    }

    public bk(g gVar) {
        super(gVar, true);
        this.a = -1;
    }

    bk(g gVar, byte b) {
        super(gVar, false);
        this.a = -1;
    }

    private int d() {
        int i;
        if (this.a < 0) {
            int iE = 0;
            Enumeration enumerationB = b();
            while (true) {
                i = iE;
                if (!enumerationB.hasMoreElements()) {
                    break;
                }
                iE = ((f) enumerationB.nextElement()).i().g().e() + i;
            }
            this.a = i;
        }
        return this.a;
    }

    @Override // org.bouncycastle.a.x, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        s sVarB = sVar.b();
        int iD = d();
        sVar.b(49);
        sVar.a(iD);
        Enumeration enumerationB = b();
        while (enumerationB.hasMoreElements()) {
            sVarB.a((f) enumerationB.nextElement());
        }
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int iD = d();
        return iD + ch.a(iD) + 1;
    }
}
