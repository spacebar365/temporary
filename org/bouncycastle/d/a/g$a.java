package org.bouncycastle.d.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g$a extends g {
    public int m() {
        int iB = b();
        int i = 1;
        g gVarA = this;
        g gVarE = this;
        while (i < iB) {
            gVarE = gVarE.e();
            i++;
            gVarA = gVarA.a(gVarE);
        }
        if (gVarA.j()) {
            return 0;
        }
        if (gVarA.i()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }
}
