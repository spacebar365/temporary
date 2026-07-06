package a.b;

import a.g.ab;
import a.g.an;
import a.g.p;
import a.i;

/* JADX INFO: compiled from: CIFSContextCredentialWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements a.c {
    private i a;

    public c(a aVar, i iVar) {
        super(aVar);
        this.a = iVar;
    }

    @Override // a.b.d, a.c
    public final i g() {
        return this.a;
    }

    @Override // a.b.d, a.c
    public final boolean a(String str, Throwable th) {
        a.g.b bVarD;
        i iVar = this.a;
        if ((iVar instanceof an) && (bVarD = ((an) iVar).d()) != null) {
            this.a = bVarD;
            return true;
        }
        p pVarA = p.a();
        if (pVarA != null) {
            p.a(pVarA, str, th instanceof ab ? (ab) th : null);
        }
        return false;
    }
}
