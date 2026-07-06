package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class bi extends v {
    private int b;

    public bi() {
        this.b = -1;
    }

    public bi(g gVar) {
        super(gVar);
        this.b = -1;
    }

    public bi(f[] fVarArr) {
        super(fVarArr);
        this.b = -1;
    }

    private int f() {
        int i;
        if (this.b < 0) {
            int iE = 0;
            Enumeration enumerationC = c();
            while (true) {
                i = iE;
                if (!enumerationC.hasMoreElements()) {
                    break;
                }
                iE = ((f) enumerationC.nextElement()).i().g().e() + i;
            }
            this.b = i;
        }
        return this.b;
    }

    @Override // org.bouncycastle.a.v, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        s sVarB = sVar.b();
        int iF = f();
        sVar.b(48);
        sVar.a(iF);
        Enumeration enumerationC = c();
        while (enumerationC.hasMoreElements()) {
            sVarB.a((f) enumerationC.nextElement());
        }
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int iF = f();
        return iF + ch.a(iF) + 1;
    }
}
